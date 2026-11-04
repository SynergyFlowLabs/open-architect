package com.superwall.sdk.dependencies;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.webkit.WebSettings;
import androidx.core.app.w;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.j2;
import com.android.billingclient.api.Purchase;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.CPUInfo;
import com.superwall.sdk.analytics.ClassifierDataFactory;
import com.superwall.sdk.analytics.DefaultClassifierDataFactory;
import com.superwall.sdk.analytics.DeviceClassifier;
import com.superwall.sdk.analytics.SessionEventsManager;
import com.superwall.sdk.analytics.internal.TrackingKt;
import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import com.superwall.sdk.analytics.internal.trackable.Trackable;
import com.superwall.sdk.analytics.internal.trackable.TrackableSuperwallEvent;
import com.superwall.sdk.analytics.session.AppManagerDelegate;
import com.superwall.sdk.analytics.session.AppSession;
import com.superwall.sdk.analytics.session.AppSessionManager;
import com.superwall.sdk.billing.GoogleBillingWrapper;
import com.superwall.sdk.config.Assignments;
import com.superwall.sdk.config.ConfigLogic;
import com.superwall.sdk.config.ConfigManager;
import com.superwall.sdk.config.PaywallPreload;
import com.superwall.sdk.config.options.SuperwallOptions;
import com.superwall.sdk.debug.DebugManager;
import com.superwall.sdk.debug.DebugView;
import com.superwall.sdk.deeplinks.DeepLinkRouter;
import com.superwall.sdk.delegate.SuperwallDelegateAdapter;
import com.superwall.sdk.delegate.subscription_controller.PurchaseController;
import com.superwall.sdk.identity.IdentityInfo;
import com.superwall.sdk.identity.IdentityManager;
import com.superwall.sdk.misc.ActivityProvider;
import com.superwall.sdk.misc.AppLifecycleObserver;
import com.superwall.sdk.misc.CurrentActivityTracker;
import com.superwall.sdk.misc.IOScope;
import com.superwall.sdk.misc.MainScope;
import com.superwall.sdk.models.config.ComputedPropertyRequest;
import com.superwall.sdk.models.config.Config;
import com.superwall.sdk.models.config.FeatureFlags;
import com.superwall.sdk.models.config.WebToAppConfig;
import com.superwall.sdk.models.entitlements.SubscriptionStatus;
import com.superwall.sdk.models.entitlements.TransactionReceipt;
import com.superwall.sdk.models.events.EventData;
import com.superwall.sdk.models.internal.RedemptionResult;
import com.superwall.sdk.models.paywall.Paywall;
import com.superwall.sdk.models.product.ProductVariable;
import com.superwall.sdk.network.Api;
import com.superwall.sdk.network.BaseHostService;
import com.superwall.sdk.network.CollectorService;
import com.superwall.sdk.network.EnrichmentService;
import com.superwall.sdk.network.JsonFactory;
import com.superwall.sdk.network.Network;
import com.superwall.sdk.network.RequestExecutor;
import com.superwall.sdk.network.SubscriptionService;
import com.superwall.sdk.network.device.DeviceHelper;
import com.superwall.sdk.network.device.DeviceInfo;
import com.superwall.sdk.network.session.CustomHttpUrlConnection;
import com.superwall.sdk.paywall.manager.PaywallManager;
import com.superwall.sdk.paywall.manager.PaywallViewCache;
import com.superwall.sdk.paywall.presentation.PaywallInfo;
import com.superwall.sdk.paywall.presentation.PublicPresentationKt;
import com.superwall.sdk.paywall.presentation.internal.InternalPresentationKt;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequest;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequestType;
import com.superwall.sdk.paywall.presentation.internal.request.PaywallOverrides;
import com.superwall.sdk.paywall.presentation.internal.request.PresentationInfo;
import com.superwall.sdk.paywall.presentation.internal.state.PaywallResult;
import com.superwall.sdk.paywall.presentation.rule_logic.cel.SuperscriptEvaluator;
import com.superwall.sdk.paywall.presentation.rule_logic.expression_evaluator.CombinedExpressionEvaluator;
import com.superwall.sdk.paywall.presentation.rule_logic.expression_evaluator.ExpressionEvaluating;
import com.superwall.sdk.paywall.presentation.rule_logic.javascript.RuleEvaluator;
import com.superwall.sdk.paywall.request.PaywallRequest;
import com.superwall.sdk.paywall.request.PaywallRequestManager;
import com.superwall.sdk.paywall.request.PaywallRequestManagerDepFactory;
import com.superwall.sdk.paywall.request.ResponseIdentifiers;
import com.superwall.sdk.paywall.view.PaywallView;
import com.superwall.sdk.paywall.view.SuperwallStoreOwner;
import com.superwall.sdk.paywall.view.ViewModelFactory;
import com.superwall.sdk.paywall.view.ViewStorageViewModel;
import com.superwall.sdk.paywall.view.delegate.PaywallViewDelegateAdapter;
import com.superwall.sdk.paywall.view.webview.PaywallMessage;
import com.superwall.sdk.paywall.view.webview.SWWebViewKt;
import com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler;
import com.superwall.sdk.paywall.view.webview.templating.models.JsonVariables;
import com.superwall.sdk.paywall.view.webview.templating.models.Variables;
import com.superwall.sdk.storage.EventsQueue;
import com.superwall.sdk.storage.LocalStorage;
import com.superwall.sdk.store.AutomaticPurchaseController;
import com.superwall.sdk.store.Entitlements;
import com.superwall.sdk.store.InternalPurchaseController;
import com.superwall.sdk.store.StoreManager;
import com.superwall.sdk.store.abstractions.transactions.GoogleBillingPurchaseTransaction;
import com.superwall.sdk.store.abstractions.transactions.StoreTransaction;
import com.superwall.sdk.store.transactions.TransactionManager;
import com.superwall.sdk.utilities.DateUtils;
import com.superwall.sdk.utilities.DateUtilsKt;
import com.superwall.sdk.utilities.ErrorTracker;
import com.superwall.sdk.web.DeepLinkReferrer;
import com.superwall.sdk.web.WebPaywallRedeemer;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.flow.z0;
import kotlinx.coroutines.s0;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nDependencyContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DependencyContainer.kt\ncom/superwall/sdk/dependencies/DependencyContainer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,865:1\n12834#2,3:866\n1368#3:869\n1454#3,5:870\n*S KotlinDebug\n*F\n+ 1 DependencyContainer.kt\ncom/superwall/sdk/dependencies/DependencyContainer\n*L\n350#1:866,3\n383#1:869\n383#1:870,5\n*E\n"})
public final class DependencyContainer implements ApiFactory, DeviceInfoFactory, AppManagerDelegate, RequestFactory, RuleAttributesFactory, DeviceHelper.Factory, CacheFactory, PaywallRequestManagerDepFactory, VariablesFactory, StoreTransactionFactory, LocalStorage.Factory, InternalSuperwallEvent.PresentationRequest.Factory, ViewFactory, PaywallManager.Factory, OptionsFactory, TriggerFactory, TransactionVerifierFactory, TransactionManager.Factory, PaywallView.Factory, ConfigManager.Factory, AppSessionManager.Factory, DebugView.Factory, RuleEvaluator.Factory, JsonFactory, ConfigAttributesFactory, PaywallPreload.Factory, ViewStoreFactory, SuperwallScopeFactory, GoogleBillingWrapper.Factory, ClassifierDataFactory {

    @Nullable
    private IOScope _ioScope;

    @Nullable
    private MainScope _mainScope;

    @Nullable
    private ActivityProvider activityProvider;

    @NotNull
    private Api api;

    @NotNull
    private AppLifecycleObserver appLifecycleObserver;

    @NotNull
    private AppSessionManager appSessionManager;

    @NotNull
    private final Assignments assignments;
    public ConfigManager configManager;

    @NotNull
    private final Context context;

    @NotNull
    private DebugManager debugManager;

