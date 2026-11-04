package com.superwall.sdk.store.transactions;

import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.store.transactions.TransactionManager$prepareToPurchase$2", f = "TransactionManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class TransactionManager$prepareToPurchase$2 extends o implements Function2<s0, d<? super Unit>, Object> {
    final /* synthetic */ TransactionManager.PurchaseSource $source;
    int label;
    final /* synthetic */ TransactionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransactionManager$prepareToPurchase$2(TransactionManager transactionManager, TransactionManager.PurchaseSource purchaseSource, d<? super TransactionManager$prepareToPurchase$2> dVar) {
        super(2, dVar);
        this.this$0 = transactionManager;
        this.$source = purchaseSource;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TransactionManager$prepareToPurchase$2(this.this$0, this.$source, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        int i10 = 4 << 0;
        TransactionManager.log$default(this.this$0, null, "Transaction Purchasing", MapsKt.mapOf(TuplesKt.to("paywall_vc", this.$source)), null, 9, null);
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
        return ((TransactionManager$prepareToPurchase$2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
