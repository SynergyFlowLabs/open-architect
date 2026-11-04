package com.superwall.sdk.paywall.view.webview.messaging;

import com.superwall.sdk.paywall.view.webview.PaywallMessage;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.paywall.view.webview.messaging.RawWebMessageHandler$postMessage$1$1", f = "RawWebMessageHandler.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160729t0}, m = "invokeSuspend", n = {}, s = {})
final class RawWebMessageHandler$postMessage$1$1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ PaywallMessage $m;
    int label;
    final /* synthetic */ RawWebMessageHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RawWebMessageHandler$postMessage$1$1(RawWebMessageHandler rawWebMessageHandler, PaywallMessage paywallMessage, kotlin.coroutines.d<? super RawWebMessageHandler$postMessage$1$1> dVar) {
        super(2, dVar);
        this.this$0 = rawWebMessageHandler;
        this.$m = paywallMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new RawWebMessageHandler$postMessage$1$1(this.this$0, this.$m, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            WebEventDelegate webEventDelegate = this.this$0.delegate;
            PaywallMessage paywallMessage = this.$m;
            this.label = 1;
            if (webEventDelegate.handle(paywallMessage, this) == objL) {
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
        return ((RawWebMessageHandler$postMessage$1$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
