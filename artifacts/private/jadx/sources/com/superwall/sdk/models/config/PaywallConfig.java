package com.superwall.sdk.models.config;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class PaywallConfig {

    @NotNull
    private String identifier;

    @NotNull
    private List<ProductConfig> products;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, new kotlinx.serialization.internal.f(PaywallConfig$ProductConfig$$serializer.INSTANCE)};

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<PaywallConfig> serializer() {
            return PaywallConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @b0
    public static final class ProductConfig {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private String identifier;

        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer<ProductConfig> serializer() {
                return PaywallConfig$ProductConfig$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ProductConfig(int i10, String str, v2 v2Var) {
            if (1 != (i10 & 1)) {
                g2.b(i10, 1, PaywallConfig$ProductConfig$$serializer.INSTANCE.getDescriptor());
            }
            this.identifier = str;
        }

        public static /* synthetic */ ProductConfig copy$default(ProductConfig productConfig, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = productConfig.identifier;
            }
            return productConfig.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.identifier;
        }

        @NotNull
        public final ProductConfig copy(@NotNull String identifier) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            return new ProductConfig(identifier);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProductConfig) && Intrinsics.areEqual(this.identifier, ((ProductConfig) obj).identifier);
        }

        @NotNull
        public final String getIdentifier() {
            return this.identifier;
        }

        public int hashCode() {
            return this.identifier.hashCode();
        }

        public final void setIdentifier(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.identifier = str;
        }

        @NotNull
        public String toString() {
            return "ProductConfig(identifier=" + this.identifier + ")";
        }

        public ProductConfig(@NotNull String identifier) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            this.identifier = identifier;
        }
    }

    public /* synthetic */ PaywallConfig(int i10, String str, List list, v2 v2Var) {
        if (3 != (i10 & 3)) {
            g2.b(i10, 3, PaywallConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.identifier = str;
        this.products = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaywallConfig copy$default(PaywallConfig paywallConfig, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = paywallConfig.identifier;
        }
        if ((i10 & 2) != 0) {
            list = paywallConfig.products;
        }
        return paywallConfig.copy(str, list);
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(PaywallConfig paywallConfig, e eVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        eVar.encodeStringElement(serialDescriptor, 0, paywallConfig.identifier);
        eVar.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], paywallConfig.products);
    }

    @NotNull
    public final String component1() {
        return this.identifier;
    }

    @NotNull
    public final List<ProductConfig> component2() {
        return this.products;
    }

    @NotNull
    public final PaywallConfig copy(@NotNull String identifier, @NotNull List<ProductConfig> products) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(products, "products");
        return new PaywallConfig(identifier, products);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallConfig)) {
            return false;
        }
        PaywallConfig paywallConfig = (PaywallConfig) obj;
        return Intrinsics.areEqual(this.identifier, paywallConfig.identifier) && Intrinsics.areEqual(this.products, paywallConfig.products);
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final List<ProductConfig> getProducts() {
        return this.products;
    }

    public int hashCode() {
        return (this.identifier.hashCode() * 31) + this.products.hashCode();
    }

    public final void setIdentifier(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.identifier = str;
    }

    public final void setProducts(@NotNull List<ProductConfig> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.products = list;
    }

    @NotNull
    public String toString() {
        return "PaywallConfig(identifier=" + this.identifier + ", products=" + this.products + ")";
    }

    public PaywallConfig(@NotNull String identifier, @NotNull List<ProductConfig> products) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(products, "products");
        this.identifier = identifier;
        this.products = products;
    }
}
