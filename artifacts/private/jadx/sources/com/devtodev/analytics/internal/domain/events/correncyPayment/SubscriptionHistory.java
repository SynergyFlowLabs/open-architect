package com.devtodev.analytics.internal.domain.events.correncyPayment;

import com.devtodev.analytics.internal.domain.events.IEncodable;
import com.devtodev.analytics.internal.storage.sqlite.UserEntry;
import io.sentry.k4;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSubscriptionHistory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionHistory.kt\ncom/devtodev/analytics/internal/domain/events/correncyPayment/SubscriptionHistory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,74:1\n1855#2,2:75\n1855#2,2:77\n*S KotlinDebug\n*F\n+ 1 SubscriptionHistory.kt\ncom/devtodev/analytics/internal/domain/events/correncyPayment/SubscriptionHistory\n*L\n39#1:75,2\n59#1:77,2\n*E\n"})
public final class SubscriptionHistory implements IEncodable {

    @NotNull
    private final String code;

    @NotNull
    private final List<Transaction> purchaseList;
    private final long sessionId;
    private final long timestamp;

    public SubscriptionHistory(@NotNull List<Transaction> purchaseList, long j10) {
        Intrinsics.checkNotNullParameter(purchaseList, "purchaseList");
        this.purchaseList = purchaseList;
        this.sessionId = j10;
        this.code = SubscriptionHistoryKt.SUBSCRIPTION_HISTORY_CODE;
        this.timestamp = System.currentTimeMillis();
    }

    @Override // com.devtodev.analytics.internal.domain.events.IEncodable
    @NotNull
    public String getCode() {
        return this.code;
    }

    @Override // com.devtodev.analytics.internal.domain.events.IEncodable
    @NotNull
    public String getJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.accumulate("code", getCode());
        jSONObject.accumulate("timestamp", Long.valueOf(this.timestamp));
        jSONObject.accumulate(UserEntry.sessionId, Long.valueOf(this.sessionId));
        JSONArray jSONArray = new JSONArray();
        for (Transaction transaction : this.purchaseList) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.accumulate("productID", transaction.getProductID());
            jSONObject2.accumulate("transactionIds", transaction.getTransactionIds());
            jSONArray.put(jSONObject2);
        }
        jSONObject.accumulate(k4.c.f305762r, jSONArray);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    @NotNull
    public final List<Transaction> getPurchaseList() {
        return this.purchaseList;
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public String toString() throws JSONException {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n\t code: " + getCode() + "\n");
        stringBuffer.append("\t timestamp: " + this.timestamp + "\n");
        stringBuffer.append("\t sessionId: " + this.sessionId + "\n");
        if (!this.purchaseList.isEmpty()) {
            stringBuffer.append("\t transactions: \n");
        }
        for (Transaction transaction : this.purchaseList) {
            stringBuffer.append("\t\t productID: " + transaction.getProductID() + "\n");
            if (transaction.getTransactionIds().length() != 0) {
                stringBuffer.append("\t\t transactionIds: \n");
            }
            int length = transaction.getTransactionIds().length();
            for (int i10 = 0; i10 < length; i10++) {
                stringBuffer.append("\t\t\t " + transaction.getTransactionIds().get(i10) + "\n");
            }
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }
}
