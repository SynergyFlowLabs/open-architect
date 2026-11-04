package com.devtodev.analytics.internal.domain.events.correncyPayment;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public final class Transaction {

    @NotNull
    private String productID;

    @NotNull
    private JSONArray transactionIds;

    public Transaction(@NotNull String productID, @NotNull JSONArray transactionIds) {
        Intrinsics.checkNotNullParameter(productID, "productID");
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        this.productID = productID;
        this.transactionIds = transactionIds;
    }

    public static /* synthetic */ Transaction copy$default(Transaction transaction, String str, JSONArray jSONArray, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = transaction.productID;
        }
        if ((i10 & 2) != 0) {
            jSONArray = transaction.transactionIds;
        }
        return transaction.copy(str, jSONArray);
    }

    @NotNull
    public final String component1() {
        return this.productID;
    }

    @NotNull
    public final JSONArray component2() {
        return this.transactionIds;
    }

    @NotNull
    public final Transaction copy(@NotNull String productID, @NotNull JSONArray transactionIds) {
        Intrinsics.checkNotNullParameter(productID, "productID");
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        return new Transaction(productID, transactionIds);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Transaction)) {
            return false;
        }
        Transaction transaction = (Transaction) obj;
        return Intrinsics.areEqual(this.productID, transaction.productID) && Intrinsics.areEqual(this.transactionIds, transaction.transactionIds);
    }

    @NotNull
    public final String getProductID() {
        return this.productID;
    }

    @NotNull
    public final JSONArray getTransactionIds() {
        return this.transactionIds;
    }

    public int hashCode() {
        return this.transactionIds.hashCode() + (this.productID.hashCode() * 31);
    }

    public final void setProductID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.productID = str;
    }

    public final void setTransactionIds(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<set-?>");
        this.transactionIds = jSONArray;
    }

    @NotNull
    public String toString() {
        return "Transaction(productID=" + this.productID + ", transactionIds=" + this.transactionIds + ")";
    }
}
