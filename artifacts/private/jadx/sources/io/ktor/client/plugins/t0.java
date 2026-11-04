package io.ktor.client.plugins;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@io.ktor.utils.io.r0
@SourceDebugExtension({"SMAP\nHttpRequestRetry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpRequestRetry.kt\nio/ktor/client/plugins/HttpRequestRetryConfig\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,484:1\n1#2:485\n*E\n"})
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pj.n<? super b1, ? super fi.w, ? super io.ktor.client.statement.c, Boolean> f295119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public pj.n<? super b1, ? super fi.y, ? super Throwable, Boolean> f295120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function2<? super y0, ? super Integer, Long> f295121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Function2<? super Long, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> f295122d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private Function2<? super a1, ? super fi.y, Unit> f295123e = new Function2() { // from class: io.ktor.client.plugins.o0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return t0.B((a1) obj, (fi.y) obj2);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f295124f;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.plugins.HttpRequestRetryConfig$delay$1", f = "HttpRequestRetry.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<Long, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f295125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ long f295126b;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f295126b = ((Number) obj).longValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Long l10, kotlin.coroutines.d<? super Unit> dVar) {
            return k(l10.longValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f295125a;
            if (i10 == 0) {
                ResultKt.m(obj);
                long j10 = this.f295126b;
                this.f295125a = 1;
                if (kotlinx.coroutines.d1.b(j10, this) == objL) {
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

        public final Object k(long j10, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(Long.valueOf(j10), dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public t0() {
        N(3);
        q(this, 0.0d, 0L, 0L, 0L, false, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(a1 a1Var, fi.y it) {
        Intrinsics.checkNotNullParameter(a1Var, "<this>");
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D(b1 b1Var, fi.w wVar, io.ktor.client.statement.c cVar) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        Intrinsics.checkNotNullParameter(wVar, "<unused var>");
        Intrinsics.checkNotNullParameter(cVar, "<unused var>");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E(b1 b1Var, fi.y yVar, Throwable th2) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        Intrinsics.checkNotNullParameter(yVar, "<unused var>");
        Intrinsics.checkNotNullParameter(th2, "<unused var>");
        return false;
    }

    private final long F(long j10) {
        if (j10 == 0) {
            return 0L;
        }
        return kotlin.random.f.f312895a.p(j10);
    }

    public static /* synthetic */ void H(t0 t0Var, int i10, pj.n nVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        t0Var.G(i10, nVar);
    }

    public static /* synthetic */ void J(t0 t0Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        t0Var.I(i10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean K(boolean z10, b1 retryOnExceptionIf, fi.y yVar, Throwable cause) {
        Intrinsics.checkNotNullParameter(retryOnExceptionIf, "$this$retryOnExceptionIf");
        Intrinsics.checkNotNullParameter(yVar, "<unused var>");
        Intrinsics.checkNotNullParameter(cause, "cause");
        if (w0.v(cause)) {
            return z10;
        }
        return !(cause instanceof CancellationException);
    }

    public static /* synthetic */ void M(t0 t0Var, int i10, pj.n nVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        t0Var.L(i10, nVar);
    }

    public static /* synthetic */ void O(t0 t0Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        t0Var.N(i10);
    }

    public static /* synthetic */ void Q(t0 t0Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        t0Var.P(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean R(b1 retryIf, fi.w wVar, io.ktor.client.statement.c response) {
        Intrinsics.checkNotNullParameter(retryIf, "$this$retryIf");
        Intrinsics.checkNotNullParameter(wVar, "<unused var>");
        Intrinsics.checkNotNullParameter(response, "response");
        int iH0 = response.j().H0();
        return 500 <= iH0 && iH0 < 600;
    }

    public static /* synthetic */ void j(t0 t0Var, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 1000;
        }
        if ((i10 & 2) != 0) {
            j11 = 1000;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        t0Var.i(j10, j11, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(long j10, t0 t0Var, long j11, y0 delayMillis, int i10) {
        Intrinsics.checkNotNullParameter(delayMillis, "$this$delayMillis");
        return j10 + t0Var.F(j11);
    }

    public static /* synthetic */ void n(t0 t0Var, boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        t0Var.m(z10, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long o(boolean z10, Function2 function2, y0 y0Var, int i10) {
        io.ktor.http.v0 v0VarO;
        String str;
        Long lC1;
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        if (!z10) {
            return ((Number) function2.invoke(y0Var, Integer.valueOf(i10))).longValue();
        }
        io.ktor.client.statement.c cVarC = y0Var.c();
        Long lValueOf = (cVarC == null || (v0VarO = cVarC.O()) == null || (str = v0VarO.get(io.ktor.http.d1.f295782a.r0())) == null || (lC1 = StringsKt.c1(str)) == null) ? null : Long.valueOf(lC1.longValue() * ((long) 1000));
        return Math.max(((Number) function2.invoke(y0Var, Integer.valueOf(i10))).longValue(), lValueOf != null ? lValueOf.longValue() : 0L);
    }

    public static /* synthetic */ void q(t0 t0Var, double d10, long j10, long j11, long j12, boolean z10, int i10, Object obj) {
        t0Var.p((i10 & 1) != 0 ? 2.0d : d10, (i10 & 2) != 0 ? 1000L : j10, (i10 & 4) != 0 ? 60000L : j11, (i10 & 8) == 0 ? j12 : 1000L, (i10 & 16) != 0 ? true : z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long r(double d10, long j10, long j11, t0 t0Var, long j12, y0 delayMillis, int i10) {
        Intrinsics.checkNotNullParameter(delayMillis, "$this$delayMillis");
        return Math.min((long) (Math.pow(d10, i10 - 1) * j10), j11) + t0Var.F(j12);
    }

    public final void A(@NotNull Function2<? super a1, ? super fi.y, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f295123e = block;
    }

    public final void C() {
        this.f295124f = 0;
        V(new pj.n() { // from class: io.ktor.client.plugins.m0
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(t0.D((b1) obj, (fi.w) obj2, (io.ktor.client.statement.c) obj3));
            }
        });
        W(new pj.n() { // from class: io.ktor.client.plugins.n0
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(t0.E((b1) obj, (fi.y) obj2, (Throwable) obj3));
            }
        });
    }

    public final void G(int i10, @NotNull pj.n<? super b1, ? super fi.w, ? super io.ktor.client.statement.c, Boolean> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (i10 != -1) {
            this.f295124f = i10;
        }
        V(block);
    }

    public final void I(int i10, final boolean z10) {
        L(i10, new pj.n() { // from class: io.ktor.client.plugins.l0
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(t0.K(z10, (b1) obj, (fi.y) obj2, (Throwable) obj3));
            }
        });
    }

    public final void L(int i10, @NotNull pj.n<? super b1, ? super fi.y, ? super Throwable, Boolean> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (i10 != -1) {
            this.f295124f = i10;
        }
        W(block);
    }

    public final void N(int i10) {
        P(i10);
        J(this, i10, false, 2, null);
    }

    public final void P(int i10) {
        G(i10, new pj.n() { // from class: io.ktor.client.plugins.s0
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(t0.R((b1) obj, (fi.w) obj2, (io.ktor.client.statement.c) obj3));
            }
        });
    }

    public final void S(@NotNull Function2<? super Long, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.f295122d = function2;
    }

    public final void T(@NotNull Function2<? super y0, ? super Integer, Long> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.f295121c = function2;
    }

    public final void U(int i10) {
        this.f295124f = i10;
    }

    public final void V(@NotNull pj.n<? super b1, ? super fi.w, ? super io.ktor.client.statement.c, Boolean> nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<set-?>");
        this.f295119a = nVar;
    }

    public final void W(@NotNull pj.n<? super b1, ? super fi.y, ? super Throwable, Boolean> nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<set-?>");
        this.f295120b = nVar;
    }

    public final void i(final long j10, final long j11, boolean z10) {
        if (j10 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (j11 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        m(z10, new Function2() { // from class: io.ktor.client.plugins.p0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Long.valueOf(t0.k(j10, this, j11, (y0) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    public final void l(@NotNull Function2<? super Long, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f295122d = block;
    }

    public final void m(final boolean z10, @NotNull final Function2<? super y0, ? super Integer, Long> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        T(new Function2() { // from class: io.ktor.client.plugins.q0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Long.valueOf(t0.o(z10, block, (y0) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    public final void p(final double d10, final long j10, final long j11, final long j12, boolean z10) {
        if (d10 <= 0.0d) {
            throw new IllegalStateException("Check failed.");
        }
        if (j10 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (j11 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (j12 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        m(z10, new Function2() { // from class: io.ktor.client.plugins.r0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Long.valueOf(t0.r(d10, j10, j11, this, j12, (y0) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @NotNull
    public final Function2<Long, kotlin.coroutines.d<? super Unit>, Object> s() {
        return this.f295122d;
    }

    @NotNull
    public final Function2<y0, Integer, Long> t() {
        Function2 function2 = this.f295121c;
        if (function2 != null) {
            return function2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("delayMillis");
        return null;
    }

    public final int u() {
        return this.f295124f;
    }

    @NotNull
    public final Function2<a1, fi.y, Unit> v() {
        return this.f295123e;
    }

    @Nullable
    public final pj.n<b1, fi.w, io.ktor.client.statement.c, Boolean> w() {
        if (this.f295119a != null) {
            return y();
        }
        return null;
    }

    @Nullable
    public final pj.n<b1, fi.y, Throwable, Boolean> x() {
        if (this.f295120b != null) {
            return z();
        }
        return null;
    }

    @NotNull
    public final pj.n<b1, fi.w, io.ktor.client.statement.c, Boolean> y() {
        pj.n nVar = this.f295119a;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shouldRetry");
        return null;
    }

    @NotNull
    public final pj.n<b1, fi.y, Throwable, Boolean> z() {
        pj.n nVar = this.f295120b;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shouldRetryOnException");
        return null;
    }
}
