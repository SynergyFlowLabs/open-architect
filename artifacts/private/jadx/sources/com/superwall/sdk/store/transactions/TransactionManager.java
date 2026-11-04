package com.superwall.sdk.store.transactions;

import android.app.Activity;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.media3.exoplayer.a5;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.z;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.internal.TrackingKt;
import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import com.superwall.sdk.analytics.internal.trackable.TrackableSuperwallEvent;
import com.superwall.sdk.analytics.superwall.SuperwallEvents;
import com.superwall.sdk.delegate.InternalPurchaseResult;
import com.superwall.sdk.delegate.PurchaseResult;
import com.superwall.sdk.delegate.RestorationResult;
import com.superwall.sdk.delegate.subscription_controller.PurchaseController;
import com.superwall.sdk.dependencies.CacheFactory;
import com.superwall.sdk.dependencies.DeviceHelperFactory;
import com.superwall.sdk.dependencies.HasExternalPurchaseControllerFactory;
import com.superwall.sdk.dependencies.HasInternalPurchaseControllerFactory;
import com.superwall.sdk.dependencies.OptionsFactory;
import com.superwall.sdk.dependencies.StoreTransactionFactory;
import com.superwall.sdk.dependencies.TransactionVerifierFactory;
import com.superwall.sdk.dependencies.TriggerFactory;
import com.superwall.sdk.dependencies.WebToAppFactory;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.misc.ActivityProvider;
import com.superwall.sdk.misc.IOScope;
import com.superwall.sdk.misc.ScopesKt;
import com.superwall.sdk.models.entitlements.Entitlement;
import com.superwall.sdk.models.entitlements.SubscriptionStatus;
import com.superwall.sdk.models.paywall.Paywall;
import com.superwall.sdk.paywall.presentation.PaywallInfo;
import com.superwall.sdk.paywall.presentation.internal.state.PaywallResult;
import com.superwall.sdk.paywall.view.PaywallView;
import com.superwall.sdk.paywall.view.delegate.PaywallLoadingState;
import com.superwall.sdk.storage.EventsQueue;
import com.superwall.sdk.storage.PurchasingProductdIds;
import com.superwall.sdk.storage.Storage;
import com.superwall.sdk.store.InternalPurchaseController;
import com.superwall.sdk.store.PurchasingObserverState;
import com.superwall.sdk.store.StoreManager;
import com.superwall.sdk.store.abstractions.product.RawStoreProduct;
import com.superwall.sdk.store.abstractions.product.StoreProduct;
import com.superwall.sdk.web.OpenWebRestoreKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nTransactionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionManager.kt\ncom/superwall/sdk/store/transactions/TransactionManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,966:1\n1863#2:967\n1557#2:968\n1628#2,3:969\n1864#2:972\n1863#2:973\n1557#2:974\n1628#2,3:975\n1864#2:978\n1863#2:979\n1557#2:980\n1628#2,3:981\n1864#2:984\n774#2:985\n865#2:986\n1755#2,3:987\n866#2:990\n1557#2:991\n1628#2,3:992\n774#2:995\n865#2,2:996\n*S KotlinDebug\n*F\n+ 1 TransactionManager.kt\ncom/superwall/sdk/store/transactions/TransactionManager\n*L\n183#1:967\n184#1:968\n184#1:969,3\n183#1:972\n220#1:973\n221#1:974\n221#1:975,3\n220#1:978\n232#1:979\n233#1:980\n233#1:981,3\n232#1:984\n246#1:985\n246#1:986\n247#1:987,3\n246#1:990\n742#1:991\n742#1:992,3\n897#1:995\n897#1:996,2\n*E\n"})
public final class TransactionManager {

    @NotNull
    private final ActivityProvider activityProvider;

    @NotNull
    private final n<PaywallView, PaywallResult, d<? super Unit>, Object> dismiss;

    @NotNull
    private final Function1<String, Set<Entitlement>> entitlementsById;

    @NotNull
    private final EventsQueue eventsQueue;

    @NotNull
    private final Factory factory;

    @NotNull
    private final IOScope ioScope;

    @Nullable
    private PaywallView lastPaywallView;

    @NotNull
    private final PurchaseController purchaseController;

    @NotNull
    private final Function0<Unit> refreshReceipt;

    @NotNull
    private final Function1<d<? super Unit>, Object> showRestoreDialogForWeb;

    @NotNull
    private final Storage storage;

    @NotNull
    private final StoreManager storeManager;

    @NotNull
    private final Function0<SubscriptionStatus> subscriptionStatus;

    @NotNull
    private final Function2<TrackableSuperwallEvent, d<? super Unit>, Object> track;

