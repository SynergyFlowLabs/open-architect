package com.superwall.sdk;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import androidx.work.m0;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.z;
import com.superwall.sdk.analytics.internal.TrackingKt;
import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import com.superwall.sdk.analytics.superwall.SuperwallEventInfo;
import com.superwall.sdk.config.ConfigManager;
import com.superwall.sdk.config.models.ConfigState;
import com.superwall.sdk.config.models.ConfigurationStatus;
import com.superwall.sdk.config.options.SuperwallOptions;
import com.superwall.sdk.deeplinks.DeepLinkRouter;
import com.superwall.sdk.delegate.PurchaseResult;
import com.superwall.sdk.delegate.RestorationResult;
import com.superwall.sdk.delegate.SuperwallDelegate;
import com.superwall.sdk.delegate.SuperwallDelegateJava;
import com.superwall.sdk.delegate.subscription_controller.PurchaseController;
import com.superwall.sdk.dependencies.DependencyContainer;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.misc.ActivityProvider;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.misc.IOScope;
import com.superwall.sdk.misc.MainScope;
import com.superwall.sdk.misc.ScopesKt;
import com.superwall.sdk.misc.SerialTaskManager;
import com.superwall.sdk.models.assignment.ConfirmedAssignment;
import com.superwall.sdk.models.entitlements.Entitlement;
import com.superwall.sdk.models.entitlements.SubscriptionStatus;
import com.superwall.sdk.models.internal.RedemptionOwnershipType;
import com.superwall.sdk.models.internal.VendorId;
import com.superwall.sdk.models.triggers.Experiment;
import com.superwall.sdk.network.device.InterfaceStyle;
import com.superwall.sdk.paywall.presentation.PaywallInfo;
import com.superwall.sdk.paywall.presentation.PresentationItems;
import com.superwall.sdk.paywall.view.PaywallView;
import com.superwall.sdk.paywall.view.SuperwallPaywallActivity;
import com.superwall.sdk.paywall.view.delegate.PaywallViewEventCallback;
import com.superwall.sdk.paywall.view.webview.messaging.PaywallWebEvent;
import com.superwall.sdk.storage.LocalStorage;
import com.superwall.sdk.storage.StoredSubscriptionStatus;
import com.superwall.sdk.store.Entitlements;
import com.superwall.sdk.store.PurchasingObserverState;
import com.superwall.sdk.store.StoreKit;
import com.superwall.sdk.store.StoreManager;
import com.superwall.sdk.store.abstractions.product.RawStoreProduct;
import com.superwall.sdk.store.abstractions.product.StoreProduct;
import com.superwall.sdk.store.transactions.TransactionManager;
import com.superwall.sdk.utilities.ErrorTrackingKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.d;
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
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.q0;
import kotlinx.coroutines.flow.z0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import oj.j;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSuperwall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Superwall.kt\ncom/superwall/sdk/Superwall\n+ 2 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTrackingKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 7 Either.kt\ncom/superwall/sdk/misc/EitherKt\n+ 8 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1155:1\n136#2,10:1156\n136#2,10:1175\n136#2,10:1185\n136#2,10:1195\n136#2,10:1205\n136#2,10:1215\n136#2,10:1225\n136#2,10:1235\n136#2,2:1249\n138#2,8:1255\n136#2,2:1267\n138#2,8:1280\n136#2,10:1292\n136#2,10:1306\n136#2,10:1320\n136#2,10:1334\n136#2,10:1348\n11165#3:1166\n11500#3,3:1167\n49#4:1170\n51#4:1174\n17#4:1362\n19#4:1366\n46#5:1171\n51#5:1173\n46#5:1363\n51#5:1365\n105#6:1172\n105#6:1364\n122#7,4:1245\n122#7,4:1263\n108#7,5:1274\n122#7,4:1288\n122#7,4:1302\n122#7,4:1316\n122#7,4:1330\n122#7,4:1344\n122#7,4:1358\n126#8:1251\n153#8,3:1252\n126#8:1269\n153#8,3:1270\n1863#9:1273\n1864#9:1279\n*S KotlinDebug\n*F\n+ 1 Superwall.kt\ncom/superwall/sdk/Superwall\n*L\n201#1:1156,10\n516#1:1175,10\n609#1:1185,10\n623#1:1195,10\n635#1:1205,10\n648#1:1215,10\n657#1:1225,10\n685#1:1235,10\n754#1:1249,2\n754#1:1255,8\n771#1:1267,2\n771#1:1280,8\n843#1:1292,10\n865#1:1306,10\n887#1:1320,10\n904#1:1334,10\n1053#1:1348,10\n267#1:1166\n267#1:1167,3\n382#1:1170\n382#1:1174\n402#1:1362\n402#1:1366\n382#1:1171\n382#1:1173\n402#1:1363\n402#1:1365\n382#1:1172\n402#1:1364\n708#1:1245,4\n758#1:1263,4\n794#1:1274,5\n810#1:1288,4\n849#1:1302,4\n871#1:1316,4\n895#1:1330,4\n906#1:1344,4\n1055#1:1358,4\n757#1:1251\n757#1:1252,3\n780#1:1269\n780#1:1270,3\n784#1:1273\n784#1:1279\n*E\n"})
public final class Superwall implements PaywallViewEventCallback {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final k0<Boolean> _hasInitialized;

    @Nullable
    private static Superwall _instance;

    @NotNull
    private static final i<Boolean> hasInitialized;
    private static boolean initialized;
    private DependencyContainer _dependencyContainer;

    @Nullable
    private SuperwallOptions _options;

    @NotNull
    private final j0<SuperwallEventInfo> _placements;

    @Nullable
    private ActivityProvider activityProvider;

    @NotNull
    private String apiKey;

    @Nullable
    private final Function1<Result<Unit>, Unit> completion;

    @NotNull
    private Context context;

    @NotNull
    private final f0 entitlements$delegate;

    @NotNull
    private final o0<SuperwallEventInfo> placements;

    @NotNull
    private final PresentationItems presentationItems;

    @Nullable
    private PurchaseController purchaseController;

    @Nullable
    private p2 purchaseTask;

    @NotNull
    private final SerialTaskManager serialTaskManager;

    @NotNull
    private final f0 subscriptionStatus$delegate;

    @SourceDebugExtension({"SMAP\nSuperwall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Superwall.kt\ncom/superwall/sdk/Superwall$Companion\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 Either.kt\ncom/superwall/sdk/misc/EitherKt\n*L\n1#1,1155:1\n230#2,5:1156\n230#2,5:1165\n122#3,4:1161\n*S KotlinDebug\n*F\n+ 1 Superwall.kt\ncom/superwall/sdk/Superwall$Companion\n*L\n443#1:1156,5\n473#1:1165,5\n464#1:1161,4\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void configure$default(Companion companion, Application application, String str, PurchaseController purchaseController, SuperwallOptions superwallOptions, ActivityProvider activityProvider, Function1 function1, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                purchaseController = null;
            }
            if ((i10 & 8) != 0) {
                superwallOptions = null;
            }
            if ((i10 & 16) != 0) {
                activityProvider = null;
            }
            if ((i10 & 32) != 0) {
                function1 = null;
            }
            companion.configure(application, str, purchaseController, superwallOptions, activityProvider, function1);
        }

