package com.superwall.sdk.paywall.view.webview;

import com.superwall.sdk.models.paywall.PaywallWebviewUrl;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.paywall.view.webview.WebviewFallbackClient$loadWithFallback$3", f = "WebviewFallbackClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class WebviewFallbackClient$loadWithFallback$3 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ PaywallWebviewUrl $url;
    int label;
    final /* synthetic */ WebviewFallbackClient this$0;

    /* JADX INFO: renamed from: com.superwall.sdk.paywall.view.webview.WebviewFallbackClient$loadWithFallback$3$1, reason: invalid class name */
    @f(c = "com.superwall.sdk.paywall.view.webview.WebviewFallbackClient$loadWithFallback$3$1", f = "WebviewFallbackClient.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nWebviewFallbackClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebviewFallbackClient.kt\ncom/superwall/sdk/paywall/view/webview/WebviewFallbackClient$loadWithFallback$3$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,232:1\n230#2,5:233\n*S KotlinDebug\n*F\n+ 1 WebviewFallbackClient.kt\ncom/superwall/sdk/paywall/view/webview/WebviewFallbackClient$loadWithFallback$3$1\n*L\n216#1:233,5\n*E\n"})
    static final class AnonymousClass1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;
        final /* synthetic */ WebviewFallbackClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(WebviewFallbackClient webviewFallbackClient, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = webviewFallbackClient;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                k0 k0Var = this.this$0.timeoutFlow;
                WebviewFallbackClient$loadWithFallback$3$1$nextEvent$1 webviewFallbackClient$loadWithFallback$3$1$nextEvent$1 = new WebviewFallbackClient$loadWithFallback$3$1$nextEvent$1(null);
                this.label = 1;
                obj = k.x0(k0Var, webviewFallbackClient$loadWithFallback$3$1$nextEvent$1, this);
                if (obj == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            if (((WebviewFallbackClient.UrlState) obj) instanceof WebviewFallbackClient.UrlState.Timeout) {
                this.this$0.loadWithFallback$superwall_release();
            } else {
                k0 k0Var2 = this.this$0.timeoutFlow;
                do {
                    value = k0Var2.getValue();
                } while (!k0Var2.compareAndSet(value, WebviewFallbackClient.UrlState.None.INSTANCE));
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebviewFallbackClient$loadWithFallback$3(WebviewFallbackClient webviewFallbackClient, PaywallWebviewUrl paywallWebviewUrl, kotlin.coroutines.d<? super WebviewFallbackClient$loadWithFallback$3> dVar) {
        super(2, dVar);
        this.this$0 = webviewFallbackClient;
        this.$url = paywallWebviewUrl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new WebviewFallbackClient$loadWithFallback$3(this.this$0, this.$url, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        this.this$0.loadUrl.invoke(this.$url);
        kotlinx.coroutines.k.f(this.this$0.ioScope, null, null, new AnonymousClass1(this.this$0, null), 3, null);
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((WebviewFallbackClient$loadWithFallback$3) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
