package com.devtodev.analytics.internal.domain.events.correncyPayment;

import com.appsflyer.AppsFlyerProperties;
import com.devtodev.analytics.internal.domain.events.IEncodable;
import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import com.devtodev.core.data.metrics.Metric;
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
@SourceDebugExtension({"SMAP\nRealCurrencyPayment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealCurrencyPayment.kt\ncom/devtodev/analytics/internal/domain/events/correncyPayment/RealCurrencyPayment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1855#2,2:94\n*S KotlinDebug\n*F\n+ 1 RealCurrencyPayment.kt\ncom/devtodev/analytics/internal/domain/events/correncyPayment/RealCurrencyPayment\n*L\n70#1:94,2\n*E\n"})
public final class RealCurrencyPayment implements IEncodable {

    @NotNull
    private final String code;

    @NotNull
    private final String currencyCode;

    @Nullable
    private final List<String> inProgress;
    private final int level;

    @NotNull
    private final String orderId;
    private final double price;

    @NotNull
    private final String productId;
    private final long sessionId;
    private final long timestamp;

    public RealCurrencyPayment(long j10, int i10, double d10, @NotNull String orderId, @NotNull String productId, @NotNull String currencyCode, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.sessionId = j10;
        this.level = i10;
        this.price = d10;
        this.orderId = orderId;
        this.productId = productId;
        this.currencyCode = currencyCode;
        this.inProgress = list;
        this.code = "rp";
        this.timestamp = System.currentTimeMillis();
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
        jSONObject.accumulate(AppsFlyerProperties.CURRENCY_CODE, this.currencyCode);
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

    public final double getPrice() {
        return this.price;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    public final long getTimestamp() {
        return this.timestamp;
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
        stringBuffer.append("\t currencyCode: " + this.currencyCode + "\n");
        List<String> list = this.inProgress;
        if (list != null && !list.isEmpty()) {
            stringBuffer.append("\t inProgress: " + this.inProgress + "\n");
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }
}
