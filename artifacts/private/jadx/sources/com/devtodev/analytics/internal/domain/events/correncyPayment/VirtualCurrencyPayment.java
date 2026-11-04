package com.devtodev.analytics.internal.domain.events.correncyPayment;

import com.devtodev.analytics.internal.domain.events.IEncodable;
import com.devtodev.analytics.internal.domain.events.RecourcesKt;
import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import com.devtodev.core.data.metrics.Metric;
import com.devtodev.core.data.metrics.aggregated.ingamepurchase.InGamePurchaseMetric;
import h4.a;
import h4.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nVirtualCurrencyPayment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VirtualCurrencyPayment.kt\ncom/devtodev/analytics/internal/domain/events/correncyPayment/VirtualCurrencyPayment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,97:1\n1855#2,2:98\n125#3:100\n152#3,3:101\n*S KotlinDebug\n*F\n+ 1 VirtualCurrencyPayment.kt\ncom/devtodev/analytics/internal/domain/events/correncyPayment/VirtualCurrencyPayment\n*L\n72#1:98,2\n88#1:100\n88#1:101,3\n*E\n"})
public final class VirtualCurrencyPayment implements IEncodable {

    @NotNull
    private final String code;

    @Nullable
    private final List<String> inProgress;
    private final int level;
    private final long purchaseAmount;

    @NotNull
    private final String purchaseId;

    @NotNull
    private final Map<String, Long> purchasePrice;

    @NotNull
    private final String purchaseType;
    private final long sessionId;
    private final long timestamp;

    public VirtualCurrencyPayment(int i10, long j10, long j11, @NotNull Map<String, Long> purchasePrice, @NotNull String purchaseType, @NotNull String purchaseId, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(purchasePrice, "purchasePrice");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        this.level = i10;
        this.sessionId = j10;
        this.purchaseAmount = j11;
        this.purchasePrice = purchasePrice;
        this.purchaseType = purchaseType;
        this.purchaseId = purchaseId;
        this.inProgress = list;
        this.code = VirtualCurrencyPaymentKt.VIRTUAL_CURRENCY_PAYMENT_CODE;
        this.timestamp = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VirtualCurrencyPayment copy$default(VirtualCurrencyPayment virtualCurrencyPayment, int i10, long j10, long j11, Map map, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = virtualCurrencyPayment.level;
        }
        if ((i11 & 2) != 0) {
            j10 = virtualCurrencyPayment.sessionId;
        }
        if ((i11 & 4) != 0) {
            j11 = virtualCurrencyPayment.purchaseAmount;
        }
        if ((i11 & 8) != 0) {
            map = virtualCurrencyPayment.purchasePrice;
        }
        if ((i11 & 16) != 0) {
            str = virtualCurrencyPayment.purchaseType;
        }
        if ((i11 & 32) != 0) {
            str2 = virtualCurrencyPayment.purchaseId;
        }
        if ((i11 & 64) != 0) {
            list = virtualCurrencyPayment.inProgress;
        }
        long j12 = j11;
        return virtualCurrencyPayment.copy(i10, j10, j12, map, str, str2, list);
    }

    public final int component1() {
        return this.level;
    }

    public final long component2() {
        return this.sessionId;
    }

    public final long component3() {
        return this.purchaseAmount;
    }

    @NotNull
    public final Map<String, Long> component4() {
        return this.purchasePrice;
    }

    @NotNull
    public final String component5() {
        return this.purchaseType;
    }

    @NotNull
    public final String component6() {
        return this.purchaseId;
    }

    @Nullable
    public final List<String> component7() {
        return this.inProgress;
    }

    @NotNull
    public final VirtualCurrencyPayment copy(int i10, long j10, long j11, @NotNull Map<String, Long> purchasePrice, @NotNull String purchaseType, @NotNull String purchaseId, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(purchasePrice, "purchasePrice");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        return new VirtualCurrencyPayment(i10, j10, j11, purchasePrice, purchaseType, purchaseId, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VirtualCurrencyPayment)) {
            return false;
        }
        VirtualCurrencyPayment virtualCurrencyPayment = (VirtualCurrencyPayment) obj;
        return this.level == virtualCurrencyPayment.level && this.sessionId == virtualCurrencyPayment.sessionId && this.purchaseAmount == virtualCurrencyPayment.purchaseAmount && Intrinsics.areEqual(this.purchasePrice, virtualCurrencyPayment.purchasePrice) && Intrinsics.areEqual(this.purchaseType, virtualCurrencyPayment.purchaseType) && Intrinsics.areEqual(this.purchaseId, virtualCurrencyPayment.purchaseId) && Intrinsics.areEqual(this.inProgress, virtualCurrencyPayment.inProgress);
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
        jSONObject.accumulate("code", getCode());
        jSONObject.accumulate("timestamp", Long.valueOf(this.timestamp));
        jSONObject.accumulate("level", Integer.valueOf(this.level));
        jSONObject.accumulate(UserEntry.sessionId, Long.valueOf(this.sessionId));
        jSONObject.accumulate(InGamePurchaseMetric.PURCHASE_AMOUNT_KEY, Long.valueOf(this.purchaseAmount));
        RecourcesKt.addToJson(InGamePurchaseMetric.PURCHASE_PRICE_KEY, this.purchasePrice, jSONObject);
        jSONObject.accumulate(InGamePurchaseMetric.PURCHASE_TYPE_KEY, this.purchaseType);
        jSONObject.accumulate(InGamePurchaseMetric.PURCHASE_ID_KEY, this.purchaseId);
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

    public final int getLevel() {
        return this.level;
    }

    public final long getPurchaseAmount() {
        return this.purchaseAmount;
    }

    @NotNull
    public final String getPurchaseId() {
        return this.purchaseId;
    }

    @NotNull
    public final Map<String, Long> getPurchasePrice() {
        return this.purchasePrice;
    }

    @NotNull
    public final String getPurchaseType() {
        return this.purchaseType;
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iA = b.a(this.purchaseId, b.a(this.purchaseType, (this.purchasePrice.hashCode() + a.a(this.purchaseAmount, a.a(this.sessionId, Integer.hashCode(this.level) * 31, 31), 31)) * 31, 31), 31);
        List<String> list = this.inProgress;
        return iA + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n\t code: " + getCode() + "\n");
        stringBuffer.append("\t timestamp: " + this.timestamp + "\n");
        stringBuffer.append("\t level: " + this.level + "\n");
        stringBuffer.append("\t sessionId: " + this.sessionId + "\n");
        stringBuffer.append("\t purchaseAmount: " + this.purchaseAmount + "\n");
        if (!this.purchasePrice.isEmpty()) {
            stringBuffer.append("\t purchasePrice: \n");
            Map<String, Long> map = this.purchasePrice;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, Long> entry : map.entrySet()) {
                String key = entry.getKey();
                stringBuffer.append("\t\t parameter key: " + ((Object) key) + " value: " + entry.getValue() + "\n");
                arrayList.add(stringBuffer);
            }
        }
        stringBuffer.append("\t purchaseType: " + this.purchaseType + "\n");
        stringBuffer.append("\t purchaseId: " + this.purchaseId + "\n");
        List<String> list = this.inProgress;
        if (list != null && !list.isEmpty()) {
            stringBuffer.append("\t inProgress: " + this.inProgress + "\n");
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }
}
