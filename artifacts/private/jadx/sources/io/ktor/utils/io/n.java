package io.ktor.utils.io;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements kotlinx.io.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h f297119a;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.ByteReadChannelSource$readAtMostTo$1", f = "ByteReadChannelSource.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f297120a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return n.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f297120a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            h hVar = n.this.f297119a;
            this.f297120a = 1;
            Object objA = h.b.a(hVar, 0, this, 1, null);
            return objA == objL ? objL : objA;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public n(@NotNull h origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f297119a = origin;
    }

    @Override // kotlinx.io.p, java.lang.AutoCloseable
    public void close() {
        i.a(this.f297119a);
    }

    @Override // kotlinx.io.p
    public long hd(@NotNull kotlinx.io.b sink, long j10) throws InterruptedException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f297119a.j().y1()) {
            kotlinx.coroutines.j.b(null, new a(null), 1, null);
        }
        if (this.f297119a.j().y1()) {
            return -1L;
        }
        return this.f297119a.j().hd(sink, j10);
    }
}
