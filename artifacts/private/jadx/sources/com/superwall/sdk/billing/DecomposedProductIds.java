package com.superwall.sdk.billing;

import com.superwall.sdk.store.abstractions.product.OfferType;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class DecomposedProductIds {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String basePlanId;

    @NotNull
    private final String fullId;

    @NotNull
    private final OfferType offerType;

    @NotNull
    private final String subscriptionId;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DecomposedProductIds from(@NotNull String productId) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            List listSplit$default = StringsKt.split$default(productId, new String[]{":"}, false, 0, 6, null);
            String str = (String) CollectionsKt.getOrNull(listSplit$default, 0);
            if (str == null) {
                str = "";
            }
            String str2 = (String) CollectionsKt.getOrNull(listSplit$default, 1);
            String str3 = str2 != null ? str2 : "";
            String str4 = (String) CollectionsKt.getOrNull(listSplit$default, 2);
            return new DecomposedProductIds(str, str3, (Intrinsics.areEqual(str4, "sw-auto") || str4 == null) ? OfferType.Auto.INSTANCE : new OfferType.Offer(str4), productId);
        }

        private Companion() {
        }
    }

    public DecomposedProductIds(@NotNull String subscriptionId, @NotNull String basePlanId, @NotNull OfferType offerType, @NotNull String fullId) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(basePlanId, "basePlanId");
        Intrinsics.checkNotNullParameter(offerType, "offerType");
        Intrinsics.checkNotNullParameter(fullId, "fullId");
        this.subscriptionId = subscriptionId;
        this.basePlanId = basePlanId;
        this.offerType = offerType;
        this.fullId = fullId;
    }

    public static /* synthetic */ DecomposedProductIds copy$default(DecomposedProductIds decomposedProductIds, String str, String str2, OfferType offerType, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = decomposedProductIds.subscriptionId;
        }
        if ((i10 & 2) != 0) {
            str2 = decomposedProductIds.basePlanId;
        }
        if ((i10 & 4) != 0) {
            offerType = decomposedProductIds.offerType;
        }
        if ((i10 & 8) != 0) {
            str3 = decomposedProductIds.fullId;
        }
        return decomposedProductIds.copy(str, str2, offerType, str3);
    }

    @NotNull
    public final String component1() {
        return this.subscriptionId;
    }

    @NotNull
    public final String component2() {
        return this.basePlanId;
    }

    @NotNull
    public final OfferType component3() {
        return this.offerType;
    }

    @NotNull
    public final String component4() {
        return this.fullId;
    }

    @NotNull
    public final DecomposedProductIds copy(@NotNull String subscriptionId, @NotNull String basePlanId, @NotNull OfferType offerType, @NotNull String fullId) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(basePlanId, "basePlanId");
        Intrinsics.checkNotNullParameter(offerType, "offerType");
        Intrinsics.checkNotNullParameter(fullId, "fullId");
        return new DecomposedProductIds(subscriptionId, basePlanId, offerType, fullId);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecomposedProductIds)) {
            return false;
        }
        DecomposedProductIds decomposedProductIds = (DecomposedProductIds) obj;
        return Intrinsics.areEqual(this.subscriptionId, decomposedProductIds.subscriptionId) && Intrinsics.areEqual(this.basePlanId, decomposedProductIds.basePlanId) && Intrinsics.areEqual(this.offerType, decomposedProductIds.offerType) && Intrinsics.areEqual(this.fullId, decomposedProductIds.fullId);
    }

    @NotNull
    public final String getBasePlanId() {
        return this.basePlanId;
    }

    @NotNull
    public final String getFullId() {
        return this.fullId;
    }

    @NotNull
    public final OfferType getOfferType() {
        return this.offerType;
    }

    @NotNull
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    public int hashCode() {
        return (((((this.subscriptionId.hashCode() * 31) + this.basePlanId.hashCode()) * 31) + this.offerType.hashCode()) * 31) + this.fullId.hashCode();
    }

    @NotNull
    public String toString() {
        return "DecomposedProductIds(subscriptionId=" + this.subscriptionId + ", basePlanId=" + this.basePlanId + ", offerType=" + this.offerType + ", fullId=" + this.fullId + ")";
    }
}
