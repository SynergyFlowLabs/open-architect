package com.superwall.sdk.paywall.manager;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import com.superwall.sdk.misc.ActivityProvider;
import com.superwall.sdk.network.device.DeviceHelper;
import com.superwall.sdk.paywall.view.LoadingView;
import com.superwall.sdk.paywall.view.PaywallPurchaseLoadingView;
import com.superwall.sdk.paywall.view.PaywallShimmerView;
import com.superwall.sdk.paywall.view.PaywallView;
import com.superwall.sdk.paywall.view.ShimmerView;
import com.superwall.sdk.paywall.view.ViewStorage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.r;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPaywallViewCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaywallViewCache.kt\ncom/superwall/sdk/paywall/manager/PaywallViewCache\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1187#2,2:121\n1261#2,4:123\n1#3:127\n*S KotlinDebug\n*F\n+ 1 PaywallViewCache.kt\ncom/superwall/sdk/paywall/manager/PaywallViewCache\n*L\n38#1:121,2\n38#1:123,4\n*E\n"})
public final class PaywallViewCache {

    @Nullable
    private String _activePaywallVcKey;

    @NotNull
    private final ActivityProvider activityProvider;

    @NotNull
    private final Context appCtx;

    @NotNull
    private final DeviceHelper deviceHelper;

    @NotNull
    private final Map<String, View> entries;

    @NotNull
    private final LoadingView loadingView;

    @NotNull
    private final ShimmerView shimmerView;

    @NotNull
    private final n0 singleThreadContext;

