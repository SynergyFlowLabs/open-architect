package com.superwall.sdk.paywall.view.webview.messaging;

import android.net.Uri;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.core.app.w;
import cj.h;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.superwall.sdk.Superwall;
import com.superwall.sdk.analytics.SessionEventsManager;
import com.superwall.sdk.analytics.internal.TrackingKt;
import com.superwall.sdk.analytics.internal.trackable.InternalSuperwallEvent;
import com.superwall.sdk.analytics.superwall.SuperwallEvents;
import com.superwall.sdk.dependencies.VariablesFactory;
import com.superwall.sdk.logger.LogLevel;
import com.superwall.sdk.logger.LogScope;
import com.superwall.sdk.logger.Logger;
import com.superwall.sdk.misc.MainScope;
import com.superwall.sdk.models.events.EventData;
import com.superwall.sdk.models.paywall.Paywall;
import com.superwall.sdk.paywall.presentation.internal.PresentationRequest;
import com.superwall.sdk.paywall.presentation.internal.request.PresentationInfo;
import com.superwall.sdk.paywall.view.delegate.PaywallLoadingState;
import com.superwall.sdk.paywall.view.webview.PaywallMessage;
import com.superwall.sdk.paywall.view.webview.PaywallMessageKt;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.e1;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPaywallMessageHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaywallMessageHandler.kt\ncom/superwall/sdk/paywall/view/webview/messaging/PaywallMessageHandler\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,430:1\n113#2:431\n*S KotlinDebug\n*F\n+ 1 PaywallMessageHandler.kt\ncom/superwall/sdk/paywall/view/webview/messaging/PaywallMessageHandler\n*L\n200#1:431\n*E\n"})
public final class PaywallMessageHandler {

    @Nullable
    private PaywallMessageHandlerDelegate delegate;

    @NotNull
    private final VariablesFactory factory;

    @NotNull
    private final s0 ioScope;

    @NotNull
    private final Json json;

    @NotNull
    private final MainScope mainScope;

    @NotNull
    private final Queue<PaywallMessage> queue;

    @NotNull
    private final SessionEventsManager sessionEventsManager;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String selectionString = "var css = '*{-webkit-touch-callout:none;-webkit-user-select:none} .w-webflow-badge { display: none !important; }';\n                    var head = document.head || document.getElementsByTagName('head')[0];\n                    var style = document.createElement('style'); style.type = 'text/css';\n                    style.appendChild(document.createTextNode(css)); head.appendChild(style); ";

    @NotNull
    private static final String preventZoom = "var meta = document.createElement('meta');\n                        meta.name = 'viewport';\n                        meta.content = 'width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no';\n                        var head = document.getElementsByTagName('head')[0];\n                        head.appendChild(meta);";

    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getPreventZoom() {
            return PaywallMessageHandler.preventZoom;
        }