    @NotNull
    private final DeepLinkRouter deepLinkRouter;

    @NotNull
    private SuperwallDelegateAdapter delegateAdapter;

    @NotNull
    private DeviceHelper deviceHelper;

    @NotNull
    private Entitlements entitlements;

    @NotNull
    private final ErrorTracker errorTracker;

    @NotNull
    private final f0 evaluator$delegate;

    @NotNull
    private EventsQueue eventsQueue;

    @NotNull
    private final GoogleBillingWrapper googleBillingWrapper;

    @NotNull
    private IdentityManager identityManager;

    @NotNull
    private Network network;

    @NotNull
    private final Json paywallJson;

    @NotNull
    private PaywallManager paywallManager;

    @NotNull
    private final PaywallPreload paywallPreload;

    @NotNull
    private PaywallRequestManager paywallRequestManager;
    public WebPaywallRedeemer reedemer;

    @NotNull
    private SessionEventsManager sessionEventsManager;
    public LocalStorage storage;

    @NotNull
    private StoreManager storeManager;

    @NotNull
    private final TransactionManager transactionManager;

    @NotNull
    private final j2 vmProvider;

    /* JADX INFO: renamed from: com.superwall.sdk.dependencies.DependencyContainer$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.dependencies.DependencyContainer$1", f = "DependencyContainer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return DependencyContainer.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            ProcessLifecycleOwner.f52139i.a().getLifecycle().c(DependencyContainer.this.getAppLifecycleObserver());
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.dependencies.DependencyContainer$12, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.dependencies.DependencyContainer$12", f = "DependencyContainer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass12 extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Boolean>, Object> {
        int label;

        AnonymousClass12(kotlin.coroutines.d<? super AnonymousClass12> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass12(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return kotlin.coroutines.jvm.internal.b.a(Superwall.Companion.getInstance().isPaywallPresented());
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Boolean> dVar) {
            return ((AnonymousClass12) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.dependencies.DependencyContainer$13, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.dependencies.DependencyContainer$13", f = "DependencyContainer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass13 extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass13(kotlin.coroutines.d<? super AnonymousClass13> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return DependencyContainer.this.new AnonymousClass13(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            DependencyContainer.this.showWebRestoreSuccesful();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass13) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.dependencies.DependencyContainer$18, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.dependencies.DependencyContainer$18", f = "DependencyContainer.kt", i = {}, l = {397}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nDependencyContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DependencyContainer.kt\ncom/superwall/sdk/dependencies/DependencyContainer$18\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,865:1\n1557#2:866\n1628#2,3:867\n*S KotlinDebug\n*F\n+ 1 DependencyContainer.kt\ncom/superwall/sdk/dependencies/DependencyContainer$18\n*L\n397#1:866\n397#1:867,3\n*E\n"})
    static final class AnonymousClass18 extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super List<? extends TransactionReceipt>>, Object> {
        int label;

        AnonymousClass18(kotlin.coroutines.d<? super AnonymousClass18> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return DependencyContainer.this.new AnonymousClass18(dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(kotlin.coroutines.d<? super List<? extends TransactionReceipt>> dVar) {
            return invoke2((kotlin.coroutines.d<? super List<TransactionReceipt>>) dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                GoogleBillingWrapper googleBillingWrapper = DependencyContainer.this.getGoogleBillingWrapper();
                this.label = 1;
                obj = googleBillingWrapper.queryAllPurchases(this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strJ = ((Purchase) it.next()).j();
                Intrinsics.checkNotNullExpressionValue(strJ, "getPurchaseToken(...)");
                arrayList.add(new TransactionReceipt(strJ));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(kotlin.coroutines.d<? super List<TransactionReceipt>> dVar) {
            return ((AnonymousClass18) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.dependencies.DependencyContainer$20, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.dependencies.DependencyContainer$20", f = "DependencyContainer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass20 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass20(kotlin.coroutines.d<? super AnonymousClass20> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return DependencyContainer.this.new AnonymousClass20(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            ProcessLifecycleOwner.f52139i.a().getLifecycle().c(DependencyContainer.this.getAppSessionManager());
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass20) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.dependencies.DependencyContainer$21, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.dependencies.DependencyContainer$21", f = "DependencyContainer.kt", i = {}, l = {451}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass21 extends kotlin.coroutines.jvm.internal.o implements Function2<TrackableSuperwallEvent, kotlin.coroutines.d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass21(kotlin.coroutines.d<? super AnonymousClass21> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass21 anonymousClass21 = new AnonymousClass21(dVar);
            anonymousClass21.L$0 = obj;
            return anonymousClass21;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TrackableSuperwallEvent trackableSuperwallEvent, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass21) create(trackableSuperwallEvent, dVar)).invokeSuspend(Unit.f312394a);
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

    /* JADX INFO: renamed from: com.superwall.sdk.dependencies.DependencyContainer$22, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.dependencies.DependencyContainer$22", f = "DependencyContainer.kt", i = {}, l = {454}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass22 extends kotlin.coroutines.jvm.internal.o implements pj.n<PaywallView, PaywallResult, kotlin.coroutines.d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        AnonymousClass22(kotlin.coroutines.d<? super AnonymousClass22> dVar) {
            super(3, dVar);
        }

        @Override // pj.n
        public final Object invoke(PaywallView paywallView, PaywallResult paywallResult, kotlin.coroutines.d<? super Unit> dVar) {
            AnonymousClass22 anonymousClass22 = new AnonymousClass22(dVar);
            anonymousClass22.L$0 = paywallView;
            anonymousClass22.L$1 = paywallResult;
            return anonymousClass22.invokeSuspend(Unit.f312394a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                PaywallView paywallView = (PaywallView) this.L$0;
                PaywallResult paywallResult = (PaywallResult) this.L$1;
                Superwall companion = Superwall.Companion.getInstance();
                this.L$0 = null;
                this.label = 1;
                if (InternalPresentationKt.dismiss$default(companion, paywallView, paywallResult, null, null, this, 12, null) == objL) {
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

    /* JADX INFO: renamed from: com.superwall.sdk.dependencies.DependencyContainer$24, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.dependencies.DependencyContainer$24", f = "DependencyContainer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass24 extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass24(kotlin.coroutines.d<? super AnonymousClass24> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return DependencyContainer.this.new AnonymousClass24(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            DependencyContainer.this.showWebRestoreSuccesful();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass24) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.dependencies.DependencyContainer$26, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.dependencies.DependencyContainer$26", f = "DependencyContainer.kt", i = {}, l = {474}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass26 extends kotlin.coroutines.jvm.internal.o implements Function2<TrackableSuperwallEvent, kotlin.coroutines.d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass26(kotlin.coroutines.d<? super AnonymousClass26> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass26 anonymousClass26 = new AnonymousClass26(dVar);
            anonymousClass26.L$0 = obj;
            return anonymousClass26;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TrackableSuperwallEvent trackableSuperwallEvent, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass26) create(trackableSuperwallEvent, dVar)).invokeSuspend(Unit.f312394a);
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

    /* JADX INFO: renamed from: com.superwall.sdk.dependencies.DependencyContainer$27, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.dependencies.DependencyContainer$27", f = "DependencyContainer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass27 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass27(kotlin.coroutines.d<? super AnonymousClass27> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass27 anonymousClass27 = DependencyContainer.this.new AnonymousClass27(dVar);
            anonymousClass27.L$0 = obj;
            return anonymousClass27;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objM785constructorimpl;
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            if (SWWebViewKt.webViewExists()) {
                DependencyContainer dependencyContainer = DependencyContainer.this;
                try {
                    Result.a aVar = Result.Companion;
                    objM785constructorimpl = Result.m785constructorimpl(WebSettings.getDefaultUserAgent(dependencyContainer.getContext()));
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
                }
                DependencyContainer dependencyContainer2 = DependencyContainer.this;
                if (Result.d(objM785constructorimpl) != null) {
                    try {
                        Result.a aVar3 = Result.Companion;
                        Result.m785constructorimpl(WebSettings.getDefaultUserAgent(dependencyContainer2.getContext()));
                    } catch (Throwable th3) {
                        Result.a aVar4 = Result.Companion;
                        Result.m785constructorimpl(ResultKt.createFailure(th3));
                    }
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass27) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.dependencies.DependencyContainer$5, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.dependencies.DependencyContainer$5", f = "DependencyContainer.kt", i = {}, l = {335}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass5 extends kotlin.coroutines.jvm.internal.o implements Function2<InternalSuperwallEvent, kotlin.coroutines.d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass5(kotlin.coroutines.d<? super AnonymousClass5> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(dVar);
            anonymousClass5.L$0 = obj;
            return anonymousClass5;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternalSuperwallEvent internalSuperwallEvent, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass5) create(internalSuperwallEvent, dVar)).invokeSuspend(Unit.f312394a);
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

    /* JADX INFO: renamed from: com.superwall.sdk.dependencies.DependencyContainer$makeJsonVariables$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.dependencies.DependencyContainer", f = "DependencyContainer.kt", i = {0, 0, 0}, l = {750}, m = "makeJsonVariables", n = {"this", "products", w.I0}, s = {"L$0", "L$1", "L$2"})
    static final class C26501 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C26501(kotlin.coroutines.d<? super C26501> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DependencyContainer.this.makeJsonVariables(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.dependencies.DependencyContainer$makePaywallView$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.dependencies.DependencyContainer", f = "DependencyContainer.kt", i = {}, l = {590}, m = "makePaywallView", n = {}, s = {})
    static final class C26511 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C26511(kotlin.coroutines.d<? super C26511> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DependencyContainer.this.makePaywallView(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.dependencies.DependencyContainer$makeRuleAttributes$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.dependencies.DependencyContainer", f = "DependencyContainer.kt", i = {0, 0}, l = {720}, m = "makeRuleAttributes", n = {w.I0, "userAttributes"}, s = {"L$0", "L$1"})
    static final class C26521 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C26521(kotlin.coroutines.d<? super C26521> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DependencyContainer.this.makeRuleAttributes(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.dependencies.DependencyContainer$makeSessionDeviceAttributes$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.dependencies.DependencyContainer", f = "DependencyContainer.kt", i = {}, l = {624}, m = "makeSessionDeviceAttributes", n = {}, s = {})
    static final class C26531 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C26531(kotlin.coroutines.d<? super C26531> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DependencyContainer.this.makeSessionDeviceAttributes(this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.dependencies.DependencyContainer$showWebRestoreSuccesful$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.dependencies.DependencyContainer$showWebRestoreSuccesful$1", f = "DependencyContainer.kt", i = {}, l = {823}, m = "invokeSuspend", n = {}, s = {})
    static final class C26541 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ PaywallView $paywallView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26541(PaywallView paywallView, kotlin.coroutines.d<? super C26541> dVar) {
            super(2, dVar);
            this.$paywallView = paywallView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C26541(this.$paywallView, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Superwall companion = Superwall.Companion.getInstance();
                InternalSuperwallEvent.Restore restore = new InternalSuperwallEvent.Restore(InternalSuperwallEvent.Restore.State.Complete.INSTANCE, this.$paywallView.getInfo());
                this.label = 1;
                if (TrackingKt.track(companion, restore, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                ((Result) obj).j();
            }
            this.$paywallView.getWebView().getMessageHandler().handle(PaywallMessage.Restore.INSTANCE);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C26541) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.dependencies.DependencyContainer$showWebRestoreSuccesful$2, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.dependencies.DependencyContainer$showWebRestoreSuccesful$2", f = "DependencyContainer.kt", i = {}, l = {833}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass2(kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass2(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Superwall companion = Superwall.Companion.getInstance();
                this.label = 1;
                if (PublicPresentationKt.dismiss(companion, this) == objL) {
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
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.dependencies.DependencyContainer$trackRestorationFailure$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.dependencies.DependencyContainer$trackRestorationFailure$1", f = "DependencyContainer.kt", i = {}, l = {850}, m = "invokeSuspend", n = {}, s = {})
    static final class C26551 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ InternalSuperwallEvent.Restore $trackedEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26551(InternalSuperwallEvent.Restore restore, kotlin.coroutines.d<? super C26551> dVar) {
            super(2, dVar);
            this.$trackedEvent = restore;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C26551(this.$trackedEvent, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Superwall companion = Superwall.Companion.getInstance();
                InternalSuperwallEvent.Restore restore = this.$trackedEvent;
                this.label = 1;
                if (TrackingKt.track(companion, restore, this) == objL) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C26551) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public DependencyContainer(@NotNull Context context, @Nullable PurchaseController purchaseController, @Nullable SuperwallOptions superwallOptions, @Nullable ActivityProvider activityProvider) {
        ActivityProvider activityProvider2;
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.activityProvider = activityProvider;
        this.appLifecycleObserver = new AppLifecycleObserver();
        this.evaluator$delegate = g0.c(new Function0() { // from class: com.superwall.sdk.dependencies.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DependencyContainer.evaluator_delegate$lambda$1(this.f267420a);
            }
        });
        s0 s0Var = null;
        boolean z10 = false;
        kotlinx.coroutines.k.f(getUiScope(), null, null, new AnonymousClass1(null), 3, null);
        ActivityProvider activityProvider3 = this.activityProvider;
        if (activityProvider3 == null) {
            CurrentActivityTracker currentActivityTracker = new CurrentActivityTracker();
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(currentActivityTracker);
            this.activityProvider = currentActivityTracker;
            activityProvider2 = currentActivityTracker;
        } else {
            Intrinsics.checkNotNull(activityProvider3);
            activityProvider2 = activityProvider3;
        }
        ActivityProvider activityProvider4 = activityProvider2;
        GoogleBillingWrapper googleBillingWrapper = new GoogleBillingWrapper(context, getIoScope(), getAppLifecycleObserver(), this);
        this.googleBillingWrapper = googleBillingWrapper;
        setStorage(new LocalStorage(context, json(), this, ioScope(), null, null, 48, null));
        this.entitlements = new Entitlements(getStorage(), s0Var, 2, z10 ? 1 : 0);
        InternalPurchaseController internalPurchaseController = new InternalPurchaseController(purchaseController == null ? new AutomaticPurchaseController(context, getIoScope(), this.entitlements) : purchaseController, null, context);
        this.storeManager = new StoreManager(internalPurchaseController, googleBillingWrapper, null, 4, null);
        this.delegateAdapter = new SuperwallDelegateAdapter();
        CustomHttpUrlConnection customHttpUrlConnection = new CustomHttpUrlConnection(json(), new RequestExecutor(new DependencyContainer$httpConnection$1(this, null)), null, 4, null);
        SuperwallOptions superwallOptions2 = superwallOptions == null ? new SuperwallOptions() : superwallOptions;
        setApi(new Api(superwallOptions2.getNetworkEnvironment()));
        this.network = new Network(new BaseHostService(getApi().getBase().getHost(), Api.version1, this, json(), customHttpUrlConnection), new CollectorService(getApi().getCollector().getHost(), Api.version1, this, json(), customHttpUrlConnection), new EnrichmentService(getApi().getEnrichment().getHost(), Api.version1, this, customHttpUrlConnection), this, new SubscriptionService(getApi().getSubscription().getHost(), Api.subscriptionsv1, this, JsonKt.Json(json(), new Function1() { // from class: com.superwall.sdk.dependencies.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DependencyContainer._init_$lambda$2((JsonBuilder) obj);
            }
        }), customHttpUrlConnection));
        this.errorTracker = new ErrorTracker(getIoScope(), getStorage(), null, 4, null);
        PaywallRequestManager paywallRequestManager = new PaywallRequestManager(this.storeManager, this.network, this, getIoScope(), null, null, 48, null);
        this.paywallRequestManager = paywallRequestManager;
        this.paywallManager = new PaywallManager(this, paywallRequestManager);
        setDeviceHelper(new DeviceHelper(context, getStorage(), this.network, this, new DeviceClassifier(new DefaultClassifierDataFactory(new Function0() { // from class: com.superwall.sdk.dependencies.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f267421a.context;
            }
        }))));
        Assignments assignments = new Assignments(getStorage(), this.network, getIoScope(), null, 8, null);
        this.assignments = assignments;
        PaywallPreload paywallPreload = new PaywallPreload(this, getIoScope(), getStorage(), assignments, this.paywallManager);
        this.paywallPreload = paywallPreload;
        setConfigManager(new ConfigManager(context, this.storeManager, this.entitlements, getStorage(), this.network, getDeviceHelper(), superwallOptions2, this.paywallManager, new Function0() { // from class: com.superwall.sdk.dependencies.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f267422a.getReedemer();
            }
        }, this, assignments, paywallPreload, getIoScope(), new AnonymousClass5(null), null, 16384, null));
        setIdentityManager(new IdentityManager(getDeviceHelper(), getStorage(), getConfigManager(), getIoScope(), new Function1() { // from class: com.superwall.sdk.dependencies.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DependencyContainer._init_$lambda$6(this.f267423a, (String) obj);
            }
        }));
        setReedemer(new WebPaywallRedeemer(context, getIoScope(), new DeepLinkReferrer(new Function0() { // from class: com.superwall.sdk.dependencies.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f267424a.context;
            }
        }, getIoScope()), this.network, getStorage(), new Function0() { // from class: com.superwall.sdk.dependencies.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DependencyContainer._init_$lambda$8(this.f267425a);
            }
        }, new Function1() { // from class: com.superwall.sdk.dependencies.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DependencyContainer._init_$lambda$9(this.f267426a, (RedemptionResult) obj);
            }
        }, new Function0() { // from class: com.superwall.sdk.dependencies.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(DependencyContainer._init_$lambda$10(this.f267427a));
            }
        }, null, null, null, null, null, new Function1() { // from class: com.superwall.sdk.dependencies.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DependencyContainer._init_$lambda$11((SubscriptionStatus) obj);
            }
        }, new AnonymousClass12(null), new AnonymousClass13(null), new Function0() { // from class: com.superwall.sdk.dependencies.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DependencyContainer._init_$lambda$13(this.f267428a);
            }
        }, new Function0() { // from class: com.superwall.sdk.dependencies.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DependencyContainer._init_$lambda$14();
            }
        }, new Function1() { // from class: com.superwall.sdk.dependencies.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DependencyContainer._init_$lambda$15(this.f267429a, (String) obj);
            }
        }, new Function0() { // from class: com.superwall.sdk.dependencies.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(this.f267430a.isWebToAppEnabled());
            }
        }, new AnonymousClass18(null), new Function0() { // from class: com.superwall.sdk.dependencies.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DependencyContainer._init_$lambda$17(this.f267431a);
            }
        }, 7936, null));
        this.eventsQueue = new EventsQueue(context, this.network, ioScope(), mainScope(), getConfigManager());
        this.sessionEventsManager = new SessionEventsManager(getStorage(), this.network, getConfigManager());
        this.appSessionManager = new AppSessionManager(getConfigManager(), getStorage(), this, getIoScope());
        this.debugManager = new DebugManager(context, getStorage(), this);
        kotlinx.coroutines.k.f(getUiScope(), null, null, new AnonymousClass20(null), 3, null);
        this.transactionManager = new TransactionManager(this.storeManager, internalPurchaseController, this.eventsQueue, getStorage(), activityProvider4, this, ioScope(), new AnonymousClass21(null), new AnonymousClass22(null), null, new Function1() { // from class: com.superwall.sdk.dependencies.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DependencyContainer._init_$lambda$18(this.f267432a, (String) obj);
            }
        }, new AnonymousClass24(null), new Function0() { // from class: com.superwall.sdk.dependencies.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DependencyContainer._init_$lambda$19(this.f267433a);
            }
        }, 512, null);
        this.deepLinkRouter = new DeepLinkRouter(getReedemer(), getIoScope(), this.debugManager, new AnonymousClass26(null));
        kotlinx.coroutines.k.f(getIoScope(), null, null, new AnonymousClass27(null), 3, null);
        this.paywallJson = JsonKt.Json$default(null, new Function1() { // from class: com.superwall.sdk.dependencies.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DependencyContainer.paywallJson$lambda$20((JsonBuilder) obj);
            }
        }, 1, null);
        this.vmProvider = new j2(getStoreOwner(), getVmFactory());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long _init_$lambda$10(DependencyContainer dependencyContainer) {
        WebToAppConfig webToAppConfig;
        Config config = dependencyContainer.getConfigManager().getConfig();
        if (config == null || (webToAppConfig = config.getWebToAppConfig()) == null) {
            return 86400000L;
        }
        return webToAppConfig.getEntitlementsMaxAgeMs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$11(SubscriptionStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Superwall.Companion.getInstance().internallySetSubscriptionStatus$superwall_release(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set _init_$lambda$13(DependencyContainer dependencyContainer) {
        Paywall paywall;
        List<String> productIds;
        PaywallView paywallView = Superwall.Companion.getInstance().getPaywallView();
        if (paywallView != null && (paywall = paywallView.getPaywall()) != null && (productIds = paywall.getProductIds()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = productIds.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, dependencyContainer.entitlements.byProductId$superwall_release((String) it.next()));
            }
            Set set = CollectionsKt.toSet(arrayList);
            if (set != null) {
                return set;
            }
        }
        return SetsKt.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaywallInfo _init_$lambda$14() {
        PaywallInfo info;
        PaywallView paywallView = Superwall.Companion.getInstance().getPaywallView();
        return (paywallView == null || (info = paywallView.getInfo()) == null) ? PaywallInfo.Companion.empty() : info;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$15(DependencyContainer dependencyContainer, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        dependencyContainer.trackRestorationFailure(it);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$17(DependencyContainer dependencyContainer) {
        return dependencyContainer.getIdentityManager().getExternalAccountId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set _init_$lambda$18(DependencyContainer dependencyContainer, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return dependencyContainer.entitlements.byProductId$superwall_release(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$19(DependencyContainer dependencyContainer) {
        dependencyContainer.storeManager.refreshReceipt();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        Json.setNamingStrategy(null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$6(DependencyContainer dependencyContainer, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        byte[] bytes = dependencyContainer.toString().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrDigest = MessageDigest.getInstance(org.apache.commons.codec.digest.g.f335251e).digest(bytes);
        Intrinsics.checkNotNull(bArrDigest);
        String str = "";
        for (byte b10 : bArrDigest) {
            String str2 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            str = str + str2;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$8(DependencyContainer dependencyContainer) {
        dependencyContainer.delegateAdapter.willRedeemLink();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$9(DependencyContainer dependencyContainer, RedemptionResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        dependencyContainer.delegateAdapter.didRedeemLink(result);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CombinedExpressionEvaluator evaluator_delegate$lambda$1(DependencyContainer dependencyContainer) {
        return new CombinedExpressionEvaluator(dependencyContainer.getStorage(), new SuperscriptEvaluator(JsonKt.Json(dependencyContainer.json(), new Function1() { // from class: com.superwall.sdk.dependencies.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DependencyContainer.evaluator_delegate$lambda$1$lambda$0((JsonBuilder) obj);
            }
        }), dependencyContainer.getIoScope(), dependencyContainer.getStorage().getCoreDataManager(), dependencyContainer, null, 16, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit evaluator_delegate$lambda$1$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setClassDiscriminatorMode(ClassDiscriminatorMode.POLYMORPHIC);
        Json.setClassDiscriminator("type");
        return Unit.f312394a;
    }

    private final CombinedExpressionEvaluator getEvaluator() {
        return (CombinedExpressionEvaluator) this.evaluator$delegate.getValue();
    }

    private final IOScope getIoScope() {
        return ioScope();
    }

    private final SuperwallStoreOwner getStoreOwner() {
        return new SuperwallStoreOwner();
    }

    private final MainScope getUiScope() {
        return mainScope();
    }

    private final ViewModelFactory getVmFactory() {
        return new ViewModelFactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit paywallJson$lambda$20(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setEncodeDefaults(true);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showWebRestoreSuccesful() {
        PaywallView paywallView = Superwall.Companion.getInstance().getPaywallView();
        if (paywallView != null) {
            kotlinx.coroutines.k.f(getIoScope(), null, null, new C26541(paywallView, null), 3, null);
            if (makeSuperwallOptions().getPaywalls().getAutomaticallyDismiss()) {
                kotlinx.coroutines.k.f(getIoScope(), null, null, new AnonymousClass2(null), 3, null);
            }
        }
    }

    private final void trackRestorationFailure(String str) {
        PaywallView paywallView = Superwall.Companion.getInstance().getPaywallView();
        SuperwallOptions superwallOptionsMakeSuperwallOptions = makeSuperwallOptions();
        if (paywallView != null) {
            kotlinx.coroutines.k.f(getIoScope(), null, null, new C26551(new InternalSuperwallEvent.Restore(new InternalSuperwallEvent.Restore.State.Failure(str), paywallView.getInfo()), null), 3, null);
            paywallView.getWebView().getMessageHandler().handle(new PaywallMessage.RestoreFailed(str));
            PaywallView.showAlert$default(paywallView, superwallOptionsMakeSuperwallOptions.getPaywalls().getRestoreFailed().getTitle(), superwallOptionsMakeSuperwallOptions.getPaywalls().getRestoreFailed().getMessage(), null, superwallOptionsMakeSuperwallOptions.getPaywalls().getRestoreFailed().getCloseButtonTitle(), null, null, 52, null);
        }
    }

    @Override // com.superwall.sdk.paywall.request.PaywallRequestManagerDepFactory
    @Nullable
    public String activePaywallId() {
        Paywall paywall;
        PaywallView currentView = this.paywallManager.getCurrentView();
        if (currentView == null || (paywall = currentView.getPaywall()) == null) {
            return null;
        }
        return paywall.getIdentifier();
    }

    @Override // com.superwall.sdk.dependencies.StoreTransactionFactory
    @Nullable
    public Object activeProductIds(@NotNull kotlin.coroutines.d<? super List<String>> dVar) {
        return CollectionsKt.toList(this.storeManager.getReceiptManager().getPurchases());
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    public long advertisedMemory() {
        return ClassifierDataFactory.DefaultImpls.advertisedMemory(this);
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    @NotNull
    public List<String> codecs() {
        return ClassifierDataFactory.DefaultImpls.codecs(this);
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    @NotNull
    public Context context() {
        return this.context;
    }

    @Override // com.superwall.sdk.analytics.session.AppManagerDelegate
    @Nullable
    public Object didUpdateAppSession(@NotNull AppSession appSession, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return Unit.f312394a;
    }

    @Override // com.superwall.sdk.dependencies.ExperimentalPropertiesFactory
    @NotNull
    public Map<String, Object> experimentalProperties() {
        return this.storeManager.getReceiptManager().experimentalProperties();
    }

    @Nullable
    public final ActivityProvider getActivityProvider() {
        return this.activityProvider;
    }

    @Override // com.superwall.sdk.dependencies.ApiFactory
    @NotNull
    public Api getApi() {
        return this.api;
    }

    @Override // com.superwall.sdk.dependencies.ApiFactory
    @NotNull
    public AppLifecycleObserver getAppLifecycleObserver() {
        return this.appLifecycleObserver;
    }

    @NotNull
    public final AppSessionManager getAppSessionManager() {
        return this.appSessionManager;
    }

    @NotNull
    public final Assignments getAssignments$superwall_release() {
        return this.assignments;
    }

    @Override // com.superwall.sdk.dependencies.ApiFactory
    @NotNull
    public ConfigManager getConfigManager() {
        ConfigManager configManager = this.configManager;
        if (configManager != null) {
            return configManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("configManager");
        return null;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    @NotNull
    public CPUInfo.Data getCpuInfo() {
        return ClassifierDataFactory.DefaultImpls.getCpuInfo(this);
    }

    @NotNull
    public final DebugManager getDebugManager() {
        return this.debugManager;
    }

    @NotNull
    public final DeepLinkRouter getDeepLinkRouter$superwall_release() {
        return this.deepLinkRouter;
    }

    @NotNull
    public final SuperwallDelegateAdapter getDelegateAdapter() {
        return this.delegateAdapter;
    }

    @Override // com.superwall.sdk.dependencies.ApiFactory
    @NotNull
    public DeviceHelper getDeviceHelper() {
        return this.deviceHelper;
    }

    @NotNull
    public final Entitlements getEntitlements() {
        return this.entitlements;
    }

    @NotNull
    public final ErrorTracker getErrorTracker$superwall_release() {
        return this.errorTracker;
    }

    @NotNull
    public final EventsQueue getEventsQueue() {
        return this.eventsQueue;
    }

    @NotNull
    public final GoogleBillingWrapper getGoogleBillingWrapper() {
        return this.googleBillingWrapper;
    }

    @Override // com.superwall.sdk.dependencies.ApiFactory
    @NotNull
    public IdentityManager getIdentityManager() {
        return this.identityManager;
    }

    @NotNull
    public final Network getNetwork() {
        return this.network;
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    @NotNull
    public DeviceClassifier.Orientation getOrientation() {
        return ClassifierDataFactory.DefaultImpls.getOrientation(this);
    }

    @NotNull
    public final PaywallManager getPaywallManager() {
        return this.paywallManager;
    }

    @NotNull
    public final PaywallRequestManager getPaywallRequestManager() {
        return this.paywallRequestManager;
    }

    @NotNull
    public final WebPaywallRedeemer getReedemer() {
        WebPaywallRedeemer webPaywallRedeemer = this.reedemer;
        if (webPaywallRedeemer != null) {
            return webPaywallRedeemer;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reedemer");
        return null;
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    public int getScreenHeight() {
        return ClassifierDataFactory.DefaultImpls.getScreenHeight(this);
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    public double getScreenSize() {
        return ClassifierDataFactory.DefaultImpls.getScreenSize(this);
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    public int getScreenWidth() {
        return ClassifierDataFactory.DefaultImpls.getScreenWidth(this);
    }

    @NotNull
    public final SessionEventsManager getSessionEventsManager() {
        return this.sessionEventsManager;
    }

    @Override // com.superwall.sdk.dependencies.ApiFactory
    @NotNull
    public LocalStorage getStorage() {
        LocalStorage localStorage = this.storage;
        if (localStorage != null) {
            return localStorage;
        }
        Intrinsics.throwUninitializedPropertyAccessException("storage");
        return null;
    }

    @NotNull
    public final StoreManager getStoreManager() {
        return this.storeManager;
    }

    @NotNull
    public final TransactionManager getTransactionManager() {
        return this.transactionManager;
    }

    @Override // com.superwall.sdk.dependencies.SuperwallScopeFactory
    @NotNull
    public IOScope ioScope() {
        if (this._ioScope == null) {
            this._ioScope = new IOScope(null, 1, null);
        }
        IOScope iOScope = this._ioScope;
        Intrinsics.checkNotNull(iOScope);
        return iOScope;
    }

    @Override // com.superwall.sdk.analytics.ClassifierDataFactory
    public boolean isTabletMinWidth() {
        return ClassifierDataFactory.DefaultImpls.isTabletMinWidth(this);
    }

    @Override // com.superwall.sdk.dependencies.WebToAppFactory
    public boolean isWebToAppEnabled() {
        FeatureFlags featureFlags;
        Config config = getConfigManager().getConfig();
        if (config == null || (featureFlags = config.getFeatureFlags()) == null) {
            return false;
        }
        return featureFlags.getWeb2App();
    }

    @Override // com.superwall.sdk.network.JsonFactory
    @NotNull
    public Json json() {
        return ApiFactory.DefaultImpls.json(this);
    }

    @Override // com.superwall.sdk.dependencies.SuperwallScopeFactory
    @NotNull
    public MainScope mainScope() {
        if (this._mainScope == null) {
            this._mainScope = new MainScope(null, 1, null);
        }
        MainScope mainScope = this._mainScope;
        Intrinsics.checkNotNull(mainScope);
        return mainScope;
    }

    @Override // com.superwall.sdk.dependencies.CacheFactory
    @NotNull
    public PaywallViewCache makeCache() {
        Context context = this.context;
        ViewStorageViewModel viewStorageViewModelMakeViewStore = makeViewStore();
        ActivityProvider activityProvider = this.activityProvider;
        Intrinsics.checkNotNull(activityProvider);
        return new PaywallViewCache(context, viewStorageViewModelMakeViewStore, activityProvider, getDeviceHelper());
    }

    @Override // com.superwall.sdk.dependencies.ComputedPropertyRequestsFactory
    @NotNull
    public List<ComputedPropertyRequest> makeComputedPropertyRequests() {
        List<ComputedPropertyRequest> allComputedProperties;
        Config config = getConfigManager().getConfig();
        return (config == null || (allComputedProperties = config.getAllComputedProperties()) == null) ? CollectionsKt.emptyList() : allComputedProperties;
    }

    @Override // com.superwall.sdk.dependencies.ConfigAttributesFactory
    @NotNull
    public InternalSuperwallEvent.ConfigAttributes makeConfigAttributes() {
        return new InternalSuperwallEvent.ConfigAttributes(getConfigManager().getOptions(), makeHasExternalPurchaseController(), (this.delegateAdapter.getKotlinDelegate() == null && this.delegateAdapter.getJavaDelegate() == null) ? false : true);
    }

    @Override // com.superwall.sdk.dependencies.ViewFactory
    @NotNull
    public DebugView makeDebugView(@Nullable String str) {
        DebugView debugView = new DebugView(this.context, this.storeManager, this.network, this.paywallRequestManager, this.paywallManager, this.debugManager, this);
        debugView.setPaywallDatabaseId$superwall_release(str);
        return debugView;
    }

    @Override // com.superwall.sdk.dependencies.DeviceInfoFactory, com.superwall.sdk.dependencies.DeviceHelperFactory
    @NotNull
    public DeviceInfo makeDeviceInfo() {
        return new DeviceInfo(getDeviceHelper().getAppInstalledAtString(), getDeviceHelper().getLocale());
    }

    @Override // com.superwall.sdk.dependencies.FeatureFlagsFactory
    @Nullable
    public FeatureFlags makeFeatureFlags() {
        Config config = getConfigManager().getConfig();
        if (config != null) {
            return config.getFeatureFlags();
        }
        return null;
    }

    @Override // com.superwall.sdk.dependencies.HasExternalPurchaseControllerFactory
    public boolean makeHasExternalPurchaseController() {
        return this.storeManager.getPurchaseController().getHasExternalPurchaseController();
    }

    @Override // com.superwall.sdk.dependencies.HasInternalPurchaseControllerFactory
    public boolean makeHasInternalPurchaseController() {
        return this.storeManager.getPurchaseController().getHasInternalPurchaseController();
    }

    @Override // com.superwall.sdk.dependencies.ApiFactory
    @Nullable
    public Object makeHeaders(boolean z10, @NotNull String str, @NotNull kotlin.coroutines.d<? super Map<String, String>> dVar) {
        String gitSha;
        String buildTime;
        String buildId;
        LocalStorage storage = getStorage();
        Pair pair = TuplesKt.to("Authorization", "Bearer " + (z10 ? storage.getDebugKey() : storage.getApiKey()));
        Pair pair2 = TuplesKt.to("X-Platform", "Android");
        Pair pair3 = TuplesKt.to("X-Platform-Environment", "SDK");
        Pair pair4 = TuplesKt.to("X-Platform-Wrapper", getDeviceHelper().getPlatformWrapper());
        String appUserId = getIdentityManager().getAppUserId();
        if (appUserId == null) {
            appUserId = "";
        }
        Pair pair5 = TuplesKt.to("X-App-User-ID", appUserId);
        Pair pair6 = TuplesKt.to("X-Alias-ID", getIdentityManager().getAliasId());
        Pair pair7 = TuplesKt.to("X-URL-Scheme", getDeviceHelper().getUrlScheme());
        Pair pair8 = TuplesKt.to("X-Vendor-ID", getDeviceHelper().getVendorId());
        Pair pair9 = TuplesKt.to("X-App-Version", getDeviceHelper().getAppVersion());
        Pair pair10 = TuplesKt.to("X-OS-Version", getDeviceHelper().getOsVersion());
        Pair pair11 = TuplesKt.to("X-Device-Model", getDeviceHelper().getModel());
        Pair pair12 = TuplesKt.to("X-Device-Locale", getDeviceHelper().getLocale());
        Pair pair13 = TuplesKt.to("X-Device-Language-Code", getDeviceHelper().getLanguageCode());
        Pair pair14 = TuplesKt.to("X-Device-Currency-Code", getDeviceHelper().getCurrencyCode());
        Pair pair15 = TuplesKt.to("X-Device-Currency-Symbol", getDeviceHelper().getCurrencySymbol());
        Pair pair16 = TuplesKt.to("X-Device-Timezone-Offset", getDeviceHelper().getSecondsFromGMT());
        Pair pair17 = TuplesKt.to("X-App-Install-Date", getDeviceHelper().getAppInstalledAtString());
        Pair pair18 = TuplesKt.to("X-Radio-Type", getDeviceHelper().getRadioType());
        Pair pair19 = TuplesKt.to("X-Device-Interface-Style", getDeviceHelper().getInterfaceStyle());
        Pair pair20 = TuplesKt.to("X-SDK-Version", getDeviceHelper().getSdkVersion());
        if (getDeviceHelper().getGitSha() != null) {
            gitSha = getDeviceHelper().getGitSha();
            Intrinsics.checkNotNull(gitSha);
        } else {
            gitSha = "";
        }
        Pair pair21 = TuplesKt.to("X-Git-Sha", gitSha);
        if (getDeviceHelper().getBuildTime() != null) {
            buildTime = getDeviceHelper().getBuildTime();
            Intrinsics.checkNotNull(buildTime);
        } else {
            buildTime = "";
        }
        Pair pair22 = TuplesKt.to("X-Build-Time", buildTime);
        Pair pair23 = TuplesKt.to("X-Bundle-ID", getDeviceHelper().getBundleId());
        Pair pair24 = TuplesKt.to("X-Low-Power-Mode", getDeviceHelper().isLowPowerModeEnabled().toString());
        Pair pair25 = TuplesKt.to("X-Is-Sandbox", String.valueOf(getDeviceHelper().isSandbox()));
        Pair pair26 = TuplesKt.to("X-Entitlement-Status", Superwall.Companion.getInstance().getEntitlements().getStatus().getValue().toString());
        Pair pair27 = TuplesKt.to("Content-Type", "application/json");
        Pair pair28 = TuplesKt.to("X-Current-Time", DateUtilsKt.dateFormat(DateUtils.INSTANCE.getISO_MILLIS()).format(new Date()));
        Config config = getConfigManager().getConfig();
        return MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, pair28, TuplesKt.to("X-Static-Config-Build-Id", (config == null || (buildId = config.getBuildId()) == null) ? "" : buildId));
    }

    @Override // com.superwall.sdk.dependencies.IdentityInfoFactory
    @Nullable
    public Object makeIdentityInfo(@NotNull kotlin.coroutines.d<? super IdentityInfo> dVar) {
        return new IdentityInfo(getIdentityManager().getAliasId(), getIdentityManager().getAppUserId());
    }

    @Override // com.superwall.sdk.dependencies.IdentityManagerFactory
    @Nullable
    public Object makeIdentityManager(@NotNull kotlin.coroutines.d<? super IdentityManager> dVar) {
        return getIdentityManager();
    }

    @Override // com.superwall.sdk.dependencies.DeviceHelperFactory
    public boolean makeIsSandbox() {
        return getDeviceHelper().isSandbox();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.superwall.sdk.dependencies.VariablesFactory
    @Nullable
    public Object makeJsonVariables(@Nullable List<ProductVariable> list, @NotNull List<ComputedPropertyRequest> list2, @Nullable EventData eventData, @NotNull kotlin.coroutines.d<? super JsonVariables> dVar) {
        C26501 c26501;
        Map<String, Object> mapEmptyMap;
        if (dVar instanceof C26501) {
            c26501 = (C26501) dVar;
            int i10 = c26501.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c26501.label = i10 - Integer.MIN_VALUE;
            } else {
                c26501 = new C26501(dVar);
            }
        } else {
            c26501 = new C26501(dVar);
        }
        Object deviceAttributes = c26501.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c26501.label;
        if (i11 == 0) {
            ResultKt.m(deviceAttributes);
            DeviceHelper deviceHelper = getDeviceHelper();
            c26501.L$0 = this;
            c26501.L$1 = list;
            c26501.L$2 = eventData;
            c26501.label = 1;
            deviceAttributes = deviceHelper.getDeviceAttributes(eventData, list2, c26501);
            if (deviceAttributes == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eventData = (EventData) c26501.L$2;
            list = (List) c26501.L$1;
            this = (DependencyContainer) c26501.L$0;
            ResultKt.m(deviceAttributes);
        }
        Map map = (Map) deviceAttributes;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        if (eventData == null || (mapEmptyMap = eventData.getParameters()) == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        return new Variables(list, mapEmptyMap, this.getIdentityManager().getUserAttributes(), map).templated();
    }

    @Override // com.superwall.sdk.dependencies.LocaleIdentifierFactory
    @Nullable
    public String makeLocaleIdentifier() {
        SuperwallOptions options = getConfigManager().getOptions();
        if (options != null) {
            return options.getLocaleIdentifier();
        }
        return null;
    }

    @Override // com.superwall.sdk.dependencies.RequestFactory
    @NotNull
    public PaywallRequest makePaywallRequest(@Nullable EventData eventData, @NotNull ResponseIdentifiers responseIdentifiers, @Nullable PaywallRequest.Overrides overrides, boolean z10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(responseIdentifiers, "responseIdentifiers");
        if (overrides == null) {
            overrides = new PaywallRequest.Overrides(null, null);
        }
        return new PaywallRequest(eventData, responseIdentifiers, overrides, z10, str, 6);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // com.superwall.sdk.dependencies.ViewFactory
    @Nullable
    public Object makePaywallView(@NotNull Paywall paywall, @Nullable PaywallViewCache paywallViewCache, @Nullable PaywallViewDelegateAdapter paywallViewDelegateAdapter, @NotNull kotlin.coroutines.d<? super PaywallView> dVar) {
        C26511 c26511;
        if (dVar instanceof C26511) {
            c26511 = (C26511) dVar;
            int i10 = c26511.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c26511.label = i10 - Integer.MIN_VALUE;
            } else {
                c26511 = new C26511(dVar);
            }
        } else {
            c26511 = new C26511(dVar);
        }
        C26511 c26512 = c26511;
        Object objQ = c26512.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c26512.label;
        if (i11 == 0) {
            ResultKt.m(objQ);
            a1 a1VarB = kotlinx.coroutines.k.b(getUiScope(), null, null, new DependencyContainer$makePaywallView$paywallView$1(this, new PaywallMessageHandler(this.sessionEventsManager, this, mainScope(), getIoScope(), this.paywallJson), paywall, paywallViewDelegateAdapter, paywallViewCache, null), 3, null);
            c26512.label = 1;
            objQ = a1VarB.q(c26512);
            if (objQ == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objQ);
        }
        return (PaywallView) objQ;
    }

    @Override // com.superwall.sdk.dependencies.RequestFactory
    @NotNull
    public PresentationRequest makePresentationRequest(@NotNull PresentationInfo presentationInfo, @Nullable PaywallOverrides paywallOverrides, @Nullable Activity activity, @Nullable Boolean bool, @Nullable z0<? extends SubscriptionStatus> z0Var, boolean z10, @NotNull PresentationRequestType type) {
        Intrinsics.checkNotNullParameter(presentationInfo, "presentationInfo");
        Intrinsics.checkNotNullParameter(type, "type");
        WeakReference weakReference = new WeakReference(activity);
        boolean zBooleanValue = bool != null ? bool.booleanValue() : this.debugManager.isDebuggerLaunched();
        if (z0Var == null) {
            z0Var = Superwall.Companion.getInstance().getEntitlements().getStatus();
        }
        return new PresentationRequest(presentationInfo, weakReference, paywallOverrides, new PresentationRequest.Flags(zBooleanValue, z0Var, z10, type));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.superwall.sdk.dependencies.RuleAttributesFactory
    @Nullable
    public Object makeRuleAttributes(@Nullable EventData eventData, @NotNull List<ComputedPropertyRequest> list, @NotNull kotlin.coroutines.d<? super Map<String, ? extends Object>> dVar) {
        C26521 c26521;
        Map map;
        Object parameters;
        if (dVar instanceof C26521) {
            c26521 = (C26521) dVar;
            int i10 = c26521.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c26521.label = i10 - Integer.MIN_VALUE;
            } else {
                c26521 = new C26521(dVar);
            }
        } else {
            c26521 = new C26521(dVar);
        }
        Object obj = c26521.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c26521.label;
        if (i11 == 0) {
            ResultKt.m(obj);
            Map mutableMap = MapsKt.toMutableMap(getIdentityManager().getUserAttributes());
            mutableMap.put("isLoggedIn", kotlin.coroutines.jvm.internal.b.a(getIdentityManager().isLoggedIn()));
            DeviceHelper deviceHelper = getDeviceHelper();
            c26521.L$0 = eventData;
            c26521.L$1 = mutableMap;
            c26521.label = 1;
            Object deviceAttributes = deviceHelper.getDeviceAttributes(eventData, list, c26521);
            if (deviceAttributes == objL) {
                return objL;
            }
            obj = deviceAttributes;
            map = mutableMap;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) c26521.L$1;
            eventData = (EventData) c26521.L$0;
            ResultKt.m(obj);
        }
        Pair pair = TuplesKt.to("user", map);
        Pair pair2 = TuplesKt.to("device", (Map) obj);
        if (eventData == null || (parameters = eventData.getParameters()) == null) {
            parameters = "";
        }
        return MapsKt.mapOf(pair, pair2, TuplesKt.to("params", parameters));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.superwall.sdk.dependencies.DeviceHelperFactory
    @Nullable
    public Object makeSessionDeviceAttributes(@NotNull kotlin.coroutines.d<? super HashMap<String, Object>> dVar) {
        C26531 c26531;
        if (dVar instanceof C26531) {
            c26531 = (C26531) dVar;
            int i10 = c26531.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c26531.label = i10 - Integer.MIN_VALUE;
            } else {
                c26531 = new C26531(dVar);
            }
        } else {
            c26531 = new C26531(dVar);
        }
        Object templateDevice = c26531.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c26531.label;
        if (i11 == 0) {
            ResultKt.m(templateDevice);
            DeviceHelper deviceHelper = getDeviceHelper();
            c26531.label = 1;
            templateDevice = deviceHelper.getTemplateDevice(c26531);
            if (templateDevice == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(templateDevice);
        }
        Map mutableMap = MapsKt.toMutableMap((Map) templateDevice);
        mutableMap.remove("utcDate");
        mutableMap.remove("localDate");
        mutableMap.remove("localTime");
        mutableMap.remove("utcTime");
        mutableMap.remove("utcDateTime");
        mutableMap.remove("localDateTime");
        return new HashMap(mutableMap);
    }

    @Override // com.superwall.sdk.dependencies.ConfigManagerFactory
    @Nullable
    public Paywall makeStaticPaywall(@Nullable String str, boolean z10) {
        if (z10) {
            return null;
        }
        return ConfigLogic.INSTANCE.getStaticPaywall(str, getConfigManager().getConfig(), makeDeviceInfo().getLocale());
    }

    @Override // com.superwall.sdk.dependencies.StoreTransactionFactory
    @Nullable
    public Object makeStoreTransaction(@NotNull Purchase purchase, @NotNull kotlin.coroutines.d<? super StoreTransaction> dVar) {
        String requestId;
        GoogleBillingPurchaseTransaction googleBillingPurchaseTransaction = new GoogleBillingPurchaseTransaction(purchase);
        Config config = getConfigManager().getConfig();
        if (config == null || (requestId = config.getRequestId()) == null) {
            requestId = "";
        }
        return new StoreTransaction(googleBillingPurchaseTransaction, requestId, this.appSessionManager.getAppSession().getId());
    }

    @Override // com.superwall.sdk.dependencies.OptionsFactory
    @NotNull
    public SuperwallOptions makeSuperwallOptions() {
        return getConfigManager().getOptions();
    }

    @Override // com.superwall.sdk.dependencies.TransactionVerifierFactory
    @NotNull
    public GoogleBillingWrapper makeTransactionVerifier() {
        return this.googleBillingWrapper;
    }

    @Override // com.superwall.sdk.dependencies.TriggerFactory
    @Nullable
    public Object makeTriggers(@NotNull kotlin.coroutines.d<? super Set<String>> dVar) {
        return getConfigManager().getTriggersByEventName().keySet();
    }

    @Override // com.superwall.sdk.dependencies.UserAttributesEventFactory
    @NotNull
    public InternalSuperwallEvent.Attributes makeUserAttributesEvent() {
        return new InternalSuperwallEvent.Attributes(getDeviceHelper().getAppInstalledAtString(), new HashMap(getIdentityManager().getUserAttributes()));
    }

    @Override // com.superwall.sdk.paywall.presentation.rule_logic.javascript.RuleEvaluator.Factory
    @Nullable
    public Object provideRuleEvaluator(@NotNull Context context, @NotNull kotlin.coroutines.d<? super ExpressionEvaluating> dVar) {
        return getEvaluator();
    }

    @Override // com.superwall.sdk.dependencies.WebToAppFactory
    @NotNull
    public String restoreUrl() {
        Config config;
        WebToAppConfig webToAppConfig;
        String restoreAccesUrl;
        ConfigManager configManager = getConfigManager();
        return (configManager == null || (config = configManager.getConfig()) == null || (webToAppConfig = config.getWebToAppConfig()) == null || (restoreAccesUrl = webToAppConfig.getRestoreAccesUrl()) == null) ? "" : restoreAccesUrl;
    }

    public final void setActivityProvider(@Nullable ActivityProvider activityProvider) {
        this.activityProvider = activityProvider;
    }

    @Override // com.superwall.sdk.dependencies.ApiFactory
    public void setApi(@NotNull Api api) {
        Intrinsics.checkNotNullParameter(api, "<set-?>");
        this.api = api;
    }

    @Override // com.superwall.sdk.dependencies.ApiFactory
    public void setAppLifecycleObserver(@NotNull AppLifecycleObserver appLifecycleObserver) {
        Intrinsics.checkNotNullParameter(appLifecycleObserver, "<set-?>");
        this.appLifecycleObserver = appLifecycleObserver;
    }

    public final void setAppSessionManager(@NotNull AppSessionManager appSessionManager) {
        Intrinsics.checkNotNullParameter(appSessionManager, "<set-?>");
        this.appSessionManager = appSessionManager;
    }

    @Override // com.superwall.sdk.dependencies.ApiFactory
    public void setConfigManager(@NotNull ConfigManager configManager) {
        Intrinsics.checkNotNullParameter(configManager, "<set-?>");
        this.configManager = configManager;
    }

    public final void setDebugManager(@NotNull DebugManager debugManager) {
        Intrinsics.checkNotNullParameter(debugManager, "<set-?>");
        this.debugManager = debugManager;
    }

    public final void setDelegateAdapter(@NotNull SuperwallDelegateAdapter superwallDelegateAdapter) {
        Intrinsics.checkNotNullParameter(superwallDelegateAdapter, "<set-?>");
        this.delegateAdapter = superwallDelegateAdapter;
    }

    @Override // com.superwall.sdk.dependencies.ApiFactory
    public void setDeviceHelper(@NotNull DeviceHelper deviceHelper) {
        Intrinsics.checkNotNullParameter(deviceHelper, "<set-?>");
        this.deviceHelper = deviceHelper;
    }

    public final void setEntitlements(@NotNull Entitlements entitlements) {
        Intrinsics.checkNotNullParameter(entitlements, "<set-?>");
        this.entitlements = entitlements;
    }

    public final void setEventsQueue(@NotNull EventsQueue eventsQueue) {
        Intrinsics.checkNotNullParameter(eventsQueue, "<set-?>");
        this.eventsQueue = eventsQueue;
    }

    @Override // com.superwall.sdk.dependencies.ApiFactory
    public void setIdentityManager(@NotNull IdentityManager identityManager) {
        Intrinsics.checkNotNullParameter(identityManager, "<set-?>");
        this.identityManager = identityManager;
    }

    public final void setNetwork(@NotNull Network network) {
        Intrinsics.checkNotNullParameter(network, "<set-?>");
        this.network = network;
    }

    public final void setPaywallManager(@NotNull PaywallManager paywallManager) {
        Intrinsics.checkNotNullParameter(paywallManager, "<set-?>");
        this.paywallManager = paywallManager;
    }

    public final void setPaywallRequestManager(@NotNull PaywallRequestManager paywallRequestManager) {
        Intrinsics.checkNotNullParameter(paywallRequestManager, "<set-?>");
        this.paywallRequestManager = paywallRequestManager;
    }

    public final void setReedemer(@NotNull WebPaywallRedeemer webPaywallRedeemer) {
        Intrinsics.checkNotNullParameter(webPaywallRedeemer, "<set-?>");
        this.reedemer = webPaywallRedeemer;
    }

    public final void setSessionEventsManager(@NotNull SessionEventsManager sessionEventsManager) {
        Intrinsics.checkNotNullParameter(sessionEventsManager, "<set-?>");
        this.sessionEventsManager = sessionEventsManager;
    }

    @Override // com.superwall.sdk.dependencies.ApiFactory
    public void setStorage(@NotNull LocalStorage localStorage) {
        Intrinsics.checkNotNullParameter(localStorage, "<set-?>");
        this.storage = localStorage;
    }

    public final void setStoreManager(@NotNull StoreManager storeManager) {
        Intrinsics.checkNotNullParameter(storeManager, "<set-?>");
        this.storeManager = storeManager;
    }

    @Override // com.superwall.sdk.dependencies.ApiFactory
    @Nullable
    public Object track(@NotNull Trackable trackable, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return ApiFactory.DefaultImpls.track(this, trackable, dVar);
    }

    @Override // com.superwall.sdk.dependencies.ViewStoreFactory
    @NotNull
    public ViewStorageViewModel makeViewStore() {
        return (ViewStorageViewModel) this.vmProvider.c(ViewStorageViewModel.class);
    }

    public /* synthetic */ DependencyContainer(Context context, PurchaseController purchaseController, SuperwallOptions superwallOptions, ActivityProvider activityProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : purchaseController, superwallOptions, activityProvider);
    }
}