    @NotNull
    private ConcurrentHashMap<String, z> transactionsInProgress;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.superwall.sdk.store.transactions.TransactionManager$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.store.transactions.TransactionManager$1", f = "TransactionManager.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends o implements Function2<TrackableSuperwallEvent, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TrackableSuperwallEvent trackableSuperwallEvent, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(trackableSuperwallEvent, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                TrackableSuperwallEvent trackableSuperwallEvent = (TrackableSuperwallEvent) this.L$0;
                Superwall companion = Superwall.Companion.getInstance();
                this.label = 1;
                if (TrackingKt.track(companion, trackableSuperwallEvent, this) == objL) {
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

    /* JADX INFO: renamed from: com.superwall.sdk.store.transactions.TransactionManager$3, reason: invalid class name */
    @f(c = "com.superwall.sdk.store.transactions.TransactionManager$3", f = "TransactionManager.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.superwall.sdk.store.transactions.TransactionManager$3$1, reason: invalid class name */
        @f(c = "com.superwall.sdk.store.transactions.TransactionManager$3$1", f = "TransactionManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends o implements Function2<InternalPurchaseResult, d<? super Boolean>, Object> {
            int label;
            final /* synthetic */ TransactionManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TransactionManager transactionManager, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.this$0 = transactionManager;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new AnonymousClass1(this.this$0, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InternalPurchaseResult internalPurchaseResult, d<? super Boolean> dVar) {
                return ((AnonymousClass1) create(internalPurchaseResult, dVar)).invokeSuspend(Unit.f312394a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.this$0.transactionsInProgress.isEmpty());
            }
        }

        /* JADX INFO: renamed from: com.superwall.sdk.store.transactions.TransactionManager$3$2, reason: invalid class name */
        @f(c = "com.superwall.sdk.store.transactions.TransactionManager$3$2", f = "TransactionManager.kt", i = {}, l = {androidx.media2.widget.f.i.f59799s0}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nTransactionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionManager.kt\ncom/superwall/sdk/store/transactions/TransactionManager$3$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,966:1\n1863#2,2:967\n*S KotlinDebug\n*F\n+ 1 TransactionManager.kt\ncom/superwall/sdk/store/transactions/TransactionManager$3$2\n*L\n122#1:967,2\n*E\n"})
        static final class AnonymousClass2 extends o implements Function2<InternalPurchaseResult, d<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TransactionManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(TransactionManager transactionManager, d<? super AnonymousClass2> dVar) {
                super(2, dVar);
                this.this$0 = transactionManager;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, dVar);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InternalPurchaseResult internalPurchaseResult, d<? super Unit> dVar) {
                return ((AnonymousClass2) create(internalPurchaseResult, dVar)).invokeSuspend(Unit.f312394a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Throwable th2;
                PurchasingObserverState purchaseError;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    InternalPurchaseResult internalPurchaseResult = (InternalPurchaseResult) this.L$0;
                    if (internalPurchaseResult instanceof InternalPurchaseResult.Purchased) {
                        InternalPurchaseResult.Purchased purchased = (InternalPurchaseResult.Purchased) internalPurchaseResult;
                        List<String> listG = purchased.getPurchase().g();
                        Intrinsics.checkNotNullExpressionValue(listG, "getProducts(...)");
                        TransactionManager transactionManager = this.this$0;
                        Iterator<T> it = listG.iterator();
                        while (it.hasNext()) {
                            transactionManager.transactionsInProgress.remove((String) it.next());
                        }
                        com.android.billingclient.api.n nVarA = com.android.billingclient.api.n.c().c(0).a();
                        Intrinsics.checkNotNullExpressionValue(nVarA, "build(...)");
                        purchaseError = new PurchasingObserverState.PurchaseResult(nVarA, CollectionsKt.listOf(purchased.getPurchase()));
                    } else if (internalPurchaseResult instanceof InternalPurchaseResult.Cancelled) {
                        Set setEntrySet = this.this$0.transactionsInProgress.entrySet();
                        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
                        Object objLast = CollectionsKt.last(setEntrySet);
                        Intrinsics.checkNotNullExpressionValue(objLast, "last(...)");
                        this.this$0.transactionsInProgress.remove(((Map.Entry) objLast).getKey());
                        com.android.billingclient.api.n nVarA2 = com.android.billingclient.api.n.c().c(1).a();
                        Intrinsics.checkNotNullExpressionValue(nVarA2, "build(...)");
                        purchaseError = new PurchasingObserverState.PurchaseResult(nVarA2, CollectionsKt.emptyList());
                    } else {
                        Set setEntrySet2 = this.this$0.transactionsInProgress.entrySet();
                        Intrinsics.checkNotNullExpressionValue(setEntrySet2, "<get-entries>(...)");
                        Object objLast2 = CollectionsKt.last(setEntrySet2);
                        Intrinsics.checkNotNullExpressionValue(objLast2, "last(...)");
                        Map.Entry entry = (Map.Entry) objLast2;
                        this.this$0.transactionsInProgress.remove(entry.getKey());
                        InternalPurchaseResult.Failed failed = internalPurchaseResult instanceof InternalPurchaseResult.Failed ? (InternalPurchaseResult.Failed) internalPurchaseResult : null;
                        if (failed == null || (th2 = failed.getError()) == null) {
                            th2 = new Throwable("Unknown error");
                        }
                        Object value = entry.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
                        purchaseError = new PurchasingObserverState.PurchaseError((z) value, th2);
                    }
                    TransactionManager transactionManager2 = this.this$0;
                    this.label = 1;
                    if (transactionManager2.handle$superwall_release(internalPurchaseResult, purchaseError, this) == objL) {
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
        }

        AnonymousClass3(d<? super AnonymousClass3> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return TransactionManager.this.new AnonymousClass3(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            int i11 = 3 ^ 1;
            if (i10 == 0) {
                ResultKt.m(obj);
                i iVarV0 = k.v0(k.m0(k.m(TransactionManager.this.storeManager.getBilling().getPurchaseResults()), new AnonymousClass1(TransactionManager.this, null)));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(TransactionManager.this, null);
                this.label = 1;
                if (k.C(iVarV0, anonymousClass2, this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass3) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public interface Factory extends OptionsFactory, TriggerFactory, TransactionVerifierFactory, StoreTransactionFactory, DeviceHelperFactory, CacheFactory, HasExternalPurchaseControllerFactory, HasInternalPurchaseControllerFactory, WebToAppFactory {
    }

    public static abstract class PurchaseSource {

        public static final class ExternalPurchase extends PurchaseSource {

            @NotNull
            private final StoreProduct product;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ExternalPurchase(@NotNull StoreProduct product) {
                super(null);
                Intrinsics.checkNotNullParameter(product, "product");
                this.product = product;
            }

            public static /* synthetic */ ExternalPurchase copy$default(ExternalPurchase externalPurchase, StoreProduct storeProduct, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    storeProduct = externalPurchase.product;
                }
                return externalPurchase.copy(storeProduct);
            }

            @NotNull
            public final StoreProduct component1() {
                return this.product;
            }

            @NotNull
            public final ExternalPurchase copy(@NotNull StoreProduct product) {
                Intrinsics.checkNotNullParameter(product, "product");
                return new ExternalPurchase(product);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof ExternalPurchase) && Intrinsics.areEqual(this.product, ((ExternalPurchase) obj).product)) {
                    return true;
                }
                return false;
            }

            @NotNull
            public final StoreProduct getProduct() {
                return this.product;
            }

            public int hashCode() {
                return this.product.hashCode();
            }

            @NotNull
            public String toString() {
                return "ExternalPurchase(product=" + this.product + ")";
            }
        }

        public static final class Internal extends PurchaseSource {

            @NotNull
            private final PaywallView paywallView;

            @NotNull
            private final String productId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Internal(@NotNull String productId, @NotNull PaywallView paywallView) {
                super(null);
                Intrinsics.checkNotNullParameter(productId, "productId");
                Intrinsics.checkNotNullParameter(paywallView, "paywallView");
                this.productId = productId;
                this.paywallView = paywallView;
            }

            public static /* synthetic */ Internal copy$default(Internal internal, String str, PaywallView paywallView, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = internal.productId;
                }
                if ((i10 & 2) != 0) {
                    paywallView = internal.paywallView;
                }
                return internal.copy(str, paywallView);
            }

            @NotNull
            public final String component1() {
                return this.productId;
            }

            @NotNull
            public final PaywallView component2() {
                return this.paywallView;
            }

            @NotNull
            public final Internal copy(@NotNull String productId, @NotNull PaywallView paywallView) {
                Intrinsics.checkNotNullParameter(productId, "productId");
                Intrinsics.checkNotNullParameter(paywallView, "paywallView");
                return new Internal(productId, paywallView);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Internal)) {
                    return false;
                }
                Internal internal = (Internal) obj;
                return Intrinsics.areEqual(this.productId, internal.productId) && Intrinsics.areEqual(this.paywallView, internal.paywallView);
            }

            @NotNull
            public final PaywallView getPaywallView() {
                return this.paywallView;
            }

            @NotNull
            public final String getProductId() {
                return this.productId;
            }

            public int hashCode() {
                return (this.productId.hashCode() * 31) + this.paywallView.hashCode();
            }

            @NotNull
            public String toString() {
                return "Internal(productId=" + this.productId + ", paywallView=" + this.paywallView + ")";
            }
        }

        public static final class ObserverMode extends PurchaseSource {

            @NotNull
            private final StoreProduct product;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ObserverMode(@NotNull StoreProduct product) {
                super(null);
                Intrinsics.checkNotNullParameter(product, "product");
                this.product = product;
            }

            public static /* synthetic */ ObserverMode copy$default(ObserverMode observerMode, StoreProduct storeProduct, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    storeProduct = observerMode.product;
                }
                return observerMode.copy(storeProduct);
            }

            @NotNull
            public final StoreProduct component1() {
                return this.product;
            }

            @NotNull
            public final ObserverMode copy(@NotNull StoreProduct product) {
                Intrinsics.checkNotNullParameter(product, "product");
                return new ObserverMode(product);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ObserverMode) && Intrinsics.areEqual(this.product, ((ObserverMode) obj).product);
            }

            @NotNull
            public final StoreProduct getProduct() {
                return this.product;
            }

            public int hashCode() {
                return this.product.hashCode();
            }

            @NotNull
            public String toString() {
                return "ObserverMode(product=" + this.product + ")";
            }
        }

        public /* synthetic */ PurchaseSource(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private PurchaseSource() {
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.transactions.TransactionManager$didPurchase$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.store.transactions.TransactionManager", f = "TransactionManager.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 7}, l = {557, com.google.android.vending.licensing.k.f115073b, 563, 566, 581, 585, 587, 594, 596}, m = "didPurchase", n = {"this", "product", "purchaseSource", "didStartFreeTrial", "this", "product", "purchaseSource", "transaction", "didStartFreeTrial", "this", "product", "purchaseSource", "this", "product", "purchaseSource", FirebaseAnalytics.c.D, "transactionVerifier", "didStartFreeTrial", "this", "product", "purchaseSource", "didStartFreeTrial", "this", "product", "purchaseSource", "didStartFreeTrial", "this", "product", "purchaseSource", "transaction", "didStartFreeTrial"}, s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0"})
    static final class C27501 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C27501(d<? super C27501> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransactionManager.this.didPurchase(null, null, false, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.transactions.TransactionManager$didPurchase$2, reason: invalid class name */
    @f(c = "com.superwall.sdk.store.transactions.TransactionManager$didPurchase$2", f = "TransactionManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ StoreProduct $product;
        final /* synthetic */ PurchaseSource $purchaseSource;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(StoreProduct storeProduct, PurchaseSource purchaseSource, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$product = storeProduct;
            this.$purchaseSource = purchaseSource;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return TransactionManager.this.new AnonymousClass2(this.$product, this.$purchaseSource, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            TransactionManager.log$default(TransactionManager.this, null, "Transaction Succeeded", MapsKt.mapOf(TuplesKt.to(com.planner5d.library.model.manager.statistics.appsflyer.d.a.f202890f, this.$product.getFullIdentifier()), TuplesKt.to("paywall_vc", ((PurchaseSource.Internal) this.$purchaseSource).getPaywallView())), null, 9, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.transactions.TransactionManager$didRestore$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.store.transactions.TransactionManager", f = "TransactionManager.kt", i = {0, 0, 0, 1, 1}, l = {357, 380, a5.S0}, m = "didRestore", n = {"this", "product", "purchaseSource", "this", "purchaseSource"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class C27511 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C27511(d<? super C27511> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransactionManager.this.didRestore(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.transactions.TransactionManager$handlePendingTransaction$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.store.transactions.TransactionManager", f = "TransactionManager.kt", i = {0}, l = {682, v.h.f44115p}, m = "handlePendingTransaction", n = {"purchaseSource"}, s = {"L$0"})
    static final class C27521 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C27521(d<? super C27521> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransactionManager.this.handlePendingTransaction(null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.transactions.TransactionManager$handlePendingTransaction$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.store.transactions.TransactionManager$handlePendingTransaction$2", f = "TransactionManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C27532 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ PurchaseSource $purchaseSource;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27532(PurchaseSource purchaseSource, d<? super C27532> dVar) {
            super(2, dVar);
            this.$purchaseSource = purchaseSource;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return TransactionManager.this.new C27532(this.$purchaseSource, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            TransactionManager.log$default(TransactionManager.this, null, "Transaction Pending", MapsKt.mapOf(TuplesKt.to("paywall_vc", ((PurchaseSource.Internal) this.$purchaseSource).getPaywallView())), null, 9, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27532) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.transactions.TransactionManager$handlePendingTransaction$3, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.store.transactions.TransactionManager$handlePendingTransaction$3", f = "TransactionManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C27543 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        C27543(d<? super C27543> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return TransactionManager.this.new C27543(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            int i10 = 0 >> 0;
            TransactionManager.log$default(TransactionManager.this, null, "Transaction Pending", null, null, 13, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27543) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.transactions.TransactionManager$presentAlert$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.store.transactions.TransactionManager$presentAlert$2", f = "TransactionManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C27552 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Error $error;
        final /* synthetic */ PaywallView $paywallView;
        final /* synthetic */ StoreProduct $product;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27552(StoreProduct storeProduct, PaywallView paywallView, Error error, d<? super C27552> dVar) {
            super(2, dVar);
            this.$product = storeProduct;
            this.$paywallView = paywallView;
            this.$error = error;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return TransactionManager.this.new C27552(this.$product, this.$paywallView, this.$error, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            int i10 = 1 << 0;
            TransactionManager.log$default(TransactionManager.this, null, "Transaction Error", MapsKt.mapOf(TuplesKt.to(com.planner5d.library.model.manager.statistics.appsflyer.d.a.f202890f, this.$product.getFullIdentifier()), TuplesKt.to("paywall_vc", this.$paywallView)), this.$error, 1, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27552) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.transactions.TransactionManager$purchase$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.store.transactions.TransactionManager", f = "TransactionManager.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 3, 3, 3, 3, 3, 4, 5, 6}, l = {280, 282, 300, 307, v.a.f43975r, 336, 340}, m = FirebaseAnalytics.c.D, n = {"this", "purchaseSource", "product", "rawStoreProduct", "productDetails", "activity", "this", "purchaseSource", "product", "rawStoreProduct", "result", "this", "purchaseSource", "product", "result", "shouldShowPurchaseFailureAlert", "result", "result", "result"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$0", "L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$0", "L$0"})
    static final class C27561 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C27561(d<? super C27561> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransactionManager.this.purchase(null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.transactions.TransactionManager$trackCancelled$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.store.transactions.TransactionManager", f = "TransactionManager.kt", i = {0}, l = {631, 653}, m = "trackCancelled", n = {"purchaseSource"}, s = {"L$0"})
    static final class C27571 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C27571(d<? super C27571> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransactionManager.this.trackCancelled(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.transactions.TransactionManager$trackCancelled$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.store.transactions.TransactionManager$trackCancelled$2", f = "TransactionManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C27582 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ StoreProduct $product;
        final /* synthetic */ PurchaseSource $purchaseSource;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27582(StoreProduct storeProduct, PurchaseSource purchaseSource, d<? super C27582> dVar) {
            super(2, dVar);
            this.$product = storeProduct;
            this.$purchaseSource = purchaseSource;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return TransactionManager.this.new C27582(this.$product, this.$purchaseSource, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            TransactionManager.log$default(TransactionManager.this, null, "Transaction Abandoned", MapsKt.mapOf(TuplesKt.to(com.planner5d.library.model.manager.statistics.appsflyer.d.a.f202890f, this.$product.getFullIdentifier()), TuplesKt.to("paywall_vc", ((PurchaseSource.Internal) this.$purchaseSource).getPaywallView())), null, 9, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27582) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.transactions.TransactionManager$trackCancelled$3, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.store.transactions.TransactionManager$trackCancelled$3", f = "TransactionManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C27593 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ StoreProduct $product;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27593(StoreProduct storeProduct, d<? super C27593> dVar) {
            super(2, dVar);
            this.$product = storeProduct;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return TransactionManager.this.new C27593(this.$product, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            TransactionManager.log$default(TransactionManager.this, null, "Transaction Abandoned", MapsKt.mapOf(TuplesKt.to(com.planner5d.library.model.manager.statistics.appsflyer.d.a.f202890f, this.$product.getFullIdentifier())), null, 9, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27593) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.transactions.TransactionManager$trackFailure$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.store.transactions.TransactionManager$trackFailure$1", f = "TransactionManager.kt", i = {}, l = {426}, m = "invokeSuspend", n = {}, s = {})
    static final class C27601 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ String $errorMessage;
        final /* synthetic */ StoreProduct $product;
        final /* synthetic */ PurchaseSource $purchaseSource;
        int label;
        final /* synthetic */ TransactionManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27601(PurchaseSource purchaseSource, String str, StoreProduct storeProduct, TransactionManager transactionManager, d<? super C27601> dVar) {
            super(2, dVar);
            this.$purchaseSource = purchaseSource;
            this.$errorMessage = str;
            this.$product = storeProduct;
            this.this$0 = transactionManager;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C27601(this.$purchaseSource, this.$errorMessage, this.$product, this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                PaywallInfo info = ((PurchaseSource.Internal) this.$purchaseSource).getPaywallView().getInfo();
                InternalSuperwallEvent.Transaction.State.Fail fail = new InternalSuperwallEvent.Transaction.State.Fail(new TransactionError.Failure(this.$errorMessage, this.$product));
                boolean shouldObservePurchases = this.this$0.factory.makeSuperwallOptions().getShouldObservePurchases();
                InternalSuperwallEvent.Transaction transaction = new InternalSuperwallEvent.Transaction(fail, info, this.$product, null, InternalSuperwallEvent.Transaction.TransactionSource.INTERNAL, shouldObservePurchases, null, null, 192, null);
                InternalSuperwallEvent.Transaction.State state = transaction.getState();
                Intrinsics.checkNotNull(state, "null cannot be cast to non-null type com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent.Transaction.State.Fail");
                Function2 function2 = this.this$0.track;
                this.label = 1;
                if (function2.invoke(transaction, this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27601) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.transactions.TransactionManager$trackFailure$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.store.transactions.TransactionManager$trackFailure$2", f = "TransactionManager.kt", i = {}, l = {452}, m = "invokeSuspend", n = {}, s = {})
    static final class C27612 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ String $errorMessage;
        final /* synthetic */ StoreProduct $product;
        final /* synthetic */ PurchaseSource $purchaseSource;
        int label;
        final /* synthetic */ TransactionManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27612(String str, StoreProduct storeProduct, PurchaseSource purchaseSource, TransactionManager transactionManager, d<? super C27612> dVar) {
            super(2, dVar);
            this.$errorMessage = str;
            this.$product = storeProduct;
            this.$purchaseSource = purchaseSource;
            this.this$0 = transactionManager;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C27612(this.$errorMessage, this.$product, this.$purchaseSource, this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                InternalSuperwallEvent.Transaction.State.Fail fail = new InternalSuperwallEvent.Transaction.State.Fail(new TransactionError.Failure(this.$errorMessage, this.$product));
                PaywallInfo paywallInfoEmpty = PaywallInfo.Companion.empty();
                boolean z10 = this.$purchaseSource instanceof PurchaseSource.ObserverMode;
                InternalSuperwallEvent.Transaction transaction = new InternalSuperwallEvent.Transaction(fail, paywallInfoEmpty, this.$product, null, InternalSuperwallEvent.Transaction.TransactionSource.EXTERNAL, z10, null, null, 192, null);
                Function2 function2 = this.this$0.track;
                this.label = 1;
                if (function2.invoke(transaction, this) == objL) {
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
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C27612) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.transactions.TransactionManager$trackTransactionDidSucceed$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.store.transactions.TransactionManager", f = "TransactionManager.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 4, 4, 4, 5, 6, 7, 7, 7, 8, 8, 8}, l = {866, 880, 881, 889, 894, 901, 908, 925, 926, 934, 939, 946}, m = "trackTransactionDidSucceed", n = {"this", "transaction", "product", "paywallView", "didStartFreeTrial", "this", "product", "paywallView", "paywallInfo", "didStartFreeTrial", "this", "product", "paywallView", "paywallInfo", "didStartFreeTrial", "this", "this", "paywallView", "paywallInfo", "this", "this", "this", "product", "didStartFreeTrial", "this", "product", "didStartFreeTrial"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$0", "L$1", "L$2", "L$0", "L$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
    static final class C27621 extends kotlin.coroutines.jvm.internal.d {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C27621(d<? super C27621> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransactionManager.this.trackTransactionDidSucceed(null, null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.store.transactions.TransactionManager$tryToRestorePurchases$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.store.transactions.TransactionManager", f = "TransactionManager.kt", i = {0, 0, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 4, 5, 5, 5, 5}, l = {723, 729, 735, 750, 757, 779}, m = "tryToRestorePurchases", n = {"this", "paywallView", "this", "paywallView", "this", "paywallView", "restorationResult", "status", "hasRestored", "hasEntitlements", "this", "paywallView", "restorationResult", "restorationResult", "this", "paywallView", "restorationResult", "webToAppEnabled"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "L$0", "L$1", "L$2", "L$0", "L$0", "L$1", "L$2", "Z$0"})
    static final class C27631 extends kotlin.coroutines.jvm.internal.d {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C27631(d<? super C27631> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransactionManager.this.tryToRestorePurchases(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransactionManager(@NotNull StoreManager storeManager, @NotNull PurchaseController purchaseController, @NotNull EventsQueue eventsQueue, @NotNull Storage storage, @NotNull ActivityProvider activityProvider, @NotNull Factory factory, @NotNull IOScope ioScope, @NotNull Function2<? super TrackableSuperwallEvent, ? super d<? super Unit>, ? extends Object> track, @NotNull n<? super PaywallView, ? super PaywallResult, ? super d<? super Unit>, ? extends Object> dismiss, @NotNull Function0<? extends SubscriptionStatus> subscriptionStatus, @NotNull Function1<? super String, ? extends Set<Entitlement>> entitlementsById, @NotNull Function1<? super d<? super Unit>, ? extends Object> showRestoreDialogForWeb, @NotNull Function0<Unit> refreshReceipt) {
        Intrinsics.checkNotNullParameter(storeManager, "storeManager");
        Intrinsics.checkNotNullParameter(purchaseController, "purchaseController");
        Intrinsics.checkNotNullParameter(eventsQueue, "eventsQueue");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(ioScope, "ioScope");
        Intrinsics.checkNotNullParameter(track, "track");
        Intrinsics.checkNotNullParameter(dismiss, "dismiss");
        Intrinsics.checkNotNullParameter(subscriptionStatus, "subscriptionStatus");
        Intrinsics.checkNotNullParameter(entitlementsById, "entitlementsById");
        Intrinsics.checkNotNullParameter(showRestoreDialogForWeb, "showRestoreDialogForWeb");
        Intrinsics.checkNotNullParameter(refreshReceipt, "refreshReceipt");
        this.storeManager = storeManager;
        this.purchaseController = purchaseController;
        this.eventsQueue = eventsQueue;
        this.storage = storage;
        this.activityProvider = activityProvider;
        this.factory = factory;
        this.ioScope = ioScope;
        this.track = track;
        this.dismiss = dismiss;
        this.subscriptionStatus = subscriptionStatus;
        this.entitlementsById = entitlementsById;
        this.showRestoreDialogForWeb = showRestoreDialogForWeb;
        this.refreshReceipt = refreshReceipt;
        this.transactionsInProgress = new ConcurrentHashMap<>();
        if (getShouldObserveTransactionFinishingAutomatically()) {
            kotlinx.coroutines.k.f(ioScope, null, null, new AnonymousClass3(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SubscriptionStatus _init_$lambda$0() {
        return Superwall.Companion.getInstance().getEntitlements().getStatus().getValue();
    }

    private final void askToRestoreFromWeb() {
        boolean zIsEmpty = Superwall.Companion.getInstance().getEntitlements().getActiveDeviceEntitlements$superwall_release().isEmpty();
        PaywallView paywallView = this.lastPaywallView;
        if (paywallView != null) {
            PaywallView.showAlert$default(paywallView, !zIsEmpty ? "Restore via the web?" : "No Subscription Found", !zIsEmpty ? "Your Play Store subscriptions were restored. Would you like to check for more on the web?" : "No Play Store subscription found, would you like to check on the web?", "Yes", "Close", new Function0() { // from class: com.superwall.sdk.store.transactions.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransactionManager.askToRestoreFromWeb$lambda$14();
                }
            }, null, 32, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit askToRestoreFromWeb$lambda$14() {
        OpenWebRestoreKt.openRestoreOnWeb(Superwall.Companion.getInstance());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x013b  */
    /* JADX WARN: Code duplicated, block: B:34:0x016d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0180  */
    /* JADX WARN: Code duplicated, block: B:42:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:61:0x0212  */
    /* JADX WARN: Code duplicated, block: B:63:0x0217  */
    /* JADX WARN: Code duplicated, block: B:66:0x022f  */
    /* JADX WARN: Code duplicated, block: B:72:0x024f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x019e, code lost:
    
        if (r1.invoke(r0, r2, r12) == r10) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0275, code lost:
    
        if (r6.trackTransactionDidSucceed(r3, r5, r4, r0, r12) == r10) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object didPurchase(com.superwall.sdk.store.abstractions.product.StoreProduct r19, com.superwall.sdk.store.transactions.TransactionManager.PurchaseSource r20, boolean r21, com.android.billingclient.api.Purchase r22, kotlin.coroutines.d<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.store.transactions.TransactionManager.didPurchase(com.superwall.sdk.store.abstractions.product.StoreProduct, com.superwall.sdk.store.transactions.TransactionManager$PurchaseSource, boolean, com.android.billingclient.api.Purchase, kotlin.coroutines.d):java.lang.Object");
    }

    static /* synthetic */ Object didPurchase$default(TransactionManager transactionManager, StoreProduct storeProduct, PurchaseSource purchaseSource, boolean z10, Purchase purchase, d dVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            purchase = null;
        }
        return transactionManager.didPurchase(storeProduct, purchaseSource, z10, purchase, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:46:0x0101  */
    /* JADX WARN: Code duplicated, block: B:55:0x0125  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        if (r2 == r4) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011c, code lost:
    
        if (r1.invoke(r0, r2, r3) == r4) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object didRestore(com.superwall.sdk.store.abstractions.product.StoreProduct r23, com.superwall.sdk.store.transactions.TransactionManager.PurchaseSource r24, kotlin.coroutines.d<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.store.transactions.TransactionManager.didRestore(com.superwall.sdk.store.abstractions.product.StoreProduct, com.superwall.sdk.store.transactions.TransactionManager$PurchaseSource, kotlin.coroutines.d):java.lang.Object");
    }

    static /* synthetic */ Object didRestore$default(TransactionManager transactionManager, StoreProduct storeProduct, PurchaseSource purchaseSource, d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            storeProduct = null;
        }
        return transactionManager.didRestore(storeProduct, purchaseSource, dVar);
    }

    private final boolean getShouldObserveTransactionFinishingAutomatically() {
        return this.factory.makeSuperwallOptions().getShouldObservePurchases();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fa, code lost:
    
        if (r0.invoke(r7, r3) == r4) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handlePendingTransaction(com.superwall.sdk.store.transactions.TransactionManager.PurchaseSource r21, kotlin.coroutines.d<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.store.transactions.TransactionManager.handlePendingTransaction(com.superwall.sdk.store.transactions.TransactionManager$PurchaseSource, kotlin.coroutines.d):java.lang.Object");
    }

    private final void log(LogLevel logLevel, String str, Map<String, ? extends Object> map, Throwable th2) {
        Logger.INSTANCE.debug(logLevel, LogScope.paywallTransactions, str, map, th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void log$default(TransactionManager transactionManager, LogLevel logLevel, String str, Map map, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            logLevel = LogLevel.debug;
        }
        if ((i10 & 4) != 0) {
            map = null;
        }
        if ((i10 & 8) != 0) {
            th2 = null;
        }
        transactionManager.log(logLevel, str, map, th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object presentAlert(Error error, StoreProduct storeProduct, PaywallView paywallView, d<? super Unit> dVar) {
        kotlinx.coroutines.k.f(this.ioScope, null, null, new C27552(storeProduct, paywallView, error, null), 3, null);
        String message = error.getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        PaywallView.showAlert$default(paywallView, "An error occurred", message, null, null, null, null, 60, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009d, code lost:
    
        if (r0.invoke(r1, r13) == r14) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f4, code lost:
    
        if (r0.invoke(r1, r13) == r14) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object trackCancelled(com.superwall.sdk.store.abstractions.product.StoreProduct r23, com.superwall.sdk.store.transactions.TransactionManager.PurchaseSource r24, kotlin.coroutines.d<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.store.transactions.TransactionManager.trackCancelled(com.superwall.sdk.store.abstractions.product.StoreProduct, com.superwall.sdk.store.transactions.TransactionManager$PurchaseSource, kotlin.coroutines.d):java.lang.Object");
    }

    private final void trackFailure(String str, StoreProduct storeProduct, PurchaseSource purchaseSource) {
        if (purchaseSource instanceof PurchaseSource.Internal) {
            log$default(this, null, "Transaction Error: " + str, MapsKt.mapOf(TuplesKt.to(com.planner5d.library.model.manager.statistics.appsflyer.d.a.f202890f, storeProduct.getFullIdentifier()), TuplesKt.to("paywall_vc", ((PurchaseSource.Internal) purchaseSource).getPaywallView())), null, 9, null);
            ScopesKt.launchWithTracking(this.ioScope, new C27601(purchaseSource, str, storeProduct, this, null));
            return;
        }
        if (!(purchaseSource instanceof PurchaseSource.ExternalPurchase) && !(purchaseSource instanceof PurchaseSource.ObserverMode)) {
            throw new k0();
        }
        log$default(this, null, "Transaction Error: " + str, MapsKt.mapOf(TuplesKt.to(com.planner5d.library.model.manager.statistics.appsflyer.d.a.f202890f, storeProduct.getFullIdentifier())), new Error(str), 1, null);
        kotlinx.coroutines.k.f(this.ioScope, null, null, new C27612(str, storeProduct, purchaseSource, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:107:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:110:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:115:0x02e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:121:0x0303  */
    /* JADX WARN: Code duplicated, block: B:127:0x020b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x013d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0144  */
    /* JADX WARN: Code duplicated, block: B:48:0x0150  */
    /* JADX WARN: Code duplicated, block: B:49:0x0155  */
    /* JADX WARN: Code duplicated, block: B:53:0x0183  */
    /* JADX WARN: Code duplicated, block: B:57:0x019f A[PHI: r0 r1 r3 r4 r5
      0x019f: PHI (r0v9 int) = (r0v7 int), (r0v19 int) binds: [B:55:0x019b, B:20:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r1v19 com.superwall.sdk.paywall.presentation.PaywallInfo) = (r1v16 com.superwall.sdk.paywall.presentation.PaywallInfo), (r1v24 com.superwall.sdk.paywall.presentation.PaywallInfo) binds: [B:55:0x019b, B:20:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r3v20 com.superwall.sdk.paywall.view.PaywallView) = (r3v17 com.superwall.sdk.paywall.view.PaywallView), (r3v24 com.superwall.sdk.paywall.view.PaywallView) binds: [B:55:0x019b, B:20:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r4v13 com.superwall.sdk.store.abstractions.product.StoreProduct) = 
      (r4v10 com.superwall.sdk.store.abstractions.product.StoreProduct)
      (r4v16 com.superwall.sdk.store.abstractions.product.StoreProduct)
     binds: [B:55:0x019b, B:20:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x019f: PHI (r5v11 com.superwall.sdk.store.transactions.TransactionManager) = 
      (r5v8 com.superwall.sdk.store.transactions.TransactionManager)
      (r5v13 com.superwall.sdk.store.transactions.TransactionManager)
     binds: [B:55:0x019b, B:20:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01de  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:76:0x0215  */
    /* JADX WARN: Code duplicated, block: B:77:0x021c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0221  */
    /* JADX WARN: Code duplicated, block: B:81:0x0224  */
    /* JADX WARN: Code duplicated, block: B:83:0x0227  */
    /* JADX WARN: Code duplicated, block: B:85:0x022a  */
    /* JADX WARN: Code duplicated, block: B:88:0x023d  */
    /* JADX WARN: Code duplicated, block: B:89:0x023f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02dc, code lost:
    
        if (r1.invoke(r0, r12) == r13) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02fd, code lost:
    
        if (r1.invoke(r0, r12) == r13) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x031c, code lost:
    
        if (r1.invoke(r0, r12) == r13) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01bb, code lost:
    
        if (r1.invoke(r0, r12) == r13) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01bf, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0255, code lost:
    
        if (r1.invoke(r0, r12) == r13) goto L123;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object trackTransactionDidSucceed(com.superwall.sdk.store.abstractions.transactions.StoreTransaction r27, com.superwall.sdk.store.abstractions.product.StoreProduct r28, com.superwall.sdk.store.transactions.TransactionManager.PurchaseSource r29, boolean r30, kotlin.coroutines.d<? super kotlin.Unit> r31) {
        /*
            Method dump skipped, instruction units count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.store.transactions.TransactionManager.trackTransactionDidSucceed(com.superwall.sdk.store.abstractions.transactions.StoreTransaction, com.superwall.sdk.store.abstractions.product.StoreProduct, com.superwall.sdk.store.transactions.TransactionManager$PurchaseSource, boolean, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:83:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:86:0x0307  */
    /* JADX WARN: Code duplicated, block: B:88:0x031b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0333  */
    /* JADX WARN: Code duplicated, block: B:93:0x0342  */
    /* JADX WARN: Code duplicated, block: B:95:0x0353  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x010b -> B:32:0x012f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0171 -> B:40:0x0178). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x017e -> B:42:0x0185). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0235 -> B:64:0x025a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x028d -> B:72:0x0292). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x029c -> B:74:0x02a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x02dc -> B:84:0x0301). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0333 -> B:92:0x0338). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x0342 -> B:94:0x0349). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object handle$superwall_release(@org.jetbrains.annotations.NotNull com.superwall.sdk.delegate.InternalPurchaseResult r24, @org.jetbrains.annotations.NotNull com.superwall.sdk.store.PurchasingObserverState r25, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r26) {
        /*
            Method dump skipped, instruction units count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.store.transactions.TransactionManager.handle$superwall_release(com.superwall.sdk.delegate.InternalPurchaseResult, com.superwall.sdk.store.PurchasingObserverState, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a1, code lost:
    
        if (r2.invoke(r1, r13) == r14) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x015b, code lost:
    
        if (r0.invoke(r1, r13) == r14) goto L49;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object prepareToPurchase$superwall_release(@org.jetbrains.annotations.NotNull com.superwall.sdk.store.abstractions.product.StoreProduct r23, @org.jetbrains.annotations.NotNull com.superwall.sdk.store.transactions.TransactionManager.PurchaseSource r24, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.store.transactions.TransactionManager.prepareToPurchase$superwall_release(com.superwall.sdk.store.abstractions.product.StoreProduct, com.superwall.sdk.store.transactions.TransactionManager$PurchaseSource, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x028d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:102:0x028e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0188  */
    /* JADX WARN: Code duplicated, block: B:52:0x0197  */
    /* JADX WARN: Code duplicated, block: B:59:0x01af  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:72:0x01da  */
    /* JADX WARN: Code duplicated, block: B:74:0x01de  */
    /* JADX WARN: Code duplicated, block: B:77:0x0203  */
    /* JADX WARN: Code duplicated, block: B:80:0x0216 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x0247  */
    /* JADX WARN: Code duplicated, block: B:88:0x0256  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0260  */
    /* JADX WARN: Code duplicated, block: B:92:0x0264  */
    /* JADX WARN: Code duplicated, block: B:95:0x0276 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:96:0x0277  */
    /* JADX WARN: Code duplicated, block: B:98:0x027b  */
    @Nullable
    public final Object purchase(@NotNull PurchaseSource purchaseSource, @NotNull d<? super PurchaseResult> dVar) {
        C27561 c27561;
        StoreProduct product;
        RawStoreProduct rawStoreProduct;
        TransactionManager transactionManager;
        Activity activity;
        z zVar;
        PurchaseSource purchaseSource2;
        StoreProduct storeProduct;
        Object objPurchase;
        PurchaseSource purchaseSource3;
        TransactionManager transactionManager2;
        RawStoreProduct rawStoreProduct2;
        StoreProduct storeProduct2;
        PurchaseResult purchaseResult;
        boolean z10;
        boolean shouldShowPurchaseFailureAlert;
        TransactionManager transactionManager3;
        StoreProduct storeProduct3;
        PurchaseSource purchaseSource4;
        boolean z11;
        if (dVar instanceof C27561) {
            c27561 = (C27561) dVar;
            int i10 = c27561.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c27561.label = i10 - Integer.MIN_VALUE;
            } else {
                c27561 = new C27561(dVar);
            }
        } else {
            c27561 = new C27561(dVar);
        }
        C27561 c27562 = c27561;
        Object objMakeTriggers = c27562.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        switch (c27562.label) {
            case 0:
                ResultKt.m(objMakeTriggers);
                if (purchaseSource instanceof PurchaseSource.Internal) {
                    PurchaseSource.Internal internal = (PurchaseSource.Internal) purchaseSource;
                    product = this.storeManager.getProductsByFullId().get(internal.getProductId());
                    if (product == null) {
                        log$default(this, LogLevel.error, "Trying to purchase (" + internal.getProductId() + ") but the product has failed to load. Visit https://superwall.com/l/missing-products to diagnose.", null, null, 12, null);
                        return new PurchaseResult.Failed("Product not found");
                    }
                } else if (purchaseSource instanceof PurchaseSource.ExternalPurchase) {
                    product = ((PurchaseSource.ExternalPurchase) purchaseSource).getProduct();
                } else {
                    if (!(purchaseSource instanceof PurchaseSource.ObserverMode)) {
                        throw new k0();
                    }
                    product = ((PurchaseSource.ObserverMode) purchaseSource).getProduct();
                }
                StoreProduct storeProduct4 = product;
                rawStoreProduct = storeProduct4.getRawStoreProduct();
                log$default(this, null, "!!! Purchasing product " + rawStoreProduct.getHasFreeTrial(), null, null, 13, null);
                z underlyingProductDetails = rawStoreProduct.getUnderlyingProductDetails();
                Activity currentActivity = this.activityProvider.getCurrentActivity();
                if (currentActivity == null) {
                    return new PurchaseResult.Failed("Activity not found - required for starting the billing flow");
                }
                c27562.L$0 = this;
                c27562.L$1 = purchaseSource;
                c27562.L$2 = storeProduct4;
                c27562.L$3 = rawStoreProduct;
                c27562.L$4 = underlyingProductDetails;
                c27562.L$5 = currentActivity;
                c27562.label = 1;
                if (prepareToPurchase$superwall_release(storeProduct4, purchaseSource, c27562) != objL) {
                    transactionManager = this;
                    activity = currentActivity;
                    zVar = underlyingProductDetails;
                    purchaseSource2 = purchaseSource;
                    storeProduct = storeProduct4;
                    InternalPurchaseController purchaseController = transactionManager.storeManager.getPurchaseController();
                    String offerId$superwall_release = rawStoreProduct.getOfferId$superwall_release();
                    String basePlanId = rawStoreProduct.getBasePlanId();
                    c27562.L$0 = transactionManager;
                    c27562.L$1 = purchaseSource2;
                    c27562.L$2 = storeProduct;
                    c27562.L$3 = rawStoreProduct;
                    c27562.L$4 = null;
                    c27562.L$5 = null;
                    c27562.label = 2;
                    objPurchase = purchaseController.purchase(activity, zVar, basePlanId, offerId$superwall_release, c27562);
                    if (objPurchase != objL) {
                        purchaseSource3 = purchaseSource2;
                        objMakeTriggers = objPurchase;
                        transactionManager2 = transactionManager;
                        rawStoreProduct2 = rawStoreProduct;
                        storeProduct2 = storeProduct;
                        purchaseResult = (PurchaseResult) objMakeTriggers;
                        if (!(purchaseSource3 instanceof PurchaseSource.ExternalPurchase) && transactionManager2.factory.makeHasExternalPurchaseController() && !transactionManager2.factory.makeHasInternalPurchaseController()) {
                            return purchaseResult;
                        }
                        if (rawStoreProduct2.getSelectedOffer() != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (purchaseResult instanceof PurchaseResult.Purchased) {
                            if (z10 || !storeProduct2.getHasFreeTrial()) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            c27562.L$0 = purchaseResult;
                            c27562.L$1 = null;
                            c27562.L$2 = null;
                            c27562.L$3 = null;
                            c27562.label = 3;
                            if (didPurchase$default(transactionManager2, storeProduct2, purchaseSource3, z11, null, c27562, 8, null) != objL) {
                                return purchaseResult;
                            }
                        } else if (purchaseResult instanceof PurchaseResult.Failed) {
                            shouldShowPurchaseFailureAlert = transactionManager2.factory.makeSuperwallOptions().getPaywalls().getShouldShowPurchaseFailureAlert();
                            Factory factory = transactionManager2.factory;
                            c27562.L$0 = transactionManager2;
                            c27562.L$1 = purchaseSource3;
                            c27562.L$2 = storeProduct2;
                            c27562.L$3 = purchaseResult;
                            c27562.Z$0 = shouldShowPurchaseFailureAlert;
                            c27562.label = 4;
                            objMakeTriggers = factory.makeTriggers(c27562);
                            if (objMakeTriggers != objL) {
                                PurchaseSource purchaseSource5 = purchaseSource3;
                                transactionManager3 = transactionManager2;
                                storeProduct3 = storeProduct2;
                                purchaseSource4 = purchaseSource5;
                                boolean zContains = ((Set) objMakeTriggers).contains(SuperwallEvents.TransactionFail.getRawName());
                                if (shouldShowPurchaseFailureAlert || zContains) {
                                    transactionManager3.trackFailure(((PurchaseResult.Failed) purchaseResult).getErrorMessage(), storeProduct3, purchaseSource4);
                                    if (purchaseSource4 instanceof PurchaseSource.Internal) {
                                        ((PurchaseSource.Internal) purchaseSource4).getPaywallView().togglePaywallSpinner(true);
                                    }
                                } else {
                                    PurchaseResult.Failed failed = (PurchaseResult.Failed) purchaseResult;
                                    transactionManager3.trackFailure(failed.getErrorMessage(), storeProduct3, purchaseSource4);
                                    if (purchaseSource4 instanceof PurchaseSource.Internal) {
                                        Error error = new Error(failed.getErrorMessage());
                                        PaywallView paywallView = ((PurchaseSource.Internal) purchaseSource4).getPaywallView();
                                        c27562.L$0 = purchaseResult;
                                        c27562.L$1 = null;
                                        c27562.L$2 = null;
                                        c27562.L$3 = null;
                                        c27562.label = 5;
                                        if (transactionManager3.presentAlert(error, storeProduct3, paywallView, c27562) == objL) {
                                        }
                                    }
                                }
                                return purchaseResult;
                            }
                        } else if (purchaseResult instanceof PurchaseResult.Pending) {
                            c27562.L$0 = purchaseResult;
                            c27562.L$1 = null;
                            c27562.L$2 = null;
                            c27562.L$3 = null;
                            c27562.label = 6;
                            if (transactionManager2.handlePendingTransaction(purchaseSource3, c27562) != objL) {
                                return purchaseResult;
                            }
                        } else {
                            if (!(purchaseResult instanceof PurchaseResult.Cancelled)) {
                                throw new k0();
                            }
                            c27562.L$0 = purchaseResult;
                            c27562.L$1 = null;
                            c27562.L$2 = null;
                            c27562.L$3 = null;
                            c27562.label = 7;
                            if (transactionManager2.trackCancelled(storeProduct2, purchaseSource3, c27562) != objL) {
                                return purchaseResult;
                            }
                        }
                    }
                }
                return objL;
            case 1:
                Activity activity2 = (Activity) c27562.L$5;
                z zVar2 = (z) c27562.L$4;
                RawStoreProduct rawStoreProduct3 = (RawStoreProduct) c27562.L$3;
                StoreProduct storeProduct5 = (StoreProduct) c27562.L$2;
                PurchaseSource purchaseSource6 = (PurchaseSource) c27562.L$1;
                TransactionManager transactionManager4 = (TransactionManager) c27562.L$0;
                ResultKt.m(objMakeTriggers);
                rawStoreProduct = rawStoreProduct3;
                purchaseSource2 = purchaseSource6;
                zVar = zVar2;
                storeProduct = storeProduct5;
                activity = activity2;
                transactionManager = transactionManager4;
                InternalPurchaseController purchaseController2 = transactionManager.storeManager.getPurchaseController();
                String offerId$superwall_release2 = rawStoreProduct.getOfferId$superwall_release();
                String basePlanId2 = rawStoreProduct.getBasePlanId();
                c27562.L$0 = transactionManager;
                c27562.L$1 = purchaseSource2;
                c27562.L$2 = storeProduct;
                c27562.L$3 = rawStoreProduct;
                c27562.L$4 = null;
                c27562.L$5 = null;
                c27562.label = 2;
                objPurchase = purchaseController2.purchase(activity, zVar, basePlanId2, offerId$superwall_release2, c27562);
                if (objPurchase != objL) {
                    purchaseSource3 = purchaseSource2;
                    objMakeTriggers = objPurchase;
                    transactionManager2 = transactionManager;
                    rawStoreProduct2 = rawStoreProduct;
                    storeProduct2 = storeProduct;
                    purchaseResult = (PurchaseResult) objMakeTriggers;
                    if (!(purchaseSource3 instanceof PurchaseSource.ExternalPurchase)) {
                    }
                    if (rawStoreProduct2.getSelectedOffer() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (purchaseResult instanceof PurchaseResult.Purchased) {
                        if (z10) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        c27562.L$0 = purchaseResult;
                        c27562.L$1 = null;
                        c27562.L$2 = null;
                        c27562.L$3 = null;
                        c27562.label = 3;
                        if (didPurchase$default(transactionManager2, storeProduct2, purchaseSource3, z11, null, c27562, 8, null) != objL) {
                            return purchaseResult;
                        }
                    } else if (purchaseResult instanceof PurchaseResult.Failed) {
                        shouldShowPurchaseFailureAlert = transactionManager2.factory.makeSuperwallOptions().getPaywalls().getShouldShowPurchaseFailureAlert();
                        Factory factory2 = transactionManager2.factory;
                        c27562.L$0 = transactionManager2;
                        c27562.L$1 = purchaseSource3;
                        c27562.L$2 = storeProduct2;
                        c27562.L$3 = purchaseResult;
                        c27562.Z$0 = shouldShowPurchaseFailureAlert;
                        c27562.label = 4;
                        objMakeTriggers = factory2.makeTriggers(c27562);
                        if (objMakeTriggers != objL) {
                            PurchaseSource purchaseSource7 = purchaseSource3;
                            transactionManager3 = transactionManager2;
                            storeProduct3 = storeProduct2;
                            purchaseSource4 = purchaseSource7;
                            boolean zContains2 = ((Set) objMakeTriggers).contains(SuperwallEvents.TransactionFail.getRawName());
                            if (shouldShowPurchaseFailureAlert) {
                                transactionManager3.trackFailure(((PurchaseResult.Failed) purchaseResult).getErrorMessage(), storeProduct3, purchaseSource4);
                                if (purchaseSource4 instanceof PurchaseSource.Internal) {
                                    ((PurchaseSource.Internal) purchaseSource4).getPaywallView().togglePaywallSpinner(true);
                                }
                            } else {
                                transactionManager3.trackFailure(((PurchaseResult.Failed) purchaseResult).getErrorMessage(), storeProduct3, purchaseSource4);
                                if (purchaseSource4 instanceof PurchaseSource.Internal) {
                                    ((PurchaseSource.Internal) purchaseSource4).getPaywallView().togglePaywallSpinner(true);
                                }
                            }
                            return purchaseResult;
                        }
                    } else if (purchaseResult instanceof PurchaseResult.Pending) {
                        c27562.L$0 = purchaseResult;
                        c27562.L$1 = null;
                        c27562.L$2 = null;
                        c27562.L$3 = null;
                        c27562.label = 6;
                        if (transactionManager2.handlePendingTransaction(purchaseSource3, c27562) != objL) {
                            return purchaseResult;
                        }
                    } else {
                        if (!(purchaseResult instanceof PurchaseResult.Cancelled)) {
                            throw new k0();
                        }
                        c27562.L$0 = purchaseResult;
                        c27562.L$1 = null;
                        c27562.L$2 = null;
                        c27562.L$3 = null;
                        c27562.label = 7;
                        if (transactionManager2.trackCancelled(storeProduct2, purchaseSource3, c27562) != objL) {
                            return purchaseResult;
                        }
                    }
                    break;
                }
                return objL;
            case 2:
                rawStoreProduct2 = (RawStoreProduct) c27562.L$3;
                storeProduct = (StoreProduct) c27562.L$2;
                PurchaseSource purchaseSource8 = (PurchaseSource) c27562.L$1;
                TransactionManager transactionManager5 = (TransactionManager) c27562.L$0;
                ResultKt.m(objMakeTriggers);
                purchaseSource3 = purchaseSource8;
                transactionManager2 = transactionManager5;
                storeProduct2 = storeProduct;
                purchaseResult = (PurchaseResult) objMakeTriggers;
                if (!(purchaseSource3 instanceof PurchaseSource.ExternalPurchase)) {
                    break;
                }
                if (rawStoreProduct2.getSelectedOffer() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (purchaseResult instanceof PurchaseResult.Purchased) {
                    if (z10) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    c27562.L$0 = purchaseResult;
                    c27562.L$1 = null;
                    c27562.L$2 = null;
                    c27562.L$3 = null;
                    c27562.label = 3;
                    if (didPurchase$default(transactionManager2, storeProduct2, purchaseSource3, z11, null, c27562, 8, null) != objL) {
                        return purchaseResult;
                    }
                } else if (purchaseResult instanceof PurchaseResult.Failed) {
                    shouldShowPurchaseFailureAlert = transactionManager2.factory.makeSuperwallOptions().getPaywalls().getShouldShowPurchaseFailureAlert();
                    Factory factory3 = transactionManager2.factory;
                    c27562.L$0 = transactionManager2;
                    c27562.L$1 = purchaseSource3;
                    c27562.L$2 = storeProduct2;
                    c27562.L$3 = purchaseResult;
                    c27562.Z$0 = shouldShowPurchaseFailureAlert;
                    c27562.label = 4;
                    objMakeTriggers = factory3.makeTriggers(c27562);
                    if (objMakeTriggers != objL) {
                        PurchaseSource purchaseSource9 = purchaseSource3;
                        transactionManager3 = transactionManager2;
                        storeProduct3 = storeProduct2;
                        purchaseSource4 = purchaseSource9;
                        boolean zContains3 = ((Set) objMakeTriggers).contains(SuperwallEvents.TransactionFail.getRawName());
                        if (shouldShowPurchaseFailureAlert) {
                            transactionManager3.trackFailure(((PurchaseResult.Failed) purchaseResult).getErrorMessage(), storeProduct3, purchaseSource4);
                            if (purchaseSource4 instanceof PurchaseSource.Internal) {
                                ((PurchaseSource.Internal) purchaseSource4).getPaywallView().togglePaywallSpinner(true);
                            }
                        } else {
                            transactionManager3.trackFailure(((PurchaseResult.Failed) purchaseResult).getErrorMessage(), storeProduct3, purchaseSource4);
                            if (purchaseSource4 instanceof PurchaseSource.Internal) {
                                ((PurchaseSource.Internal) purchaseSource4).getPaywallView().togglePaywallSpinner(true);
                            }
                        }
                        return purchaseResult;
                    }
                } else if (purchaseResult instanceof PurchaseResult.Pending) {
                    c27562.L$0 = purchaseResult;
                    c27562.L$1 = null;
                    c27562.L$2 = null;
                    c27562.L$3 = null;
                    c27562.label = 6;
                    if (transactionManager2.handlePendingTransaction(purchaseSource3, c27562) != objL) {
                        return purchaseResult;
                    }
                } else {
                    if (!(purchaseResult instanceof PurchaseResult.Cancelled)) {
                        throw new k0();
                    }
                    c27562.L$0 = purchaseResult;
                    c27562.L$1 = null;
                    c27562.L$2 = null;
                    c27562.L$3 = null;
                    c27562.label = 7;
                    if (transactionManager2.trackCancelled(storeProduct2, purchaseSource3, c27562) != objL) {
                        return purchaseResult;
                    }
                }
                return objL;
            case 3:
                PurchaseResult purchaseResult2 = (PurchaseResult) c27562.L$0;
                ResultKt.m(objMakeTriggers);
                return purchaseResult2;
            case 4:
                shouldShowPurchaseFailureAlert = c27562.Z$0;
                purchaseResult = (PurchaseResult) c27562.L$3;
                storeProduct3 = (StoreProduct) c27562.L$2;
                purchaseSource4 = (PurchaseSource) c27562.L$1;
                transactionManager3 = (TransactionManager) c27562.L$0;
                ResultKt.m(objMakeTriggers);
                boolean zContains4 = ((Set) objMakeTriggers).contains(SuperwallEvents.TransactionFail.getRawName());
                if (shouldShowPurchaseFailureAlert) {
                    transactionManager3.trackFailure(((PurchaseResult.Failed) purchaseResult).getErrorMessage(), storeProduct3, purchaseSource4);
                    if (purchaseSource4 instanceof PurchaseSource.Internal) {
                        ((PurchaseSource.Internal) purchaseSource4).getPaywallView().togglePaywallSpinner(true);
                    }
                } else {
                    transactionManager3.trackFailure(((PurchaseResult.Failed) purchaseResult).getErrorMessage(), storeProduct3, purchaseSource4);
                    if (purchaseSource4 instanceof PurchaseSource.Internal) {
                        ((PurchaseSource.Internal) purchaseSource4).getPaywallView().togglePaywallSpinner(true);
                    }
                }
                return purchaseResult;
            case 5:
                PurchaseResult purchaseResult3 = (PurchaseResult) c27562.L$0;
                ResultKt.m(objMakeTriggers);
                return purchaseResult3;
            case 6:
                PurchaseResult purchaseResult4 = (PurchaseResult) c27562.L$0;
                ResultKt.m(objMakeTriggers);
                return purchaseResult4;
            case 7:
                PurchaseResult purchaseResult5 = (PurchaseResult) c27562.L$0;
                ResultKt.m(objMakeTriggers);
                return purchaseResult5;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x024d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0253  */
    /* JADX WARN: Code duplicated, block: B:106:0x0257 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0259  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:37:0x010a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x0151  */
    /* JADX WARN: Code duplicated, block: B:54:0x0159  */
    /* JADX WARN: Code duplicated, block: B:55:0x015c  */
    /* JADX WARN: Code duplicated, block: B:57:0x015f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0165  */
    /* JADX WARN: Code duplicated, block: B:61:0x016b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:96:0x022a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0230  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    @Nullable
    public final Object tryToRestorePurchases(@Nullable PaywallView paywallView, @NotNull d<? super RestorationResult> dVar) {
        C27631 c27631;
        PaywallInfo paywallInfoEmpty;
        TransactionManager transactionManager;
        TransactionManager transactionManager2;
        PaywallView paywallView2;
        RestorationResult restorationResult;
        ?? r14;
        SubscriptionStatus subscriptionStatusInvoke;
        boolean z10;
        StoreManager storeManager;
        PaywallView paywallView3;
        int i10;
        ?? r15;
        boolean zIsWebToAppEnabled;
        List listEmptyList;
        SubscriptionStatus.Active active;
        Set<Entitlement> setEmptySet;
        String localizedMessage;
        String str;
        Throwable error;
        Function2<TrackableSuperwallEvent, d<? super Unit>, Object> function2;
        InternalSuperwallEvent.Restore restore;
        PaywallInfo paywallInfoEmpty2;
        RestorationResult restorationResult2;
        boolean z11;
        PaywallView paywallView4;
        TransactionManager transactionManager3;
        PaywallInfo paywallInfoEmpty3;
        RestorationResult restorationResult3;
        PaywallView paywallView5;
        TransactionManager transactionManager4;
        Paywall paywall;
        List<String> productIds;
        PurchaseSource.Internal internal;
        if (dVar instanceof C27631) {
            c27631 = (C27631) dVar;
            int i11 = c27631.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c27631.label = i11 - Integer.MIN_VALUE;
            } else {
                c27631 = new C27631(dVar);
            }
        } else {
            c27631 = new C27631(dVar);
        }
        Object objRestorePurchases = c27631.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        switch (c27631.label) {
            case 0:
                ResultKt.m(objRestorePurchases);
                log$default(this, null, "Attempting Restore", null, null, 13, null);
                this.lastPaywallView = paywallView;
                if (paywallView == null || (paywallInfoEmpty = paywallView.getInfo()) == null) {
                    paywallInfoEmpty = PaywallInfo.Companion.empty();
                }
                if (paywallView != null) {
                    paywallView.setLoadingState(new PaywallLoadingState.LoadingPurchase());
                }
                Function2<TrackableSuperwallEvent, d<? super Unit>, Object> function3 = this.track;
                InternalSuperwallEvent.Restore restore2 = new InternalSuperwallEvent.Restore(InternalSuperwallEvent.Restore.State.Start.INSTANCE, paywallInfoEmpty);
                c27631.L$0 = this;
                c27631.L$1 = paywallView;
                c27631.label = 1;
                if (function3.invoke(restore2, c27631) != objL) {
                    transactionManager = this;
                    PurchaseController purchaseController = transactionManager.purchaseController;
                    c27631.L$0 = transactionManager;
                    c27631.L$1 = paywallView;
                    c27631.label = 2;
                    objRestorePurchases = purchaseController.restorePurchases(c27631);
                    if (objRestorePurchases != objL) {
                        transactionManager2 = transactionManager;
                        paywallView2 = paywallView;
                        restorationResult = (RestorationResult) objRestorePurchases;
                        r14 = restorationResult instanceof RestorationResult.Restored;
                        subscriptionStatusInvoke = transactionManager2.subscriptionStatus.invoke();
                        z10 = subscriptionStatusInvoke instanceof SubscriptionStatus.Active;
                        storeManager = transactionManager2.storeManager;
                        c27631.L$0 = transactionManager2;
                        c27631.L$1 = paywallView2;
                        c27631.L$2 = restorationResult;
                        c27631.L$3 = subscriptionStatusInvoke;
                        c27631.I$0 = r14;
                        c27631.I$1 = z10 ? 1 : 0;
                        c27631.label = 3;
                        if (storeManager.loadPurchasedProducts(c27631) != objL) {
                            paywallView3 = paywallView2;
                            i10 = z10 ? 1 : 0;
                            r15 = r14;
                            zIsWebToAppEnabled = transactionManager2.factory.isWebToAppEnabled();
                            if (paywallView3 != null || (paywall = paywallView3.getPaywall()) == null || (productIds = paywall.getProductIds()) == null) {
                                listEmptyList = CollectionsKt.emptyList();
                            } else {
                                List<String> list = productIds;
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(transactionManager2.entitlementsById.invoke((String) it.next()));
                                }
                                listEmptyList = CollectionsKt.flatten(arrayList);
                                if (listEmptyList == null) {
                                    listEmptyList = CollectionsKt.emptyList();
                                }
                            }
                            if (subscriptionStatusInvoke instanceof SubscriptionStatus.Active) {
                                active = (SubscriptionStatus.Active) subscriptionStatusInvoke;
                            } else {
                                active = null;
                            }
                            if (active != null || (setEmptySet = active.getEntitlements()) == null) {
                                setEmptySet = SetsKt.emptySet();
                            }
                            if (r15 != 0 || i10 == 0) {
                                if (r15 == 0 && i10 == 0) {
                                    str = " The user's subscription status is \"inactive\", but the restoration result is \"restored\". Ensure the subscription status is active before confirming successful restoration.";
                                } else {
                                    if ((restorationResult instanceof RestorationResult.Failed) || (error = ((RestorationResult.Failed) restorationResult).getError()) == null) {
                                        localizedMessage = null;
                                    } else {
                                        localizedMessage = error.getLocalizedMessage();
                                    }
                                    str = " Original restoration error message: " + localizedMessage;
                                }
                                String str2 = "Transactions Failed to Restore." + str;
                                log$default(transactionManager2, null, str2, null, null, 13, null);
                                function2 = transactionManager2.track;
                                InternalSuperwallEvent.Restore.State.Failure failure = new InternalSuperwallEvent.Restore.State.Failure(str2);
                                if (paywallView3 != null || (paywallInfoEmpty2 = paywallView3.getInfo()) == null) {
                                    paywallInfoEmpty2 = PaywallInfo.Companion.empty();
                                }
                                restore = new InternalSuperwallEvent.Restore(failure, paywallInfoEmpty2);
                                c27631.L$0 = transactionManager2;
                                c27631.L$1 = paywallView3;
                                c27631.L$2 = restorationResult;
                                c27631.L$3 = null;
                                c27631.Z$0 = zIsWebToAppEnabled;
                                c27631.label = 6;
                                if (function2.invoke(restore, c27631) != objL) {
                                    restorationResult2 = restorationResult;
                                    z11 = zIsWebToAppEnabled;
                                    paywallView4 = paywallView3;
                                    transactionManager3 = transactionManager2;
                                    if (z11) {
                                        transactionManager3.askToRestoreFromWeb();
                                        return restorationResult2;
                                    }
                                    if (paywallView4 != null) {
                                        PaywallView.showAlert$default(paywallView4, transactionManager3.factory.makeSuperwallOptions().getPaywalls().getRestoreFailed().getTitle(), transactionManager3.factory.makeSuperwallOptions().getPaywalls().getRestoreFailed().getMessage(), null, transactionManager3.factory.makeSuperwallOptions().getPaywalls().getRestoreFailed().getCloseButtonTitle(), null, null, 52, null);
                                    }
                                    return restorationResult2;
                                }
                            } else {
                                if (!setEmptySet.containsAll(listEmptyList) && zIsWebToAppEnabled) {
                                    if (paywallView3 != null) {
                                        paywallView3.setLoadingState(new PaywallLoadingState.Ready());
                                    }
                                    transactionManager2.askToRestoreFromWeb();
                                    return restorationResult;
                                }
                                log$default(transactionManager2, null, "Transactions Restored", null, null, 13, null);
                                Function2<TrackableSuperwallEvent, d<? super Unit>, Object> function4 = transactionManager2.track;
                                InternalSuperwallEvent.Restore.State.Complete complete = InternalSuperwallEvent.Restore.State.Complete.INSTANCE;
                                if (paywallView3 == null || (paywallInfoEmpty3 = paywallView3.getInfo()) == null) {
                                    paywallInfoEmpty3 = PaywallInfo.Companion.empty();
                                }
                                InternalSuperwallEvent.Restore restore3 = new InternalSuperwallEvent.Restore(complete, paywallInfoEmpty3);
                                c27631.L$0 = transactionManager2;
                                c27631.L$1 = paywallView3;
                                c27631.L$2 = restorationResult;
                                c27631.L$3 = null;
                                c27631.label = 4;
                                if (function4.invoke(restore3, c27631) != objL) {
                                    restorationResult3 = restorationResult;
                                    paywallView5 = paywallView3;
                                    transactionManager4 = transactionManager2;
                                    if (paywallView5 != null) {
                                        internal = new PurchaseSource.Internal("", paywallView5);
                                        c27631.L$0 = restorationResult3;
                                        c27631.L$1 = null;
                                        c27631.L$2 = null;
                                        c27631.label = 5;
                                        if (transactionManager4.didRestore(null, internal, c27631) == objL) {
                                        }
                                    }
                                    return restorationResult3;
                                }
                            }
                        }
                    }
                }
                return objL;
            case 1:
                paywallView = (PaywallView) c27631.L$1;
                transactionManager = (TransactionManager) c27631.L$0;
                ResultKt.m(objRestorePurchases);
                PurchaseController purchaseController2 = transactionManager.purchaseController;
                c27631.L$0 = transactionManager;
                c27631.L$1 = paywallView;
                c27631.label = 2;
                objRestorePurchases = purchaseController2.restorePurchases(c27631);
                if (objRestorePurchases != objL) {
                    transactionManager2 = transactionManager;
                    paywallView2 = paywallView;
                    restorationResult = (RestorationResult) objRestorePurchases;
                    r14 = restorationResult instanceof RestorationResult.Restored;
                    subscriptionStatusInvoke = transactionManager2.subscriptionStatus.invoke();
                    z10 = subscriptionStatusInvoke instanceof SubscriptionStatus.Active;
                    storeManager = transactionManager2.storeManager;
                    c27631.L$0 = transactionManager2;
                    c27631.L$1 = paywallView2;
                    c27631.L$2 = restorationResult;
                    c27631.L$3 = subscriptionStatusInvoke;
                    c27631.I$0 = r14;
                    c27631.I$1 = z10 ? 1 : 0;
                    c27631.label = 3;
                    if (storeManager.loadPurchasedProducts(c27631) != objL) {
                        paywallView3 = paywallView2;
                        i10 = z10 ? 1 : 0;
                        r15 = r14;
                        zIsWebToAppEnabled = transactionManager2.factory.isWebToAppEnabled();
                        if (paywallView3 != null) {
                            listEmptyList = CollectionsKt.emptyList();
                        } else {
                            listEmptyList = CollectionsKt.emptyList();
                        }
                        if (subscriptionStatusInvoke instanceof SubscriptionStatus.Active) {
                            active = (SubscriptionStatus.Active) subscriptionStatusInvoke;
                        } else {
                            active = null;
                        }
                        if (active != null) {
                            setEmptySet = SetsKt.emptySet();
                        } else {
                            setEmptySet = SetsKt.emptySet();
                        }
                        if (r15 != 0) {
                            if (r15 == 0) {
                                if (restorationResult instanceof RestorationResult.Failed) {
                                    localizedMessage = null;
                                } else {
                                    localizedMessage = null;
                                }
                                str = " Original restoration error message: " + localizedMessage;
                            } else {
                                if (restorationResult instanceof RestorationResult.Failed) {
                                    localizedMessage = null;
                                } else {
                                    localizedMessage = null;
                                }
                                str = " Original restoration error message: " + localizedMessage;
                            }
                            String str3 = "Transactions Failed to Restore." + str;
                            log$default(transactionManager2, null, str3, null, null, 13, null);
                            function2 = transactionManager2.track;
                            InternalSuperwallEvent.Restore.State.Failure failure2 = new InternalSuperwallEvent.Restore.State.Failure(str3);
                            if (paywallView3 != null) {
                                paywallInfoEmpty2 = PaywallInfo.Companion.empty();
                            } else {
                                paywallInfoEmpty2 = PaywallInfo.Companion.empty();
                            }
                            restore = new InternalSuperwallEvent.Restore(failure2, paywallInfoEmpty2);
                            c27631.L$0 = transactionManager2;
                            c27631.L$1 = paywallView3;
                            c27631.L$2 = restorationResult;
                            c27631.L$3 = null;
                            c27631.Z$0 = zIsWebToAppEnabled;
                            c27631.label = 6;
                            if (function2.invoke(restore, c27631) != objL) {
                                restorationResult2 = restorationResult;
                                z11 = zIsWebToAppEnabled;
                                paywallView4 = paywallView3;
                                transactionManager3 = transactionManager2;
                                if (z11) {
                                    transactionManager3.askToRestoreFromWeb();
                                    return restorationResult2;
                                }
                                if (paywallView4 != null) {
                                    PaywallView.showAlert$default(paywallView4, transactionManager3.factory.makeSuperwallOptions().getPaywalls().getRestoreFailed().getTitle(), transactionManager3.factory.makeSuperwallOptions().getPaywalls().getRestoreFailed().getMessage(), null, transactionManager3.factory.makeSuperwallOptions().getPaywalls().getRestoreFailed().getCloseButtonTitle(), null, null, 52, null);
                                }
                                return restorationResult2;
                            }
                        } else {
                            if (r15 == 0) {
                                if (restorationResult instanceof RestorationResult.Failed) {
                                    localizedMessage = null;
                                } else {
                                    localizedMessage = null;
                                }
                                str = " Original restoration error message: " + localizedMessage;
                            } else {
                                if (restorationResult instanceof RestorationResult.Failed) {
                                    localizedMessage = null;
                                } else {
                                    localizedMessage = null;
                                }
                                str = " Original restoration error message: " + localizedMessage;
                            }
                            String str4 = "Transactions Failed to Restore." + str;
                            log$default(transactionManager2, null, str4, null, null, 13, null);
                            function2 = transactionManager2.track;
                            InternalSuperwallEvent.Restore.State.Failure failure3 = new InternalSuperwallEvent.Restore.State.Failure(str4);
                            if (paywallView3 != null) {
                                paywallInfoEmpty2 = PaywallInfo.Companion.empty();
                            } else {
                                paywallInfoEmpty2 = PaywallInfo.Companion.empty();
                            }
                            restore = new InternalSuperwallEvent.Restore(failure3, paywallInfoEmpty2);
                            c27631.L$0 = transactionManager2;
                            c27631.L$1 = paywallView3;
                            c27631.L$2 = restorationResult;
                            c27631.L$3 = null;
                            c27631.Z$0 = zIsWebToAppEnabled;
                            c27631.label = 6;
                            if (function2.invoke(restore, c27631) != objL) {
                                restorationResult2 = restorationResult;
                                z11 = zIsWebToAppEnabled;
                                paywallView4 = paywallView3;
                                transactionManager3 = transactionManager2;
                                if (z11) {
                                    transactionManager3.askToRestoreFromWeb();
                                    return restorationResult2;
                                }
                                if (paywallView4 != null) {
                                    PaywallView.showAlert$default(paywallView4, transactionManager3.factory.makeSuperwallOptions().getPaywalls().getRestoreFailed().getTitle(), transactionManager3.factory.makeSuperwallOptions().getPaywalls().getRestoreFailed().getMessage(), null, transactionManager3.factory.makeSuperwallOptions().getPaywalls().getRestoreFailed().getCloseButtonTitle(), null, null, 52, null);
                                }
                                return restorationResult2;
                            }
                        }
                    }
                }
                return objL;
            case 2:
                paywallView2 = (PaywallView) c27631.L$1;
                TransactionManager transactionManager5 = (TransactionManager) c27631.L$0;
                ResultKt.m(objRestorePurchases);
                transactionManager2 = transactionManager5;
                restorationResult = (RestorationResult) objRestorePurchases;
                r14 = restorationResult instanceof RestorationResult.Restored;
                subscriptionStatusInvoke = transactionManager2.subscriptionStatus.invoke();
                z10 = subscriptionStatusInvoke instanceof SubscriptionStatus.Active;
                storeManager = transactionManager2.storeManager;
                c27631.L$0 = transactionManager2;
                c27631.L$1 = paywallView2;
                c27631.L$2 = restorationResult;
                c27631.L$3 = subscriptionStatusInvoke;
                c27631.I$0 = r14;
                c27631.I$1 = z10 ? 1 : 0;
                c27631.label = 3;
                if (storeManager.loadPurchasedProducts(c27631) != objL) {
                    paywallView3 = paywallView2;
                    i10 = z10 ? 1 : 0;
                    r15 = r14;
                    zIsWebToAppEnabled = transactionManager2.factory.isWebToAppEnabled();
                    if (paywallView3 != null) {
                        listEmptyList = CollectionsKt.emptyList();
                    } else {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    if (subscriptionStatusInvoke instanceof SubscriptionStatus.Active) {
                        active = (SubscriptionStatus.Active) subscriptionStatusInvoke;
                    } else {
                        active = null;
                    }
                    if (active != null) {
                        setEmptySet = SetsKt.emptySet();
                    } else {
                        setEmptySet = SetsKt.emptySet();
                    }
                    if (r15 != 0) {
                        if (r15 == 0) {
                            if (restorationResult instanceof RestorationResult.Failed) {
                                localizedMessage = null;
                            } else {
                                localizedMessage = null;
                            }
                            str = " Original restoration error message: " + localizedMessage;
                        } else {
                            if (restorationResult instanceof RestorationResult.Failed) {
                                localizedMessage = null;
                            } else {
                                localizedMessage = null;
                            }
                            str = " Original restoration error message: " + localizedMessage;
                        }
                        String str5 = "Transactions Failed to Restore." + str;
                        log$default(transactionManager2, null, str5, null, null, 13, null);
                        function2 = transactionManager2.track;
                        InternalSuperwallEvent.Restore.State.Failure failure4 = new InternalSuperwallEvent.Restore.State.Failure(str5);
                        if (paywallView3 != null) {
                            paywallInfoEmpty2 = PaywallInfo.Companion.empty();
                        } else {
                            paywallInfoEmpty2 = PaywallInfo.Companion.empty();
                        }
                        restore = new InternalSuperwallEvent.Restore(failure4, paywallInfoEmpty2);
                        c27631.L$0 = transactionManager2;
                        c27631.L$1 = paywallView3;
                        c27631.L$2 = restorationResult;
                        c27631.L$3 = null;
                        c27631.Z$0 = zIsWebToAppEnabled;
                        c27631.label = 6;
                        if (function2.invoke(restore, c27631) != objL) {
                            restorationResult2 = restorationResult;
                            z11 = zIsWebToAppEnabled;
                            paywallView4 = paywallView3;
                            transactionManager3 = transactionManager2;
                            if (z11) {
                                transactionManager3.askToRestoreFromWeb();
                                return restorationResult2;
                            }
                            if (paywallView4 != null) {
                                PaywallView.showAlert$default(paywallView4, transactionManager3.factory.makeSuperwallOptions().getPaywalls().getRestoreFailed().getTitle(), transactionManager3.factory.makeSuperwallOptions().getPaywalls().getRestoreFailed().getMessage(), null, transactionManager3.factory.makeSuperwallOptions().getPaywalls().getRestoreFailed().getCloseButtonTitle(), null, null, 52, null);
                            }
                            return restorationResult2;
                        }
                    } else {
                        if (r15 == 0) {
                            if (restorationResult instanceof RestorationResult.Failed) {
                                localizedMessage = null;
                            } else {
                                localizedMessage = null;
                            }
                            str = " Original restoration error message: " + localizedMessage;
                        } else {
                            if (restorationResult instanceof RestorationResult.Failed) {
                                localizedMessage = null;
                            } else {
                                localizedMessage = null;
                            }
                            str = " Original restoration error message: " + localizedMessage;
                        }
                        String str6 = "Transactions Failed to Restore." + str;
                        log$default(transactionManager2, null, str6, null, null, 13, null);
                        function2 = transactionManager2.track;
                        InternalSuperwallEvent.Restore.State.Failure failure5 = new InternalSuperwallEvent.Restore.State.Failure(str6);
                        if (paywallView3 != null) {
                            paywallInfoEmpty2 = PaywallInfo.Companion.empty();
                        } else {
                            paywallInfoEmpty2 = PaywallInfo.Companion.empty();
                        }
                        restore = new InternalSuperwallEvent.Restore(failure5, paywallInfoEmpty2);
                        c27631.L$0 = transactionManager2;
                        c27631.L$1 = paywallView3;
                        c27631.L$2 = restorationResult;
                        c27631.L$3 = null;
                        c27631.Z$0 = zIsWebToAppEnabled;
                        c27631.label = 6;
                        if (function2.invoke(restore, c27631) != objL) {
                            restorationResult2 = restorationResult;
                            z11 = zIsWebToAppEnabled;
                            paywallView4 = paywallView3;
                            transactionManager3 = transactionManager2;
                            if (z11) {
                                transactionManager3.askToRestoreFromWeb();
                                return restorationResult2;
                            }
                            if (paywallView4 != null) {
                                PaywallView.showAlert$default(paywallView4, transactionManager3.factory.makeSuperwallOptions().getPaywalls().getRestoreFailed().getTitle(), transactionManager3.factory.makeSuperwallOptions().getPaywalls().getRestoreFailed().getMessage(), null, transactionManager3.factory.makeSuperwallOptions().getPaywalls().getRestoreFailed().getCloseButtonTitle(), null, null, 52, null);
                            }
                            return restorationResult2;
                        }
                    }
                }
                return objL;
            case 3:
                i10 = c27631.I$1;
                int i12 = c27631.I$0;
                subscriptionStatusInvoke = (SubscriptionStatus) c27631.L$3;
                RestorationResult restorationResult4 = (RestorationResult) c27631.L$2;
                paywallView3 = (PaywallView) c27631.L$1;
                transactionManager2 = (TransactionManager) c27631.L$0;
                ResultKt.m(objRestorePurchases);
                restorationResult = restorationResult4;
                r15 = i12;
                zIsWebToAppEnabled = transactionManager2.factory.isWebToAppEnabled();
                if (paywallView3 != null) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                }
                if (subscriptionStatusInvoke instanceof SubscriptionStatus.Active) {
                    active = (SubscriptionStatus.Active) subscriptionStatusInvoke;
                } else {
                    active = null;
                }
                if (active != null) {
                    setEmptySet = SetsKt.emptySet();
                } else {
                    setEmptySet = SetsKt.emptySet();
                }
                if (r15 != 0) {
                    if (r15 == 0) {
                        if (restorationResult instanceof RestorationResult.Failed) {
                            localizedMessage = null;
                        } else {
                            localizedMessage = null;
                        }
                        str = " Original restoration error message: " + localizedMessage;
                    } else {
                        if (restorationResult instanceof RestorationResult.Failed) {
                            localizedMessage = null;
                        } else {
                            localizedMessage = null;
                        }
                        str = " Original restoration error message: " + localizedMessage;
                    }
                    String str7 = "Transactions Failed to Restore." + str;
                    log$default(transactionManager2, null, str7, null, null, 13, null);
                    function2 = transactionManager2.track;
                    InternalSuperwallEvent.Restore.State.Failure failure6 = new InternalSuperwallEvent.Restore.State.Failure(str7);
                    if (paywallView3 != null) {
                        paywallInfoEmpty2 = PaywallInfo.Companion.empty();
                    } else {
                        paywallInfoEmpty2 = PaywallInfo.Companion.empty();
                    }
                    restore = new InternalSuperwallEvent.Restore(failure6, paywallInfoEmpty2);
                    c27631.L$0 = transactionManager2;
                    c27631.L$1 = paywallView3;
                    c27631.L$2 = restorationResult;
                    c27631.L$3 = null;
                    c27631.Z$0 = zIsWebToAppEnabled;
                    c27631.label = 6;
                    if (function2.invoke(restore, c27631) != objL) {
                        restorationResult2 = restorationResult;
                        z11 = zIsWebToAppEnabled;
                        paywallView4 = paywallView3;
                        transactionManager3 = transactionManager2;
                        if (z11) {
                            transactionManager3.askToRestoreFromWeb();
                            return restorationResult2;
                        }
                        if (paywallView4 != null) {
                            PaywallView.showAlert$default(paywallView4, transactionManager3.factory.makeSuperwallOptions().getPaywalls().getRestoreFailed().getTitle(), transactionManager3.factory.makeSuperwallOptions().getPaywalls().getRestoreFailed().getMessage(), null, transactionManager3.factory.makeSuperwallOptions().getPaywalls().getRestoreFailed().getCloseButtonTitle(), null, null, 52, null);
                        }
                        return restorationResult2;
                    }
                } else {
                    if (r15 == 0) {
                        if (restorationResult instanceof RestorationResult.Failed) {
                            localizedMessage = null;
                        } else {
                            localizedMessage = null;
                        }
                        str = " Original restoration error message: " + localizedMessage;
                    } else {
                        if (restorationResult instanceof RestorationResult.Failed) {
                            localizedMessage = null;
                        } else {
                            localizedMessage = null;
                        }
                        str = " Original restoration error message: " + localizedMessage;
                    }
                    String str8 = "Transactions Failed to Restore." + str;
                    log$default(transactionManager2, null, str8, null, null, 13, null);
                    function2 = transactionManager2.track;
                    InternalSuperwallEvent.Restore.State.Failure failure7 = new InternalSuperwallEvent.Restore.State.Failure(str8);
                    if (paywallView3 != null) {
                        paywallInfoEmpty2 = PaywallInfo.Companion.empty();
                    } else {
                        paywallInfoEmpty2 = PaywallInfo.Companion.empty();
                    }
                    restore = new InternalSuperwallEvent.Restore(failure7, paywallInfoEmpty2);
                    c27631.L$0 = transactionManager2;
                    c27631.L$1 = paywallView3;
                    c27631.L$2 = restorationResult;
                    c27631.L$3 = null;
                    c27631.Z$0 = zIsWebToAppEnabled;
                    c27631.label = 6;
                    if (function2.invoke(restore, c27631) != objL) {
                        restorationResult2 = restorationResult;
                        z11 = zIsWebToAppEnabled;
                        paywallView4 = paywallView3;
                        transactionManager3 = transactionManager2;
                        if (z11) {
                            transactionManager3.askToRestoreFromWeb();
                            return restorationResult2;
                        }
                        if (paywallView4 != null) {
                            PaywallView.showAlert$default(paywallView4, transactionManager3.factory.makeSuperwallOptions().getPaywalls().getRestoreFailed().getTitle(), transactionManager3.factory.makeSuperwallOptions().getPaywalls().getRestoreFailed().getMessage(), null, transactionManager3.factory.makeSuperwallOptions().getPaywalls().getRestoreFailed().getCloseButtonTitle(), null, null, 52, null);
                        }
                        return restorationResult2;
                    }
                }
                return objL;
            case 4:
                restorationResult3 = (RestorationResult) c27631.L$2;
                paywallView5 = (PaywallView) c27631.L$1;
                transactionManager4 = (TransactionManager) c27631.L$0;
                ResultKt.m(objRestorePurchases);
                if (paywallView5 != null) {
                    internal = new PurchaseSource.Internal("", paywallView5);
                    c27631.L$0 = restorationResult3;
                    c27631.L$1 = null;
                    c27631.L$2 = null;
                    c27631.label = 5;
                    if (transactionManager4.didRestore(null, internal, c27631) == objL) {
                        return objL;
                    }
                }
                return restorationResult3;
            case 5:
                RestorationResult restorationResult5 = (RestorationResult) c27631.L$0;
                ResultKt.m(objRestorePurchases);
                return restorationResult5;
            case 6:
                z11 = c27631.Z$0;
                restorationResult2 = (RestorationResult) c27631.L$2;
                paywallView4 = (PaywallView) c27631.L$1;
                transactionManager3 = (TransactionManager) c27631.L$0;
                ResultKt.m(objRestorePurchases);
                if (z11) {
                    transactionManager3.askToRestoreFromWeb();
                    return restorationResult2;
                }
                if (paywallView4 != null) {
                    PaywallView.showAlert$default(paywallView4, transactionManager3.factory.makeSuperwallOptions().getPaywalls().getRestoreFailed().getTitle(), transactionManager3.factory.makeSuperwallOptions().getPaywalls().getRestoreFailed().getMessage(), null, transactionManager3.factory.makeSuperwallOptions().getPaywalls().getRestoreFailed().getCloseButtonTitle(), null, null, 52, null);
                }
                return restorationResult2;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void updatePaymentQueue(@NotNull List<String> removedTransactions) {
        Collection collectionEmptyList;
        Intrinsics.checkNotNullParameter(removedTransactions, "removedTransactions");
        Set set = (Set) this.storage.read(PurchasingProductdIds.INSTANCE);
        if (set != null) {
            collectionEmptyList = new ArrayList();
            for (Object obj : set) {
                String str = (String) obj;
                List<String> list = removedTransactions;
                boolean z10 = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual((String) it.next(), str)) {
                            z10 = true;
                            break;
                        }
                    }
                }
                if (!z10) {
                    collectionEmptyList.add(obj);
                }
            }
        } else {
            collectionEmptyList = CollectionsKt.emptyList();
        }
        this.storage.write(PurchasingProductdIds.INSTANCE, CollectionsKt.toSet(collectionEmptyList));
    }

    public /* synthetic */ TransactionManager(StoreManager storeManager, PurchaseController purchaseController, EventsQueue eventsQueue, Storage storage, ActivityProvider activityProvider, Factory factory, IOScope iOScope, Function2 function2, n nVar, Function0 function0, Function1 function1, Function1 function3, Function0 function4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(storeManager, purchaseController, eventsQueue, storage, activityProvider, factory, iOScope, (i10 & 128) != 0 ? new AnonymousClass1(null) : function2, nVar, (i10 & 512) != 0 ? new Function0() { // from class: com.superwall.sdk.store.transactions.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransactionManager._init_$lambda$0();
            }
        } : function0, function1, function3, function4);
    }
}
