package com.superwall.sdk.paywall.view.webview;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.paywall.view.webview.WebviewFallbackClient$loadWithFallback$3$1$nextEvent$1", f = "WebviewFallbackClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class WebviewFallbackClient$loadWithFallback$3$1$nextEvent$1 extends o implements Function2<WebviewFallbackClient.UrlState, kotlin.coroutines.d<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    WebviewFallbackClient$loadWithFallback$3$1$nextEvent$1(kotlin.coroutines.d<? super WebviewFallbackClient$loadWithFallback$3$1$nextEvent$1> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        WebviewFallbackClient$loadWithFallback$3$1$nextEvent$1 webviewFallbackClient$loadWithFallback$3$1$nextEvent$1 = new WebviewFallbackClient$loadWithFallback$3$1$nextEvent$1(dVar);
        webviewFallbackClient$loadWithFallback$3$1$nextEvent$1.L$0 = obj;
        return webviewFallbackClient$loadWithFallback$3$1$nextEvent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WebviewFallbackClient.UrlState urlState, kotlin.coroutines.d<? super Boolean> dVar) {
        return ((WebviewFallbackClient$loadWithFallback$3$1$nextEvent$1) create(urlState, dVar)).invokeSuspend(Unit.f312394a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        WebviewFallbackClient.UrlState urlState = (WebviewFallbackClient.UrlState) this.L$0;
        return kotlin.coroutines.jvm.internal.b.a((urlState instanceof WebviewFallbackClient.UrlState.PageStarted) || (urlState instanceof WebviewFallbackClient.UrlState.Timeout) || (urlState instanceof WebviewFallbackClient.UrlState.PageError));
    }
}
