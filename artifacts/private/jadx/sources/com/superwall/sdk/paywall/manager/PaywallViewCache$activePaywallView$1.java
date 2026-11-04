package com.superwall.sdk.paywall.manager;

import com.superwall.sdk.paywall.view.PaywallView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.paywall.manager.PaywallViewCache$activePaywallView$1", f = "PaywallViewCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nPaywallViewCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaywallViewCache.kt\ncom/superwall/sdk/paywall/manager/PaywallViewCache$activePaywallView$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
final class PaywallViewCache$activePaywallView$1 extends o implements Function2<s0, d<? super PaywallView>, Object> {
    int label;
    final /* synthetic */ PaywallViewCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallViewCache$activePaywallView$1(PaywallViewCache paywallViewCache, d<? super PaywallViewCache$activePaywallView$1> dVar) {
        super(2, dVar);
        this.this$0 = paywallViewCache;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PaywallViewCache$activePaywallView$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        String str = this.this$0._activePaywallVcKey;
        if (str != null) {
            return (PaywallView) this.this$0.store.retrieveView(str);
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, d<? super PaywallView> dVar) {
        return ((PaywallViewCache$activePaywallView$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
