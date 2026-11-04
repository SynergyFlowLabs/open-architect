package com.superwall.sdk.store;

import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.internal.TrackingKt;
import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import com.superwall.sdk.billing.Billing;
import com.superwall.sdk.billing.BillingError;
import com.superwall.sdk.billing.DecomposedProductIds;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.models.entitlements.Entitlement;
import com.superwall.sdk.models.events.EventData;
import com.superwall.sdk.models.paywall.Paywall;
import com.superwall.sdk.models.product.Offer;
import com.superwall.sdk.models.product.PlayStoreProduct;
import com.superwall.sdk.models.product.ProductItem;
import com.superwall.sdk.models.product.ProductVariable;
import com.superwall.sdk.paywall.request.PaywallRequest;
import com.superwall.sdk.store.abstractions.product.OfferType;
import com.superwall.sdk.store.abstractions.product.StoreProduct;
import com.superwall.sdk.store.abstractions.product.receipt.ReceiptManager;
import com.superwall.sdk.store.coordinator.ProductsFetcher;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nStoreManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreManager.kt\ncom/superwall/sdk/store/StoreManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,242:1\n1611#2,9:243\n1863#2:252\n1864#2:254\n1620#2:255\n1557#2:256\n1628#2,3:257\n360#2,7:260\n1#3:253\n1#3:267\n*S KotlinDebug\n*F\n+ 1 StoreManager.kt\ncom/superwall/sdk/store/StoreManager\n*L\n53#1:243,9\n53#1:252\n53#1:254\n53#1:255\n91#1:256\n91#1:257,3\n164#1:260,7\n53#1:253\n*E\n"})
public final class StoreManager implements ProductsFetcher, StoreKit {

    @NotNull
    private final Billing billing;

    @NotNull
    private Map<String, StoreProduct> productsByFullId;

    @NotNull
    private final InternalPurchaseController purchaseController;

    @NotNull
    private final f0 receiptManager$delegate;

    @NotNull
    private final Function2<InternalSuperwallEvent, kotlin.coroutines.d<? super Unit>, Object> track;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.superwall.sdk.store.StoreManager$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.store.StoreManager$1", f = "StoreManager.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends o implements Function2<InternalSuperwallEvent, kotlin.coroutines.d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternalSuperwallEvent internalSuperwallEvent, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(internalSuperwallEvent, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                InternalSuperwallEvent internalSuperwallEvent = (InternalSuperwallEvent) this.L$0;
                Superwall companion = Superwall.Companion.getInstance();
                this.label = 1;
                if (TrackingKt.track(companion, internalSuperwallEvent, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                ((Result) obj).j();
            }
            return Unit.f312394a;
        }
    }

    private static final class ProductProcessingResult {

        @NotNull
        private final Set<String> fullProductIdsToLoad;

        @NotNull
        private final List<ProductItem> productItems;

        @NotNull
        private final Map<String, StoreProduct> substituteProductsById;

        public ProductProcessingResult(@NotNull Set<String> fullProductIdsToLoad, @NotNull Map<String, StoreProduct> substituteProductsById, @NotNull List<ProductItem> productItems) {
            Intrinsics.checkNotNullParameter(fullProductIdsToLoad, "fullProductIdsToLoad");
            Intrinsics.checkNotNullParameter(substituteProductsById, "substituteProductsById");
            Intrinsics.checkNotNullParameter(productItems, "productItems");
            this.fullProductIdsToLoad = fullProductIdsToLoad;
            this.substituteProductsById = substituteProductsById;
            this.productItems = productItems;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProductProcessingResult copy$default(ProductProcessingResult productProcessingResult, Set set, Map map, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                set = productProcessingResult.fullProductIdsToLoad;
            }
            if ((i10 & 2) != 0) {
                map = productProcessingResult.substituteProductsById;
            }
            if ((i10 & 4) != 0) {
                list = productProcessingResult.productItems;
            }
            return productProcessingResult.copy(set, map, list);
        }

        @NotNull
        public final Set<String> component1() {
            return this.fullProductIdsToLoad;
        }

        @NotNull
        public final Map<String, StoreProduct> component2() {
            return this.substituteProductsById;
        }

        @NotNull
        public final List<ProductItem> component3() {
            return this.productItems;
        }

