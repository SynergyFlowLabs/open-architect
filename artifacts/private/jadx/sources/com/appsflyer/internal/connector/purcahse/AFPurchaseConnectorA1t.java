package com.appsflyer.internal.connector.purcahse;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.a0;
import com.android.billingclient.api.n;
import com.android.billingclient.api.z;
import com.appsflyer.AFLogger;
import com.appsflyer.api.InAppPurchaseEvent;
import com.appsflyer.api.Store;
import com.appsflyer.api.SubscriptionPurchaseEvent;
import com.appsflyer.api.models.OneTimePurchaseOfferDetails;
import com.appsflyer.api.models.PricingPhases;
import com.appsflyer.api.models.SubscriptionOfferDetails;
import com.appsflyer.exceptions.WrongProductTypeException;
import java.lang.reflect.Method;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.ranges.r;
import oj.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.locationtech.jts.geom.l;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBillingLibraryAsyncListenersImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillingLibraryAsyncListenersImpl.kt\ncom/appsflyer/internal/connectors/callbacks/BillingLibraryAsyncListenersImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,163:1\n1855#2,2:164\n1855#2:166\n1855#2,2:167\n1856#2:169\n1179#2,2:173\n1253#2,2:175\n1549#2:177\n1620#2,3:178\n1256#2:181\n1179#2,2:186\n1253#2,4:188\n1549#2:193\n1620#2,3:194\n125#3:170\n152#3,2:171\n154#3:182\n125#3:183\n152#3,2:184\n154#3:192\n*S KotlinDebug\n*F\n+ 1 BillingLibraryAsyncListenersImpl.kt\ncom/appsflyer/internal/connectors/callbacks/BillingLibraryAsyncListenersImpl\n*L\n65#1:164,2\n88#1:166\n89#1:167,2\n88#1:169\n111#1:173,2\n111#1:175,2\n112#1:177\n112#1:178,3\n111#1:181\n130#1:186,2\n130#1:188,4\n146#1:193\n146#1:194,3\n109#1:170\n109#1:171,2\n109#1:182\n127#1:183\n127#1:184,2\n127#1:192\n*E\n"})
public final class AFPurchaseConnectorA1t implements a0 {

    @NotNull
    private final AFPurchaseConnectorA1r.AFPurchaseConnectorA1v InAppPurchaseEvent;

    @Nullable
    private final List<Purchase> getOneTimePurchaseOfferDetails;

    @NotNull
    private final String getPackageName;
    private final boolean toJsonMap;

    /* JADX INFO: renamed from: com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1t$1, reason: invalid class name */
    static final class AnonymousClass1 extends l0 implements Function1<z, CharSequence> {
        public static final AnonymousClass1 toJsonMap = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: getOneTimePurchaseOfferDetails, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull z zVar) {
            Intrinsics.checkNotNullParameter(zVar, "");
            String strD = zVar.d();
            Intrinsics.checkNotNullExpressionValue(strD, "");
            return strD;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AFPurchaseConnectorA1t(@NotNull String str, @NotNull AFPurchaseConnectorA1r.AFPurchaseConnectorA1v aFPurchaseConnectorA1v, @Nullable List<? extends Purchase> list, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFPurchaseConnectorA1v, "");
        this.getPackageName = str;
        this.InAppPurchaseEvent = aFPurchaseConnectorA1v;
        this.getOneTimePurchaseOfferDetails = list;
        this.toJsonMap = z10;
    }

