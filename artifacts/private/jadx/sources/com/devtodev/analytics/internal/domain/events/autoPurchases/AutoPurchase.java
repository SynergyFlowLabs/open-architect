package com.devtodev.analytics.internal.domain.events.autoPurchases;

import com.appsflyer.AppsFlyerProperties;
import com.devtodev.analytics.internal.domain.events.IEncodable;
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
@SourceDebugExtension({"SMAP\nAutoPurchase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoPurchase.kt\ncom/devtodev/analytics/internal/domain/events/autoPurchases/AutoPurchase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,109:1\n1855#2,2:110\n*S KotlinDebug\n*F\n+ 1 AutoPurchase.kt\ncom/devtodev/analytics/internal/domain/events/autoPurchases/AutoPurchase\n*L\n85#1:110,2\n*E\n"})
public final class AutoPurchase implements IEncodable {

    @NotNull
    private final String code;

    @NotNull
    private final String currencyCode;

    @Nullable
    private final List<String> inProgress;
    private final int level;

    @NotNull
    private final String orderId;
    private final int paymentType;
    private final double price;

    @NotNull
    private final String productId;

    @NotNull
    private final String purchaseToken;
    private final long sessionId;
    private final long timestamp;

    public AutoPurchase(long j10, int i10, double d10, @NotNull String orderId, @NotNull String productId, @NotNull String purchaseToken, @NotNull String currencyCode, int i11, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.sessionId = j10;
        this.level = i10;
        this.price = d10;
        this.orderId = orderId;
        this.productId = productId;
        this.purchaseToken = purchaseToken;
        this.currencyCode = currencyCode;
        this.paymentType = i11;
        this.inProgress = list;
        this.code = AutoPurchaseKt.AUTO_PURCHASE_CODE;
        this.timestamp = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AutoPurchase copy$default(AutoPurchase autoPurchase, long j10, int i10, double d10, String str, String str2, String str3, String str4, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j10 = autoPurchase.sessionId;
        }
        long j11 = j10;
        if ((i12 & 2) != 0) {
            i10 = autoPurchase.level;
        }
        return autoPurchase.copy(j11, i10, (i12 & 4) != 0 ? autoPurchase.price : d10, (i12 & 8) != 0 ? autoPurchase.orderId : str, (i12 & 16) != 0 ? autoPurchase.productId : str2, (i12 & 32) != 0 ? autoPurchase.purchaseToken : str3, (i12 & 64) != 0 ? autoPurchase.currencyCode : str4, (i12 & 128) != 0 ? autoPurchase.paymentType : i11, (i12 & 256) != 0 ? autoPurchase.inProgress : list);
    }

    public final long component1() {
        return this.sessionId;
    }

    public final int component2() {
        return this.level;
    }

    public final double component3() {
        return this.price;
    }

    @NotNull
    public final String component4() {
        return this.orderId;
    }

    @NotNull
    public final String component5() {
        return this.productId;
    }

    @NotNull
    public final String component6() {
        return this.purchaseToken;
    }

    @NotNull
    public final String component7() {
        return this.currencyCode;
    }

    public final int component8() {
        return this.paymentType;
    }

    @Nullable
    public final List<String> component9() {
        return this.inProgress;
    }

    @NotNull
    public final AutoPurchase copy(long j10, int i10, double d10, @NotNull String orderId, @NotNull String productId, @NotNull String purchaseToken, @NotNull String currencyCode, int i11, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        return new AutoPurchase(j10, i10, d10, orderId, productId, purchaseToken, currencyCode, i11, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoPurchase)) {
            return false;
        }
        AutoPurchase autoPurchase = (AutoPurchase) obj;
        return this.sessionId == autoPurchase.sessionId && this.level == autoPurchase.level && Double.compare(this.price, autoPurchase.price) == 0 && Intrinsics.areEqual(this.orderId, autoPurchase.orderId) && Intrinsics.areEqual(this.productId, autoPurchase.productId) && Intrinsics.areEqual(this.purchaseToken, autoPurchase.purchaseToken) && Intrinsics.areEqual(this.currencyCode, autoPurchase.currencyCode) && this.paymentType == autoPurchase.paymentType && Intrinsics.areEqual(this.inProgress, autoPurchase.inProgress);
    }

    @Override // com.devtodev.analytics.internal.domain.events.IEncodable
    @NotNull
    public String getCode() {
        return this.code;
    }

    @NotNull
    public final String getCurrencyCode() {
        return this.currencyCode;
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
        jSONObject.accumulate(UserEntry.sessionId, Long.valueOf(this.sessionId));
        jSONObject.accumulate("level", Integer.valueOf(this.level));
        jSONObject.accumulate("price", Double.valueOf(this.price));
        jSONObject.accumulate("orderId", this.orderId);
        jSONObject.accumulate("productId", this.productId);
        jSONObject.accumulate("purchaseToken", this.purchaseToken);
        jSONObject.accumulate(AppsFlyerProperties.CURRENCY_CODE, this.currencyCode);
        jSONObject.accumulate("paymentType", Integer.valueOf(this.paymentType));
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

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    public final int getPaymentType() {
        return this.paymentType;
    }

    public final double getPrice() {
        return this.price;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = (Integer.hashCode(this.paymentType) + b.a(this.currencyCode, b.a(this.purchaseToken, b.a(this.productId, b.a(this.orderId, (Double.hashCode(this.price) + ((Integer.hashCode(this.level) + (Long.hashCode(this.sessionId) * 31)) * 31)) * 31, 31), 31), 31), 31)) * 31;
        List<String> list = this.inProgress;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n\t code: " + getCode() + "\n");
        stringBuffer.append("\t timestamp: " + this.timestamp + "\n");
        stringBuffer.append("\t level: " + this.level + "\n");
        stringBuffer.append("\t sessionId: " + this.sessionId + "\n");
        stringBuffer.append("\t price: " + this.price + "\n");
        stringBuffer.append("\t orderId: " + this.orderId + "\n");
        stringBuffer.append("\t productId: " + this.productId + "\n");
        stringBuffer.append("\t purchaseToken: " + this.purchaseToken + "\n");
        stringBuffer.append("\t currencyCode: " + this.currencyCode + "\n");
        stringBuffer.append("\t paymentType: " + this.paymentType + "\n");
        List<String> list = this.inProgress;
        if (list != null && !list.isEmpty()) {
            stringBuffer.append("\t inProgress: " + this.inProgress + "\n");
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }
}
