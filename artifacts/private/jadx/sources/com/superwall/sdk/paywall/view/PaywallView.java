package com.superwall.sdk.paywall.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.motion.utils.v;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.internal.TrackingKt;
import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import com.superwall.sdk.analytics.superwall.SuperwallEvents;
import com.superwall.sdk.config.models.OnDeviceCaching;
import com.superwall.sdk.config.models.Survey;
import com.superwall.sdk.config.options.PaywallOptions;
import com.superwall.sdk.dependencies.OptionsFactory;
import com.superwall.sdk.dependencies.TriggerFactory;
import com.superwall.sdk.game.GameControllerDelegate;
import com.superwall.sdk.game.GameControllerEvent;
import com.superwall.sdk.game.GameControllerManager;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.misc.AlertControllerFactory;
import com.superwall.sdk.misc.Either;
import com.superwall.sdk.misc.IOScope;
import com.superwall.sdk.misc.MainScope;
import com.superwall.sdk.models.paywall.Paywall;
import com.superwall.sdk.models.paywall.PaywallPresentationStyle;
import com.superwall.sdk.models.triggers.TriggerRuleOccurrence;
import com.superwall.sdk.network.device.DeviceHelper;
import com.superwall.sdk.paywall.manager.PaywallCacheLogic;
import com.superwall.sdk.paywall.manager.PaywallViewCache;
import com.superwall.sdk.paywall.presentation.PaywallCloseReason;
import com.superwall.sdk.paywall.presentation.PaywallInfo;
import com.superwall.sdk.paywall.presentation.get_presentation_result.PublicGetPresentationResultKt;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequest;
import com.superwall.sdk.paywall.presentation.internal.operators.StorePresentationObjectsKt;
import com.superwall.sdk.paywall.presentation.internal.request.PresentationInfo;
import com.superwall.sdk.paywall.presentation.internal.state.PaywallResult;
import com.superwall.sdk.paywall.presentation.internal.state.PaywallState;
import com.superwall.sdk.paywall.presentation.result.PresentationResult;
import com.superwall.sdk.paywall.view.delegate.PaywallLoadingState;
import com.superwall.sdk.paywall.view.delegate.PaywallViewDelegateAdapter;
import com.superwall.sdk.paywall.view.delegate.PaywallViewEventCallback;
import com.superwall.sdk.paywall.view.survey.SurveyManager;
import com.superwall.sdk.paywall.view.survey.SurveyPresentationResult;
import com.superwall.sdk.paywall.view.webview.PaywallMessage;
import com.superwall.sdk.paywall.view.webview.SWWebView;
import com.superwall.sdk.paywall.view.webview.SWWebViewDelegate;
import com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandlerDelegate;
import com.superwall.sdk.paywall.view.webview.messaging.PaywallWebEvent;
import com.superwall.sdk.storage.LocalStorage;
import com.superwall.sdk.storage.core_data.CoreDataManager;
import com.superwall.sdk.utilities.ErrorTrackingKt;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.Date;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonNamingStrategy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPaywallView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaywallView.kt\ncom/superwall/sdk/paywall/view/PaywallView\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 4 ErrorTracking.kt\ncom/superwall/sdk/utilities/ErrorTrackingKt\n+ 5 Either.kt\ncom/superwall/sdk/misc/EitherKt\n*L\n1#1,868:1\n29#2:869\n29#2:870\n29#2:871\n113#3:872\n136#4,10:873\n122#5,4:883\n*S KotlinDebug\n*F\n+ 1 PaywallView.kt\ncom/superwall/sdk/paywall/view/PaywallView\n*L\n780#1:869\n800#1:870\n819#1:871\n830#1:872\n401#1:873,10\n406#1:883,4\n*E\n"})
public final class PaywallView extends FrameLayout implements PaywallMessageHandlerDelegate, SWWebViewDelegate, ActivityEncapsulatable, GameControllerDelegate {

    @NotNull
    private SWWebView _webView;

    @Nullable
    private final PaywallViewCache cache;

    @NotNull
    private final String cacheKey;

    @Nullable
    private PaywallViewDelegateAdapter callback;
    private boolean callbackInvoked;

    @NotNull
    private final DeviceHelper deviceHelper;
    private boolean didDisableSwipeForSurvey;

    @Nullable
    private Function0<Unit> dismissCompletionBlock;

    @Nullable
    private WeakReference<Activity> encapsulatingActivity;

    @Nullable
    private final PaywallViewEventCallback eventCallback;

    @NotNull
    private final Factory factory;

    @Nullable
    private Integer initialOrientation;
    private boolean interceptTouchEvents;
    private boolean isBrowserViewPresented;
    private boolean isPresented;

    @NotNull
    private PaywallLoadingState loadingState;

    @Nullable
    private PaywallPurchaseLoadingView loadingView;

    @NotNull
    private Paywall paywall;

    @Nullable
    private PaywallResult paywallResult;

    @Nullable
    private j0<PaywallState> paywallStatePublisher;
    private boolean presentationDidFinishPrepare;

    @NotNull
    private PaywallPresentationStyle presentationStyle;
    private boolean presentationWillPrepare;

    @Nullable
    private PresentationRequest request;

    @Nullable
    private PaywallShimmerView shimmerView;

    @NotNull
    private final LocalStorage storage;

    @NotNull
    private SurveyPresentationResult surveyPresentationResult;

    @Nullable
    private TriggerRuleOccurrence unsavedOccurrence;
    private final boolean useMultipleUrls;

    @Nullable
    private Function1<? super Boolean, Unit> viewCreatedCompletion;

    @NotNull
    private final SWWebView webView;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final MainScope mainScope = new MainScope(null, 1, null);

    @NotNull
    private static final IOScope ioScope = new IOScope(null, 1, null);

