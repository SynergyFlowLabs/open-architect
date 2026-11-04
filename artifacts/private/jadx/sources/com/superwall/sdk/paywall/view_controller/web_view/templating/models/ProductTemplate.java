package com.superwall.sdk.paywall.view_controller.web_view.templating.models;

import com.superwall.sdk.models.product.ProductItem;
import com.superwall.sdk.models.product.ProductItemSerializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
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
public final class ProductTemplate {

    @NotNull
    private final String eventName;

    @NotNull
    private final List<ProductItem> products;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, new kotlinx.serialization.internal.f(ProductItemSerializer.INSTANCE)};

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<ProductTemplate> serializer() {
            return ProductTemplate$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ProductTemplate(int i10, String str, List list, v2 v2Var) {
        if (3 != (i10 & 3)) {
            g2.b(i10, 3, ProductTemplate$$serializer.INSTANCE.getDescriptor());
        }
        this.eventName = str;
        this.products = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductTemplate copy$default(ProductTemplate productTemplate, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = productTemplate.eventName;
        }
        if ((i10 & 2) != 0) {
            list = productTemplate.products;
        }
        return productTemplate.copy(str, list);
    }

    @a0("event_name")
    public static /* synthetic */ void getEventName$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(ProductTemplate productTemplate, e eVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        eVar.encodeStringElement(serialDescriptor, 0, productTemplate.eventName);
        eVar.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], productTemplate.products);
    }

    @NotNull
    public final String component1() {
        return this.eventName;
    }

    @NotNull
    public final List<ProductItem> component2() {
        return this.products;
    }

    @NotNull
    public final ProductTemplate copy(@NotNull String eventName, @NotNull List<ProductItem> products) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(products, "products");
        return new ProductTemplate(eventName, products);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductTemplate)) {
            return false;
        }
        ProductTemplate productTemplate = (ProductTemplate) obj;
        return Intrinsics.areEqual(this.eventName, productTemplate.eventName) && Intrinsics.areEqual(this.products, productTemplate.products);
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    public final List<ProductItem> getProducts() {
        return this.products;
    }

    public int hashCode() {
        return (this.eventName.hashCode() * 31) + this.products.hashCode();
    }

    @NotNull
    public String toString() {
        return "ProductTemplate(eventName=" + this.eventName + ", products=" + this.products + ")";
    }

    public ProductTemplate(@NotNull String eventName, @NotNull List<ProductItem> products) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(products, "products");
        this.eventName = eventName;
        this.products = products;
    }
}
