package com.superwall.sdk.store;

import com.superwall.sdk.delegate.PurchaseResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.store.AutomaticPurchaseController$purchase$value$1", f = "AutomaticPurchaseController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class AutomaticPurchaseController$purchase$value$1 extends o implements Function2<PurchaseResult, kotlin.coroutines.d<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    AutomaticPurchaseController$purchase$value$1(kotlin.coroutines.d<? super AutomaticPurchaseController$purchase$value$1> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        AutomaticPurchaseController$purchase$value$1 automaticPurchaseController$purchase$value$1 = new AutomaticPurchaseController$purchase$value$1(dVar);
        automaticPurchaseController$purchase$value$1.L$0 = obj;
        return automaticPurchaseController$purchase$value$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PurchaseResult purchaseResult, kotlin.coroutines.d<? super Boolean> dVar) {
        return ((AutomaticPurchaseController$purchase$value$1) create(purchaseResult, dVar)).invokeSuspend(Unit.f312394a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        return kotlin.coroutines.jvm.internal.b.a(((PurchaseResult) this.L$0) != null);
    }
}
