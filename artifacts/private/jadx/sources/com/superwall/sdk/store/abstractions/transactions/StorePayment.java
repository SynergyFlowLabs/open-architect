package com.superwall.sdk.store.abstractions.transactions;

import com.android.billingclient.api.Purchase;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class StorePayment {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final String discountIdentifier;

    @NotNull
    private final String productIdentifier;
    private final int quantity;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<StorePayment> serializer() {
            return StorePayment$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ StorePayment(int i10, String str, int i11, String str2, v2 v2Var) {
        if (7 != (i10 & 7)) {
            g2.b(i10, 7, StorePayment$$serializer.INSTANCE.getDescriptor());
        }
        this.productIdentifier = str;
        this.quantity = i11;
        this.discountIdentifier = str2;
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(StorePayment storePayment, e eVar, SerialDescriptor serialDescriptor) {
        eVar.encodeStringElement(serialDescriptor, 0, storePayment.productIdentifier);
        eVar.encodeIntElement(serialDescriptor, 1, storePayment.quantity);
        int i10 = 2 << 2;
        eVar.encodeNullableSerializableElement(serialDescriptor, 2, b3.f315897a, storePayment.discountIdentifier);
    }

    @Nullable
    public final String getDiscountIdentifier() {
        return this.discountIdentifier;
    }

    @NotNull
    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public StorePayment(@NotNull String productIdentifier, int i10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(productIdentifier, "productIdentifier");
        this.productIdentifier = productIdentifier;
        this.quantity = i10;
        this.discountIdentifier = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StorePayment(@NotNull Purchase purchase) {
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        List<String> listG = purchase.g();
        Intrinsics.checkNotNullExpressionValue(listG, "getProducts(...)");
        Object objFirst = CollectionsKt.first((List<? extends Object>) listG);
        Intrinsics.checkNotNullExpressionValue(objFirst, "first(...)");
        int i10 = 2 & 0;
        this((String) objFirst, 1, null);
    }
}
