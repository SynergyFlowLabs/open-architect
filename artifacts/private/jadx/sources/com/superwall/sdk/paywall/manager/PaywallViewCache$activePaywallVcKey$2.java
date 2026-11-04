package com.superwall.sdk.paywall.manager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.paywall.manager.PaywallViewCache$activePaywallVcKey$2", f = "PaywallViewCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class PaywallViewCache$activePaywallVcKey$2 extends o implements Function2<s0, d<? super Unit>, Object> {
    final /* synthetic */ String $value;
    int label;
    final /* synthetic */ PaywallViewCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallViewCache$activePaywallVcKey$2(PaywallViewCache paywallViewCache, String str, d<? super PaywallViewCache$activePaywallVcKey$2> dVar) {
        super(2, dVar);
        this.this$0 = paywallViewCache;
        this.$value = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PaywallViewCache$activePaywallVcKey$2(this.this$0, this.$value, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        this.this$0._activePaywallVcKey = this.$value;
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
        return ((PaywallViewCache$activePaywallVcKey$2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
