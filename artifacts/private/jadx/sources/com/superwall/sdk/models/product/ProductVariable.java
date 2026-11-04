package com.superwall.sdk.models.product;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0(with = ProductVariableSerializer.class)
public final class ProductVariable {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final Map<String, Object> attributes;

    @NotNull
    private final String name;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<ProductVariable> serializer() {
            return ProductVariableSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ProductVariable(@NotNull String name, @NotNull Map<String, ? extends Object> attributes) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.name = name;
        this.attributes = attributes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductVariable copy$default(ProductVariable productVariable, String str, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = productVariable.name;
        }
        if ((i10 & 2) != 0) {
            map = productVariable.attributes;
        }
        return productVariable.copy(str, map);
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @NotNull
    public final Map<String, Object> component2() {
        return this.attributes;
    }

    @NotNull
    public final ProductVariable copy(@NotNull String name, @NotNull Map<String, ? extends Object> attributes) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return new ProductVariable(name, attributes);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductVariable)) {
            return false;
        }
        ProductVariable productVariable = (ProductVariable) obj;
        return Intrinsics.areEqual(this.name, productVariable.name) && Intrinsics.areEqual(this.attributes, productVariable.attributes);
    }

    @NotNull
    public final Map<String, Object> getAttributes() {
        return this.attributes;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.attributes.hashCode();
    }

    @NotNull
    public String toString() {
        return "ProductVariable(name=" + this.name + ", attributes=" + this.attributes + ")";
    }
}
