package io.ktor.client.plugins.observer;

import io.ktor.utils.io.r0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@r0
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private Function2<? super io.ktor.client.statement.c, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> f294935a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Function1<? super io.ktor.client.call.b, Boolean> f294936b;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.observer.ResponseObserverConfig$responseHandler$1", f = "ResponseObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends o implements Function2<io.ktor.client.statement.c, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f294937a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f294937a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.client.statement.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public final void a(@NotNull Function1<? super io.ktor.client.call.b, Boolean> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f294936b = block;
    }

    @Nullable
    public final Function1<io.ktor.client.call.b, Boolean> b() {
        return this.f294936b;
    }

    @NotNull
    public final Function2<io.ktor.client.statement.c, kotlin.coroutines.d<? super Unit>, Object> c() {
        return this.f294935a;
    }

    public final void d(@NotNull Function2<? super io.ktor.client.statement.c, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f294935a = block;
    }

    public final void e(@Nullable Function1<? super io.ktor.client.call.b, Boolean> function1) {
        this.f294936b = function1;
    }

    public final void f(@NotNull Function2<? super io.ktor.client.statement.c, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.f294935a = function2;
    }
}
