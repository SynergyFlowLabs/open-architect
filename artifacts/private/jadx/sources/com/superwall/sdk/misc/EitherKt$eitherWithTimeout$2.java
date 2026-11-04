package com.superwall.sdk.misc;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.s0;

/* JADX INFO: Add missing generic type declarations: [T, E] */
/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.misc.EitherKt$eitherWithTimeout$2", f = "Either.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
final class EitherKt$eitherWithTimeout$2<E, T> extends o implements Function2<s0, kotlin.coroutines.d<? super Either<? extends T, E>>, Object> {
    final /* synthetic */ Function1<kotlin.coroutines.d<? super Either<? extends T, E>>, Object> $run;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    EitherKt$eitherWithTimeout$2(Function1<? super kotlin.coroutines.d<? super Either<? extends T, E>>, ? extends Object> function1, kotlin.coroutines.d<? super EitherKt$eitherWithTimeout$2> dVar) {
        super(2, dVar);
        this.$run = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new EitherKt$eitherWithTimeout$2(this.$run, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return obj;
        }
        ResultKt.m(obj);
        Function1<kotlin.coroutines.d<? super Either<? extends T, E>>, Object> function1 = this.$run;
        this.label = 1;
        Object objInvoke = function1.invoke(this);
        return objInvoke == objL ? objL : objInvoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Either<? extends T, E>> dVar) {
        return ((EitherKt$eitherWithTimeout$2) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