        @NotNull
        public final String getSelectionString() {
            return PaywallMessageHandler.selectionString;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler$didLoadWebView$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler", f = "PaywallMessageHandler.kt", i = {0, 0}, l = {279}, m = "didLoadWebView", n = {"this", "htmlSubstitutions"}, s = {"L$0", "L$1"})
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
            return PaywallMessageHandler.this.didLoadWebView(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler$didLoadWebView$2, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler$didLoadWebView$2", f = "PaywallMessageHandler.kt", i = {}, l = {266}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Date $loadedAt;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Date date, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$loadedAt = date;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return PaywallMessageHandler.this.new AnonymousClass2(this.$loadedAt, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                PaywallMessageHandlerDelegate delegate = PaywallMessageHandler.this.getDelegate();
                if (delegate != null) {
                    delegate.getPaywall().getWebviewLoadingInfo().setEndAt(this.$loadedAt);
                    InternalSuperwallEvent.PaywallWebviewLoad paywallWebviewLoad = new InternalSuperwallEvent.PaywallWebviewLoad(new InternalSuperwallEvent.PaywallWebviewLoad.State.Complete(), delegate.getInfo());
                    Superwall companion = Superwall.Companion.getInstance();
                    this.label = 1;
                    if (TrackingKt.track(companion, paywallWebviewLoad, this) == objL) {
                        return objL;
                    }
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
            return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler$didLoadWebView$3, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler$didLoadWebView$3", f = "PaywallMessageHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ String $scriptSrc;
        int label;

        /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler$didLoadWebView$3$2, reason: invalid class name */
        @f(c = "com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler$didLoadWebView$3$2", f = "PaywallMessageHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
            int label;
            final /* synthetic */ PaywallMessageHandler this$0;

            /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler$didLoadWebView$3$2$1, reason: invalid class name */
            @f(c = "com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler$didLoadWebView$3$2$1", f = "PaywallMessageHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
                int label;
                final /* synthetic */ PaywallMessageHandler this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PaywallMessageHandler paywallMessageHandler, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
                    super(2, dVar);
                    this.this$0 = paywallMessageHandler;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new AnonymousClass1(this.this$0, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    while (!this.this$0.queue.isEmpty()) {
                        PaywallMessage paywallMessage = (PaywallMessage) this.this$0.queue.remove();
                        PaywallMessageHandler paywallMessageHandler = this.this$0;
                        Intrinsics.checkNotNull(paywallMessage);
                        paywallMessageHandler.handle(paywallMessage);
                    }
                    PaywallMessageHandlerDelegate delegate = this.this$0.getDelegate();
                    if (delegate != null) {
                        delegate.setLoadingState(new PaywallLoadingState.Ready());
                    }
                    return Unit.f312394a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PaywallMessageHandler paywallMessageHandler, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
                super(2, dVar);
                this.this$0 = paywallMessageHandler;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new AnonymousClass2(this.this$0, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                k.f(this.this$0.mainScope, null, null, new AnonymousClass1(this.this$0, null), 3, null);
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((AnonymousClass2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(String str, kotlin.coroutines.d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$scriptSrc = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(String str, String str2) {
            if (str2 != null) {
                Logger.INSTANCE.debug(LogLevel.error, LogScope.paywallView, "Error Evaluating JS", MapsKt.mapOf(TuplesKt.to("message", str)), new Exception(str2));
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return PaywallMessageHandler.this.new AnonymousClass3(this.$scriptSrc, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            WebView webView;
            WebView webView2;
            WebView webView3;
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            PaywallMessageHandlerDelegate delegate = PaywallMessageHandler.this.getDelegate();
            if (delegate != null && (webView3 = delegate.getWebView()) != null) {
                final String str = this.$scriptSrc;
                webView3.evaluateJavascript(str, new ValueCallback() { // from class: com.superwall.sdk.paywall.view.webview.messaging.b
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj2) {
                        PaywallMessageHandler.AnonymousClass3.invokeSuspend$lambda$0(str, (String) obj2);
                    }
                });
            }
            PaywallMessageHandlerDelegate delegate2 = PaywallMessageHandler.this.getDelegate();
            if (delegate2 != null && (webView2 = delegate2.getWebView()) != null) {
                webView2.evaluateJavascript(PaywallMessageHandler.Companion.getSelectionString(), null);
            }
            PaywallMessageHandlerDelegate delegate3 = PaywallMessageHandler.this.getDelegate();
            if (delegate3 != null && (webView = delegate3.getWebView()) != null) {
                webView.evaluateJavascript(PaywallMessageHandler.Companion.getPreventZoom(), null);
            }
            k.f(PaywallMessageHandler.this.ioScope, null, null, new AnonymousClass2(PaywallMessageHandler.this, null), 3, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass3) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler$handle$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler$handle$1", f = "PaywallMessageHandler.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
    static final class C27201 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Paywall $paywall;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27201(Paywall paywall, kotlin.coroutines.d<? super C27201> dVar) {
            super(2, dVar);
            this.$paywall = paywall;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return PaywallMessageHandler.this.new C27201(this.$paywall, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                PaywallMessageHandler paywallMessageHandler = PaywallMessageHandler.this;
                Paywall paywall = this.$paywall;
                this.label = 1;
                if (paywallMessageHandler.passTemplatesToWebView(paywall, this) == objL) {
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
            return ((C27201) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler$handle$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler$handle$2", f = "PaywallMessageHandler.kt", i = {}, l = {androidx.media2.widget.f.i.f59767c0}, m = "invokeSuspend", n = {}, s = {})
    static final class C27212 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Date $loadedAt;
        final /* synthetic */ Paywall $paywall;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27212(Paywall paywall, Date date, kotlin.coroutines.d<? super C27212> dVar) {
            super(2, dVar);
            this.$paywall = paywall;
            this.$loadedAt = date;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return PaywallMessageHandler.this.new C27212(this.$paywall, this.$loadedAt, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                PaywallMessageHandler paywallMessageHandler = PaywallMessageHandler.this;
                Paywall paywall = this.$paywall;
                Date date = this.$loadedAt;
                this.label = 1;
                if (paywallMessageHandler.didLoadWebView(paywall, date, this) == objL) {
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
            return ((C27212) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler$handle$3, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler$handle$3", f = "PaywallMessageHandler.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
    static final class C27223 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Paywall $paywall;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27223(Paywall paywall, kotlin.coroutines.d<? super C27223> dVar) {
            super(2, dVar);
            this.$paywall = paywall;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return PaywallMessageHandler.this.new C27223(this.$paywall, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                PaywallMessageHandler paywallMessageHandler = PaywallMessageHandler.this;
                String rawName = SuperwallEvents.PaywallOpen.getRawName();
                Paywall paywall = this.$paywall;
                this.label = 1;
                if (paywallMessageHandler.pass(rawName, paywall, this) == objL) {
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
            return ((C27223) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler$handle$4, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler$handle$4", f = "PaywallMessageHandler.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass4 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Paywall $paywall;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Paywall paywall, kotlin.coroutines.d<? super AnonymousClass4> dVar) {
            super(2, dVar);
            this.$paywall = paywall;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return PaywallMessageHandler.this.new AnonymousClass4(this.$paywall, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                String rawName = SuperwallEvents.PaywallClose.getRawName();
                PaywallMessageHandler paywallMessageHandler = PaywallMessageHandler.this;
                Paywall paywall = this.$paywall;
                this.label = 1;
                if (paywallMessageHandler.pass(rawName, paywall, this) == objL) {
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
            return ((AnonymousClass4) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler$handle$5, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler$handle$5", f = "PaywallMessageHandler.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass5 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ Paywall $paywall;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(Paywall paywall, kotlin.coroutines.d<? super AnonymousClass5> dVar) {
            super(2, dVar);
            this.$paywall = paywall;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return PaywallMessageHandler.this.new AnonymousClass5(this.$paywall, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                PaywallMessageHandler paywallMessageHandler = PaywallMessageHandler.this;
                String rawName = SuperwallEvents.RestoreFail.getRawName();
                Paywall paywall = this.$paywall;
                this.label = 1;
                if (paywallMessageHandler.pass(rawName, paywall, this) == objL) {
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
            return ((AnonymousClass5) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler$passMessageToWebView$2, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler$passMessageToWebView$2", f = "PaywallMessageHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C27232 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ String $templateScript;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C27232(String str, kotlin.coroutines.d<? super C27232> dVar) {
            super(2, dVar);
            this.$templateScript = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(String str, String str2) {
            if (str2 != null) {
                Logger.INSTANCE.debug(LogLevel.error, LogScope.paywallView, "Error Evaluating JS", MapsKt.mapOf(TuplesKt.to("message", str)), new Exception(str2));
            }
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return PaywallMessageHandler.this.new C27232(this.$templateScript, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            WebView webView;
            kotlin.coroutines.intrinsics.b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            PaywallMessageHandlerDelegate delegate = PaywallMessageHandler.this.getDelegate();
            if (delegate == null || (webView = delegate.getWebView()) == null) {
                return null;
            }
            final String str = this.$templateScript;
            webView.evaluateJavascript(str, new ValueCallback() { // from class: com.superwall.sdk.paywall.view.webview.messaging.c
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj2) {
                    PaywallMessageHandler.C27232.invokeSuspend$lambda$0(str, (String) obj2);
                }
            });
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C27232) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler$passTemplatesToWebView$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler", f = "PaywallMessageHandler.kt", i = {0}, l = {214, 220}, m = "passTemplatesToWebView", n = {"this"}, s = {"L$0"})
    static final class C27241 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C27241(kotlin.coroutines.d<? super C27241> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaywallMessageHandler.this.passTemplatesToWebView(null, this);
        }
    }

    public PaywallMessageHandler(@NotNull SessionEventsManager sessionEventsManager, @NotNull VariablesFactory factory, @NotNull MainScope mainScope, @NotNull s0 ioScope, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(sessionEventsManager, "sessionEventsManager");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(mainScope, "mainScope");
        Intrinsics.checkNotNullParameter(ioScope, "ioScope");
        Intrinsics.checkNotNullParameter(json, "json");
        this.sessionEventsManager = sessionEventsManager;
        this.factory = factory;
        this.mainScope = mainScope;
        this.ioScope = ioScope;
        this.json = json;
        this.queue = new LinkedList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setEncodeDefaults(true);
        return Unit.f312394a;
    }

    private final void detectHiddenPaywallEvent(String str, Map<String, ? extends Object> map) {
        PaywallMessageHandlerDelegate paywallMessageHandlerDelegate = this.delegate;
        if (Intrinsics.areEqual(paywallMessageHandlerDelegate != null ? Boolean.valueOf(paywallMessageHandlerDelegate.isActive()) : null, Boolean.TRUE)) {
            return;
        }
        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("self", this), TuplesKt.to("Superwall.instance.paywallViewController", String.valueOf(Superwall.Companion.getInstance().getPaywallView())), TuplesKt.to(w.I0, str));
        if (map != null) {
            mapMutableMapOf.putAll(map);
        }
        Logger.debug$default(Logger.INSTANCE, LogLevel.error, LogScope.paywallView, "Received Event on Hidden Superwall", mapMutableMapOf, null, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void detectHiddenPaywallEvent$default(PaywallMessageHandler paywallMessageHandler, String str, Map map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = null;
        }
        paywallMessageHandler.detectHiddenPaywallEvent(str, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public final Object didLoadWebView(Paywall paywall, Date date, kotlin.coroutines.d<? super Unit> dVar) {
        AnonymousClass1 anonymousClass1;
        String htmlSubstitutions;
        Object objA;
        PresentationRequest request;
        PresentationInfo presentationInfo;
        PaywallMessageHandler paywallMessageHandler = this;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = paywallMessageHandler.new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = paywallMessageHandler.new AnonymousClass1(dVar);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object obj = anonymousClass2.result;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = anonymousClass2.label;
        if (i11 == 0) {
            ResultKt.m(obj);
            k.f(paywallMessageHandler.ioScope, null, null, paywallMessageHandler.new AnonymousClass2(date, null), 3, null);
            Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.superwallCore, "!! PaywallMessageHandler: didLoadWebView", null, null, 24, null);
            htmlSubstitutions = paywall.getHtmlSubstitutions();
            PaywallMessageHandlerDelegate paywallMessageHandlerDelegate = paywallMessageHandler.delegate;
            EventData eventData = (paywallMessageHandlerDelegate == null || (request = paywallMessageHandlerDelegate.getRequest()) == null || (presentationInfo = request.getPresentationInfo()) == null) ? null : presentationInfo.getEventData();
            defpackage.a aVar = defpackage.a.f392a;
            VariablesFactory variablesFactory = paywallMessageHandler.factory;
            Json json = paywallMessageHandler.json;
            anonymousClass2.L$0 = paywallMessageHandler;
            anonymousClass2.L$1 = htmlSubstitutions;
            anonymousClass2.label = 1;
            objA = aVar.a(json, paywall, eventData, variablesFactory, anonymousClass2);
            if (objA == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) anonymousClass2.L$1;
            PaywallMessageHandler paywallMessageHandler2 = (PaywallMessageHandler) anonymousClass2.L$0;
            ResultKt.m(obj);
            objA = obj;
            htmlSubstitutions = str;
            paywallMessageHandler = paywallMessageHandler2;
        }
        String str2 = "\n      window.paywall.accept64('" + ((String) objA) + "');\n      window.paywall.accept64('" + htmlSubstitutions + "');\n    ";
        Logger logger = Logger.INSTANCE;
        LogLevel logLevel = LogLevel.debug;
        Logger.debug$default(logger, logLevel, LogScope.superwallCore, "!! PaywallMessageHandler: " + str2, null, null, 24, null);
        Logger.debug$default(logger, logLevel, LogScope.paywallView, "Posting Message", MapsKt.mapOf(TuplesKt.to("message", str2)), null, 16, null);
        k.f(paywallMessageHandler.mainScope, null, null, paywallMessageHandler.new AnonymousClass3(str2, null), 3, null);
        return Unit.f312394a;
    }

    private final void handleCustomEvent(String str) {
        detectHiddenPaywallEvent(h.L, MapsKt.mapOf(TuplesKt.to("custom_event", str)));
        PaywallMessageHandlerDelegate paywallMessageHandlerDelegate = this.delegate;
        if (paywallMessageHandlerDelegate != null) {
            paywallMessageHandlerDelegate.eventDidOccur(new PaywallWebEvent.Custom(str));
        }
    }

    private final void handleCustomPlacement(String str, JSONObject jSONObject) {
        PaywallMessageHandlerDelegate paywallMessageHandlerDelegate = this.delegate;
        if (paywallMessageHandlerDelegate != null) {
            paywallMessageHandlerDelegate.eventDidOccur(new PaywallWebEvent.CustomPlacement(str, jSONObject));
        }
    }

    private final void hapticFeedback() {
        Superwall.Companion companion = Superwall.Companion;
        companion.getInstance().getOptions().getPaywalls().isHapticFeedbackEnabled();
        companion.getInstance().getOptions().isGameControllerEnabled();
    }

    private final void openDeepLink(Uri uri) {
        detectHiddenPaywallEvent("openDeepLink", MapsKt.mapOf(TuplesKt.to("url", uri)));
        hapticFeedback();
        PaywallMessageHandlerDelegate paywallMessageHandlerDelegate = this.delegate;
        if (paywallMessageHandlerDelegate != null) {
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            paywallMessageHandlerDelegate.openDeepLink(string);
        }
    }

    private final void openUrl(URI uri) {
        detectHiddenPaywallEvent("openUrl", MapsKt.mapOf(TuplesKt.to("url", uri.toString())));
        hapticFeedback();
        PaywallMessageHandlerDelegate paywallMessageHandlerDelegate = this.delegate;
        if (paywallMessageHandlerDelegate != null) {
            paywallMessageHandlerDelegate.eventDidOccur(new PaywallWebEvent.OpenedURL(uri));
        }
        PaywallMessageHandlerDelegate paywallMessageHandlerDelegate2 = this.delegate;
        if (paywallMessageHandlerDelegate2 != null) {
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            paywallMessageHandlerDelegate2.presentBrowserInApp(string);
        }
    }

    private final void openUrlInBrowser(URI uri) {
        detectHiddenPaywallEvent("openUrlInSafari", MapsKt.mapOf(TuplesKt.to("url", uri)));
        hapticFeedback();
        PaywallMessageHandlerDelegate paywallMessageHandlerDelegate = this.delegate;
        if (paywallMessageHandlerDelegate != null) {
            paywallMessageHandlerDelegate.eventDidOccur(new PaywallWebEvent.OpenedUrlInChrome(uri));
        }
        PaywallMessageHandlerDelegate paywallMessageHandlerDelegate2 = this.delegate;
        if (paywallMessageHandlerDelegate2 != null) {
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            paywallMessageHandlerDelegate2.presentBrowserExternal(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object pass(String str, Paywall paywall, kotlin.coroutines.d<? super Unit> dVar) {
        List listListOf = CollectionsKt.listOf(MapsKt.mapOf(TuplesKt.to("event_name", str), TuplesKt.to("paywall_id", paywall.getDatabaseId()), TuplesKt.to("paywall_identifier", paywall.getIdentifier())));
        Json json = this.json;
        json.getSerializersModule();
        b3 b3Var = b3.f315897a;
        String strEncodeToString = json.encodeToString(new kotlinx.serialization.internal.f(new e1(b3Var, b3Var)), listListOf);
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = strEncodeToString.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String strEncodeToString2 = Base64.encodeToString(bytes, 2);
        Intrinsics.checkNotNull(strEncodeToString2);
        Object objPassMessageToWebView = passMessageToWebView(strEncodeToString2, dVar);
        return objPassMessageToWebView == kotlin.coroutines.intrinsics.b.l() ? objPassMessageToWebView : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object passMessageToWebView(String str, kotlin.coroutines.d<? super Unit> dVar) {
        String str2 = "\n      window.paywall.accept64('" + str + "');\n    ";
        Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.paywallView, "Posting Message", MapsKt.mapOf(TuplesKt.to("message", str2)), null, 16, null);
        return i.h(l1.e(), new C27232(str2, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (r10.passMessageToWebView((java.lang.String) r12, r6) == r0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object passTemplatesToWebView(com.superwall.sdk.models.paywall.Paywall r11, kotlin.coroutines.d<? super kotlin.Unit> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler.C27241
            if (r0 == 0) goto L15
            r0 = r12
            com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler$passTemplatesToWebView$1 r0 = (com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler.C27241) r0
            r9 = 3
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L15
            int r1 = r1 - r2
            r0.label = r1
        L13:
            r6 = r0
            goto L1d
        L15:
            r9 = 3
            com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler$passTemplatesToWebView$1 r0 = new com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler$passTemplatesToWebView$1
            r9 = 1
            r0.<init>(r12)
            goto L13
        L1d:
            r9 = 2
            java.lang.Object r12 = r6.result
            r9 = 7
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.label
            r9 = 5
            r7 = 0
            r9 = 2
            r8 = 2
            r9 = 6
            r2 = 1
            if (r1 == 0) goto L4d
            if (r1 == r2) goto L42
            if (r1 != r8) goto L37
            kotlin.ResultKt.m(r12)
            goto L91
        L37:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r9 = 7
            java.lang.String r11 = "oewa  uve/tbunci/l lm/rouo tcfnh/o/ke/ire oirs e/t/"
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L42:
            java.lang.Object r10 = r6.L$0
            r9 = 4
            com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler r10 = (com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler) r10
            r9 = 6
            kotlin.ResultKt.m(r12)
            r9 = 1
            goto L84
        L4d:
            kotlin.ResultKt.m(r12)
            com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandlerDelegate r12 = r10.delegate
            r9 = 5
            if (r12 == 0) goto L6b
            r9 = 4
            com.superwall.sdk.paywall.presentation.internal.PresentationRequest r12 = r12.getRequest()
            if (r12 == 0) goto L6b
            com.superwall.sdk.paywall.presentation.internal.request.PresentationInfo r12 = r12.getPresentationInfo()
            r9 = 1
            if (r12 == 0) goto L6b
            com.superwall.sdk.models.events.EventData r12 = r12.getEventData()
            r4 = r12
            r4 = r12
            r9 = 5
            goto L6c
        L6b:
            r4 = r7
        L6c:
            a r1 = defpackage.a.f392a
            com.superwall.sdk.dependencies.VariablesFactory r5 = r10.factory
            r9 = 5
            r12 = r2
            kotlinx.serialization.json.Json r2 = r10.json
            r9 = 3
            r6.L$0 = r10
            r9 = 4
            r6.label = r12
            r3 = r11
            r3 = r11
            java.lang.Object r12 = r1.a(r2, r3, r4, r5, r6)
            r9 = 0
            if (r12 != r0) goto L84
            goto L90
        L84:
            java.lang.String r12 = (java.lang.String) r12
            r6.L$0 = r7
            r6.label = r8
            java.lang.Object r10 = r10.passMessageToWebView(r12, r6)
            if (r10 != r0) goto L91
        L90:
            return r0
        L91:
            kotlin.Unit r10 = kotlin.Unit.f312394a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superwall.sdk.paywall.view.webview.messaging.PaywallMessageHandler.passTemplatesToWebView(com.superwall.sdk.models.paywall.Paywall, kotlin.coroutines.d):java.lang.Object");
    }

    private final void purchaseProduct(String str) {
        detectHiddenPaywallEvent$default(this, FirebaseAnalytics.c.D, null, 2, null);
        hapticFeedback();
        PaywallMessageHandlerDelegate paywallMessageHandlerDelegate = this.delegate;
        if (paywallMessageHandlerDelegate != null) {
            paywallMessageHandlerDelegate.eventDidOccur(new PaywallWebEvent.InitiatePurchase(str));
        }
    }

    private final void restorePurchases() {
        detectHiddenPaywallEvent$default(this, "restore", null, 2, null);
        hapticFeedback();
        PaywallMessageHandlerDelegate paywallMessageHandlerDelegate = this.delegate;
        if (paywallMessageHandlerDelegate != null) {
            paywallMessageHandlerDelegate.eventDidOccur(PaywallWebEvent.InitiateRestore.INSTANCE);
        }
    }

    @Nullable
    public final PaywallMessageHandlerDelegate getDelegate() {
        return this.delegate;
    }

    public final void handle(@NotNull PaywallMessage message) {
        Paywall paywall;
        Paywall paywall2;
        Paywall paywall3;
        Paywall paywall4;
        Intrinsics.checkNotNullParameter(message, "message");
        Logger logger = Logger.INSTANCE;
        LogLevel logLevel = LogLevel.debug;
        LogScope logScope = LogScope.superwallCore;
        PaywallMessageHandlerDelegate paywallMessageHandlerDelegate = this.delegate;
        Paywall paywall5 = paywallMessageHandlerDelegate != null ? paywallMessageHandlerDelegate.getPaywall() : null;
        Logger.debug$default(logger, logLevel, logScope, "!! PaywallMessageHandler: Handling message: " + message + " " + paywall5 + ", delegeate: " + this.delegate, null, null, 24, null);
        PaywallMessageHandlerDelegate paywallMessageHandlerDelegate2 = this.delegate;
        if (paywallMessageHandlerDelegate2 == null || (paywall = paywallMessageHandlerDelegate2.getPaywall()) == null) {
            return;
        }
        Logger.debug$default(logger, logLevel, logScope, "!! PaywallMessageHandler: Paywall: " + paywall + ", delegeate: " + this.delegate, null, null, 24, null);
        if (message instanceof PaywallMessage.TemplateParamsAndUserAttributes) {
            k.f(this.ioScope, null, null, new C27201(paywall, null), 3, null);
            return;
        }
        if (message instanceof PaywallMessage.OnReady) {
            PaywallMessageHandlerDelegate paywallMessageHandlerDelegate3 = this.delegate;
            if (paywallMessageHandlerDelegate3 != null && (paywall4 = paywallMessageHandlerDelegate3.getPaywall()) != null) {
                paywall4.setPaywalljsVersion(((PaywallMessage.OnReady) message).getPaywallJsVersion());
            }
            Date date = new Date();
            Logger.debug$default(logger, logLevel, logScope, "!! PaywallMessageHandler: Ready !!", null, null, 24, null);
            k.f(this.ioScope, null, null, new C27212(paywall, date, null), 3, null);
            return;
        }
        if (message instanceof PaywallMessage.Close) {
            hapticFeedback();
            PaywallMessageHandlerDelegate paywallMessageHandlerDelegate4 = this.delegate;
            if (paywallMessageHandlerDelegate4 != null) {
                paywallMessageHandlerDelegate4.eventDidOccur(PaywallWebEvent.Closed.INSTANCE);
                return;
            }
            return;
        }
        if (message instanceof PaywallMessage.OpenUrl) {
            openUrl(((PaywallMessage.OpenUrl) message).getUrl());
            return;
        }
        if (message instanceof PaywallMessage.OpenUrlInBrowser) {
            openUrlInBrowser(((PaywallMessage.OpenUrlInBrowser) message).getUrl());
            return;
        }
        if (message instanceof PaywallMessage.OpenDeepLink) {
            Uri uri = Uri.parse(((PaywallMessage.OpenDeepLink) message).getUrl().toString());
            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
            openDeepLink(uri);
            return;
        }
        if (message instanceof PaywallMessage.Restore) {
            restorePurchases();
            return;
        }
        if (message instanceof PaywallMessage.Purchase) {
            purchaseProduct(((PaywallMessage.Purchase) message).getProductId());
            return;
        }
        if (message instanceof PaywallMessage.PaywallOpen) {
            PaywallMessageHandlerDelegate paywallMessageHandlerDelegate5 = this.delegate;
            if (((paywallMessageHandlerDelegate5 == null || (paywall3 = paywallMessageHandlerDelegate5.getPaywall()) == null) ? null : paywall3.getPaywalljsVersion()) == null) {
                this.queue.offer(message);
                return;
            } else {
                k.f(this.ioScope, null, null, new C27223(paywall, null), 3, null);
                return;
            }
        }
        if (message instanceof PaywallMessage.PaywallClose) {
            PaywallMessageHandlerDelegate paywallMessageHandlerDelegate6 = this.delegate;
            if (((paywallMessageHandlerDelegate6 == null || (paywall2 = paywallMessageHandlerDelegate6.getPaywall()) == null) ? null : paywall2.getPaywalljsVersion()) == null) {
                this.queue.offer(message);
                return;
            } else {
                k.f(this.ioScope, null, null, new AnonymousClass4(paywall, null), 3, null);
                return;
            }
        }
        if (message instanceof PaywallMessage.Custom) {
            handleCustomEvent(((PaywallMessage.Custom) message).getData());
            return;
        }
        if (message instanceof PaywallMessage.CustomPlacement) {
            PaywallMessage.CustomPlacement customPlacement = (PaywallMessage.CustomPlacement) message;
            handleCustomPlacement(customPlacement.getName(), customPlacement.getParams());
        } else {
            if (message instanceof PaywallMessage.RestoreFailed) {
                k.f(this.ioScope, null, null, new AnonymousClass5(paywall, null), 3, null);
                return;
            }
            Logger.debug$default(logger, LogLevel.error, logScope, "!! PaywallMessageHandler: Unknown message type: " + message, null, null, 24, null);
        }
    }

    @JavascriptInterface
    public final void postMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.superwallCore, "SWWebViewInterface: " + message, null, null, 24, null);
        try {
            for (PaywallMessage paywallMessage : PaywallMessageKt.parseWrappedPaywallMessages(message).getPayload().getMessages()) {
                Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.superwallCore, "SWWebViewInterface: " + paywallMessage.getClass().getSimpleName(), null, null, 24, null);
                handle(paywallMessage);
            }
        } catch (Throwable th2) {
            Logger.debug$default(Logger.INSTANCE, LogLevel.debug, LogScope.superwallCore, "SWWebViewInterface: Error parsing message - " + th2, null, null, 24, null);
        }
    }

    public final void setDelegate(@Nullable PaywallMessageHandlerDelegate paywallMessageHandlerDelegate) {
        this.delegate = paywallMessageHandlerDelegate;
    }

    public /* synthetic */ PaywallMessageHandler(SessionEventsManager sessionEventsManager, VariablesFactory variablesFactory, MainScope mainScope, s0 s0Var, Json json, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(sessionEventsManager, variablesFactory, mainScope, s0Var, (i10 & 16) != 0 ? JsonKt.Json$default(null, new Function1() { // from class: com.superwall.sdk.paywall.view.webview.messaging.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaywallMessageHandler._init_$lambda$0((JsonBuilder) obj);
            }
        }, 1, null) : json);
    }
}
