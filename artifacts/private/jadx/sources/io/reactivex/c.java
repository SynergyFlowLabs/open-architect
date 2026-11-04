package io.reactivex;

import io.ktor.http.t1;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public abstract class c implements i {
    @cj.f
    @cj.d
    @cj.h("none")
    public static c A(g gVar) {
        io.reactivex.internal.functions.b.g(gVar, "source is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.g(gVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static c B(Callable<? extends i> callable) {
        io.reactivex.internal.functions.b.g(callable, "completableSupplier");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.h(callable));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    private c N(dj.g<? super io.reactivex.disposables.c> gVar, dj.g<? super Throwable> gVar2, dj.a aVar, dj.a aVar2, dj.a aVar3, dj.a aVar4) {
        io.reactivex.internal.functions.b.g(gVar, "onSubscribe is null");
        io.reactivex.internal.functions.b.g(gVar2, "onError is null");
        io.reactivex.internal.functions.b.g(aVar, "onComplete is null");
        io.reactivex.internal.functions.b.g(aVar2, "onTerminate is null");
        io.reactivex.internal.functions.b.g(aVar3, "onAfterTerminate is null");
        io.reactivex.internal.functions.b.g(aVar4, "onDispose is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.i0(this, gVar, gVar2, aVar, aVar2, aVar3, aVar4));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static c Q(Throwable th2) {
        io.reactivex.internal.functions.b.g(th2, "error is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.o(th2));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static c R(Callable<? extends Throwable> callable) {
        io.reactivex.internal.functions.b.g(callable, "errorSupplier is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.p(callable));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static c S(dj.a aVar) {
        io.reactivex.internal.functions.b.g(aVar, "run is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.q(aVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static c T(Callable<?> callable) {
        io.reactivex.internal.functions.b.g(callable, "callable is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.r(callable));
    }

    @cj.f
    @cj.d
    @cj.h(cj.h.L)
    private c T0(long j10, TimeUnit timeUnit, j0 j0Var, i iVar) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.m0(this, j10, timeUnit, j0Var, iVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static c U(Future<?> future) {
        io.reactivex.internal.functions.b.g(future, "future is null");
        return S(io.reactivex.internal.functions.a.j(future));
    }

    @cj.d
    @cj.h(cj.h.M)
    public static c U0(long j10, TimeUnit timeUnit) {
        return V0(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> c V(y<T> yVar) {
        io.reactivex.internal.functions.b.g(yVar, "maybe is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.maybe.q0(yVar));
    }

    @cj.f
    @cj.d
    @cj.h(cj.h.L)
    public static c V0(long j10, TimeUnit timeUnit, j0 j0Var) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.n0(j10, timeUnit, j0Var));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> c W(g0<T> g0Var) {
        io.reactivex.internal.functions.b.g(g0Var, "observable is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.s(g0Var));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.h("none")
    @cj.f
    @cj.d
    public static <T> c X(org.reactivestreams.u<T> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "publisher is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.t(uVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static c Y(Runnable runnable) {
        io.reactivex.internal.functions.b.g(runnable, "run is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.u(runnable));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <T> c Z(q0<T> q0Var) {
        io.reactivex.internal.functions.b.g(q0Var, "single is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.v(q0Var));
    }

    private static NullPointerException Z0(Throwable th2) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th2);
        return nullPointerException;
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static c d0(Iterable<? extends i> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.e0(iterable));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static c d1(i iVar) {
        io.reactivex.internal.functions.b.g(iVar, "source is null");
        if (iVar instanceof c) {
            throw new IllegalArgumentException("Use of unsafeCreate(Completable)!");
        }
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.w(iVar));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public static c e0(org.reactivestreams.u<? extends i> uVar) {
        return g0(uVar, Integer.MAX_VALUE, false);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static c f(Iterable<? extends i> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.a(null, iterable));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static c f0(org.reactivestreams.u<? extends i> uVar, int i10) {
        return g0(uVar, i10, false);
    }

    @cj.d
    @cj.h("none")
    public static <R> c f1(Callable<R> callable, dj.o<? super R, ? extends i> oVar, dj.g<? super R> gVar) {
        return g1(callable, oVar, gVar, true);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static c g(i... iVarArr) {
        io.reactivex.internal.functions.b.g(iVarArr, "sources is null");
        if (iVarArr.length == 0) {
            return t();
        }
        return iVarArr.length == 1 ? h1(iVarArr[0]) : io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.a(iVarArr, null));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    private static c g0(org.reactivestreams.u<? extends i> uVar, int i10, boolean z10) {
        io.reactivex.internal.functions.b.g(uVar, "sources is null");
        io.reactivex.internal.functions.b.h(i10, "maxConcurrency");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.a0(uVar, i10, z10));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static <R> c g1(Callable<R> callable, dj.o<? super R, ? extends i> oVar, dj.g<? super R> gVar, boolean z10) {
        io.reactivex.internal.functions.b.g(callable, "resourceSupplier is null");
        io.reactivex.internal.functions.b.g(oVar, "completableFunction is null");
        io.reactivex.internal.functions.b.g(gVar, "disposer is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.r0(callable, oVar, gVar, z10));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static c h0(i... iVarArr) {
        io.reactivex.internal.functions.b.g(iVarArr, "sources is null");
        if (iVarArr.length == 0) {
            return t();
        }
        return iVarArr.length == 1 ? h1(iVarArr[0]) : io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.b0(iVarArr));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static c h1(i iVar) {
        io.reactivex.internal.functions.b.g(iVar, "source is null");
        return iVar instanceof c ? io.reactivex.plugins.a.O((c) iVar) : io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.w(iVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static c i0(i... iVarArr) {
        io.reactivex.internal.functions.b.g(iVarArr, "sources is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.c0(iVarArr));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static c j0(Iterable<? extends i> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.d0(iterable));
    }

    @cj.b(cj.a.UNBOUNDED_IN)
    @cj.d
    @cj.h("none")
    public static c k0(org.reactivestreams.u<? extends i> uVar) {
        return g0(uVar, Integer.MAX_VALUE, true);
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static c l0(org.reactivestreams.u<? extends i> uVar, int i10) {
        return g0(uVar, i10, true);
    }

    @cj.d
    @cj.h("none")
    public static c n0() {
        return io.reactivex.plugins.a.O(io.reactivex.internal.operators.completable.f0.f298911a);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static c t() {
        return io.reactivex.plugins.a.O(io.reactivex.internal.operators.completable.n.f299000a);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static c v(Iterable<? extends i> iterable) {
        io.reactivex.internal.functions.b.g(iterable, "sources is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.f(iterable));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public static c w(org.reactivestreams.u<? extends i> uVar) {
        return x(uVar, 2);
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public static c x(org.reactivestreams.u<? extends i> uVar, int i10) {
        io.reactivex.internal.functions.b.g(uVar, "sources is null");
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.d(uVar, i10));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public static c y(i... iVarArr) {
        io.reactivex.internal.functions.b.g(iVarArr, "sources is null");
        if (iVarArr.length == 0) {
            return t();
        }
        return iVarArr.length == 1 ? h1(iVarArr[0]) : io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.e(iVarArr));
    }

    @cj.d
    @cj.h("none")
    public final c A0(dj.d<? super Integer, ? super Throwable> dVar) {
        return X(X0().q5(dVar));
    }

    @cj.d
    @cj.h("none")
    public final c B0(dj.r<? super Throwable> rVar) {
        return X(X0().r5(rVar));
    }

    @cj.d
    @cj.h(cj.h.M)
    public final c C(long j10, TimeUnit timeUnit) {
        return E(j10, timeUnit, io.reactivex.schedulers.b.a(), false);
    }

    @cj.d
    @cj.h("none")
    public final c C0(dj.o<? super l<Throwable>, ? extends org.reactivestreams.u<?>> oVar) {
        return X(X0().t5(oVar));
    }

    @cj.d
    @cj.h(cj.h.L)
    public final c D(long j10, TimeUnit timeUnit, j0 j0Var) {
        return E(j10, timeUnit, j0Var, false);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final c D0(i iVar) {
        io.reactivex.internal.functions.b.g(iVar, "other is null");
        int i10 = 0 << 1;
        return y(iVar, this);
    }

    @cj.f
    @cj.d
    @cj.h(cj.h.L)
    public final c E(long j10, TimeUnit timeUnit, j0 j0Var, boolean z10) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.i(this, j10, timeUnit, j0Var, z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <T> l<T> E0(org.reactivestreams.u<T> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "other is null");
        return X0().c6(uVar);
    }

    @cj.e
    @cj.d
    @cj.h(cj.h.M)
    public final c F(long j10, TimeUnit timeUnit) {
        return G(j10, timeUnit, io.reactivex.schedulers.b.a());
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <T> b0<T> F0(b0<T> b0Var) {
        io.reactivex.internal.functions.b.g(b0Var, "other is null");
        return b0Var.m1(a1());
    }

    @cj.e
    @cj.d
    @cj.h(cj.h.L)
    public final c G(long j10, TimeUnit timeUnit, j0 j0Var) {
        return V0(j10, timeUnit, j0Var).i(this);
    }

    @cj.h("none")
    public final io.reactivex.disposables.c G0() {
        io.reactivex.internal.observers.o oVar = new io.reactivex.internal.observers.o();
        b(oVar);
        return oVar;
    }

    @cj.d
    @cj.h("none")
    public final c H(dj.a aVar) {
        dj.g<? super io.reactivex.disposables.c> gVarH = io.reactivex.internal.functions.a.h();
        dj.g<? super Throwable> gVarH2 = io.reactivex.internal.functions.a.h();
        dj.a aVar2 = io.reactivex.internal.functions.a.f298692c;
        return N(gVarH, gVarH2, aVar2, aVar2, aVar, aVar2);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final io.reactivex.disposables.c H0(dj.a aVar) {
        io.reactivex.internal.functions.b.g(aVar, "onComplete is null");
        io.reactivex.internal.observers.j jVar = new io.reactivex.internal.observers.j(aVar);
        b(jVar);
        return jVar;
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final c I(dj.a aVar) {
        io.reactivex.internal.functions.b.g(aVar, "onFinally is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.l(this, aVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final io.reactivex.disposables.c I0(dj.a aVar, dj.g<? super Throwable> gVar) {
        io.reactivex.internal.functions.b.g(gVar, "onError is null");
        io.reactivex.internal.functions.b.g(aVar, "onComplete is null");
        io.reactivex.internal.observers.j jVar = new io.reactivex.internal.observers.j(gVar, aVar);
        b(jVar);
        return jVar;
    }

    @cj.d
    @cj.h("none")
    public final c J(dj.a aVar) {
        dj.g<? super io.reactivex.disposables.c> gVarH = io.reactivex.internal.functions.a.h();
        dj.g<? super Throwable> gVarH2 = io.reactivex.internal.functions.a.h();
        dj.a aVar2 = io.reactivex.internal.functions.a.f298692c;
        return N(gVarH, gVarH2, aVar, aVar2, aVar2, aVar2);
    }

    protected abstract void J0(f fVar);

    @cj.d
    @cj.h("none")
    public final c K(dj.a aVar) {
        dj.g<? super io.reactivex.disposables.c> gVarH = io.reactivex.internal.functions.a.h();
        dj.g<? super Throwable> gVarH2 = io.reactivex.internal.functions.a.h();
        dj.a aVar2 = io.reactivex.internal.functions.a.f298692c;
        return N(gVarH, gVarH2, aVar2, aVar2, aVar2, aVar);
    }

    @cj.f
    @cj.d
    @cj.h(cj.h.L)
    public final c K0(j0 j0Var) {
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.k0(this, j0Var));
    }

    @cj.d
    @cj.h("none")
    public final c L(dj.g<? super Throwable> gVar) {
        dj.g<? super io.reactivex.disposables.c> gVarH = io.reactivex.internal.functions.a.h();
        dj.a aVar = io.reactivex.internal.functions.a.f298692c;
        return N(gVarH, gVar, aVar, aVar, aVar, aVar);
    }

    @cj.d
    @cj.h("none")
    public final <E extends f> E L0(E e10) {
        b(e10);
        return e10;
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final c M(dj.g<? super Throwable> gVar) {
        io.reactivex.internal.functions.b.g(gVar, "onEvent is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.m(this, gVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final c M0(i iVar) {
        io.reactivex.internal.functions.b.g(iVar, "other is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.l0(this, iVar));
    }

    @cj.d
    @cj.h("none")
    public final io.reactivex.observers.n<Void> N0() {
        io.reactivex.observers.n<Void> nVar = new io.reactivex.observers.n<>();
        b(nVar);
        return nVar;
    }

    @cj.d
    @cj.h("none")
    public final c O(dj.g<? super io.reactivex.disposables.c> gVar) {
        dj.g<? super Throwable> gVarH = io.reactivex.internal.functions.a.h();
        dj.a aVar = io.reactivex.internal.functions.a.f298692c;
        return N(gVar, gVarH, aVar, aVar, aVar, aVar);
    }

    @cj.d
    @cj.h("none")
    public final io.reactivex.observers.n<Void> O0(boolean z10) {
        io.reactivex.observers.n<Void> nVar = new io.reactivex.observers.n<>();
        if (z10) {
            nVar.cancel();
        }
        b(nVar);
        return nVar;
    }

    @cj.d
    @cj.h("none")
    public final c P(dj.a aVar) {
        dj.g<? super io.reactivex.disposables.c> gVarH = io.reactivex.internal.functions.a.h();
        dj.g<? super Throwable> gVarH2 = io.reactivex.internal.functions.a.h();
        dj.a aVar2 = io.reactivex.internal.functions.a.f298692c;
        return N(gVarH, gVarH2, aVar2, aVar, aVar2, aVar2);
    }

    @cj.d
    @cj.h(cj.h.M)
    public final c P0(long j10, TimeUnit timeUnit) {
        return T0(j10, timeUnit, io.reactivex.schedulers.b.a(), null);
    }

    @cj.f
    @cj.d
    @cj.h(cj.h.M)
    public final c Q0(long j10, TimeUnit timeUnit, i iVar) {
        io.reactivex.internal.functions.b.g(iVar, "other is null");
        return T0(j10, timeUnit, io.reactivex.schedulers.b.a(), iVar);
    }

    @cj.d
    @cj.h(cj.h.L)
    public final c R0(long j10, TimeUnit timeUnit, j0 j0Var) {
        return T0(j10, timeUnit, j0Var, null);
    }

    @cj.f
    @cj.d
    @cj.h(cj.h.L)
    public final c S0(long j10, TimeUnit timeUnit, j0 j0Var, i iVar) {
        io.reactivex.internal.functions.b.g(iVar, "other is null");
        return T0(j10, timeUnit, j0Var, iVar);
    }

    @cj.d
    @cj.h("none")
    public final <U> U W0(dj.o<? super c, U> oVar) {
        try {
            return (U) ((dj.o) io.reactivex.internal.functions.b.g(oVar, "converter is null")).apply(this);
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            throw io.reactivex.internal.util.k.f(th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final <T> l<T> X0() {
        return this instanceof ej.b ? ((ej.b) this).e() : io.reactivex.plugins.a.P(new io.reactivex.internal.operators.completable.o0(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.d
    @cj.h("none")
    public final <T> s<T> Y0() {
        return this instanceof ej.c ? ((ej.c) this).a() : io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.k0(this));
    }

    @cj.d
    @cj.h("none")
    public final c a0() {
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.x(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cj.d
    @cj.h("none")
    public final <T> b0<T> a1() {
        return this instanceof ej.d ? ((ej.d) this).c() : io.reactivex.plugins.a.R(new io.reactivex.internal.operators.completable.p0(this));
    }

    @Override // io.reactivex.i
    @cj.h("none")
    public final void b(f fVar) {
        io.reactivex.internal.functions.b.g(fVar, "observer is null");
        try {
            f fVarD0 = io.reactivex.plugins.a.d0(this, fVar);
            io.reactivex.internal.functions.b.g(fVarD0, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            J0(fVarD0);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.plugins.a.Y(th2);
            throw Z0(th2);
        }
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final c b0(h hVar) {
        io.reactivex.internal.functions.b.g(hVar, "onLift is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.y(this, hVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <T> k0<T> b1(Callable<? extends T> callable) {
        io.reactivex.internal.functions.b.g(callable, "completionValueSupplier is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.completable.q0(this, callable, null));
    }

    @cj.e
    @cj.d
    @cj.h("none")
    public final <T> k0<a0<T>> c0() {
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.completable.z(this));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <T> k0<T> c1(T t10) {
        io.reactivex.internal.functions.b.g(t10, "completionValue is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.completable.q0(this, null, t10));
    }

    @cj.f
    @cj.d
    @cj.h(cj.h.L)
    public final c e1(j0 j0Var) {
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.k(this, j0Var));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final c h(i iVar) {
        io.reactivex.internal.functions.b.g(iVar, "other is null");
        return g(this, iVar);
    }

    @cj.d
    @cj.h("none")
    public final c i(i iVar) {
        io.reactivex.internal.functions.b.g(iVar, "next is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.b(this, iVar));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @cj.f
    @cj.d
    public final <T> l<T> j(org.reactivestreams.u<T> uVar) {
        io.reactivex.internal.functions.b.g(uVar, "next is null");
        return io.reactivex.plugins.a.P(new io.reactivex.internal.operators.mixed.b(this, uVar));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <T> s<T> k(y<T> yVar) {
        io.reactivex.internal.functions.b.g(yVar, "next is null");
        return io.reactivex.plugins.a.Q(new io.reactivex.internal.operators.maybe.o(yVar, this));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <T> b0<T> l(g0<T> g0Var) {
        io.reactivex.internal.functions.b.g(g0Var, "next is null");
        return io.reactivex.plugins.a.R(new io.reactivex.internal.operators.mixed.a(this, g0Var));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final <T> k0<T> m(q0<T> q0Var) {
        io.reactivex.internal.functions.b.g(q0Var, "next is null");
        return io.reactivex.plugins.a.S(new io.reactivex.internal.operators.single.g(q0Var, this));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final c m0(i iVar) {
        io.reactivex.internal.functions.b.g(iVar, "other is null");
        int i10 = 4 & 0;
        return h0(this, iVar);
    }

    @cj.d
    @cj.h("none")
    public final <R> R n(@cj.f d<? extends R> dVar) {
        return (R) ((d) io.reactivex.internal.functions.b.g(dVar, "converter is null")).a(this);
    }

    @cj.h("none")
    public final void o() {
        io.reactivex.internal.observers.h hVar = new io.reactivex.internal.observers.h();
        b(hVar);
        hVar.c();
    }

    @cj.f
    @cj.d
    @cj.h(cj.h.L)
    public final c o0(j0 j0Var) {
        io.reactivex.internal.functions.b.g(j0Var, "scheduler is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.g0(this, j0Var));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final boolean p(long j10, TimeUnit timeUnit) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.observers.h hVar = new io.reactivex.internal.observers.h();
        b(hVar);
        return hVar.a(j10, timeUnit);
    }

    @cj.d
    @cj.h("none")
    public final c p0() {
        return q0(io.reactivex.internal.functions.a.c());
    }

    @cj.g
    @cj.d
    @cj.h("none")
    public final Throwable q() {
        io.reactivex.internal.observers.h hVar = new io.reactivex.internal.observers.h();
        b(hVar);
        return hVar.f();
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final c q0(dj.r<? super Throwable> rVar) {
        io.reactivex.internal.functions.b.g(rVar, "predicate is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.h0(this, rVar));
    }

    @cj.g
    @cj.d
    @cj.h("none")
    public final Throwable r(long j10, TimeUnit timeUnit) {
        io.reactivex.internal.functions.b.g(timeUnit, "unit is null");
        io.reactivex.internal.observers.h hVar = new io.reactivex.internal.observers.h();
        b(hVar);
        return hVar.g(j10, timeUnit);
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final c r0(dj.o<? super Throwable, ? extends i> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "errorMapper is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.j0(this, oVar));
    }

    @cj.d
    @cj.h("none")
    public final c s() {
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.c(this));
    }

    @cj.d
    @cj.h("none")
    public final c s0() {
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.j(this));
    }

    @cj.d
    @cj.h("none")
    public final c t0() {
        return X(X0().T4());
    }

    @cj.d
    @cj.h("none")
    public final c u(j jVar) {
        return h1(((j) io.reactivex.internal.functions.b.g(jVar, "transformer is null")).a(this));
    }

    @cj.d
    @cj.h("none")
    public final c u0(long j10) {
        return X(X0().U4(j10));
    }

    @cj.d
    @cj.h("none")
    public final c v0(dj.e eVar) {
        return X(X0().V4(eVar));
    }

    @cj.d
    @cj.h("none")
    public final c w0(dj.o<? super l<Object>, ? extends org.reactivestreams.u<?>> oVar) {
        return X(X0().W4(oVar));
    }

    @cj.d
    @cj.h("none")
    public final c x0() {
        return X(X0().n5());
    }

    @cj.d
    @cj.h("none")
    public final c y0(long j10) {
        return X(X0().o5(j10));
    }

    @cj.f
    @cj.d
    @cj.h("none")
    public final c z(i iVar) {
        io.reactivex.internal.functions.b.g(iVar, "other is null");
        return io.reactivex.plugins.a.O(new io.reactivex.internal.operators.completable.b(this, iVar));
    }

    @cj.d
    @cj.h("none")
    public final c z0(long j10, dj.r<? super Throwable> rVar) {
        return X(X0().p5(j10, rVar));
    }
}
