package com.superwall.sdk.paywall.manager;

import android.view.View;
import com.devtodev.core.data.metrics.MetricConsts;
import com.superwall.sdk.dependencies.CacheFactory;
import com.superwall.sdk.dependencies.DeviceHelperFactory;
import com.superwall.sdk.dependencies.SuperwallScopeFactory;
import com.superwall.sdk.dependencies.ViewFactory;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.misc.EitherKt;
import com.superwall.sdk.misc.ScopesKt;
import com.superwall.sdk.models.paywall.Paywall;
import com.superwall.sdk.paywall.request.PaywallRequest;
import com.superwall.sdk.paywall.request.PaywallRequestManager;
import com.superwall.sdk.paywall.view.PaywallView;
import com.superwall.sdk.paywall.view.delegate.PaywallLoadingState;
import com.superwall.sdk.paywall.view.delegate.PaywallViewDelegateAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class PaywallManager {

    @Nullable
    private PaywallViewCache _cache;

    @Nullable
    private PaywallView currentView;

    @NotNull
    private final Factory factory;

    @NotNull
    private final PaywallRequestManager paywallRequestManager;

    public interface Factory extends ViewFactory, CacheFactory, DeviceHelperFactory, SuperwallScopeFactory {
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.manager.PaywallManager$getPaywallView$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.manager.PaywallManager", f = "PaywallManager.kt", i = {0, 0, 0, 0, 0}, l = {78, com.planner5d.library.engine.input.f.b.X}, m = "getPaywallView", n = {"this", "request", "delegate", "isForPresentation", "isPreloading"}, s = {"L$0", "L$1", "L$2", "Z$0", "Z$1"})
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        boolean Z$1;
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
            int i10 = 6 << 0;
            return PaywallManager.this.getPaywallView(null, false, false, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.manager.PaywallManager$getPaywallView$2, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.manager.PaywallManager$getPaywallView$2", f = "PaywallManager.kt", i = {0}, l = {com.planner5d.library.engine.input.f.b.f160718p1}, m = "invokeSuspend", n = {MetricConsts.Install}, s = {"L$0"})
    static final class AnonymousClass2 extends o implements Function2<Paywall, kotlin.coroutines.d<? super PaywallView>, Object> {
        final /* synthetic */ PaywallViewDelegateAdapter $delegate;
        final /* synthetic */ boolean $isForPresentation;
        final /* synthetic */ boolean $isPreloading;
        final /* synthetic */ PaywallRequest $request;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PaywallRequest paywallRequest, PaywallViewDelegateAdapter paywallViewDelegateAdapter, boolean z10, boolean z11, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$request = paywallRequest;
            this.$delegate = paywallViewDelegateAdapter;
            this.$isForPresentation = z10;
            this.$isPreloading = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass2 anonymousClass2 = PaywallManager.this.new AnonymousClass2(this.$request, this.$delegate, this.$isForPresentation, this.$isPreloading, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Paywall paywall, kotlin.coroutines.d<? super PaywallView> dVar) {
            return ((AnonymousClass2) create(paywall, dVar)).invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Paywall paywall;
            PaywallView paywallView;
            Object objL = b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Paywall paywall2 = (Paywall) this.L$0;
                String strKey = PaywallCacheLogic.INSTANCE.key(paywall2.getIdentifier(), PaywallManager.this.factory.makeDeviceInfo().getLocale());
                if (!this.$request.isDebuggerLaunched() && (paywallView = PaywallManager.this.getCache().getPaywallView(strKey)) != null) {
                    boolean z10 = this.$isPreloading;
                    PaywallViewDelegateAdapter paywallViewDelegateAdapter = this.$delegate;
                    if (!z10) {
                        paywallView.setCallback(paywallViewDelegateAdapter);
                        paywallView.getPaywall().update(paywall2);
                    }
                    return paywallView;
                }
                Factory factory = PaywallManager.this.factory;
                PaywallViewCache cache = PaywallManager.this.getCache();
                PaywallViewDelegateAdapter paywallViewDelegateAdapter2 = this.$delegate;
                this.L$0 = paywall2;
                this.label = 1;
                Object objMakePaywallView = factory.makePaywallView(paywall2, cache, paywallViewDelegateAdapter2, this);
                if (objMakePaywallView == objL) {
                    return objL;
                }
                paywall = paywall2;
                obj = objMakePaywallView;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                paywall = (Paywall) this.L$0;
                ResultKt.m(obj);
            }
            PaywallView paywallView2 = (PaywallView) obj;
            PaywallManager.this.getCache().save(paywallView2, paywall.getIdentifier());
            if (this.$isForPresentation && (paywallView2.getLoadingState() instanceof PaywallLoadingState.Unknown)) {
                paywallView2.loadWebView();
            }
            return paywallView2;
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.manager.PaywallManager$resetCache$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.manager.PaywallManager$resetCache$1", f = "PaywallManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPaywallManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaywallManager.kt\ncom/superwall/sdk/paywall/manager/PaywallManager$resetCache$1\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,120:1\n535#2:121\n520#2,6:122\n1557#3:128\n1628#3,3:129\n*S KotlinDebug\n*F\n+ 1 PaywallManager.kt\ncom/superwall/sdk/paywall/manager/PaywallManager$resetCache$1\n*L\n56#1:121\n56#1:122,6\n60#1:128\n60#1:129,3\n*E\n"})
    static final class C26731 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        C26731(kotlin.coroutines.d<? super C26731> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return PaywallManager.this.new C26731(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Iterator<PaywallView> it = PaywallManager.this.getCache().getAllPaywallViews().iterator();
            while (it.hasNext()) {
                it.next().getWebView().destroy();
                Map<String, View> entries = PaywallManager.this.getCache().getEntries();
                PaywallManager paywallManager = PaywallManager.this;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, View> entry : entries.entrySet()) {
                    if ((entry.getValue() instanceof PaywallView) && !Intrinsics.areEqual(entry.getKey(), paywallManager.getCache().getActivePaywallVcKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Collection<View> collectionValues = linkedHashMap.values();
                ArrayList<PaywallView> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues, 10));
                for (View view : collectionValues) {
                    Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.superwall.sdk.paywall.view.PaywallView");
                    arrayList.add((PaywallView) view);
                }
                for (PaywallView paywallView : arrayList) {
                    if (!Intrinsics.areEqual(paywallView.getPaywall().getIdentifier(), PaywallManager.this.getCache().getActivePaywallVcKey())) {
                        paywallView.getWebView().destroy();
                    }
                }
                PaywallManager.this.getCache().removeAll();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C26731) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public PaywallManager(@NotNull Factory factory, @NotNull PaywallRequestManager paywallRequestManager) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(paywallRequestManager, "paywallRequestManager");
        this.factory = factory;
        this.paywallRequestManager = paywallRequestManager;
    }

    private final PaywallViewCache createCache() {
        PaywallViewCache paywallViewCacheMakeCache = this.factory.makeCache();
        this._cache = paywallViewCacheMakeCache;
        return paywallViewCacheMakeCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaywallViewCache getCache() {
        if (this._cache == null) {
            this._cache = createCache();
        }
        PaywallViewCache paywallViewCache = this._cache;
        Intrinsics.checkNotNull(paywallViewCache);
        return paywallViewCache;
    }

    @Nullable
    public final PaywallView getCurrentView() {
        return getCache().getActivePaywallView();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object getPaywallView(@NotNull PaywallRequest paywallRequest, boolean z10, boolean z11, @Nullable PaywallViewDelegateAdapter paywallViewDelegateAdapter, @NotNull kotlin.coroutines.d<? super Either<PaywallView, Throwable>> dVar) {
        AnonymousClass1 anonymousClass1;
        PaywallRequest paywallRequest2;
        boolean z12;
        PaywallViewDelegateAdapter paywallViewDelegateAdapter2;
        boolean z13;
        PaywallManager paywallManager;
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
        Object paywall = anonymousClass1.result;
        Object objL = b.l();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.m(paywall);
            PaywallRequestManager paywallRequestManager = this.paywallRequestManager;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = paywallRequest;
            anonymousClass1.L$2 = paywallViewDelegateAdapter;
            anonymousClass1.Z$0 = z10;
            anonymousClass1.Z$1 = z11;
            anonymousClass1.label = 1;
            paywall = paywallRequestManager.getPaywall(paywallRequest, z11, anonymousClass1);
            if (paywall != objL) {
                paywallRequest2 = paywallRequest;
                z12 = z11;
                paywallViewDelegateAdapter2 = paywallViewDelegateAdapter;
                z13 = z10;
                paywallManager = this;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(paywall);
            return paywall;
        }
        boolean z14 = anonymousClass1.Z$1;
        boolean z15 = anonymousClass1.Z$0;
        PaywallViewDelegateAdapter paywallViewDelegateAdapter3 = (PaywallViewDelegateAdapter) anonymousClass1.L$2;
        PaywallRequest paywallRequest3 = (PaywallRequest) anonymousClass1.L$1;
        PaywallManager paywallManager2 = (PaywallManager) anonymousClass1.L$0;
        ResultKt.m(paywall);
        z12 = z14;
        z13 = z15;
        paywallViewDelegateAdapter2 = paywallViewDelegateAdapter3;
        paywallRequest2 = paywallRequest3;
        paywallManager = paywallManager2;
        AnonymousClass2 anonymousClass2 = paywallManager.new AnonymousClass2(paywallRequest2, paywallViewDelegateAdapter2, z13, z12, null);
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.label = 2;
        Object objMapAsync = EitherKt.mapAsync((Either) paywall, anonymousClass2, anonymousClass1);
        return objMapAsync == objL ? objL : objMapAsync;
    }

    public final void removePaywallView(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        getCache().removePaywallView(identifier);
    }

    public final void resetCache() {
        ScopesKt.launchWithTracking(this.factory.mainScope(), new C26731(null));
    }

    public final void resetPaywallRequestCache$superwall_release() {
        this.paywallRequestManager.resetCache$superwall_release();
    }

    public final void setCurrentView(@Nullable PaywallView paywallView) {
        this.currentView = paywallView;
    }
}
