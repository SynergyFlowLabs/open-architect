package com.appsflyer.api;

import com.appsflyer.api.models.SubscriptionOfferDetails;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.r;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSubscriptionPurchaseEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionPurchaseEvent.kt\ncom/appsflyer/api/SubscriptionPurchaseEvent\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n1179#2,2:45\n1253#2,2:47\n1549#2:49\n1620#2,3:50\n1256#2:53\n*S KotlinDebug\n*F\n+ 1 SubscriptionPurchaseEvent.kt\ncom/appsflyer/api/SubscriptionPurchaseEvent\n*L\n20#1:45,2\n20#1:47,2\n20#1:49\n20#1:50,3\n20#1:53\n*E\n"})
public final class SubscriptionPurchaseEvent extends PurchaseEvent {

    @NotNull
    private final Map<String, List<SubscriptionOfferDetails>> subscriptionOfferDetails;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionPurchaseEvent(@NotNull List<String> list, @NotNull String str, @NotNull Store store, long j10, @NotNull Map<String, ? extends List<SubscriptionOfferDetails>> map) {
        super(list, str, store, "subs", j10);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(store, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.subscriptionOfferDetails = map;
    }

    @Override // com.appsflyer.api.PurchaseEvent
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (Intrinsics.areEqual(SubscriptionPurchaseEvent.class, obj != null ? obj.getClass() : null) && super.equals(obj)) {
            Intrinsics.checkNotNull(obj);
            return Intrinsics.areEqual(this.subscriptionOfferDetails, ((SubscriptionPurchaseEvent) obj).subscriptionOfferDetails);
        }
        return false;
    }

    @i(name = "getSubscriptionOfferDetails")
    @NotNull
    public final Map<String, List<SubscriptionOfferDetails>> getSubscriptionOfferDetails() {
        return this.subscriptionOfferDetails;
    }

    @Override // com.appsflyer.api.PurchaseEvent
    public final int hashCode() {
        return (super.hashCode() * 31) + this.subscriptionOfferDetails.hashCode();
    }

    @Override // com.appsflyer.api.PurchaseEvent
    @NotNull
    public final Map<String, Object> toJsonMap() {
        ArrayList arrayList;
        Map<String, Object> jsonMap = super.toJsonMap();
        Set<Map.Entry<String, List<SubscriptionOfferDetails>>> setEntrySet = this.subscriptionOfferDetails.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            if (list != null) {
                List list2 = list;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((SubscriptionOfferDetails) it2.next()).toJsonMap());
                }
            } else {
                arrayList = null;
            }
            Pair pair = TuplesKt.to(key, arrayList);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        jsonMap.put("subscription_offer_details", linkedHashMap);
        return jsonMap;
    }
}
