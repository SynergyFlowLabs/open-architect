package com.devtodev.analytics.internal.backend;

import com.devtodev.analytics.external.anticheat.DTDVerifyResponse;
import com.devtodev.analytics.internal.backend.repository.AbTestOffer;
import com.devtodev.analytics.internal.backend.repository.AnalyticsReport;
import com.devtodev.analytics.internal.backend.repository.BackendMessage;
import com.devtodev.analytics.internal.backend.repository.BackendUserData;
import com.devtodev.analytics.internal.backend.repository.IBackendRepository;
import com.devtodev.analytics.internal.backend.repository.RemoteConfigSealedClass;
import com.devtodev.analytics.internal.domain.events.abTests.SuitableExperiments;
import com.devtodev.analytics.internal.domain.events.reports.Report;
import com.devtodev.analytics.internal.modues.anticheat.Receipt;
import com.devtodev.analytics.internal.storage.sqlite.ReportEntry;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Backend implements IBackend {

    @NotNull
    private final IBackendRepository repository;

    public Backend(@NotNull IBackendRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }

    @NotNull
    public final IBackendRepository getRepository() {
        return this.repository;
    }

    @Override // com.devtodev.analytics.internal.backend.IBackend
    @NotNull
    public RemoteConfigSealedClass requestAbTestConfig(@NotNull String appID, @NotNull Identifiers sdkIdentifiers, @NotNull Versions versions) {
        Intrinsics.checkNotNullParameter(appID, "appID");
        Intrinsics.checkNotNullParameter(sdkIdentifiers, "sdkIdentifiers");
        Intrinsics.checkNotNullParameter(versions, "versions");
        return this.repository.requestABTestConfig(appID, new BackendMessage(versions.getJson(), sdkIdentifiers));
    }

    @Override // com.devtodev.analytics.internal.backend.IBackend
    @NotNull
    public AbTestOffer requestAbTestOffer(@NotNull String appID, @NotNull Identifiers sdkIdentifiers, @NotNull SuitableExperiments suitableExperiments) {
        Intrinsics.checkNotNullParameter(appID, "appID");
        Intrinsics.checkNotNullParameter(sdkIdentifiers, "sdkIdentifiers");
        Intrinsics.checkNotNullParameter(suitableExperiments, "suitableExperiments");
        return this.repository.requestABTestOffer(appID, new BackendMessage(suitableExperiments.getJson(), sdkIdentifiers));
    }

    @Override // com.devtodev.analytics.internal.backend.IBackend
    @NotNull
    public BackendUserData requestBackendUserData(@NotNull String appID, long j10, @NotNull Identifiers identifiers) {
        Intrinsics.checkNotNullParameter(appID, "appID");
        Intrinsics.checkNotNullParameter(identifiers, "identifiers");
        String string = new JSONObject().accumulate("attempt", Long.valueOf(j10)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject().accumulate(…mpt\", attempt).toString()");
        return this.repository.requestBackendUserData(appID, new BackendMessage(string, identifiers));
    }

    @Override // com.devtodev.analytics.internal.backend.IBackend
    @NotNull
    public BackendConfig requestConfig(@NotNull String appID, @NotNull Identifiers sdkIdentifiers, @NotNull Versions versions) {
        Intrinsics.checkNotNullParameter(appID, "appID");
        Intrinsics.checkNotNullParameter(sdkIdentifiers, "sdkIdentifiers");
        Intrinsics.checkNotNullParameter(versions, "versions");
        return this.repository.requestConfig(appID, new BackendMessage(versions.getJson(), sdkIdentifiers));
    }

    @Override // com.devtodev.analytics.internal.backend.IBackend
    @NotNull
    public AnalyticsReport sendAnalytic(@NotNull String appID, @NotNull Identifiers identifiers, @NotNull Report report) throws JSONException {
        Intrinsics.checkNotNullParameter(appID, "appID");
        Intrinsics.checkNotNullParameter(identifiers, "identifiers");
        Intrinsics.checkNotNullParameter(report, "report");
        JSONObject json1 = report.getJson1();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(json1);
        String string = new JSONObject().accumulate(ReportEntry.tableName, jSONArray).toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject().accumulate(…rts\", reports).toString()");
        return this.repository.sendAnalytics(appID, new BackendMessage(string, identifiers), report.getUuid());
    }

    @Override // com.devtodev.analytics.internal.backend.IBackend
    @NotNull
    public DTDVerifyResponse sendVerifyReceipt(@NotNull String appID, @NotNull Receipt receipt, @NotNull Identifiers identifiers) {
        Intrinsics.checkNotNullParameter(appID, "appID");
        Intrinsics.checkNotNullParameter(receipt, "receipt");
        Intrinsics.checkNotNullParameter(identifiers, "identifiers");
        return this.repository.sendVerifyReceipt(appID, new BackendMessage(receipt.toJson(), identifiers));
    }
}
