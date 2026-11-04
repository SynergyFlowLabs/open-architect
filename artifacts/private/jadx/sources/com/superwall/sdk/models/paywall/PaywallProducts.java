package com.superwall.sdk.models.paywall;

import com.superwall.sdk.store.abstractions.product.StoreProduct;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@l(message = "When overriding paywall products, pass a dictionary to productsByName in the PaywallOverrides object instead")
public final class PaywallProducts {

    @NotNull
    private final List<String> ids;

    @Nullable
    private final StoreProduct primary;

    @Nullable
    private final StoreProduct secondary;

    @Nullable
    private final StoreProduct tertiary;

    public PaywallProducts() {
        this(null, null, null, 7, null);
    }

    @NotNull
    public final List<String> getIds() {
        return this.ids;
    }

    @Nullable
    public final StoreProduct getPrimary() {
        return this.primary;
    }

    @Nullable
    public final StoreProduct getSecondary() {
        return this.secondary;
    }

    @Nullable
    public final StoreProduct getTertiary() {
        return this.tertiary;
    }

    public PaywallProducts(@Nullable StoreProduct storeProduct, @Nullable StoreProduct storeProduct2, @Nullable StoreProduct storeProduct3) {
        this.primary = storeProduct;
        this.secondary = storeProduct2;
        this.tertiary = storeProduct3;
        this.ids = CollectionsKt.listOfNotNull((Object[]) new String[]{storeProduct != null ? storeProduct.getFullIdentifier() : null, storeProduct2 != null ? storeProduct2.getFullIdentifier() : null, storeProduct3 != null ? storeProduct3.getFullIdentifier() : null});
    }

    public /* synthetic */ PaywallProducts(StoreProduct storeProduct, StoreProduct storeProduct2, StoreProduct storeProduct3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : storeProduct, (i10 & 2) != 0 ? null : storeProduct2, (i10 & 4) != 0 ? null : storeProduct3);
    }
}
