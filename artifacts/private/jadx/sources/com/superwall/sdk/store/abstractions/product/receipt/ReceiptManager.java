package com.superwall.sdk.store.abstractions.product.receipt;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.z;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.superwall.sdk.billing.Billing;
import com.superwall.sdk.dependencies.ExperimentalPropertiesFactory;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.misc.IOScope;
import com.superwall.sdk.models.entitlements.SubscriptionStatus;
import com.superwall.sdk.store.abstractions.product.StoreProduct;
import com.superwall.sdk.store.abstractions.product.SubscriptionPeriod;
import com.superwall.sdk.store.coordinator.ProductsFetcher;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nReceiptManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReceiptManager.kt\ncom/superwall/sdk/store/abstractions/product/receipt/ReceiptManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n1557#2:132\n1628#2,3:133\n1368#2:136\n1454#2,5:137\n1557#2:142\n1628#2,3:143\n1948#2,14:146\n756#2,10:160\n295#2,2:170\n*S KotlinDebug\n*F\n+ 1 ReceiptManager.kt\ncom/superwall/sdk/store/abstractions/product/receipt/ReceiptManager\n*L\n34#1:132\n34#1:133,3\n40#1:136\n40#1:137,5\n42#1:142\n42#1:143,3\n64#1:146,14\n107#1:160,10\n127#1:170,2\n*E\n"})
public final class ReceiptManager implements ExperimentalPropertiesFactory {

    @NotNull
    private Set<InAppPurchase> _purchases;

    @NotNull
    private final Billing billing;

    @Nullable
    private ProductsFetcher delegate;

    @NotNull
    private final IOScope ioScope;

    @NotNull
    private final k0<Map<String, Object>> latestSubscriptionState;

    @Nullable
    private Set<String> purchasedSubscriptionGroupIds;

    @Nullable
    private Function1<? super Boolean, Unit> receiptRefreshCompletion;

