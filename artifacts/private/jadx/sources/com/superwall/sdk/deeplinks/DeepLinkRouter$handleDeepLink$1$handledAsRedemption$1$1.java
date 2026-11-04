package com.superwall.sdk.deeplinks;

import com.superwall.sdk.web.WebPaywallRedeemer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.deeplinks.DeepLinkRouter$handleDeepLink$1$handledAsRedemption$1$1", f = "DeepLinkRouter.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.I0}, m = "invokeSuspend", n = {}, s = {})
final class DeepLinkRouter$handleDeepLink$1$handledAsRedemption$1$1 extends o implements Function2<s0, d<? super Unit>, Object> {
    final /* synthetic */ String $it;
    int label;
    final /* synthetic */ DeepLinkRouter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeepLinkRouter$handleDeepLink$1$handledAsRedemption$1$1(DeepLinkRouter deepLinkRouter, String str, d<? super DeepLinkRouter$handleDeepLink$1$handledAsRedemption$1$1> dVar) {
        super(2, dVar);
        this.this$0 = deepLinkRouter;
        this.$it = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new DeepLinkRouter$handleDeepLink$1$handledAsRedemption$1$1(this.this$0, this.$it, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            WebPaywallRedeemer redeemer = this.this$0.getRedeemer();
            WebPaywallRedeemer.RedeemType.Code code = new WebPaywallRedeemer.RedeemType.Code(this.$it);
            this.label = 1;
            if (redeemer.redeem(code, this) == objL) {
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
        return ((DeepLinkRouter$handleDeepLink$1$handledAsRedemption$1$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
