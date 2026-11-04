package com.appsflyer.api;

import com.appsflyer.api.models.OneTimePurchaseOfferDetails;
import io.sentry.z7;
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
@SourceDebugExtension({"SMAP\nInAppPurchaseEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppPurchaseEvent.kt\ncom/appsflyer/api/InAppPurchaseEvent\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1179#2,2:58\n1253#2,4:60\n*S KotlinDebug\n*F\n+ 1 InAppPurchaseEvent.kt\ncom/appsflyer/api/InAppPurchaseEvent\n*L\n27#1:58,2\n27#1:60,4\n*E\n"})
public final class InAppPurchaseEvent extends PurchaseEvent {

    @NotNull
    private final Map<String, OneTimePurchaseOfferDetails> oneTimePurchaseOfferDetails;

    @NotNull
    private final String packageName;
    private final int quantity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppPurchaseEvent(@NotNull List<String> list, @NotNull String str, @NotNull Store store, long j10, @NotNull String str2, int i10, @NotNull Map<String, OneTimePurchaseOfferDetails> map) {
        super(list, str, store, "inapp", j10);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(store, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.packageName = str2;
        this.quantity = i10;
        this.oneTimePurchaseOfferDetails = map;
    }

    @Override // com.appsflyer.api.PurchaseEvent
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(InAppPurchaseEvent.class, obj != null ? obj.getClass() : null) || !super.equals(obj)) {
            return false;
        }
        Intrinsics.checkNotNull(obj);
        InAppPurchaseEvent inAppPurchaseEvent = (InAppPurchaseEvent) obj;
        return Intrinsics.areEqual(this.packageName, inAppPurchaseEvent.packageName) && this.quantity == inAppPurchaseEvent.quantity && Intrinsics.areEqual(this.oneTimePurchaseOfferDetails, inAppPurchaseEvent.oneTimePurchaseOfferDetails);
    }

    @i(name = "getOneTimePurchaseOfferDetails")
    @NotNull
    public final Map<String, OneTimePurchaseOfferDetails> getOneTimePurchaseOfferDetails() {
        return this.oneTimePurchaseOfferDetails;
    }

    @i(name = "getPackageName")
    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @i(name = "getQuantity")
    public final int getQuantity() {
        return this.quantity;
    }

    @Override // com.appsflyer.api.PurchaseEvent
    public final int hashCode() {
        return (((((super.hashCode() * 31) + this.packageName.hashCode()) * 31) + this.quantity) * 31) + this.oneTimePurchaseOfferDetails.hashCode();
    }

    @Override // com.appsflyer.api.PurchaseEvent
    @NotNull
    public final Map<String, Object> toJsonMap() {
        Map<String, Object> jsonMap = super.toJsonMap();
        Set<Map.Entry<String, OneTimePurchaseOfferDetails>> setEntrySet = this.oneTimePurchaseOfferDetails.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = (OneTimePurchaseOfferDetails) entry.getValue();
            Pair pair = TuplesKt.to(key, oneTimePurchaseOfferDetails != null ? oneTimePurchaseOfferDetails.toJsonMap() : null);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        jsonMap.put(z7.b.f307198c, this.packageName);
        jsonMap.put("one_time_purchase_offer_details", linkedHashMap);
        jsonMap.put("quantity", Integer.valueOf(this.quantity));
        return jsonMap;
    }
}
