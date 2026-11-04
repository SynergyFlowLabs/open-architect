package com.superwall.sdk.paywall.view.webview;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.paywall.view.webview.WebviewFallbackClient$loadWithFallback$1", f = "WebviewFallbackClient.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
final class WebviewFallbackClient$loadWithFallback$1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    int label;
    final /* synthetic */ WebviewFallbackClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebviewFallbackClient$loadWithFallback$1(WebviewFallbackClient webviewFallbackClient, kotlin.coroutines.d<? super WebviewFallbackClient$loadWithFallback$1> dVar) {
        super(2, dVar);
        this.this$0 = webviewFallbackClient;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new WebviewFallbackClient$loadWithFallback$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            j0<WebviewClientEvent> webviewClientEvents = this.this$0.getWebviewClientEvents();
            WebviewClientEvent.OnError onError = new WebviewClientEvent.OnError(WebviewError.NoUrls.INSTANCE);
            this.label = 1;
            if (webviewClientEvents.emit(onError, this) == objL) {
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
        return ((WebviewFallbackClient$loadWithFallback$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
