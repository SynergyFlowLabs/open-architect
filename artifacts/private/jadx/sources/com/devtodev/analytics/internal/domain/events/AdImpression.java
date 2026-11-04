package com.devtodev.analytics.internal.domain.events;

import com.appsflyer.AdRevenueScheme;
import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import com.devtodev.core.data.metrics.Metric;
import h4.b;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAdImpression.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdImpression.kt\ncom/devtodev/analytics/internal/domain/events/AdImpression\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1855#2,2:94\n*S KotlinDebug\n*F\n+ 1 AdImpression.kt\ncom/devtodev/analytics/internal/domain/events/AdImpression\n*L\n68#1:94,2\n*E\n"})
public final class AdImpression implements IEncodable {

    @NotNull
    private final String code;

    @Nullable
    private final List<String> inProgress;

    @NotNull
    private final String network;

    @Nullable
    private final String placement;
    private final double revenue;
    private final long sessionId;

    @Nullable
    private final String source;
    private final long timestamp;

    @Nullable
    private final String unit;

    public AdImpression(long j10, @NotNull String network, double d10, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(network, "network");
        this.sessionId = j10;
        this.network = network;
        this.revenue = d10;
        this.source = str;
        this.placement = str2;
        this.unit = str3;
        this.inProgress = list;
        this.code = AdImpressionKt.AD_IMPRESSION;
        this.timestamp = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdImpression copy$default(AdImpression adImpression, long j10, String str, double d10, String str2, String str3, String str4, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = adImpression.sessionId;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            str = adImpression.network;
        }
        String str5 = str;
        if ((i10 & 4) != 0) {
            d10 = adImpression.revenue;
        }
        return adImpression.copy(j11, str5, d10, (i10 & 8) != 0 ? adImpression.source : str2, (i10 & 16) != 0 ? adImpression.placement : str3, (i10 & 32) != 0 ? adImpression.unit : str4, (i10 & 64) != 0 ? adImpression.inProgress : list);
    }

    public final long component1() {
        return this.sessionId;
    }

    @NotNull
    public final String component2() {
        return this.network;
    }

    public final double component3() {
        return this.revenue;
    }

    @Nullable
    public final String component4() {
        return this.source;
    }

    @Nullable
    public final String component5() {
        return this.placement;
    }

    @Nullable
    public final String component6() {
        return this.unit;
    }

    @Nullable
    public final List<String> component7() {
        return this.inProgress;
    }

    @NotNull
    public final AdImpression copy(long j10, @NotNull String network, double d10, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(network, "network");
        return new AdImpression(j10, network, d10, str, str2, str3, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdImpression)) {
            return false;
        }
        AdImpression adImpression = (AdImpression) obj;
        return this.sessionId == adImpression.sessionId && Intrinsics.areEqual(this.network, adImpression.network) && Double.compare(this.revenue, adImpression.revenue) == 0 && Intrinsics.areEqual(this.source, adImpression.source) && Intrinsics.areEqual(this.placement, adImpression.placement) && Intrinsics.areEqual(this.unit, adImpression.unit) && Intrinsics.areEqual(this.inProgress, adImpression.inProgress);
    }

    @Override // com.devtodev.analytics.internal.domain.events.IEncodable
    @NotNull
    public String getCode() {
        return this.code;
    }

    @Nullable
    public final List<String> getInProgress() {
        return this.inProgress;
    }

    @Override // com.devtodev.analytics.internal.domain.events.IEncodable
    @NotNull
    public String getJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("code", AdImpressionKt.AD_IMPRESSION);
        jSONObject.accumulate("timestamp", Long.valueOf(this.timestamp));
        jSONObject.accumulate(UserEntry.sessionId, Long.valueOf(this.sessionId));
        jSONObject.accumulate("ad_network", this.network);
        jSONObject.accumulate("revenue", Double.valueOf(this.revenue));
        jSONObject.accumulate("source", this.source);
        jSONObject.accumulate("placement", this.placement);
        jSONObject.accumulate(AdRevenueScheme.AD_UNIT, this.unit);
        List<String> list = this.inProgress;
        if (list != null && !list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = this.inProgress.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
            jSONObject.accumulate(Metric.IN_PROGRESS_KEY, jSONArray);
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    @NotNull
    public final String getNetwork() {
        return this.network;
    }

    @Nullable
    public final String getPlacement() {
        return this.placement;
    }

    public final double getRevenue() {
        return this.revenue;
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final String getUnit() {
        return this.unit;
    }

    public int hashCode() {
        int iHashCode = (Double.hashCode(this.revenue) + b.a(this.network, Long.hashCode(this.sessionId) * 31, 31)) * 31;
        String str = this.source;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.placement;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.unit;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.inProgress;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("\n\t code: adrv\n");
        stringBuffer.append("\t timestamp: " + this.timestamp + "\n");
        stringBuffer.append("\t sessionId: " + this.sessionId + "\n");
        stringBuffer.append("\t ad_network: " + this.network + "\n");
        stringBuffer.append("\t revenue: " + this.revenue + "\n");
        String str = this.source;
        if (str != null) {
            stringBuffer.append("\t source: " + str + "\n");
        }
        String str2 = this.placement;
        if (str2 != null) {
            stringBuffer.append("\t placement: " + str2 + "\n");
        }
        String str3 = this.unit;
        if (str3 != null) {
            stringBuffer.append("\t ad_unit: " + str3 + "\n");
        }
        List<String> list = this.inProgress;
        if (list != null && !list.isEmpty()) {
            stringBuffer.append("\t inProgress: " + this.inProgress + "\n");
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }
}
