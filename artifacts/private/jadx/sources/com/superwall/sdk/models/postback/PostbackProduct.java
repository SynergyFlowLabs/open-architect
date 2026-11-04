package com.superwall.sdk.models.postback;

import com.superwall.sdk.models.serialization.AnySerializer;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.e1;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class PostbackProduct {

    @NotNull
    private final String identifier;

    @NotNull
    private final SWProduct product;

    @NotNull
    private final Map<String, Object> productVariables;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, new e1(b3.f315897a, AnySerializer.INSTANCE), null};

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<PostbackProduct> serializer() {
            return PostbackProduct$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PostbackProduct(int i10, String str, Map map, SWProduct sWProduct, v2 v2Var) {
        if (7 != (i10 & 7)) {
            g2.b(i10, 7, PostbackProduct$$serializer.INSTANCE.getDescriptor());
        }
        this.identifier = str;
        this.productVariables = map;
        this.product = sWProduct;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PostbackProduct copy$default(PostbackProduct postbackProduct, String str, Map map, SWProduct sWProduct, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = postbackProduct.identifier;
        }
        if ((i10 & 2) != 0) {
            map = postbackProduct.productVariables;
        }
        if ((i10 & 4) != 0) {
            sWProduct = postbackProduct.product;
        }
        return postbackProduct.copy(str, map, sWProduct);
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(PostbackProduct postbackProduct, e eVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        eVar.encodeStringElement(serialDescriptor, 0, postbackProduct.identifier);
        eVar.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], postbackProduct.productVariables);
        eVar.encodeSerializableElement(serialDescriptor, 2, SWProduct$$serializer.INSTANCE, postbackProduct.product);
    }

    @NotNull
    public final String component1() {
        return this.identifier;
    }

    @NotNull
    public final Map<String, Object> component2() {
        return this.productVariables;
    }

    @NotNull
    public final SWProduct component3() {
        return this.product;
    }

    @NotNull
    public final PostbackProduct copy(@NotNull String identifier, @NotNull Map<String, ? extends Object> productVariables, @NotNull SWProduct product) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(productVariables, "productVariables");
        Intrinsics.checkNotNullParameter(product, "product");
        return new PostbackProduct(identifier, productVariables, product);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostbackProduct)) {
            return false;
        }
        PostbackProduct postbackProduct = (PostbackProduct) obj;
        return Intrinsics.areEqual(this.identifier, postbackProduct.identifier) && Intrinsics.areEqual(this.productVariables, postbackProduct.productVariables) && Intrinsics.areEqual(this.product, postbackProduct.product);
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final SWProduct getProduct() {
        return this.product;
    }

    @NotNull
    public final Map<String, Object> getProductVariables() {
        return this.productVariables;
    }

    public int hashCode() {
        return (((this.identifier.hashCode() * 31) + this.productVariables.hashCode()) * 31) + this.product.hashCode();
    }

    @NotNull
    public String toString() {
        return "PostbackProduct(identifier=" + this.identifier + ", productVariables=" + this.productVariables + ", product=" + this.product + ")";
    }

    public PostbackProduct(@NotNull String identifier, @NotNull Map<String, ? extends Object> productVariables, @NotNull SWProduct product) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(productVariables, "productVariables");
        Intrinsics.checkNotNullParameter(product, "product");
        this.identifier = identifier;
        this.productVariables = productVariables;
        this.product = product;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostbackProduct(@NotNull StoreProduct product) {
        this(product.getProductIdentifier(), product.getSwProductTemplateVariablesJson(), product.getSwProduct());
        Intrinsics.checkNotNullParameter(product, "product");
    }
}
