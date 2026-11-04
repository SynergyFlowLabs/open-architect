package com.superwall.sdk.models.product;

import com.superwall.sdk.models.entitlements.Entitlement;
import com.superwall.sdk.models.product.ProductItem;
import java.lang.annotation.Annotation;
import java.util.Set;
import kotlin.f0;
import kotlin.g0;
import kotlin.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlin.k0;
import kotlin.reflect.d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.v;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0(with = ProductItemSerializer.class)
public final class ProductItem {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final Set<Entitlement> entitlements;

    @NotNull
    private final String name;

    @NotNull
    private final StoreProductType type;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<ProductItem> serializer() {
            return ProductItemSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @b0
    public static abstract class StoreProductType {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private static final f0<KSerializer<Object>> $cachedSerializer$delegate = g0.b(j0.PUBLICATION, new Function0() { // from class: ag.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProductItem.StoreProductType._init_$_anonymous_();
            }
        });

        public static final class Companion {
            private Companion() {
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) StoreProductType.$cachedSerializer$delegate.getValue();
            }

            @NotNull
            public final KSerializer<StoreProductType> serializer() {
                return get$cachedSerializer();
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @b0
        public static final class PlayStore extends StoreProductType {

            @NotNull
            public static final Companion Companion = new Companion(null);

            @NotNull
            private final PlayStoreProduct product;

            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer<PlayStore> serializer() {
                    return ProductItem$StoreProductType$PlayStore$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ PlayStore(int i10, PlayStoreProduct playStoreProduct, v2 v2Var) {
                super(i10, v2Var);
                if (1 != (i10 & 1)) {
                    g2.b(i10, 1, ProductItem$StoreProductType$PlayStore$$serializer.INSTANCE.getDescriptor());
                }
                this.product = playStoreProduct;
            }

            public static /* synthetic */ PlayStore copy$default(PlayStore playStore, PlayStoreProduct playStoreProduct, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    playStoreProduct = playStore.product;
                }
                return playStore.copy(playStoreProduct);
            }

            @n
            public static final /* synthetic */ void write$Self$superwall_release(PlayStore playStore, e eVar, SerialDescriptor serialDescriptor) {
                StoreProductType.write$Self(playStore, eVar, serialDescriptor);
                eVar.encodeSerializableElement(serialDescriptor, 0, PlayStoreProductSerializer.INSTANCE, playStore.product);
            }

            @NotNull
            public final PlayStoreProduct component1() {
                return this.product;
            }

            @NotNull
            public final PlayStore copy(@NotNull PlayStoreProduct product) {
                Intrinsics.checkNotNullParameter(product, "product");
                return new PlayStore(product);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PlayStore) && Intrinsics.areEqual(this.product, ((PlayStore) obj).product);
            }

            @NotNull
            public final PlayStoreProduct getProduct() {
                return this.product;
            }

            public int hashCode() {
                return this.product.hashCode();
            }

            @NotNull
            public String toString() {
                return "PlayStore(product=" + this.product + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PlayStore(@NotNull PlayStoreProduct product) {
                super(null);
                Intrinsics.checkNotNullParameter(product, "product");
                this.product = product;
            }
        }

        public /* synthetic */ StoreProductType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new v("com.superwall.sdk.models.product.ProductItem.StoreProductType", j1.d(StoreProductType.class), new d[]{j1.d(PlayStore.class)}, new KSerializer[]{ProductItem$StoreProductType$PlayStore$$serializer.INSTANCE}, new Annotation[0]);
        }

        @n
        public static final /* synthetic */ void write$Self(StoreProductType storeProductType, e eVar, SerialDescriptor serialDescriptor) {
        }

        private StoreProductType() {
        }

        public /* synthetic */ StoreProductType(int i10, v2 v2Var) {
        }
    }

    public ProductItem(@NotNull String name, @NotNull StoreProductType type, @NotNull Set<Entitlement> entitlements) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(entitlements, "entitlements");
        this.name = name;
        this.type = type;
        this.entitlements = entitlements;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductItem copy$default(ProductItem productItem, String str, StoreProductType storeProductType, Set set, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = productItem.name;
        }
        if ((i10 & 2) != 0) {
            storeProductType = productItem.type;
        }
        if ((i10 & 4) != 0) {
            set = productItem.entitlements;
        }
        return productItem.copy(str, storeProductType, set);
    }

    @a0("entitlements")
    public static /* synthetic */ void getEntitlements$annotations() {
    }

    @a0("reference_name")
    public static /* synthetic */ void getName$annotations() {
    }

    @a0("store_product")
    public static /* synthetic */ void getType$annotations() {
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @NotNull
    public final StoreProductType component2() {
        return this.type;
    }

    @NotNull
    public final Set<Entitlement> component3() {
        return this.entitlements;
    }

    @NotNull
    public final ProductItem copy(@NotNull String name, @NotNull StoreProductType type, @NotNull Set<Entitlement> entitlements) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(entitlements, "entitlements");
        return new ProductItem(name, type, entitlements);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductItem)) {
            return false;
        }
        ProductItem productItem = (ProductItem) obj;
        return Intrinsics.areEqual(this.name, productItem.name) && Intrinsics.areEqual(this.type, productItem.type) && Intrinsics.areEqual(this.entitlements, productItem.entitlements);
    }

    @NotNull
    public final Set<Entitlement> getEntitlements() {
        return this.entitlements;
    }

    @NotNull
    public final String getFullProductId() {
        StoreProductType storeProductType = this.type;
        if (storeProductType instanceof StoreProductType.PlayStore) {
            return ((StoreProductType.PlayStore) storeProductType).getProduct().getFullIdentifier();
        }
        throw new k0();
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final StoreProductType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + this.entitlements.hashCode();
    }

    @NotNull
    public String toString() {
        return "ProductItem(name=" + this.name + ", type=" + this.type + ", entitlements=" + this.entitlements + ")";
    }
}
