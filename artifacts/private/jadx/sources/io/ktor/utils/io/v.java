package io.ktor.utils.io;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements kotlinx.io.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p f297164a;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteWriteChannelSink$close$1", f = "ByteWriteChannelSink.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f297165a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return v.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f297165a;
            if (i10 == 0) {
                ResultKt.m(obj);
                k.b0(v.this.f297164a);
                p pVar = v.this.f297164a;
                this.f297165a = 1;
                if (pVar.g(this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteWriteChannelSink$flush$1", f = "ByteWriteChannelSink.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f297167a;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return v.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f297167a;
            if (i10 == 0) {
                ResultKt.m(obj);
                k.b0(v.this.f297164a);
                p pVar = v.this.f297164a;
                this.f297167a = 1;
                if (pVar.d(this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteWriteChannelSink$write$1", f = "ByteWriteChannelSink.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f297169a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return v.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws InterruptedException {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f297169a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            v.this.flush();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public v(@NotNull p origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f297164a = origin;
    }

    @Override // kotlinx.io.o
    public void V5(@NotNull kotlinx.io.b source, long j10) throws Throwable {
        Intrinsics.checkNotNullParameter(source, "source");
        k.b0(this.f297164a);
        this.f297164a.i().V5(source, j10);
        p pVar = this.f297164a;
        io.ktor.utils.io.b bVar = pVar instanceof io.ktor.utils.io.b ? (io.ktor.utils.io.b) pVar : null;
        if ((bVar != null && bVar.n()) || ui.j.f(this.f297164a.i()) >= 1048576) {
            kotlinx.coroutines.j.b(null, new c(null), 1, null);
        }
    }

    @Override // kotlinx.io.o, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        kotlinx.coroutines.j.b(null, new a(null), 1, null);
    }

    @Override // kotlinx.io.o, java.io.Flushable
    public void flush() throws InterruptedException {
        kotlinx.coroutines.j.b(null, new b(null), 1, null);
    }
}