        @j
        @n
        public final void configure(@NotNull Application applicationContext, @NotNull String apiKey) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            configure$default(this, applicationContext, apiKey, null, null, null, null, 60, null);
        }

        @NotNull
        public final i<Boolean> getHasInitialized() {
            return Superwall.hasInitialized;
        }

        public final boolean getInitialized() {
            return Superwall.initialized;
        }

        @NotNull
        public final Superwall getInstance() {
            Superwall superwall = Superwall._instance;
            if (superwall != null) {
                return superwall;
            }
            throw new IllegalStateException("Superwall has not been initialized or configured.");
        }

        @NotNull
        /* JADX INFO: renamed from: handleDeepLink-IoAF18A, reason: not valid java name */
        public final Object m20handleDeepLinkIoAF18A(@NotNull Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return DeepLinkRouter.Companion.m25handleDeepLinkIoAF18A(uri);
        }

        public final void setInitialized(boolean z10) {
            Superwall.initialized = z10;
        }

        private Companion() {
        }

        @j
        @n
        public final void configure(@NotNull Application applicationContext, @NotNull String apiKey, @Nullable PurchaseController purchaseController) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            configure$default(this, applicationContext, apiKey, purchaseController, null, null, null, 56, null);
        }

        @j
        @n
        public final void configure(@NotNull Application applicationContext, @NotNull String apiKey, @Nullable PurchaseController purchaseController, @Nullable SuperwallOptions superwallOptions) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            int i10 = 3 ^ 0;
            configure$default(this, applicationContext, apiKey, purchaseController, superwallOptions, null, null, 48, null);
        }

        @j
        @n
        public final void configure(@NotNull Application applicationContext, @NotNull String apiKey, @Nullable PurchaseController purchaseController, @Nullable SuperwallOptions superwallOptions, @Nullable ActivityProvider activityProvider) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            configure$default(this, applicationContext, apiKey, purchaseController, superwallOptions, activityProvider, null, 32, null);
        }

        @j
        @n
        public final void configure(@NotNull Application applicationContext, @NotNull String apiKey, @Nullable PurchaseController purchaseController, @Nullable SuperwallOptions superwallOptions, @Nullable ActivityProvider activityProvider, @Nullable Function1<? super Result<Unit>, Unit> function1) {
            Object objM785constructorimpl;
            Object value;
            Object value2;
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            if (((Boolean) Superwall._hasInitialized.getValue()).booleanValue() && Superwall._instance == null) {
                k0 k0Var = Superwall._hasInitialized;
                do {
                    value2 = k0Var.getValue();
                    ((Boolean) value2).getClass();
                } while (!k0Var.compareAndSet(value2, Boolean.FALSE));
            }
            if (Superwall._instance != null) {
                Logger.debug$default(Logger.INSTANCE, LogLevel.warn, LogScope.superwallCore, "Superwall.configure called multiple times. Please make sure you only call this once on app launch.", null, null, 24, null);
                if (function1 != null) {
                    Result.a aVar = Result.Companion;
                    function1.invoke(Result.a(Result.m785constructorimpl(Unit.f312394a)));
                    return;
                }
                return;
            }
            Superwall._instance = new Superwall(applicationContext, apiKey, purchaseController, superwallOptions, activityProvider, function1);
            Either<Unit, Throwable> either = getInstance().setup$superwall_release();
            if (either instanceof Either.Success) {
                Result.a aVar2 = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(((Either.Success) either).getValue());
            } else {
                if (!(either instanceof Either.Failure)) {
                    throw new kotlin.k0();
                }
                Result.a aVar3 = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(((Either.Failure) either).getError()));
            }
            Throwable thD = Result.d(objM785constructorimpl);
            if (thD == null) {
                Companion companion = Superwall.Companion;
                String sdkVersion = companion.getInstance().getDependencyContainer$superwall_release().getDeviceHelper().getSdkVersion();
                Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.superwallCore, "SDK Version - " + sdkVersion, null, null, 24, null);
                companion.setInitialized(true);
                k0 k0Var2 = Superwall._hasInitialized;
                do {
                    value = k0Var2.getValue();
                    ((Boolean) value).getClass();
                } while (!k0Var2.compareAndSet(value, Boolean.TRUE));
                return;
            }
            if (function1 != null) {
                Result.a aVar4 = Result.Companion;
                function1.invoke(Result.a(Result.m785constructorimpl(ResultKt.createFailure(thD))));
            }
            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.superwallCore, "Superwall SDK failed to initialize - " + thD.getMessage(), null, thD, 8, null);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.Superwall$addListeners$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.Superwall$addListeners$1", f = "Superwall.kt", i = {}, l = {570}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return Superwall.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                i iVarL0 = k.l0(Superwall.this.getEntitlements().getStatus(), 1);
                C18721 c18721 = new C18721(Superwall.this);
                this.label = 1;
                if (iVarL0.collect(c18721, this) == objL) {
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
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }

        /* JADX INFO: renamed from: com.superwall.sdk.Superwall$addListeners$1$1, reason: invalid class name and collision with other inner class name */
        static final class C18721<T> implements kotlinx.coroutines.flow.j {
            final /* synthetic */ Superwall this$0;

            C18721(Superwall superwall) {
                this.this$0 = superwall;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            /* JADX WARN: Multi-variable type inference failed */
            public final Object emit(SubscriptionStatus subscriptionStatus, d<? super Unit> dVar) {
                Superwall$addListeners$1$1$emit$1 superwall$addListeners$1$1$emit$1;
                if (dVar instanceof Superwall$addListeners$1$1$emit$1) {
                    superwall$addListeners$1$1$emit$1 = (Superwall$addListeners$1$1$emit$1) dVar;
                    int i10 = superwall$addListeners$1$1$emit$1.label;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        superwall$addListeners$1$1$emit$1.label = i10 - Integer.MIN_VALUE;
                    } else {
                        superwall$addListeners$1$1$emit$1 = new Superwall$addListeners$1$1$emit$1(this, dVar);
                    }
                } else {
                    superwall$addListeners$1$1$emit$1 = new Superwall$addListeners$1$1$emit$1(this, dVar);
                }
                Object obj = superwall$addListeners$1$1$emit$1.result;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = superwall$addListeners$1$1$emit$1.label;
                if (i11 == 0) {
                    ResultKt.m(obj);
                    LocalStorage storage = this.this$0.getDependencyContainer$superwall_release().getStorage();
                    StoredSubscriptionStatus storedSubscriptionStatus = StoredSubscriptionStatus.INSTANCE;
                    SubscriptionStatus subscriptionStatus2 = (SubscriptionStatus) storage.read(storedSubscriptionStatus);
                    if (subscriptionStatus2 == null) {
                        subscriptionStatus2 = SubscriptionStatus.Unknown.INSTANCE;
                    }
                    this.this$0.getDependencyContainer$superwall_release().getStorage().write(storedSubscriptionStatus, subscriptionStatus);
                    this.this$0.getDependencyContainer$superwall_release().getDelegateAdapter().subscriptionStatusDidChange(subscriptionStatus2, subscriptionStatus);
                    InternalSuperwallEvent.SubscriptionStatusDidChange subscriptionStatusDidChange = new InternalSuperwallEvent.SubscriptionStatusDidChange(subscriptionStatus, null, 2, 0 == true ? 1 : 0);
                    Superwall superwall = this.this$0;
                    superwall$addListeners$1$1$emit$1.label = 1;
                    if (TrackingKt.track(superwall, subscriptionStatusDidChange, superwall$addListeners$1$1$emit$1) == objL) {
                        return objL;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    ((Result) obj).j();
                }
                return Unit.f312394a;
            }

            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar) {
                return emit((SubscriptionStatus) obj, (d<? super Unit>) dVar);
            }
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.Superwall$confirmAllAssignments$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.Superwall", f = "Superwall.kt", i = {0, 1, 1}, l = {773, 794}, m = "confirmAllAssignments-IoAF18A", n = {"this", "this", "assignments"}, s = {"L$0", "L$0", "L$1"})
    static final class C26131 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C26131(d<? super C26131> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objM10confirmAllAssignmentsIoAF18A = Superwall.this.m10confirmAllAssignmentsIoAF18A(this);
            return objM10confirmAllAssignmentsIoAF18A == kotlin.coroutines.intrinsics.b.l() ? objM10confirmAllAssignmentsIoAF18A : Result.a(objM10confirmAllAssignmentsIoAF18A);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.Superwall$confirmAllAssignments$3, reason: invalid class name */
    @f(c = "com.superwall.sdk.Superwall$confirmAllAssignments$3", f = "Superwall.kt", i = {}, l = {824}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Function1<Result<? extends List<ConfirmedAssignment>>, Unit> $callback;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(Function1<? super Result<? extends List<ConfirmedAssignment>>, Unit> function1, d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$callback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return Superwall.this.new AnonymousClass3(this.$callback, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objM10confirmAllAssignmentsIoAF18A;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Superwall superwall = Superwall.this;
                this.label = 1;
                objM10confirmAllAssignmentsIoAF18A = superwall.m10confirmAllAssignmentsIoAF18A(this);
                if (objM10confirmAllAssignmentsIoAF18A == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                objM10confirmAllAssignmentsIoAF18A = ((Result) obj).j();
            }
            this.$callback.invoke(Result.a(objM10confirmAllAssignmentsIoAF18A));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass3) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.Superwall$eventDidOccur$2, reason: invalid class name */
    @f(c = "com.superwall.sdk.Superwall$eventDidOccur$2", f = "Superwall.kt", i = {}, l = {1081, 1110, 1130}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ PaywallWebEvent $paywallEvent;
        final /* synthetic */ PaywallView $paywallView;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ Superwall this$0;

        /* JADX INFO: renamed from: com.superwall.sdk.Superwall$eventDidOccur$2$1, reason: invalid class name */
        @f(c = "com.superwall.sdk.Superwall$eventDidOccur$2$1", f = "Superwall.kt", i = {}, l = {1096}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends o implements Function2<s0, d<? super Unit>, Object> {
            final /* synthetic */ PaywallWebEvent $paywallEvent;
            final /* synthetic */ PaywallView $paywallView;
            int label;
            final /* synthetic */ Superwall this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Superwall superwall, PaywallWebEvent paywallWebEvent, PaywallView paywallView, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.this$0 = superwall;
                this.$paywallEvent = paywallWebEvent;
                this.$paywallView = paywallView;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new AnonymousClass1(this.this$0, this.$paywallEvent, this.$paywallView, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.label;
                int i11 = 3 ^ 1;
                try {
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        TransactionManager transactionManager = this.this$0.getDependencyContainer$superwall_release().getTransactionManager();
                        TransactionManager.PurchaseSource.Internal internal = new TransactionManager.PurchaseSource.Internal(((PaywallWebEvent.InitiatePurchase) this.$paywallEvent).getProductId(), this.$paywallView);
                        this.label = 1;
                        obj = transactionManager.purchase(internal, this);
                        if (obj == objL) {
                            return objL;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.m(obj);
                    }
                    this.this$0.purchaseTask = null;
                    return Unit.f312394a;
                } catch (Throwable th2) {
                    this.this$0.purchaseTask = null;
                    throw th2;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
                return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PaywallWebEvent paywallWebEvent, Superwall superwall, PaywallView paywallView, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$paywallEvent = paywallWebEvent;
            this.this$0 = superwall;
            this.$paywallView = paywallView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$paywallEvent, this.this$0, this.$paywallView, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
        
            if (com.superwall.sdk.paywall.presentation.internal.InternalPresentationKt.dismiss$default(r6, r7, r8, r9, null, r14, 8, null) == r0) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00bb, code lost:
        
            if (r14.tryToRestorePurchases(r15, r14) == r0) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x017a, code lost:
        
            if (r14 == r0) goto L50;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 393
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.Superwall.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.Superwall$observe$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.Superwall$observe$1", f = "Superwall.kt", i = {}, l = {977, 986, 994}, m = "invokeSuspend", n = {}, s = {})
    static final class C26141 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ PurchasingObserverState $state;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26141(PurchasingObserverState purchasingObserverState, d<? super C26141> dVar) {
            super(2, dVar);
            this.$state = purchasingObserverState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return Superwall.this.new C26141(this.$state, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:41:0x00d3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:43:? A[LOOP:0: B:26:0x00ad->B:43:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
        
            if (r15.prepareToPurchase$superwall_release(r1, r2, r14) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00fc, code lost:
        
            if (r15.handle$superwall_release(r1, r3, r14) == r0) goto L35;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.Superwall.C26141.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C26141) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.Superwall$preloadAllPaywalls$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.Superwall$preloadAllPaywalls$1", f = "Superwall.kt", i = {}, l = {725}, m = "invokeSuspend", n = {}, s = {})
    static final class C26151 extends o implements Function2<s0, d<? super Unit>, Object> {
        int label;

        C26151(d<? super C26151> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return Superwall.this.new C26151(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                ConfigManager configManager = Superwall.this.getDependencyContainer$superwall_release().getConfigManager();
                this.label = 1;
                if (configManager.preloadAllPaywalls(this) == objL) {
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
            return ((C26151) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.Superwall$preloadPaywalls$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.Superwall$preloadPaywalls$1", f = "Superwall.kt", i = {}, l = {741}, m = "invokeSuspend", n = {}, s = {})
    static final class C26161 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Set<String> $placementNames;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26161(Set<String> set, d<? super C26161> dVar) {
            super(2, dVar);
            this.$placementNames = set;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return Superwall.this.new C26161(this.$placementNames, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                ConfigManager configManager = Superwall.this.getDependencyContainer$superwall_release().getConfigManager();
                Set<String> set = this.$placementNames;
                this.label = 1;
                if (configManager.preloadPaywallsByNames(set, this) == objL) {
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
            return ((C26161) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.Superwall$purchase$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.Superwall", f = "Superwall.kt", i = {}, l = {844}, m = "purchase-gIAlu-s", n = {}, s = {})
    static final class C26171 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C26171(d<? super C26171> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objM15purchasegIAlus = Superwall.this.m15purchasegIAlus((z) null, this);
            return objM15purchasegIAlus == kotlin.coroutines.intrinsics.b.l() ? objM15purchasegIAlus : Result.a(objM15purchasegIAlus);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.Superwall$purchase$3, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.Superwall", f = "Superwall.kt", i = {}, l = {866}, m = "purchase-gIAlu-s", n = {}, s = {})
    static final class C26183 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C26183(d<? super C26183> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objM16purchasegIAlus = Superwall.this.m16purchasegIAlus((StoreProduct) null, this);
            return objM16purchasegIAlus == kotlin.coroutines.intrinsics.b.l() ? objM16purchasegIAlus : Result.a(objM16purchasegIAlus);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.Superwall$purchase$5, reason: invalid class name */
    @f(c = "com.superwall.sdk.Superwall", f = "Superwall.kt", i = {0, 0, 1}, l = {888, 889}, m = "purchase-gIAlu-s", n = {"this", "productId", "productId"}, s = {"L$0", "L$1", "L$0"})
    static final class AnonymousClass5 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass5(d<? super AnonymousClass5> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objM17purchasegIAlus = Superwall.this.m17purchasegIAlus((String) null, this);
            return objM17purchasegIAlus == kotlin.coroutines.intrinsics.b.l() ? objM17purchasegIAlus : Result.a(objM17purchasegIAlus);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.Superwall$purchase$7, reason: invalid class name */
    @f(c = "com.superwall.sdk.Superwall$purchase$7", f = "Superwall.kt", i = {}, l = {927}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass7 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Function1<Result<? extends PurchaseResult>, Unit> $onFinished;
        final /* synthetic */ StoreProduct $product;
        Object L$0;
        int label;
        final /* synthetic */ Superwall this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass7(Function1<? super Result<? extends PurchaseResult>, Unit> function1, Superwall superwall, StoreProduct storeProduct, d<? super AnonymousClass7> dVar) {
            super(2, dVar);
            this.$onFinished = function1;
            this.this$0 = superwall;
            this.$product = storeProduct;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass7(this.$onFinished, this.this$0, this.$product, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objJ;
            Function1<Result<? extends PurchaseResult>, Unit> function1;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Function1<Result<? extends PurchaseResult>, Unit> function2 = this.$onFinished;
                Superwall superwall = this.this$0;
                StoreProduct storeProduct = this.$product;
                this.L$0 = function2;
                this.label = 1;
                Object objM16purchasegIAlus = superwall.m16purchasegIAlus(storeProduct, this);
                if (objM16purchasegIAlus == objL) {
                    return objL;
                }
                objJ = objM16purchasegIAlus;
                function1 = function2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.L$0;
                ResultKt.m(obj);
                objJ = ((Result) obj).j();
            }
            function1.invoke(Result.a(objJ));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass7) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.Superwall$purchase$8, reason: invalid class name */
    @f(c = "com.superwall.sdk.Superwall$purchase$8", f = "Superwall.kt", i = {}, l = {936}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass8 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Function1<Result<? extends PurchaseResult>, Unit> $onFinished;
        final /* synthetic */ z $product;
        Object L$0;
        int label;
        final /* synthetic */ Superwall this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass8(Function1<? super Result<? extends PurchaseResult>, Unit> function1, Superwall superwall, z zVar, d<? super AnonymousClass8> dVar) {
            super(2, dVar);
            this.$onFinished = function1;
            this.this$0 = superwall;
            this.$product = zVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass8(this.$onFinished, this.this$0, this.$product, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objJ;
            Function1<Result<? extends PurchaseResult>, Unit> function1;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Function1<Result<? extends PurchaseResult>, Unit> function2 = this.$onFinished;
                Superwall superwall = this.this$0;
                z zVar = this.$product;
                this.L$0 = function2;
                this.label = 1;
                Object objM15purchasegIAlus = superwall.m15purchasegIAlus(zVar, this);
                if (objM15purchasegIAlus == objL) {
                    return objL;
                }
                objJ = objM15purchasegIAlus;
                function1 = function2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.L$0;
                ResultKt.m(obj);
                objJ = ((Result) obj).j();
            }
            function1.invoke(Result.a(objJ));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass8) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.Superwall$purchase$9, reason: invalid class name */
    @f(c = "com.superwall.sdk.Superwall$purchase$9", f = "Superwall.kt", i = {}, l = {945}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass9 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Function1<Result<? extends PurchaseResult>, Unit> $onFinished;
        final /* synthetic */ String $productId;
        Object L$0;
        int label;
        final /* synthetic */ Superwall this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass9(Function1<? super Result<? extends PurchaseResult>, Unit> function1, Superwall superwall, String str, d<? super AnonymousClass9> dVar) {
            super(2, dVar);
            this.$onFinished = function1;
            this.this$0 = superwall;
            this.$productId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass9(this.$onFinished, this.this$0, this.$productId, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objJ;
            Function1<Result<? extends PurchaseResult>, Unit> function1;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Function1<Result<? extends PurchaseResult>, Unit> function2 = this.$onFinished;
                Superwall superwall = this.this$0;
                String str = this.$productId;
                this.L$0 = function2;
                this.label = 1;
                Object objM17purchasegIAlus = superwall.m17purchasegIAlus(str, this);
                if (objM17purchasegIAlus == objL) {
                    return objL;
                }
                objJ = objM17purchasegIAlus;
                function1 = function2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.L$0;
                ResultKt.m(obj);
                objJ = ((Result) obj).j();
            }
            function1.invoke(Result.a(objJ));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((AnonymousClass9) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.Superwall$restorePurchases$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.Superwall", f = "Superwall.kt", i = {}, l = {1054}, m = "restorePurchases-IoAF18A", n = {}, s = {})
    static final class C26191 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C26191(d<? super C26191> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objM18restorePurchasesIoAF18A = Superwall.this.m18restorePurchasesIoAF18A(this);
            return objM18restorePurchasesIoAF18A == kotlin.coroutines.intrinsics.b.l() ? objM18restorePurchasesIoAF18A : Result.a(objM18restorePurchasesIoAF18A);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.Superwall$restorePurchases$3, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.Superwall$restorePurchases$3", f = "Superwall.kt", i = {}, l = {1064}, m = "invokeSuspend", n = {}, s = {})
    static final class C26203 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ Function1<Result<? extends RestorationResult>, Unit> $onFinished;
        Object L$0;
        int label;
        final /* synthetic */ Superwall this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C26203(Function1<? super Result<? extends RestorationResult>, Unit> function1, Superwall superwall, d<? super C26203> dVar) {
            super(2, dVar);
            this.$onFinished = function1;
            this.this$0 = superwall;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C26203(this.$onFinished, this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objJ;
            Function1<Result<? extends RestorationResult>, Unit> function1;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Function1<Result<? extends RestorationResult>, Unit> function2 = this.$onFinished;
                Superwall superwall = this.this$0;
                this.L$0 = function2;
                this.label = 1;
                Object objM18restorePurchasesIoAF18A = superwall.m18restorePurchasesIoAF18A(this);
                if (objM18restorePurchasesIoAF18A == objL) {
                    return objL;
                }
                objJ = objM18restorePurchasesIoAF18A;
                function1 = function2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (Function1) this.L$0;
                ResultKt.m(obj);
                objJ = ((Result) obj).j();
            }
            function1.invoke(Result.a(objJ));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C26203) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.Superwall$togglePaywallSpinner$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.Superwall$togglePaywallSpinner$1", f = "Superwall.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C26211 extends o implements Function2<s0, d<? super Unit>, Object> {
        final /* synthetic */ boolean $isHidden;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C26211(boolean z10, d<? super C26211> dVar) {
            super(2, dVar);
            this.$isHidden = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return Superwall.this.new C26211(this.$isHidden, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            PaywallView currentView = Superwall.this.getDependencyContainer$superwall_release().getPaywallManager().getCurrentView();
            if (currentView == null) {
                return Unit.f312394a;
            }
            currentView.togglePaywallSpinner(this.$isHidden);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
            return ((C26211) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static {
        final k0<Boolean> k0VarA = b1.a(Boolean.FALSE);
        _hasInitialized = k0VarA;
        hasInitialized = k.W1(new i<Boolean>() { // from class: com.superwall.sdk.Superwall$special$$inlined$filter$1

            /* JADX INFO: renamed from: com.superwall.sdk.Superwall$special$$inlined$filter$1$2, reason: invalid class name */
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Superwall.kt\ncom/superwall/sdk/Superwall\n*L\n1#1,49:1\n18#2:50\n19#2:52\n402#3:51\n*E\n"})
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {
                final /* synthetic */ kotlinx.coroutines.flow.j $this_unsafeFlow;

                /* JADX INFO: renamed from: com.superwall.sdk.Superwall$special$$inlined$filter$1$2$1, reason: invalid class name */
                @f(c = "com.superwall.sdk.Superwall$special$$inlined$filter$1$2", f = "Superwall.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
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

                /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                @Override // kotlinx.coroutines.flow.j
                public final Object emit(Object obj, d dVar) {
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
                        if (((Boolean) obj).booleanValue()) {
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
            public Object collect(kotlinx.coroutines.flow.j<? super Boolean> jVar, d dVar) {
                Object objCollect = k0VarA.collect(new AnonymousClass2(jVar), dVar);
                return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
            }
        }, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Superwall(@NotNull Context context, @NotNull String apiKey, @Nullable PurchaseController purchaseController, @Nullable SuperwallOptions superwallOptions, @Nullable ActivityProvider activityProvider, @Nullable Function1<? super Result<Unit>, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.apiKey = apiKey;
        this.purchaseController = purchaseController;
        this.activityProvider = activityProvider;
        this.completion = function1;
        this._options = superwallOptions;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.context = applicationContext;
        this.presentationItems = new PresentationItems();
        j0<SuperwallEventInfo> j0VarA = q0.a(0, 256, kotlinx.coroutines.channels.j.SUSPEND);
        this._placements = j0VarA;
        this.placements = j0VarA;
        this.entitlements$delegate = g0.c(new Function0() { // from class: com.superwall.sdk.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Superwall.entitlements_delegate$lambda$2(this.f267354a);
            }
        });
        this.subscriptionStatus$delegate = g0.c(new Function0() { // from class: com.superwall.sdk.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Superwall.subscriptionStatus_delegate$lambda$3(this.f267358a);
            }
        });
        this.serialTaskManager = new SerialTaskManager(null, 1, 0 == true ? 1 : 0);
    }

    private final void addListeners() {
        ScopesKt.launchWithTracking(getIoScope$superwall_release(), new AnonymousClass1(null));
    }

    @j
    @n
    public static final void configure(@NotNull Application application, @NotNull String str) {
        Companion.configure(application, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Entitlements entitlements_delegate$lambda$2(Superwall superwall) {
        return superwall.getDependencyContainer$superwall_release().getEntitlements();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z0 subscriptionStatus_delegate$lambda$3(Superwall superwall) {
        return superwall.getDependencyContainer$superwall_release().getEntitlements().getStatus();
    }

    public final void cancelAllScheduledNotifications() {
        try {
            new Either.Success(m0.q(this.context).f(SuperwallPaywallActivity.NOTIFICATION_CHANNEL_ID));
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Companion companion = Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                }
            }
            new Either.Failure(th2);
        }
    }

    public final void confirmAllAssignments(@NotNull Superwall superwall, @NotNull Function1<? super Result<? extends List<ConfirmedAssignment>>, Unit> callback) {
        Intrinsics.checkNotNullParameter(superwall, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        kotlinx.coroutines.k.f(superwall.getIoScope$superwall_release(), null, null, superwall.new AnonymousClass3(callback, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00cc A[Catch: all -> 0x0153, TryCatch #0 {all -> 0x0153, blocks: (B:13:0x003a, B:39:0x010e, B:41:0x0114, B:34:0x00c6, B:36:0x00cc, B:49:0x0142, B:51:0x014d, B:43:0x011e, B:44:0x0122, B:46:0x0126, B:47:0x013c, B:48:0x0141, B:18:0x004b, B:24:0x0065, B:26:0x0073, B:29:0x007b, B:30:0x0098, B:32:0x009e, B:33:0x00b9, B:50:0x0149, B:21:0x0057), top: B:69:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0142 A[Catch: all -> 0x0153, TryCatch #0 {all -> 0x0153, blocks: (B:13:0x003a, B:39:0x010e, B:41:0x0114, B:34:0x00c6, B:36:0x00cc, B:49:0x0142, B:51:0x014d, B:43:0x011e, B:44:0x0122, B:46:0x0126, B:47:0x013c, B:48:0x0141, B:18:0x004b, B:24:0x0065, B:26:0x0073, B:29:0x007b, B:30:0x0098, B:32:0x009e, B:33:0x00b9, B:50:0x0149, B:21:0x0057), top: B:69:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0172  */
    /* JADX WARN: Code duplicated, block: B:63:0x017f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0183  */
    /* JADX WARN: Code duplicated, block: B:67:0x0194  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010b, code lost:
    
        if (r1 == r3) goto L38;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x010b -> B:39:0x010e). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: confirmAllAssignments-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10confirmAllAssignmentsIoAF18A(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Result<? extends java.util.List<com.superwall.sdk.models.assignment.ConfirmedAssignment>>> r19) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.Superwall.m10confirmAllAssignmentsIoAF18A(kotlin.coroutines.d):java.lang.Object");
    }

    @Nullable
    public final Object deviceAttributes(@NotNull d<? super Map<String, ? extends Object>> dVar) {
        return getDependencyContainer$superwall_release().makeSessionDeviceAttributes(dVar);
    }

    public final void emitSuperwallEvent$superwall_release(@NotNull SuperwallEventInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        kotlinx.coroutines.k.f(getIoScope$superwall_release(), null, null, new Superwall$emitSuperwallEvent$1(this, info, null), 3, null);
    }

    @Override // com.superwall.sdk.paywall.view.delegate.PaywallViewEventCallback
    @Nullable
    public Object eventDidOccur(@NotNull PaywallWebEvent paywallWebEvent, @NotNull PaywallView paywallView, @NotNull d<? super Unit> dVar) {
        ScopesKt.launchWithTracking(getMainScope$superwall_release(), new AnonymousClass2(paywallWebEvent, this, paywallView, null));
        return Unit.f312394a;
    }

    @NotNull
    /* JADX INFO: renamed from: getAssignments-d1pmJ48, reason: not valid java name */
    public final Object m11getAssignmentsd1pmJ48() {
        Either failure;
        try {
            Map<String, Experiment.Variant> confirmedAssignments = getDependencyContainer$superwall_release().getStorage().getConfirmedAssignments();
            ArrayList arrayList = new ArrayList(confirmedAssignments.size());
            for (Map.Entry<String, Experiment.Variant> entry : confirmedAssignments.entrySet()) {
                arrayList.add(new ConfirmedAssignment(entry.getKey(), entry.getValue()));
            }
            failure = new Either.Success(arrayList);
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Companion companion = Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                }
            }
            failure = new Either.Failure(th2);
        }
        if (failure instanceof Either.Success) {
            Result.a aVar = Result.Companion;
            return Result.m785constructorimpl(((Either.Success) failure).getValue());
        }
        if (!(failure instanceof Either.Failure)) {
            throw new kotlin.k0();
        }
        Result.a aVar2 = Result.Companion;
        return Result.m785constructorimpl(ResultKt.createFailure(((Either.Failure) failure).getError()));
    }

    @NotNull
    public final ConfigurationStatus getConfigurationState() {
        ConfigState value = getDependencyContainer$superwall_release().getConfigManager().getConfigState$superwall_release().getValue();
        if (value instanceof ConfigState.Retrieved) {
            return ConfigurationStatus.Configured.INSTANCE;
        }
        return value instanceof ConfigState.Failed ? ConfigurationStatus.Failed.INSTANCE : ConfigurationStatus.Pending.INSTANCE;
    }

    @NotNull
    public final i<ConfigurationStatus> getConfigurationStateListener() {
        final o0 o0VarM = k.m(getDependencyContainer$superwall_release().getConfigManager().getConfigState$superwall_release());
        return new i<ConfigurationStatus>() { // from class: com.superwall.sdk.Superwall$special$$inlined$map$1

            /* JADX INFO: renamed from: com.superwall.sdk.Superwall$special$$inlined$map$1$2, reason: invalid class name */
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Superwall.kt\ncom/superwall/sdk/Superwall\n*L\n1#1,49:1\n50#2:50\n383#3,5:51\n*E\n"})
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.j {
                final /* synthetic */ kotlinx.coroutines.flow.j $this_unsafeFlow;

                /* JADX INFO: renamed from: com.superwall.sdk.Superwall$special$$inlined$map$1$2$1, reason: invalid class name */
                @f(c = "com.superwall.sdk.Superwall$special$$inlined$map$1$2", f = "Superwall.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
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

                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlinx.coroutines.flow.j
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    ConfigurationStatus configurationStatus;
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
                        ConfigState configState = (ConfigState) obj;
                        if (configState instanceof ConfigState.Retrieved) {
                            configurationStatus = ConfigurationStatus.Configured.INSTANCE;
                        } else {
                            configurationStatus = configState instanceof ConfigState.Failed ? ConfigurationStatus.Failed.INSTANCE : ConfigurationStatus.Pending.INSTANCE;
                        }
                        anonymousClass1.label = 1;
                        if (jVar.emit(configurationStatus, anonymousClass1) == objL) {
                            return objL;
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
            public Object collect(kotlinx.coroutines.flow.j<? super ConfigurationStatus> jVar, d dVar) {
                Object objCollect = o0VarM.collect(new AnonymousClass2(jVar), dVar);
                return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
            }
        };
    }

    @NotNull
    public final Context getContext$superwall_release() {
        return this.context;
    }

    @Nullable
    public final SuperwallDelegate getDelegate() {
        return getDependencyContainer$superwall_release().getDelegateAdapter().getKotlinDelegate();
    }

    @NotNull
    public final DependencyContainer getDependencyContainer$superwall_release() {
        DependencyContainer dependencyContainer;
        synchronized (this) {
            dependencyContainer = this._dependencyContainer;
            if (dependencyContainer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_dependencyContainer");
                dependencyContainer = null;
            }
        }
        return dependencyContainer;
    }

    @NotNull
    public final Entitlements getEntitlements() {
        return (Entitlements) this.entitlements$delegate.getValue();
    }

    @NotNull
    public final String getExternalAccountId() {
        return getDependencyContainer$superwall_release().getIdentityManager().getExternalAccountId();
    }

    @NotNull
    public final IOScope getIoScope$superwall_release() {
        return getDependencyContainer$superwall_release().ioScope();
    }

    @Nullable
    public final PaywallInfo getLatestPaywallInfo() {
        PaywallView currentView = getDependencyContainer$superwall_release().getPaywallManager().getCurrentView();
        PaywallInfo info = currentView != null ? currentView.getInfo() : null;
        return info == null ? this.presentationItems.getPaywallInfo() : info;
    }

    @Nullable
    public final String getLocaleIdentifier() {
        return getDependencyContainer$superwall_release().getConfigManager().getOptions().getLocaleIdentifier();
    }

    @NotNull
    public final LogLevel getLogLevel() {
        return getOptions().getLogging().getLevel();
    }

    @NotNull
    public final MainScope getMainScope$superwall_release() {
        return getDependencyContainer$superwall_release().mainScope();
    }

    @NotNull
    public final SuperwallOptions getOptions() {
        return getDependencyContainer$superwall_release().getConfigManager().getOptions();
    }

    @NotNull
    public final Map<String, String> getOverrideProductsByName() {
        return getOptions().getPaywalls().getOverrideProductsByName();
    }

    @Nullable
    public final PaywallView getPaywallView() {
        return getDependencyContainer$superwall_release().getPaywallManager().getCurrentView();
    }

    @NotNull
    public final o0<SuperwallEventInfo> getPlacements() {
        return this.placements;
    }

    @NotNull
    public final PresentationItems getPresentationItems$superwall_release() {
        return this.presentationItems;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Nullable
    /* JADX INFO: renamed from: getProducts-gIAlu-s, reason: not valid java name */
    public final Object m12getProductsgIAlus(@NotNull String[] strArr, @NotNull d<? super Result<? extends Map<String, StoreProduct>>> dVar) {
        Superwall$getProducts$1 superwall$getProducts$1;
        Either failure;
        if (dVar instanceof Superwall$getProducts$1) {
            superwall$getProducts$1 = (Superwall$getProducts$1) dVar;
            int i10 = superwall$getProducts$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                superwall$getProducts$1.label = i10 - Integer.MIN_VALUE;
            } else {
                superwall$getProducts$1 = new Superwall$getProducts$1(this, dVar);
            }
        } else {
            superwall$getProducts$1 = new Superwall$getProducts$1(this, dVar);
        }
        Superwall$getProducts$1 superwall$getProducts$2 = superwall$getProducts$1;
        Object productsWithoutPaywall$default = superwall$getProducts$2.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = superwall$getProducts$2.label;
        try {
            if (i11 == 0) {
                ResultKt.m(productsWithoutPaywall$default);
                StoreManager storeManager = getDependencyContainer$superwall_release().getStoreManager();
                List list = ArraysKt.toList(strArr);
                superwall$getProducts$2.label = 1;
                productsWithoutPaywall$default = StoreKit.DefaultImpls.getProductsWithoutPaywall$default(storeManager, list, null, superwall$getProducts$2, 2, null);
                if (productsWithoutPaywall$default == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(productsWithoutPaywall$default);
            }
            failure = new Either.Success((Map) productsWithoutPaywall$default);
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Companion companion = Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                }
            }
            failure = new Either.Failure(th2);
        }
        if (failure instanceof Either.Success) {
            Result.a aVar = Result.Companion;
            return Result.m785constructorimpl(((Either.Success) failure).getValue());
        }
        if (!(failure instanceof Either.Failure)) {
            throw new kotlin.k0();
        }
        Result.a aVar2 = Result.Companion;
        return Result.m785constructorimpl(ResultKt.createFailure(((Either.Failure) failure).getError()));
    }

    @NotNull
    public final SerialTaskManager getSerialTaskManager$superwall_release() {
        return this.serialTaskManager;
    }

    @NotNull
    public final z0<SubscriptionStatus> getSubscriptionStatus() {
        return (z0) this.subscriptionStatus$delegate.getValue();
    }

    @NotNull
    public final Map<String, Object> getUserAttributes() {
        return getDependencyContainer$superwall_release().getIdentityManager().getUserAttributes();
    }

    @NotNull
    public final String getUserId() {
        return getDependencyContainer$superwall_release().getIdentityManager().getUserId();
    }

    @NotNull
    /* JADX INFO: renamed from: getVendorId-6xTLGo0$superwall_release, reason: not valid java name */
    public final String m13getVendorId6xTLGo0$superwall_release() {
        return VendorId.m35constructorimpl(getDependencyContainer$superwall_release().getDeviceHelper().getVendorId());
    }

    @NotNull
    /* JADX INFO: renamed from: handleDeepLink-IoAF18A, reason: not valid java name */
    public final Object m14handleDeepLinkIoAF18A(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            kotlinx.coroutines.k.f(getIoScope$superwall_release(), null, null, new Superwall$handleDeepLink$1$1(this, uri, null), 3, null);
            Object objMo81handleDeepLinkIoAF18A = getDependencyContainer$superwall_release().getReedemer().getDeepLinkReferrer().mo81handleDeepLinkIoAF18A(uri);
            if (Result.h(objMo81handleDeepLinkIoAF18A)) {
                int i10 = 2 | 0;
                kotlinx.coroutines.k.f(getIoScope$superwall_release(), null, null, new Superwall$handleDeepLink$1$handledAsRedemption$1$1(this, (String) objMo81handleDeepLinkIoAF18A, null), 3, null);
                Result.a aVar = Result.Companion;
                return Result.m785constructorimpl(Boolean.TRUE);
            }
            boolean zH = Result.h(objMo81handleDeepLinkIoAF18A);
            if (!zH) {
                zH = getDependencyContainer$superwall_release().getDebugManager().handle(uri);
            }
            Result.a aVar2 = Result.Companion;
            return Result.m785constructorimpl(Boolean.valueOf(zH));
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Companion companion = Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                }
            }
            Either.Failure failure = new Either.Failure(th2);
            Result.a aVar3 = Result.Companion;
            return Result.m785constructorimpl(ResultKt.createFailure(failure.getError()));
        }
    }

    public final void internallySetSubscriptionStatus$superwall_release(@NotNull SubscriptionStatus toStatus) {
        Intrinsics.checkNotNullParameter(toStatus, "toStatus");
        if (getDependencyContainer$superwall_release().makeHasExternalPurchaseController()) {
            return;
        }
        Set<Entitlement> web = getDependencyContainer$superwall_release().getEntitlements().getWeb();
        if (toStatus instanceof SubscriptionStatus.Active) {
            Set setPlus = SetsKt.plus((Set) ((SubscriptionStatus.Active) toStatus).getEntitlements(), (Iterable) web);
            if (setPlus.isEmpty()) {
                getEntitlements().setSubscriptionStatus(SubscriptionStatus.Inactive.INSTANCE);
                return;
            } else {
                getEntitlements().setSubscriptionStatus(new SubscriptionStatus.Active(setPlus));
                return;
            }
        }
        SubscriptionStatus.Inactive inactive = SubscriptionStatus.Inactive.INSTANCE;
        if (Intrinsics.areEqual(toStatus, inactive)) {
            if (web.isEmpty()) {
                getEntitlements().setSubscriptionStatus(inactive);
                return;
            } else {
                getEntitlements().setSubscriptionStatus(new SubscriptionStatus.Active(web));
                return;
            }
        }
        SubscriptionStatus.Unknown unknown = SubscriptionStatus.Unknown.INSTANCE;
        if (!Intrinsics.areEqual(toStatus, unknown)) {
            throw new kotlin.k0();
        }
        getEntitlements().setSubscriptionStatus(unknown);
    }

    public final boolean isLoggedIn() {
        return getDependencyContainer$superwall_release().getIdentityManager().isLoggedIn();
    }

    public final boolean isPaywallPresented() {
        return getPaywallView() != null;
    }

    public final void observe(@NotNull PurchasingObserverState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ScopesKt.launchWithTracking(getIoScope$superwall_release(), new C26141(state, null));
    }

    public final void observePurchaseError(@NotNull z product, @NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(error, "error");
        observe(new PurchasingObserverState.PurchaseError(product, error));
    }

    public final void observePurchaseResult(@NotNull com.android.billingclient.api.n billingResult, @NotNull List<? extends Purchase> purchases) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(purchases, "purchases");
        observe(new PurchasingObserverState.PurchaseResult(billingResult, purchases));
    }

    public final void observePurchaseStart(@NotNull z product) {
        Intrinsics.checkNotNullParameter(product, "product");
        observe(new PurchasingObserverState.PurchaseWillBegin(product));
    }

    public final void preloadAllPaywalls() {
        ScopesKt.launchWithTracking(getIoScope$superwall_release(), new C26151(null));
    }

    public final void preloadPaywalls(@NotNull Set<String> placementNames) {
        Intrinsics.checkNotNullParameter(placementNames, "placementNames");
        ScopesKt.launchWithTracking(getIoScope$superwall_release(), new C26161(placementNames, null));
    }

    public final void purchase(@NotNull StoreProduct product, @NotNull Function1<? super Result<? extends PurchaseResult>, Unit> onFinished) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        kotlinx.coroutines.k.f(getIoScope$superwall_release(), null, null, new AnonymousClass7(onFinished, this, product, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    /* JADX INFO: renamed from: purchase-gIAlu-s, reason: not valid java name */
    public final Object m15purchasegIAlus(@NotNull z zVar, @NotNull d<? super Result<? extends PurchaseResult>> dVar) {
        C26171 c26171;
        Either failure;
        if (dVar instanceof C26171) {
            c26171 = (C26171) dVar;
            int i10 = c26171.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c26171.label = i10 - Integer.MIN_VALUE;
            } else {
                c26171 = new C26171(dVar);
            }
        } else {
            c26171 = new C26171(dVar);
        }
        Object objPurchase = c26171.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c26171.label;
        try {
            if (i11 == 0) {
                ResultKt.m(objPurchase);
                TransactionManager transactionManager = getDependencyContainer$superwall_release().getTransactionManager();
                TransactionManager.PurchaseSource.ExternalPurchase externalPurchase = new TransactionManager.PurchaseSource.ExternalPurchase(new StoreProduct(RawStoreProduct.Companion.from(zVar)));
                c26171.label = 1;
                objPurchase = transactionManager.purchase(externalPurchase, c26171);
                if (objPurchase == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objPurchase);
            }
            failure = new Either.Success((PurchaseResult) objPurchase);
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Companion companion = Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                }
            }
            failure = new Either.Failure(th2);
        }
        if (failure instanceof Either.Success) {
            Result.a aVar = Result.Companion;
            return Result.m785constructorimpl(((Either.Success) failure).getValue());
        }
        if (!(failure instanceof Either.Failure)) {
            throw new kotlin.k0();
        }
        Result.a aVar2 = Result.Companion;
        return Result.m785constructorimpl(ResultKt.createFailure(((Either.Failure) failure).getError()));
    }

    public final void redeem$superwall_release(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        int i10 = 6 >> 0;
        kotlinx.coroutines.k.f(getIoScope$superwall_release(), null, null, new Superwall$redeem$1(this, code, null), 3, null);
    }

    public final void reset() {
        try {
            reset$superwall_release(false);
            new Either.Success(Unit.f312394a);
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Companion companion = Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                }
            }
            new Either.Failure(th2);
        }
    }

    public final void reset$superwall_release(boolean z10) {
        try {
            getDependencyContainer$superwall_release().getIdentityManager().reset(z10);
            getDependencyContainer$superwall_release().getStorage().reset();
            getDependencyContainer$superwall_release().getPaywallManager().resetCache();
            this.presentationItems.reset();
            getDependencyContainer$superwall_release().getConfigManager().reset();
            getDependencyContainer$superwall_release().getReedemer().clear(RedemptionOwnershipType.AppUser);
            int i10 = (1 ^ 0) << 0;
            new Either.Success(kotlinx.coroutines.k.f(getIoScope$superwall_release(), null, null, new Superwall$reset$2$1(this, null), 3, null));
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Companion companion = Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                }
            }
            new Either.Failure(th2);
        }
    }

    @NotNull
    public final p2 restorePurchases(@NotNull Function1<? super Result<? extends RestorationResult>, Unit> onFinished) {
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        return kotlinx.coroutines.k.f(getIoScope$superwall_release(), null, null, new C26203(onFinished, this, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    /* JADX INFO: renamed from: restorePurchases-IoAF18A, reason: not valid java name */
    public final Object m18restorePurchasesIoAF18A(@NotNull d<? super Result<? extends RestorationResult>> dVar) {
        C26191 c26191;
        Either failure;
        if (dVar instanceof C26191) {
            c26191 = (C26191) dVar;
            int i10 = c26191.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c26191.label = i10 - Integer.MIN_VALUE;
            } else {
                c26191 = new C26191(dVar);
            }
        } else {
            c26191 = new C26191(dVar);
        }
        Object objTryToRestorePurchases = c26191.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c26191.label;
        try {
            if (i11 == 0) {
                ResultKt.m(objTryToRestorePurchases);
                TransactionManager transactionManager = getDependencyContainer$superwall_release().getTransactionManager();
                c26191.label = 1;
                objTryToRestorePurchases = transactionManager.tryToRestorePurchases(null, c26191);
                if (objTryToRestorePurchases == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objTryToRestorePurchases);
            }
            failure = new Either.Success((RestorationResult) objTryToRestorePurchases);
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Companion companion = Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                }
            }
            failure = new Either.Failure(th2);
        }
        if (failure instanceof Either.Success) {
            Result.a aVar = Result.Companion;
            return Result.m785constructorimpl(((Either.Success) failure).getValue());
        }
        if (!(failure instanceof Either.Failure)) {
            throw new kotlin.k0();
        }
        Result.a aVar2 = Result.Companion;
        return Result.m785constructorimpl(ResultKt.createFailure(((Either.Failure) failure).getError()));
    }

    public final void setContext$superwall_release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setDelegate(@Nullable SuperwallDelegate superwallDelegate) {
        getDependencyContainer$superwall_release().getDelegateAdapter().setKotlinDelegate(superwallDelegate);
        kotlinx.coroutines.k.f(getIoScope$superwall_release(), null, null, new Superwall$delegate$1(this, null), 3, null);
    }

    public final void setInterfaceStyle(@Nullable InterfaceStyle interfaceStyle) {
        try {
            getDependencyContainer$superwall_release().getDeviceHelper().setInterfaceStyleOverride(interfaceStyle);
            new Either.Success(kotlinx.coroutines.k.f(getIoScope$superwall_release(), null, null, new Superwall$setInterfaceStyle$1$1(this, null), 3, null));
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Companion companion = Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                }
            }
            new Either.Failure(th2);
        }
    }

    public final void setLocaleIdentifier(@Nullable String str) {
        getDependencyContainer$superwall_release().getConfigManager().getOptions().setLocaleIdentifier(str);
        int i10 = 3 >> 0;
        kotlinx.coroutines.k.f(getIoScope$superwall_release(), null, null, new Superwall$localeIdentifier$1(this, null), 3, null);
    }

    public final void setLogLevel(@NotNull LogLevel newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        getOptions().getLogging().setLevel(newValue);
        kotlinx.coroutines.k.f(getIoScope$superwall_release(), null, null, new Superwall$logLevel$1(this, null), 3, null);
    }

    public final void setOverrideProductsByName(@NotNull Map<String, String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getOptions().getPaywalls().setOverrideProductsByName(value);
    }

    public final void setPlatformWrapper(@NotNull String wrapper, @NotNull String version) {
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        Intrinsics.checkNotNullParameter(version, "version");
        try {
            getDependencyContainer$superwall_release().getDeviceHelper().setPlatformWrapper(wrapper);
            getDependencyContainer$superwall_release().getDeviceHelper().setPlatformWrapperVersion(version);
            int i10 = 6 & 0;
            new Either.Success(kotlinx.coroutines.k.f(getIoScope$superwall_release(), null, null, new Superwall$setPlatformWrapper$1$1(this, null), 3, null));
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Companion companion = Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                }
            }
            new Either.Failure(th2);
        }
    }

    public final void setSubscriptionStatus(@NotNull SubscriptionStatus subscriptionStatus) {
        Intrinsics.checkNotNullParameter(subscriptionStatus, "subscriptionStatus");
        getEntitlements().setSubscriptionStatus(subscriptionStatus);
    }

    @NotNull
    public final Either<Unit, Throwable> setup$superwall_release() {
        Either<Unit, Throwable> failure;
        synchronized (this) {
            try {
                try {
                    this._dependencyContainer = new DependencyContainer(this.context, this.purchaseController, this._options, this.activityProvider);
                    SubscriptionStatus subscriptionStatus = (SubscriptionStatus) getDependencyContainer$superwall_release().getStorage().read(StoredSubscriptionStatus.INSTANCE);
                    if (subscriptionStatus == null) {
                        subscriptionStatus = SubscriptionStatus.Unknown.INSTANCE;
                    }
                    setSubscriptionStatus(subscriptionStatus);
                    addListeners();
                    kotlinx.coroutines.k.f(getIoScope$superwall_release(), null, null, new Superwall$setup$1$1$1(this, null), 3, null);
                    failure = new Either.Success<>(Unit.f312394a);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    throw e10;
                }
            } catch (Throwable th2) {
                try {
                    if (ErrorTrackingKt.shouldLog(th2)) {
                        Companion companion = Companion;
                        if (companion.getInitialized()) {
                            ErrorTrackingKt.trackError(companion.getInstance(), th2);
                        }
                    }
                    failure = new Either.Failure<>(th2);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return failure;
    }

    public final void togglePaywallSpinner(boolean z10) {
        ScopesKt.launchWithTracking(getIoScope$superwall_release(), new C26211(z10, null));
    }

    @j
    @n
    public static final void configure(@NotNull Application application, @NotNull String str, @Nullable PurchaseController purchaseController) {
        Companion.configure(application, str, purchaseController);
    }

    @oj.i(name = "getDelegate")
    @Nullable
    /* JADX INFO: renamed from: getDelegate, reason: collision with other method in class */
    public final SuperwallDelegateJava m19getDelegate() {
        return getDependencyContainer$superwall_release().getDelegateAdapter().getJavaDelegate();
    }

    public final void purchase(@NotNull z product, @NotNull Function1<? super Result<? extends PurchaseResult>, Unit> onFinished) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        kotlinx.coroutines.k.f(getIoScope$superwall_release(), null, null, new AnonymousClass8(onFinished, this, product, null), 3, null);
    }

    public final void setSubscriptionStatus(@NotNull String... entitlements) {
        Intrinsics.checkNotNullParameter(entitlements, "entitlements");
        if (entitlements.length == 0) {
            getEntitlements().setSubscriptionStatus(SubscriptionStatus.Inactive.INSTANCE);
            return;
        }
        Entitlements entitlements2 = getEntitlements();
        ArrayList arrayList = new ArrayList(entitlements.length);
        for (String str : entitlements) {
            arrayList.add(new Entitlement(str));
        }
        entitlements2.setSubscriptionStatus(new SubscriptionStatus.Active(CollectionsKt.toSet(arrayList)));
    }

    @j
    @n
    public static final void configure(@NotNull Application application, @NotNull String str, @Nullable PurchaseController purchaseController, @Nullable SuperwallOptions superwallOptions) {
        Companion.configure(application, str, purchaseController, superwallOptions);
    }

    public final void purchase(@NotNull String productId, @NotNull Function1<? super Result<? extends PurchaseResult>, Unit> onFinished) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(onFinished, "onFinished");
        int i10 = 7 << 0;
        kotlinx.coroutines.k.f(getIoScope$superwall_release(), null, null, new AnonymousClass9(onFinished, this, productId, null), 3, null);
    }

    @oj.i(name = "setDelegate")
    public final void setDelegate(@Nullable SuperwallDelegateJava superwallDelegateJava) {
        try {
            getDependencyContainer$superwall_release().getDelegateAdapter().setJavaDelegate(superwallDelegateJava);
            new Either.Success(kotlinx.coroutines.k.f(getIoScope$superwall_release(), null, null, new Superwall$setJavaDelegate$1$1(this, null), 3, null));
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Companion companion = Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                }
            }
            new Either.Failure(th2);
        }
    }

    @j
    @n
    public static final void configure(@NotNull Application application, @NotNull String str, @Nullable PurchaseController purchaseController, @Nullable SuperwallOptions superwallOptions, @Nullable ActivityProvider activityProvider) {
        Companion.configure(application, str, purchaseController, superwallOptions, activityProvider);
    }

    @j
    @n
    public static final void configure(@NotNull Application application, @NotNull String str, @Nullable PurchaseController purchaseController, @Nullable SuperwallOptions superwallOptions, @Nullable ActivityProvider activityProvider, @Nullable Function1<? super Result<Unit>, Unit> function1) {
        Companion.configure(application, str, purchaseController, superwallOptions, activityProvider, function1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    /* JADX INFO: renamed from: purchase-gIAlu-s, reason: not valid java name */
    public final Object m16purchasegIAlus(@NotNull StoreProduct storeProduct, @NotNull d<? super Result<? extends PurchaseResult>> dVar) {
        C26183 c26183;
        Either failure;
        if (dVar instanceof C26183) {
            c26183 = (C26183) dVar;
            int i10 = c26183.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c26183.label = i10 - Integer.MIN_VALUE;
            } else {
                c26183 = new C26183(dVar);
            }
        } else {
            c26183 = new C26183(dVar);
        }
        Object objPurchase = c26183.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c26183.label;
        int i12 = 5 & 1;
        try {
            if (i11 == 0) {
                ResultKt.m(objPurchase);
                TransactionManager transactionManager = getDependencyContainer$superwall_release().getTransactionManager();
                TransactionManager.PurchaseSource.ExternalPurchase externalPurchase = new TransactionManager.PurchaseSource.ExternalPurchase(storeProduct);
                c26183.label = 1;
                objPurchase = transactionManager.purchase(externalPurchase, c26183);
                if (objPurchase == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(objPurchase);
            }
            failure = new Either.Success((PurchaseResult) objPurchase);
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Companion companion = Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                }
            }
            failure = new Either.Failure(th2);
        }
        if (failure instanceof Either.Success) {
            Result.a aVar = Result.Companion;
            return Result.m785constructorimpl(((Either.Success) failure).getValue());
        }
        if (!(failure instanceof Either.Failure)) {
            throw new kotlin.k0();
        }
        Result.a aVar2 = Result.Companion;
        return Result.m785constructorimpl(ResultKt.createFailure(((Either.Failure) failure).getError()));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0098 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:13:0x0030, B:31:0x0094, B:33:0x0098, B:35:0x00a0, B:36:0x00c3, B:18:0x0048, B:24:0x0068, B:26:0x0076, B:21:0x0056), top: B:54:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:52:0x0110  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    /* JADX INFO: renamed from: purchase-gIAlu-s, reason: not valid java name */
    public final Object m17purchasegIAlus(@NotNull String str, @NotNull d<? super Result<? extends PurchaseResult>> dVar) {
        AnonymousClass5 anonymousClass5;
        Either failure;
        Object objM785constructorimpl;
        Object objM12getProductsgIAlus;
        String str2;
        PurchaseResult purchaseResult;
        if (dVar instanceof AnonymousClass5) {
            anonymousClass5 = (AnonymousClass5) dVar;
            int i10 = anonymousClass5.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass5.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass5 = new AnonymousClass5(dVar);
            }
        } else {
            anonymousClass5 = new AnonymousClass5(dVar);
        }
        Object objPurchase = anonymousClass5.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = anonymousClass5.label;
        try {
            if (i11 == 0) {
                ResultKt.m(objPurchase);
                anonymousClass5.L$0 = this;
                anonymousClass5.L$1 = str;
                anonymousClass5.label = 1;
                objM12getProductsgIAlus = m12getProductsgIAlus(new String[]{str}, anonymousClass5);
                if (objM12getProductsgIAlus == objL) {
                }
                return objL;
            }
            if (i11 == 1) {
                str = (String) anonymousClass5.L$1;
                this = (Superwall) anonymousClass5.L$0;
                ResultKt.m(objPurchase);
                objM12getProductsgIAlus = ((Result) objPurchase).j();
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) anonymousClass5.L$0;
                ResultKt.m(objPurchase);
            }
            purchaseResult = (PurchaseResult) objPurchase;
            if (purchaseResult == null) {
                str = str2;
                throw new IllegalArgumentException("Product with id " + str + " not found");
            }
            failure = new Either.Success(purchaseResult);
            if (failure instanceof Either.Success) {
                Result.a aVar = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(((Either.Success) failure).getValue());
            } else {
                if (failure instanceof Either.Failure) {
                    throw new kotlin.k0();
                }
                Result.a aVar2 = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(((Either.Failure) failure).getError()));
            }
            return objM785constructorimpl;
            ResultKt.m(objM12getProductsgIAlus);
            StoreProduct storeProduct = (StoreProduct) ((Map) objM12getProductsgIAlus).get(str);
            if (storeProduct != null) {
                TransactionManager transactionManager = this.getDependencyContainer$superwall_release().getTransactionManager();
                TransactionManager.PurchaseSource.ExternalPurchase externalPurchase = new TransactionManager.PurchaseSource.ExternalPurchase(storeProduct);
                anonymousClass5.L$0 = str;
                anonymousClass5.L$1 = null;
                anonymousClass5.label = 2;
                objPurchase = transactionManager.purchase(externalPurchase, anonymousClass5);
                if (objPurchase != objL) {
                    str2 = str;
                    purchaseResult = (PurchaseResult) objPurchase;
                    if (purchaseResult == null) {
                        failure = new Either.Success(purchaseResult);
                        if (failure instanceof Either.Success) {
                            Result.a aVar3 = Result.Companion;
                            objM785constructorimpl = Result.m785constructorimpl(((Either.Success) failure).getValue());
                        } else {
                            if (failure instanceof Either.Failure) {
                                throw new kotlin.k0();
                            }
                            Result.a aVar4 = Result.Companion;
                            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(((Either.Failure) failure).getError()));
                        }
                        return objM785constructorimpl;
                    }
                    str = str2;
                }
                return objL;
            }
            throw new IllegalArgumentException("Product with id " + str + " not found");
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Companion companion = Companion;
                if (companion.getInitialized()) {
                    ErrorTrackingKt.trackError(companion.getInstance(), th2);
                }
            }
            failure = new Either.Failure(th2);
        }
    }
}