    private final Map<Purchase, Map<String, z>> InAppPurchaseEvent(List<z> list) {
        List<String> listG;
        Map<String, z> packageName = getPackageName(list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<Purchase> list2 = this.getOneTimePurchaseOfferDetails;
        if (list2 != null) {
            for (Purchase purchase : list2) {
                if (purchase != null && (listG = purchase.g()) != null) {
                    Intrinsics.checkNotNullExpressionValue(listG, "");
                    for (String str : listG) {
                        if (!packageName.containsKey(str)) {
                            break;
                        }
                        if (linkedHashMap.containsKey(purchase)) {
                            Object obj = linkedHashMap.get(purchase);
                            Intrinsics.checkNotNull(obj);
                            Intrinsics.checkNotNullExpressionValue(str, "");
                            z zVar = packageName.get(str);
                            Intrinsics.checkNotNull(zVar);
                            ((Map) obj).put(str, zVar);
                        } else {
                            z zVar2 = packageName.get(str);
                            Intrinsics.checkNotNull(zVar2);
                            linkedHashMap.put(purchase, MapsKt.mutableMapOf(TuplesKt.to(str, zVar2)));
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private final Map<String, z> getPackageName(List<z> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (z zVar : list) {
            if (Intrinsics.areEqual(zVar.e(), this.getPackageName)) {
                String strD = zVar.d();
                Intrinsics.checkNotNullExpressionValue(strD, "");
                linkedHashMap.put(strD, zVar);
            } else {
                String str = "[PurchaseConnector]: expected Product type of " + this.getPackageName + ", but received " + zVar.e();
                AFLogger.afErrorLog(str, new WrongProductTypeException(str));
            }
        }
        return linkedHashMap;
    }

    @i(name = "toJsonMap")
    private final SubscriptionOfferDetails toJsonMap(z.f fVar) {
        String strA = fVar.a();
        Intrinsics.checkNotNullExpressionValue(strA, "");
        String strC = fVar.c();
        List<String> listD = fVar.d();
        Intrinsics.checkNotNullExpressionValue(listD, "");
        String strE = fVar.e();
        Intrinsics.checkNotNullExpressionValue(strE, "");
        List<z.c> listA = fVar.f().a();
        Intrinsics.checkNotNullExpressionValue(listA, "");
        List<z.c> list = listA;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (z.c cVar : list) {
            Intrinsics.checkNotNullExpressionValue(cVar, "");
            arrayList.add(getPackageName(cVar));
        }
        return new SubscriptionOfferDetails(strA, strC, listD, strE, arrayList);
    }

    @Override // com.android.billingclient.api.a0
    public final void onProductDetailsResponse(@NotNull n nVar, @NotNull List<z> list) throws Throwable {
        Intrinsics.checkNotNullParameter(nVar, "");
        Intrinsics.checkNotNullParameter(list, "");
        try {
            if (nVar.b() == 0 && !list.isEmpty()) {
                AFLogger.afDebugLog("[PurchaseConnector]: Received the following Product details:\n\ttype: " + this.getPackageName + "\n\tProduct Ids: " + CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, AnonymousClass1.toJsonMap, 30, null));
                Map<Purchase, Map<String, z>> mapInAppPurchaseEvent = InAppPurchaseEvent(list);
                if (mapInAppPurchaseEvent.isEmpty()) {
                    return;
                }
                if (!Intrinsics.areEqual("subs", this.getPackageName)) {
                    this.InAppPurchaseEvent.getPackageName(getPackageName(mapInAppPurchaseEvent));
                    return;
                }
                List<SubscriptionPurchaseEvent> jsonMap = toJsonMap(mapInAppPurchaseEvent);
                if (this.toJsonMap) {
                    this.InAppPurchaseEvent.toJsonMap(jsonMap);
                } else {
                    this.InAppPurchaseEvent.getQuantity(jsonMap);
                }
            }
        } catch (Throwable th2) {
            try {
                Object[] objArr = {th2};
                Map<Integer, Object> map = AFPurchaseConnectorA1z.setSubscriptionPurchaseEventDataSource;
                Object method = map.get(394734513);
                if (method == null) {
                    method = ((Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(69 - TextUtils.lastIndexOf("", l.f338160j, 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 70, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))).getMethod("getOneTimePurchaseOfferDetails", Throwable.class);
                    map.put(394734513, method);
                }
                ((Method) method).invoke(null, objArr);
                try {
                    Object[] objArr2 = {th2};
                    Object method2 = map.get(469318842);
                    if (method2 == null) {
                        method2 = ((Class) AFPurchaseConnectorA1z.InAppPurchaseEvent(TextUtils.lastIndexOf("", l.f338160j, 0, 0) + 71, 70 - ExpandableListView.getPackedPositionGroup(0L), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1))).getMethod("getPackageName", Throwable.class);
                        map.put(469318842, method2);
                    }
                    ((Method) method2).invoke(null, objArr2);
                    AFLogger.afErrorLog("[PurchaseConnector]: Failed to log new purchase", th2, true);
                } catch (Throwable th3) {
                    Throwable cause = th3.getCause();
                    if (cause == null) {
                        throw th3;
                    }
                    throw cause;
                }
            } catch (Throwable th4) {
                Throwable cause2 = th4.getCause();
                if (cause2 == null) {
                    throw th4;
                }
                throw cause2;
            }
        }
    }

    public /* synthetic */ AFPurchaseConnectorA1t(String str, AFPurchaseConnectorA1r.AFPurchaseConnectorA1v aFPurchaseConnectorA1v, List list, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, aFPurchaseConnectorA1v, (i10 & 4) != 0 ? null : list, (i10 & 8) != 0 ? false : z10);
    }

    @i(name = "getPackageName")
    private final PricingPhases getPackageName(z.c cVar) {
        int iA = cVar.a();
        String strB = cVar.b();
        Intrinsics.checkNotNullExpressionValue(strB, "");
        String strC = cVar.c();
        Intrinsics.checkNotNullExpressionValue(strC, "");
        long jD = cVar.d();
        String strE = cVar.e();
        Intrinsics.checkNotNullExpressionValue(strE, "");
        return new PricingPhases(iA, strB, strC, jD, strE, cVar.f());
    }

    @i(name = "InAppPurchaseEvent")
    private final OneTimePurchaseOfferDetails InAppPurchaseEvent(z.b bVar) {
        String strA = bVar.a();
        Intrinsics.checkNotNullExpressionValue(strA, "");
        long jB = bVar.b();
        String strC = bVar.c();
        Intrinsics.checkNotNullExpressionValue(strC, "");
        return new OneTimePurchaseOfferDetails(strA, jB, strC);
    }

    private final List<SubscriptionPurchaseEvent> toJsonMap(Map<Purchase, ? extends Map<String, z>> map) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (Map.Entry<Purchase, ? extends Map<String, z>> entry : map.entrySet()) {
            Purchase key = entry.getKey();
            Set<Map.Entry<String, z>> setEntrySet = entry.getValue().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                Object key2 = entry2.getKey();
                List<z.f> listF = ((z) entry2.getValue()).f();
                if (listF != null) {
                    Intrinsics.checkNotNullExpressionValue(listF, "");
                    List<z.f> list = listF;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (z.f fVar : list) {
                        Intrinsics.checkNotNullExpressionValue(fVar, "");
                        arrayList.add(toJsonMap(fVar));
                    }
                } else {
                    arrayList = null;
                }
                Pair pair = TuplesKt.to(key2, arrayList);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            List<String> listG = key.g();
            Intrinsics.checkNotNullExpressionValue(listG, "");
            String strJ = key.j();
            Intrinsics.checkNotNullExpressionValue(strJ, "");
            arrayList2.add(new SubscriptionPurchaseEvent(listG, strJ, Store.GOOGLE, key.i(), linkedHashMap));
        }
        return arrayList2;
    }

    private final List<InAppPurchaseEvent> getPackageName(Map<Purchase, ? extends Map<String, z>> map) {
        OneTimePurchaseOfferDetails oneTimePurchaseOfferDetailsInAppPurchaseEvent;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<Purchase, ? extends Map<String, z>> entry : map.entrySet()) {
            Purchase key = entry.getKey();
            key.i();
            Set<Map.Entry<String, z>> setEntrySet = entry.getValue().entrySet();
            LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                Object key2 = entry2.getKey();
                z.b bVarC = ((z) entry2.getValue()).c();
                if (bVarC != null) {
                    Intrinsics.checkNotNullExpressionValue(bVarC, "");
                    oneTimePurchaseOfferDetailsInAppPurchaseEvent = InAppPurchaseEvent(bVarC);
                } else {
                    oneTimePurchaseOfferDetailsInAppPurchaseEvent = null;
                }
                Pair pair = TuplesKt.to(key2, oneTimePurchaseOfferDetailsInAppPurchaseEvent);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            List<String> listG = key.g();
            Intrinsics.checkNotNullExpressionValue(listG, "");
            String strJ = key.j();
            Intrinsics.checkNotNullExpressionValue(strJ, "");
            Store store = Store.GOOGLE;
            long jI = key.i();
            String strE = key.e();
            Intrinsics.checkNotNullExpressionValue(strE, "");
            arrayList.add(new InAppPurchaseEvent(listG, strJ, store, jI, strE, key.k(), linkedHashMap));
        }
        return arrayList;
    }
}
