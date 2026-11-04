package com.superwall.sdk.billing;

import android.content.Context;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.d0;
import com.superwall.sdk.delegate.InternalPurchaseResult;
import com.superwall.sdk.dependencies.HasExternalPurchaseControllerFactory;
import com.superwall.sdk.dependencies.HasInternalPurchaseControllerFactory;
import com.superwall.sdk.dependencies.OptionsFactory;
import com.superwall.sdk.dependencies.StoreTransactionFactory;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.misc.AppLifecycleObserver;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.misc.IOScope;
import com.superwall.sdk.store.abstractions.product.StoreProduct;
import com.superwall.sdk.store.abstractions.transactions.StoreTransaction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.z0;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nGoogleBillingWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleBillingWrapper.kt\ncom/superwall/sdk/billing/GoogleBillingWrapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,679:1\n1#2:680\n1#2:691\n1611#3,9:681\n1863#3:690\n1864#3:692\n1620#3:693\n1557#3:694\n1628#3,3:695\n1863#3:698\n1864#3:706\n1062#3:712\n1557#3:713\n1628#3,3:714\n381#4,7:699\n17#5:707\n19#5:711\n46#6:708\n51#6:710\n105#7:709\n*S KotlinDebug\n*F\n+ 1 GoogleBillingWrapper.kt\ncom/superwall/sdk/billing/GoogleBillingWrapper\n*L\n192#1:691\n192#1:681,9\n192#1:690\n192#1:692\n192#1:693\n208#1:694\n208#1:695,3\n259#1:698\n259#1:706\n617#1:712\n619#1:713\n619#1:714,3\n265#1:699,7\n566#1:707\n566#1:711\n566#1:708\n566#1:710\n566#1:709\n*E\n"})
public final class GoogleBillingWrapper implements d0, com.android.billingclient.api.j, Billing {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final ConcurrentHashMap<String, Either<StoreProduct, Throwable>> productsCache = new ConcurrentHashMap<>();

    @NotNull
    private final String IN_APP_BILLING_LESS_THAN_3_ERROR_MESSAGE;

    @NotNull
    private final AppLifecycleObserver appLifecycleObserver;

    @Nullable
    private volatile com.android.billingclient.api.h billingClient;

    @NotNull
    private final Context context;

    @NotNull
    private final Factory factory;

    @NotNull
    private final IOScope ioScope;

    @NotNull
    private final k0<InternalPurchaseResult> purchaseResults;
    private long reconnectMilliseconds;
    private boolean reconnectionAlreadyScheduled;

    @NotNull
    private final ConcurrentLinkedQueue<Pair<Function1<BillingError, Unit>, Long>> serviceRequests;

    @NotNull
    private final Handler threadHandler;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public interface Factory extends HasExternalPurchaseControllerFactory, HasInternalPurchaseControllerFactory, OptionsFactory {
    }

    public static final class Handler {

        @NotNull
        private final s0 scope;

        public Handler(@NotNull s0 scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            this.scope = scope;
        }

        @NotNull
        public final s0 getScope() {
            return this.scope;
        }

        public final void post(@NotNull Function0<Unit> action) {
            Intrinsics.checkNotNullParameter(action, "action");
            kotlinx.coroutines.k.f(this.scope, null, null, new GoogleBillingWrapper$Handler$post$1(action, null), 3, null);
        }

