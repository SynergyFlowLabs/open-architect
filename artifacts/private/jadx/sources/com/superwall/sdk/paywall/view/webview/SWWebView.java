package com.superwall.sdk.paywall.view.webview;

import android.content.Context;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.app.w;
import com.facebook.internal.z0;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.internal.TrackingKt;
import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import com.superwall.sdk.config.options.PaywallOptions;
import com.superwall.sdk.game.PublicGameControllerKt;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.misc.IOScope;
import com.superwall.sdk.misc.MainScope;
import com.superwall.sdk.models.paywall.Paywall;
import com.superwall.sdk.models.paywall.PaywallWebviewUrl;
import com.superwall.sdk.paywall.presentation.PaywallInfo;
import com.superwall.sdk.paywall.view.delegate.PaywallLoadingState;
import com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler;
import java.util.Date;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class SWWebView extends WebView {

    @NotNull
    private static final ChromeClient ChromeClient = new ChromeClient(null);

    @Nullable
    private SWWebViewDelegate delegate;

    @NotNull
    private final f0 gestureDetector$delegate;

    @NotNull
    private final IOScope ioScope;

    @Nullable
    private String lastLoadedUrl;

    @Nullable
    private WebViewClient lastWebViewClient;

    @NotNull
    private final MainScope mainScope;

    @NotNull
    private final PaywallMessageHandler messageHandler;

    @Nullable
    private final Function1<String, Unit> onFinishedLoading;

    @NotNull
    private Function1<? super RenderProcessGoneDetail, Unit> onRenderProcessCrashed;

    @Nullable
    private OnScrollChangeListener onScrollChangeListener;

    @NotNull
    private final Function0<PaywallOptions> options;
    private boolean scrollEnabled;

    private static final class ChromeClient extends WebChromeClient {
        public /* synthetic */ ChromeClient(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(@NotNull ConsoleMessage consoleMessage) {
            Intrinsics.checkNotNullParameter(consoleMessage, "consoleMessage");
            return true;
        }

        private ChromeClient() {
        }
    }

    public interface OnScrollChangeListener {
        void onScrollChanged(int i10, int i11, int i12, int i13);
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.SWWebView$listenToWebviewClientEvents$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.view.webview.SWWebView$listenToWebviewClientEvents$1", f = "SWWebView.kt", i = {}, l = {220}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ DefaultWebviewClient $client;
        int label;
        final /* synthetic */ SWWebView this$0;

        /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.SWWebView$listenToWebviewClientEvents$1$1, reason: invalid class name and collision with other inner class name */
        @f(c = "com.superwall.sdk.paywall.view.webview.SWWebView$listenToWebviewClientEvents$1$1", f = "SWWebView.kt", i = {}, l = {219}, m = "invokeSuspend", n = {}, s = {})
        static final class C18831 extends o implements Function2<WebviewClientEvent, kotlin.coroutines.d<? super Boolean>, Object> {
            final /* synthetic */ DefaultWebviewClient $client;
            int label;
            final /* synthetic */ SWWebView this$0;

            /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.SWWebView$listenToWebviewClientEvents$1$1$1, reason: invalid class name and collision with other inner class name */
            @f(c = "com.superwall.sdk.paywall.view.webview.SWWebView$listenToWebviewClientEvents$1$1$1", f = "SWWebView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C18841 extends o implements Function2<s0, kotlin.coroutines.d<? super Boolean>, Object> {
                final /* synthetic */ DefaultWebviewClient $client;
                int label;
                final /* synthetic */ SWWebView this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C18841(SWWebView sWWebView, DefaultWebviewClient defaultWebviewClient, kotlin.coroutines.d<? super C18841> dVar) {
                    super(2, dVar);
                    this.this$0 = sWWebView;
                    this.$client = defaultWebviewClient;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C18841(this.this$0, this.$client, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return kotlin.coroutines.jvm.internal.b.a(Intrinsics.areEqual(this.this$0.getWebViewClient(), this.$client));
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
                    return ((C18841) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18831(SWWebView sWWebView, DefaultWebviewClient defaultWebviewClient, kotlin.coroutines.d<? super C18831> dVar) {
                super(2, dVar);
                this.this$0 = sWWebView;
                this.$client = defaultWebviewClient;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C18831(this.this$0, this.$client, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(WebviewClientEvent webviewClientEvent, kotlin.coroutines.d<? super Boolean> dVar) {
                return ((C18831) create(webviewClientEvent, dVar)).invokeSuspend(Unit.f312394a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                a1 a1VarB = k.b(this.this$0.mainScope, null, null, new C18841(this.this$0, this.$client, null), 3, null);
                this.label = 1;
                Object objQ = a1VarB.q(this);
                return objQ == objL ? objL : objQ;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DefaultWebviewClient defaultWebviewClient, SWWebView sWWebView, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$client = defaultWebviewClient;
            this.this$0 = sWWebView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.$client, this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                i iVarX1 = kotlinx.coroutines.flow.k.X1(this.$client.getWebviewClientEvents(), new C18831(this.this$0, this.$client, null));
                final SWWebView sWWebView = this.this$0;
                j jVar = new j() { // from class: com.superwall.sdk.paywall.view.webview.SWWebView.listenToWebviewClientEvents.1.2

                    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.SWWebView$listenToWebviewClientEvents$1$2$1, reason: invalid class name and collision with other inner class name */
                    @f(c = "com.superwall.sdk.paywall.view.webview.SWWebView$listenToWebviewClientEvents$1$2$1", f = "SWWebView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    static final class C18851 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
                        final /* synthetic */ WebviewClientEvent $it;
                        int label;
                        final /* synthetic */ SWWebView this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C18851(WebviewClientEvent webviewClientEvent, SWWebView sWWebView, kotlin.coroutines.d<? super C18851> dVar) {
                            super(2, dVar);
                            this.$it = webviewClientEvent;
                            this.this$0 = sWWebView;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                            return new C18851(this.$it, this.this$0, dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            SWWebViewDelegate delegate;
                            String url;
                            List<String> urls;
                            kotlin.coroutines.intrinsics.b.l();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.m(obj);
                            WebviewClientEvent webviewClientEvent = this.$it;
                            if (webviewClientEvent instanceof WebviewClientEvent.OnError) {
                                SWWebView sWWebView = this.this$0;
                                WebviewError webviewError = ((WebviewClientEvent.OnError) webviewClientEvent).getWebviewError();
                                WebviewError webviewError2 = ((WebviewClientEvent.OnError) this.$it).getWebviewError();
                                if (webviewError2 instanceof WebviewError.NetworkError) {
                                    urls = CollectionsKt.listOf(((WebviewError.NetworkError) webviewError2).getUrl());
                                } else if (webviewError2 instanceof WebviewError.NoUrls) {
                                    urls = CollectionsKt.emptyList();
                                } else if (webviewError2 instanceof WebviewError.MaxAttemptsReached) {
                                    urls = ((WebviewError.MaxAttemptsReached) webviewError2).getUrls();
                                } else {
                                    if (!(webviewError2 instanceof WebviewError.AllUrlsFailed)) {
                                        throw new k0();
                                    }
                                    urls = ((WebviewError.AllUrlsFailed) webviewError2).getUrls();
                                }
                                sWWebView.trackPaywallError(webviewError, urls);
                                if (this.this$0.lastLoadedUrl != null) {
                                    WebViewClient webViewClient = this.this$0.lastWebViewClient;
                                    if (!(webViewClient instanceof WebviewFallbackClient) && (webViewClient instanceof DefaultWebviewClient)) {
                                        SWWebView sWWebView2 = this.this$0;
                                        String str = sWWebView2.lastLoadedUrl;
                                        Intrinsics.checkNotNull(str);
                                        sWWebView2.loadUrl(str);
                                    }
                                }
                            } else if (webviewClientEvent instanceof WebviewClientEvent.OnResourceError) {
                                SWWebView sWWebView3 = this.this$0;
                                WebviewError webviewError3 = ((WebviewClientEvent.OnResourceError) webviewClientEvent).getWebviewError();
                                WebviewError webviewError4 = ((WebviewClientEvent.OnResourceError) this.$it).getWebviewError();
                                if (webviewError4 instanceof WebviewError.NetworkError) {
                                    url = ((WebviewError.NetworkError) webviewError4).getUrl();
                                } else if (webviewError4 instanceof WebviewError.NoUrls) {
                                    url = "";
                                } else if (webviewError4 instanceof WebviewError.MaxAttemptsReached) {
                                    url = (String) CollectionsKt.first((List) ((WebviewError.MaxAttemptsReached) webviewError4).getUrls());
                                } else {
                                    if (!(webviewError4 instanceof WebviewError.AllUrlsFailed)) {
                                        throw new k0();
                                    }
                                    url = (String) CollectionsKt.first((List) ((WebviewError.AllUrlsFailed) webviewError4).getUrls());
                                }
                                sWWebView3.trackPaywallResourceError(webviewError3, url);
                            } else if (webviewClientEvent instanceof WebviewClientEvent.OnPageFinished) {
                                if (((PaywallOptions) this.this$0.options.invoke()).getOptimisticLoading() && (delegate = this.this$0.getDelegate()) != null) {
                                    delegate.setLoadingState(new PaywallLoadingState.Ready());
                                }
                                Function1 function1 = this.this$0.onFinishedLoading;
                                if (function1 != null) {
                                    function1.invoke(((WebviewClientEvent.OnPageFinished) this.$it).getUrl());
                                }
                            } else {
                                if (!(webviewClientEvent instanceof WebviewClientEvent.LoadingFallback)) {
                                    throw new k0();
                                }
                                this.this$0.trackLoadFallback();
                            }
                            return Unit.f312394a;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                            return ((C18851) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                        }
                    }

                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                        return emit((WebviewClientEvent) obj2, (kotlin.coroutines.d<? super Unit>) dVar);
                    }

                    public final Object emit(WebviewClientEvent webviewClientEvent, kotlin.coroutines.d<? super Unit> dVar) {
                        k.f(sWWebView.mainScope, null, null, new C18851(webviewClientEvent, sWWebView, null), 3, null);
                        return Unit.f312394a;
                    }
                };
                this.label = 1;
                if (iVarX1.collect(jVar, this) == objL) {
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
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.SWWebView$trackLoadFallback$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.view.webview.SWWebView$trackLoadFallback$1", f = "SWWebView.kt", i = {}, l = {299}, m = "invokeSuspend", n = {}, s = {})
    static final class C27161 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        C27161(kotlin.coroutines.d<? super C27161> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return SWWebView.this.new C27161(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            PaywallInfo info;
            Paywall paywall;
            Paywall.LoadingInfo webviewLoadingInfo;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                SWWebViewDelegate delegate = SWWebView.this.getDelegate();
                if (delegate != null && (paywall = delegate.getPaywall()) != null && (webviewLoadingInfo = paywall.getWebviewLoadingInfo()) != null) {
                    webviewLoadingInfo.setFailAt(new Date());
                }
                SWWebViewDelegate delegate2 = SWWebView.this.getDelegate();
                if (delegate2 == null || (info = delegate2.getInfo()) == null) {
                    return Unit.f312394a;
                }
                InternalSuperwallEvent.PaywallWebviewLoad paywallWebviewLoad = new InternalSuperwallEvent.PaywallWebviewLoad(InternalSuperwallEvent.PaywallWebviewLoad.State.Fallback.INSTANCE, info);
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
            return ((C27161) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.SWWebView$trackPaywallError$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.view.webview.SWWebView$trackPaywallError$1", f = "SWWebView.kt", i = {}, l = {321}, m = "invokeSuspend", n = {}, s = {})
    static final class C27171 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ WebviewError $error;
        final /* synthetic */ List<String> $urls;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27171(WebviewError webviewError, List<String> list, kotlin.coroutines.d<? super C27171> dVar) {
            super(2, dVar);
            this.$error = webviewError;
            this.$urls = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return SWWebView.this.new C27171(this.$error, this.$urls, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            PaywallInfo info;
            Paywall paywall;
            Paywall.LoadingInfo webviewLoadingInfo;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                SWWebViewDelegate delegate = SWWebView.this.getDelegate();
                if (delegate != null && (paywall = delegate.getPaywall()) != null && (webviewLoadingInfo = paywall.getWebviewLoadingInfo()) != null) {
                    webviewLoadingInfo.setFailAt(new Date());
                }
                SWWebViewDelegate delegate2 = SWWebView.this.getDelegate();
                if (delegate2 != null && (info = delegate2.getInfo()) != null) {
                    InternalSuperwallEvent.PaywallWebviewLoad paywallWebviewLoad = new InternalSuperwallEvent.PaywallWebviewLoad(new InternalSuperwallEvent.PaywallWebviewLoad.State.Fail(this.$error, this.$urls), info);
                    Superwall companion = Superwall.Companion.getInstance();
                    this.label = 1;
                    if (TrackingKt.track(companion, paywallWebviewLoad, this) == objL) {
                        return objL;
                    }
                }
                return Unit.f312394a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            ((Result) obj).j();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C27171) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.SWWebView$trackPaywallResourceError$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.view.webview.SWWebView$trackPaywallResourceError$1", f = "SWWebView.kt", i = {}, l = {335}, m = "invokeSuspend", n = {}, s = {})
    static final class C27181 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ WebviewError $error;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27181(String str, WebviewError webviewError, kotlin.coroutines.d<? super C27181> dVar) {
            super(2, dVar);
            this.$url = str;
            this.$error = webviewError;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C27181(this.$url, this.$error, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                InternalSuperwallEvent.PaywallResourceLoadFail paywallResourceLoadFail = new InternalSuperwallEvent.PaywallResourceLoadFail(this.$url, this.$error.toString());
                Superwall companion = Superwall.Companion.getInstance();
                this.label = 1;
                if (TrackingKt.track(companion, paywallResourceLoadFail, this) == objL) {
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
            return ((C27181) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ SWWebView(Context context, PaywallMessageHandler paywallMessageHandler, Function1 function1, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, paywallMessageHandler, (i10 & 4) != 0 ? null : function1, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GestureDetector gestureDetector_delegate$lambda$0(Context context) {
        return new GestureDetector(context, new ScrollDisabledListener());
    }

    private final GestureDetector getGestureDetector() {
        return (GestureDetector) this.gestureDetector$delegate.getValue();
    }

    private final void listenToWebviewClientEvents(DefaultWebviewClient defaultWebviewClient) {
        k.f(this.ioScope, null, null, new AnonymousClass1(defaultWebviewClient, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadPaywallWithFallbackUrl$lambda$3(SWWebView sWWebView, PaywallWebviewUrl it) {
        Intrinsics.checkNotNullParameter(it, "it");
        sWWebView.lastLoadedUrl = it.getUrl();
        super.loadUrl(sWWebView.transformUri(it.getUrl()));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadPaywallWithFallbackUrl$lambda$4(SWWebView sWWebView) {
        sWWebView.stopLoading();
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onRenderProcessCrashed$lambda$1(RenderProcessGoneDetail it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.paywallView, "WebView crashed: " + it, null, null, 24, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackLoadFallback() {
        k.f(this.mainScope, null, null, new C27161(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackPaywallError(WebviewError webviewError, List<String> list) {
        k.f(this.mainScope, null, null, new C27171(webviewError, list, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackPaywallResourceError(WebviewError webviewError, String str) {
        k.f(this.mainScope, null, null, new C27181(str, webviewError, null), 3, null);
    }

    private final String transformUri(String str) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.appendQueryParameter("platform", "android");
        builderBuildUpon.appendQueryParameter(w.O0, "android");
        builderBuildUpon.appendQueryParameter("debug", z0.P);
        String string = builderBuildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.paywallView, "SWWebView.loadUrl: " + string, null, null, 24, null);
        return string;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.onScrollChangeListener = null;
        super.destroy();
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(@Nullable MotionEvent motionEvent) {
        if (motionEvent != null) {
            Superwall.Companion companion = Superwall.Companion;
            if (companion.getInstance().getOptions().isGameControllerEnabled()) {
                PublicGameControllerKt.dispatchMotionEvent(companion.getInstance(), motionEvent);
                return true;
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(@Nullable KeyEvent keyEvent) {
        if (keyEvent != null) {
            Superwall.Companion companion = Superwall.Companion;
            if (companion.getInstance().getOptions().isGameControllerEnabled()) {
                PublicGameControllerKt.dispatchKeyEvent(companion.getInstance(), keyEvent);
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void enableOffscreenRender() {
        getSettings().setOffscreenPreRaster(true);
    }

    @Nullable
    public final SWWebViewDelegate getDelegate() {
        return this.delegate;
    }

    @NotNull
    public final PaywallMessageHandler getMessageHandler() {
        return this.messageHandler;
    }

    @NotNull
    public final Function1<RenderProcessGoneDetail, Unit> getOnRenderProcessCrashed() {
        return this.onRenderProcessCrashed;
    }

    @Nullable
    public final OnScrollChangeListener getOnScrollChangeListener() {
        return this.onScrollChangeListener;
    }

    public final boolean getScrollEnabled() {
        return this.scrollEnabled;
    }

    public final void loadPaywallWithFallbackUrl$superwall_release(@NotNull Paywall paywall) {
        Intrinsics.checkNotNullParameter(paywall, "paywall");
        prepareWebview$superwall_release();
        PaywallWebviewUrl.Config urlConfig = paywall.getUrlConfig();
        if (urlConfig == null) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.paywallView, "Tried to start a paywall with multiple URLS but without URL config", null, null, 24, null);
            return;
        }
        MainScope mainScope = this.mainScope;
        WebviewFallbackClient webviewFallbackClient = new WebviewFallbackClient(urlConfig, this.ioScope, mainScope, new Function1() { // from class: com.superwall.sdk.paywall.view.webview.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SWWebView.loadPaywallWithFallbackUrl$lambda$3(this.f267520a, (PaywallWebviewUrl) obj);
            }
        }, new Function0() { // from class: com.superwall.sdk.paywall.view.webview.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SWWebView.loadPaywallWithFallbackUrl$lambda$4(this.f267521a);
            }
        }, this.onRenderProcessCrashed);
        setWebViewClient(webviewFallbackClient);
        listenToWebviewClientEvents(webviewFallbackClient);
        webviewFallbackClient.loadWithFallback$superwall_release();
    }

    @Override // android.webkit.WebView
    public void loadUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.lastLoadedUrl = url;
        prepareWebview$superwall_release();
        DefaultWebviewClient defaultWebviewClient = new DefaultWebviewClient(url, t0.a(l1.c()), this.onRenderProcessCrashed);
        setWebViewClient(defaultWebviewClient);
        listenToWebviewClientEvents(defaultWebviewClient);
        super.loadUrl(transformUri(url));
    }

    @Override // android.webkit.WebView, android.view.View
    @NotNull
    public InputConnection onCreateInputConnection(@Nullable EditorInfo editorInfo) {
        return new BaseInputConnection(this, false);
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        OnScrollChangeListener onScrollChangeListener = this.onScrollChangeListener;
        if (onScrollChangeListener != null) {
            onScrollChangeListener.onScrollChanged(i10, i11, i12, i13);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.scrollEnabled && event.getAction() == 2) {
            boolean zOnTouchEvent = getGestureDetector().onTouchEvent(event);
            return !zOnTouchEvent ? super.onTouchEvent(event) : zOnTouchEvent;
        }
        return super.onTouchEvent(event);
    }

    public final void prepareWebview$superwall_release() {
        addJavascriptInterface(this.messageHandler, "SWAndroid");
        WebSettings settings = getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setTextZoom(100);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setBackgroundColor(0);
        setWebChromeClient(ChromeClient);
    }

    public final void setDelegate(@Nullable SWWebViewDelegate sWWebViewDelegate) {
        this.delegate = sWWebViewDelegate;
    }

    public final void setOnRenderProcessCrashed(@NotNull Function1<? super RenderProcessGoneDetail, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onRenderProcessCrashed = function1;
    }

    public final void setOnScrollChangeListener(@Nullable OnScrollChangeListener onScrollChangeListener) {
        this.onScrollChangeListener = onScrollChangeListener;
    }

    public final void setScrollEnabled(boolean z10) {
        this.scrollEnabled = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SWWebView(@NotNull final Context context, @NotNull PaywallMessageHandler messageHandler, @Nullable Function1<? super String, Unit> function1, @NotNull Function0<PaywallOptions> options) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
        Intrinsics.checkNotNullParameter(options, "options");
        this.messageHandler = messageHandler;
        this.onFinishedLoading = function1;
        this.options = options;
        this.mainScope = new MainScope(null, 1, null);
        this.ioScope = new IOScope(null, 1, null);
        this.gestureDetector$delegate = g0.c(new Function0() { // from class: com.superwall.sdk.paywall.view.webview.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SWWebView.gestureDetector_delegate$lambda$0(context);
            }
        });
        this.scrollEnabled = true;
        this.onRenderProcessCrashed = new Function1() { // from class: com.superwall.sdk.paywall.view.webview.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SWWebView.onRenderProcessCrashed$lambda$1((RenderProcessGoneDetail) obj);
            }
        };
    }
}
