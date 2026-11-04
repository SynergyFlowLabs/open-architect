package com.appsflyer.api.models;

import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSubscriptionOfferDetails.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionOfferDetails.kt\ncom/appsflyer/api/models/SubscriptionOfferDetails\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n1549#2:31\n1620#2,3:32\n*S KotlinDebug\n*F\n+ 1 SubscriptionOfferDetails.kt\ncom/appsflyer/api/models/SubscriptionOfferDetails\n*L\n21#1:31\n21#1:32,3\n*E\n"})
public final class SubscriptionOfferDetails implements AFPurchaseConnectorA1w {

    @NotNull
    private final String basePlanId;

    @Nullable
    private final String offerId;

    @NotNull
    private final List<String> offerTags;

    @NotNull
    private final String offerToken;

    @NotNull
    private final List<PricingPhases> pricingPhases;

    public SubscriptionOfferDetails(@NotNull String str, @Nullable String str2, @NotNull List<String> list, @NotNull String str3, @NotNull List<PricingPhases> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.basePlanId = str;
        this.offerId = str2;
        this.offerTags = list;
        this.offerToken = str3;
        this.pricingPhases = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubscriptionOfferDetails copy$default(SubscriptionOfferDetails subscriptionOfferDetails, String str, String str2, List list, String str3, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = subscriptionOfferDetails.basePlanId;
        }
        if ((i10 & 2) != 0) {
            str2 = subscriptionOfferDetails.offerId;
        }
        if ((i10 & 4) != 0) {
            list = subscriptionOfferDetails.offerTags;
        }
        if ((i10 & 8) != 0) {
            str3 = subscriptionOfferDetails.offerToken;
        }
        if ((i10 & 16) != 0) {
            list2 = subscriptionOfferDetails.pricingPhases;
        }
        List list3 = list2;
        List list4 = list;
        return subscriptionOfferDetails.copy(str, str2, list4, str3, list3);
    }

    @NotNull
    public final String component1() {
        return this.basePlanId;
    }

    @Nullable
    public final String component2() {
        return this.offerId;
    }

    @NotNull
    public final List<String> component3() {
        return this.offerTags;
    }

    @NotNull
    public final String component4() {
        return this.offerToken;
    }

    @NotNull
    public final List<PricingPhases> component5() {
        return this.pricingPhases;
    }

    @NotNull
    public final SubscriptionOfferDetails copy(@NotNull String str, @Nullable String str2, @NotNull List<String> list, @NotNull String str3, @NotNull List<PricingPhases> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new SubscriptionOfferDetails(str, str2, list, str3, list2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionOfferDetails)) {
            return false;
        }
        SubscriptionOfferDetails subscriptionOfferDetails = (SubscriptionOfferDetails) obj;
        return Intrinsics.areEqual(this.basePlanId, subscriptionOfferDetails.basePlanId) && Intrinsics.areEqual(this.offerId, subscriptionOfferDetails.offerId) && Intrinsics.areEqual(this.offerTags, subscriptionOfferDetails.offerTags) && Intrinsics.areEqual(this.offerToken, subscriptionOfferDetails.offerToken) && Intrinsics.areEqual(this.pricingPhases, subscriptionOfferDetails.pricingPhases);
    }

    @i(name = "getBasePlanId")
    @NotNull
    public final String getBasePlanId() {
        return this.basePlanId;
    }

    @i(name = "getOfferId")
    @Nullable
    public final String getOfferId() {
        return this.offerId;
    }

    @i(name = "getOfferTags")
    @NotNull
    public final List<String> getOfferTags() {
        return this.offerTags;
    }

    @i(name = "getOfferToken")
    @NotNull
    public final String getOfferToken() {
        return this.offerToken;
    }

    @i(name = "getPricingPhases")
    @NotNull
    public final List<PricingPhases> getPricingPhases() {
        return this.pricingPhases;
    }

    public final int hashCode() {
        int iHashCode = this.basePlanId.hashCode() * 31;
        String str = this.offerId;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.offerTags.hashCode()) * 31) + this.offerToken.hashCode()) * 31) + this.pricingPhases.hashCode();
    }

    @NotNull
    public final Map<String, Object> toJsonMap() {
        Pair pair = TuplesKt.to("base_plan_id", this.basePlanId);
        Pair pair2 = TuplesKt.to("offer_tags", this.offerTags);
        Pair pair3 = TuplesKt.to("offer_token", this.offerToken);
        List<PricingPhases> list = this.pricingPhases;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PricingPhases) it.next()).toJsonMap());
        }
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(pair, pair2, pair3, TuplesKt.to("pricing_phases", arrayList));
        String str = this.offerId;
        if (str != null) {
            mapMutableMapOf.put("offer_id", str);
        }
        return mapMutableMapOf;
    }

    @NotNull
    public final String toString() {
        return "SubscriptionOfferDetails(basePlanId=" + this.basePlanId + ", offerId=" + this.offerId + ", offerTags=" + this.offerTags + ", offerToken=" + this.offerToken + ", pricingPhases=" + this.pricingPhases + ")";
    }
}