    /* JADX INFO: renamed from: com.superwall.sdk.store.abstractions.product.receipt.ReceiptManager$lastSubscriptionProperties$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.store.abstractions.product.receipt.ReceiptManager", f = "ReceiptManager.kt", i = {0, 1, 1, 1, 1}, l = {63, com.planner5d.library.engine.input.f.b.f160725s}, m = "lastSubscriptionProperties", n = {"this", "this", FirebaseAnalytics.c.D, "timeSincePurchase", "latestSubscriptionWillAutoRenew"}, s = {"L$0", "L$0", "L$1", "J$0", "Z$0"})
    static final class AnonymousClass1 extends d {
        long J$0;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReceiptManager.this.lastSubscriptionProperties(this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.abstractions.product.receipt.ReceiptManager$loadPurchasedProducts$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.store.abstractions.product.receipt.ReceiptManager", f = "ReceiptManager.kt", i = {0}, l = {39, 43}, m = "loadPurchasedProducts", n = {"this"}, s = {"L$0"})
    static final class C27481 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C27481(kotlin.coroutines.d<? super C27481> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReceiptManager.this.loadPurchasedProducts(this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.abstractions.product.receipt.ReceiptManager$refreshReceipt$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.store.abstractions.product.receipt.ReceiptManager$refreshReceipt$1", f = "ReceiptManager.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    static final class C27491 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        Object L$0;
        int label;

        C27491(kotlin.coroutines.d<? super C27491> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return ReceiptManager.this.new C27491(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            k0 k0Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                k0 k0Var2 = ReceiptManager.this.latestSubscriptionState;
                ReceiptManager receiptManager = ReceiptManager.this;
                this.L$0 = k0Var2;
                this.label = 1;
                Object objLastSubscriptionProperties = receiptManager.lastSubscriptionProperties(this);
                if (objLastSubscriptionProperties == objL) {
                    return objL;
                }
                obj = objLastSubscriptionProperties;
                k0Var = k0Var2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k0Var = (k0) this.L$0;
                ResultKt.m(obj);
            }
            k0Var.setValue(obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C27491) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public ReceiptManager(@Nullable ProductsFetcher productsFetcher, @NotNull Billing billing, @NotNull IOScope ioScope) {
        Intrinsics.checkNotNullParameter(billing, "billing");
        Intrinsics.checkNotNullParameter(ioScope, "ioScope");
        this.delegate = productsFetcher;
        this.billing = billing;
        this.ioScope = ioScope;
        this._purchases = new LinkedHashSet();
        this.latestSubscriptionState = b1.a(MapsKt.emptyMap());
        refreshReceipt();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    @NotNull
    public final LatestPeriodType determineLatestPeriodType(@NotNull Purchase purchase, @NotNull StoreProduct productDetails) {
        ?? EmptyList;
        z.d dVarF;
        List<z.c> listA;
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(productDetails, "productDetails");
        z.f selectedOffer = productDetails.getRawStoreProduct().getSelectedOffer();
        if (selectedOffer == null || (dVarF = selectedOffer.f()) == null || (listA = dVarF.a()) == null) {
            EmptyList = CollectionsKt.emptyList();
        } else {
            EmptyList = new ArrayList();
            boolean z10 = false;
            for (Object obj : listA) {
                if (z10) {
                    EmptyList.add(obj);
                } else if (((z.c) obj).d() != 0) {
                    EmptyList.add(obj);
                    z10 = true;
                }
            }
        }
        Date trialPeriodEndDate = productDetails.getTrialPeriodEndDate();
        if ((trialPeriodEndDate != null ? trialPeriodEndDate.getTime() : 0L) > System.currentTimeMillis()) {
            return LatestPeriodType.TRIAL;
        }
        if (EmptyList.size() <= 1 || ((z.c) CollectionsKt.first((List) EmptyList)).d() >= ((z.c) CollectionsKt.last((List) EmptyList)).d()) {
            return purchase.h() == 0 ? LatestPeriodType.REVOKED : LatestPeriodType.SUBSCRIPTION;
        }
        return LatestPeriodType.PROMOTIONAL;
    }

    @Override // com.superwall.sdk.dependencies.ExperimentalPropertiesFactory
    @NotNull
    public Map<String, Object> experimentalProperties() {
        return this.latestSubscriptionState.getValue();
    }

    @Nullable
    public final Set<String> getPurchasedSubscriptionGroupIds() {
        return this.purchasedSubscriptionGroupIds;
    }

    @NotNull
    public final Set<String> getPurchases() {
        Set<InAppPurchase> set = this._purchases;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((InAppPurchase) it.next()).getProductIdentifier());
        }
        return CollectionsKt.toSet(arrayList);
    }

    public final boolean hasPurchasedProduct(@NotNull String productId) {
        Object next;
        Intrinsics.checkNotNullParameter(productId, "productId");
        Iterator<T> it = this._purchases.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((InAppPurchase) next).getProductIdentifier(), productId));
        return next != null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:41:0x0102  */
    /* JADX WARN: Code duplicated, block: B:47:0x0116  */
    /* JADX WARN: Code duplicated, block: B:49:0x011e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0126  */
    /* JADX WARN: Code duplicated, block: B:54:0x012c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0139  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object lastSubscriptionProperties(@NotNull kotlin.coroutines.d<? super Map<String, ? extends Object>> dVar) {
        AnonymousClass1 anonymousClass1;
        Purchase purchase;
        ReceiptManager receiptManager;
        boolean z10;
        long j10;
        StoreProduct storeProduct;
        SubscriptionPeriod subscriptionPeriod;
        long toMillis;
        Object obj;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object objQueryAllPurchases = anonymousClass1.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.m(objQueryAllPurchases);
            Billing billing = this.billing;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objQueryAllPurchases = billing.queryAllPurchases(anonymousClass1);
            if (objQueryAllPurchases != objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            this = (ReceiptManager) anonymousClass1.L$0;
            ResultKt.m(objQueryAllPurchases);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = anonymousClass1.Z$0;
            j10 = anonymousClass1.J$0;
            purchase = (Purchase) anonymousClass1.L$1;
            receiptManager = (ReceiptManager) anonymousClass1.L$0;
            ResultKt.m(objQueryAllPurchases);
        }
        storeProduct = (StoreProduct) CollectionsKt.firstOrNull((Iterable) objQueryAllPurchases);
        if (storeProduct == null) {
            return MapsKt.emptyMap();
        }
        subscriptionPeriod = storeProduct.getRawStoreProduct().getSubscriptionPeriod();
        if (subscriptionPeriod != null) {
            toMillis = subscriptionPeriod.getToMillis();
        } else {
            toMillis = 0;
        }
        if (purchase.h() != 2 && purchase.o()) {
            obj = LatestSubscriptionState.GRACE_PERIOD;
        } else if (purchase.h() != 1 && j10 > toMillis) {
            obj = LatestSubscriptionState.EXPIRED;
        } else if (purchase.h() == 1 || !purchase.o() || j10 >= toMillis) {
            obj = SubscriptionStatus.Unknown.INSTANCE;
        } else {
            obj = LatestSubscriptionState.SUBSCRIBED;
        }
        return MapsKt.mapOf(TuplesKt.to("latestSubscriptionPeriodType", receiptManager.determineLatestPeriodType(purchase, storeProduct)), TuplesKt.to("latestSubscriptionWillAutoRenew", kotlin.coroutines.jvm.internal.b.a(z10)), TuplesKt.to("latestSubscriptionState", obj));
        Iterator it = ((Iterable) objQueryAllPurchases).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long jI = ((Purchase) next).i();
            do {
                Object next2 = it.next();
                long jI2 = ((Purchase) next2).i();
                if (jI < jI2) {
                    next = next2;
                    jI = jI2;
                }
            } while (it.hasNext());
        }
        purchase = (Purchase) next;
        long jCurrentTimeMillis = System.currentTimeMillis() - purchase.i();
        boolean zO = purchase.o();
        List<String> listG = purchase.g();
        Intrinsics.checkNotNullExpressionValue(listG, "getProducts(...)");
        Billing billing2 = this.billing;
        Set<String> set = CollectionsKt.toSet(listG);
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = purchase;
        anonymousClass1.J$0 = jCurrentTimeMillis;
        anonymousClass1.Z$0 = zO;
        anonymousClass1.label = 2;
        Object objAwaitGetProducts = billing2.awaitGetProducts(set, anonymousClass1);
        if (objAwaitGetProducts != objL) {
            receiptManager = this;
            z10 = zO;
            objQueryAllPurchases = objAwaitGetProducts;
            j10 = jCurrentTimeMillis;
            storeProduct = (StoreProduct) CollectionsKt.firstOrNull((Iterable) objQueryAllPurchases);
            if (storeProduct == null) {
                return MapsKt.emptyMap();
            }
            subscriptionPeriod = storeProduct.getRawStoreProduct().getSubscriptionPeriod();
            if (subscriptionPeriod != null) {
                toMillis = subscriptionPeriod.getToMillis();
            } else {
                toMillis = 0;
            }
            if (purchase.h() != 2) {
                if (purchase.h() != 1) {
                    if (purchase.h() == 1) {
                        obj = SubscriptionStatus.Unknown.INSTANCE;
                    } else {
                        obj = SubscriptionStatus.Unknown.INSTANCE;
                    }
                } else if (purchase.h() == 1) {
                    obj = SubscriptionStatus.Unknown.INSTANCE;
                } else {
                    obj = SubscriptionStatus.Unknown.INSTANCE;
                }
            } else if (purchase.h() != 1) {
                if (purchase.h() == 1) {
                    obj = SubscriptionStatus.Unknown.INSTANCE;
                } else {
                    obj = SubscriptionStatus.Unknown.INSTANCE;
                }
            } else if (purchase.h() == 1) {
                obj = SubscriptionStatus.Unknown.INSTANCE;
            } else {
                obj = SubscriptionStatus.Unknown.INSTANCE;
            }
            return MapsKt.mapOf(TuplesKt.to("latestSubscriptionPeriodType", receiptManager.determineLatestPeriodType(purchase, storeProduct)), TuplesKt.to("latestSubscriptionWillAutoRenew", kotlin.coroutines.jvm.internal.b.a(z10)), TuplesKt.to("latestSubscriptionState", obj));
        }
        return objL;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ce, code lost:
    
        if (r11 == r1) goto L32;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadPurchasedProducts(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.util.Set<com.superwall.sdk.store.abstractions.product.StoreProduct>> r11) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.store.abstractions.product.receipt.ReceiptManager.loadPurchasedProducts(kotlin.coroutines.d):java.lang.Object");
    }

    public final void refreshReceipt() {
        Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.receipts, "Refreshing receipts", null, null, 24, null);
        k.f(this.ioScope, null, null, new C27491(null), 3, null);
    }

    public final void setPurchasedSubscriptionGroupIds(@Nullable Set<String> set) {
        this.purchasedSubscriptionGroupIds = set;
    }

    public /* synthetic */ ReceiptManager(ProductsFetcher productsFetcher, Billing billing, IOScope iOScope, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(productsFetcher, billing, (i10 & 4) != 0 ? new IOScope(null, 1, null) : iOScope);
    }
}
