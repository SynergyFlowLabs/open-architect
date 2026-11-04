package com.superwall.sdk.models.product;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0(with = PlayStoreProductSerializer.class)
public final class PlayStoreProduct {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String basePlanIdentifier;

    @NotNull
    private final Offer offer;

    @NotNull
    private final String productIdentifier;

    @NotNull
    private final Store store;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<PlayStoreProduct> serializer() {
            return PlayStoreProductSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PlayStoreProduct(@NotNull Store store, @NotNull String productIdentifier, @NotNull String basePlanIdentifier, @NotNull Offer offer) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(productIdentifier, "productIdentifier");
        Intrinsics.checkNotNullParameter(basePlanIdentifier, "basePlanIdentifier");
        Intrinsics.checkNotNullParameter(offer, "offer");
        this.store = store;
        this.productIdentifier = productIdentifier;
        this.basePlanIdentifier = basePlanIdentifier;
        this.offer = offer;
    }

    public static /* synthetic */ PlayStoreProduct copy$default(PlayStoreProduct playStoreProduct, Store store, String str, String str2, Offer offer, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            store = playStoreProduct.store;
        }
        if ((i10 & 2) != 0) {
            str = playStoreProduct.productIdentifier;
        }
        if ((i10 & 4) != 0) {
            str2 = playStoreProduct.basePlanIdentifier;
        }
        if ((i10 & 8) != 0) {
            offer = playStoreProduct.offer;
        }
        return playStoreProduct.copy(store, str, str2, offer);
    }

    @a0("base_plan_identifier")
    public static /* synthetic */ void getBasePlanIdentifier$annotations() {
    }

    @a0("offer")
    public static /* synthetic */ void getOffer$annotations() {
    }

    @a0("product_identifier")
    public static /* synthetic */ void getProductIdentifier$annotations() {
    }

    @a0("store")
    public static /* synthetic */ void getStore$annotations() {
    }

    @NotNull
    public final Store component1() {
        return this.store;
    }

    @NotNull
    public final String component2() {
        return this.productIdentifier;
    }

    @NotNull
    public final String component3() {
        return this.basePlanIdentifier;
    }

    @NotNull
    public final Offer component4() {
        return this.offer;
    }

    @NotNull
    public final PlayStoreProduct copy(@NotNull Store store, @NotNull String productIdentifier, @NotNull String basePlanIdentifier, @NotNull Offer offer) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(productIdentifier, "productIdentifier");
        Intrinsics.checkNotNullParameter(basePlanIdentifier, "basePlanIdentifier");
        Intrinsics.checkNotNullParameter(offer, "offer");
        return new PlayStoreProduct(store, productIdentifier, basePlanIdentifier, offer);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayStoreProduct)) {
            return false;
        }
        PlayStoreProduct playStoreProduct = (PlayStoreProduct) obj;
        return this.store == playStoreProduct.store && Intrinsics.areEqual(this.productIdentifier, playStoreProduct.productIdentifier) && Intrinsics.areEqual(this.basePlanIdentifier, playStoreProduct.basePlanIdentifier) && Intrinsics.areEqual(this.offer, playStoreProduct.offer);
    }

    @NotNull
    public final String getBasePlanIdentifier() {
        return this.basePlanIdentifier;
    }

    @NotNull
    public final String getFullIdentifier() {
        Offer offer = this.offer;
        if (offer instanceof Offer.Automatic) {
            return this.productIdentifier + ":" + this.basePlanIdentifier + ":sw-auto";
        }
        if (!(offer instanceof Offer.Specified)) {
            throw new k0();
        }
        return this.productIdentifier + ":" + this.basePlanIdentifier + ":" + ((Offer.Specified) offer).getOfferIdentifier();
    }

    @NotNull
    public final Offer getOffer() {
        return this.offer;
    }

    @NotNull
    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    @NotNull
    public final Store getStore() {
        return this.store;
    }

    public int hashCode() {
        return (((((this.store.hashCode() * 31) + this.productIdentifier.hashCode()) * 31) + this.basePlanIdentifier.hashCode()) * 31) + this.offer.hashCode();
    }

    @NotNull
    public String toString() {
        return "PlayStoreProduct(store=" + this.store + ", productIdentifier=" + this.productIdentifier + ", basePlanIdentifier=" + this.basePlanIdentifier + ", offer=" + this.offer + ")";
    }

    public /* synthetic */ PlayStoreProduct(Store store, String str, String str2, Offer offer, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Store.PLAY_STORE : store, str, str2, offer);
    }
}
