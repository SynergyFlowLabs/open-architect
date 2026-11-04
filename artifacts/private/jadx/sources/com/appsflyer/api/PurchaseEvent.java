package com.appsflyer.api;

import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1w;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PurchaseEvent implements AFPurchaseConnectorA1w {

    @NotNull
    private final List<String> productIds;

    @NotNull
    private final String productType;
    private final long purchaseTime;

    @NotNull
    private final String purchaseToken;

    @NotNull
    private final Store store;

    public PurchaseEvent(@NotNull List<String> list, @NotNull String str, @NotNull Store store, @NotNull String str2, long j10) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(store, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.productIds = list;
        this.purchaseToken = str;
        this.store = store;
        this.productType = str2;
        this.purchaseTime = j10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj);
        PurchaseEvent purchaseEvent = (PurchaseEvent) obj;
        return Intrinsics.areEqual(this.productIds, purchaseEvent.productIds) && Intrinsics.areEqual(this.purchaseToken, purchaseEvent.purchaseToken) && this.store == purchaseEvent.store && Intrinsics.areEqual(this.productType, purchaseEvent.productType);
    }

    @i(name = "getProductIds")
    @NotNull
    public final List<String> getProductIds() {
        return this.productIds;
    }

    @i(name = "getProductType")
    @NotNull
    public final String getProductType() {
        return this.productType;
    }

    @i(name = "getPurchaseTime")
    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    @i(name = "getPurchaseToken")
    @NotNull
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    @i(name = "getStore")
    @NotNull
    public final Store getStore() {
        return this.store;
    }

    public int hashCode() {
        return (((((this.productIds.hashCode() * 31) + this.purchaseToken.hashCode()) * 31) + this.store.hashCode()) * 31) + this.productType.hashCode();
    }

    @NotNull
    public Map<String, Object> toJsonMap() {
        return MapsKt.mutableMapOf(TuplesKt.to("purchase_token", this.purchaseToken), TuplesKt.to("product_ids", this.productIds), TuplesKt.to("product_type", this.productType), TuplesKt.to("purchase_time", Long.valueOf(this.purchaseTime)));
    }
}
