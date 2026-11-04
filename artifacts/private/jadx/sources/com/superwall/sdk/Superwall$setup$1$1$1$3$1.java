package com.superwall.sdk;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.Superwall$setup$1$1$1$3$1", f = "Superwall.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class Superwall$setup$1$1$1$3$1 extends o implements Function2<s0, d<? super Unit>, Object> {
    final /* synthetic */ Throwable $it;
    int label;
    final /* synthetic */ Superwall this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Superwall$setup$1$1$1$3$1(Superwall superwall, Throwable th2, d<? super Superwall$setup$1$1$1$3$1> dVar) {
        super(2, dVar);
        this.this$0 = superwall;
        this.$it = th2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new Superwall$setup$1$1$1$3$1(this.this$0, this.$it, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        Function1 function1 = this.this$0.completion;
        if (function1 != null) {
            Result.a aVar = Result.Companion;
            function1.invoke(Result.a(Result.m785constructorimpl(ResultKt.createFailure(this.$it))));
        }
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, d<? super Unit> dVar) {
        return ((Superwall$setup$1$1$1$3$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