        @NotNull
        public final ProductProcessingResult copy(@NotNull Set<String> fullProductIdsToLoad, @NotNull Map<String, StoreProduct> substituteProductsById, @NotNull List<ProductItem> productItems) {
            Intrinsics.checkNotNullParameter(fullProductIdsToLoad, "fullProductIdsToLoad");
            Intrinsics.checkNotNullParameter(substituteProductsById, "substituteProductsById");
            Intrinsics.checkNotNullParameter(productItems, "productItems");
            return new ProductProcessingResult(fullProductIdsToLoad, substituteProductsById, productItems);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductProcessingResult)) {
                return false;
            }
            ProductProcessingResult productProcessingResult = (ProductProcessingResult) obj;
            return Intrinsics.areEqual(this.fullProductIdsToLoad, productProcessingResult.fullProductIdsToLoad) && Intrinsics.areEqual(this.substituteProductsById, productProcessingResult.substituteProductsById) && Intrinsics.areEqual(this.productItems, productProcessingResult.productItems);
        }

        @NotNull
        public final Set<String> getFullProductIdsToLoad() {
            return this.fullProductIdsToLoad;
        }

        @NotNull
        public final List<ProductItem> getProductItems() {
            return this.productItems;
        }

        @NotNull
        public final Map<String, StoreProduct> getSubstituteProductsById() {
            return this.substituteProductsById;
        }

        public int hashCode() {
            return (((this.fullProductIdsToLoad.hashCode() * 31) + this.substituteProductsById.hashCode()) * 31) + this.productItems.hashCode();
        }

        @NotNull
        public String toString() {
            return "ProductProcessingResult(fullProductIdsToLoad=" + this.fullProductIdsToLoad + ", substituteProductsById=" + this.substituteProductsById + ", productItems=" + this.productItems + ")";
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.StoreManager$getProductVariables$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.store.StoreManager", f = "StoreManager.kt", i = {0}, l = {47}, m = "getProductVariables", n = {"paywall"}, s = {"L$0"})
    static final class C27451 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C27451(kotlin.coroutines.d<? super C27451> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StoreManager.this.getProductVariables(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.StoreManager$getProducts$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.store.StoreManager", f = "StoreManager.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {108, 118}, m = "getProducts", n = {"this", "paywall", "request", "processingResult", "products", "this", "paywall", "processingResult", "products", "error"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class C27461 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C27461(kotlin.coroutines.d<? super C27461> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StoreManager.this.getProducts(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.StoreManager$getProductsWithoutPaywall$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.store.StoreManager", f = "StoreManager.kt", i = {0, 0}, l = {78}, m = "getProductsWithoutPaywall", n = {"this", "processingResult"}, s = {"L$0", "L$1"})
    static final class C27471 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C27471(kotlin.coroutines.d<? super C27471> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StoreManager.this.getProductsWithoutPaywall(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StoreManager(@NotNull InternalPurchaseController purchaseController, @NotNull Billing billing, @NotNull Function2<? super InternalSuperwallEvent, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> track) {
        Intrinsics.checkNotNullParameter(purchaseController, "purchaseController");
        Intrinsics.checkNotNullParameter(billing, "billing");
        Intrinsics.checkNotNullParameter(track, "track");
        this.purchaseController = purchaseController;
        this.billing = billing;
        this.track = track;
        this.receiptManager$delegate = g0.c(new Function0() { // from class: com.superwall.sdk.store.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StoreManager.receiptManager_delegate$lambda$0(this.f267532a);
            }
        });
        this.productsByFullId = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReceiptManager receiptManager_delegate$lambda$0(StoreManager storeManager) {
        return new ReceiptManager(storeManager, storeManager.billing, null, 4, null);
    }

    private final ProductProcessingResult removeAndStore(Map<String, StoreProduct> map, List<String> list, List<ProductItem> list2) {
        Offer automatic;
        Offer automatic2;
        List mutableList = CollectionsKt.toMutableList((Collection) list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List mutableList2 = CollectionsKt.toMutableList((Collection) list2);
        if (map != null) {
            for (Map.Entry<String, StoreProduct> entry : map.entrySet()) {
                String key = entry.getKey();
                StoreProduct value = entry.getValue();
                final String fullIdentifier = value.getFullIdentifier();
                linkedHashMap.put(fullIdentifier, value);
                this.productsByFullId.put(fullIdentifier, value);
                DecomposedProductIds decomposedProductIdsFrom = DecomposedProductIds.Companion.from(value.getFullIdentifier());
                Iterator it = mutableList2.iterator();
                int i10 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i10 = -1;
                        break;
                    }
                    if (Intrinsics.areEqual(((ProductItem) it.next()).getName(), key)) {
                        break;
                    }
                    i10++;
                }
                Integer numValueOf = Integer.valueOf(i10);
                if (numValueOf.intValue() < 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    String name = ((ProductItem) mutableList2.get(iIntValue)).getName();
                    Set<Entitlement> entitlements = ((ProductItem) mutableList2.get(iIntValue)).getEntitlements();
                    String subscriptionId = decomposedProductIdsFrom.getSubscriptionId();
                    String basePlanId = decomposedProductIdsFrom.getBasePlanId();
                    String str = basePlanId == null ? "" : basePlanId;
                    OfferType offerType = decomposedProductIdsFrom.getOfferType();
                    if (offerType instanceof OfferType.Offer) {
                        automatic2 = new Offer.Specified((String) null, ((OfferType.Offer) offerType).getId(), 1, (DefaultConstructorMarker) null);
                    } else {
                        if (!(offerType instanceof OfferType.Auto)) {
                            throw new k0();
                        }
                        automatic2 = new Offer.Automatic((String) null, 1, (DefaultConstructorMarker) null);
                    }
                    mutableList2.set(iIntValue, new ProductItem(name, new ProductItem.StoreProductType.PlayStore(new PlayStoreProduct(null, subscriptionId, str, automatic2, 1, null)), entitlements));
                } else {
                    Set setEmptySet = SetsKt.emptySet();
                    String subscriptionId2 = decomposedProductIdsFrom.getSubscriptionId();
                    String basePlanId2 = decomposedProductIdsFrom.getBasePlanId();
                    String str2 = basePlanId2 == null ? "" : basePlanId2;
                    OfferType offerType2 = decomposedProductIdsFrom.getOfferType();
                    if (offerType2 instanceof OfferType.Offer) {
                        automatic = new Offer.Specified((String) null, ((OfferType.Offer) offerType2).getId(), 1, (DefaultConstructorMarker) null);
                    } else {
                        if (!(offerType2 instanceof OfferType.Auto)) {
                            throw new k0();
                        }
                        automatic = new Offer.Automatic((String) null, 1, (DefaultConstructorMarker) null);
                    }
                    mutableList2.add(new ProductItem(key, new ProductItem.StoreProductType.PlayStore(new PlayStoreProduct(null, subscriptionId2, str2, automatic, 1, null)), setEmptySet));
                }
                CollectionsKt.removeAll(mutableList, new Function1() { // from class: com.superwall.sdk.store.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(StoreManager.removeAndStore$lambda$11$lambda$10(fullIdentifier, (String) obj));
                    }
                });
            }
        }
        return new ProductProcessingResult(CollectionsKt.toSet(mutableList), linkedHashMap, mutableList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeAndStore$lambda$11$lambda$10(String str, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it, str);
    }

    @NotNull
    public final Billing getBilling() {
        return this.billing;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // com.superwall.sdk.store.StoreKit
    @Nullable
    public Object getProductVariables(@NotNull Paywall paywall, @NotNull PaywallRequest paywallRequest, @NotNull kotlin.coroutines.d<? super List<ProductVariable>> dVar) {
        C27451 c27451;
        Paywall paywall2;
        if (dVar instanceof C27451) {
            c27451 = (C27451) dVar;
            int i10 = c27451.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c27451.label = i10 - Integer.MIN_VALUE;
            } else {
                c27451 = new C27451(dVar);
            }
        } else {
            c27451 = new C27451(dVar);
        }
        C27451 c27452 = c27451;
        Object products$default = c27452.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c27452.label;
        if (i11 == 0) {
            ResultKt.m(products$default);
            c27452.L$0 = paywall;
            c27452.label = 1;
            products$default = StoreKit.DefaultImpls.getProducts$default(this, null, paywall, paywallRequest, c27452, 1, null);
            if (products$default == objL) {
                return objL;
            }
            paywall2 = paywall;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paywall2 = (Paywall) c27452.L$0;
            ResultKt.m(products$default);
        }
        GetProductsResponse getProductsResponse = (GetProductsResponse) products$default;
        List<ProductItem> productItems = paywall2.getProductItems();
        ArrayList arrayList = new ArrayList();
        for (ProductItem productItem : productItems) {
            StoreProduct storeProduct = getProductsResponse.getProductsByFullId().get(productItem.getFullProductId());
            ProductVariable productVariable = storeProduct != null ? new ProductVariable(productItem.getName(), storeProduct.getAttributes()) : null;
            if (productVariable != null) {
                arrayList.add(productVariable);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:38:0x0100  */
    /* JADX WARN: Code duplicated, block: B:41:0x010c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0127 A[LOOP:0: B:43:0x011f->B:45:0x0127, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0149  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.superwall.sdk.store.StoreKit
    @Nullable
    public Object getProducts(@Nullable Map<String, StoreProduct> map, @NotNull Paywall paywall, @Nullable PaywallRequest paywallRequest, @NotNull kotlin.coroutines.d<? super GetProductsResponse> dVar) {
        C27461 c27461;
        ProductProcessingResult productProcessingResultRemoveAndStore;
        Set setEmptySet;
        Object objAwaitGetProducts;
        PaywallRequest paywallRequest2;
        ProductProcessingResult productProcessingResult;
        Set set;
        Throwable th2;
        StoreManager storeManager;
        EventData eventData;
        InternalSuperwallEvent.PaywallProductsLoad paywallProductsLoad;
        Function2<InternalSuperwallEvent, kotlin.coroutines.d<? super Unit>, Object> function2;
        Paywall paywall2;
        ProductProcessingResult productProcessingResult2;
        StoreManager storeManager2;
        Set<StoreProduct> set2;
        Map mutableMap;
        if (dVar instanceof C27461) {
            c27461 = (C27461) dVar;
            int i10 = c27461.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c27461.label = i10 - Integer.MIN_VALUE;
            } else {
                c27461 = new C27461(dVar);
            }
        } else {
            c27461 = new C27461(dVar);
        }
        Object obj = c27461.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c27461.label;
        if (i11 == 0) {
            ResultKt.m(obj);
            productProcessingResultRemoveAndStore = removeAndStore(map, paywall.getProductIds(), paywall.getProductItems());
            setEmptySet = SetsKt.emptySet();
            try {
                Billing billing = this.billing;
                Set<String> fullProductIdsToLoad = productProcessingResultRemoveAndStore.getFullProductIdsToLoad();
                c27461.L$0 = this;
                c27461.L$1 = paywall;
                c27461.L$2 = paywallRequest;
                c27461.L$3 = productProcessingResultRemoveAndStore;
                c27461.L$4 = setEmptySet;
                c27461.label = 1;
                objAwaitGetProducts = billing.awaitGetProducts(fullProductIdsToLoad, c27461);
                if (objAwaitGetProducts == objL) {
                    return objL;
                }
            } catch (Throwable th3) {
                storeManager = this;
                th2 = th3;
                PaywallRequest paywallRequest3 = paywallRequest;
                productProcessingResult = productProcessingResultRemoveAndStore;
                set = setEmptySet;
                paywallRequest2 = paywallRequest3;
                paywall.getProductsLoadingInfo().setFailAt(new Date());
                if (paywallRequest2 != null) {
                    eventData = paywallRequest2.getEventData();
                } else {
                    eventData = null;
                }
                paywallProductsLoad = new InternalSuperwallEvent.PaywallProductsLoad(new InternalSuperwallEvent.PaywallProductsLoad.State.Fail(th2.getMessage()), paywall.getInfo(eventData), paywallRequest2 != null ? paywallRequest2.getEventData() : null);
                function2 = storeManager.track;
                c27461.L$0 = storeManager;
                c27461.L$1 = paywall;
                c27461.L$2 = productProcessingResult;
                c27461.L$3 = set;
                c27461.L$4 = th2;
                c27461.label = 2;
                if (function2.invoke(paywallProductsLoad, c27461) != objL) {
                    ProductProcessingResult productProcessingResult3 = productProcessingResult;
                    paywall2 = paywall;
                    productProcessingResult2 = productProcessingResult3;
                    storeManager2 = storeManager;
                    if (th2 instanceof BillingError.BillingNotAvailable) {
                        throw th2;
                    }
                    set2 = set;
                    productProcessingResultRemoveAndStore = productProcessingResult2;
                    paywall = paywall2;
                    this = storeManager2;
                    mutableMap = MapsKt.toMutableMap(productProcessingResultRemoveAndStore.getSubstituteProductsById());
                    for (StoreProduct storeProduct : set2) {
                        String fullIdentifier = storeProduct.getFullIdentifier();
                        mutableMap.put(fullIdentifier, storeProduct);
                        this.productsByFullId.put(fullIdentifier, storeProduct);
                    }
                    return new GetProductsResponse(mutableMap, productProcessingResultRemoveAndStore.getProductItems(), paywall);
                }
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = (Throwable) c27461.L$4;
                set = (Set) c27461.L$3;
                productProcessingResult2 = (ProductProcessingResult) c27461.L$2;
                paywall2 = (Paywall) c27461.L$1;
                storeManager2 = (StoreManager) c27461.L$0;
                ResultKt.m(obj);
                if (th2 instanceof BillingError.BillingNotAvailable) {
                    throw th2;
                }
                set2 = set;
                productProcessingResultRemoveAndStore = productProcessingResult2;
                paywall = paywall2;
                this = storeManager2;
                mutableMap = MapsKt.toMutableMap(productProcessingResultRemoveAndStore.getSubstituteProductsById());
                while (r15.hasNext()) {
                    String fullIdentifier2 = storeProduct.getFullIdentifier();
                    mutableMap.put(fullIdentifier2, storeProduct);
                    this.productsByFullId.put(fullIdentifier2, storeProduct);
                }
                return new GetProductsResponse(mutableMap, productProcessingResultRemoveAndStore.getProductItems(), paywall);
            }
            Set set3 = (Set) c27461.L$4;
            productProcessingResultRemoveAndStore = (ProductProcessingResult) c27461.L$3;
            paywallRequest = (PaywallRequest) c27461.L$2;
            paywall = (Paywall) c27461.L$1;
            storeManager = (StoreManager) c27461.L$0;
            try {
                ResultKt.m(obj);
                setEmptySet = set3;
                this = storeManager;
                objAwaitGetProducts = obj;
            } catch (Throwable th4) {
                set = set3;
                th2 = th4;
                paywallRequest2 = paywallRequest;
                productProcessingResult = productProcessingResultRemoveAndStore;
                paywall.getProductsLoadingInfo().setFailAt(new Date());
                if (paywallRequest2 != null) {
                    eventData = paywallRequest2.getEventData();
                } else {
                    eventData = null;
                }
                paywallProductsLoad = new InternalSuperwallEvent.PaywallProductsLoad(new InternalSuperwallEvent.PaywallProductsLoad.State.Fail(th2.getMessage()), paywall.getInfo(eventData), paywallRequest2 != null ? paywallRequest2.getEventData() : null);
                function2 = storeManager.track;
                c27461.L$0 = storeManager;
                c27461.L$1 = paywall;
                c27461.L$2 = productProcessingResult;
                c27461.L$3 = set;
                c27461.L$4 = th2;
                c27461.label = 2;
                if (function2.invoke(paywallProductsLoad, c27461) != objL) {
                    ProductProcessingResult productProcessingResult4 = productProcessingResult;
                    paywall2 = paywall;
                    productProcessingResult2 = productProcessingResult4;
                    storeManager2 = storeManager;
                    if (th2 instanceof BillingError.BillingNotAvailable) {
                        throw th2;
                    }
                    set2 = set;
                    productProcessingResultRemoveAndStore = productProcessingResult2;
                    paywall = paywall2;
                    this = storeManager2;
                }
                return objL;
            }
        }
        set2 = (Set) objAwaitGetProducts;
        mutableMap = MapsKt.toMutableMap(productProcessingResultRemoveAndStore.getSubstituteProductsById());
        while (r15.hasNext()) {
            String fullIdentifier3 = storeProduct.getFullIdentifier();
            mutableMap.put(fullIdentifier3, storeProduct);
            this.productsByFullId.put(fullIdentifier3, storeProduct);
        }
        return new GetProductsResponse(mutableMap, productProcessingResultRemoveAndStore.getProductItems(), paywall);
    }

    @NotNull
    public final Map<String, StoreProduct> getProductsByFullId() {
        return this.productsByFullId;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.superwall.sdk.store.StoreKit
    @Nullable
    public Object getProductsWithoutPaywall(@NotNull List<String> list, @Nullable Map<String, StoreProduct> map, @NotNull kotlin.coroutines.d<? super Map<String, StoreProduct>> dVar) {
        C27471 c27471;
        StoreManager storeManager;
        ProductProcessingResult productProcessingResult;
        if (dVar instanceof C27471) {
            c27471 = (C27471) dVar;
            int i10 = c27471.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c27471.label = i10 - Integer.MIN_VALUE;
            } else {
                c27471 = new C27471(dVar);
            }
        } else {
            c27471 = new C27471(dVar);
        }
        Object objAwaitGetProducts = c27471.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c27471.label;
        if (i11 == 0) {
            ResultKt.m(objAwaitGetProducts);
            ProductProcessingResult productProcessingResultRemoveAndStore = removeAndStore(map, list, CollectionsKt.emptyList());
            Billing billing = this.billing;
            Set<String> fullProductIdsToLoad = productProcessingResultRemoveAndStore.getFullProductIdsToLoad();
            c27471.L$0 = this;
            c27471.L$1 = productProcessingResultRemoveAndStore;
            c27471.label = 1;
            objAwaitGetProducts = billing.awaitGetProducts(fullProductIdsToLoad, c27471);
            if (objAwaitGetProducts == objL) {
                return objL;
            }
            storeManager = this;
            productProcessingResult = productProcessingResultRemoveAndStore;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            productProcessingResult = (ProductProcessingResult) c27471.L$1;
            storeManager = (StoreManager) c27471.L$0;
            ResultKt.m(objAwaitGetProducts);
        }
        Set<StoreProduct> set = (Set) objAwaitGetProducts;
        Map mutableMap = MapsKt.toMutableMap(productProcessingResult.getSubstituteProductsById());
        for (StoreProduct storeProduct : set) {
            String fullIdentifier = storeProduct.getFullIdentifier();
            mutableMap.put(fullIdentifier, storeProduct);
            storeManager.productsByFullId.put(fullIdentifier, storeProduct);
        }
        Set<StoreProduct> set2 = set;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set2, 10));
        for (StoreProduct storeProduct2 : set2) {
            arrayList.add(TuplesKt.to(storeProduct2.getFullIdentifier(), storeProduct2));
        }
        return MapsKt.toMap(arrayList);
    }

    @NotNull
    public final InternalPurchaseController getPurchaseController() {
        return this.purchaseController;
    }

    @NotNull
    public final ReceiptManager getReceiptManager() {
        return (ReceiptManager) this.receiptManager$delegate.getValue();
    }

    @Override // com.superwall.sdk.store.StoreKit
    @Nullable
    public Object loadPurchasedProducts(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.storeKitManager, "Loading purchased products from the Google Play receipt.", null, null, 24, null);
        Object objLoadPurchasedProducts = getReceiptManager().loadPurchasedProducts(dVar);
        return objLoadPurchasedProducts == kotlin.coroutines.intrinsics.b.l() ? objLoadPurchasedProducts : Unit.f312394a;
    }

    @Override // com.superwall.sdk.store.coordinator.ProductsFetcher
    @Nullable
    public Object products(@NotNull Set<String> set, @NotNull kotlin.coroutines.d<? super Set<StoreProduct>> dVar) throws Throwable {
        return this.billing.awaitGetProducts(set, dVar);
    }

    @Override // com.superwall.sdk.store.StoreKit
    public void refreshReceipt() {
        Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.storeKitManager, "Refreshing Google Play receipt.", null, null, 24, null);
        getReceiptManager().refreshReceipt();
    }

    public final void setProductsByFullId(@NotNull Map<String, StoreProduct> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.productsByFullId = map;
    }

    public /* synthetic */ StoreManager(InternalPurchaseController internalPurchaseController, Billing billing, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(internalPurchaseController, billing, (i10 & 4) != 0 ? new AnonymousClass1(null) : function2);
    }
}
