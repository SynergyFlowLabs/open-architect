package io.reactivex;

import io.ktor.http.t1;
import io.reactivex.internal.operators.flowable.d1;
import io.reactivex.internal.operators.flowable.r3;
import io.reactivex.internal.operators.observable.e3;
import io.reactivex.internal.operators.single.s0;
import io.reactivex.internal.operators.single.t0;
import io.reactivex.internal.operators.single.u0;
import io.reactivex.internal.operators.single.v0;
import io.reactivex.internal.operators.single.w0;
import io.reactivex.internal.operators.single.x0;
import io.reactivex.internal.operators.single.y0;
import io.reactivex.internal.operators.single.z0;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public abstract class k0<T> implements q0<T> {
    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> A0(org.reactivestreams.u<? extends q0<? extends T>> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "sources is null");
        return io.reactivex.plugins.a.P(new d1(uVar, io.reactivex.internal.operators.single.h0.c(), false, Integer.MAX_VALUE, l.Y()));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> k0<T> B0(q0<? extends q0<? extends T>> q0Var) {
        io.reactivex.internal.functions.b.g(q0Var, "source is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.x(q0Var, io.reactivex.internal.functions.a.k()));
    }

    @cj.d
    @cj.h("none")
    public static <T, U> k0<T> B1(Callable<U> callable, dj.o<? super U, ? extends q0<? extends T>> oVar, dj.g<? super U> gVar) {
        return C1(callable, oVar, gVar, true);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> k0<T> C(o0<T> o0Var) {
        io.reactivex.internal.functions.b.g(o0Var, "source is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.d(o0Var));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> C0(q0<? extends T> q0Var, q0<? extends T> q0Var2) {
        io.reactivex.internal.functions.b.g(q0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(q0Var2, "source2 is null");
        return G0(l.R2(q0Var, q0Var2));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T, U> k0<T> C1(Callable<U> callable, dj.o<? super U, ? extends q0<? extends T>> oVar, dj.g<? super U> gVar, boolean z10) {
        io.reactivex.internal.functions.b.g(callable, "resourceSupplier is null");
        io.reactivex.internal.functions.b.g(oVar, "singleFunction is null");
        io.reactivex.internal.functions.b.g(gVar, "disposer is null");
        return io.reactivex.plugins.a.S(new x0(callable, oVar, gVar, z10));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> k0<T> D(Callable<? extends q0<? extends T>> callable) {
        io.reactivex.internal.functions.b.g(callable, "singleSupplier is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.e(callable));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> D0(q0<? extends T> q0Var, q0<? extends T> q0Var2, q0<? extends T> q0Var3) {
        io.reactivex.internal.functions.b.g(q0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(q0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(q0Var3, "source3 is null");
        return G0(l.R2(q0Var, q0Var2, q0Var3));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> k0<T> D1(q0<T> q0Var) {
        io.reactivex.internal.functions.b.g(q0Var, "source is null");
        return q0Var instanceof k0 ? io.reactivex.plugins.a.S((k0) q0Var) : io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.f0(q0Var));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> E0(q0<? extends T> q0Var, q0<? extends T> q0Var2, q0<? extends T> q0Var3, q0<? extends T> q0Var4) {
        io.reactivex.internal.functions.b.g(q0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(q0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(q0Var3, "source3 is null");
        io.reactivex.internal.functions.b.g(q0Var4, "source4 is null");
        return G0(l.R2(q0Var, q0Var2, q0Var3, q0Var4));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T1, T2, R> k0<R> E1(q0<? extends T1> q0Var, q0<? extends T2> q0Var2, dj.c<? super T1, ? super T2, ? extends R> cVar) {
        io.reactivex.internal.functions.b.g(q0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(q0Var2, "source2 is null");
        return N1(io.reactivex.internal.functions.a.x(cVar), q0Var, q0Var2);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> F0(Iterable<? extends q0<? extends T>> iterable) {
        return G0(l.X2(iterable));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, R> k0<R> F1(q0<? extends T1> q0Var, q0<? extends T2> q0Var2, q0<? extends T3> q0Var3, dj.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        io.reactivex.internal.functions.b.g(q0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(q0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(q0Var3, "source3 is null");
        return N1(io.reactivex.internal.functions.a.y(hVar), q0Var, q0Var2, q0Var3);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> G0(org.reactivestreams.u<? extends q0<? extends T>> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "sources is null");
        return io.reactivex.plugins.a.P(new d1(uVar, io.reactivex.internal.operators.single.h0.c(), true, Integer.MAX_VALUE, l.Y()));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, T4, R> k0<R> G1(q0<? extends T1> q0Var, q0<? extends T2> q0Var2, q0<? extends T3> q0Var3, q0<? extends T4> q0Var4, dj.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        io.reactivex.internal.functions.b.g(q0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(q0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(q0Var3, "source3 is null");
        io.reactivex.internal.functions.b.g(q0Var4, "source4 is null");
        return N1(io.reactivex.internal.functions.a.z(iVar), q0Var, q0Var2, q0Var3, q0Var4);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, T4, T5, R> k0<R> H1(q0<? extends T1> q0Var, q0<? extends T2> q0Var2, q0<? extends T3> q0Var3, q0<? extends T4> q0Var4, q0<? extends T5> q0Var5, dj.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        io.reactivex.internal.functions.b.g(q0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(q0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(q0Var3, "source3 is null");
        io.reactivex.internal.functions.b.g(q0Var4, "source4 is null");
        io.reactivex.internal.functions.b.g(q0Var5, "source5 is null");
        return N1(io.reactivex.internal.functions.a.A(jVar), q0Var, q0Var2, q0Var3, q0Var4, q0Var5);
    }

    @cj.d
    @cj.h("none")
    public static <T> k0<T> I0() {
        return io.reactivex.plugins.a.S(io.reactivex.internal.operators.single.m0.f303000a);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, T4, T5, T6, R> k0<R> I1(q0<? extends T1> q0Var, q0<? extends T2> q0Var2, q0<? extends T3> q0Var3, q0<? extends T4> q0Var4, q0<? extends T5> q0Var5, q0<? extends T6> q0Var6, dj.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        io.reactivex.internal.functions.b.g(q0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(q0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(q0Var3, "source3 is null");
        io.reactivex.internal.functions.b.g(q0Var4, "source4 is null");
        io.reactivex.internal.functions.b.g(q0Var5, "source5 is null");
        io.reactivex.internal.functions.b.g(q0Var6, "source6 is null");
        return N1(io.reactivex.internal.functions.a.B(kVar), q0Var, q0Var2, q0Var3, q0Var4, q0Var5, q0Var6);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, T4, T5, T6, T7, R> k0<R> J1(q0<? extends T1> q0Var, q0<? extends T2> q0Var2, q0<? extends T3> q0Var3, q0<? extends T4> q0Var4, q0<? extends T5> q0Var5, q0<? extends T6> q0Var6, q0<? extends T7> q0Var7, dj.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        io.reactivex.internal.functions.b.g(q0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(q0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(q0Var3, "source3 is null");
        io.reactivex.internal.functions.b.g(q0Var4, "source4 is null");
        io.reactivex.internal.functions.b.g(q0Var5, "source5 is null");
        io.reactivex.internal.functions.b.g(q0Var6, "source6 is null");
        io.reactivex.internal.functions.b.g(q0Var7, "source7 is null");
        return N1(io.reactivex.internal.functions.a.C(lVar), q0Var, q0Var2, q0Var3, q0Var4, q0Var5, q0Var6, q0Var7);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> k0<R> K1(q0<? extends T1> q0Var, q0<? extends T2> q0Var2, q0<? extends T3> q0Var3, q0<? extends T4> q0Var4, q0<? extends T5> q0Var5, q0<? extends T6> q0Var6, q0<? extends T7> q0Var7, q0<? extends T8> q0Var8, dj.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        io.reactivex.internal.functions.b.g(q0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(q0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(q0Var3, "source3 is null");
        io.reactivex.internal.functions.b.g(q0Var4, "source4 is null");
        io.reactivex.internal.functions.b.g(q0Var5, "source5 is null");
        io.reactivex.internal.functions.b.g(q0Var6, "source6 is null");
        io.reactivex.internal.functions.b.g(q0Var7, "source7 is null");
        io.reactivex.internal.functions.b.g(q0Var8, "source8 is null");
        int i10 = 7 | 2;
        return N1(io.reactivex.internal.functions.a.D(mVar), q0Var, q0Var2, q0Var3, q0Var4, q0Var5, q0Var6, q0Var7, q0Var8);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> k0<R> L1(q0<? extends T1> q0Var, q0<? extends T2> q0Var2, q0<? extends T3> q0Var3, q0<? extends T4> q0Var4, q0<? extends T5> q0Var5, q0<? extends T6> q0Var6, q0<? extends T7> q0Var7, q0<? extends T8> q0Var8, q0<? extends T9> q0Var9, dj.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        io.reactivex.internal.functions.b.g(q0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(q0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(q0Var3, "source3 is null");
        io.reactivex.internal.functions.b.g(q0Var4, "source4 is null");
        io.reactivex.internal.functions.b.g(q0Var5, "source5 is null");
        io.reactivex.internal.functions.b.g(q0Var6, "source6 is null");
        io.reactivex.internal.functions.b.g(q0Var7, "source7 is null");
        io.reactivex.internal.functions.b.g(q0Var8, "source8 is null");
        io.reactivex.internal.functions.b.g(q0Var9, "source9 is null");
        return N1(io.reactivex.internal.functions.a.E(nVar), q0Var, q0Var2, q0Var3, q0Var4, q0Var5, q0Var6, q0Var7, q0Var8, q0Var9);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T, R> k0<R> M1(Iterable<? extends q0<? extends T>> iterable, dj.o<? super Object[], ? extends R> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "zipper is null");
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return io.reactivex.plugins.a.S(new z0(iterable, oVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T, R> k0<R> N1(dj.o<? super Object[], ? extends R> oVar, q0<? extends T>... q0VarArr) {
        io.reactivex.internal.functions.b.g(oVar, "zipper is null");
        io.reactivex.internal.functions.b.g(q0VarArr, "sources is null");
        return q0VarArr.length == 0 ? Z(new NoSuchElementException()) : io.reactivex.plugins.a.S(new y0(q0VarArr, oVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> k0<Boolean> Y(q0<? extends T> q0Var, q0<? extends T> q0Var2) {
        io.reactivex.internal.functions.b.g(q0Var, "first is null");
        io.reactivex.internal.functions.b.g(q0Var2, "second is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.v(q0Var, q0Var2));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> k0<T> Z(Throwable th2) {
        io.reactivex.internal.functions.b.g(th2, "exception is null");
        return a0(io.reactivex.internal.functions.a.m(th2));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> k0<T> a0(Callable<? extends Throwable> callable) {
        io.reactivex.internal.functions.b.g(callable, "errorSupplier is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.w(callable));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> k0<T> g(Iterable<? extends q0<? extends T>> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.a(null, iterable));
    }

    @cj.d
    @cj.h("none")
    public static <T> k0<T> h(q0<? extends T>... q0VarArr) {
        if (q0VarArr.length == 0) {
            return a0(io.reactivex.internal.operators.single.h0.a());
        }
        return q0VarArr.length == 1 ? D1(q0VarArr[0]) : io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.a(q0VarArr, null));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> k0<T> j0(Callable<? extends T> callable) {
        io.reactivex.internal.functions.b.g(callable, "callable is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.d0(callable));
    }

    @cj.d
    @cj.h("none")
    public static <T> k0<T> k0(Future<? extends T> future) {
        return y1(l.T2(future));
    }

    @cj.d
    @cj.h("none")
    public static <T> k0<T> l0(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        return y1(l.U2(future, j10, timeUnit));
    }

    @cj.d
    @cj.h(cj.h.L)
    public static <T> k0<T> m0(Future<? extends T> future, long j10, TimeUnit timeUnit, j0 j0Var) {
        return y1(l.V2(future, j10, timeUnit, j0Var));
    }

    @cj.d
    @cj.h(cj.h.L)
    public static <T> k0<T> n0(Future<? extends T> future, j0 j0Var) {
        return y1(l.W2(future, j0Var));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> o(q0<? extends T> q0Var, q0<? extends T> q0Var2) {
        io.reactivex.internal.functions.b.g(q0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(q0Var2, "source2 is null");
        return s(l.R2(q0Var, q0Var2));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> k0<T> o0(g0<? extends T> g0Var) {
        io.reactivex.internal.functions.b.g(g0Var, "observableSource is null");
        return io.reactivex.plugins.a.S(new e3(g0Var, null));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> p(q0<? extends T> q0Var, q0<? extends T> q0Var2, q0<? extends T> q0Var3) {
        io.reactivex.internal.functions.b.g(q0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(q0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(q0Var3, "source3 is null");
        return s(l.R2(q0Var, q0Var2, q0Var3));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> k0<T> p0(org.reactivestreams.u<? extends T> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "publisher is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.e0(uVar));
    }

    private k0<T> p1(long j10, TimeUnit timeUnit, j0 j0Var, q0<? extends T> q0Var) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.S(new s0(this, j10, timeUnit, j0Var, q0Var));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> q(q0<? extends T> q0Var, q0<? extends T> q0Var2, q0<? extends T> q0Var3, q0<? extends T> q0Var4) {
        io.reactivex.internal.functions.b.g(q0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(q0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(q0Var3, "source3 is null");
        io.reactivex.internal.functions.b.g(q0Var4, "source4 is null");
        int i10 = 6 | 4;
        return s(l.R2(q0Var, q0Var2, q0Var3, q0Var4));
    }

    @cj.d
    @cj.h(cj.h.M)
    public static k0<Long> q1(long j10, TimeUnit timeUnit) {
        return r1(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> r(Iterable<? extends q0<? extends T>> iterable) {
        return s(l.X2(iterable));
    }

    @cj.f
    @cj.d
    @cj.h(cj.h.L)
    public static k0<Long> r1(long j10, TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.S(new t0(j10, timeUnit, j0Var));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> s(org.reactivestreams.u<? extends q0<? extends T>> uVar) {
        return t(uVar, 2);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> k0<T> s0(T t10) {
        io.reactivex.internal.functions.b.g(t10, "item is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.i0(t10));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> t(org.reactivestreams.u<? extends q0<? extends T>> uVar, int i10) {
        io.reactivex.internal.functions.b.g(uVar, "sources is null");
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.z(uVar, io.reactivex.internal.operators.single.h0.c(), i10, io.reactivex.internal.util.j.IMMEDIATE));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> b0<T> u(g0<? extends q0<? extends T>> g0Var) {
        io.reactivex.internal.functions.b.g(g0Var, "sources is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.observable.v(g0Var, io.reactivex.internal.operators.single.h0.d(), 2, io.reactivex.internal.util.j.IMMEDIATE));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> v(q0<? extends T>... q0VarArr) {
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.w(l.R2(q0VarArr), io.reactivex.internal.operators.single.h0.c(), 2, io.reactivex.internal.util.j.BOUNDARY));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> w(q0<? extends T>... q0VarArr) {
        return l.R2(q0VarArr).a1(io.reactivex.internal.operators.single.h0.c());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> w0(q0<? extends T> q0Var, q0<? extends T> q0Var2) {
        io.reactivex.internal.functions.b.g(q0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(q0Var2, "source2 is null");
        return A0(l.R2(q0Var, q0Var2));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> x(Iterable<? extends q0<? extends T>> iterable) {
        return l.X2(iterable).a1(io.reactivex.internal.operators.single.h0.c());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> x0(q0<? extends T> q0Var, q0<? extends T> q0Var2, q0<? extends T> q0Var3) {
        io.reactivex.internal.functions.b.g(q0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(q0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(q0Var3, "source3 is null");
        return A0(l.R2(q0Var, q0Var2, q0Var3));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> y(org.reactivestreams.u<? extends q0<? extends T>> uVar) {
        return l.Y2(uVar).a1(io.reactivex.internal.operators.single.h0.c());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> y0(q0<? extends T> q0Var, q0<? extends T> q0Var2, q0<? extends T> q0Var3, q0<? extends T> q0Var4) {
        io.reactivex.internal.functions.b.g(q0Var, "source1 is null");
        io.reactivex.internal.functions.b.g(q0Var2, "source2 is null");
        io.reactivex.internal.functions.b.g(q0Var3, "source3 is null");
        io.reactivex.internal.functions.b.g(q0Var4, "source4 is null");
        int i10 = 3 | 3;
        return A0(l.R2(q0Var, q0Var2, q0Var3, q0Var4));
    }

    private static <T> k0<T> y1(l<T> lVar) {
        return io.reactivex.plugins.a.S(new r3(lVar, null));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> z0(Iterable<? extends q0<? extends T>> iterable) {
        return A0(l.X2(iterable));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> k0<T> z1(q0<T> q0Var) {
        io.reactivex.internal.functions.b.g(q0Var, "onSubscribe is null");
        if (q0Var instanceof k0) {
            throw new IllegalArgumentException("unsafeCreate(Single) should be upgraded");
        }
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.f0(q0Var));
    }

    @cj.d
    @cj.h("none")
    public final k0<Boolean> A(Object obj) {
        return B(obj, io.reactivex.internal.functions.b.d());
    }

    @cj.f
    @cj.d
    @cj.h(cj.h.L)
    public final k0<T> A1(j0 j0Var) {
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.S(new w0(this, j0Var));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final k0<Boolean> B(Object obj, dj.d<Object, Object> dVar) {
        io.reactivex.internal.functions.b.g(obj, "value is null");
        io.reactivex.internal.functions.b.g(dVar, "comparer is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.c(this, obj, dVar));
    }

    @cj.d
    @cj.h(cj.h.M)
    public final k0<T> E(long j10, TimeUnit timeUnit) {
        return G(j10, timeUnit, io.reactivex.schedulers.b.a(), false);
    }

    @cj.d
    @cj.h(cj.h.L)
    public final k0<T> F(long j10, TimeUnit timeUnit, j0 j0Var) {
        return G(j10, timeUnit, j0Var, false);
    }

    @cj.f
    @cj.d
    @cj.h(cj.h.L)
    public final k0<T> G(long j10, TimeUnit timeUnit, j0 j0Var, boolean z10) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.f(this, j10, timeUnit, j0Var, z10));
    }

    @cj.d
    @cj.h(cj.h.M)
    public final k0<T> H(long j10, TimeUnit timeUnit, boolean z10) {
        return G(j10, timeUnit, io.reactivex.schedulers.b.a(), z10);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> H0(q0<? extends T> q0Var) {
        return w0(this, q0Var);
    }

    @cj.d
    @cj.h(cj.h.M)
    public final k0<T> I(long j10, TimeUnit timeUnit) {
        return J(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.d
    @cj.h(cj.h.L)
    public final k0<T> J(long j10, TimeUnit timeUnit, j0 j0Var) {
        return L(b0.P6(j10, timeUnit, j0Var));
    }

    @cj.f
    @cj.d
    @cj.h(cj.h.L)
    public final k0<T> J0(j0 j0Var) {
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.n0(this, j0Var));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final k0<T> K(i iVar) {
        io.reactivex.internal.functions.b.g(iVar, "other is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.g(this, iVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final k0<T> K0(dj.o<? super Throwable, ? extends q0<? extends T>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "resumeFunctionInCaseOfError is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.p0(this, oVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <U> k0<T> L(g0<U> g0Var) {
        io.reactivex.internal.functions.b.g(g0Var, "other is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.h(this, g0Var));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final k0<T> L0(k0<? extends T> k0Var) {
        io.reactivex.internal.functions.b.g(k0Var, "resumeSingleInCaseOfError is null");
        return K0(io.reactivex.internal.functions.a.n(k0Var));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <U> k0<T> M(q0<U> q0Var) {
        io.reactivex.internal.functions.b.g(q0Var, "other is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.j(this, q0Var));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final k0<T> M0(dj.o<Throwable, ? extends T> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "resumeFunction is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.o0(this, oVar, null));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U> k0<T> N(org.reactivestreams.u<U> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "other is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.i(this, uVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final k0<T> N0(T t10) {
        io.reactivex.internal.functions.b.g(t10, "value is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.o0(this, null, t10));
    }

    @cj.h("none")
    @cj.f
    @cj.e
    @cj.d
    public final <R> s<R> O(dj.o<? super T, a0<R>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "selector is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.single.k(this, oVar));
    }

    @cj.d
    @cj.h("none")
    public final k0<T> O0() {
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.l(this));
    }

    @cj.d
    @cj.h("none")
    public final <U, R> k0<R> O1(q0<U> q0Var, dj.c<? super T, ? super U, ? extends R> cVar) {
        return E1(this, q0Var, cVar);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final k0<T> P(dj.g<? super T> gVar) {
        io.reactivex.internal.functions.b.g(gVar, "onAfterSuccess is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.m(this, gVar));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> P0() {
        return u1().T4();
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final k0<T> Q(dj.a aVar) {
        io.reactivex.internal.functions.b.g(aVar, "onAfterTerminate is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.n(this, aVar));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> Q0(long j10) {
        return u1().U4(j10);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final k0<T> R(dj.a aVar) {
        io.reactivex.internal.functions.b.g(aVar, "onFinally is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.o(this, aVar));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> R0(dj.e eVar) {
        return u1().V4(eVar);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final k0<T> S(dj.a aVar) {
        io.reactivex.internal.functions.b.g(aVar, "onDispose is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.p(this, aVar));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> S0(dj.o<? super l<Object>, ? extends org.reactivestreams.u<?>> oVar) {
        return u1().W4(oVar);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final k0<T> T(dj.g<? super Throwable> gVar) {
        io.reactivex.internal.functions.b.g(gVar, "onError is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.q(this, gVar));
    }

    @cj.d
    @cj.h("none")
    public final k0<T> T0() {
        return y1(u1().n5());
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final k0<T> U(dj.b<? super T, ? super Throwable> bVar) {
        io.reactivex.internal.functions.b.g(bVar, "onEvent is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.r(this, bVar));
    }

    @cj.d
    @cj.h("none")
    public final k0<T> U0(long j10) {
        return y1(u1().o5(j10));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final k0<T> V(dj.g<? super io.reactivex.disposables.c> gVar) {
        io.reactivex.internal.functions.b.g(gVar, "onSubscribe is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.s(this, gVar));
    }

    @cj.d
    @cj.h("none")
    public final k0<T> V0(long j10, dj.r<? super Throwable> rVar) {
        return y1(u1().p5(j10, rVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final k0<T> W(dj.g<? super T> gVar) {
        io.reactivex.internal.functions.b.g(gVar, "onSuccess is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.t(this, gVar));
    }

    @cj.d
    @cj.h("none")
    public final k0<T> W0(dj.d<? super Integer, ? super Throwable> dVar) {
        return y1(u1().q5(dVar));
    }

    @cj.h("none")
    @cj.f
    @cj.e
    @cj.d
    public final k0<T> X(dj.a aVar) {
        io.reactivex.internal.functions.b.g(aVar, "onTerminate is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.u(this, aVar));
    }

    @cj.d
    @cj.h("none")
    public final k0<T> X0(dj.r<? super Throwable> rVar) {
        return y1(u1().r5(rVar));
    }

    @cj.d
    @cj.h("none")
    public final k0<T> Y0(dj.o<? super l<Throwable>, ? extends org.reactivestreams.u<?>> oVar) {
        return y1(u1().t5(oVar));
    }

    @cj.h("none")
    public final io.reactivex.disposables.c Z0() {
        return c1(io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.f298695f);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final io.reactivex.disposables.c a1(dj.b<? super T, ? super Throwable> bVar) {
        io.reactivex.internal.functions.b.g(bVar, "onCallback is null");
        io.reactivex.internal.observers.d dVar = new io.reactivex.internal.observers.d(bVar);
        f(dVar);
        return dVar;
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final s<T> b0(dj.r<? super T> rVar) {
        io.reactivex.internal.functions.b.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.z(this, rVar));
    }

    @cj.d
    @cj.h("none")
    public final io.reactivex.disposables.c b1(dj.g<? super T> gVar) {
        return c1(gVar, io.reactivex.internal.functions.a.f298695f);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <R> k0<R> c0(dj.o<? super T, ? extends q0<? extends R>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.x(this, oVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final io.reactivex.disposables.c c1(dj.g<? super T> gVar, dj.g<? super Throwable> gVar2) {
        io.reactivex.internal.functions.b.g(gVar, "onSuccess is null");
        io.reactivex.internal.functions.b.g(gVar2, "onError is null");
        io.reactivex.internal.observers.k kVar = new io.reactivex.internal.observers.k(gVar, gVar2);
        f(kVar);
        return kVar;
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final c d0(dj.o<? super T, ? extends i> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.single.y(this, oVar));
    }

    protected abstract void d1(@cj.f n0<? super T> n0Var);

    @cj.f
    @cj.d
    @cj.h("none")
    public final <R> s<R> e0(dj.o<? super T, ? extends y<? extends R>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.single.b0(this, oVar));
    }

    @cj.f
    @cj.d
    @cj.h(cj.h.L)
    public final k0<T> e1(j0 j0Var) {
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.q0(this, j0Var));
    }

    @Override // io.reactivex.q0
    @cj.h("none")
    public final void f(n0<? super T> n0Var) {
        io.reactivex.internal.functions.b.g(n0Var, "observer is null");
        n0<? super T> n0VarG0 = io.reactivex.plugins.a.g0(this, n0Var);
        io.reactivex.internal.functions.b.g(n0VarG0, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            d1(n0VarG0);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <R> b0<R> f0(dj.o<? super T, ? extends g0<? extends R>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.mixed.s(this, oVar));
    }

    @cj.d
    @cj.h("none")
    public final <E extends n0<? super T>> E f1(E e10) {
        f(e10);
        return e10;
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> g0(dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.single.c0(this, oVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final k0<T> g1(i iVar) {
        io.reactivex.internal.functions.b.g(iVar, "other is null");
        return i1(new io.reactivex.internal.operators.completable.o0(iVar));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U> l<U> h0(dj.o<? super T, ? extends Iterable<? extends U>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.single.z(this, oVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <E> k0<T> h1(q0<? extends E> q0Var) {
        io.reactivex.internal.functions.b.g(q0Var, "other is null");
        return i1(new u0(q0Var));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final k0<T> i(q0<? extends T> q0Var) {
        io.reactivex.internal.functions.b.g(q0Var, "other is null");
        return h(this, q0Var);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <U> b0<U> i0(dj.o<? super T, ? extends Iterable<? extends U>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.single.a0(this, oVar));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <E> k0<T> i1(org.reactivestreams.u<E> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "other is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.r0(this, uVar));
    }

    @cj.d
    @cj.h("none")
    public final <R> R j(@cj.f l0<T, ? extends R> l0Var) {
        return (R) ((l0) io.reactivex.internal.functions.b.g(l0Var, "converter is null")).a(this);
    }

    @cj.d
    @cj.h("none")
    public final io.reactivex.observers.n<T> j1() {
        io.reactivex.observers.n<T> nVar = new io.reactivex.observers.n<>();
        f(nVar);
        return nVar;
    }

    @cj.d
    @cj.h("none")
    public final T k() {
        io.reactivex.internal.observers.h hVar = new io.reactivex.internal.observers.h();
        f(hVar);
        return (T) hVar.c();
    }

    @cj.d
    @cj.h("none")
    public final io.reactivex.observers.n<T> k1(boolean z10) {
        io.reactivex.observers.n<T> nVar = new io.reactivex.observers.n<>();
        if (z10) {
            nVar.cancel();
        }
        f(nVar);
        return nVar;
    }

    @cj.d
    @cj.h("none")
    public final k0<T> l() {
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.b(this));
    }

    @cj.d
    @cj.h(cj.h.M)
    public final k0<T> l1(long j10, TimeUnit timeUnit) {
        return p1(j10, timeUnit, io.reactivex.schedulers.b.a(), null);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <U> k0<U> m(Class<? extends U> cls) {
        io.reactivex.internal.functions.b.g(cls, "clazz is null");
        return (k0<U>) u0(io.reactivex.internal.functions.a.e(cls));
    }

    @cj.d
    @cj.h(cj.h.L)
    public final k0<T> m1(long j10, TimeUnit timeUnit, j0 j0Var) {
        return p1(j10, timeUnit, j0Var, null);
    }

    @cj.d
    @cj.h("none")
    public final <R> k0<R> n(r0<? super T, ? extends R> r0Var) {
        return D1(((r0) io.reactivex.internal.functions.b.g(r0Var, "transformer is null")).a(this));
    }

    @cj.f
    @cj.d
    @cj.h(cj.h.L)
    public final k0<T> n1(long j10, TimeUnit timeUnit, j0 j0Var, q0<? extends T> q0Var) {
        io.reactivex.internal.functions.b.g(q0Var, "other is null");
        return p1(j10, timeUnit, j0Var, q0Var);
    }

    @cj.f
    @cj.d
    @cj.h(cj.h.M)
    public final k0<T> o1(long j10, TimeUnit timeUnit, q0<? extends T> q0Var) {
        io.reactivex.internal.functions.b.g(q0Var, "other is null");
        return p1(j10, timeUnit, io.reactivex.schedulers.b.a(), q0Var);
    }

    @cj.d
    @cj.h("none")
    public final k0<T> q0() {
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.g0(this));
    }

    @cj.d
    @cj.h("none")
    public final c r0() {
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.v(this));
    }

    @cj.d
    @cj.h("none")
    public final <R> R s1(dj.o<? super k0<T>, R> oVar) {
        try {
            return (R) ((dj.o) io.reactivex.internal.functions.b.g(oVar, "convert is null")).apply(this);
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            throw io.reactivex.internal.util.k.f(th2);
        }
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <R> k0<R> t0(p0<? extends R, ? super T> p0Var) {
        io.reactivex.internal.functions.b.g(p0Var, "lift is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.j0(this, p0Var));
    }

    @cj.d
    @cj.h("none")
    @Deprecated
    public final c t1() {
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.v(this));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <R> k0<R> u0(dj.o<? super T, ? extends R> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.k0(this, oVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> u1() {
        return this instanceof ej.b ? ((ej.b) this).e() : io.reactivex.plugins.a.P(new u0(this));
    }

    @cj.e
    @cj.d
    @cj.h("none")
    public final k0<a0<T>> v0() {
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.l0(this));
    }

    @cj.d
    @cj.h("none")
    public final Future<T> v1() {
        return (Future) f1(new io.reactivex.internal.observers.r());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.d
    @cj.h("none")
    public final s<T> w1() {
        return this instanceof ej.c ? ((ej.c) this).a() : io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.n0(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.d
    @cj.h("none")
    public final b0<T> x1() {
        return this instanceof ej.d ? ((ej.d) this).c() : io.reactivex.plugins.a.R(new v0(this));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> z(q0<? extends T> q0Var) {
        return o(this, q0Var);
    }
}
