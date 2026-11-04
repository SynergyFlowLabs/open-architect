package com.superwall.sdk.misc;

import com.superwall.sdk.network.NetworkError;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.k0;
import kotlinx.coroutines.s0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes13.dex */
@f(c = "com.superwall.sdk.misc.Task_RetryingKt$retrying$2$1", f = "Task+Retrying.kt", i = {}, l = {20}, m = "invokeSuspend", n = {}, s = {})
final class Task_RetryingKt$retrying$2$1<T> extends o implements Function2<s0, kotlin.coroutines.d<? super Either.Success<T, NetworkError>>, Object> {
    final /* synthetic */ Function1<kotlin.coroutines.d<? super Either<? extends T, NetworkError>>, Object> $operation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Task_RetryingKt$retrying$2$1(Function1<? super kotlin.coroutines.d<? super Either<? extends T, NetworkError>>, ? extends Object> function1, kotlin.coroutines.d<? super Task_RetryingKt$retrying$2$1> dVar) {
        super(2, dVar);
        this.$operation = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new Task_RetryingKt$retrying$2$1(this.$operation, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.m(obj);
            Function1<kotlin.coroutines.d<? super Either<? extends T, NetworkError>>, Object> function1 = this.$operation;
            this.label = 1;
            obj = function1.invoke(this);
            if (obj == objL) {
                return objL;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        Either either = (Either) obj;
        if (either instanceof Either.Success) {
            return either;
        }
        if (either instanceof Either.Failure) {
            throw ((Either.Failure) either).getError();
        }
        throw new k0();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Either.Success<T, NetworkError>> dVar) {
        return ((Task_RetryingKt$retrying$2$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
