package io.ktor.utils.io;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class i0 implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final p f296886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f296887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f296888d;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.CountedByteWriteChannel", f = "CountedByteWriteChannel.kt", i = {}, l = {32}, m = "flush", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f296889a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f296891c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296889a = obj;
            this.f296891c |= Integer.MIN_VALUE;
            return i0.this.d(this);
        }
    }

    public i0(@NotNull p delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f296886b = delegate;
        this.f296887c = ui.j.f(delegate.i());
    }

    private static /* synthetic */ void b() {
    }

    public static /* synthetic */ void j() {
    }

    @o0
    public static /* synthetic */ void k() {
    }

    @Override // io.ktor.utils.io.p
    public void c(@Nullable Throwable th2) {
        this.f296886b.c(th2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // io.ktor.utils.io.p
    @Nullable
    public Object d(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f296891c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f296891c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f296889a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f296891c;
        if (i11 == 0) {
            ResultKt.m(obj);
            this.f296888d += ui.j.f(i());
            p pVar = this.f296886b;
            aVar.f296891c = 1;
            if (pVar.d(aVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        this.f296887c = ui.j.f(i());
        return Unit.f312394a;
    }

    @Override // io.ktor.utils.io.p
    @Nullable
    public Throwable e() {
        return this.f296886b.e();
    }

    public final long f() {
        return (this.f296888d + ui.j.f(i())) - this.f296887c;
    }

    @Override // io.ktor.utils.io.p
    @Nullable
    public Object g(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = this.f296886b.g(dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    @Override // io.ktor.utils.io.p
    public boolean h() {
        return this.f296886b.h();
    }

    @Override // io.ktor.utils.io.p
    @NotNull
    public kotlinx.io.x i() {
        return this.f296886b.i();
    }
}
