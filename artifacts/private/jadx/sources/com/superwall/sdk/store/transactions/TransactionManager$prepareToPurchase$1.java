package com.superwall.sdk.store.transactions;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.store.transactions.TransactionManager", f = "TransactionManager.kt", i = {0, 0}, l = {486, 531}, m = "prepareToPurchase$superwall_release", n = {"this", "source"}, s = {"L$0", "L$1"})
final class TransactionManager$prepareToPurchase$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TransactionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransactionManager$prepareToPurchase$1(TransactionManager transactionManager, kotlin.coroutines.d<? super TransactionManager$prepareToPurchase$1> dVar) {
        super(dVar);
        this.this$0 = transactionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.prepareToPurchase$superwall_release(null, null, this);
    }
}
