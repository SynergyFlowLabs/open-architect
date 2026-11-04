package io.reactivex;

import androidx.collection.g3;
import io.intercom.android.sdk.models.carousel.ActionType;
import io.ktor.http.t1;
import io.reactivex.internal.operators.flowable.k1;
import io.reactivex.internal.operators.flowable.n2;
import io.reactivex.internal.operators.observable.a1;
import io.reactivex.internal.operators.observable.a2;
import io.reactivex.internal.operators.observable.a4;
import io.reactivex.internal.operators.observable.b1;
import io.reactivex.internal.operators.observable.b2;
import io.reactivex.internal.operators.observable.b3;
import io.reactivex.internal.operators.observable.b4;
import io.reactivex.internal.operators.observable.c1;
import io.reactivex.internal.operators.observable.c2;
import io.reactivex.internal.operators.observable.c3;
import io.reactivex.internal.operators.observable.c4;
import io.reactivex.internal.operators.observable.d1;
import io.reactivex.internal.operators.observable.d2;
import io.reactivex.internal.operators.observable.d3;
import io.reactivex.internal.operators.observable.d4;
import io.reactivex.internal.operators.observable.e1;
import io.reactivex.internal.operators.observable.e2;
import io.reactivex.internal.operators.observable.e3;
import io.reactivex.internal.operators.observable.e4;
import io.reactivex.internal.operators.observable.f1;
import io.reactivex.internal.operators.observable.f2;
import io.reactivex.internal.operators.observable.f3;
import io.reactivex.internal.operators.observable.f4;
import io.reactivex.internal.operators.observable.g1;
import io.reactivex.internal.operators.observable.g2;
import io.reactivex.internal.operators.observable.g4;
import io.reactivex.internal.operators.observable.h1;
import io.reactivex.internal.operators.observable.h2;
import io.reactivex.internal.operators.observable.h3;
import io.reactivex.internal.operators.observable.h4;
import io.reactivex.internal.operators.observable.i1;
import io.reactivex.internal.operators.observable.i2;
import io.reactivex.internal.operators.observable.i3;
import io.reactivex.internal.operators.observable.i4;
import io.reactivex.internal.operators.observable.j1;
import io.reactivex.internal.operators.observable.j2;
import io.reactivex.internal.operators.observable.j3;
import io.reactivex.internal.operators.observable.j4;
import io.reactivex.internal.operators.observable.k2;
import io.reactivex.internal.operators.observable.k3;
import io.reactivex.internal.operators.observable.k4;
import io.reactivex.internal.operators.observable.l1;
import io.reactivex.internal.operators.observable.l2;
import io.reactivex.internal.operators.observable.l3;
import io.reactivex.internal.operators.observable.l4;
import io.reactivex.internal.operators.observable.m1;
import io.reactivex.internal.operators.observable.m2;
import io.reactivex.internal.operators.observable.m3;
import io.reactivex.internal.operators.observable.m4;
import io.reactivex.internal.operators.observable.n1;
import io.reactivex.internal.operators.observable.n3;
import io.reactivex.internal.operators.observable.o1;
import io.reactivex.internal.operators.observable.o2;
import io.reactivex.internal.operators.observable.o3;
import io.reactivex.internal.operators.observable.p1;
import io.reactivex.internal.operators.observable.p2;
import io.reactivex.internal.operators.observable.p3;
import io.reactivex.internal.operators.observable.q1;
import io.reactivex.internal.operators.observable.q2;
import io.reactivex.internal.operators.observable.q3;
import io.reactivex.internal.operators.observable.r1;
import io.reactivex.internal.operators.observable.r2;
import io.reactivex.internal.operators.observable.r3;
import io.reactivex.internal.operators.observable.s0;
import io.reactivex.internal.operators.observable.s1;
import io.reactivex.internal.operators.observable.s2;
import io.reactivex.internal.operators.observable.s3;
import io.reactivex.internal.operators.observable.t0;
import io.reactivex.internal.operators.observable.t2;
import io.reactivex.internal.operators.observable.t3;
import io.reactivex.internal.operators.observable.u0;
import io.reactivex.internal.operators.observable.u1;
import io.reactivex.internal.operators.observable.u2;
import io.reactivex.internal.operators.observable.u3;
import io.reactivex.internal.operators.observable.v0;
import io.reactivex.internal.operators.observable.v1;
import io.reactivex.internal.operators.observable.v2;
import io.reactivex.internal.operators.observable.v3;
import io.reactivex.internal.operators.observable.w0;
import io.reactivex.internal.operators.observable.w1;
import io.reactivex.internal.operators.observable.w2;
import io.reactivex.internal.operators.observable.w3;
import io.reactivex.internal.operators.observable.x1;
import io.reactivex.internal.operators.observable.x2;
import io.reactivex.internal.operators.observable.x3;
import io.reactivex.internal.operators.observable.y0;
import io.reactivex.internal.operators.observable.y1;
import io.reactivex.internal.operators.observable.y2;
import io.reactivex.internal.operators.observable.y3;
import io.reactivex.internal.operators.observable.z0;
import io.reactivex.internal.operators.observable.z1;
import io.reactivex.internal.operators.observable.z2;
import io.reactivex.internal.operators.observable.z3;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public abstract class b0<T> implements g0<T> {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f298657a;

        static {
            int[] iArr = new int[b.values().length];
            f298657a = iArr;
            try {
                iArr[b.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f298657a[b.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f298657a[b.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f298657a[b.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> A0(int i10, int i11, g0<? extends T>... g0VarArr) {
        return I2(g0VarArr).W0(io.reactivex.internal.functions.a.k(), i10, i11, false);
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> B0(g0<? extends T>... g0VarArr) {
        return A0(T(), T(), g0VarArr);
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> B3(g0<? extends g0<? extends T>> g0Var) {
        io.reactivex.internal.functions.b.g(g0Var, "sources is null");
        return io.reactivex.plugins.a.R(new w0(g0Var, io.reactivex.internal.functions.a.k(), false, Integer.MAX_VALUE, T()));
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> C0(int i10, int i11, g0<? extends T>... g0VarArr) {
        return I2(g0VarArr).W0(io.reactivex.internal.functions.a.k(), i10, i11, true);
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> C3(g0<? extends g0<? extends T>> g0Var, int i10) {
        io.reactivex.internal.functions.b.g(g0Var, "sources is null");
        io.reactivex.internal.functions.b.h(i10, "maxConcurrency");
        return io.reactivex.plugins.a.R(new w0(g0Var, io.reactivex.internal.functions.a.k(), false, i10, T()));
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> D0(g0<? extends T>... g0VarArr) {
        return C0(T(), T(), g0VarArr);
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> D3(g0<? extends T> g0Var, g0<? extends T> g0Var2) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        int i10 = 7 << 1;
        return I2(g0Var, g0Var2).u2(io.reactivex.internal.functions.a.k(), false, 2);
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> E0(g0<? extends g0<? extends T>> g0Var) {
        return F0(g0Var, T(), true);
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> E3(g0<? extends T> g0Var, g0<? extends T> g0Var2, g0<? extends T> g0Var3) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(g0Var3, "source3 is null");
        return I2(g0Var, g0Var2, g0Var3).u2(io.reactivex.internal.functions.a.k(), false, 3);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> F0(g0<? extends g0<? extends T>> g0Var, int i10, boolean z10) {
        io.reactivex.internal.functions.b.g(g0Var, "sources is null");
        io.reactivex.internal.functions.b.h(i10, "prefetch is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.v(g0Var, io.reactivex.internal.functions.a.k(), i10, z10 ? io.reactivex.internal.util.j.END : io.reactivex.internal.util.j.BOUNDARY));
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> F3(g0<? extends T> g0Var, g0<? extends T> g0Var2, g0<? extends T> g0Var3, g0<? extends T> g0Var4) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(g0Var3, "source3 is null");
        io.reactivex.internal.functions.b.g(g0Var4, "source4 is null");
        int i10 = 3 | 1;
        return I2(g0Var, g0Var2, g0Var3, g0Var4).u2(io.reactivex.internal.functions.a.k(), false, 4);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> G0(Iterable<? extends g0<? extends T>> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return E0(O2(iterable));
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> G3(Iterable<? extends g0<? extends T>> iterable) {
        return O2(iterable).k2(io.reactivex.internal.functions.a.k());
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> H0(g0<? extends g0<? extends T>> g0Var) {
        return I0(g0Var, T(), T());
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> H3(Iterable<? extends g0<? extends T>> iterable, int i10) {
        return O2(iterable).l2(io.reactivex.internal.functions.a.k(), i10);
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> I0(g0<? extends g0<? extends T>> g0Var, int i10, int i11) {
        return O7(g0Var).V0(io.reactivex.internal.functions.a.k(), i10, i11);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> I2(T... tArr) {
        io.reactivex.internal.functions.b.g(tArr, "items is null");
        if (tArr.length == 0) {
            return d2();
        }
        if (tArr.length != 1) {
            return io.reactivex.plugins.a.R(new c1(tArr));
        }
        int i10 = 7 ^ 0;
        return l3(tArr[0]);
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> I3(Iterable<? extends g0<? extends T>> iterable, int i10, int i11) {
        return O2(iterable).v2(io.reactivex.internal.functions.a.k(), false, i10, i11);
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> J0(Iterable<? extends g0<? extends T>> iterable) {
        return K0(iterable, T(), T());
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> J2(Callable<? extends T> callable) {
        io.reactivex.internal.functions.b.g(callable, "supplier is null");
        return io.reactivex.plugins.a.R(new d1(callable));
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> J3(int i10, int i11, g0<? extends T>... g0VarArr) {
        return I2(g0VarArr).v2(io.reactivex.internal.functions.a.k(), false, i10, i11);
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> K0(Iterable<? extends g0<? extends T>> iterable, int i10, int i11) {
        return O2(iterable).W0(io.reactivex.internal.functions.a.k(), i10, i11, false);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> K2(Future<? extends T> future) {
        io.reactivex.internal.functions.b.g(future, "future is null");
        return io.reactivex.plugins.a.R(new e1(future, 0L, null));
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> K3(g0<? extends T>... g0VarArr) {
        return I2(g0VarArr).l2(io.reactivex.internal.functions.a.k(), g0VarArr.length);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> L2(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        io.reactivex.internal.functions.b.g(future, "future is null");
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        return io.reactivex.plugins.a.R(new e1(future, j10, timeUnit));
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> L3(int i10, int i11, g0<? extends T>... g0VarArr) {
        return I2(g0VarArr).v2(io.reactivex.internal.functions.a.k(), true, i10, i11);
    }

    @cj.f
    @cj.d
    @cj.h(cj.h.L)
    public static <T> b0<T> M2(Future<? extends T> future, long j10, TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return L2(future, j10, timeUnit).I5(j0Var);
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> M3(g0<? extends T>... g0VarArr) {
        return I2(g0VarArr).u2(io.reactivex.internal.functions.a.k(), true, g0VarArr.length);
    }

    private b0<T> M6(long j10, TimeUnit timeUnit, g0<? extends T> g0Var, j0 j0Var) {
        io.reactivex.internal.functions.b.g(timeUnit, "timeUnit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new y3(this, j10, timeUnit, j0Var, g0Var));
    }

    @cj.f
    @cj.d
    @cj.h(cj.h.L)
    public static <T> b0<T> N2(Future<? extends T> future, j0 j0Var) {
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return K2(future).I5(j0Var);
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> N3(g0<? extends g0<? extends T>> g0Var) {
        io.reactivex.internal.functions.b.g(g0Var, "sources is null");
        return io.reactivex.plugins.a.R(new w0(g0Var, io.reactivex.internal.functions.a.k(), true, Integer.MAX_VALUE, T()));
    }

    private <U, V> b0<T> N6(g0<U> g0Var, dj.o<? super T, ? extends g0<V>> oVar, g0<? extends T> g0Var2) {
        io.reactivex.internal.functions.b.g(oVar, "itemTimeoutIndicator is null");
        return io.reactivex.plugins.a.R(new x3(this, g0Var, oVar, g0Var2));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> O2(Iterable<? extends T> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "source is null");
        return io.reactivex.plugins.a.R(new f1(iterable));
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> O3(g0<? extends g0<? extends T>> g0Var, int i10) {
        io.reactivex.internal.functions.b.g(g0Var, "sources is null");
        io.reactivex.internal.functions.b.h(i10, "maxConcurrency");
        return io.reactivex.plugins.a.R(new w0(g0Var, io.reactivex.internal.functions.a.k(), true, i10, T()));
    }

    @cj.d
    @cj.h(cj.h.M)
    public static b0<Long> O6(long j10, TimeUnit timeUnit) {
        return P6(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> O7(g0<T> g0Var) {
        io.reactivex.internal.functions.b.g(g0Var, "source is null");
        return g0Var instanceof b0 ? io.reactivex.plugins.a.R((b0) g0Var) : io.reactivex.plugins.a.R(new h1(g0Var));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> b0<T> P2(org.reactivestreams.u<? extends T> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "publisher is null");
        return io.reactivex.plugins.a.R(new g1(uVar));
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> P3(g0<? extends T> g0Var, g0<? extends T> g0Var2) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        return I2(g0Var, g0Var2).u2(io.reactivex.internal.functions.a.k(), true, 2);
    }

    @cj.d
    @cj.h(cj.h.L)
    public static b0<Long> P6(long j10, TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new z3(Math.max(j10, 0L), timeUnit, j0Var));
    }

    @cj.d
    @cj.h("none")
    public static <T, R> b0<R> P7(g0<? extends g0<? extends T>> g0Var, dj.o<? super Object[], ? extends R> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "zipper is null");
        io.reactivex.internal.functions.b.g(g0Var, "sources is null");
        return io.reactivex.plugins.a.R(new a4(g0Var, 16).k2(o1.n(oVar)));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> Q2(dj.g<k<T>> gVar) {
        io.reactivex.internal.functions.b.g(gVar, "generator is null");
        return U2(io.reactivex.internal.functions.a.u(), o1.m(gVar), io.reactivex.internal.functions.a.h());
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> Q3(g0<? extends T> g0Var, g0<? extends T> g0Var2, g0<? extends T> g0Var3) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(g0Var3, "source3 is null");
        int i10 = 0 ^ 2;
        return I2(g0Var, g0Var2, g0Var3).u2(io.reactivex.internal.functions.a.k(), true, 3);
    }

    @cj.d
    @cj.h("none")
    public static <T1, T2, R> b0<R> Q7(g0<? extends T1> g0Var, g0<? extends T2> g0Var2, dj.c<? super T1, ? super T2, ? extends R> cVar) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        return b8(io.reactivex.internal.functions.a.x(cVar), false, T(), g0Var, g0Var2);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T, S> b0<T> R2(Callable<S> callable, dj.b<S, k<T>> bVar) {
        io.reactivex.internal.functions.b.g(bVar, "generator is null");
        return U2(callable, o1.l(bVar), io.reactivex.internal.functions.a.h());
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> R3(g0<? extends T> g0Var, g0<? extends T> g0Var2, g0<? extends T> g0Var3, g0<? extends T> g0Var4) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(g0Var3, "source3 is null");
        io.reactivex.internal.functions.b.g(g0Var4, "source4 is null");
        return I2(g0Var, g0Var2, g0Var3, g0Var4).u2(io.reactivex.internal.functions.a.k(), true, 4);
    }

    @cj.d
    @cj.h("none")
    public static <T1, T2, R> b0<R> R7(g0<? extends T1> g0Var, g0<? extends T2> g0Var2, dj.c<? super T1, ? super T2, ? extends R> cVar, boolean z10) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        int i10 = 6 | 0;
        return b8(io.reactivex.internal.functions.a.x(cVar), z10, T(), g0Var, g0Var2);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T, S> b0<T> S2(Callable<S> callable, dj.b<S, k<T>> bVar, dj.g<? super S> gVar) {
        io.reactivex.internal.functions.b.g(bVar, "generator is null");
        return U2(callable, o1.l(bVar), gVar);
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> S3(Iterable<? extends g0<? extends T>> iterable) {
        return O2(iterable).t2(io.reactivex.internal.functions.a.k(), true);
    }

    @cj.d
    @cj.h("none")
    public static <T1, T2, R> b0<R> S7(g0<? extends T1> g0Var, g0<? extends T2> g0Var2, dj.c<? super T1, ? super T2, ? extends R> cVar, boolean z10, int i10) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        return b8(io.reactivex.internal.functions.a.x(cVar), z10, i10, g0Var, g0Var2);
    }

    public static int T() {
        return l.Y();
    }

    @cj.d
    @cj.h("none")
    private b0<T> T1(dj.g<? super T> gVar, dj.g<? super Throwable> gVar2, dj.a aVar, dj.a aVar2) {
        io.reactivex.internal.functions.b.g(gVar, "onNext is null");
        io.reactivex.internal.functions.b.g(gVar2, "onError is null");
        io.reactivex.internal.functions.b.g(aVar, "onComplete is null");
        io.reactivex.internal.functions.b.g(aVar2, "onAfterTerminate is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.o0(this, gVar, gVar2, aVar, aVar2));
    }

    @cj.d
    @cj.h("none")
    public static <T, S> b0<T> T2(Callable<S> callable, dj.c<S, k<T>, S> cVar) {
        return U2(callable, cVar, io.reactivex.internal.functions.a.h());
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> T3(Iterable<? extends g0<? extends T>> iterable, int i10) {
        return O2(iterable).u2(io.reactivex.internal.functions.a.k(), true, i10);
    }

    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, R> b0<R> T7(g0<? extends T1> g0Var, g0<? extends T2> g0Var2, g0<? extends T3> g0Var3, dj.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(g0Var3, "source3 is null");
        return b8(io.reactivex.internal.functions.a.y(hVar), false, T(), g0Var, g0Var2, g0Var3);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T, S> b0<T> U2(Callable<S> callable, dj.c<S, k<T>, S> cVar, dj.g<? super S> gVar) {
        io.reactivex.internal.functions.b.g(callable, "initialState is null");
        io.reactivex.internal.functions.b.g(cVar, "generator is null");
        io.reactivex.internal.functions.b.g(gVar, "disposeState is null");
        return io.reactivex.plugins.a.R(new i1(callable, cVar, gVar));
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> U3(Iterable<? extends g0<? extends T>> iterable, int i10, int i11) {
        return O2(iterable).v2(io.reactivex.internal.functions.a.k(), true, i10, i11);
    }

    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, T4, R> b0<R> U7(g0<? extends T1> g0Var, g0<? extends T2> g0Var2, g0<? extends T3> g0Var3, g0<? extends T4> g0Var4, dj.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(g0Var3, "source3 is null");
        io.reactivex.internal.functions.b.g(g0Var4, "source4 is null");
        return b8(io.reactivex.internal.functions.a.z(iVar), false, T(), g0Var, g0Var2, g0Var3, g0Var4);
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> V5(g0<? extends g0<? extends T>> g0Var) {
        return W5(g0Var, T());
    }

    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, T4, T5, R> b0<R> V7(g0<? extends T1> g0Var, g0<? extends T2> g0Var2, g0<? extends T3> g0Var3, g0<? extends T4> g0Var4, g0<? extends T5> g0Var5, dj.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(g0Var3, "source3 is null");
        io.reactivex.internal.functions.b.g(g0Var4, "source4 is null");
        io.reactivex.internal.functions.b.g(g0Var5, "source5 is null");
        return b8(io.reactivex.internal.functions.a.A(jVar), false, T(), g0Var, g0Var2, g0Var3, g0Var4, g0Var5);
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> W5(g0<? extends g0<? extends T>> g0Var, int i10) {
        io.reactivex.internal.functions.b.g(g0Var, "sources is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.R(new m3(g0Var, io.reactivex.internal.functions.a.k(), i10, false));
    }

    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, T4, T5, T6, R> b0<R> W7(g0<? extends T1> g0Var, g0<? extends T2> g0Var2, g0<? extends T3> g0Var3, g0<? extends T4> g0Var4, g0<? extends T5> g0Var5, g0<? extends T6> g0Var6, dj.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(g0Var3, "source3 is null");
        io.reactivex.internal.functions.b.g(g0Var4, "source4 is null");
        io.reactivex.internal.functions.b.g(g0Var5, "source5 is null");
        io.reactivex.internal.functions.b.g(g0Var6, "source6 is null");
        return b8(io.reactivex.internal.functions.a.B(kVar), false, T(), g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6);
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> X5(g0<? extends g0<? extends T>> g0Var) {
        return Y5(g0Var, T());
    }

    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, T4, T5, T6, T7, R> b0<R> X7(g0<? extends T1> g0Var, g0<? extends T2> g0Var2, g0<? extends T3> g0Var3, g0<? extends T4> g0Var4, g0<? extends T5> g0Var5, g0<? extends T6> g0Var6, g0<? extends T7> g0Var7, dj.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(g0Var3, "source3 is null");
        io.reactivex.internal.functions.b.g(g0Var4, "source4 is null");
        io.reactivex.internal.functions.b.g(g0Var5, "source5 is null");
        io.reactivex.internal.functions.b.g(g0Var6, "source6 is null");
        io.reactivex.internal.functions.b.g(g0Var7, "source7 is null");
        int i10 = 3 << 3;
        return b8(io.reactivex.internal.functions.a.C(lVar), false, T(), g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7);
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> Y5(g0<? extends g0<? extends T>> g0Var, int i10) {
        io.reactivex.internal.functions.b.g(g0Var, "sources is null");
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        return io.reactivex.plugins.a.R(new m3(g0Var, io.reactivex.internal.functions.a.k(), i10, true));
    }

    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> b0<R> Y7(g0<? extends T1> g0Var, g0<? extends T2> g0Var2, g0<? extends T3> g0Var3, g0<? extends T4> g0Var4, g0<? extends T5> g0Var5, g0<? extends T6> g0Var6, g0<? extends T7> g0Var7, g0<? extends T8> g0Var8, dj.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(g0Var3, "source3 is null");
        io.reactivex.internal.functions.b.g(g0Var4, "source4 is null");
        io.reactivex.internal.functions.b.g(g0Var5, "source5 is null");
        io.reactivex.internal.functions.b.g(g0Var6, "source6 is null");
        io.reactivex.internal.functions.b.g(g0Var7, "source7 is null");
        io.reactivex.internal.functions.b.g(g0Var8, "source8 is null");
        int i10 = 4 ^ 5;
        return b8(io.reactivex.internal.functions.a.D(mVar), false, T(), g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7, g0Var8);
    }

    @cj.d
    @cj.h("none")
    public static <T, R> b0<R> Z(dj.o<? super Object[], ? extends R> oVar, int i10, g0<? extends T>... g0VarArr) {
        return l0(g0VarArr, oVar, i10);
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> Z3() {
        return io.reactivex.plugins.a.R(c2.f301420a);
    }

    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> b0<R> Z7(g0<? extends T1> g0Var, g0<? extends T2> g0Var2, g0<? extends T3> g0Var3, g0<? extends T4> g0Var4, g0<? extends T5> g0Var5, g0<? extends T6> g0Var6, g0<? extends T7> g0Var7, g0<? extends T8> g0Var8, g0<? extends T9> g0Var9, dj.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(g0Var3, "source3 is null");
        io.reactivex.internal.functions.b.g(g0Var4, "source4 is null");
        io.reactivex.internal.functions.b.g(g0Var5, "source5 is null");
        io.reactivex.internal.functions.b.g(g0Var6, "source6 is null");
        io.reactivex.internal.functions.b.g(g0Var7, "source7 is null");
        io.reactivex.internal.functions.b.g(g0Var8, "source8 is null");
        io.reactivex.internal.functions.b.g(g0Var9, "source9 is null");
        return b8(io.reactivex.internal.functions.a.E(nVar), false, T(), g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7, g0Var8, g0Var9);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T1, T2, R> b0<R> a0(g0<? extends T1> g0Var, g0<? extends T2> g0Var2, dj.c<? super T1, ? super T2, ? extends R> cVar) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        return Z(io.reactivex.internal.functions.a.x(cVar), T(), g0Var, g0Var2);
    }

    @cj.d
    @cj.h("none")
    public static <T, R> b0<R> a8(Iterable<? extends g0<? extends T>> iterable, dj.o<? super Object[], ? extends R> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "zipper is null");
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return io.reactivex.plugins.a.R(new l4(null, iterable, oVar, T(), false));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, R> b0<R> b0(g0<? extends T1> g0Var, g0<? extends T2> g0Var2, g0<? extends T3> g0Var3, dj.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(g0Var3, "source3 is null");
        return Z(io.reactivex.internal.functions.a.y(hVar), T(), g0Var, g0Var2, g0Var3);
    }

    @cj.d
    @cj.h("none")
    public static <T, R> b0<R> b8(dj.o<? super Object[], ? extends R> oVar, boolean z10, int i10, g0<? extends T>... g0VarArr) {
        if (g0VarArr.length == 0) {
            return d2();
        }
        io.reactivex.internal.functions.b.g(oVar, "zipper is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.R(new l4(g0VarArr, null, oVar, i10, z10));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, T4, R> b0<R> c0(g0<? extends T1> g0Var, g0<? extends T2> g0Var2, g0<? extends T3> g0Var3, g0<? extends T4> g0Var4, dj.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(g0Var3, "source3 is null");
        io.reactivex.internal.functions.b.g(g0Var4, "source4 is null");
        return Z(io.reactivex.internal.functions.a.z(iVar), T(), g0Var, g0Var2, g0Var3, g0Var4);
    }

    @cj.d
    @cj.h("none")
    public static <T> k0<Boolean> c5(g0<? extends T> g0Var, g0<? extends T> g0Var2) {
        return f5(g0Var, g0Var2, io.reactivex.internal.functions.b.d(), T());
    }

    @cj.d
    @cj.h("none")
    public static <T, R> b0<R> c8(Iterable<? extends g0<? extends T>> iterable, dj.o<? super Object[], ? extends R> oVar, boolean z10, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "zipper is null");
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.R(new l4(null, iterable, oVar, i10, z10));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, T4, T5, R> b0<R> d0(g0<? extends T1> g0Var, g0<? extends T2> g0Var2, g0<? extends T3> g0Var3, g0<? extends T4> g0Var4, g0<? extends T5> g0Var5, dj.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(g0Var3, "source3 is null");
        io.reactivex.internal.functions.b.g(g0Var4, "source4 is null");
        io.reactivex.internal.functions.b.g(g0Var5, "source5 is null");
        return Z(io.reactivex.internal.functions.a.A(jVar), T(), g0Var, g0Var2, g0Var3, g0Var4, g0Var5);
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> d2() {
        return io.reactivex.plugins.a.R(t0.f302346a);
    }

    @cj.d
    @cj.h(cj.h.M)
    public static b0<Long> d3(long j10, long j11, TimeUnit timeUnit) {
        return e3(j10, j11, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.d
    @cj.h("none")
    public static <T> k0<Boolean> d5(g0<? extends T> g0Var, g0<? extends T> g0Var2, int i10) {
        return f5(g0Var, g0Var2, io.reactivex.internal.functions.b.d(), i10);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> e(Iterable<? extends g0<? extends T>> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.h(null, iterable));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, T4, T5, T6, R> b0<R> e0(g0<? extends T1> g0Var, g0<? extends T2> g0Var2, g0<? extends T3> g0Var3, g0<? extends T4> g0Var4, g0<? extends T5> g0Var5, g0<? extends T6> g0Var6, dj.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(g0Var3, "source3 is null");
        io.reactivex.internal.functions.b.g(g0Var4, "source4 is null");
        io.reactivex.internal.functions.b.g(g0Var5, "source5 is null");
        io.reactivex.internal.functions.b.g(g0Var6, "source6 is null");
        return Z(io.reactivex.internal.functions.a.B(kVar), T(), g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> e2(Throwable th2) {
        io.reactivex.internal.functions.b.g(th2, "exception is null");
        return f2(io.reactivex.internal.functions.a.m(th2));
    }

    @cj.f
    @cj.d
    @cj.h(cj.h.L)
    public static b0<Long> e3(long j10, long j11, TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new p1(Math.max(0L, j10), Math.max(0L, j11), timeUnit, j0Var));
    }

    @cj.d
    @cj.h("none")
    public static <T> k0<Boolean> e5(g0<? extends T> g0Var, g0<? extends T> g0Var2, dj.d<? super T, ? super T> dVar) {
        return f5(g0Var, g0Var2, dVar, T());
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> f(g0<? extends T>... g0VarArr) {
        io.reactivex.internal.functions.b.g(g0VarArr, "sources is null");
        int length = g0VarArr.length;
        if (length == 0) {
            return d2();
        }
        return length == 1 ? O7(g0VarArr[0]) : io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.h(g0VarArr, null));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, T4, T5, T6, T7, R> b0<R> f0(g0<? extends T1> g0Var, g0<? extends T2> g0Var2, g0<? extends T3> g0Var3, g0<? extends T4> g0Var4, g0<? extends T5> g0Var5, g0<? extends T6> g0Var6, g0<? extends T7> g0Var7, dj.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(g0Var3, "source3 is null");
        io.reactivex.internal.functions.b.g(g0Var4, "source4 is null");
        io.reactivex.internal.functions.b.g(g0Var5, "source5 is null");
        io.reactivex.internal.functions.b.g(g0Var6, "source6 is null");
        io.reactivex.internal.functions.b.g(g0Var7, "source7 is null");
        return Z(io.reactivex.internal.functions.a.C(lVar), T(), g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> f2(Callable<? extends Throwable> callable) {
        io.reactivex.internal.functions.b.g(callable, "errorSupplier is null");
        return io.reactivex.plugins.a.R(new u0(callable));
    }

    @cj.d
    @cj.h(cj.h.M)
    public static b0<Long> f3(long j10, TimeUnit timeUnit) {
        return e3(j10, j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.d
    @cj.h("none")
    public static <T> k0<Boolean> f5(g0<? extends T> g0Var, g0<? extends T> g0Var2, dj.d<? super T, ? super T> dVar, int i10) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(dVar, "isEqual is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.S(new b3(g0Var, g0Var2, dVar, i10));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> b0<R> g0(g0<? extends T1> g0Var, g0<? extends T2> g0Var2, g0<? extends T3> g0Var3, g0<? extends T4> g0Var4, g0<? extends T5> g0Var5, g0<? extends T6> g0Var6, g0<? extends T7> g0Var7, g0<? extends T8> g0Var8, dj.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(g0Var3, "source3 is null");
        io.reactivex.internal.functions.b.g(g0Var4, "source4 is null");
        io.reactivex.internal.functions.b.g(g0Var5, "source5 is null");
        io.reactivex.internal.functions.b.g(g0Var6, "source6 is null");
        io.reactivex.internal.functions.b.g(g0Var7, "source7 is null");
        io.reactivex.internal.functions.b.g(g0Var8, "source8 is null");
        return Z(io.reactivex.internal.functions.a.D(mVar), T(), g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7, g0Var8);
    }

    @cj.d
    @cj.h(cj.h.L)
    public static b0<Long> g3(long j10, TimeUnit timeUnit, j0 j0Var) {
        return e3(j10, j10, timeUnit, j0Var);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> b0<R> h0(g0<? extends T1> g0Var, g0<? extends T2> g0Var2, g0<? extends T3> g0Var3, g0<? extends T4> g0Var4, g0<? extends T5> g0Var5, g0<? extends T6> g0Var6, g0<? extends T7> g0Var7, g0<? extends T8> g0Var8, g0<? extends T9> g0Var9, dj.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(g0Var3, "source3 is null");
        io.reactivex.internal.functions.b.g(g0Var4, "source4 is null");
        io.reactivex.internal.functions.b.g(g0Var5, "source5 is null");
        io.reactivex.internal.functions.b.g(g0Var6, "source6 is null");
        io.reactivex.internal.functions.b.g(g0Var7, "source7 is null");
        io.reactivex.internal.functions.b.g(g0Var8, "source8 is null");
        io.reactivex.internal.functions.b.g(g0Var9, "source9 is null");
        int i10 = 7 & 0;
        return Z(io.reactivex.internal.functions.a.E(nVar), T(), g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7, g0Var8, g0Var9);
    }

    @cj.d
    @cj.h(cj.h.M)
    public static b0<Long> h3(long j10, long j11, long j12, long j13, TimeUnit timeUnit) {
        return i3(j10, j11, j12, j13, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.d
    @cj.h("none")
    public static <T, R> b0<R> i0(Iterable<? extends g0<? extends T>> iterable, dj.o<? super Object[], ? extends R> oVar) {
        return j0(iterable, oVar, T());
    }

    @cj.f
    @cj.d
    @cj.h(cj.h.L)
    public static b0<Long> i3(long j10, long j11, long j12, long j13, TimeUnit timeUnit, j0 j0Var) {
        if (j11 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j11);
        }
        if (j11 == 0) {
            return d2().x1(j12, timeUnit, j0Var);
        }
        long j14 = (j11 - 1) + j10;
        if (j10 > 0 && j14 < 0) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new q1(j10, j14, Math.max(0L, j12), Math.max(0L, j13), timeUnit, j0Var));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T, R> b0<R> j0(Iterable<? extends g0<? extends T>> iterable, dj.o<? super Object[], ? extends R> oVar, int i10) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        io.reactivex.internal.functions.b.g(oVar, "combiner is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.u(null, iterable, oVar, i10 << 1, false));
    }

    @cj.d
    @cj.h("none")
    public static <T, R> b0<R> k0(g0<? extends T>[] g0VarArr, dj.o<? super Object[], ? extends R> oVar) {
        return l0(g0VarArr, oVar, T());
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T, R> b0<R> l0(g0<? extends T>[] g0VarArr, dj.o<? super Object[], ? extends R> oVar, int i10) {
        io.reactivex.internal.functions.b.g(g0VarArr, "sources is null");
        if (g0VarArr.length == 0) {
            return d2();
        }
        io.reactivex.internal.functions.b.g(oVar, "combiner is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.u(g0VarArr, null, oVar, i10 << 1, false));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> l3(T t10) {
        io.reactivex.internal.functions.b.g(t10, "item is null");
        return io.reactivex.plugins.a.R(new s1(t10));
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> l7(g0<T> g0Var) {
        io.reactivex.internal.functions.b.g(g0Var, "onSubscribe is null");
        if (g0Var instanceof b0) {
            throw new IllegalArgumentException("unsafeCreate(Observable) should be upgraded");
        }
        return io.reactivex.plugins.a.R(new h1(g0Var));
    }

    @cj.d
    @cj.h("none")
    public static <T, R> b0<R> m0(dj.o<? super Object[], ? extends R> oVar, int i10, g0<? extends T>... g0VarArr) {
        return q0(g0VarArr, oVar, i10);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> m3(T t10, T t11) {
        io.reactivex.internal.functions.b.g(t10, "item1 is null");
        io.reactivex.internal.functions.b.g(t11, "item2 is null");
        return I2(t10, t11);
    }

    @cj.d
    @cj.h("none")
    public static b0<Integer> m4(int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + i11);
        }
        if (i11 == 0) {
            return d2();
        }
        if (i11 == 1) {
            return l3(Integer.valueOf(i10));
        }
        if (((long) i10) + ((long) (i11 - 1)) <= g3.f12256c) {
            return io.reactivex.plugins.a.R(new i2(i10, i11));
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    @cj.d
    @cj.h("none")
    public static <T, R> b0<R> n0(Iterable<? extends g0<? extends T>> iterable, dj.o<? super Object[], ? extends R> oVar) {
        return o0(iterable, oVar, T());
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> n3(T t10, T t11, T t12) {
        io.reactivex.internal.functions.b.g(t10, "item1 is null");
        io.reactivex.internal.functions.b.g(t11, "item2 is null");
        io.reactivex.internal.functions.b.g(t12, "item3 is null");
        return I2(t10, t11, t12);
    }

    @cj.d
    @cj.h("none")
    public static b0<Long> n4(long j10, long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j11);
        }
        if (j11 == 0) {
            return d2();
        }
        if (j11 == 1) {
            return l3(Long.valueOf(j10));
        }
        long j12 = (j11 - 1) + j10;
        if (j10 <= 0 || j12 >= 0) {
            return io.reactivex.plugins.a.R(new j2(j10, j11));
        }
        throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
    }

    @cj.d
    @cj.h("none")
    public static <T, D> b0<T> n7(Callable<? extends D> callable, dj.o<? super D, ? extends g0<? extends T>> oVar, dj.g<? super D> gVar) {
        return o7(callable, oVar, gVar, true);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T, R> b0<R> o0(Iterable<? extends g0<? extends T>> iterable, dj.o<? super Object[], ? extends R> oVar, int i10) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        io.reactivex.internal.functions.b.g(oVar, "combiner is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.u(null, iterable, oVar, i10 << 1, true));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> o3(T t10, T t11, T t12, T t13) {
        io.reactivex.internal.functions.b.g(t10, "item1 is null");
        io.reactivex.internal.functions.b.g(t11, "item2 is null");
        io.reactivex.internal.functions.b.g(t12, "item3 is null");
        io.reactivex.internal.functions.b.g(t13, "item4 is null");
        return I2(t10, t11, t12, t13);
    }

    @cj.d
    @cj.h("none")
    public static <T, D> b0<T> o7(Callable<? extends D> callable, dj.o<? super D, ? extends g0<? extends T>> oVar, dj.g<? super D> gVar, boolean z10) {
        io.reactivex.internal.functions.b.g(callable, "resourceSupplier is null");
        io.reactivex.internal.functions.b.g(oVar, "sourceSupplier is null");
        io.reactivex.internal.functions.b.g(gVar, "disposer is null");
        return io.reactivex.plugins.a.R(new d4(callable, oVar, gVar, z10));
    }

    @cj.d
    @cj.h("none")
    public static <T, R> b0<R> p0(g0<? extends T>[] g0VarArr, dj.o<? super Object[], ? extends R> oVar) {
        return q0(g0VarArr, oVar, T());
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> p3(T t10, T t11, T t12, T t13, T t14) {
        io.reactivex.internal.functions.b.g(t10, "item1 is null");
        io.reactivex.internal.functions.b.g(t11, "item2 is null");
        io.reactivex.internal.functions.b.g(t12, "item3 is null");
        io.reactivex.internal.functions.b.g(t13, "item4 is null");
        io.reactivex.internal.functions.b.g(t14, "item5 is null");
        return I2(t10, t11, t12, t13, t14);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T, R> b0<R> q0(g0<? extends T>[] g0VarArr, dj.o<? super Object[], ? extends R> oVar, int i10) {
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        io.reactivex.internal.functions.b.g(oVar, "combiner is null");
        return g0VarArr.length == 0 ? d2() : io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.u(g0VarArr, null, oVar, i10 << 1, true));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> q1(e0<T> e0Var) {
        io.reactivex.internal.functions.b.g(e0Var, "source is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.c0(e0Var));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> q3(T t10, T t11, T t12, T t13, T t14, T t15) {
        io.reactivex.internal.functions.b.g(t10, "item1 is null");
        io.reactivex.internal.functions.b.g(t11, "item2 is null");
        io.reactivex.internal.functions.b.g(t12, "item3 is null");
        io.reactivex.internal.functions.b.g(t13, "item4 is null");
        io.reactivex.internal.functions.b.g(t14, "item5 is null");
        io.reactivex.internal.functions.b.g(t15, "item6 is null");
        return I2(t10, t11, t12, t13, t14, t15);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> r3(T t10, T t11, T t12, T t13, T t14, T t15, T t16) {
        io.reactivex.internal.functions.b.g(t10, "item1 is null");
        io.reactivex.internal.functions.b.g(t11, "item2 is null");
        io.reactivex.internal.functions.b.g(t12, "item3 is null");
        io.reactivex.internal.functions.b.g(t13, "item4 is null");
        io.reactivex.internal.functions.b.g(t14, "item5 is null");
        io.reactivex.internal.functions.b.g(t15, "item6 is null");
        io.reactivex.internal.functions.b.g(t16, "item7 is null");
        return I2(t10, t11, t12, t13, t14, t15, t16);
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> s0(g0<? extends g0<? extends T>> g0Var) {
        return t0(g0Var, T());
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> s3(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17) {
        io.reactivex.internal.functions.b.g(t10, "item1 is null");
        io.reactivex.internal.functions.b.g(t11, "item2 is null");
        io.reactivex.internal.functions.b.g(t12, "item3 is null");
        io.reactivex.internal.functions.b.g(t13, "item4 is null");
        io.reactivex.internal.functions.b.g(t14, "item5 is null");
        io.reactivex.internal.functions.b.g(t15, "item6 is null");
        io.reactivex.internal.functions.b.g(t16, "item7 is null");
        io.reactivex.internal.functions.b.g(t17, "item8 is null");
        return I2(t10, t11, t12, t13, t14, t15, t16, t17);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> t0(g0<? extends g0<? extends T>> g0Var, int i10) {
        io.reactivex.internal.functions.b.g(g0Var, "sources is null");
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.v(g0Var, io.reactivex.internal.functions.a.k(), i10, io.reactivex.internal.util.j.IMMEDIATE));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> t3(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18) {
        io.reactivex.internal.functions.b.g(t10, "item1 is null");
        io.reactivex.internal.functions.b.g(t11, "item2 is null");
        io.reactivex.internal.functions.b.g(t12, "item3 is null");
        io.reactivex.internal.functions.b.g(t13, "item4 is null");
        io.reactivex.internal.functions.b.g(t14, "item5 is null");
        io.reactivex.internal.functions.b.g(t15, "item6 is null");
        io.reactivex.internal.functions.b.g(t16, "item7 is null");
        io.reactivex.internal.functions.b.g(t17, "item8 is null");
        io.reactivex.internal.functions.b.g(t18, "item9 is null");
        return I2(t10, t11, t12, t13, t14, t15, t16, t17, t18);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> u0(g0<? extends T> g0Var, g0<? extends T> g0Var2) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        return y0(g0Var, g0Var2);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> u3(T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17, T t18, T t19) {
        io.reactivex.internal.functions.b.g(t10, "item1 is null");
        io.reactivex.internal.functions.b.g(t11, "item2 is null");
        io.reactivex.internal.functions.b.g(t12, "item3 is null");
        io.reactivex.internal.functions.b.g(t13, "item4 is null");
        io.reactivex.internal.functions.b.g(t14, "item5 is null");
        io.reactivex.internal.functions.b.g(t15, "item6 is null");
        io.reactivex.internal.functions.b.g(t16, "item7 is null");
        io.reactivex.internal.functions.b.g(t17, "item8 is null");
        io.reactivex.internal.functions.b.g(t18, "item9 is null");
        io.reactivex.internal.functions.b.g(t19, "item10 is null");
        return I2(t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> v0(g0<? extends T> g0Var, g0<? extends T> g0Var2, g0<? extends T> g0Var3) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(g0Var3, "source3 is null");
        int i10 = 3 & 3;
        return y0(g0Var, g0Var2, g0Var3);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> v1(Callable<? extends g0<? extends T>> callable) {
        io.reactivex.internal.functions.b.g(callable, "supplier is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.f0(callable));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> w0(g0<? extends T> g0Var, g0<? extends T> g0Var2, g0<? extends T> g0Var3, g0<? extends T> g0Var4) {
        io.reactivex.internal.functions.b.g(g0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(g0Var3, "source3 is null");
        io.reactivex.internal.functions.b.g(g0Var4, "source4 is null");
        return y0(g0Var, g0Var2, g0Var3, g0Var4);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> x0(Iterable<? extends g0<? extends T>> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return O2(iterable).T0(io.reactivex.internal.functions.a.k(), T(), false);
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> y0(g0<? extends T>... g0VarArr) {
        if (g0VarArr.length == 0) {
            return d2();
        }
        return g0VarArr.length == 1 ? O7(g0VarArr[0]) : io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.v(I2(g0VarArr), io.reactivex.internal.functions.a.k(), T(), io.reactivex.internal.util.j.BOUNDARY));
    }

    @cj.d
    @cj.h("none")
    public static <T> b0<T> z0(g0<? extends T>... g0VarArr) {
        if (g0VarArr.length == 0) {
            return d2();
        }
        return g0VarArr.length == 1 ? O7(g0VarArr[0]) : E0(I2(g0VarArr));
    }

    @cj.d
    @cj.h("none")
    public final b0<List<T>> A(int i10) {
        return B(i10, i10);
    }

    @cj.d
    @cj.h("none")
    public final <U> b0<T> A1(dj.o<? super T, ? extends g0<U>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "itemDelay is null");
        return (b0<T>) k2(o1.c(oVar));
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> A2(dj.o<? super T, ? extends y<? extends R>> oVar) {
        return B2(oVar, false);
    }

    @cj.d
    @cj.h("none")
    public final b0<a0<T>> A3() {
        return io.reactivex.plugins.a.R(new y1(this));
    }

    @cj.d
    @cj.h(cj.h.M)
    public final <R> b0<R> A4(dj.o<? super b0<T>, ? extends g0<R>> oVar, long j10, TimeUnit timeUnit) {
        return B4(oVar, j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.d
    @cj.h("none")
    public final b0<T> A5(T t10) {
        io.reactivex.internal.functions.b.g(t10, "item is null");
        return y0(l3(t10), this);
    }

    @cj.d
    @cj.h("none")
    public final b0<io.reactivex.schedulers.d<T>> A6() {
        return D6(TimeUnit.MILLISECONDS, io.reactivex.schedulers.b.a());
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<b0<T>> A7(long j10, TimeUnit timeUnit, j0 j0Var, long j11, boolean z10) {
        return B7(j10, timeUnit, j0Var, j11, z10, T());
    }

    @cj.d
    @cj.h("none")
    public final b0<List<T>> B(int i10, int i11) {
        return (b0<List<T>>) C(i10, i11, io.reactivex.internal.util.b.k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.d
    @cj.h("none")
    public final <U, V> b0<T> B1(g0<U> g0Var, dj.o<? super T, ? extends g0<V>> oVar) {
        return E1(g0Var).A1(oVar);
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> B2(dj.o<? super T, ? extends y<? extends R>> oVar, boolean z10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.R(new z0(this, oVar, z10));
    }

    @cj.d
    @cj.h(cj.h.L)
    public final <R> b0<R> B4(dj.o<? super b0<T>, ? extends g0<R>> oVar, long j10, TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.g(oVar, "selector is null");
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return r2.x8(o1.j(this, j10, timeUnit, j0Var), oVar);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> B5(T... tArr) {
        b0 b0VarI2 = I2(tArr);
        return b0VarI2 == d2() ? io.reactivex.plugins.a.R(this) : y0(b0VarI2, this);
    }

    @cj.d
    @cj.h("none")
    public final b0<io.reactivex.schedulers.d<T>> B6(j0 j0Var) {
        return D6(TimeUnit.MILLISECONDS, j0Var);
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<b0<T>> B7(long j10, TimeUnit timeUnit, j0 j0Var, long j11, boolean z10, int i10) {
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.i(j11, "count");
        return io.reactivex.plugins.a.R(new i4(this, j10, j10, timeUnit, j0Var, j11, i10, z10));
    }

    @cj.d
    @cj.h("none")
    public final <U extends Collection<? super T>> b0<U> C(int i10, int i11, Callable<U> callable) {
        io.reactivex.internal.functions.b.h(i10, "count");
        io.reactivex.internal.functions.b.h(i11, ActionType.SKIP);
        io.reactivex.internal.functions.b.g(callable, "bufferSupplier is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.m(this, i10, i11, callable));
    }

    @cj.d
    @cj.h(cj.h.M)
    public final b0<T> C1(long j10, TimeUnit timeUnit) {
        return D1(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> C2(dj.o<? super T, ? extends q0<? extends R>> oVar) {
        return D2(oVar, false);
    }

    @cj.d
    @cj.h(cj.h.L)
    public final <R> b0<R> C4(dj.o<? super b0<T>, ? extends g0<R>> oVar, j0 j0Var) {
        io.reactivex.internal.functions.b.g(oVar, "selector is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return r2.x8(o1.g(this), o1.k(oVar, j0Var));
    }

    @cj.h("none")
    public final io.reactivex.disposables.c C5() {
        return G5(io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.f298695f, io.reactivex.internal.functions.a.f298692c, io.reactivex.internal.functions.a.h());
    }

    @cj.d
    @cj.h("none")
    public final b0<io.reactivex.schedulers.d<T>> C6(TimeUnit timeUnit) {
        return D6(timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.d
    @cj.h("none")
    public final <B> b0<b0<T>> C7(g0<B> g0Var) {
        return D7(g0Var, T());
    }

    @cj.d
    @cj.h("none")
    public final <U extends Collection<? super T>> b0<U> D(int i10, Callable<U> callable) {
        return C(i10, i10, callable);
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> D1(long j10, TimeUnit timeUnit, j0 j0Var) {
        return E1(P6(j10, timeUnit, j0Var));
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> D2(dj.o<? super T, ? extends q0<? extends R>> oVar, boolean z10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.R(new a1(this, oVar, z10));
    }

    @cj.d
    @cj.h("none")
    public final io.reactivex.observables.a<T> D4() {
        return r2.w8(this);
    }

    @cj.d
    @cj.h("none")
    public final io.reactivex.disposables.c D5(dj.g<? super T> gVar) {
        return G5(gVar, io.reactivex.internal.functions.a.f298695f, io.reactivex.internal.functions.a.f298692c, io.reactivex.internal.functions.a.h());
    }

    @cj.d
    @cj.h("none")
    public final b0<io.reactivex.schedulers.d<T>> D6(TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new w3(this, timeUnit, j0Var));
    }

    @cj.d
    @cj.h("none")
    public final <B> b0<b0<T>> D7(g0<B> g0Var, int i10) {
        io.reactivex.internal.functions.b.g(g0Var, "boundary is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.R(new f4(this, g0Var, i10));
    }

    @cj.d
    @cj.h(cj.h.M)
    public final b0<List<T>> E(long j10, long j11, TimeUnit timeUnit) {
        return (b0<List<T>>) G(j10, j11, timeUnit, io.reactivex.schedulers.b.a(), io.reactivex.internal.util.b.k());
    }

    @cj.d
    @cj.h("none")
    public final <U> b0<T> E1(g0<U> g0Var) {
        io.reactivex.internal.functions.b.g(g0Var, "other is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.h0(this, g0Var));
    }

    @cj.d
    @cj.h("none")
    public final io.reactivex.disposables.c E2(dj.g<? super T> gVar) {
        return D5(gVar);
    }

    @cj.d
    @cj.h("none")
    public final io.reactivex.observables.a<T> E4(int i10) {
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return r2.s8(this, i10);
    }

    @cj.d
    @cj.h("none")
    public final io.reactivex.disposables.c E5(dj.g<? super T> gVar, dj.g<? super Throwable> gVar2) {
        return G5(gVar, gVar2, io.reactivex.internal.functions.a.f298692c, io.reactivex.internal.functions.a.h());
    }

    @cj.d
    @cj.h(cj.h.M)
    public final b0<T> E6(long j10, TimeUnit timeUnit) {
        return M6(j10, timeUnit, null, io.reactivex.schedulers.b.a());
    }

    @cj.d
    @cj.h("none")
    public final <U, V> b0<b0<T>> E7(g0<U> g0Var, dj.o<? super U, ? extends g0<V>> oVar) {
        return F7(g0Var, oVar, T());
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<List<T>> F(long j10, long j11, TimeUnit timeUnit, j0 j0Var) {
        return (b0<List<T>>) G(j10, j11, timeUnit, j0Var, io.reactivex.internal.util.b.k());
    }

    @cj.d
    @cj.h("none")
    @Deprecated
    public final <T2> b0<T2> F1() {
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.i0(this, io.reactivex.internal.functions.a.k()));
    }

    @cj.d
    @cj.h("none")
    public final io.reactivex.disposables.c F2(dj.r<? super T> rVar) {
        return H2(rVar, io.reactivex.internal.functions.a.f298695f, io.reactivex.internal.functions.a.f298692c);
    }

    @cj.d
    @cj.h(cj.h.M)
    public final io.reactivex.observables.a<T> F4(int i10, long j10, TimeUnit timeUnit) {
        return G4(i10, j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.d
    @cj.h("none")
    public final io.reactivex.disposables.c F5(dj.g<? super T> gVar, dj.g<? super Throwable> gVar2, dj.a aVar) {
        return G5(gVar, gVar2, aVar, io.reactivex.internal.functions.a.h());
    }

    @cj.d
    @cj.h(cj.h.M)
    public final b0<T> F6(long j10, TimeUnit timeUnit, g0<? extends T> g0Var) {
        io.reactivex.internal.functions.b.g(g0Var, "other is null");
        return M6(j10, timeUnit, g0Var, io.reactivex.schedulers.b.a());
    }

    @cj.d
    @cj.h("none")
    public final <U, V> b0<b0<T>> F7(g0<U> g0Var, dj.o<? super U, ? extends g0<V>> oVar, int i10) {
        io.reactivex.internal.functions.b.g(g0Var, "openingIndicator is null");
        io.reactivex.internal.functions.b.g(oVar, "closingIndicator is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.R(new g4(this, g0Var, oVar, i10));
    }

    @cj.d
    @cj.h(cj.h.L)
    public final <U extends Collection<? super T>> b0<U> G(long j10, long j11, TimeUnit timeUnit, j0 j0Var, Callable<U> callable) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        io.reactivex.internal.functions.b.g(callable, "bufferSupplier is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.q(this, j10, j11, timeUnit, j0Var, callable, Integer.MAX_VALUE, false));
    }

    @cj.e
    @cj.d
    @cj.h("none")
    public final <R> b0<R> G1(dj.o<? super T, a0<R>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "selector is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.i0(this, oVar));
    }

    @cj.d
    @cj.h("none")
    public final io.reactivex.disposables.c G2(dj.r<? super T> rVar, dj.g<? super Throwable> gVar) {
        return H2(rVar, gVar, io.reactivex.internal.functions.a.f298692c);
    }

    @cj.d
    @cj.h(cj.h.L)
    public final io.reactivex.observables.a<T> G4(int i10, long j10, TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return r2.u8(this, j10, timeUnit, j0Var, i10);
    }

    @cj.d
    @cj.h("none")
    public final io.reactivex.disposables.c G5(dj.g<? super T> gVar, dj.g<? super Throwable> gVar2, dj.a aVar, dj.g<? super io.reactivex.disposables.c> gVar3) {
        io.reactivex.internal.functions.b.g(gVar, "onNext is null");
        io.reactivex.internal.functions.b.g(gVar2, "onError is null");
        io.reactivex.internal.functions.b.g(aVar, "onComplete is null");
        io.reactivex.internal.functions.b.g(gVar3, "onSubscribe is null");
        io.reactivex.internal.observers.u uVar = new io.reactivex.internal.observers.u(gVar, gVar2, aVar, gVar3);
        a(uVar);
        return uVar;
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> G6(long j10, TimeUnit timeUnit, j0 j0Var) {
        return M6(j10, timeUnit, null, j0Var);
    }

    @cj.d
    @cj.h("none")
    public final <B> b0<b0<T>> G7(Callable<? extends g0<B>> callable) {
        return H7(callable, T());
    }

    @cj.d
    @cj.h(cj.h.M)
    public final b0<List<T>> H(long j10, TimeUnit timeUnit) {
        return K(j10, timeUnit, io.reactivex.schedulers.b.a(), Integer.MAX_VALUE);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> H1() {
        return J1(io.reactivex.internal.functions.a.k(), io.reactivex.internal.functions.a.g());
    }

    @cj.d
    @cj.h("none")
    public final io.reactivex.disposables.c H2(dj.r<? super T> rVar, dj.g<? super Throwable> gVar, dj.a aVar) {
        io.reactivex.internal.functions.b.g(rVar, "onNext is null");
        io.reactivex.internal.functions.b.g(gVar, "onError is null");
        io.reactivex.internal.functions.b.g(aVar, "onComplete is null");
        io.reactivex.internal.observers.p pVar = new io.reactivex.internal.observers.p(rVar, gVar, aVar);
        a(pVar);
        return pVar;
    }

    @cj.d
    @cj.h(cj.h.L)
    public final io.reactivex.observables.a<T> H4(int i10, j0 j0Var) {
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return r2.y8(E4(i10), j0Var);
    }

    protected abstract void H5(i0<? super T> i0Var);

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> H6(long j10, TimeUnit timeUnit, j0 j0Var, g0<? extends T> g0Var) {
        io.reactivex.internal.functions.b.g(g0Var, "other is null");
        return M6(j10, timeUnit, g0Var, j0Var);
    }

    @cj.d
    @cj.h("none")
    public final <B> b0<b0<T>> H7(Callable<? extends g0<B>> callable, int i10) {
        io.reactivex.internal.functions.b.g(callable, "boundary is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.R(new h4(this, callable, i10));
    }

    @cj.d
    @cj.h(cj.h.M)
    public final b0<List<T>> I(long j10, TimeUnit timeUnit, int i10) {
        return K(j10, timeUnit, io.reactivex.schedulers.b.a(), i10);
    }

    @cj.d
    @cj.h("none")
    public final <K> b0<T> I1(dj.o<? super T, K> oVar) {
        return J1(oVar, io.reactivex.internal.functions.a.g());
    }

    @cj.d
    @cj.h(cj.h.M)
    public final io.reactivex.observables.a<T> I4(long j10, TimeUnit timeUnit) {
        return J4(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> I5(j0 j0Var) {
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new k3(this, j0Var));
    }

    @cj.d
    @cj.h("none")
    public final <V> b0<T> I6(dj.o<? super T, ? extends g0<V>> oVar) {
        return N6(null, oVar, null);
    }

    @cj.d
    @cj.h("none")
    public final <U, R> b0<R> I7(g0<? extends U> g0Var, dj.c<? super T, ? super U, ? extends R> cVar) {
        io.reactivex.internal.functions.b.g(g0Var, "other is null");
        io.reactivex.internal.functions.b.g(cVar, "combiner is null");
        return io.reactivex.plugins.a.R(new j4(this, cVar, g0Var));
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<List<T>> J(long j10, TimeUnit timeUnit, j0 j0Var) {
        return (b0<List<T>>) L(j10, timeUnit, j0Var, Integer.MAX_VALUE, io.reactivex.internal.util.b.k(), false);
    }

    @cj.d
    @cj.h("none")
    public final <K> b0<T> J1(dj.o<? super T, K> oVar, Callable<? extends Collection<? super K>> callable) {
        io.reactivex.internal.functions.b.g(oVar, "keySelector is null");
        io.reactivex.internal.functions.b.g(callable, "collectionSupplier is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.k0(this, oVar, callable));
    }

    @cj.d
    @cj.h(cj.h.L)
    public final io.reactivex.observables.a<T> J4(long j10, TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return r2.t8(this, j10, timeUnit, j0Var);
    }

    @cj.d
    @cj.h("none")
    public final <E extends i0<? super T>> E J5(E e10) {
        a(e10);
        return e10;
    }

    @cj.d
    @cj.h("none")
    public final <V> b0<T> J6(dj.o<? super T, ? extends g0<V>> oVar, g0<? extends T> g0Var) {
        io.reactivex.internal.functions.b.g(g0Var, "other is null");
        return N6(null, oVar, g0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.d
    @cj.h("none")
    public final <T1, T2, R> b0<R> J7(g0<T1> g0Var, g0<T2> g0Var2, dj.h<? super T, ? super T1, ? super T2, R> hVar) {
        io.reactivex.internal.functions.b.g(g0Var, "o1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "o2 is null");
        io.reactivex.internal.functions.b.g(hVar, "combiner is null");
        return N7(new g0[]{g0Var, g0Var2}, io.reactivex.internal.functions.a.y(hVar));
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<List<T>> K(long j10, TimeUnit timeUnit, j0 j0Var, int i10) {
        return (b0<List<T>>) L(j10, timeUnit, j0Var, i10, io.reactivex.internal.util.b.k(), false);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> K1() {
        return M1(io.reactivex.internal.functions.a.k());
    }

    @cj.d
    @cj.h(cj.h.L)
    public final io.reactivex.observables.a<T> K4(j0 j0Var) {
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return r2.y8(D4(), j0Var);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> K5(g0<? extends T> g0Var) {
        io.reactivex.internal.functions.b.g(g0Var, "other is null");
        return io.reactivex.plugins.a.R(new l3(this, g0Var));
    }

    @cj.d
    @cj.h("none")
    public final <U, V> b0<T> K6(g0<U> g0Var, dj.o<? super T, ? extends g0<V>> oVar) {
        io.reactivex.internal.functions.b.g(g0Var, "firstTimeoutIndicator is null");
        return N6(g0Var, oVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.d
    @cj.h("none")
    public final <T1, T2, T3, R> b0<R> K7(g0<T1> g0Var, g0<T2> g0Var2, g0<T3> g0Var3, dj.i<? super T, ? super T1, ? super T2, ? super T3, R> iVar) {
        io.reactivex.internal.functions.b.g(g0Var, "o1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "o2 is null");
        io.reactivex.internal.functions.b.g(g0Var3, "o3 is null");
        io.reactivex.internal.functions.b.g(iVar, "combiner is null");
        return N7(new g0[]{g0Var, g0Var2, g0Var3}, io.reactivex.internal.functions.a.z(iVar));
    }

    @cj.d
    @cj.h(cj.h.L)
    public final <U extends Collection<? super T>> b0<U> L(long j10, TimeUnit timeUnit, j0 j0Var, int i10, Callable<U> callable, boolean z10) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        io.reactivex.internal.functions.b.g(callable, "bufferSupplier is null");
        io.reactivex.internal.functions.b.h(i10, "count");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.q(this, j10, j10, timeUnit, j0Var, callable, i10, z10));
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> L0(dj.o<? super T, ? extends g0<? extends R>> oVar) {
        return M0(oVar, 2);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> L1(dj.d<? super T, ? super T> dVar) {
        io.reactivex.internal.functions.b.g(dVar, "comparer is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.l0(this, io.reactivex.internal.functions.a.k(), dVar));
    }

    @cj.d
    @cj.h("none")
    public final b0<T> L4() {
        return N4(Long.MAX_VALUE, io.reactivex.internal.functions.a.c());
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> L5(dj.o<? super T, ? extends g0<? extends R>> oVar) {
        return M5(oVar, T());
    }

    @cj.d
    @cj.h("none")
    public final <U, V> b0<T> L6(g0<U> g0Var, dj.o<? super T, ? extends g0<V>> oVar, g0<? extends T> g0Var2) {
        io.reactivex.internal.functions.b.g(g0Var, "firstTimeoutIndicator is null");
        io.reactivex.internal.functions.b.g(g0Var2, "other is null");
        return N6(g0Var, oVar, g0Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.d
    @cj.h("none")
    public final <T1, T2, T3, T4, R> b0<R> L7(g0<T1> g0Var, g0<T2> g0Var2, g0<T3> g0Var3, g0<T4> g0Var4, dj.j<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> jVar) {
        io.reactivex.internal.functions.b.g(g0Var, "o1 is null");
        io.reactivex.internal.functions.b.g(g0Var2, "o2 is null");
        io.reactivex.internal.functions.b.g(g0Var3, "o3 is null");
        io.reactivex.internal.functions.b.g(g0Var4, "o4 is null");
        io.reactivex.internal.functions.b.g(jVar, "combiner is null");
        int i10 = 3 >> 2;
        return N7(new g0[]{g0Var, g0Var2, g0Var3, g0Var4}, io.reactivex.internal.functions.a.A(jVar));
    }

    @cj.d
    @cj.h("none")
    public final <B> b0<List<T>> M(g0<B> g0Var) {
        return (b0<List<T>>) Q(g0Var, io.reactivex.internal.util.b.k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.d
    @cj.h("none")
    public final <R> b0<R> M0(dj.o<? super T, ? extends g0<? extends R>> oVar, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        if (!(this instanceof ej.m)) {
            return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.v(this, oVar, i10, io.reactivex.internal.util.j.IMMEDIATE));
        }
        Object objCall = ((ej.m) this).call();
        return objCall == null ? d2() : x2.a(objCall, oVar);
    }

    @cj.d
    @cj.h("none")
    public final <K> b0<T> M1(dj.o<? super T, K> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "keySelector is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.l0(this, oVar, io.reactivex.internal.functions.b.d()));
    }

    @cj.d
    @cj.h("none")
    public final b0<T> M4(long j10) {
        return N4(j10, io.reactivex.internal.functions.a.c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.d
    @cj.h("none")
    public final <R> b0<R> M5(dj.o<? super T, ? extends g0<? extends R>> oVar, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        if (!(this instanceof ej.m)) {
            return io.reactivex.plugins.a.R(new m3(this, oVar, i10, false));
        }
        Object objCall = ((ej.m) this).call();
        return objCall == null ? d2() : x2.a(objCall, oVar);
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> M7(Iterable<? extends g0<?>> iterable, dj.o<? super Object[], R> oVar) {
        io.reactivex.internal.functions.b.g(iterable, "others is null");
        io.reactivex.internal.functions.b.g(oVar, "combiner is null");
        return io.reactivex.plugins.a.R(new k4(this, iterable, oVar));
    }

    @cj.d
    @cj.h("none")
    public final <B> b0<List<T>> N(g0<B> g0Var, int i10) {
        io.reactivex.internal.functions.b.h(i10, "initialCapacity");
        return (b0<List<T>>) Q(g0Var, io.reactivex.internal.functions.a.f(i10));
    }

    @cj.d
    @cj.h("none")
    public final c N0(dj.o<? super T, ? extends i> oVar) {
        return O0(oVar, 2);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> N1(dj.g<? super T> gVar) {
        io.reactivex.internal.functions.b.g(gVar, "onAfterNext is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.m0(this, gVar));
    }

    @cj.d
    @cj.h("none")
    public final b0<T> N4(long j10, dj.r<? super Throwable> rVar) {
        if (j10 >= 0) {
            io.reactivex.internal.functions.b.g(rVar, "predicate is null");
            return io.reactivex.plugins.a.R(new t2(this, j10, rVar));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j10);
    }

    @cj.d
    @cj.h("none")
    public final c N5(@cj.f dj.o<? super T, ? extends i> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.mixed.o(this, oVar, false));
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> N7(g0<?>[] g0VarArr, dj.o<? super Object[], R> oVar) {
        io.reactivex.internal.functions.b.g(g0VarArr, "others is null");
        io.reactivex.internal.functions.b.g(oVar, "combiner is null");
        return io.reactivex.plugins.a.R(new k4(this, g0VarArr, oVar));
    }

    @cj.d
    @cj.h("none")
    public final <TOpening, TClosing> b0<List<T>> O(g0<? extends TOpening> g0Var, dj.o<? super TOpening, ? extends g0<? extends TClosing>> oVar) {
        return (b0<List<T>>) P(g0Var, oVar, io.reactivex.internal.util.b.k());
    }

    @cj.d
    @cj.h("none")
    public final c O0(dj.o<? super T, ? extends i> oVar, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, "capacityHint");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.mixed.l(this, oVar, io.reactivex.internal.util.j.IMMEDIATE, i10));
    }

    @cj.d
    @cj.h("none")
    public final b0<T> O1(dj.a aVar) {
        io.reactivex.internal.functions.b.g(aVar, "onFinally is null");
        return T1(io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.f298692c, aVar);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> O4(dj.d<? super Integer, ? super Throwable> dVar) {
        io.reactivex.internal.functions.b.g(dVar, "predicate is null");
        return io.reactivex.plugins.a.R(new s2(this, dVar));
    }

    @cj.d
    @cj.h("none")
    public final c O5(@cj.f dj.o<? super T, ? extends i> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        boolean z10 = !false;
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.mixed.o(this, oVar, true));
    }

    @cj.d
    @cj.h("none")
    public final <TOpening, TClosing, U extends Collection<? super T>> b0<U> P(g0<? extends TOpening> g0Var, dj.o<? super TOpening, ? extends g0<? extends TClosing>> oVar, Callable<U> callable) {
        io.reactivex.internal.functions.b.g(g0Var, "openingIndicator is null");
        io.reactivex.internal.functions.b.g(oVar, "closingIndicator is null");
        io.reactivex.internal.functions.b.g(callable, "bufferSupplier is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.n(this, g0Var, oVar, callable));
    }

    @cj.d
    @cj.h("none")
    public final c P0(dj.o<? super T, ? extends i> oVar) {
        return R0(oVar, true, 2);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> P1(dj.a aVar) {
        io.reactivex.internal.functions.b.g(aVar, "onFinally is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.n0(this, aVar));
    }

    @cj.d
    @cj.h("none")
    public final b0<T> P4(dj.r<? super Throwable> rVar) {
        return N4(Long.MAX_VALUE, rVar);
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> P5(dj.o<? super T, ? extends g0<? extends R>> oVar) {
        return Q5(oVar, T());
    }

    @cj.d
    @cj.h("none")
    public final <B, U extends Collection<? super T>> b0<U> Q(g0<B> g0Var, Callable<U> callable) {
        io.reactivex.internal.functions.b.g(g0Var, "boundary is null");
        io.reactivex.internal.functions.b.g(callable, "bufferSupplier is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.p(this, g0Var, callable));
    }

    @cj.d
    @cj.h("none")
    public final c Q0(dj.o<? super T, ? extends i> oVar, boolean z10) {
        return R0(oVar, z10, 2);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> Q1(dj.a aVar) {
        return T1(io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.h(), aVar, io.reactivex.internal.functions.a.f298692c);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> Q4(dj.e eVar) {
        io.reactivex.internal.functions.b.g(eVar, "stop is null");
        return N4(Long.MAX_VALUE, io.reactivex.internal.functions.a.v(eVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.d
    @cj.h("none")
    public final <R> b0<R> Q5(dj.o<? super T, ? extends g0<? extends R>> oVar, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        if (!(this instanceof ej.m)) {
            return io.reactivex.plugins.a.R(new m3(this, oVar, i10, true));
        }
        Object objCall = ((ej.m) this).call();
        return objCall == null ? d2() : x2.a(objCall, oVar);
    }

    @cj.d
    @cj.h("none")
    public final b0<io.reactivex.schedulers.d<T>> Q6() {
        return T6(TimeUnit.MILLISECONDS, io.reactivex.schedulers.b.a());
    }

    @cj.d
    @cj.h("none")
    public final <B> b0<List<T>> R(Callable<? extends g0<B>> callable) {
        return (b0<List<T>>) S(callable, io.reactivex.internal.util.b.k());
    }

    @cj.d
    @cj.h("none")
    public final c R0(dj.o<? super T, ? extends i> oVar, boolean z10, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.mixed.l(this, oVar, z10 ? io.reactivex.internal.util.j.END : io.reactivex.internal.util.j.BOUNDARY, i10));
    }

    @cj.d
    @cj.h("none")
    public final b0<T> R1(dj.a aVar) {
        return W1(io.reactivex.internal.functions.a.h(), aVar);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> R4(dj.o<? super b0<Throwable>, ? extends g0<?>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "handler is null");
        return io.reactivex.plugins.a.R(new u2(this, oVar));
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> R5(@cj.f dj.o<? super T, ? extends y<? extends R>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.mixed.p(this, oVar, false));
    }

    @cj.d
    @cj.h("none")
    public final b0<io.reactivex.schedulers.d<T>> R6(j0 j0Var) {
        return T6(TimeUnit.MILLISECONDS, j0Var);
    }

    @cj.d
    @cj.h("none")
    public final <B, U extends Collection<? super T>> b0<U> S(Callable<? extends g0<B>> callable, Callable<U> callable2) {
        io.reactivex.internal.functions.b.g(callable, "boundarySupplier is null");
        io.reactivex.internal.functions.b.g(callable2, "bufferSupplier is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.o(this, callable, callable2));
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> S0(dj.o<? super T, ? extends g0<? extends R>> oVar) {
        return T0(oVar, T(), true);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> S1(dj.g<? super a0<T>> gVar) {
        io.reactivex.internal.functions.b.g(gVar, "onNotification is null");
        return T1(io.reactivex.internal.functions.a.t(gVar), io.reactivex.internal.functions.a.s(gVar), io.reactivex.internal.functions.a.r(gVar), io.reactivex.internal.functions.a.f298692c);
    }

    @cj.h("none")
    public final void S4(i0<? super T> i0Var) {
        io.reactivex.internal.functions.b.g(i0Var, "observer is null");
        if (i0Var instanceof io.reactivex.observers.l) {
            a(i0Var);
        } else {
            a(new io.reactivex.observers.l(i0Var));
        }
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> S5(@cj.f dj.o<? super T, ? extends y<? extends R>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.mixed.p(this, oVar, true));
    }

    @cj.d
    @cj.h("none")
    public final b0<io.reactivex.schedulers.d<T>> S6(TimeUnit timeUnit) {
        return T6(timeUnit, io.reactivex.schedulers.b.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.d
    @cj.h("none")
    public final <R> b0<R> T0(dj.o<? super T, ? extends g0<? extends R>> oVar, int i10, boolean z10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        if (!(this instanceof ej.m)) {
            return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.v(this, oVar, i10, z10 ? io.reactivex.internal.util.j.END : io.reactivex.internal.util.j.BOUNDARY));
        }
        Object objCall = ((ej.m) this).call();
        return objCall == null ? d2() : x2.a(objCall, oVar);
    }

    @cj.d
    @cj.h(cj.h.M)
    public final b0<T> T4(long j10, TimeUnit timeUnit) {
        return U4(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <R> b0<R> T5(@cj.f dj.o<? super T, ? extends q0<? extends R>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.mixed.q(this, oVar, false));
    }

    @cj.d
    @cj.h("none")
    public final b0<io.reactivex.schedulers.d<T>> T6(TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return (b0<io.reactivex.schedulers.d<T>>) z3(io.reactivex.internal.functions.a.w(timeUnit, j0Var));
    }

    @cj.d
    @cj.h("none")
    public final b0<T> U() {
        return V(16);
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> U0(dj.o<? super T, ? extends g0<? extends R>> oVar) {
        return V0(oVar, Integer.MAX_VALUE, T());
    }

    @cj.d
    @cj.h("none")
    public final b0<T> U1(i0<? super T> i0Var) {
        io.reactivex.internal.functions.b.g(i0Var, "observer is null");
        return T1(o1.f(i0Var), o1.e(i0Var), o1.d(i0Var), io.reactivex.internal.functions.a.f298692c);
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> U4(long j10, TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new v2(this, j10, timeUnit, j0Var, false));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <R> b0<R> U5(@cj.f dj.o<? super T, ? extends q0<? extends R>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.mixed.q(this, oVar, true));
    }

    @cj.d
    @cj.h("none")
    public final <R> R U6(dj.o<? super b0<T>, R> oVar) {
        try {
            return (R) ((dj.o) io.reactivex.internal.functions.b.g(oVar, "converter is null")).apply(this);
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            throw io.reactivex.internal.util.k.f(th2);
        }
    }

    @cj.d
    @cj.h("none")
    public final b0<T> V(int i10) {
        io.reactivex.internal.functions.b.h(i10, "initialCapacity");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.r(this, i10));
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> V0(dj.o<? super T, ? extends g0<? extends R>> oVar, int i10, int i11) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, "maxConcurrency");
        io.reactivex.internal.functions.b.h(i11, t1.b.f296115c);
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.w(this, oVar, io.reactivex.internal.util.j.IMMEDIATE, i10, i11));
    }

    @cj.d
    @cj.h("none")
    public final b0<T> V1(dj.g<? super Throwable> gVar) {
        dj.g<? super T> gVarH = io.reactivex.internal.functions.a.h();
        dj.a aVar = io.reactivex.internal.functions.a.f298692c;
        return T1(gVarH, gVar, aVar, aVar);
    }

    @cj.d
    @cj.h("none")
    public final <K> b0<io.reactivex.observables.b<K, T>> V2(dj.o<? super T, ? extends K> oVar) {
        return (b0<io.reactivex.observables.b<K, T>>) Y2(oVar, io.reactivex.internal.functions.a.k(), false, T());
    }

    @cj.d
    @cj.h("none")
    public final b0<T> V3(@cj.f i iVar) {
        io.reactivex.internal.functions.b.g(iVar, "other is null");
        return io.reactivex.plugins.a.R(new z1(this, iVar));
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> V4(long j10, TimeUnit timeUnit, j0 j0Var, boolean z10) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new v2(this, j10, timeUnit, j0Var, z10));
    }

    @cj.b(cj.a.SPECIAL)
    @cj.d
    @cj.h("none")
    public final l<T> V6(b bVar) {
        k1 k1Var = new k1(this);
        int i10 = a.f298657a[bVar.ordinal()];
        if (i10 == 1) {
            return k1Var.x4();
        }
        if (i10 == 2) {
            return k1Var.z4();
        }
        if (i10 != 3) {
            return i10 != 4 ? k1Var.p4() : io.reactivex.plugins.a.P(new n2(k1Var));
        }
        return k1Var;
    }

    @cj.d
    @cj.h("none")
    public final <U> b0<U> W(Class<U> cls) {
        io.reactivex.internal.functions.b.g(cls, "clazz is null");
        return (b0<U>) z3(io.reactivex.internal.functions.a.e(cls));
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> W0(dj.o<? super T, ? extends g0<? extends R>> oVar, int i10, int i11, boolean z10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, "maxConcurrency");
        io.reactivex.internal.functions.b.h(i11, t1.b.f296115c);
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.w(this, oVar, z10 ? io.reactivex.internal.util.j.END : io.reactivex.internal.util.j.BOUNDARY, i10, i11));
    }

    @cj.d
    @cj.h("none")
    public final b0<T> W1(dj.g<? super io.reactivex.disposables.c> gVar, dj.a aVar) {
        io.reactivex.internal.functions.b.g(gVar, "onSubscribe is null");
        io.reactivex.internal.functions.b.g(aVar, "onDispose is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.p0(this, gVar, aVar));
    }

    @cj.d
    @cj.h("none")
    public final <K, V> b0<io.reactivex.observables.b<K, V>> W2(dj.o<? super T, ? extends K> oVar, dj.o<? super T, ? extends V> oVar2) {
        return Y2(oVar, oVar2, false, T());
    }

    @cj.d
    @cj.h("none")
    public final b0<T> W3(@cj.f y<? extends T> yVar) {
        io.reactivex.internal.functions.b.g(yVar, "other is null");
        return io.reactivex.plugins.a.R(new a2(this, yVar));
    }

    @cj.d
    @cj.h(cj.h.M)
    public final b0<T> W4(long j10, TimeUnit timeUnit, boolean z10) {
        return V4(j10, timeUnit, io.reactivex.schedulers.b.a(), z10);
    }

    @cj.d
    @cj.h("none")
    public final Future<T> W6() {
        return (Future) J5(new io.reactivex.internal.observers.q());
    }

    @cj.d
    @cj.h("none")
    public final <U> k0<U> X(Callable<? extends U> callable, dj.b<? super U, ? super T> bVar) {
        io.reactivex.internal.functions.b.g(callable, "initialValueSupplier is null");
        io.reactivex.internal.functions.b.g(bVar, "collector is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.observable.t(this, callable, bVar));
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> X0(dj.o<? super T, ? extends g0<? extends R>> oVar, boolean z10) {
        return W0(oVar, Integer.MAX_VALUE, T(), z10);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> X1(dj.g<? super T> gVar) {
        dj.g<? super Throwable> gVarH = io.reactivex.internal.functions.a.h();
        dj.a aVar = io.reactivex.internal.functions.a.f298692c;
        return T1(gVar, gVarH, aVar, aVar);
    }

    @cj.d
    @cj.h("none")
    public final <K, V> b0<io.reactivex.observables.b<K, V>> X2(dj.o<? super T, ? extends K> oVar, dj.o<? super T, ? extends V> oVar2, boolean z10) {
        return Y2(oVar, oVar2, z10, T());
    }

    @cj.d
    @cj.h("none")
    public final b0<T> X3(g0<? extends T> g0Var) {
        io.reactivex.internal.functions.b.g(g0Var, "other is null");
        return D3(this, g0Var);
    }

    @cj.d
    @cj.h("none")
    public final <U> b0<T> X4(g0<U> g0Var) {
        io.reactivex.internal.functions.b.g(g0Var, "sampler is null");
        return io.reactivex.plugins.a.R(new w2(this, g0Var, false));
    }

    @cj.d
    @cj.h("none")
    public final k0<List<T>> X6() {
        return Y6(16);
    }

    @cj.d
    @cj.h("none")
    public final <U> k0<U> Y(U u10, dj.b<? super U, ? super T> bVar) {
        io.reactivex.internal.functions.b.g(u10, "initialValue is null");
        return X(io.reactivex.internal.functions.a.m(u10), bVar);
    }

    @cj.d
    @cj.h("none")
    public final <U> b0<U> Y0(dj.o<? super T, ? extends Iterable<? extends U>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.R(new b1(this, oVar));
    }

    @cj.d
    @cj.h("none")
    public final b0<T> Y1(dj.g<? super io.reactivex.disposables.c> gVar) {
        return W1(gVar, io.reactivex.internal.functions.a.f298692c);
    }

    @cj.d
    @cj.h("none")
    public final <K, V> b0<io.reactivex.observables.b<K, V>> Y2(dj.o<? super T, ? extends K> oVar, dj.o<? super T, ? extends V> oVar2, boolean z10, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "keySelector is null");
        io.reactivex.internal.functions.b.g(oVar2, "valueSelector is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.R(new j1(this, oVar, oVar2, i10, z10));
    }

    @cj.d
    @cj.h("none")
    public final b0<T> Y3(@cj.f q0<? extends T> q0Var) {
        io.reactivex.internal.functions.b.g(q0Var, "other is null");
        return io.reactivex.plugins.a.R(new b2(this, q0Var));
    }

    @cj.d
    @cj.h("none")
    public final <U> b0<T> Y4(g0<U> g0Var, boolean z10) {
        io.reactivex.internal.functions.b.g(g0Var, "sampler is null");
        return io.reactivex.plugins.a.R(new w2(this, g0Var, z10));
    }

    @cj.d
    @cj.h("none")
    public final k0<List<T>> Y6(int i10) {
        io.reactivex.internal.functions.b.h(i10, "capacityHint");
        return io.reactivex.plugins.a.S(new b4(this, i10));
    }

    @cj.d
    @cj.h("none")
    public final <U> b0<U> Z0(dj.o<? super T, ? extends Iterable<? extends U>> oVar, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        return (b0<U>) M0(o1.a(oVar), i10);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> Z1(dj.a aVar) {
        io.reactivex.internal.functions.b.g(aVar, "onTerminate is null");
        return T1(io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.a(aVar), aVar, io.reactivex.internal.functions.a.f298692c);
    }

    @cj.d
    @cj.h("none")
    public final <K> b0<io.reactivex.observables.b<K, T>> Z2(dj.o<? super T, ? extends K> oVar, boolean z10) {
        return (b0<io.reactivex.observables.b<K, T>>) Y2(oVar, io.reactivex.internal.functions.a.k(), z10, T());
    }

    @cj.d
    @cj.h("none")
    public final b0<T> Z4(dj.c<T, T, T> cVar) {
        io.reactivex.internal.functions.b.g(cVar, "accumulator is null");
        return io.reactivex.plugins.a.R(new y2(this, cVar));
    }

    @cj.d
    @cj.h("none")
    public final b0<T> Z5(long j10) {
        if (j10 >= 0) {
            return io.reactivex.plugins.a.R(new n3(this, j10));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j10);
    }

    @cj.d
    @cj.h("none")
    public final <U extends Collection<? super T>> k0<U> Z6(Callable<U> callable) {
        io.reactivex.internal.functions.b.g(callable, "collectionSupplier is null");
        return io.reactivex.plugins.a.S(new b4(this, callable));
    }

    @Override // io.reactivex.g0
    @cj.h("none")
    public final void a(i0<? super T> i0Var) {
        io.reactivex.internal.functions.b.g(i0Var, "observer is null");
        try {
            i0<? super T> i0VarF0 = io.reactivex.plugins.a.f0(this, i0Var);
            io.reactivex.internal.functions.b.g(i0VarF0, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            H5(i0VarF0);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.plugins.a.Y(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> a1(dj.o<? super T, ? extends y<? extends R>> oVar) {
        return b1(oVar, 2);
    }

    @cj.d
    @cj.h("none")
    public final s<T> a2(long j10) {
        if (j10 >= 0) {
            return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.observable.r0(this, j10));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    @cj.d
    @cj.h("none")
    public final <TRight, TLeftEnd, TRightEnd, R> b0<R> a3(g0<? extends TRight> g0Var, dj.o<? super T, ? extends g0<TLeftEnd>> oVar, dj.o<? super TRight, ? extends g0<TRightEnd>> oVar2, dj.c<? super T, ? super b0<TRight>, ? extends R> cVar) {
        io.reactivex.internal.functions.b.g(g0Var, "other is null");
        io.reactivex.internal.functions.b.g(oVar, "leftEnd is null");
        io.reactivex.internal.functions.b.g(oVar2, "rightEnd is null");
        io.reactivex.internal.functions.b.g(cVar, "resultSelector is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.k1(this, g0Var, oVar, oVar2, cVar));
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> a4(j0 j0Var) {
        return c4(j0Var, false, T());
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> a5(R r10, dj.c<R, ? super T, R> cVar) {
        io.reactivex.internal.functions.b.g(r10, "initialValue is null");
        return b5(io.reactivex.internal.functions.a.m(r10), cVar);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> a6(long j10, TimeUnit timeUnit) {
        return m6(O6(j10, timeUnit));
    }

    @cj.d
    @cj.h("none")
    public final <K> k0<Map<K, T>> a7(dj.o<? super T, ? extends K> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "keySelector is null");
        return (k0<Map<K, T>>) X(io.reactivex.internal.util.m.k(), io.reactivex.internal.functions.a.F(oVar));
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> b1(dj.o<? super T, ? extends y<? extends R>> oVar, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.mixed.m(this, oVar, io.reactivex.internal.util.j.IMMEDIATE, i10));
    }

    @cj.d
    @cj.h("none")
    public final k0<T> b2(long j10, T t10) {
        if (j10 >= 0) {
            io.reactivex.internal.functions.b.g(t10, "defaultItem is null");
            return io.reactivex.plugins.a.S(new s0(this, j10, t10));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> b3() {
        return io.reactivex.plugins.a.R(new l1(this));
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> b4(j0 j0Var, boolean z10) {
        return c4(j0Var, z10, T());
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> b5(Callable<R> callable, dj.c<R, ? super T, R> cVar) {
        io.reactivex.internal.functions.b.g(callable, "seedSupplier is null");
        io.reactivex.internal.functions.b.g(cVar, "accumulator is null");
        return io.reactivex.plugins.a.R(new z2(this, callable, cVar));
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> b6(long j10, TimeUnit timeUnit, j0 j0Var) {
        return m6(P6(j10, timeUnit, j0Var));
    }

    @cj.d
    @cj.h("none")
    public final <K, V> k0<Map<K, V>> b7(dj.o<? super T, ? extends K> oVar, dj.o<? super T, ? extends V> oVar2) {
        io.reactivex.internal.functions.b.g(oVar, "keySelector is null");
        io.reactivex.internal.functions.b.g(oVar2, "valueSelector is null");
        return (k0<Map<K, V>>) X(io.reactivex.internal.util.m.k(), io.reactivex.internal.functions.a.G(oVar, oVar2));
    }

    @cj.d
    @cj.h("none")
    public final k0<Boolean> c(dj.r<? super T> rVar) {
        io.reactivex.internal.functions.b.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.observable.g(this, rVar));
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> c1(dj.o<? super T, ? extends y<? extends R>> oVar) {
        return e1(oVar, true, 2);
    }

    @cj.d
    @cj.h("none")
    public final k0<T> c2(long j10) {
        if (j10 >= 0) {
            return io.reactivex.plugins.a.S(new s0(this, j10, null));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j10);
    }

    @cj.d
    @cj.h("none")
    public final c c3() {
        return io.reactivex.plugins.a.O(new n1(this));
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> c4(j0 j0Var, boolean z10, int i10) {
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.R(new d2(this, j0Var, z10, i10));
    }

    @cj.d
    @cj.h("none")
    public final b0<T> c6(int i10) {
        if (i10 >= 0) {
            if (i10 == 0) {
                return io.reactivex.plugins.a.R(new m1(this));
            }
            return i10 == 1 ? io.reactivex.plugins.a.R(new p3(this)) : io.reactivex.plugins.a.R(new o3(this, i10));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.d
    @cj.h("none")
    public final <K, V> k0<Map<K, V>> c7(dj.o<? super T, ? extends K> oVar, dj.o<? super T, ? extends V> oVar2, Callable<? extends Map<K, V>> callable) {
        io.reactivex.internal.functions.b.g(oVar, "keySelector is null");
        io.reactivex.internal.functions.b.g(oVar2, "valueSelector is null");
        io.reactivex.internal.functions.b.g(callable, "mapSupplier is null");
        return (k0<Map<K, V>>) X(callable, io.reactivex.internal.functions.a.G(oVar, oVar2));
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> d1(dj.o<? super T, ? extends y<? extends R>> oVar, boolean z10) {
        return e1(oVar, z10, 2);
    }

    @cj.d
    @cj.h("none")
    public final <U> b0<U> d4(Class<U> cls) {
        io.reactivex.internal.functions.b.g(cls, "clazz is null");
        return g2(io.reactivex.internal.functions.a.l(cls)).W(cls);
    }

    @cj.d
    @cj.h(cj.h.P)
    public final b0<T> d6(long j10, long j11, TimeUnit timeUnit) {
        return f6(j10, j11, timeUnit, io.reactivex.schedulers.b.i(), false, T());
    }

    @cj.d
    @cj.h("none")
    public final <K> k0<Map<K, Collection<T>>> d7(dj.o<? super T, ? extends K> oVar) {
        return (k0<Map<K, Collection<T>>>) g7(oVar, io.reactivex.internal.functions.a.k(), io.reactivex.internal.util.m.k(), io.reactivex.internal.util.b.l());
    }

    @cj.d
    @cj.h("none")
    public final <U, R> b0<R> d8(g0<? extends U> g0Var, dj.c<? super T, ? super U, ? extends R> cVar) {
        io.reactivex.internal.functions.b.g(g0Var, "other is null");
        return Q7(this, g0Var, cVar);
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> e1(dj.o<? super T, ? extends y<? extends R>> oVar, boolean z10, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.mixed.m(this, oVar, z10 ? io.reactivex.internal.util.j.END : io.reactivex.internal.util.j.BOUNDARY, i10));
    }

    @cj.d
    @cj.h("none")
    public final b0<T> e4(dj.o<? super Throwable, ? extends g0<? extends T>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "resumeFunction is null");
        int i10 = 4 << 0;
        return io.reactivex.plugins.a.R(new e2(this, oVar, false));
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> e6(long j10, long j11, TimeUnit timeUnit, j0 j0Var) {
        return f6(j10, j11, timeUnit, j0Var, false, T());
    }

    @cj.d
    @cj.h("none")
    public final <K, V> k0<Map<K, Collection<V>>> e7(dj.o<? super T, ? extends K> oVar, dj.o<? super T, ? extends V> oVar2) {
        return g7(oVar, oVar2, io.reactivex.internal.util.m.k(), io.reactivex.internal.util.b.l());
    }

    @cj.d
    @cj.h("none")
    public final <U, R> b0<R> e8(g0<? extends U> g0Var, dj.c<? super T, ? super U, ? extends R> cVar, boolean z10) {
        return R7(this, g0Var, cVar, z10);
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> f1(dj.o<? super T, ? extends q0<? extends R>> oVar) {
        return g1(oVar, 2);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> f4(g0<? extends T> g0Var) {
        io.reactivex.internal.functions.b.g(g0Var, "next is null");
        return e4(io.reactivex.internal.functions.a.n(g0Var));
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> f6(long j10, long j11, TimeUnit timeUnit, j0 j0Var, boolean z10, int i10) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        if (j10 >= 0) {
            return io.reactivex.plugins.a.R(new q3(this, j10, j11, timeUnit, j0Var, i10, z10));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + j10);
    }

    @cj.d
    @cj.h("none")
    public final <K, V> k0<Map<K, Collection<V>>> f7(dj.o<? super T, ? extends K> oVar, dj.o<? super T, ? extends V> oVar2, Callable<Map<K, Collection<V>>> callable) {
        return g7(oVar, oVar2, callable, io.reactivex.internal.util.b.l());
    }

    @cj.d
    @cj.h("none")
    public final <U, R> b0<R> f8(g0<? extends U> g0Var, dj.c<? super T, ? super U, ? extends R> cVar, boolean z10, int i10) {
        return S7(this, g0Var, cVar, z10, i10);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> g(g0<? extends T> g0Var) {
        io.reactivex.internal.functions.b.g(g0Var, "other is null");
        return f(this, g0Var);
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> g1(dj.o<? super T, ? extends q0<? extends R>> oVar, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.mixed.n(this, oVar, io.reactivex.internal.util.j.IMMEDIATE, i10));
    }

    @cj.d
    @cj.h("none")
    public final b0<T> g2(dj.r<? super T> rVar) {
        io.reactivex.internal.functions.b.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.R(new v0(this, rVar));
    }

    @cj.d
    @cj.h("none")
    public final b0<T> g4(dj.o<? super Throwable, ? extends T> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "valueSupplier is null");
        return io.reactivex.plugins.a.R(new f2(this, oVar));
    }

    @cj.d
    @cj.h("none")
    public final b0<T> g5() {
        return io.reactivex.plugins.a.R(new c3(this));
    }

    @cj.d
    @cj.h(cj.h.P)
    public final b0<T> g6(long j10, TimeUnit timeUnit) {
        return j6(j10, timeUnit, io.reactivex.schedulers.b.i(), false, T());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.d
    @cj.h("none")
    public final <K, V> k0<Map<K, Collection<V>>> g7(dj.o<? super T, ? extends K> oVar, dj.o<? super T, ? extends V> oVar2, Callable<? extends Map<K, Collection<V>>> callable, dj.o<? super K, ? extends Collection<? super V>> oVar3) {
        io.reactivex.internal.functions.b.g(oVar, "keySelector is null");
        io.reactivex.internal.functions.b.g(oVar2, "valueSelector is null");
        io.reactivex.internal.functions.b.g(callable, "mapSupplier is null");
        io.reactivex.internal.functions.b.g(oVar3, "collectionFactory is null");
        return (k0<Map<K, Collection<V>>>) X(callable, io.reactivex.internal.functions.a.H(oVar, oVar2, oVar3));
    }

    @cj.d
    @cj.h("none")
    public final <U, R> b0<R> g8(Iterable<U> iterable, dj.c<? super T, ? super U, ? extends R> cVar) {
        io.reactivex.internal.functions.b.g(iterable, "other is null");
        io.reactivex.internal.functions.b.g(cVar, "zipper is null");
        return io.reactivex.plugins.a.R(new m4(this, iterable, cVar));
    }

    @cj.d
    @cj.h("none")
    public final k0<Boolean> h(dj.r<? super T> rVar) {
        io.reactivex.internal.functions.b.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.observable.j(this, rVar));
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> h1(dj.o<? super T, ? extends q0<? extends R>> oVar) {
        return j1(oVar, true, 2);
    }

    @cj.d
    @cj.h("none")
    public final k0<T> h2(T t10) {
        return b2(0L, t10);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> h4(T t10) {
        io.reactivex.internal.functions.b.g(t10, "item is null");
        return g4(io.reactivex.internal.functions.a.n(t10));
    }

    @cj.d
    @cj.h("none")
    public final b0<T> h5() {
        return l4().m8();
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> h6(long j10, TimeUnit timeUnit, j0 j0Var) {
        return j6(j10, timeUnit, j0Var, false, T());
    }

    @cj.d
    @cj.h("none")
    public final k0<List<T>> h7() {
        return j7(io.reactivex.internal.functions.a.q());
    }

    @cj.d
    @cj.h("none")
    public final <R> R i(@cj.f c0<T, ? extends R> c0Var) {
        return (R) ((c0) io.reactivex.internal.functions.b.g(c0Var, "converter is null")).a(this);
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> i1(dj.o<? super T, ? extends q0<? extends R>> oVar, boolean z10) {
        return j1(oVar, z10, 2);
    }

    @cj.d
    @cj.h("none")
    public final s<T> i2() {
        return a2(0L);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> i4(g0<? extends T> g0Var) {
        io.reactivex.internal.functions.b.g(g0Var, "next is null");
        return io.reactivex.plugins.a.R(new e2(this, io.reactivex.internal.functions.a.n(g0Var), true));
    }

    @cj.d
    @cj.h("none")
    public final k0<T> i5(T t10) {
        io.reactivex.internal.functions.b.g(t10, "defaultItem is null");
        return io.reactivex.plugins.a.S(new e3(this, t10));
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> i6(long j10, TimeUnit timeUnit, j0 j0Var, boolean z10) {
        return j6(j10, timeUnit, j0Var, z10, T());
    }

    @cj.d
    @cj.h("none")
    public final k0<List<T>> i7(int i10) {
        return k7(io.reactivex.internal.functions.a.q(), i10);
    }

    @cj.d
    @cj.h("none")
    public final T j() {
        io.reactivex.internal.observers.f fVar = new io.reactivex.internal.observers.f();
        a(fVar);
        T tA = fVar.a();
        if (tA != null) {
            return tA;
        }
        throw new NoSuchElementException();
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> j1(dj.o<? super T, ? extends q0<? extends R>> oVar, boolean z10, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.mixed.n(this, oVar, z10 ? io.reactivex.internal.util.j.END : io.reactivex.internal.util.j.BOUNDARY, i10));
    }

    @cj.d
    @cj.h("none")
    public final k0<T> j2() {
        return c2(0L);
    }

    @cj.d
    @cj.h("none")
    public final k0<Boolean> j3() {
        return c(io.reactivex.internal.functions.a.b());
    }

    @cj.d
    @cj.h("none")
    public final b0<T> j4() {
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.j0(this));
    }

    @cj.d
    @cj.h("none")
    public final s<T> j5() {
        return io.reactivex.plugins.a.Q(new d3(this));
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> j6(long j10, TimeUnit timeUnit, j0 j0Var, boolean z10, int i10) {
        return f6(Long.MAX_VALUE, j10, timeUnit, j0Var, z10, i10);
    }

    @cj.d
    @cj.h("none")
    public final k0<List<T>> j7(Comparator<? super T> comparator) {
        io.reactivex.internal.functions.b.g(comparator, "comparator is null");
        return (k0<List<T>>) X6().u0(io.reactivex.internal.functions.a.o(comparator));
    }

    @cj.d
    @cj.h("none")
    public final T k(T t10) {
        io.reactivex.internal.observers.f fVar = new io.reactivex.internal.observers.f();
        a(fVar);
        T tA = fVar.a();
        return tA != null ? tA : t10;
    }

    @cj.d
    @cj.h("none")
    public final b0<T> k1(@cj.f i iVar) {
        io.reactivex.internal.functions.b.g(iVar, "other is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.x(this, iVar));
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> k2(dj.o<? super T, ? extends g0<? extends R>> oVar) {
        return t2(oVar, false);
    }

    @cj.d
    @cj.h("none")
    public final <TRight, TLeftEnd, TRightEnd, R> b0<R> k3(g0<? extends TRight> g0Var, dj.o<? super T, ? extends g0<TLeftEnd>> oVar, dj.o<? super TRight, ? extends g0<TRightEnd>> oVar2, dj.c<? super T, ? super TRight, ? extends R> cVar) {
        io.reactivex.internal.functions.b.g(g0Var, "other is null");
        io.reactivex.internal.functions.b.g(oVar, "leftEnd is null");
        io.reactivex.internal.functions.b.g(oVar2, "rightEnd is null");
        io.reactivex.internal.functions.b.g(cVar, "resultSelector is null");
        return io.reactivex.plugins.a.R(new r1(this, g0Var, oVar, oVar2, cVar));
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> k4(dj.o<? super b0<T>, ? extends g0<R>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "selector is null");
        return io.reactivex.plugins.a.R(new h2(this, oVar));
    }

    @cj.d
    @cj.h("none")
    public final k0<T> k5() {
        return io.reactivex.plugins.a.S(new e3(this, null));
    }

    @cj.d
    @cj.h(cj.h.P)
    public final b0<T> k6(long j10, TimeUnit timeUnit, boolean z10) {
        return j6(j10, timeUnit, io.reactivex.schedulers.b.i(), z10, T());
    }

    @cj.d
    @cj.h("none")
    public final k0<List<T>> k7(Comparator<? super T> comparator, int i10) {
        io.reactivex.internal.functions.b.g(comparator, "comparator is null");
        return (k0<List<T>>) Y6(i10).u0(io.reactivex.internal.functions.a.o(comparator));
    }

    @cj.h("none")
    public final void l(dj.g<? super T> gVar) {
        Iterator<T> it = m().iterator();
        while (it.hasNext()) {
            try {
                gVar.accept(it.next());
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                ((io.reactivex.disposables.c) it).dispose();
                throw io.reactivex.internal.util.k.f(th2);
            }
        }
    }

    @cj.d
    @cj.h("none")
    public final b0<T> l1(@cj.f y<? extends T> yVar) {
        io.reactivex.internal.functions.b.g(yVar, "other is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.y(this, yVar));
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> l2(dj.o<? super T, ? extends g0<? extends R>> oVar, int i10) {
        return v2(oVar, false, i10, T());
    }

    @cj.d
    @cj.h("none")
    public final io.reactivex.observables.a<T> l4() {
        return g2.s8(this);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> l5(long j10) {
        return j10 <= 0 ? io.reactivex.plugins.a.R(this) : io.reactivex.plugins.a.R(new f3(this, j10));
    }

    @cj.d
    @cj.h("none")
    public final b0<T> l6(dj.r<? super T> rVar) {
        io.reactivex.internal.functions.b.g(rVar, "stopPredicate is null");
        return io.reactivex.plugins.a.R(new s3(this, rVar));
    }

    @cj.d
    @cj.h("none")
    public final Iterable<T> m() {
        return n(T());
    }

    @cj.d
    @cj.h("none")
    public final b0<T> m1(g0<? extends T> g0Var) {
        io.reactivex.internal.functions.b.g(g0Var, "other is null");
        return u0(this, g0Var);
    }

    @cj.d
    @cj.h("none")
    public final <U, R> b0<R> m2(dj.o<? super T, ? extends g0<? extends U>> oVar, dj.c<? super T, ? super U, ? extends R> cVar) {
        return q2(oVar, cVar, false, T(), T());
    }

    @cj.d
    @cj.h(cj.h.M)
    public final b0<T> m5(long j10, TimeUnit timeUnit) {
        return u5(O6(j10, timeUnit));
    }

    @cj.d
    @cj.h("none")
    public final <U> b0<T> m6(g0<U> g0Var) {
        io.reactivex.internal.functions.b.g(g0Var, "other is null");
        return io.reactivex.plugins.a.R(new r3(this, g0Var));
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> m7(j0 j0Var) {
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new c4(this, j0Var));
    }

    @cj.d
    @cj.h("none")
    public final Iterable<T> n(int i10) {
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return new io.reactivex.internal.operators.observable.b(this, i10);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> n1(@cj.f q0<? extends T> q0Var) {
        io.reactivex.internal.functions.b.g(q0Var, "other is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.z(this, q0Var));
    }

    @cj.d
    @cj.h("none")
    public final <U, R> b0<R> n2(dj.o<? super T, ? extends g0<? extends U>> oVar, dj.c<? super T, ? super U, ? extends R> cVar, int i10) {
        return q2(oVar, cVar, false, i10, T());
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> n5(long j10, TimeUnit timeUnit, j0 j0Var) {
        return u5(P6(j10, timeUnit, j0Var));
    }

    @cj.d
    @cj.h("none")
    public final b0<T> n6(dj.r<? super T> rVar) {
        io.reactivex.internal.functions.b.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.R(new t3(this, rVar));
    }

    @cj.d
    @cj.h("none")
    public final T o() {
        io.reactivex.internal.observers.g gVar = new io.reactivex.internal.observers.g();
        a(gVar);
        T tA = gVar.a();
        if (tA != null) {
            return tA;
        }
        throw new NoSuchElementException();
    }

    @cj.d
    @cj.h("none")
    public final k0<Boolean> o1(Object obj) {
        io.reactivex.internal.functions.b.g(obj, "element is null");
        return h(io.reactivex.internal.functions.a.i(obj));
    }

    @cj.d
    @cj.h("none")
    public final <U, R> b0<R> o2(dj.o<? super T, ? extends g0<? extends U>> oVar, dj.c<? super T, ? super U, ? extends R> cVar, boolean z10) {
        return q2(oVar, cVar, z10, T(), T());
    }

    @cj.d
    @cj.h("none")
    public final s<T> o4(dj.c<T, T, T> cVar) {
        io.reactivex.internal.functions.b.g(cVar, "reducer is null");
        return io.reactivex.plugins.a.Q(new k2(this, cVar));
    }

    @cj.d
    @cj.h("none")
    public final b0<T> o5(int i10) {
        if (i10 >= 0) {
            return i10 == 0 ? io.reactivex.plugins.a.R(this) : io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.g3(this, i10));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + i10);
    }

    @cj.d
    @cj.h("none")
    public final io.reactivex.observers.n<T> o6() {
        io.reactivex.observers.n<T> nVar = new io.reactivex.observers.n<>();
        a(nVar);
        return nVar;
    }

    @cj.d
    @cj.h("none")
    public final T p(T t10) {
        io.reactivex.internal.observers.g gVar = new io.reactivex.internal.observers.g();
        a(gVar);
        T tA = gVar.a();
        return tA != null ? tA : t10;
    }

    @cj.d
    @cj.h("none")
    public final k0<Long> p1() {
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.observable.b0(this));
    }

    @cj.d
    @cj.h("none")
    public final <U, R> b0<R> p2(dj.o<? super T, ? extends g0<? extends U>> oVar, dj.c<? super T, ? super U, ? extends R> cVar, boolean z10, int i10) {
        return q2(oVar, cVar, z10, i10, T());
    }

    @cj.d
    @cj.h("none")
    public final <R> k0<R> p4(R r10, dj.c<R, ? super T, R> cVar) {
        io.reactivex.internal.functions.b.g(r10, "seed is null");
        io.reactivex.internal.functions.b.g(cVar, "reducer is null");
        return io.reactivex.plugins.a.S(new l2(this, r10, cVar));
    }

    @cj.d
    @cj.h(cj.h.P)
    public final b0<T> p5(long j10, TimeUnit timeUnit) {
        return s5(j10, timeUnit, io.reactivex.schedulers.b.i(), false, T());
    }

    @cj.d
    @cj.h("none")
    public final io.reactivex.observers.n<T> p6(boolean z10) {
        io.reactivex.observers.n<T> nVar = new io.reactivex.observers.n<>();
        if (z10) {
            nVar.dispose();
        }
        a(nVar);
        return nVar;
    }

    @cj.d
    @cj.h("none")
    public final b0<b0<T>> p7(long j10) {
        return r7(j10, j10, T());
    }

    @cj.d
    @cj.h("none")
    public final Iterable<T> q() {
        return new io.reactivex.internal.operators.observable.c(this);
    }

    @cj.d
    @cj.h("none")
    public final <U, R> b0<R> q2(dj.o<? super T, ? extends g0<? extends U>> oVar, dj.c<? super T, ? super U, ? extends R> cVar, boolean z10, int i10, int i11) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.g(cVar, "combiner is null");
        return v2(o1.b(oVar, cVar), z10, i10, i11);
    }

    @cj.d
    @cj.h("none")
    public final <R> k0<R> q4(Callable<R> callable, dj.c<R, ? super T, R> cVar) {
        io.reactivex.internal.functions.b.g(callable, "seedSupplier is null");
        io.reactivex.internal.functions.b.g(cVar, "reducer is null");
        return io.reactivex.plugins.a.S(new m2(this, callable, cVar));
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> q5(long j10, TimeUnit timeUnit, j0 j0Var) {
        return s5(j10, timeUnit, j0Var, false, T());
    }

    @cj.d
    @cj.h(cj.h.M)
    public final b0<T> q6(long j10, TimeUnit timeUnit) {
        return r6(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.d
    @cj.h("none")
    public final b0<b0<T>> q7(long j10, long j11) {
        return r7(j10, j11, T());
    }

    @cj.d
    @cj.h("none")
    public final Iterable<T> r(T t10) {
        return new io.reactivex.internal.operators.observable.d(this, t10);
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> r0(h0<? super T, ? extends R> h0Var) {
        return O7(((h0) io.reactivex.internal.functions.b.g(h0Var, "composer is null")).a(this));
    }

    @cj.d
    @cj.h(cj.h.M)
    public final b0<T> r1(long j10, TimeUnit timeUnit) {
        return s1(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> r2(dj.o<? super T, ? extends g0<? extends R>> oVar, dj.o<? super Throwable, ? extends g0<? extends R>> oVar2, Callable<? extends g0<? extends R>> callable) {
        io.reactivex.internal.functions.b.g(oVar, "onNextMapper is null");
        io.reactivex.internal.functions.b.g(oVar2, "onErrorMapper is null");
        io.reactivex.internal.functions.b.g(callable, "onCompleteSupplier is null");
        return B3(new x1(this, oVar, oVar2, callable));
    }

    @cj.d
    @cj.h("none")
    public final b0<T> r4() {
        return s4(Long.MAX_VALUE);
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> r5(long j10, TimeUnit timeUnit, j0 j0Var, boolean z10) {
        return s5(j10, timeUnit, j0Var, z10, T());
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> r6(long j10, TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new u3(this, j10, timeUnit, j0Var));
    }

    @cj.d
    @cj.h("none")
    public final b0<b0<T>> r7(long j10, long j11, int i10) {
        io.reactivex.internal.functions.b.i(j10, "count");
        io.reactivex.internal.functions.b.i(j11, ActionType.SKIP);
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.R(new e4(this, j10, j11, i10));
    }

    @cj.d
    @cj.h("none")
    public final Iterable<T> s() {
        return new io.reactivex.internal.operators.observable.e(this);
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> s1(long j10, TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.e0(this, j10, timeUnit, j0Var));
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> s2(dj.o<? super T, ? extends g0<? extends R>> oVar, dj.o<Throwable, ? extends g0<? extends R>> oVar2, Callable<? extends g0<? extends R>> callable, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "onNextMapper is null");
        io.reactivex.internal.functions.b.g(oVar2, "onErrorMapper is null");
        io.reactivex.internal.functions.b.g(callable, "onCompleteSupplier is null");
        return C3(new x1(this, oVar, oVar2, callable), i10);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> s4(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? d2() : io.reactivex.plugins.a.R(new o2(this, j10));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j10);
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> s5(long j10, TimeUnit timeUnit, j0 j0Var, boolean z10, int i10) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return io.reactivex.plugins.a.R(new h3(this, j10, timeUnit, j0Var, i10 << 1, z10));
    }

    @cj.d
    @cj.h(cj.h.M)
    public final b0<T> s6(long j10, TimeUnit timeUnit) {
        return T4(j10, timeUnit);
    }

    @cj.d
    @cj.h(cj.h.M)
    public final b0<b0<T>> s7(long j10, long j11, TimeUnit timeUnit) {
        return u7(j10, j11, timeUnit, io.reactivex.schedulers.b.a(), T());
    }

    @cj.d
    @cj.h("none")
    public final T t() {
        T tJ = j5().j();
        if (tJ != null) {
            return tJ;
        }
        throw new NoSuchElementException();
    }

    @cj.d
    @cj.h("none")
    public final <U> b0<T> t1(dj.o<? super T, ? extends g0<U>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "debounceSelector is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.d0(this, oVar));
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> t2(dj.o<? super T, ? extends g0<? extends R>> oVar, boolean z10) {
        return u2(oVar, z10, Integer.MAX_VALUE);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> t4(dj.e eVar) {
        io.reactivex.internal.functions.b.g(eVar, "stop is null");
        return io.reactivex.plugins.a.R(new p2(this, eVar));
    }

    @cj.d
    @cj.h(cj.h.P)
    public final b0<T> t5(long j10, TimeUnit timeUnit, boolean z10) {
        return s5(j10, timeUnit, io.reactivex.schedulers.b.i(), z10, T());
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> t6(long j10, TimeUnit timeUnit, j0 j0Var) {
        return U4(j10, timeUnit, j0Var);
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<b0<T>> t7(long j10, long j11, TimeUnit timeUnit, j0 j0Var) {
        return u7(j10, j11, timeUnit, j0Var, T());
    }

    @cj.d
    @cj.h("none")
    public final T u(T t10) {
        return i5(t10).k();
    }

    @cj.d
    @cj.h("none")
    public final b0<T> u1(T t10) {
        io.reactivex.internal.functions.b.g(t10, "defaultItem is null");
        return K5(l3(t10));
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> u2(dj.o<? super T, ? extends g0<? extends R>> oVar, boolean z10, int i10) {
        return v2(oVar, z10, i10, T());
    }

    @cj.d
    @cj.h("none")
    public final b0<T> u4(dj.o<? super b0<Object>, ? extends g0<?>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "handler is null");
        return io.reactivex.plugins.a.R(new q2(this, oVar));
    }

    @cj.d
    @cj.h("none")
    public final <U> b0<T> u5(g0<U> g0Var) {
        io.reactivex.internal.functions.b.g(g0Var, "other is null");
        return io.reactivex.plugins.a.R(new i3(this, g0Var));
    }

    @cj.d
    @cj.h(cj.h.M)
    public final b0<T> u6(long j10, TimeUnit timeUnit) {
        return w6(j10, timeUnit, io.reactivex.schedulers.b.a(), false);
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<b0<T>> u7(long j10, long j11, TimeUnit timeUnit, j0 j0Var, int i10) {
        io.reactivex.internal.functions.b.i(j10, "timespan");
        io.reactivex.internal.functions.b.i(j11, "timeskip");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        return io.reactivex.plugins.a.R(new i4(this, j10, j11, timeUnit, j0Var, Long.MAX_VALUE, i10, false));
    }

    @cj.h("none")
    public final void v() {
        io.reactivex.internal.operators.observable.l.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.d
    @cj.h("none")
    public final <R> b0<R> v2(dj.o<? super T, ? extends g0<? extends R>> oVar, boolean z10, int i10, int i11) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, "maxConcurrency");
        io.reactivex.internal.functions.b.h(i11, "bufferSize");
        if (!(this instanceof ej.m)) {
            return io.reactivex.plugins.a.R(new w0(this, oVar, z10, i10, i11));
        }
        Object objCall = ((ej.m) this).call();
        return objCall == null ? d2() : x2.a(objCall, oVar);
    }

    @cj.d
    @cj.h("none")
    public final k0<T> v3(T t10) {
        io.reactivex.internal.functions.b.g(t10, "defaultItem is null");
        return io.reactivex.plugins.a.S(new u1(this, t10));
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> v4(dj.o<? super b0<T>, ? extends g0<R>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "selector is null");
        return r2.x8(o1.g(this), oVar);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> v5(dj.r<? super T> rVar) {
        io.reactivex.internal.functions.b.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.R(new j3(this, rVar));
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> v6(long j10, TimeUnit timeUnit, j0 j0Var) {
        return w6(j10, timeUnit, j0Var, false);
    }

    @cj.d
    @cj.h(cj.h.M)
    public final b0<b0<T>> v7(long j10, TimeUnit timeUnit) {
        return A7(j10, timeUnit, io.reactivex.schedulers.b.a(), Long.MAX_VALUE, false);
    }

    @cj.h("none")
    public final void w(dj.g<? super T> gVar) {
        io.reactivex.internal.operators.observable.l.b(this, gVar, io.reactivex.internal.functions.a.f298695f, io.reactivex.internal.functions.a.f298692c);
    }

    @cj.d
    @cj.h(cj.h.M)
    public final b0<T> w1(long j10, TimeUnit timeUnit) {
        return y1(j10, timeUnit, io.reactivex.schedulers.b.a(), false);
    }

    @cj.d
    @cj.h("none")
    public final c w2(dj.o<? super T, ? extends i> oVar) {
        return x2(oVar, false);
    }

    @cj.d
    @cj.h("none")
    public final s<T> w3() {
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.observable.t1(this));
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> w4(dj.o<? super b0<T>, ? extends g0<R>> oVar, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "selector is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return r2.x8(o1.h(this, i10), oVar);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> w5() {
        return X6().x1().z3(io.reactivex.internal.functions.a.o(io.reactivex.internal.functions.a.p())).y2(io.reactivex.internal.functions.a.k());
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> w6(long j10, TimeUnit timeUnit, j0 j0Var, boolean z10) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new v3(this, j10, timeUnit, j0Var, z10));
    }

    @cj.d
    @cj.h(cj.h.M)
    public final b0<b0<T>> w7(long j10, TimeUnit timeUnit, long j11) {
        return A7(j10, timeUnit, io.reactivex.schedulers.b.a(), j11, false);
    }

    @cj.h("none")
    public final void x(dj.g<? super T> gVar, dj.g<? super Throwable> gVar2) {
        io.reactivex.internal.operators.observable.l.b(this, gVar, gVar2, io.reactivex.internal.functions.a.f298692c);
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> x1(long j10, TimeUnit timeUnit, j0 j0Var) {
        return y1(j10, timeUnit, j0Var, false);
    }

    @cj.d
    @cj.h("none")
    public final c x2(dj.o<? super T, ? extends i> oVar, boolean z10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.O(new y0(this, oVar, z10));
    }

    @cj.d
    @cj.h("none")
    public final k0<T> x3() {
        return io.reactivex.plugins.a.S(new u1(this, null));
    }

    @cj.d
    @cj.h(cj.h.M)
    public final <R> b0<R> x4(dj.o<? super b0<T>, ? extends g0<R>> oVar, int i10, long j10, TimeUnit timeUnit) {
        return y4(oVar, i10, j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.d
    @cj.h("none")
    public final b0<T> x5(Comparator<? super T> comparator) {
        io.reactivex.internal.functions.b.g(comparator, "sortFunction is null");
        return X6().x1().z3(io.reactivex.internal.functions.a.o(comparator)).y2(io.reactivex.internal.functions.a.k());
    }

    @cj.d
    @cj.h(cj.h.M)
    public final b0<T> x6(long j10, TimeUnit timeUnit, boolean z10) {
        return w6(j10, timeUnit, io.reactivex.schedulers.b.a(), z10);
    }

    @cj.d
    @cj.h(cj.h.M)
    public final b0<b0<T>> x7(long j10, TimeUnit timeUnit, long j11, boolean z10) {
        return A7(j10, timeUnit, io.reactivex.schedulers.b.a(), j11, z10);
    }

    @cj.h("none")
    public final void y(dj.g<? super T> gVar, dj.g<? super Throwable> gVar2, dj.a aVar) {
        io.reactivex.internal.operators.observable.l.b(this, gVar, gVar2, aVar);
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> y1(long j10, TimeUnit timeUnit, j0 j0Var, boolean z10) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.g0(this, j10, timeUnit, j0Var, z10));
    }

    @cj.d
    @cj.h("none")
    public final <U> b0<U> y2(dj.o<? super T, ? extends Iterable<? extends U>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.R(new b1(this, oVar));
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> y3(f0<? extends R, ? super T> f0Var) {
        io.reactivex.internal.functions.b.g(f0Var, "lifter is null");
        return io.reactivex.plugins.a.R(new v1(this, f0Var));
    }

    @cj.d
    @cj.h(cj.h.L)
    public final <R> b0<R> y4(dj.o<? super b0<T>, ? extends g0<R>> oVar, int i10, long j10, TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.g(oVar, "selector is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return r2.x8(o1.i(this, i10, j10, timeUnit, j0Var), oVar);
    }

    @cj.d
    @cj.h("none")
    public final b0<T> y5(g0<? extends T> g0Var) {
        io.reactivex.internal.functions.b.g(g0Var, "other is null");
        return y0(g0Var, this);
    }

    @cj.d
    @cj.h(cj.h.M)
    public final b0<T> y6(long j10, TimeUnit timeUnit) {
        return r1(j10, timeUnit);
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<b0<T>> y7(long j10, TimeUnit timeUnit, j0 j0Var) {
        return A7(j10, timeUnit, j0Var, Long.MAX_VALUE, false);
    }

    @cj.h("none")
    public final void z(i0<? super T> i0Var) {
        io.reactivex.internal.operators.observable.l.c(this, i0Var);
    }

    @cj.d
    @cj.h(cj.h.M)
    public final b0<T> z1(long j10, TimeUnit timeUnit, boolean z10) {
        return y1(j10, timeUnit, io.reactivex.schedulers.b.a(), z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.d
    @cj.h("none")
    public final <U, V> b0<V> z2(dj.o<? super T, ? extends Iterable<? extends U>> oVar, dj.c<? super T, ? super U, ? extends V> cVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.g(cVar, "resultSelector is null");
        return (b0<V>) q2(o1.a(oVar), cVar, false, T(), T());
    }

    @cj.d
    @cj.h("none")
    public final <R> b0<R> z3(dj.o<? super T, ? extends R> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.R(new w1(this, oVar));
    }

    @cj.d
    @cj.h(cj.h.L)
    public final <R> b0<R> z4(dj.o<? super b0<T>, ? extends g0<R>> oVar, int i10, j0 j0Var) {
        io.reactivex.internal.functions.b.g(oVar, "selector is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        io.reactivex.internal.functions.b.h(i10, "bufferSize");
        return r2.x8(o1.h(this, i10), o1.k(oVar, j0Var));
    }

    @cj.d
    @cj.h("none")
    public final b0<T> z5(Iterable<? extends T> iterable) {
        return y0(O2(iterable), this);
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<T> z6(long j10, TimeUnit timeUnit, j0 j0Var) {
        return s1(j10, timeUnit, j0Var);
    }

    @cj.d
    @cj.h(cj.h.L)
    public final b0<b0<T>> z7(long j10, TimeUnit timeUnit, j0 j0Var, long j11) {
        return A7(j10, timeUnit, j0Var, j11, false);
    }
}
