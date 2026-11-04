package com.superwall.sdk.debug;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.superwall.sdk.debug.DebugManager$handle$2$1", f = "DebugManager.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
final class DebugManager$handle$2$1 extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ DebugManager.DeepLinkOutcome $it;
    int label;
    final /* synthetic */ DebugManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugManager$handle$2$1(DebugManager debugManager, DebugManager.DeepLinkOutcome deepLinkOutcome, kotlin.coroutines.d<? super DebugManager$handle$2$1> dVar) {
        super(2, dVar);
        this.this$0 = debugManager;
        this.$it = deepLinkOutcome;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new DebugManager$handle$2$1(this.this$0, this.$it, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        boolean z10 = true & true;
        if (i10 == 0) {
            ResultKt.m(obj);
            DebugManager debugManager = this.this$0;
            String paywallId = this.$it.getPaywallId();
            this.label = 1;
            if (debugManager.launchDebugger(paywallId, this) == objL) {
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
        return ((DebugManager$handle$2$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
