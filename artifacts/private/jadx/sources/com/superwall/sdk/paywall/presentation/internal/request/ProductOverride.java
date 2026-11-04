package com.superwall.sdk.paywall.presentation.internal.request;

import com.superwall.sdk.store.abstractions.product.StoreProduct;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ProductOverride {

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class ById extends ProductOverride {

        @NotNull
        private final String productId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ById(@NotNull String productId) {
            super(null);
            Intrinsics.checkNotNullParameter(productId, "productId");
            this.productId = productId;
        }

        public static /* synthetic */ ById copy$default(ById byId, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = byId.productId;
            }
            return byId.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.productId;
        }

        @NotNull
        public final ById copy(@NotNull String productId) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            return new ById(productId);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof ById) && Intrinsics.areEqual(this.productId, ((ById) obj).productId)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            return this.productId.hashCode();
        }

        @NotNull
        public String toString() {
            return "ById(productId=" + this.productId + ")";
        }
    }

    public static final class ByProduct extends ProductOverride {

        @NotNull
        private final StoreProduct product;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ByProduct(@NotNull StoreProduct product) {
            super(null);
            Intrinsics.checkNotNullParameter(product, "product");
            this.product = product;
        }

        public static /* synthetic */ ByProduct copy$default(ByProduct byProduct, StoreProduct storeProduct, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                storeProduct = byProduct.product;
            }
            return byProduct.copy(storeProduct);
        }

        @NotNull
        public final StoreProduct component1() {
            return this.product;
        }

        @NotNull
        public final ByProduct copy(@NotNull StoreProduct product) {
            Intrinsics.checkNotNullParameter(product, "product");
            return new ByProduct(product);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ByProduct) && Intrinsics.areEqual(this.product, ((ByProduct) obj).product);
        }

        @NotNull
        public final StoreProduct getProduct() {
            return this.product;
        }

        public int hashCode() {
            return this.product.hashCode();
        }

        @NotNull
        public String toString() {
            return "ByProduct(product=" + this.product + ")";
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ProductOverride byId(@NotNull String productId) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            return new ById(productId);
        }

        @NotNull
        public final ProductOverride byProduct(@NotNull StoreProduct product) {
            Intrinsics.checkNotNullParameter(product, "product");
            return new ByProduct(product);
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProductOverride(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ProductOverride() {
    }
}