    @NotNull
    private static final f0<Json> gameControllerJson$delegate = g0.c(new Function0() { // from class: com.superwall.sdk.paywall.view.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PaywallView.gameControllerJson_delegate$lambda$16();
        }
    });

    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Json getGameControllerJson() {
            return (Json) PaywallView.gameControllerJson$delegate.getValue();
        }

        private Companion() {
        }
    }

    public interface Factory extends TriggerFactory, OptionsFactory {
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.PaywallView$destroyed$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.paywall.view.PaywallView", f = "PaywallView.kt", i = {0, 0, 1}, l = {355, 358}, m = "destroyed", n = {"this", "result", "this"}, s = {"L$0", "L$1", "L$0"})
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
            return PaywallView.this.destroyed(this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.PaywallView$destroyed$2, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.paywall.view.PaywallView$destroyed$2", f = "PaywallView.kt", i = {}, l = {340}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass2(kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return PaywallView.this.new AnonymousClass2(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                PaywallView paywallView = PaywallView.this;
                this.label = 1;
                if (paywallView.trackClose(this) == objL) {
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

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.PaywallView$eventDidOccur$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.paywall.view.PaywallView$eventDidOccur$1", f = "PaywallView.kt", i = {}, l = {526}, m = "invokeSuspend", n = {}, s = {})
    static final class C27031 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ PaywallWebEvent $paywallWebEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27031(PaywallWebEvent paywallWebEvent, kotlin.coroutines.d<? super C27031> dVar) {
            super(2, dVar);
            this.$paywallWebEvent = paywallWebEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return PaywallView.this.new C27031(this.$paywallWebEvent, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                PaywallViewEventCallback eventCallback = PaywallView.this.getEventCallback();
                if (eventCallback != null) {
                    PaywallWebEvent paywallWebEvent = this.$paywallWebEvent;
                    PaywallView paywallView = PaywallView.this;
                    this.label = 1;
                    if (eventCallback.eventDidOccur(paywallWebEvent, paywallView, this) == objL) {
                        return objL;
                    }
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
            return ((C27031) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.PaywallView$hideShimmerView$2, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.paywall.view.PaywallView$hideShimmerView$2", f = "PaywallView.kt", i = {}, l = {v.e.A}, m = "invokeSuspend", n = {}, s = {})
    static final class C27042 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Date $now;
        final /* synthetic */ Date $visible;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27042(Date date, Date date2, kotlin.coroutines.d<? super C27042> dVar) {
            super(2, dVar);
            this.$visible = date;
            this.$now = date2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return PaywallView.this.new C27042(this.$visible, this.$now, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            double dH0;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                InternalSuperwallEvent.ShimmerLoad.State state = InternalSuperwallEvent.ShimmerLoad.State.Complete;
                String identifier = PaywallView.this.getPaywall().getIdentifier();
                if (this.$visible != null) {
                    kotlin.time.c.a aVar = kotlin.time.c.f313406b;
                    long time = this.$now.getTime() - this.$visible.getTime();
                    kotlin.time.f fVar = kotlin.time.f.MILLISECONDS;
                    dH0 = kotlin.time.c.H0(kotlin.time.e.n0(time, fVar), fVar);
                } else {
                    dH0 = 0.0d;
                }
                InternalSuperwallEvent.ShimmerLoad shimmerLoad = new InternalSuperwallEvent.ShimmerLoad(state, identifier, kotlin.coroutines.jvm.internal.b.d(dH0), PaywallView.this.getPaywall().getPresentation().getDelay(), PaywallView.this.getFactory().makeSuperwallOptions().getPaywalls().getShouldPreload());
                Superwall companion = Superwall.Companion.getInstance();
                this.label = 1;
                if (TrackingKt.track(companion, shimmerLoad, this) == objL) {
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
            return ((C27042) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.PaywallView$loadWebView$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.paywall.view.PaywallView$loadWebView$1", f = "PaywallView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C27051 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.PaywallView$loadWebView$1$1, reason: invalid class name and collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.paywall.view.PaywallView$loadWebView$1$1", f = "PaywallView.kt", i = {}, l = {723}, m = "invokeSuspend", n = {}, s = {})
        static final class C18811 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
            int label;
            final /* synthetic */ PaywallView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18811(PaywallView paywallView, kotlin.coroutines.d<? super C18811> dVar) {
                super(2, dVar);
                this.this$0 = paywallView;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C18811(this.this$0, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.label;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    InternalSuperwallEvent.PaywallWebviewLoad paywallWebviewLoad = new InternalSuperwallEvent.PaywallWebviewLoad(new InternalSuperwallEvent.PaywallWebviewLoad.State.Start(), this.this$0.getInfo());
                    Superwall companion = Superwall.Companion.getInstance();
                    this.label = 1;
                    if (TrackingKt.track(companion, paywallWebviewLoad, this) == objL) {
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
                return ((C18811) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.PaywallView$loadWebView$1$3, reason: invalid class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.paywall.view.PaywallView$loadWebView$1$3", f = "PaywallView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
            final /* synthetic */ String $url;
            int label;
            final /* synthetic */ PaywallView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(PaywallView paywallView, String str, kotlin.coroutines.d<? super AnonymousClass3> dVar) {
                super(2, dVar);
                this.this$0 = paywallView;
                this.$url = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new AnonymousClass3(this.this$0, this.$url, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                if (this.this$0.getPaywall().getOnDeviceCache() instanceof OnDeviceCaching.Enabled) {
                    this.this$0.getWebView().getSettings().setCacheMode(1);
                } else {
                    this.this$0.getWebView().getSettings().setCacheMode(-1);
                }
                if (this.this$0.useMultipleUrls) {
                    this.this$0.getWebView().loadPaywallWithFallbackUrl$superwall_release(this.this$0.getPaywall());
                } else {
                    this.this$0.getWebView().loadUrl(this.$url);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((AnonymousClass3) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        C27051(kotlin.coroutines.d<? super C27051> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(PaywallView paywallView, RenderProcessGoneDetail renderProcessGoneDetail) {
            boolean z10 = false | false;
            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.paywallView, "Webview Process has crashed for paywall with identifier: " + paywallView.getPaywall().getIdentifier() + ".\nCrashed by the system: " + Boolean.valueOf(renderProcessGoneDetail.didCrash()) + " - priority " + Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()), null, null, 24, null);
            paywallView.recreateWebview();
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C27051 c27051 = PaywallView.this.new C27051(dVar);
            c27051.L$0 = obj;
            return c27051;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            s0 s0Var = (s0) this.L$0;
            String strM45getUrl24UBhI0 = PaywallView.this.getPaywall().m45getUrl24UBhI0();
            if (PaywallView.this.getPaywall().getWebviewLoadingInfo().getStartAt() == null) {
                PaywallView.this.getPaywall().getWebviewLoadingInfo().setStartAt(new Date());
            }
            int i10 = 3 | 0;
            kotlinx.coroutines.k.f(s0Var, null, null, new C18811(PaywallView.this, null), 3, null);
            SWWebView webView = PaywallView.this.getWebView();
            final PaywallView paywallView = PaywallView.this;
            webView.setOnRenderProcessCrashed(new Function1() { // from class: com.superwall.sdk.paywall.view.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return PaywallView.C27051.invokeSuspend$lambda$0(paywallView, (RenderProcessGoneDetail) obj2);
                }
            });
            SWWebView webView2 = PaywallView.this.getWebView();
            Boolean boolIsScrollEnabled = PaywallView.this.getPaywall().isScrollEnabled();
            webView2.setScrollEnabled(boolIsScrollEnabled != null ? boolIsScrollEnabled.booleanValue() : true);
            kotlinx.coroutines.k.f(PaywallView.mainScope, null, null, new AnonymousClass3(PaywallView.this, strM45getUrl24UBhI0, null), 3, null);
            PaywallView.this.setLoadingState(new PaywallLoadingState.LoadingURL());
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C27051) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.PaywallView$onViewCreated$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.paywall.view.PaywallView$onViewCreated$1", f = "PaywallView.kt", i = {}, l = {485}, m = "invokeSuspend", n = {}, s = {})
    static final class C27061 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        C27061(kotlin.coroutines.d<? super C27061> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return PaywallView.this.new C27061(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                j0<PaywallState> paywallStatePublisher = PaywallView.this.getPaywallStatePublisher();
                if (paywallStatePublisher != null) {
                    PaywallView paywallView = PaywallView.this;
                    Superwall companion = Superwall.Companion.getInstance();
                    PresentationRequest request = paywallView.getRequest();
                    this.label = 1;
                    if (StorePresentationObjectsKt.storePresentationObjects(companion, request, paywallStatePublisher, this) == objL) {
                        return objL;
                    }
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
            return ((C27061) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.PaywallView$onViewCreated$3, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.paywall.view.PaywallView$onViewCreated$3", f = "PaywallView.kt", i = {}, l = {497}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass3(kotlin.coroutines.d<? super AnonymousClass3> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return PaywallView.this.new AnonymousClass3(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                PaywallView paywallView = PaywallView.this;
                this.label = 1;
                if (paywallView.trackOpen(this) == objL) {
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

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.PaywallView$showAlert$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.paywall.view.PaywallView$showAlert$1", f = "PaywallView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C27071 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $action;
        final /* synthetic */ String $actionTitle;
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $closeActionTitle;
        final /* synthetic */ String $message;
        final /* synthetic */ Function0<Unit> $onClose;
        final /* synthetic */ String $title;
        int label;
        final /* synthetic */ PaywallView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27071(Activity activity, String str, String str2, String str3, String str4, PaywallView paywallView, Function0<Unit> function0, Function0<Unit> function1, kotlin.coroutines.d<? super C27071> dVar) {
            super(2, dVar);
            this.$activity = activity;
            this.$title = str;
            this.$message = str2;
            this.$actionTitle = str3;
            this.$closeActionTitle = str4;
            this.this$0 = paywallView;
            this.$action = function0;
            this.$onClose = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(Function0 function0) {
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(Function0 function0) {
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C27071(this.$activity, this.$title, this.$message, this.$actionTitle, this.$closeActionTitle, this.this$0, this.$action, this.$onClose, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            AlertControllerFactory alertControllerFactory = AlertControllerFactory.INSTANCE;
            Activity activity = this.$activity;
            String str = this.$title;
            String str2 = this.$message;
            String str3 = this.$actionTitle;
            String str4 = this.$closeActionTitle;
            final Function0<Unit> function0 = this.$action;
            Function0<Unit> function1 = new Function0() { // from class: com.superwall.sdk.paywall.view.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PaywallView.C27071.invokeSuspend$lambda$0(function0);
                }
            };
            final Function0<Unit> function2 = this.$onClose;
            alertControllerFactory.make(activity, str, str2, str3, str4, function1, new Function0() { // from class: com.superwall.sdk.paywall.view.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PaywallView.C27071.invokeSuspend$lambda$1(function2);
                }
            }).show();
            this.this$0.setLoadingState(new PaywallLoadingState.Ready());
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C27071) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.PaywallView$trackClose$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.paywall.view.PaywallView", f = "PaywallView.kt", i = {}, l = {521}, m = "trackClose", n = {}, s = {})
    static final class C27081 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C27081(kotlin.coroutines.d<? super C27081> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaywallView.this.trackClose(this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.PaywallView$trackOpen$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.paywall.view.PaywallView", f = "PaywallView.kt", i = {}, l = {512}, m = "trackOpen", n = {}, s = {})
    static final class C27091 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C27091(kotlin.coroutines.d<? super C27091> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaywallView.this.trackOpen(this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.PaywallView$trackShimmerStart$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.paywall.view.PaywallView$trackShimmerStart$1", f = "PaywallView.kt", i = {}, l = {574}, m = "invokeSuspend", n = {}, s = {})
    static final class C27101 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ InternalSuperwallEvent.ShimmerLoad $trackedEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27101(InternalSuperwallEvent.ShimmerLoad shimmerLoad, kotlin.coroutines.d<? super C27101> dVar) {
            super(2, dVar);
            this.$trackedEvent = shimmerLoad;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C27101(this.$trackedEvent, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                Superwall companion = Superwall.Companion.getInstance();
                InternalSuperwallEvent.ShimmerLoad shimmerLoad = this.$trackedEvent;
                this.label = 1;
                if (TrackingKt.track(companion, shimmerLoad, this) == objL) {
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
            return ((C27101) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ PaywallView(Context context, Paywall paywall, PaywallViewEventCallback paywallViewEventCallback, PaywallViewDelegateAdapter paywallViewDelegateAdapter, DeviceHelper deviceHelper, Factory factory, LocalStorage localStorage, SWWebView sWWebView, PaywallViewCache paywallViewCache, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, paywall, (i10 & 4) != 0 ? null : paywallViewEventCallback, (i10 & 8) != 0 ? null : paywallViewDelegateAdapter, deviceHelper, factory, localStorage, sWWebView, paywallViewCache, z10);
    }

    private final void dismiss(boolean z10) {
        Activity activity;
        WeakReference<Activity> encapsulatingActivity = getEncapsulatingActivity();
        if (encapsulatingActivity == null || (activity = encapsulatingActivity.get()) == null) {
            return;
        }
        activity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:49:0x012b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0148  */
    /* JADX WARN: Code duplicated, block: B:64:0x015a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0160  */
    /* JADX WARN: Code duplicated, block: B:68:0x0162 A[PHI: r11
      0x0162: PHI (r11v5 com.superwall.sdk.paywall.view.PaywallView) = (r11v3 com.superwall.sdk.paywall.view.PaywallView), (r11v7 com.superwall.sdk.paywall.view.PaywallView) binds: [B:60:0x0146, B:67:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.superwall.sdk.analytics.internal.trackable.Trackable] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    public static final Object dismiss$dismissView(boolean z10, boolean z11, PaywallView paywallView, PaywallResult paywallResult, kotlin.coroutines.d<? super Unit> dVar) {
        PaywallView$dismiss$dismissView$1 paywallView$dismiss$dismissView$1;
        Either failure;
        ?? r10;
        Object objM785constructorimpl;
        boolean z12;
        PaywallViewDelegateAdapter paywallViewDelegateAdapter;
        PaywallView paywallView2;
        PresentationResult presentationResult;
        if (dVar instanceof PaywallView$dismiss$dismissView$1) {
            paywallView$dismiss$dismissView$1 = (PaywallView$dismiss$dismissView$1) dVar;
            int i10 = paywallView$dismiss$dismissView$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                paywallView$dismiss$dismissView$1.label = i10 - Integer.MIN_VALUE;
            } else {
                paywallView$dismiss$dismissView$1 = new PaywallView$dismiss$dismissView$1(dVar);
            }
        } else {
            paywallView$dismiss$dismissView$1 = new PaywallView$dismiss$dismissView$1(dVar);
        }
        Object objOnFinished = paywallView$dismiss$dismissView$1.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = paywallView$dismiss$dismissView$1.label;
        try {
            if (i11 == 0) {
                ResultKt.m(objOnFinished);
                if (z10 == 0 || !z11) {
                    paywallViewDelegateAdapter = paywallView.callback;
                    if (paywallViewDelegateAdapter != null) {
                        paywallView.callbackInvoked = true;
                        paywallView$dismiss$dismissView$1.L$0 = paywallView;
                        paywallView$dismiss$dismissView$1.L$1 = null;
                        paywallView$dismiss$dismissView$1.L$2 = null;
                        paywallView$dismiss$dismissView$1.label = 3;
                        objOnFinished = paywallViewDelegateAdapter.onFinished(paywallView, paywallResult, true, paywallView$dismiss$dismissView$1);
                        if (objOnFinished != objL) {
                            paywallView2 = paywallView;
                            if (((Unit) objOnFinished) == null) {
                                paywallView = paywallView2;
                                paywallView.dismiss(false);
                            }
                        }
                    } else {
                        paywallView.dismiss(false);
                    }
                    return Unit.f312394a;
                }
                InternalSuperwallEvent.PaywallDecline paywallDecline = new InternalSuperwallEvent.PaywallDecline(paywallView.getInfo());
                Superwall companion = Superwall.Companion.getInstance();
                paywallView$dismiss$dismissView$1.L$0 = paywallView;
                paywallView$dismiss$dismissView$1.L$1 = paywallResult;
                paywallView$dismiss$dismissView$1.L$2 = paywallDecline;
                paywallView$dismiss$dismissView$1.label = 1;
                objOnFinished = PublicGetPresentationResultKt.internallyGetPresentationResult(companion, paywallDecline, true, paywallView$dismiss$dismissView$1);
                z10 = paywallDecline;
                if (objOnFinished == objL) {
                }
                return objL;
            }
            if (i11 == 1) {
                InternalSuperwallEvent.PaywallDecline paywallDecline2 = (InternalSuperwallEvent.PaywallDecline) paywallView$dismiss$dismissView$1.L$2;
                paywallResult = (PaywallResult) paywallView$dismiss$dismissView$1.L$1;
                paywallView = (PaywallView) paywallView$dismiss$dismissView$1.L$0;
                ResultKt.m(objOnFinished);
                z10 = paywallDecline2;
            } else {
                if (i11 == 2) {
                    z12 = paywallView$dismiss$dismissView$1.Z$0;
                    objM785constructorimpl = paywallView$dismiss$dismissView$1.L$2;
                    PaywallResult paywallResult2 = (PaywallResult) paywallView$dismiss$dismissView$1.L$1;
                    PaywallView paywallView3 = (PaywallView) paywallView$dismiss$dismissView$1.L$0;
                    ResultKt.m(objOnFinished);
                    ((Result) objOnFinished).j();
                    paywallResult = paywallResult2;
                    paywallView = paywallView3;
                    if (Result.m786isFailureimpl(objM785constructorimpl)) {
                        objM785constructorimpl = null;
                    }
                    presentationResult = (PresentationResult) objM785constructorimpl;
                    if (presentationResult != null && (presentationResult instanceof PresentationResult.Paywall) && !z12) {
                        return Unit.f312394a;
                    }
                    paywallViewDelegateAdapter = paywallView.callback;
                    if (paywallViewDelegateAdapter != null) {
                        paywallView.callbackInvoked = true;
                        paywallView$dismiss$dismissView$1.L$0 = paywallView;
                        paywallView$dismiss$dismissView$1.L$1 = null;
                        paywallView$dismiss$dismissView$1.L$2 = null;
                        paywallView$dismiss$dismissView$1.label = 3;
                        objOnFinished = paywallViewDelegateAdapter.onFinished(paywallView, paywallResult, true, paywallView$dismiss$dismissView$1);
                        if (objOnFinished != objL) {
                            paywallView2 = paywallView;
                        }
                        return objL;
                    }
                    paywallView.dismiss(false);
                    return Unit.f312394a;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                paywallView2 = (PaywallView) paywallView$dismiss$dismissView$1.L$0;
                ResultKt.m(objOnFinished);
            }
            if (((Unit) objOnFinished) == null) {
                paywallView = paywallView2;
                paywallView.dismiss(false);
            }
            return Unit.f312394a;
            failure = new Either.Success((PresentationResult) objOnFinished);
            r10 = z10;
        } catch (Throwable th2) {
            if (ErrorTrackingKt.shouldLog(th2)) {
                Superwall.Companion companion2 = Superwall.Companion;
                if (companion2.getInitialized()) {
                    ErrorTrackingKt.trackError(companion2.getInstance(), th2);
                }
            }
            failure = new Either.Failure(th2);
            r10 = z10;
        }
        if (failure instanceof Either.Success) {
            Result.a aVar = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(((Either.Success) failure).getValue());
        } else {
            if (!(failure instanceof Either.Failure)) {
                throw new k0();
            }
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(((Either.Failure) failure).getError()));
        }
        boolean zAreEqual = Intrinsics.areEqual(paywallView.getInfo().getPresentedByEventWithName(), SuperwallEvents.PaywallDecline.getRawName());
        Superwall companion3 = Superwall.Companion.getInstance();
        paywallView$dismiss$dismissView$1.L$0 = paywallView;
        paywallView$dismiss$dismissView$1.L$1 = paywallResult;
        paywallView$dismiss$dismissView$1.L$2 = objM785constructorimpl;
        paywallView$dismiss$dismissView$1.Z$0 = zAreEqual;
        paywallView$dismiss$dismissView$1.label = 2;
        if (TrackingKt.track(companion3, r10, paywallView$dismiss$dismissView$1) != objL) {
            z12 = zAreEqual;
            if (Result.m786isFailureimpl(objM785constructorimpl)) {
                objM785constructorimpl = null;
            }
            presentationResult = (PresentationResult) objM785constructorimpl;
            if (presentationResult != null) {
                return Unit.f312394a;
            }
            paywallViewDelegateAdapter = paywallView.callback;
            if (paywallViewDelegateAdapter != null) {
                paywallView.callbackInvoked = true;
                paywallView$dismiss$dismissView$1.L$0 = paywallView;
                paywallView$dismiss$dismissView$1.L$1 = null;
                paywallView$dismiss$dismissView$1.L$2 = null;
                paywallView$dismiss$dismissView$1.label = 3;
                objOnFinished = paywallViewDelegateAdapter.onFinished(paywallView, paywallResult, true, paywallView$dismiss$dismissView$1);
                if (objOnFinished != objL) {
                    paywallView2 = paywallView;
                    if (((Unit) objOnFinished) == null) {
                        paywallView = paywallView2;
                        paywallView.dismiss(false);
                    }
                }
            } else {
                paywallView.dismiss(false);
            }
            return Unit.f312394a;
        }
        return objL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p2 dismiss$lambda$5(boolean z10, boolean z11, PaywallView paywallView, PaywallResult paywallResult) {
        return kotlinx.coroutines.k.f(ioScope, null, null, new PaywallView$dismiss$dismiss$1$1(z10, z11, paywallView, paywallResult, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dismiss$lambda$7(PaywallView paywallView, Function0 function0, SurveyPresentationResult res) {
        Intrinsics.checkNotNullParameter(res, "res");
        paywallView.surveyPresentationResult = res;
        function0.invoke();
        return Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void dismiss$superwall_release$default(PaywallView paywallView, PaywallResult paywallResult, PaywallCloseReason paywallCloseReason, Function0 function0, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        paywallView.dismiss$superwall_release(paywallResult, paywallCloseReason, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Json gameControllerJson_delegate$lambda$16() {
        return JsonKt.Json$default(null, new Function1() { // from class: com.superwall.sdk.paywall.view.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaywallView.gameControllerJson_delegate$lambda$16$lambda$15((JsonBuilder) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gameControllerJson_delegate$lambda$16$lambda$15(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setEncodeDefaults(true);
        Json.setNamingStrategy(JsonNamingStrategy.Builtins.getSnakeCase());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideLoadingView() {
        PaywallPurchaseLoadingView paywallPurchaseLoadingView = this.loadingView;
        if (paywallPurchaseLoadingView != null) {
            kotlinx.coroutines.k.f(mainScope, null, null, new PaywallView$hideLoadingView$1$1(paywallPurchaseLoadingView, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideShimmerView() {
        PaywallShimmerView paywallShimmerView = this.shimmerView;
        if (paywallShimmerView != null) {
            kotlinx.coroutines.k.f(mainScope, null, null, new PaywallView$hideShimmerView$1$1(paywallShimmerView, null), 3, null);
        }
        Date startAt = getPaywall().getShimmerLoadingInfo().getStartAt();
        Date date = new Date();
        getPaywall().getShimmerLoadingInfo().setEndAt(date);
        kotlinx.coroutines.k.f(ioScope, null, null, new C27042(startAt, date, null), 3, null);
    }

    private final void presentationWillBegin() {
        if (this.presentationWillPrepare) {
            this.callbackInvoked = false;
            getPaywall().setCloseReason(PaywallCloseReason.None.INSTANCE);
            Superwall.Companion.getInstance().getDependencyContainer$superwall_release().getDelegateAdapter().willPresentPaywall(getInfo());
            try {
                getWebView().setRendererPriorityPolicy(2, true);
            } catch (Throwable th2) {
                Logger.debug$default(Logger.INSTANCE, LogLevel.info, LogScope.paywallView, "Cannot set webview priority when beginning presentation", null, th2, 8, null);
            }
            getWebView().scrollTo(0, 0);
            if (getLoadingState() instanceof PaywallLoadingState.Ready) {
                getWebView().getMessageHandler().handle(PaywallMessage.TemplateParamsAndUserAttributes.INSTANCE);
            }
            getPaywall().getShimmerLoadingInfo().setStartAt(new Date());
            trackShimmerStart();
            this.presentationWillPrepare = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recreateWebview() {
        removeView(getWebView());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this._webView = new SWWebView(context, getWebView().getMessageHandler(), null, new Function0() { // from class: com.superwall.sdk.paywall.view.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaywallView.recreateWebview$lambda$14(this.f267466a);
            }
        }, 4, null);
        addView(getWebView());
        getWebView().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        getWebView().getMessageHandler().handle(PaywallMessage.PaywallOpen.INSTANCE);
        loadWebView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaywallOptions recreateWebview$lambda$14(PaywallView paywallView) {
        return paywallView.factory.makeSuperwallOptions().getPaywalls();
    }

    private final void resetPresentationPreparations() {
        this.presentationWillPrepare = true;
        this.presentationDidFinishPrepare = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showAlert$default(PaywallView paywallView, String str, String str2, String str3, String str4, Function0 function0, Function0 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        if ((i10 & 8) != 0) {
            str4 = "Done";
        }
        if ((i10 & 16) != 0) {
            function0 = null;
        }
        if ((i10 & 32) != 0) {
            function1 = null;
        }
        paywallView.showAlert(str, str2, str3, str4, function0, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoadingView() {
        PaywallPurchaseLoadingView paywallPurchaseLoadingView;
        if (Superwall.Companion.getInstance().getOptions().getPaywalls().getTransactionBackgroundView() == PaywallOptions.TransactionBackgroundView.SPINNER && (paywallPurchaseLoadingView = this.loadingView) != null) {
            kotlinx.coroutines.k.f(mainScope, null, null, new PaywallView$showLoadingView$1$1(paywallPurchaseLoadingView, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showShimmerView() {
        PaywallShimmerView paywallShimmerView = this.shimmerView;
        if (paywallShimmerView != null) {
            kotlinx.coroutines.k.f(mainScope, null, null, new PaywallView$showShimmerView$1$1(paywallShimmerView, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object trackClose(kotlin.coroutines.d<? super Unit> dVar) {
        C27081 c27081;
        if (dVar instanceof C27081) {
            c27081 = (C27081) dVar;
            int i10 = c27081.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c27081.label = i10 - Integer.MIN_VALUE;
            } else {
                c27081 = new C27081(dVar);
            }
        } else {
            c27081 = new C27081(dVar);
        }
        Object obj = c27081.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c27081.label;
        if (i11 == 0) {
            ResultKt.m(obj);
            InternalSuperwallEvent.PaywallClose paywallClose = new InternalSuperwallEvent.PaywallClose(getInfo(), this.surveyPresentationResult);
            Superwall companion = Superwall.Companion.getInstance();
            c27081.label = 1;
            if (TrackingKt.track(companion, paywallClose, c27081) == objL) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object trackOpen(kotlin.coroutines.d<? super Unit> dVar) {
        C27091 c27091;
        if (dVar instanceof C27091) {
            c27091 = (C27091) dVar;
            int i10 = c27091.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c27091.label = i10 - Integer.MIN_VALUE;
            } else {
                c27091 = new C27091(dVar);
            }
        } else {
            c27091 = new C27091(dVar);
        }
        Object obj = c27091.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = c27091.label;
        if (i11 == 0) {
            ResultKt.m(obj);
            this.storage.trackPaywallOpen();
            getWebView().getMessageHandler().handle(PaywallMessage.PaywallOpen.INSTANCE);
            InternalSuperwallEvent.PaywallOpen paywallOpen = new InternalSuperwallEvent.PaywallOpen(getInfo());
            Superwall companion = Superwall.Companion.getInstance();
            c27091.label = 1;
            if (TrackingKt.track(companion, paywallOpen, c27091) == objL) {
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

    private final void trackShimmerStart() {
        kotlinx.coroutines.k.f(ioScope, null, null, new C27101(new InternalSuperwallEvent.ShimmerLoad(InternalSuperwallEvent.ShimmerLoad.State.Started, getPaywall().getIdentifier(), null, getPaywall().getPresentation().getDelay(), this.factory.makeSuperwallOptions().getPaywalls().getShouldPreload()), null), 3, null);
    }

    public final void beforeOnDestroy() {
        if (this.isBrowserViewPresented) {
            return;
        }
        Superwall.Companion companion = Superwall.Companion;
        companion.getInstance().getPresentationItems$superwall_release().setPaywallInfo(getInfo());
        companion.getInstance().getDependencyContainer$superwall_release().getDelegateAdapter().willDismissPaywall(getInfo());
    }

    public final void beforeViewCreated() {
        if (this.isBrowserViewPresented) {
            return;
        }
        PaywallShimmerView paywallShimmerView = this.shimmerView;
        if (paywallShimmerView != null) {
            paywallShimmerView.checkForOrientationChanges();
        }
        presentationWillBegin();
    }

    public final void cleanup() {
        WeakReference<Activity> encapsulatingActivity = getEncapsulatingActivity();
        if (encapsulatingActivity != null) {
            encapsulatingActivity.clear();
        }
        this.callback = null;
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        removeAllViews();
        detachAllViewsFromParent();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:46:0x0112  */
    /* JADX WARN: Code duplicated, block: B:49:0x011c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e8, code lost:
    
        if (r15 == r1) goto L39;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object destroyed(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.paywall.view.PaywallView.destroyed(kotlin.coroutines.d):java.lang.Object");
    }

    public final void dismiss$superwall_release(@NotNull final PaywallResult result, @NotNull PaywallCloseReason closeReason, @Nullable Function0<Unit> function0) {
        Activity activity;
        PresentationRequest.Flags flags;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(closeReason, "closeReason");
        this.dismissCompletionBlock = function0;
        this.paywallResult = result;
        getPaywall().setCloseReason(closeReason);
        final boolean z10 = this.paywallResult instanceof PaywallResult.Declined;
        final boolean z11 = closeReason instanceof PaywallCloseReason.ManualClose;
        final Function0 function1 = new Function0() { // from class: com.superwall.sdk.paywall.view.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaywallView.dismiss$lambda$5(z10, z11, this, result);
            }
        };
        SurveyManager surveyManager = SurveyManager.INSTANCE;
        List<Survey> surveys = getPaywall().getSurveys();
        WeakReference<Activity> encapsulatingActivity = getEncapsulatingActivity();
        if (encapsulatingActivity == null || (activity = encapsulatingActivity.get()) == null) {
            function1.invoke();
            return;
        }
        PaywallLoadingState loadingState = getLoadingState();
        PresentationRequest request = getRequest();
        boolean z12 = false;
        if (request != null && (flags = request.getFlags()) != null && flags.isDebuggerLaunched()) {
            z12 = true;
        }
        surveyManager.presentSurveyIfAvailable(surveys, result, closeReason, activity, this, loadingState, z12, getInfo(), this.storage, this.factory, new Function1() { // from class: com.superwall.sdk.paywall.view.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaywallView.dismiss$lambda$7(this.f267471a, function1, (SurveyPresentationResult) obj);
            }
        });
    }

    @Override // com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandlerDelegate
    public void eventDidOccur(@NotNull PaywallWebEvent paywallWebEvent) {
        Intrinsics.checkNotNullParameter(paywallWebEvent, "paywallWebEvent");
        kotlinx.coroutines.k.f(ioScope, null, null, new C27031(paywallWebEvent, null), 3, null);
    }

    @Override // com.superwall.sdk.game.GameControllerDelegate
    public void gameControllerEventOccured(@NotNull GameControllerEvent event) {
        String strEncodeToString;
        Intrinsics.checkNotNullParameter(event, "event");
        try {
            Json gameControllerJson = Companion.getGameControllerJson();
            gameControllerJson.getSerializersModule();
            strEncodeToString = gameControllerJson.encodeToString(GameControllerEvent.Companion.serializer(), event);
        } catch (Throwable unused) {
            strEncodeToString = null;
        }
        getWebView().evaluateJavascript("window.paywall.accept([" + strEncodeToString + "])", null);
        Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.paywallView, "Game controller event occurred: " + strEncodeToString, null, null, 24, null);
    }

    public final int getBackgroundColor() {
        Integer darkBackgroundColor;
        if ((getContext().getResources().getConfiguration().uiMode & 48) == 32 && (darkBackgroundColor = getPaywall().getDarkBackgroundColor()) != null) {
            return darkBackgroundColor.intValue();
        }
        return getPaywall().getBackgroundColor();
    }

    @Nullable
    public final PaywallViewDelegateAdapter getCallback() {
        return this.callback;
    }

    @NotNull
    public final DeviceHelper getDeviceHelper() {
        return this.deviceHelper;
    }

    @Override // com.superwall.sdk.paywall.view.ActivityEncapsulatable
    @Nullable
    public WeakReference<Activity> getEncapsulatingActivity() {
        return this.encapsulatingActivity;
    }

    @Nullable
    public final PaywallViewEventCallback getEventCallback() {
        return this.eventCallback;
    }

    @NotNull
    public final Factory getFactory() {
        return this.factory;
    }

    @Override // com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandlerDelegate, com.superwall.sdk.paywall.view.webview._SWWebViewDelegate
    @NotNull
    public PaywallInfo getInfo() {
        PresentationInfo presentationInfo;
        Paywall paywall = getPaywall();
        PresentationRequest request = getRequest();
        return paywall.getInfo((request == null || (presentationInfo = request.getPresentationInfo()) == null) ? null : presentationInfo.getEventData());
    }

    public final boolean getInterceptTouchEvents$superwall_release() {
        return this.interceptTouchEvents;
    }

    @Override // com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandlerDelegate
    @NotNull
    public PaywallLoadingState getLoadingState() {
        return this.loadingState;
    }

    @Override // com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandlerDelegate
    @NotNull
    public Paywall getPaywall() {
        return this.paywall;
    }

    @Nullable
    public final j0<PaywallState> getPaywallStatePublisher() {
        return this.paywallStatePublisher;
    }

    @Override // com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandlerDelegate
    @Nullable
    public PresentationRequest getRequest() {
        return this.request;
    }

    @NotNull
    public final LocalStorage getStorage() {
        return this.storage;
    }

    @Override // com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandlerDelegate
    public boolean isActive() {
        return this.isPresented;
    }

    public final boolean isBrowserViewPresented$superwall_release() {
        return this.isBrowserViewPresented;
    }

    public final void loadWebView() {
        kotlinx.coroutines.k.f(ioScope, null, null, new C27051(null), 3, null);
    }

    public final void loadingStateDidChange$superwall_release(@NotNull PaywallLoadingState from) {
        Intrinsics.checkNotNullParameter(from, "from");
        if (isActive()) {
            int i10 = 4 | 0;
            kotlinx.coroutines.k.f(mainScope, null, null, new PaywallView$loadingStateDidChange$1(this, null), 3, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getLoadingState() instanceof PaywallLoadingState.Unknown) {
            loadWebView();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@Nullable MotionEvent motionEvent) {
        return this.interceptTouchEvents;
    }

    public final void onViewCreated() {
        Function1<? super Boolean, Unit> function1 = this.viewCreatedCompletion;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        this.viewCreatedCompletion = null;
        if (this.presentationDidFinishPrepare) {
            return;
        }
        IOScope iOScope = ioScope;
        kotlinx.coroutines.k.f(iOScope, null, null, new C27061(null), 3, null);
        TriggerRuleOccurrence triggerRuleOccurrence = this.unsavedOccurrence;
        if (triggerRuleOccurrence != null) {
            CoreDataManager.save$default(this.storage.getCoreDataManager(), triggerRuleOccurrence, null, 2, null);
            this.unsavedOccurrence = null;
        }
        this.isPresented = true;
        Superwall.Companion.getInstance().getDependencyContainer$superwall_release().getDelegateAdapter().didPresentPaywall(getInfo());
        kotlinx.coroutines.k.f(iOScope, null, null, new AnonymousClass3(null), 3, null);
        GameControllerManager.Companion.getShared().setDelegate(this);
        this.initialOrientation = Integer.valueOf(getResources().getConfiguration().orientation);
        this.presentationDidFinishPrepare = true;
    }

    @Override // com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandlerDelegate
    public void openDeepLink(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Uri uri = Uri.parse(url);
        eventDidOccur(new PaywallWebEvent.OpenedDeepLink(uri));
        WeakReference<Activity> encapsulatingActivity = getEncapsulatingActivity();
        Activity activity = encapsulatingActivity != null ? encapsulatingActivity.get() : null;
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        if (activity != null) {
            activity.startActivity(intent);
        }
    }

    public final void prepareToDisplay() {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        PaywallViewCache paywallViewCache = this.cache;
        if (paywallViewCache != null) {
            paywallViewCache.setActivePaywallVcKey(this.cacheKey);
        }
    }

    public final void present(@NotNull Activity presenter, @NotNull PresentationRequest request, @Nullable TriggerRuleOccurrence triggerRuleOccurrence, @Nullable PaywallPresentationStyle paywallPresentationStyle, @NotNull j0<PaywallState> paywallStatePublisher, @NotNull Function1<? super Boolean, Unit> completion) {
        PaywallShimmerView paywallShimmerViewAcquireShimmerView;
        PaywallPurchaseLoadingView paywallPurchaseLoadingViewAcquireLoadingView;
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(paywallStatePublisher, "paywallStatePublisher");
        Intrinsics.checkNotNullParameter(completion, "completion");
        if (getWebView().getParent() == null) {
            addView(getWebView());
        }
        PaywallViewCache paywallViewCache = this.cache;
        if (paywallViewCache != null && (paywallPurchaseLoadingViewAcquireLoadingView = paywallViewCache.acquireLoadingView()) != null) {
            setupLoading$superwall_release(paywallPurchaseLoadingViewAcquireLoadingView);
        }
        PaywallViewCache paywallViewCache2 = this.cache;
        if (paywallViewCache2 != null && (paywallShimmerViewAcquireShimmerView = paywallViewCache2.acquireShimmerView()) != null) {
            setupShimmer$superwall_release(paywallShimmerViewAcquireShimmerView);
        }
        set$superwall_release(request, paywallStatePublisher, triggerRuleOccurrence);
        if (paywallPresentationStyle == null || paywallPresentationStyle == PaywallPresentationStyle.NONE) {
            this.presentationStyle = getPaywall().getPresentation().getStyle();
        } else {
            this.presentationStyle = paywallPresentationStyle;
        }
        SuperwallPaywallActivity.Companion.startWithView(presenter, this, this.cacheKey, this.presentationStyle);
        this.viewCreatedCompletion = completion;
    }

    @Override // com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandlerDelegate
    public void presentBrowserExternal(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            String string = new URI(url).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
            intent.addFlags(268435456);
            getContext().startActivity(intent);
        } catch (MalformedURLException unused) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.paywallView, "Invalid URL provided for \"Open External URL\" click behavior.", null, null, 24, null);
        } catch (Throwable unused2) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.paywallView, "Exception thrown for \"Open External URL\" click behavior.", null, null, 24, null);
        }
    }

    @Override // com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandlerDelegate
    public void presentBrowserInApp(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            URI uri = new URI(url);
            androidx.browser.customtabs.d dVarD = new androidx.browser.customtabs.d.c().d();
            Intrinsics.checkNotNullExpressionValue(dVarD, "build(...)");
            dVarD.f11897a.setFlags(268435456);
            Context context = getContext();
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            dVarD.g(context, Uri.parse(string));
            this.isBrowserViewPresented = true;
        } catch (MalformedURLException unused) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.paywallView, "Invalid URL provided for \"Open In-App URL\" click behavior.", null, null, 24, null);
        } catch (Throwable unused2) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.paywallView, "Exception thrown for \"Open In-App URL\" click behavior.", null, null, 24, null);
        }
    }

    public final void set$superwall_release(@NotNull PresentationRequest request, @NotNull j0<PaywallState> paywallStatePublisher, @Nullable TriggerRuleOccurrence triggerRuleOccurrence) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(paywallStatePublisher, "paywallStatePublisher");
        setRequest(request);
        this.paywallStatePublisher = paywallStatePublisher;
        this.unsavedOccurrence = triggerRuleOccurrence;
    }

    public final void setBrowserViewPresented$superwall_release(boolean z10) {
        this.isBrowserViewPresented = z10;
    }

    public final void setCallback(@Nullable PaywallViewDelegateAdapter paywallViewDelegateAdapter) {
        this.callback = paywallViewDelegateAdapter;
    }

    @Override // com.superwall.sdk.paywall.view.ActivityEncapsulatable
    public void setEncapsulatingActivity(@Nullable WeakReference<Activity> weakReference) {
        this.encapsulatingActivity = weakReference;
    }

    public final void setInterceptTouchEvents$superwall_release(boolean z10) {
        this.interceptTouchEvents = z10;
    }

    @Override // com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandlerDelegate
    public void setLoadingState(@NotNull PaywallLoadingState value) {
        Intrinsics.checkNotNullParameter(value, "value");
        PaywallLoadingState paywallLoadingState = this.loadingState;
        this.loadingState = value;
        if (value.getClass() != paywallLoadingState.getClass()) {
            loadingStateDidChange$superwall_release(paywallLoadingState);
        }
    }

    @Override // com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandlerDelegate
    public void setPaywall(@NotNull Paywall paywall) {
        Intrinsics.checkNotNullParameter(paywall, "<set-?>");
        this.paywall = paywall;
    }

    public final void setPaywallStatePublisher(@Nullable j0<PaywallState> j0Var) {
        this.paywallStatePublisher = j0Var;
    }

    public void setRequest(@Nullable PresentationRequest presentationRequest) {
        this.request = presentationRequest;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setupLoading$superwall_release(@NotNull PaywallPurchaseLoadingView loadingView) {
        Intrinsics.checkNotNullParameter(loadingView, "loadingView");
        this.loadingView = loadingView;
        if (loadingView instanceof View) {
            LoadingViewKt.setupFor((View) loadingView, this, getLoadingState());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setupShimmer$superwall_release(@NotNull PaywallShimmerView shimmerView) {
        Intrinsics.checkNotNullParameter(shimmerView, "shimmerView");
        this.shimmerView = shimmerView;
        if (shimmerView instanceof View) {
            PaywallShimmerViewKt.setupFor((View) shimmerView, this, getLoadingState());
        }
    }

    public final void setupWith(@NotNull PaywallShimmerView shimmerView, @NotNull PaywallPurchaseLoadingView loadingView) {
        Intrinsics.checkNotNullParameter(shimmerView, "shimmerView");
        Intrinsics.checkNotNullParameter(loadingView, "loadingView");
        if (getWebView().getParent() == null) {
            addView(getWebView());
            getWebView().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        this.shimmerView = shimmerView;
        this.loadingView = loadingView;
    }

    public final void showAlert(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String closeActionTitle, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1) {
        Activity activity;
        Intrinsics.checkNotNullParameter(closeActionTitle, "closeActionTitle");
        WeakReference<Activity> encapsulatingActivity = getEncapsulatingActivity();
        if (encapsulatingActivity == null || (activity = encapsulatingActivity.get()) == null) {
            return;
        }
        kotlinx.coroutines.k.f(mainScope, null, null, new C27071(activity, str, str2, str3, closeActionTitle, this, function0, function1, null), 3, null);
    }

    public final void showRefreshButtonAfterTimeout(boolean z10) {
    }

    public final void togglePaywallSpinner(boolean z10) {
        if (!z10) {
            if (getLoadingState() instanceof PaywallLoadingState.Ready) {
                setLoadingState(new PaywallLoadingState.ManualLoading());
            }
        } else if ((getLoadingState() instanceof PaywallLoadingState.ManualLoading) || (getLoadingState() instanceof PaywallLoadingState.LoadingPurchase)) {
            setLoadingState(new PaywallLoadingState.Ready());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallView(@NotNull Context context, @NotNull Paywall paywall, @Nullable PaywallViewEventCallback paywallViewEventCallback, @Nullable PaywallViewDelegateAdapter paywallViewDelegateAdapter, @NotNull DeviceHelper deviceHelper, @NotNull Factory factory, @NotNull LocalStorage storage, @NotNull SWWebView webView, @Nullable PaywallViewCache paywallViewCache, boolean z10) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(paywall, "paywall");
        Intrinsics.checkNotNullParameter(deviceHelper, "deviceHelper");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.paywall = paywall;
        this.eventCallback = paywallViewEventCallback;
        this.callback = paywallViewDelegateAdapter;
        this.deviceHelper = deviceHelper;
        this.factory = factory;
        this.storage = storage;
        this.cache = paywallViewCache;
        this.useMultipleUrls = z10;
        this._webView = webView;
        this.webView = webView;
        this.surveyPresentationResult = SurveyPresentationResult.NOSHOW;
        this.loadingState = new PaywallLoadingState.Unknown();
        int i10 = 3 & 1;
        this.presentationWillPrepare = true;
        this.cacheKey = PaywallCacheLogic.INSTANCE.key(getPaywall().getIdentifier(), deviceHelper.getLocale());
        setId(View.generateViewId());
        setBackgroundColor(getBackgroundColor());
        this.presentationStyle = getPaywall().getPresentation().getStyle();
    }

    @Override // com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandlerDelegate
    @NotNull
    public SWWebView getWebView() {
        return this.webView;
    }
}
