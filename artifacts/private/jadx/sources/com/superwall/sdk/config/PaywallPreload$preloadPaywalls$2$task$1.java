package com.superwall.sdk.config;

import com.superwall.sdk.paywall.manager.PaywallManager;
import com.superwall.sdk.paywall.request.PaywallRequest;
import com.superwall.sdk.paywall.request.ResponseIdentifiers;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.config.PaywallPreload$preloadPaywalls$2$task$1", f = "PaywallPreload.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160742x1}, m = "invokeSuspend", n = {}, s = {})
final class PaywallPreload$preloadPaywalls$2$task$1 extends o implements Function2<s0, kotlin.coroutines.d<? super Object>, Object> {
    final /* synthetic */ String $identifier;
    int label;
    final /* synthetic */ PaywallPreload this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallPreload$preloadPaywalls$2$task$1(PaywallPreload paywallPreload, String str, kotlin.coroutines.d<? super PaywallPreload$preloadPaywalls$2$task$1> dVar) {
        super(2, dVar);
        this.this$0 = paywallPreload;
        this.$identifier = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new PaywallPreload$preloadPaywalls$2$task$1(this.this$0, this.$identifier, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, kotlin.coroutines.d<? super Object> dVar) {
        return invoke2(s0Var, (kotlin.coroutines.d<Object>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            PaywallRequest paywallRequestMakePaywallRequest = this.this$0.getFactory().makePaywallRequest(null, new ResponseIdentifiers(this.$identifier, null), null, false, null);
            PaywallManager paywallManager = this.this$0.getPaywallManager();
            this.label = 1;
            Object paywallView = paywallManager.getPaywallView(paywallRequestMakePaywallRequest, true, true, null, this);
            return paywallView == objL ? objL : paywallView;
        } catch (Exception unused) {
            return Unit.f312394a;
        }
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(s0 s0Var, kotlin.coroutines.d<Object> dVar) {
        return ((PaywallPreload$preloadPaywalls$2$task$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