        public final void postDelayed(@NotNull Function0<Unit> action, long j10) {
            Intrinsics.checkNotNullParameter(action, "action");
            int i10 = 0 & 3;
            kotlinx.coroutines.k.f(this.scope, null, null, new GoogleBillingWrapper$Handler$postDelayed$1(j10, action, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.billing.GoogleBillingWrapper$getLatestTransaction$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.billing.GoogleBillingWrapper", f = "GoogleBillingWrapper.kt", i = {0, 0}, l = {567, 572}, m = "getLatestTransaction", n = {"this", "factory"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
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
            return GoogleBillingWrapper.this.getLatestTransaction(null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.billing.GoogleBillingWrapper$onPurchasesUpdated$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.billing.GoogleBillingWrapper$onPurchasesUpdated$1", f = "GoogleBillingWrapper.kt", i = {}, l = {529}, m = "invokeSuspend", n = {}, s = {})
    static final class C26271 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Purchase $purchase;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26271(Purchase purchase, kotlin.coroutines.d<? super C26271> dVar) {
            super(2, dVar);
            this.$purchase = purchase;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return GoogleBillingWrapper.this.new C26271(this.$purchase, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                k0<InternalPurchaseResult> purchaseResults = GoogleBillingWrapper.this.getPurchaseResults();
                InternalPurchaseResult.Purchased purchased = new InternalPurchaseResult.Purchased(this.$purchase);
                this.label = 1;
                if (purchaseResults.emit(purchased, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C26271) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.billing.GoogleBillingWrapper$onPurchasesUpdated$2, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.billing.GoogleBillingWrapper$onPurchasesUpdated$2", f = "GoogleBillingWrapper.kt", i = {}, l = {536}, m = "invokeSuspend", n = {}, s = {})
    static final class C26282 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        C26282(kotlin.coroutines.d<? super C26282> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return GoogleBillingWrapper.this.new C26282(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                k0<InternalPurchaseResult> purchaseResults = GoogleBillingWrapper.this.getPurchaseResults();
                InternalPurchaseResult.Cancelled cancelled = InternalPurchaseResult.Cancelled.INSTANCE;
                this.label = 1;
                if (purchaseResults.emit(cancelled, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C26282) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.billing.GoogleBillingWrapper$onPurchasesUpdated$3, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.billing.GoogleBillingWrapper$onPurchasesUpdated$3", f = "GoogleBillingWrapper.kt", i = {}, l = {546}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ com.android.billingclient.api.n $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(com.android.billingclient.api.n nVar, kotlin.coroutines.d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$result = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return GoogleBillingWrapper.this.new AnonymousClass3(this.$result, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                k0<InternalPurchaseResult> purchaseResults = GoogleBillingWrapper.this.getPurchaseResults();
                InternalPurchaseResult.Failed failed = new InternalPurchaseResult.Failed(new Exception(String.valueOf(this.$result.b())));
                this.label = 1;
                if (purchaseResults.emit(failed, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass3) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.billing.GoogleBillingWrapper$queryAllPurchases$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.billing.GoogleBillingWrapper", f = "GoogleBillingWrapper.kt", i = {0, 1}, l = {128, 129}, m = "queryAllPurchases", n = {"this", "apps"}, s = {"L$0", "L$0"})
    static final class C26291 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C26291(kotlin.coroutines.d<? super C26291> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GoogleBillingWrapper.this.queryAllPurchases(this);
        }
    }

    public GoogleBillingWrapper(@NotNull Context context, @NotNull IOScope ioScope, @NotNull AppLifecycleObserver appLifecycleObserver, @NotNull Factory factory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ioScope, "ioScope");
        Intrinsics.checkNotNullParameter(appLifecycleObserver, "appLifecycleObserver");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.context = context;
        this.ioScope = ioScope;
        this.appLifecycleObserver = appLifecycleObserver;
        this.factory = factory;
        this.threadHandler = new Handler(ioScope);
        this.serviceRequests = new ConcurrentLinkedQueue<>();
        this.reconnectMilliseconds = 1000L;
        this.purchaseResults = b1.a(null);
        this.IN_APP_BILLING_LESS_THAN_3_ERROR_MESSAGE = "Google Play In-app Billing API version is less than 3";
        startConnectionOnMainThread$default(this, 0L, 1, null);
    }

    private final void dispatch(Function0<Unit> function0) {
        this.threadHandler.post(function0);
    }

    private final void executePendingRequests() {
        Pair<Function1<BillingError, Unit>, Long> pairPoll;
        synchronized (this) {
            while (true) {
                try {
                    com.android.billingclient.api.h hVar = this.billingClient;
                    if (hVar == null || !hVar.k() || (pairPoll = this.serviceRequests.poll()) == null) {
                        break;
                    }
                    final Function1<BillingError, Unit> function1Component1 = pairPoll.component1();
                    Long lComponent2 = pairPoll.component2();
                    if (lComponent2 != null) {
                        this.threadHandler.postDelayed(new Function0() { // from class: com.superwall.sdk.billing.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return GoogleBillingWrapper.executePendingRequests$lambda$3$lambda$2$lambda$0(function1Component1);
                            }
                        }, lComponent2.longValue());
                    } else {
                        this.threadHandler.post(new Function0() { // from class: com.superwall.sdk.billing.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return GoogleBillingWrapper.executePendingRequests$lambda$3$lambda$2$lambda$1(function1Component1);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Unit unit = Unit.f312394a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit executePendingRequests$lambda$3$lambda$2$lambda$0(Function1 function1) {
        function1.invoke(null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit executePendingRequests$lambda$3$lambda$2$lambda$1(Function1 function1) {
        function1.invoke(null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void executeRequestOnUIThread(Long l10, Function1<? super BillingError, Unit> function1) {
        try {
            this.serviceRequests.add(TuplesKt.to(function1, l10));
            com.android.billingclient.api.h hVar = this.billingClient;
            if (hVar == null || hVar.k()) {
                executePendingRequests();
            } else {
                startConnectionOnMainThread$default(this, 0L, 1, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    static /* synthetic */ void executeRequestOnUIThread$default(GoogleBillingWrapper googleBillingWrapper, Long l10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = null;
        }
        googleBillingWrapper.executeRequestOnUIThread(l10, function1);
    }

    private final void getProducts(Set<String> set, final GetStoreProductsCallback getStoreProductsCallback) {
        Set<String> of2 = SetsKt.setOf((Object[]) new String[]{"subs", "inapp"});
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            DecomposedProductIds decomposedProductIdsFrom = DecomposedProductIds.Companion.from((String) it.next());
            String subscriptionId = decomposedProductIdsFrom.getSubscriptionId();
            linkedHashSet.add(subscriptionId);
            List<DecomposedProductIds> arrayList = linkedHashMap.get(subscriptionId);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(subscriptionId, arrayList);
            }
            arrayList.add(decomposedProductIdsFrom);
        }
        getProductsOfTypes(linkedHashSet, of2, SetsKt.emptySet(), linkedHashMap, new GetStoreProductsCallback() { // from class: com.superwall.sdk.billing.GoogleBillingWrapper.getProducts.2
            @Override // com.superwall.sdk.billing.GetStoreProductsCallback
            public void onError(BillingError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                getStoreProductsCallback.onError(error);
            }

            @Override // com.superwall.sdk.billing.GetStoreProductsCallback
            public void onReceived(Set<StoreProduct> storeProducts) {
                Intrinsics.checkNotNullParameter(storeProducts, "storeProducts");
                getStoreProductsCallback.onReceived(storeProducts);
            }
        });
    }

    private final void getProductsOfTypes(final Set<String> set, Set<String> set2, final Set<StoreProduct> set3, final Map<String, List<DecomposedProductIds>> map, final GetStoreProductsCallback getStoreProductsCallback) {
        final Set mutableSet = CollectionsKt.toMutableSet(set2);
        String str = (String) CollectionsKt.firstOrNull(mutableSet);
        if (str != null) {
            mutableSet.remove(str);
        } else {
            str = null;
        }
        if (str == null) {
            getStoreProductsCallback.onReceived(set3);
        } else {
            queryProductDetailsAsync(str, set, map, new Function1() { // from class: com.superwall.sdk.billing.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoogleBillingWrapper.getProductsOfTypes$lambda$18$lambda$15(this.f267374a, set, mutableSet, set3, map, getStoreProductsCallback, (List) obj);
                }
            }, new Function1() { // from class: com.superwall.sdk.billing.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GoogleBillingWrapper.getProductsOfTypes$lambda$18$lambda$17(this.f267380a, getStoreProductsCallback, (BillingError) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getProductsOfTypes$lambda$18$lambda$15(final GoogleBillingWrapper googleBillingWrapper, final Set set, final Set set2, final Set set3, final Map map, final GetStoreProductsCallback getStoreProductsCallback, final List storeProducts) {
        Intrinsics.checkNotNullParameter(storeProducts, "storeProducts");
        googleBillingWrapper.dispatch(new Function0() { // from class: com.superwall.sdk.billing.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GoogleBillingWrapper.getProductsOfTypes$lambda$18$lambda$15$lambda$14(this.f267367a, set, set2, set3, storeProducts, map, getStoreProductsCallback);
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getProductsOfTypes$lambda$18$lambda$15$lambda$14(GoogleBillingWrapper googleBillingWrapper, Set set, Set set2, Set set3, List list, Map map, GetStoreProductsCallback getStoreProductsCallback) {
        googleBillingWrapper.getProductsOfTypes(set, set2, SetsKt.plus(set3, (Iterable) list), map, getStoreProductsCallback);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getProductsOfTypes$lambda$18$lambda$17(GoogleBillingWrapper googleBillingWrapper, final GetStoreProductsCallback getStoreProductsCallback, final BillingError it) {
        Intrinsics.checkNotNullParameter(it, "it");
        googleBillingWrapper.dispatch(new Function0() { // from class: com.superwall.sdk.billing.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GoogleBillingWrapper.getProductsOfTypes$lambda$18$lambda$17$lambda$16(getStoreProductsCallback, it);
            }
        });
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getProductsOfTypes$lambda$18$lambda$17$lambda$16(GetStoreProductsCallback getStoreProductsCallback, BillingError billingError) {
        getStoreProductsCallback.onError(billingError);
        return Unit.f312394a;
    }

    private final boolean getShouldFinishTransactions() {
        return !this.factory.makeSuperwallOptions().getShouldObservePurchases();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x010a  */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x010a, please report this as an issue */
    public static final Unit onBillingSetupFinished$lambda$20(com.android.billingclient.api.n nVar, GoogleBillingWrapper googleBillingWrapper) {
        BillingError.BillingNotAvailable billingNotAvailable;
        int iB = nVar.b();
        if (iB != 12) {
            switch (iB) {
                case -2:
                case 3:
                    String str = "DebugMessage: " + nVar.a() + " ErrorCode: " + nVar.b() + ".";
                    if (Intrinsics.areEqual(nVar.a(), googleBillingWrapper.IN_APP_BILLING_LESS_THAN_3_ERROR_MESSAGE)) {
                        billingNotAvailable = new BillingError.BillingNotAvailable("Billing is not available in this device. Make sure there's an account configured in Play Store. Reopen the Play Store or clean its caches if this keeps happening. Original error message: " + str);
                    } else {
                        billingNotAvailable = new BillingError.BillingNotAvailable("Billing is not available in this device. Original error message: " + str);
                    }
                    Logger logger = Logger.INSTANCE;
                    LogLevel logLevel = LogLevel.error;
                    LogScope logScope = LogScope.productsManager;
                    String message = billingNotAvailable.getMessage();
                    if (message == null) {
                        message = "Billing is not available in this device. " + nVar.a();
                    }
                    Logger.debug$default(logger, logLevel, logScope, message, null, null, 24, null);
                    googleBillingWrapper.sendErrorsToAllPendingRequests(billingNotAvailable);
                    break;
                case -1:
                case 1:
                case 2:
                case 6:
                    Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.productsManager, "Billing client error, retrying: " + nVar.b(), null, null, 24, null);
                    googleBillingWrapper.retryBillingServiceConnectionWithExponentialBackoff();
                    break;
                case 0:
                    Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.productsManager, "Billing client connected", null, null, 24, null);
                    googleBillingWrapper.executePendingRequests();
                    googleBillingWrapper.reconnectMilliseconds = 1000L;
                    googleBillingWrapper.trackProductDetailsNotSupportedIfNeeded();
                    break;
                case 4:
                case 7:
                case 8:
                    Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.productsManager, "Billing client error, item not supported or unavailable: " + nVar.b(), null, null, 24, null);
                    break;
                case 5:
                    Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.productsManager, "Billing client error, developer error: " + nVar.b(), null, null, 24, null);
                    break;
            }
        } else {
            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.productsManager, "Billing client error, retrying: " + nVar.b(), null, null, 24, null);
            googleBillingWrapper.retryBillingServiceConnectionWithExponentialBackoff();
        }
        return Unit.f312394a;
    }

    private final void queryProductDetailsAsync(String str, Set<String> set, Map<String, List<DecomposedProductIds>> map, Function1<? super List<StoreProduct>, Unit> function1, Function1<? super BillingError, Unit> function2) {
        Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.productsManager, "Requesting products from the store with identifiers: " + CollectionsKt.joinToString$default(set, null, null, null, 0, null, null, 63, null), null, null, 24, null);
        BillingClientUseCase.run$default(new QueryProductDetailsUseCase(new QueryProductDetailsUseCaseParams(set, map, str, this.appLifecycleObserver.isInBackground().getValue().booleanValue()), function1, function2, new GoogleBillingWrapper$queryProductDetailsAsync$useCase$1(this), new GoogleBillingWrapper$queryProductDetailsAsync$useCase$2(this)), 0L, 1, null);
    }

    private final void retryBillingServiceConnectionWithExponentialBackoff() {
        if (this.reconnectionAlreadyScheduled) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.productsManager, "Billing client retry already scheduled.", null, null, 24, null);
            return;
        }
        Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.productsManager, "Billing client disconnected, retrying in " + this.reconnectMilliseconds + " milliseconds", null, null, 24, null);
        this.reconnectionAlreadyScheduled = true;
        startConnectionOnMainThread(this.reconnectMilliseconds);
        this.reconnectMilliseconds = Math.min(this.reconnectMilliseconds * ((long) 2), 16000L);
    }

    private final synchronized void sendErrorsToAllPendingRequests(final BillingError billingError) {
        while (true) {
            try {
                Pair<Function1<BillingError, Unit>, Long> pairPoll = this.serviceRequests.poll();
                if (pairPoll != null) {
                    final Function1<BillingError, Unit> function1Component1 = pairPoll.component1();
                    this.threadHandler.post(new Function0() { // from class: com.superwall.sdk.billing.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GoogleBillingWrapper.sendErrorsToAllPendingRequests$lambda$26$lambda$25(function1Component1, billingError);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendErrorsToAllPendingRequests$lambda$26$lambda$25(Function1 function1, BillingError billingError) {
        function1.invoke(billingError);
        return Unit.f312394a;
    }

    public static /* synthetic */ void startConnectionOnMainThread$default(GoogleBillingWrapper googleBillingWrapper, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        googleBillingWrapper.startConnectionOnMainThread(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startConnectionOnMainThread$lambda$4(GoogleBillingWrapper googleBillingWrapper) {
        googleBillingWrapper.startConnection();
        return Unit.f312394a;
    }

    private final void trackProductDetailsNotSupportedIfNeeded() {
        com.android.billingclient.api.h hVar = this.billingClient;
        com.android.billingclient.api.n nVarJ = hVar != null ? hVar.j(com.android.billingclient.api.h.d.f89085m0) : null;
        if (nVarJ != null && nVarJ.b() == -2) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.productsManager, "Product details not supported: " + nVarJ.b() + " " + nVarJ.a(), null, null, 24, null);
        }
    }

    @Override // com.superwall.sdk.billing.Billing
    public /* synthetic */ Object awaitGetProducts(Set set, kotlin.coroutines.d dVar) throws Throwable {
        StoreProduct storeProduct;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Either<StoreProduct, Throwable> either = productsCache.get((String) it.next());
            if (either == null) {
                storeProduct = null;
            } else {
                if (!(either instanceof Either.Success)) {
                    if (either instanceof Either.Failure) {
                        throw ((Either.Failure) either).getError();
                    }
                    throw new kotlin.k0();
                }
                storeProduct = (StoreProduct) ((Either.Success) either).getValue();
            }
            if (storeProduct != null) {
                arrayList.add(storeProduct);
            }
        }
        final Set set2 = CollectionsKt.toSet(arrayList);
        if (set2.size() == set.size()) {
            return set2;
        }
        Set set3 = set2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set3, 10));
        Iterator it2 = set3.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((StoreProduct) it2.next()).getFullIdentifier());
        }
        final Set<String> setMinus = SetsKt.minus(set, (Iterable) CollectionsKt.toSet(arrayList2));
        final kotlin.coroutines.j jVar = new kotlin.coroutines.j(kotlin.coroutines.intrinsics.b.e(dVar));
        getProducts(setMinus, new GetStoreProductsCallback() { // from class: com.superwall.sdk.billing.GoogleBillingWrapper$awaitGetProducts$2$1
            @Override // com.superwall.sdk.billing.GetStoreProductsCallback
            public void onError(BillingError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                Iterator<T> it3 = setMinus.iterator();
                while (it3.hasNext()) {
                    GoogleBillingWrapper.productsCache.put((String) it3.next(), new Either.Failure(error));
                }
                kotlin.coroutines.d<Set<StoreProduct>> dVar2 = jVar;
                Result.a aVar = Result.Companion;
                dVar2.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(error)));
            }

            @Override // com.superwall.sdk.billing.GetStoreProductsCallback
            public void onReceived(Set<StoreProduct> storeProducts) {
                Intrinsics.checkNotNullParameter(storeProducts, "storeProducts");
                Set<StoreProduct> set4 = storeProducts;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set4, 10));
                for (StoreProduct storeProduct2 : set4) {
                    GoogleBillingWrapper.productsCache.put(storeProduct2.getFullIdentifier(), new Either.Success(storeProduct2));
                    arrayList3.add(storeProduct2.getFullIdentifier());
                }
                Set<String> set5 = setMinus;
                ArrayList<String> arrayList4 = new ArrayList();
                for (Object obj : set5) {
                    if (!arrayList3.contains((String) obj)) {
                        arrayList4.add(obj);
                    }
                }
                for (String str : arrayList4) {
                    GoogleBillingWrapper.productsCache.put(str, new Either.Failure(new Exception("Failed to query product details for " + str)));
                }
                Set setPlus = SetsKt.plus((Set) set2, (Iterable) set4);
                kotlin.coroutines.d<Set<StoreProduct>> dVar2 = jVar;
                Result.a aVar = Result.Companion;
                dVar2.resumeWith(Result.m785constructorimpl(setPlus));
            }
        });
        Object objA = jVar.a();
        if (objA == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objA;
    }

    @NotNull
    public final AppLifecycleObserver getAppLifecycleObserver() {
        return this.appLifecycleObserver;
    }

    @Nullable
    public final synchronized com.android.billingclient.api.h getBillingClient() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.billingClient;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final Factory getFactory() {
        return this.factory;
    }

    @NotNull
    public final String getIN_APP_BILLING_LESS_THAN_3_ERROR_MESSAGE$superwall_release() {
        return this.IN_APP_BILLING_LESS_THAN_3_ERROR_MESSAGE;
    }

    @NotNull
    public final IOScope getIoScope() {
        return this.ioScope;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.superwall.sdk.billing.Billing
    @Nullable
    public Object getLatestTransaction(@NotNull StoreTransactionFactory storeTransactionFactory, @NotNull kotlin.coroutines.d<? super StoreTransaction> dVar) {
        AnonymousClass1 anonymousClass1;
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
        Object objW0 = anonymousClass1.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.m(objW0);
            final z0 z0VarN = kotlinx.coroutines.flow.k.n(getPurchaseResults());
            kotlinx.coroutines.flow.i<InternalPurchaseResult> iVar = new kotlinx.coroutines.flow.i<InternalPurchaseResult>() { // from class: com.superwall.sdk.billing.GoogleBillingWrapper$getLatestTransaction$$inlined$filter$1

                /* JADX INFO: renamed from: com.superwall.sdk.billing.GoogleBillingWrapper$getLatestTransaction$$inlined$filter$1$2, reason: invalid class name */
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 GoogleBillingWrapper.kt\ncom/superwall/sdk/billing/GoogleBillingWrapper\n*L\n1#1,49:1\n18#2:50\n19#2:52\n566#3:51\n*E\n"})
                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {
                    final /* synthetic */ kotlinx.coroutines.flow.j $this_unsafeFlow;

                    /* JADX INFO: renamed from: com.superwall.sdk.billing.GoogleBillingWrapper$getLatestTransaction$$inlined$filter$1$2$1, reason: invalid class name */
                    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.billing.GoogleBillingWrapper$getLatestTransaction$$inlined$filter$1$2", f = "GoogleBillingWrapper.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(kotlin.coroutines.d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(kotlinx.coroutines.flow.j jVar) {
                        this.$this_unsafeFlow = jVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                    @Override // kotlinx.coroutines.flow.j
                    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                        AnonymousClass1 anonymousClass1;
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
                        Object obj2 = anonymousClass1.result;
                        Object objL = kotlin.coroutines.intrinsics.b.l();
                        int i11 = anonymousClass1.label;
                        if (i11 == 0) {
                            ResultKt.m(obj2);
                            kotlinx.coroutines.flow.j jVar = this.$this_unsafeFlow;
                            if (((InternalPurchaseResult) obj) != null) {
                                anonymousClass1.label = 1;
                                if (jVar.emit(obj, anonymousClass1) == objL) {
                                    return objL;
                                }
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.m(obj2);
                        }
                        return Unit.f312394a;
                    }
                }

                @Override // kotlinx.coroutines.flow.i
                public Object collect(kotlinx.coroutines.flow.j<? super InternalPurchaseResult> jVar, kotlin.coroutines.d dVar2) {
                    Object objCollect = z0VarN.collect(new AnonymousClass2(jVar), dVar2);
                    return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
                }
            };
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = storeTransactionFactory;
            anonymousClass1.label = 1;
            objW0 = kotlinx.coroutines.flow.k.w0(iVar, anonymousClass1);
            if (objW0 != objL) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objW0);
            return objW0;
        }
        storeTransactionFactory = (StoreTransactionFactory) anonymousClass1.L$1;
        this = (GoogleBillingWrapper) anonymousClass1.L$0;
        ResultKt.m(objW0);
        InternalPurchaseResult internalPurchaseResult = (InternalPurchaseResult) objW0;
        if (!(internalPurchaseResult instanceof InternalPurchaseResult.Purchased) || !this.getShouldFinishTransactions()) {
            return null;
        }
        Purchase purchase = ((InternalPurchaseResult.Purchased) internalPurchaseResult).getPurchase();
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 2;
        Object objMakeStoreTransaction = storeTransactionFactory.makeStoreTransaction(purchase, anonymousClass1);
        return objMakeStoreTransaction == objL ? objL : objMakeStoreTransaction;
    }

    @Override // com.superwall.sdk.billing.Billing
    @NotNull
    public k0<InternalPurchaseResult> getPurchaseResults() {
        return this.purchaseResults;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0095  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:28:0x00de  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:37:0x0100  */
    /* JADX WARN: Code duplicated, block: B:38:0x0106  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00c7 -> B:26:0x00c8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object latestPurchase$superwall_release(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> r12) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.billing.GoogleBillingWrapper.latestPurchase$superwall_release(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // com.android.billingclient.api.j
    public void onBillingServiceDisconnected() {
        Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.productsManager, "Billing client disconnected", null, null, 24, null);
    }

    @Override // com.android.billingclient.api.j
    public void onBillingSetupFinished(@NotNull final com.android.billingclient.api.n billingResult) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.threadHandler.post(new Function0() { // from class: com.superwall.sdk.billing.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GoogleBillingWrapper.onBillingSetupFinished$lambda$20(billingResult, this);
            }
        });
    }

    @Override // com.android.billingclient.api.d0
    public void onPurchasesUpdated(@NotNull com.android.billingclient.api.n result, @Nullable List<Purchase> list) {
        Intrinsics.checkNotNullParameter(result, "result");
        Logger logger = Logger.INSTANCE;
        LogLevel logLevel = LogLevel.debug;
        LogScope logScope = LogScope.storeKitManager;
        Logger.debug$default(logger, logLevel, logScope, "onPurchasesUpdated: " + result, null, null, 24, null);
        if (result.b() != 0 || list == null) {
            if (result.b() == 1) {
                kotlinx.coroutines.k.f(t0.a(l1.c()), null, null, new C26282(null), 3, null);
                Logger.debug$default(logger, logLevel, logScope, "User cancelled purchase", null, null, 24, null);
                return;
            } else {
                kotlinx.coroutines.k.f(t0.a(l1.c()), null, null, new AnonymousClass3(result, null), 3, null);
                Logger.debug$default(logger, logLevel, logScope, "Purchase failed", null, null, 24, null);
                return;
            }
        }
        for (Purchase purchase : list) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.storeKitManager, "Purchase: " + purchase, null, null, 24, null);
            kotlinx.coroutines.k.f(t0.a(l1.c()), null, null, new C26271(purchase, null), 3, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[PHI: r7
      0x0071: PHI (r7v1 'this' com.superwall.sdk.billing.GoogleBillingWrapper) = 
      (r7v0 'this' com.superwall.sdk.billing.GoogleBillingWrapper A[IMMUTABLE_TYPE, THIS])
      (r7v5 'this' com.superwall.sdk.billing.GoogleBillingWrapper)
     binds: [B:17:0x0052, B:22:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x008e A[PHI: r7
      0x008e: PHI (r7v9 java.util.List) = (r7v4 java.util.List), (r7v10 java.util.List) binds: [B:27:0x007a, B:32:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        if (r8 == r1) goto L30;
     */
    @Override // com.superwall.sdk.billing.Billing
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object queryAllPurchases(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.util.List<? extends com.android.billingclient.api.Purchase>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.superwall.sdk.billing.GoogleBillingWrapper.C26291
            if (r0 == 0) goto L18
            r0 = r8
            r0 = r8
            r6 = 4
            com.superwall.sdk.billing.GoogleBillingWrapper$queryAllPurchases$1 r0 = (com.superwall.sdk.billing.GoogleBillingWrapper.C26291) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 2
            r3 = r1 & r2
            if (r3 == 0) goto L18
            r6 = 0
            int r1 = r1 - r2
            r6 = 4
            r0.label = r1
            goto L1d
        L18:
            com.superwall.sdk.billing.GoogleBillingWrapper$queryAllPurchases$1 r0 = new com.superwall.sdk.billing.GoogleBillingWrapper$queryAllPurchases$1
            r0.<init>(r8)
        L1d:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r6 = 7
            int r2 = r0.label
            r6 = 4
            r3 = 2
            r4 = 1
            r6 = r6 & r4
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L42
            if (r2 != r3) goto L39
            r6 = 6
            java.lang.Object r7 = r0.L$0
            java.util.List r7 = (java.util.List) r7
            kotlin.ResultKt.m(r8)
            goto L8a
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 1
            r7.<init>(r8)
            throw r7
        L42:
            java.lang.Object r7 = r0.L$0
            com.superwall.sdk.billing.GoogleBillingWrapper r7 = (com.superwall.sdk.billing.GoogleBillingWrapper) r7
            kotlin.ResultKt.m(r8)
            r6 = 4
            goto L65
        L4b:
            kotlin.ResultKt.m(r8)
            r6 = 6
            com.android.billingclient.api.h r8 = r7.billingClient
            r6 = 1
            if (r8 == 0) goto L71
            r0.L$0 = r7
            r0.label = r4
            r6 = 6
            java.lang.String r2 = "bpani"
            java.lang.String r2 = "inapp"
            r6 = 7
            java.lang.Object r8 = com.superwall.sdk.billing.GoogleBillingWrapperKt.queryType(r8, r2, r0)
            if (r8 != r1) goto L65
            goto L89
        L65:
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L6a
            goto L71
        L6a:
            r5 = r8
            r5 = r8
            r8 = r7
            r7 = r5
            r7 = r5
            r6 = 5
            goto L77
        L71:
            r6 = 1
            java.util.List r8 = kotlin.collections.CollectionsKt.emptyList()
            goto L6a
        L77:
            com.android.billingclient.api.h r8 = r8.billingClient
            r6 = 1
            if (r8 == 0) goto L8e
            r0.L$0 = r7
            r0.label = r3
            r6 = 4
            java.lang.String r2 = "subs"
            java.lang.Object r8 = com.superwall.sdk.billing.GoogleBillingWrapperKt.queryType(r8, r2, r0)
            if (r8 != r1) goto L8a
        L89:
            return r1
        L8a:
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L92
        L8e:
            java.util.List r8 = kotlin.collections.CollectionsKt.emptyList()
        L92:
            r6 = 0
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r6 = 2
            java.util.List r7 = kotlin.collections.CollectionsKt.plus(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.billing.GoogleBillingWrapper.queryAllPurchases(kotlin.coroutines.d):java.lang.Object");
    }

    public final synchronized void setBillingClient(@Nullable com.android.billingclient.api.h hVar) {
        try {
            this.billingClient = hVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void startConnection() {
        synchronized (this) {
            try {
                if (this.billingClient == null) {
                    this.billingClient = com.android.billingclient.api.h.m(this.context).g(this).d().a();
                }
                this.reconnectionAlreadyScheduled = false;
                com.android.billingclient.api.h hVar = this.billingClient;
                if (hVar != null) {
                    if (!hVar.k()) {
                        Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.productsManager, "Starting billing client", null, null, 24, null);
                        try {
                            hVar.w(this);
                        } catch (IllegalStateException e10) {
                            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.productsManager, "IllegalStateException when connecting to billing client: " + e10.getMessage(), null, null, 24, null);
                            sendErrorsToAllPendingRequests(BillingError.IllegalStateException.INSTANCE);
                        }
                    }
                    Unit unit = Unit.f312394a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void startConnectionOnMainThread(long j10) {
        this.threadHandler.postDelayed(new Function0() { // from class: com.superwall.sdk.billing.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GoogleBillingWrapper.startConnectionOnMainThread$lambda$4(this.f267364a);
            }
        }, j10);
    }

    public final void withConnectedClient(@NotNull Function1<? super com.android.billingclient.api.h, Unit> receivingFunction) {
        Intrinsics.checkNotNullParameter(receivingFunction, "receivingFunction");
        com.android.billingclient.api.h hVar = this.billingClient;
        if (hVar != null) {
            if (!hVar.k()) {
                hVar = null;
            }
            if (hVar != null) {
                receivingFunction.invoke(hVar);
                return;
            }
        }
        Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.productsManager, "Billing client not ready", null, null, 24, null);
    }
}
