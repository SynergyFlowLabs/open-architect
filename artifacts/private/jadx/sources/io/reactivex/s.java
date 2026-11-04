package io.reactivex;

import io.reactivex.internal.operators.flowable.d1;
import io.reactivex.internal.operators.maybe.a1;
import io.reactivex.internal.operators.maybe.b1;
import io.reactivex.internal.operators.maybe.c1;
import io.reactivex.internal.operators.maybe.e1;
import io.reactivex.internal.operators.maybe.f1;
import io.reactivex.internal.operators.maybe.g1;
import io.reactivex.internal.operators.maybe.h1;
import io.reactivex.internal.operators.maybe.i1;
import io.reactivex.internal.operators.maybe.j1;
import io.reactivex.internal.operators.maybe.k1;
import io.reactivex.internal.operators.maybe.l1;
import io.reactivex.internal.operators.maybe.m1;
import io.reactivex.internal.operators.maybe.n1;
import io.reactivex.internal.operators.maybe.o1;
import io.reactivex.internal.operators.maybe.p1;
import io.reactivex.internal.operators.maybe.q1;
import io.reactivex.internal.operators.maybe.r1;
import io.reactivex.internal.operators.maybe.s0;
import io.reactivex.internal.operators.maybe.s1;
import io.reactivex.internal.operators.maybe.t0;
import io.reactivex.internal.operators.maybe.t1;
import io.reactivex.internal.operators.maybe.u0;
import io.reactivex.internal.operators.maybe.u1;
import io.reactivex.internal.operators.maybe.v0;
import io.reactivex.internal.operators.maybe.w0;
import io.reactivex.internal.operators.maybe.x0;
import io.reactivex.internal.operators.maybe.y0;
import io.reactivex.internal.operators.maybe.z0;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public abstract class s<T> implements y<T> {
    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> A(org.reactivestreams.u<? extends y<? extends T>> uVar) {
        return l.Y2(uVar).a1(o1.k());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> A0(y<? extends T> yVar, y<? extends T> yVar2) {
        io.reactivex.internal.functions.b.g(yVar, "source1 is null");
        io.reactivex.internal.functions.b.g(yVar2, "source2 is null");
        return H0(yVar, yVar2);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> B0(y<? extends T> yVar, y<? extends T> yVar2, y<? extends T> yVar3) {
        io.reactivex.internal.functions.b.g(yVar, "source1 is null");
        io.reactivex.internal.functions.b.g(yVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(yVar3, "source3 is null");
        return H0(yVar, yVar2, yVar3);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> C0(y<? extends T> yVar, y<? extends T> yVar2, y<? extends T> yVar3, y<? extends T> yVar4) {
        io.reactivex.internal.functions.b.g(yVar, "source1 is null");
        io.reactivex.internal.functions.b.g(yVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(yVar3, "source3 is null");
        io.reactivex.internal.functions.b.g(yVar4, "source4 is null");
        return H0(yVar, yVar2, yVar3, yVar4);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> D0(Iterable<? extends y<? extends T>> iterable) {
        return E0(l.X2(iterable));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> E0(org.reactivestreams.u<? extends y<? extends T>> uVar) {
        return F0(uVar, Integer.MAX_VALUE);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> s<T> F(w<T> wVar) {
        io.reactivex.internal.functions.b.g(wVar, "onSubscribe is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.j(wVar));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> F0(org.reactivestreams.u<? extends y<? extends T>> uVar, int i10) {
        io.reactivex.internal.functions.b.g(uVar, "source is null");
        io.reactivex.internal.functions.b.h(i10, "maxConcurrency");
        return io.reactivex.plugins.a.P(new d1(uVar, o1.k(), false, i10, 1));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> s<T> G0(y<? extends y<? extends T>> yVar) {
        io.reactivex.internal.functions.b.g(yVar, "source is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.h0(yVar, io.reactivex.internal.functions.a.k()));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> s<T> H(Callable<? extends y<? extends T>> callable) {
        io.reactivex.internal.functions.b.g(callable, "maybeSupplier is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.k(callable));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> H0(y<? extends T>... yVarArr) {
        io.reactivex.internal.functions.b.g(yVarArr, "sources is null");
        if (yVarArr.length == 0) {
            return l.k2();
        }
        return yVarArr.length == 1 ? io.reactivex.plugins.a.P(new m1(yVarArr[0])) : io.reactivex.plugins.a.P(new x0(yVarArr));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> I0(y<? extends T>... yVarArr) {
        return yVarArr.length == 0 ? l.k2() : l.R2(yVarArr).B2(o1.k(), true, yVarArr.length);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> J0(y<? extends T> yVar, y<? extends T> yVar2) {
        io.reactivex.internal.functions.b.g(yVar, "source1 is null");
        io.reactivex.internal.functions.b.g(yVar2, "source2 is null");
        return I0(yVar, yVar2);
    }

    @cj.d
    @cj.h(cj.h.M)
    public static s<Long> J1(long j10, TimeUnit timeUnit) {
        return K1(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> K0(y<? extends T> yVar, y<? extends T> yVar2, y<? extends T> yVar3) {
        io.reactivex.internal.functions.b.g(yVar, "source1 is null");
        io.reactivex.internal.functions.b.g(yVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(yVar3, "source3 is null");
        return I0(yVar, yVar2, yVar3);
    }

    @cj.f
    @cj.d
    @cj.h(cj.h.L)
    public static s<Long> K1(long j10, TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.Q(new l1(Math.max(0L, j10), timeUnit, j0Var));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> L0(y<? extends T> yVar, y<? extends T> yVar2, y<? extends T> yVar3, y<? extends T> yVar4) {
        io.reactivex.internal.functions.b.g(yVar, "source1 is null");
        io.reactivex.internal.functions.b.g(yVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(yVar3, "source3 is null");
        io.reactivex.internal.functions.b.g(yVar4, "source4 is null");
        int i10 = 2 >> 2;
        return I0(yVar, yVar2, yVar3, yVar4);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> M0(Iterable<? extends y<? extends T>> iterable) {
        return l.X2(iterable).A2(o1.k(), true);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> N0(org.reactivestreams.u<? extends y<? extends T>> uVar) {
        return O0(uVar, Integer.MAX_VALUE);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> O0(org.reactivestreams.u<? extends y<? extends T>> uVar, int i10) {
        io.reactivex.internal.functions.b.g(uVar, "source is null");
        io.reactivex.internal.functions.b.h(i10, "maxConcurrency");
        return io.reactivex.plugins.a.P(new d1(uVar, o1.k(), true, i10, 1));
    }

    @cj.d
    @cj.h("none")
    public static <T> s<T> Q0() {
        return io.reactivex.plugins.a.Q(y0.f301025a);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> s<T> Q1(y<T> yVar) {
        if (yVar instanceof s) {
            throw new IllegalArgumentException("unsafeCreate(Maybe) should be upgraded");
        }
        io.reactivex.internal.functions.b.g(yVar, "onSubscribe is null");
        return io.reactivex.plugins.a.Q(new q1(yVar));
    }

    @cj.d
    @cj.h("none")
    public static <T, D> s<T> S1(Callable<? extends D> callable, dj.o<? super D, ? extends y<? extends T>> oVar, dj.g<? super D> gVar) {
        return T1(callable, oVar, gVar, true);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T, D> s<T> T1(Callable<? extends D> callable, dj.o<? super D, ? extends y<? extends T>> oVar, dj.g<? super D> gVar, boolean z10) {
        io.reactivex.internal.functions.b.g(callable, "resourceSupplier is null");
        io.reactivex.internal.functions.b.g(oVar, "sourceSupplier is null");
        io.reactivex.internal.functions.b.g(gVar, "disposer is null");
        return io.reactivex.plugins.a.Q(new s1(callable, oVar, gVar, z10));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> s<T> U1(y<T> yVar) {
        if (yVar instanceof s) {
            return io.reactivex.plugins.a.Q((s) yVar);
        }
        io.reactivex.internal.functions.b.g(yVar, "onSubscribe is null");
        return io.reactivex.plugins.a.Q(new q1(yVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T1, T2, R> s<R> V1(y<? extends T1> yVar, y<? extends T2> yVar2, dj.c<? super T1, ? super T2, ? extends R> cVar) {
        io.reactivex.internal.functions.b.g(yVar, "source1 is null");
        io.reactivex.internal.functions.b.g(yVar2, "source2 is null");
        return e2(io.reactivex.internal.functions.a.x(cVar), yVar, yVar2);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, R> s<R> W1(y<? extends T1> yVar, y<? extends T2> yVar2, y<? extends T3> yVar3, dj.h<? super T1, ? super T2, ? super T3, ? extends R> hVar) {
        io.reactivex.internal.functions.b.g(yVar, "source1 is null");
        io.reactivex.internal.functions.b.g(yVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(yVar3, "source3 is null");
        return e2(io.reactivex.internal.functions.a.y(hVar), yVar, yVar2, yVar3);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, T4, R> s<R> X1(y<? extends T1> yVar, y<? extends T2> yVar2, y<? extends T3> yVar3, y<? extends T4> yVar4, dj.i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> iVar) {
        io.reactivex.internal.functions.b.g(yVar, "source1 is null");
        io.reactivex.internal.functions.b.g(yVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(yVar3, "source3 is null");
        io.reactivex.internal.functions.b.g(yVar4, "source4 is null");
        return e2(io.reactivex.internal.functions.a.z(iVar), yVar, yVar2, yVar3, yVar4);
    }

    @cj.d
    @cj.h("none")
    public static <T> s<T> Y() {
        return io.reactivex.plugins.a.Q(io.reactivex.internal.operators.maybe.u.f300982a);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, T4, T5, R> s<R> Y1(y<? extends T1> yVar, y<? extends T2> yVar2, y<? extends T3> yVar3, y<? extends T4> yVar4, y<? extends T5> yVar5, dj.j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> jVar) {
        io.reactivex.internal.functions.b.g(yVar, "source1 is null");
        io.reactivex.internal.functions.b.g(yVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(yVar3, "source3 is null");
        io.reactivex.internal.functions.b.g(yVar4, "source4 is null");
        io.reactivex.internal.functions.b.g(yVar5, "source5 is null");
        return e2(io.reactivex.internal.functions.a.A(jVar), yVar, yVar2, yVar3, yVar4, yVar5);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> s<T> Z(Throwable th2) {
        io.reactivex.internal.functions.b.g(th2, "exception is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.w(th2));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, T4, T5, T6, R> s<R> Z1(y<? extends T1> yVar, y<? extends T2> yVar2, y<? extends T3> yVar3, y<? extends T4> yVar4, y<? extends T5> yVar5, y<? extends T6> yVar6, dj.k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> kVar) {
        io.reactivex.internal.functions.b.g(yVar, "source1 is null");
        io.reactivex.internal.functions.b.g(yVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(yVar3, "source3 is null");
        io.reactivex.internal.functions.b.g(yVar4, "source4 is null");
        io.reactivex.internal.functions.b.g(yVar5, "source5 is null");
        io.reactivex.internal.functions.b.g(yVar6, "source6 is null");
        int i10 = 7 ^ 5;
        return e2(io.reactivex.internal.functions.a.B(kVar), yVar, yVar2, yVar3, yVar4, yVar5, yVar6);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> s<T> a0(Callable<? extends Throwable> callable) {
        io.reactivex.internal.functions.b.g(callable, "errorSupplier is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.x(callable));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, T4, T5, T6, T7, R> s<R> a2(y<? extends T1> yVar, y<? extends T2> yVar2, y<? extends T3> yVar3, y<? extends T4> yVar4, y<? extends T5> yVar5, y<? extends T6> yVar6, y<? extends T7> yVar7, dj.l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> lVar) {
        io.reactivex.internal.functions.b.g(yVar, "source1 is null");
        io.reactivex.internal.functions.b.g(yVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(yVar3, "source3 is null");
        io.reactivex.internal.functions.b.g(yVar4, "source4 is null");
        io.reactivex.internal.functions.b.g(yVar5, "source5 is null");
        io.reactivex.internal.functions.b.g(yVar6, "source6 is null");
        io.reactivex.internal.functions.b.g(yVar7, "source7 is null");
        int i10 = 3 | 5;
        return e2(io.reactivex.internal.functions.a.C(lVar), yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> s<R> b2(y<? extends T1> yVar, y<? extends T2> yVar2, y<? extends T3> yVar3, y<? extends T4> yVar4, y<? extends T5> yVar5, y<? extends T6> yVar6, y<? extends T7> yVar7, y<? extends T8> yVar8, dj.m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> mVar) {
        io.reactivex.internal.functions.b.g(yVar, "source1 is null");
        io.reactivex.internal.functions.b.g(yVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(yVar3, "source3 is null");
        io.reactivex.internal.functions.b.g(yVar4, "source4 is null");
        io.reactivex.internal.functions.b.g(yVar5, "source5 is null");
        io.reactivex.internal.functions.b.g(yVar6, "source6 is null");
        io.reactivex.internal.functions.b.g(yVar7, "source7 is null");
        io.reactivex.internal.functions.b.g(yVar8, "source8 is null");
        return e2(io.reactivex.internal.functions.a.D(mVar), yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7, yVar8);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> s<R> c2(y<? extends T1> yVar, y<? extends T2> yVar2, y<? extends T3> yVar3, y<? extends T4> yVar4, y<? extends T5> yVar5, y<? extends T6> yVar6, y<? extends T7> yVar7, y<? extends T8> yVar8, y<? extends T9> yVar9, dj.n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> nVar) {
        io.reactivex.internal.functions.b.g(yVar, "source1 is null");
        io.reactivex.internal.functions.b.g(yVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(yVar3, "source3 is null");
        io.reactivex.internal.functions.b.g(yVar4, "source4 is null");
        io.reactivex.internal.functions.b.g(yVar5, "source5 is null");
        io.reactivex.internal.functions.b.g(yVar6, "source6 is null");
        io.reactivex.internal.functions.b.g(yVar7, "source7 is null");
        io.reactivex.internal.functions.b.g(yVar8, "source8 is null");
        io.reactivex.internal.functions.b.g(yVar9, "source9 is null");
        int i10 = 4 >> 0;
        return e2(io.reactivex.internal.functions.a.E(nVar), yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7, yVar8, yVar9);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T, R> s<R> d2(Iterable<? extends y<? extends T>> iterable, dj.o<? super Object[], ? extends R> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "zipper is null");
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return io.reactivex.plugins.a.Q(new u1(iterable, oVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T, R> s<R> e2(dj.o<? super Object[], ? extends R> oVar, y<? extends T>... yVarArr) {
        io.reactivex.internal.functions.b.g(yVarArr, "sources is null");
        if (yVarArr.length == 0) {
            return Y();
        }
        io.reactivex.internal.functions.b.g(oVar, "zipper is null");
        return io.reactivex.plugins.a.Q(new t1(yVarArr, oVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> s<T> f(Iterable<? extends y<? extends T>> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.b(null, iterable));
    }

    @cj.d
    @cj.h("none")
    public static <T> s<T> g(y<? extends T>... yVarArr) {
        if (yVarArr.length == 0) {
            return Y();
        }
        return yVarArr.length == 1 ? U1(yVarArr[0]) : io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.b(yVarArr, null));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> s<T> m0(dj.a aVar) {
        io.reactivex.internal.functions.b.g(aVar, "run is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.i0(aVar));
    }

    @cj.d
    @cj.h("none")
    public static <T> k0<Boolean> m1(y<? extends T> yVar, y<? extends T> yVar2) {
        return n1(yVar, yVar2, io.reactivex.internal.functions.b.d());
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> s<T> n0(@cj.f Callable<? extends T> callable) {
        io.reactivex.internal.functions.b.g(callable, "callable is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.j0(callable));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> k0<Boolean> n1(y<? extends T> yVar, y<? extends T> yVar2, dj.d<? super T, ? super T> dVar) {
        io.reactivex.internal.functions.b.g(yVar, "source1 is null");
        io.reactivex.internal.functions.b.g(yVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(dVar, "isEqual is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.maybe.v(yVar, yVar2, dVar));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> o(y<? extends T> yVar, y<? extends T> yVar2) {
        io.reactivex.internal.functions.b.g(yVar, "source1 is null");
        io.reactivex.internal.functions.b.g(yVar2, "source2 is null");
        int i10 = 5 ^ 0;
        return u(yVar, yVar2);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> s<T> o0(i iVar) {
        io.reactivex.internal.functions.b.g(iVar, "completableSource is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.k0(iVar));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> p(y<? extends T> yVar, y<? extends T> yVar2, y<? extends T> yVar3) {
        io.reactivex.internal.functions.b.g(yVar, "source1 is null");
        io.reactivex.internal.functions.b.g(yVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(yVar3, "source3 is null");
        return u(yVar, yVar2, yVar3);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> s<T> p0(Future<? extends T> future) {
        io.reactivex.internal.functions.b.g(future, "future is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.l0(future, 0L, null));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> q(y<? extends T> yVar, y<? extends T> yVar2, y<? extends T> yVar3, y<? extends T> yVar4) {
        io.reactivex.internal.functions.b.g(yVar, "source1 is null");
        io.reactivex.internal.functions.b.g(yVar2, "source2 is null");
        io.reactivex.internal.functions.b.g(yVar3, "source3 is null");
        io.reactivex.internal.functions.b.g(yVar4, "source4 is null");
        return u(yVar, yVar2, yVar3, yVar4);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> s<T> q0(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        io.reactivex.internal.functions.b.g(future, "future is null");
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.l0(future, j10, timeUnit));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> r(Iterable<? extends y<? extends T>> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.maybe.g(iterable));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> s<T> r0(Runnable runnable) {
        io.reactivex.internal.functions.b.g(runnable, "run is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.m0(runnable));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> s(org.reactivestreams.u<? extends y<? extends T>> uVar) {
        return t(uVar, 2);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> s<T> s0(q0<T> q0Var) {
        io.reactivex.internal.functions.b.g(q0Var, "singleSource is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.n0(q0Var));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> t(org.reactivestreams.u<? extends y<? extends T>> uVar, int i10) {
        io.reactivex.internal.functions.b.g(uVar, "sources is null");
        io.reactivex.internal.functions.b.h(i10, io.ktor.http.t1.b.f296115c);
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.flowable.z(uVar, o1.k(), i10, io.reactivex.internal.util.j.IMMEDIATE));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> u(y<? extends T>... yVarArr) {
        io.reactivex.internal.functions.b.g(yVarArr, "sources is null");
        if (yVarArr.length == 0) {
            return l.k2();
        }
        return yVarArr.length == 1 ? io.reactivex.plugins.a.P(new m1(yVarArr[0])) : io.reactivex.plugins.a.P(new io.reactivex.internal.operators.maybe.e(yVarArr));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> v(y<? extends T>... yVarArr) {
        if (yVarArr.length == 0) {
            return l.k2();
        }
        return yVarArr.length == 1 ? io.reactivex.plugins.a.P(new m1(yVarArr[0])) : io.reactivex.plugins.a.P(new io.reactivex.internal.operators.maybe.f(yVarArr));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> w(y<? extends T>... yVarArr) {
        return l.R2(yVarArr).a1(o1.k());
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> s<T> w0(T t10) {
        io.reactivex.internal.functions.b.g(t10, "item is null");
        return io.reactivex.plugins.a.Q(new t0(t10));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> l<T> x(Iterable<? extends y<? extends T>> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return l.X2(iterable).Y0(o1.k());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> y(org.reactivestreams.u<? extends y<? extends T>> uVar) {
        return l.Y2(uVar).Y0(o1.k());
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static <T> l<T> z(Iterable<? extends y<? extends T>> iterable) {
        return l.X2(iterable).a1(o1.k());
    }

    @cj.d
    @cj.h("none")
    public final io.reactivex.observers.n<T> A1(boolean z10) {
        io.reactivex.observers.n<T> nVar = new io.reactivex.observers.n<>();
        if (z10) {
            nVar.cancel();
        }
        a(nVar);
        return nVar;
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <R> s<R> B(dj.o<? super T, ? extends y<? extends R>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.h0(this, oVar));
    }

    @cj.d
    @cj.h(cj.h.M)
    public final s<T> B1(long j10, TimeUnit timeUnit) {
        return D1(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> C(y<? extends T> yVar) {
        io.reactivex.internal.functions.b.g(yVar, "other is null");
        return o(this, yVar);
    }

    @cj.f
    @cj.d
    @cj.h(cj.h.M)
    public final s<T> C1(long j10, TimeUnit timeUnit, y<? extends T> yVar) {
        io.reactivex.internal.functions.b.g(yVar, "fallback is null");
        return E1(j10, timeUnit, io.reactivex.schedulers.b.a(), yVar);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final k0<Boolean> D(Object obj) {
        io.reactivex.internal.functions.b.g(obj, "item is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.maybe.h(this, obj));
    }

    @cj.d
    @cj.h(cj.h.L)
    public final s<T> D1(long j10, TimeUnit timeUnit, j0 j0Var) {
        return F1(K1(j10, timeUnit, j0Var));
    }

    @cj.d
    @cj.h("none")
    public final k0<Long> E() {
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.maybe.i(this));
    }

    @cj.f
    @cj.d
    @cj.h(cj.h.L)
    public final s<T> E1(long j10, TimeUnit timeUnit, j0 j0Var, y<? extends T> yVar) {
        io.reactivex.internal.functions.b.g(yVar, "fallback is null");
        return G1(K1(j10, timeUnit, j0Var), yVar);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <U> s<T> F1(y<U> yVar) {
        io.reactivex.internal.functions.b.g(yVar, "timeoutIndicator is null");
        return io.reactivex.plugins.a.Q(new j1(this, yVar, null));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final s<T> G(T t10) {
        io.reactivex.internal.functions.b.g(t10, "defaultItem is null");
        return v1(w0(t10));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <U> s<T> G1(y<U> yVar, y<? extends T> yVar2) {
        io.reactivex.internal.functions.b.g(yVar, "timeoutIndicator is null");
        io.reactivex.internal.functions.b.g(yVar2, "fallback is null");
        return io.reactivex.plugins.a.Q(new j1(this, yVar, yVar2));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U> s<T> H1(org.reactivestreams.u<U> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "timeoutIndicator is null");
        return io.reactivex.plugins.a.Q(new k1(this, uVar, null));
    }

    @cj.d
    @cj.h(cj.h.M)
    public final s<T> I(long j10, TimeUnit timeUnit) {
        return J(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U> s<T> I1(org.reactivestreams.u<U> uVar, y<? extends T> yVar) {
        io.reactivex.internal.functions.b.g(uVar, "timeoutIndicator is null");
        io.reactivex.internal.functions.b.g(yVar, "fallback is null");
        return io.reactivex.plugins.a.Q(new k1(this, uVar, yVar));
    }

    @cj.f
    @cj.d
    @cj.h(cj.h.L)
    public final s<T> J(long j10, TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.l(this, Math.max(0L, j10), timeUnit, j0Var));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U, V> s<T> K(org.reactivestreams.u<U> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "delayIndicator is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.m(this, uVar));
    }

    @cj.d
    @cj.h(cj.h.M)
    public final s<T> L(long j10, TimeUnit timeUnit) {
        return M(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <R> R L1(dj.o<? super s<T>, R> oVar) {
        try {
            return (R) ((dj.o) io.reactivex.internal.functions.b.g(oVar, "convert is null")).apply(this);
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            throw io.reactivex.internal.util.k.f(th2);
        }
    }

    @cj.d
    @cj.h(cj.h.L)
    public final s<T> M(long j10, TimeUnit timeUnit, j0 j0Var) {
        return N(l.v7(j10, timeUnit, j0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> M1() {
        return this instanceof ej.b ? ((ej.b) this).e() : io.reactivex.plugins.a.P(new m1(this));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U> s<T> N(org.reactivestreams.u<U> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "subscriptionIndicator is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.n(this, uVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.d
    @cj.h("none")
    public final b0<T> N1() {
        return this instanceof ej.d ? ((ej.d) this).c() : io.reactivex.plugins.a.R(new n1(this));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final s<T> O(dj.g<? super T> gVar) {
        io.reactivex.internal.functions.b.g(gVar, "onAfterSuccess is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.q(this, gVar));
    }

    @cj.d
    @cj.h("none")
    public final k0<T> O1() {
        int i10 = 1 << 0;
        return io.reactivex.plugins.a.S(new p1(this, null));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final s<T> P(dj.a aVar) {
        dj.g gVarH = io.reactivex.internal.functions.a.h();
        dj.g gVarH2 = io.reactivex.internal.functions.a.h();
        dj.g gVarH3 = io.reactivex.internal.functions.a.h();
        dj.a aVar2 = io.reactivex.internal.functions.a.f298692c;
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.d1(this, gVarH, gVarH2, gVarH3, aVar2, (dj.a) io.reactivex.internal.functions.b.g(aVar, "onAfterTerminate is null"), aVar2));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final l<T> P0(y<? extends T> yVar) {
        io.reactivex.internal.functions.b.g(yVar, "other is null");
        return A0(this, yVar);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final k0<T> P1(T t10) {
        io.reactivex.internal.functions.b.g(t10, "defaultValue is null");
        return io.reactivex.plugins.a.S(new p1(this, t10));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final s<T> Q(dj.a aVar) {
        io.reactivex.internal.functions.b.g(aVar, "onFinally is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.r(this, aVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final s<T> R(dj.a aVar) {
        dj.g gVarH = io.reactivex.internal.functions.a.h();
        dj.g gVarH2 = io.reactivex.internal.functions.a.h();
        dj.g gVarH3 = io.reactivex.internal.functions.a.h();
        dj.a aVar2 = (dj.a) io.reactivex.internal.functions.b.g(aVar, "onComplete is null");
        dj.a aVar3 = io.reactivex.internal.functions.a.f298692c;
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.d1(this, gVarH, gVarH2, gVarH3, aVar2, aVar3, aVar3));
    }

    @cj.f
    @cj.d
    @cj.h(cj.h.L)
    public final s<T> R0(j0 j0Var) {
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.Q(new z0(this, j0Var));
    }

    @cj.f
    @cj.d
    @cj.h(cj.h.L)
    public final s<T> R1(j0 j0Var) {
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.Q(new r1(this, j0Var));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final s<T> S(dj.a aVar) {
        dj.g gVarH = io.reactivex.internal.functions.a.h();
        dj.g gVarH2 = io.reactivex.internal.functions.a.h();
        dj.g gVarH3 = io.reactivex.internal.functions.a.h();
        dj.a aVar2 = io.reactivex.internal.functions.a.f298692c;
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.d1(this, gVarH, gVarH2, gVarH3, aVar2, aVar2, (dj.a) io.reactivex.internal.functions.b.g(aVar, "onDispose is null")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.f
    @cj.d
    @cj.h("none")
    public final <U> s<U> S0(Class<U> cls) {
        io.reactivex.internal.functions.b.g(cls, "clazz is null");
        return b0(io.reactivex.internal.functions.a.l(cls)).m(cls);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final s<T> T(dj.g<? super Throwable> gVar) {
        dj.g gVarH = io.reactivex.internal.functions.a.h();
        dj.g gVarH2 = io.reactivex.internal.functions.a.h();
        dj.g gVar2 = (dj.g) io.reactivex.internal.functions.b.g(gVar, "onError is null");
        dj.a aVar = io.reactivex.internal.functions.a.f298692c;
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.d1(this, gVarH, gVarH2, gVar2, aVar, aVar, aVar));
    }

    @cj.d
    @cj.h("none")
    public final s<T> T0() {
        return U0(io.reactivex.internal.functions.a.c());
    }

    @cj.d
    @cj.h("none")
    public final s<T> U(dj.b<? super T, ? super Throwable> bVar) {
        io.reactivex.internal.functions.b.g(bVar, "onEvent is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.s(this, bVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final s<T> U0(dj.r<? super Throwable> rVar) {
        io.reactivex.internal.functions.b.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.Q(new a1(this, rVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final s<T> V(dj.g<? super io.reactivex.disposables.c> gVar) {
        dj.g gVar2 = (dj.g) io.reactivex.internal.functions.b.g(gVar, "onSubscribe is null");
        dj.g gVarH = io.reactivex.internal.functions.a.h();
        dj.g gVarH2 = io.reactivex.internal.functions.a.h();
        dj.a aVar = io.reactivex.internal.functions.a.f298692c;
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.d1(this, gVar2, gVarH, gVarH2, aVar, aVar, aVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final s<T> V0(dj.o<? super Throwable, ? extends y<? extends T>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "resumeFunction is null");
        return io.reactivex.plugins.a.Q(new b1(this, oVar, true));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final s<T> W(dj.g<? super T> gVar) {
        dj.g gVarH = io.reactivex.internal.functions.a.h();
        dj.g gVar2 = (dj.g) io.reactivex.internal.functions.b.g(gVar, "onSuccess is null");
        dj.g gVarH2 = io.reactivex.internal.functions.a.h();
        dj.a aVar = io.reactivex.internal.functions.a.f298692c;
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.d1(this, gVarH, gVar2, gVarH2, aVar, aVar, aVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final s<T> W0(y<? extends T> yVar) {
        io.reactivex.internal.functions.b.g(yVar, "next is null");
        return V0(io.reactivex.internal.functions.a.n(yVar));
    }

    @cj.h("none")
    @cj.f
    @cj.e
    @cj.d
    public final s<T> X(dj.a aVar) {
        io.reactivex.internal.functions.b.g(aVar, "onTerminate is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.t(this, aVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final s<T> X0(dj.o<? super Throwable, ? extends T> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "valueSupplier is null");
        return io.reactivex.plugins.a.Q(new c1(this, oVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final s<T> Y0(T t10) {
        io.reactivex.internal.functions.b.g(t10, "item is null");
        return X0(io.reactivex.internal.functions.a.n(t10));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final s<T> Z0(y<? extends T> yVar) {
        io.reactivex.internal.functions.b.g(yVar, "next is null");
        return io.reactivex.plugins.a.Q(new b1(this, io.reactivex.internal.functions.a.n(yVar), false));
    }

    @Override // io.reactivex.y
    @cj.h("none")
    public final void a(v<? super T> vVar) {
        io.reactivex.internal.functions.b.g(vVar, "observer is null");
        v<? super T> vVarE0 = io.reactivex.plugins.a.e0(this, vVar);
        io.reactivex.internal.functions.b.g(vVarE0, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            s1(vVarE0);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    @cj.d
    @cj.h("none")
    public final s<T> a1() {
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.p(this));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final s<T> b0(dj.r<? super T> rVar) {
        io.reactivex.internal.functions.b.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.y(this, rVar));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> b1() {
        return c1(Long.MAX_VALUE);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <R> s<R> c0(dj.o<? super T, ? extends y<? extends R>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.h0(this, oVar));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> c1(long j10) {
        return M1().U4(j10);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <U, R> s<R> d0(dj.o<? super T, ? extends y<? extends U>> oVar, dj.c<? super T, ? super U, ? extends R> cVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.g(cVar, "resultSelector is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.a0(this, oVar, cVar));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> d1(dj.e eVar) {
        return M1().V4(eVar);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <R> s<R> e0(dj.o<? super T, ? extends y<? extends R>> oVar, dj.o<? super Throwable, ? extends y<? extends R>> oVar2, Callable<? extends y<? extends R>> callable) {
        io.reactivex.internal.functions.b.g(oVar, "onSuccessMapper is null");
        io.reactivex.internal.functions.b.g(oVar2, "onErrorMapper is null");
        io.reactivex.internal.functions.b.g(callable, "onCompleteSupplier is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.e0(this, oVar, oVar2, callable));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> e1(dj.o<? super l<Object>, ? extends org.reactivestreams.u<?>> oVar) {
        return M1().W4(oVar);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final c f0(dj.o<? super T, ? extends i> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.maybe.b0(this, oVar));
    }

    @cj.d
    @cj.h("none")
    public final s<T> f1() {
        return h1(Long.MAX_VALUE, io.reactivex.internal.functions.a.c());
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <U, R> s<R> f2(y<? extends U> yVar, dj.c<? super T, ? super U, ? extends R> cVar) {
        io.reactivex.internal.functions.b.g(yVar, "other is null");
        return V1(this, yVar, cVar);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <R> b0<R> g0(dj.o<? super T, ? extends g0<? extends R>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.mixed.j(this, oVar));
    }

    @cj.d
    @cj.h("none")
    public final s<T> g1(long j10) {
        return h1(j10, io.reactivex.internal.functions.a.c());
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final s<T> h(y<? extends T> yVar) {
        io.reactivex.internal.functions.b.g(yVar, "other is null");
        return g(this, yVar);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <R> l<R> h0(dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.mixed.k(this, oVar));
    }

    @cj.d
    @cj.h("none")
    public final s<T> h1(long j10, dj.r<? super Throwable> rVar) {
        return M1().p5(j10, rVar).L5();
    }

    @cj.d
    @cj.h("none")
    public final <R> R i(@cj.f t<T, ? extends R> tVar) {
        return (R) ((t) io.reactivex.internal.functions.b.g(tVar, "converter is null")).a(this);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <R> k0<R> i0(dj.o<? super T, ? extends q0<? extends R>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.maybe.f0(this, oVar));
    }

    @cj.d
    @cj.h("none")
    public final s<T> i1(dj.d<? super Integer, ? super Throwable> dVar) {
        return M1().q5(dVar).L5();
    }

    @cj.d
    @cj.h("none")
    public final T j() {
        io.reactivex.internal.observers.h hVar = new io.reactivex.internal.observers.h();
        a(hVar);
        return (T) hVar.c();
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <R> s<R> j0(dj.o<? super T, ? extends q0<? extends R>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.g0(this, oVar));
    }

    @cj.d
    @cj.h("none")
    public final s<T> j1(dj.r<? super Throwable> rVar) {
        return h1(Long.MAX_VALUE, rVar);
    }

    @cj.d
    @cj.h("none")
    public final T k(T t10) {
        io.reactivex.internal.functions.b.g(t10, "defaultValue is null");
        io.reactivex.internal.observers.h hVar = new io.reactivex.internal.observers.h();
        a(hVar);
        return (T) hVar.e(t10);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U> l<U> k0(dj.o<? super T, ? extends Iterable<? extends U>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.maybe.c0(this, oVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final s<T> k1(dj.e eVar) {
        io.reactivex.internal.functions.b.g(eVar, "stop is null");
        return h1(Long.MAX_VALUE, io.reactivex.internal.functions.a.v(eVar));
    }

    @cj.d
    @cj.h("none")
    public final s<T> l() {
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.c(this));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <U> b0<U> l0(dj.o<? super T, ? extends Iterable<? extends U>> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.maybe.d0(this, oVar));
    }

    @cj.d
    @cj.h("none")
    public final s<T> l1(dj.o<? super l<Throwable>, ? extends org.reactivestreams.u<?>> oVar) {
        return M1().t5(oVar).L5();
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <U> s<U> m(Class<? extends U> cls) {
        io.reactivex.internal.functions.b.g(cls, "clazz is null");
        return (s<U>) y0(io.reactivex.internal.functions.a.e(cls));
    }

    @cj.d
    @cj.h("none")
    public final <R> s<R> n(z<? super T, ? extends R> zVar) {
        return U1(((z) io.reactivex.internal.functions.b.g(zVar, "transformer is null")).a(this));
    }

    @cj.h("none")
    public final io.reactivex.disposables.c o1() {
        return r1(io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.f298695f, io.reactivex.internal.functions.a.f298692c);
    }

    @cj.d
    @cj.h("none")
    public final io.reactivex.disposables.c p1(dj.g<? super T> gVar) {
        return r1(gVar, io.reactivex.internal.functions.a.f298695f, io.reactivex.internal.functions.a.f298692c);
    }

    @cj.d
    @cj.h("none")
    public final io.reactivex.disposables.c q1(dj.g<? super T> gVar, dj.g<? super Throwable> gVar2) {
        return r1(gVar, gVar2, io.reactivex.internal.functions.a.f298692c);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final io.reactivex.disposables.c r1(dj.g<? super T> gVar, dj.g<? super Throwable> gVar2, dj.a aVar) {
        io.reactivex.internal.functions.b.g(gVar, "onSuccess is null");
        io.reactivex.internal.functions.b.g(gVar2, "onError is null");
        io.reactivex.internal.functions.b.g(aVar, "onComplete is null");
        return (io.reactivex.disposables.c) u1(new io.reactivex.internal.operators.maybe.d(gVar, gVar2, aVar));
    }

    protected abstract void s1(v<? super T> vVar);

    @cj.d
    @cj.h("none")
    public final s<T> t0() {
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.o0(this));
    }

    @cj.f
    @cj.d
    @cj.h(cj.h.L)
    public final s<T> t1(j0 j0Var) {
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.Q(new e1(this, j0Var));
    }

    @cj.d
    @cj.h("none")
    public final c u0() {
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.maybe.q0(this));
    }

    @cj.d
    @cj.h("none")
    public final <E extends v<? super T>> E u1(E e10) {
        a(e10);
        return e10;
    }

    @cj.d
    @cj.h("none")
    public final k0<Boolean> v0() {
        return io.reactivex.plugins.a.S(new s0(this));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final s<T> v1(y<? extends T> yVar) {
        io.reactivex.internal.functions.b.g(yVar, "other is null");
        return io.reactivex.plugins.a.Q(new f1(this, yVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final k0<T> w1(q0<? extends T> q0Var) {
        io.reactivex.internal.functions.b.g(q0Var, "other is null");
        return io.reactivex.plugins.a.S(new g1(this, q0Var));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <R> s<R> x0(x<? extends R, ? super T> xVar) {
        io.reactivex.internal.functions.b.g(xVar, "lift is null");
        return io.reactivex.plugins.a.Q(new u0(this, xVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <U> s<T> x1(y<U> yVar) {
        io.reactivex.internal.functions.b.g(yVar, "other is null");
        return io.reactivex.plugins.a.Q(new h1(this, yVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <R> s<R> y0(dj.o<? super T, ? extends R> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        return io.reactivex.plugins.a.Q(new v0(this, oVar));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <U> s<T> y1(org.reactivestreams.u<U> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "other is null");
        return io.reactivex.plugins.a.Q(new i1(this, uVar));
    }

    @cj.e
    @cj.d
    @cj.h("none")
    public final k0<a0<T>> z0() {
        return io.reactivex.plugins.a.S(new w0(this));
    }

    @cj.d
    @cj.h("none")
    public final io.reactivex.observers.n<T> z1() {
        io.reactivex.observers.n<T> nVar = new io.reactivex.observers.n<>();
        a(nVar);
        return nVar;
    }
}