    @NotNull
    private final ViewStorage store;

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.manager.PaywallViewCache$getAllPaywallViews$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.manager.PaywallViewCache$getAllPaywallViews$1", f = "PaywallViewCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPaywallViewCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaywallViewCache.kt\ncom/superwall/sdk/paywall/manager/PaywallViewCache$getAllPaywallViews$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,120:1\n808#2,11:121\n*S KotlinDebug\n*F\n+ 1 PaywallViewCache.kt\ncom/superwall/sdk/paywall/manager/PaywallViewCache$getAllPaywallViews$1\n*L\n42#1:121,11\n*E\n"})
    static final class AnonymousClass1 extends o implements Function2<s0, d<? super List<? extends PaywallView>>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return PaywallViewCache.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, d<? super List<? extends PaywallView>> dVar) {
            return invoke2(s0Var, (d<? super List<PaywallView>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            List<View> listAll = PaywallViewCache.this.store.all();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listAll) {
                if (obj2 instanceof PaywallView) {
                    arrayList.add(obj2);
                }
            }
            return CollectionsKt.toList(arrayList);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(s0 s0Var, d<? super List<PaywallView>> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.manager.PaywallViewCache$getPaywallView$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.manager.PaywallViewCache$getPaywallView$1", f = "PaywallViewCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C26741 extends o implements Function2<s0, d<? super PaywallView>, Object> {
        final /* synthetic */ String $key;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26741(String str, d<? super C26741> dVar) {
            super(2, dVar);
            this.$key = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return PaywallViewCache.this.new C26741(this.$key, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            try {
                return (PaywallView) PaywallViewCache.this.store.retrieveView(this.$key);
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super PaywallView> dVar) {
            return ((C26741) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.manager.PaywallViewCache$removeAll$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.manager.PaywallViewCache$removeAll$1", f = "PaywallViewCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPaywallViewCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaywallViewCache.kt\ncom/superwall/sdk/paywall/manager/PaywallViewCache$removeAll$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,120:1\n1863#2,2:121\n*S KotlinDebug\n*F\n+ 1 PaywallViewCache.kt\ncom/superwall/sdk/paywall/manager/PaywallViewCache$removeAll$1\n*L\n111#1:121,2\n*E\n"})
    static final class C26751 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        C26751(d<? super C26751> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return PaywallViewCache.this.new C26751(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            Set<Map.Entry<String, View>> setEntrySet = PaywallViewCache.this.store.getViews().entrySet();
            Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
            PaywallViewCache paywallViewCache = PaywallViewCache.this;
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Object key = ((Map.Entry) it.next()).getKey();
                Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
                String str = (String) key;
                if (!Intrinsics.areEqual(str, paywallViewCache._activePaywallVcKey)) {
                    paywallViewCache.store.removeView(str);
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C26751) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.manager.PaywallViewCache$removePaywallView$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.manager.PaywallViewCache$removePaywallView$1", f = "PaywallViewCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C26761 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ String $identifier;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26761(String str, d<? super C26761> dVar) {
            super(2, dVar);
            this.$identifier = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return PaywallViewCache.this.new C26761(this.$identifier, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            PaywallViewCache.this.store.removeView(PaywallCacheLogic.INSTANCE.key(this.$identifier, PaywallViewCache.this.deviceHelper.getLocale()));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C26761) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.manager.PaywallViewCache$save$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.manager.PaywallViewCache$save$1", f = "PaywallViewCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C26771 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ String $identifier;
        final /* synthetic */ PaywallView $paywallView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26771(String str, PaywallView paywallView, d<? super C26771> dVar) {
            super(2, dVar);
            this.$identifier = str;
            this.$paywallView = paywallView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return PaywallViewCache.this.new C26771(this.$identifier, this.$paywallView, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            PaywallViewCache.this.store.storeView(PaywallCacheLogic.INSTANCE.key(this.$identifier, PaywallViewCache.this.deviceHelper.getLocale()), this.$paywallView);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C26771) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaywallViewCache(@NotNull Context appCtx, @NotNull ViewStorage store, @NotNull ActivityProvider activityProvider, @NotNull DeviceHelper deviceHelper) {
        Intrinsics.checkNotNullParameter(appCtx, "appCtx");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(deviceHelper, "deviceHelper");
        this.appCtx = appCtx;
        this.store = store;
        this.activityProvider = activityProvider;
        this.deviceHelper = deviceHelper;
        LoadingView loadingView = new LoadingView(getCtx(), null, 0, 0, 14, null);
        this.loadingView = loadingView;
        ShimmerView shimmerView = new ShimmerView(getCtx(), null, 2, 0 == true ? 1 : 0);
        this.shimmerView = shimmerView;
        store.storeView(LoadingView.TAG, loadingView);
        store.storeView(ShimmerView.TAG, shimmerView);
        this.singleThreadContext = l1.c();
        Set<Map.Entry<String, View>> setEntrySet = store.getViews().entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        Set<Map.Entry<String, View>> set = setEntrySet;
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(set, 10)), 16));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pair = TuplesKt.to(entry.getKey(), entry.getValue());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        this.entries = linkedHashMap;
    }

    private final Context getCtx() {
        Activity currentActivity = this.activityProvider.getCurrentActivity();
        return currentActivity != null ? currentActivity : this.appCtx;
    }

    @NotNull
    public final PaywallPurchaseLoadingView acquireLoadingView() {
        KeyEvent.Callback callbackRetrieveView = this.store.retrieveView(LoadingView.TAG);
        if (callbackRetrieveView != null) {
            return (PaywallPurchaseLoadingView) callbackRetrieveView;
        }
        LoadingView loadingView = new LoadingView(getCtx(), null, 0, 0, 14, null);
        this.store.storeView(LoadingView.TAG, loadingView);
        return loadingView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final PaywallShimmerView acquireShimmerView() {
        View viewRetrieveView = this.store.retrieveView(ShimmerView.TAG);
        if (viewRetrieveView != null) {
            return (PaywallShimmerView) viewRetrieveView;
        }
        ShimmerView shimmerView = new ShimmerView(getCtx(), null, 2, 0 == true ? 1 : 0);
        this.store.storeView(ShimmerView.TAG, shimmerView);
        return shimmerView;
    }

    @Nullable
    public final String getActivePaywallVcKey() {
        return (String) i.f(this.singleThreadContext, new PaywallViewCache$activePaywallVcKey$1(this, null));
    }

    @Nullable
    public final PaywallView getActivePaywallView() {
        int i10 = 6 ^ 0;
        return (PaywallView) i.f(this.singleThreadContext, new PaywallViewCache$activePaywallView$1(this, null));
    }

    @NotNull
    public final List<PaywallView> getAllPaywallViews() {
        return (List) i.f(this.singleThreadContext, new AnonymousClass1(null));
    }

    @NotNull
    public final Map<String, View> getEntries() {
        return this.entries;
    }

    @Nullable
    public final PaywallView getPaywallView(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (PaywallView) i.f(this.singleThreadContext, new C26741(key, null));
    }

    public final void removeAll() {
        k.f(t0.a(this.singleThreadContext), null, null, new C26751(null), 3, null);
    }

    public final void removePaywallView(@NotNull String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        k.f(t0.a(this.singleThreadContext), null, null, new C26761(identifier, null), 3, null);
    }

    public final void save(@NotNull PaywallView paywallView, @NotNull String identifier) {
        Intrinsics.checkNotNullParameter(paywallView, "paywallView");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        int i10 = 4 << 0;
        k.f(t0.a(this.singleThreadContext), null, null, new C26771(identifier, paywallView, null), 3, null);
    }

    public final void setActivePaywallVcKey(@Nullable String str) {
        k.f(t0.a(this.singleThreadContext), null, null, new PaywallViewCache$activePaywallVcKey$2(this, str, null), 3, null);
    }
}
