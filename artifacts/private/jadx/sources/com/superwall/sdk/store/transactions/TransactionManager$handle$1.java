package com.superwall.sdk.store.transactions;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.store.transactions.TransactionManager", f = "TransactionManager.kt", i = {0, 0, 0, 1, 1, 2, 2, 3, 3}, l = {186, 199, 223, 235}, m = "handle$superwall_release", n = {"this", FirebaseAnalytics.c.D, "destination$iv$iv", "this", "lastProduct", "this", "destination$iv$iv", "this", "destination$iv$iv"}, s = {"L$0", "L$2", "L$3", "L$0", "L$1", "L$0", "L$2", "L$0", "L$2"})
final class TransactionManager$handle$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TransactionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransactionManager$handle$1(TransactionManager transactionManager, kotlin.coroutines.d<? super TransactionManager$handle$1> dVar) {
        super(dVar);
        this.this$0 = transactionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.handle$superwall_release(null, null, this);
    }
}
