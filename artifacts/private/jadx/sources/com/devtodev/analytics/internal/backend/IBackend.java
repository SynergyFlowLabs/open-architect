package com.devtodev.analytics.internal.backend;

import com.devtodev.analytics.external.anticheat.DTDVerifyResponse;
import com.devtodev.analytics.internal.backend.repository.AbTestOffer;
import com.devtodev.analytics.internal.backend.repository.AnalyticsReport;
import com.devtodev.analytics.internal.backend.repository.BackendUserData;
import com.devtodev.analytics.internal.backend.repository.RemoteConfigSealedClass;
import com.devtodev.analytics.internal.domain.events.abTests.SuitableExperiments;
import com.devtodev.analytics.internal.domain.events.reports.Report;
import com.devtodev.analytics.internal.modues.anticheat.Receipt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IBackend {
    @NotNull
    RemoteConfigSealedClass requestAbTestConfig(@NotNull String str, @NotNull Identifiers identifiers, @NotNull Versions versions);

    @NotNull
    AbTestOffer requestAbTestOffer(@NotNull String str, @NotNull Identifiers identifiers, @NotNull SuitableExperiments suitableExperiments);

    @NotNull
    BackendUserData requestBackendUserData(@NotNull String str, long j10, @NotNull Identifiers identifiers);

    @NotNull
    BackendConfig requestConfig(@NotNull String str, @NotNull Identifiers identifiers, @NotNull Versions versions);

    @NotNull
    AnalyticsReport sendAnalytic(@NotNull String str, @NotNull Identifiers identifiers, @NotNull Report report);

    @NotNull
    DTDVerifyResponse sendVerifyReceipt(@NotNull String str, @NotNull Receipt receipt, @NotNull Identifiers identifiers);
}
