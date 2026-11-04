package com.superwall.sdk.store;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.store.AutomaticPurchaseController$startConnection$1$onBillingServiceDisconnected$1", f = "AutomaticPurchaseController.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
final class AutomaticPurchaseController$startConnection$1$onBillingServiceDisconnected$1 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
    int label;
    final /* synthetic */ AutomaticPurchaseController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutomaticPurchaseController$startConnection$1$onBillingServiceDisconnected$1(AutomaticPurchaseController automaticPurchaseController, kotlin.coroutines.d<? super AutomaticPurchaseController$startConnection$1$onBillingServiceDisconnected$1> dVar) {
        super(2, dVar);
        this.this$0 = automaticPurchaseController;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new AutomaticPurchaseController$startConnection$1$onBillingServiceDisconnected$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            long j10 = this.this$0.reconnectMilliseconds;
            this.label = 1;
            if (d1.b(j10, this) == objL) {
                return objL;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        this.this$0.startConnection();
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((AutomaticPurchaseController$startConnection$1$onBillingServiceDisconnected$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
