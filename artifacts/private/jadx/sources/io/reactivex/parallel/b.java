package io.reactivex.parallel;

import cj.f;
import dj.o;
import dj.q;
import dj.r;
import io.ktor.http.t1;
import io.reactivex.internal.operators.parallel.e;
import io.reactivex.internal.operators.parallel.g;
import io.reactivex.internal.operators.parallel.h;
import io.reactivex.internal.operators.parallel.i;
import io.reactivex.internal.operators.parallel.j;
import io.reactivex.internal.operators.parallel.k;
import io.reactivex.internal.operators.parallel.m;
import io.reactivex.internal.operators.parallel.n;
import io.reactivex.internal.operators.parallel.p;
import io.reactivex.internal.util.w;
import io.reactivex.j0;
import io.reactivex.l;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import org.reactivestreams.u;
import org.reactivestreams.v;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b<T> {
    @f
    @cj.d
    public static <T> b<T> A(@f u<? extends T> uVar, int i10, int i11) {
        io.reactivex.internal.functions.b.g(uVar, "source");
        io.reactivex.internal.functions.b.h(i10, "parallelism");
        io.reactivex.internal.functions.b.h(i11, t1.b.f296115c);
        return io.reactivex.plugins.a.V(new h(uVar, i10, i11));
    }

    @f
    @cj.d
    public static <T> b<T> B(@f u<T>... uVarArr) {
        if (uVarArr.length != 0) {
            return io.reactivex.plugins.a.V(new g(uVarArr));
        }
        throw new IllegalArgumentException("Zero publishers not supported");
    }

    @cj.d
    public static <T> b<T> y(@f u<? extends T> uVar) {
        return A(uVar, Runtime.getRuntime().availableProcessors(), l.Y());
    }

    @cj.d
    public static <T> b<T> z(@f u<? extends T> uVar, int i10) {
        return A(uVar, i10, l.Y());
    }

    @f
    @cj.d
    public final <R> b<R> C(@f o<? super T, ? extends R> oVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper");
        return io.reactivex.plugins.a.V(new j(this, oVar));
    }

    @f
    @cj.d
    public final <R> b<R> D(@f o<? super T, ? extends R> oVar, @f dj.c<? super Long, ? super Throwable, a> cVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper");
        io.reactivex.internal.functions.b.g(cVar, "errorHandler is null");
        return io.reactivex.plugins.a.V(new k(this, oVar, cVar));
    }

    @f
    @cj.d
    public final <R> b<R> E(@f o<? super T, ? extends R> oVar, @f a aVar) {
        io.reactivex.internal.functions.b.g(oVar, "mapper");
        io.reactivex.internal.functions.b.g(aVar, "errorHandler is null");
        return io.reactivex.plugins.a.V(new k(this, oVar, aVar));
    }

    public abstract int F();

    @f
    @cj.d
    public final l<T> G(@f dj.c<T, T, T> cVar) {
        io.reactivex.internal.functions.b.g(cVar, "reducer");
        return io.reactivex.plugins.a.P(new n(this, cVar));
    }

    @f
    @cj.d
    public final <R> b<R> H(@f Callable<R> callable, @f dj.c<R, ? super T, R> cVar) {
        io.reactivex.internal.functions.b.g(callable, "initialSupplier");
        io.reactivex.internal.functions.b.g(cVar, "reducer");
        return io.reactivex.plugins.a.V(new m(this, callable, cVar));
    }

    @f
    @cj.d
    public final b<T> I(@f j0 j0Var) {
        return J(j0Var, l.Y());
    }

    @f
    @cj.d
    public final b<T> J(@f j0 j0Var, int i10) {
        io.reactivex.internal.functions.b.g(j0Var, "scheduler");
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.o(this, j0Var, i10));
    }

    @cj.b(cj.a.FULL)
    @cj.d
    @cj.h("none")
    public final l<T> K() {
        return L(l.Y());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @f
    @cj.d
    public final l<T> L(int i10) {
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        return io.reactivex.plugins.a.P(new i(this, i10, false));
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @f
    @cj.d
    public final l<T> M() {
        return N(l.Y());
    }

    @cj.b(cj.a.FULL)
    @cj.h("none")
    @f
    @cj.d
    public final l<T> N(int i10) {
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        return io.reactivex.plugins.a.P(new i(this, i10, true));
    }

    @f
    @cj.d
    public final l<T> O(@f Comparator<? super T> comparator) {
        return P(comparator, 16);
    }

    @f
    @cj.d
    public final l<T> P(@f Comparator<? super T> comparator, int i10) {
        io.reactivex.internal.functions.b.g(comparator, "comparator is null");
        io.reactivex.internal.functions.b.h(i10, "capacityHint");
        return io.reactivex.plugins.a.P(new p(H(io.reactivex.internal.functions.a.f((i10 / F()) + 1), io.reactivex.internal.util.o.k()).C(new w(comparator)), comparator));
    }

    public abstract void Q(@f v<? super T>[] vVarArr);

    @f
    @cj.d
    public final <U> U R(@f o<? super b<T>, U> oVar) {
        try {
            return (U) ((o) io.reactivex.internal.functions.b.g(oVar, "converter is null")).apply(this);
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            throw io.reactivex.internal.util.k.f(th2);
        }
    }

    @f
    @cj.d
    public final l<List<T>> S(@f Comparator<? super T> comparator) {
        return T(comparator, 16);
    }

    @f
    @cj.d
    public final l<List<T>> T(@f Comparator<? super T> comparator, int i10) {
        io.reactivex.internal.functions.b.g(comparator, "comparator is null");
        io.reactivex.internal.functions.b.h(i10, "capacityHint");
        return io.reactivex.plugins.a.P(H(io.reactivex.internal.functions.a.f((i10 / F()) + 1), io.reactivex.internal.util.o.k()).C(new w(comparator)).G(new io.reactivex.internal.util.p(comparator)));
    }

    protected final boolean U(@f v<?>[] vVarArr) {
        int iF = F();
        if (vVarArr.length == iF) {
            return true;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("parallelism = " + iF + ", subscribers = " + vVarArr.length);
        int length = vVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            io.reactivex.internal.subscriptions.g.c(illegalArgumentException, vVarArr[i10]);
        }
        return false;
    }

    @f
    @cj.d
    public final <R> R a(@f c<T, R> cVar) {
        return (R) ((c) io.reactivex.internal.functions.b.g(cVar, "converter is null")).a(this);
    }

    @f
    @cj.d
    public final <C> b<C> b(@f Callable<? extends C> callable, @f dj.b<? super C, ? super T> bVar) {
        io.reactivex.internal.functions.b.g(callable, "collectionSupplier is null");
        io.reactivex.internal.functions.b.g(bVar, "collector is null");
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.a(this, callable, bVar));
    }

    @f
    @cj.d
    public final <U> b<U> c(@f d<T, U> dVar) {
        return io.reactivex.plugins.a.V(((d) io.reactivex.internal.functions.b.g(dVar, "composer is null")).a(this));
    }

    @f
    @cj.d
    public final <R> b<R> d(@f o<? super T, ? extends u<? extends R>> oVar) {
        return e(oVar, 2);
    }

    @f
    @cj.d
    public final <R> b<R> e(@f o<? super T, ? extends u<? extends R>> oVar, int i10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.b(this, oVar, i10, io.reactivex.internal.util.j.IMMEDIATE));
    }

    @f
    @cj.d
    public final <R> b<R> f(@f o<? super T, ? extends u<? extends R>> oVar, int i10, boolean z10) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, t1.b.f296115c);
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.b(this, oVar, i10, z10 ? io.reactivex.internal.util.j.END : io.reactivex.internal.util.j.BOUNDARY));
    }

    @f
    @cj.d
    public final <R> b<R> g(@f o<? super T, ? extends u<? extends R>> oVar, boolean z10) {
        return f(oVar, 2, z10);
    }

    @f
    @cj.d
    public final b<T> h(@f dj.g<? super T> gVar) {
        io.reactivex.internal.functions.b.g(gVar, "onAfterNext is null");
        dj.g gVarH = io.reactivex.internal.functions.a.h();
        dj.g gVarH2 = io.reactivex.internal.functions.a.h();
        dj.a aVar = io.reactivex.internal.functions.a.f298692c;
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.l(this, gVarH, gVar, gVarH2, aVar, aVar, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.f298696g, aVar));
    }

    @f
    @cj.d
    public final b<T> i(@f dj.a aVar) {
        io.reactivex.internal.functions.b.g(aVar, "onAfterTerminate is null");
        dj.g gVarH = io.reactivex.internal.functions.a.h();
        dj.g gVarH2 = io.reactivex.internal.functions.a.h();
        dj.g gVarH3 = io.reactivex.internal.functions.a.h();
        dj.a aVar2 = io.reactivex.internal.functions.a.f298692c;
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.l(this, gVarH, gVarH2, gVarH3, aVar2, aVar, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.f298696g, aVar2));
    }

    @f
    @cj.d
    public final b<T> j(@f dj.a aVar) {
        io.reactivex.internal.functions.b.g(aVar, "onCancel is null");
        dj.g gVarH = io.reactivex.internal.functions.a.h();
        dj.g gVarH2 = io.reactivex.internal.functions.a.h();
        dj.g gVarH3 = io.reactivex.internal.functions.a.h();
        dj.a aVar2 = io.reactivex.internal.functions.a.f298692c;
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.l(this, gVarH, gVarH2, gVarH3, aVar2, aVar2, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.f298696g, aVar));
    }

    @f
    @cj.d
    public final b<T> k(@f dj.a aVar) {
        io.reactivex.internal.functions.b.g(aVar, "onComplete is null");
        dj.g gVarH = io.reactivex.internal.functions.a.h();
        dj.g gVarH2 = io.reactivex.internal.functions.a.h();
        dj.g gVarH3 = io.reactivex.internal.functions.a.h();
        dj.a aVar2 = io.reactivex.internal.functions.a.f298692c;
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.l(this, gVarH, gVarH2, gVarH3, aVar, aVar2, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.f298696g, aVar2));
    }

    @f
    @cj.d
    public final b<T> l(@f dj.g<Throwable> gVar) {
        io.reactivex.internal.functions.b.g(gVar, "onError is null");
        dj.g gVarH = io.reactivex.internal.functions.a.h();
        dj.g gVarH2 = io.reactivex.internal.functions.a.h();
        dj.a aVar = io.reactivex.internal.functions.a.f298692c;
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.l(this, gVarH, gVarH2, gVar, aVar, aVar, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.f298696g, aVar));
    }

    @f
    @cj.d
    public final b<T> m(@f dj.g<? super T> gVar) {
        io.reactivex.internal.functions.b.g(gVar, "onNext is null");
        dj.g gVarH = io.reactivex.internal.functions.a.h();
        dj.g gVarH2 = io.reactivex.internal.functions.a.h();
        dj.a aVar = io.reactivex.internal.functions.a.f298692c;
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.l(this, gVar, gVarH, gVarH2, aVar, aVar, io.reactivex.internal.functions.a.h(), io.reactivex.internal.functions.a.f298696g, aVar));
    }

    @f
    @cj.d
    public final b<T> n(@f dj.g<? super T> gVar, @f dj.c<? super Long, ? super Throwable, a> cVar) {
        io.reactivex.internal.functions.b.g(gVar, "onNext is null");
        io.reactivex.internal.functions.b.g(cVar, "errorHandler is null");
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.c(this, gVar, cVar));
    }

    @f
    @cj.d
    public final b<T> o(@f dj.g<? super T> gVar, @f a aVar) {
        io.reactivex.internal.functions.b.g(gVar, "onNext is null");
        io.reactivex.internal.functions.b.g(aVar, "errorHandler is null");
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.c(this, gVar, aVar));
    }

    @f
    @cj.d
    public final b<T> p(@f q qVar) {
        io.reactivex.internal.functions.b.g(qVar, "onRequest is null");
        dj.g gVarH = io.reactivex.internal.functions.a.h();
        dj.g gVarH2 = io.reactivex.internal.functions.a.h();
        dj.g gVarH3 = io.reactivex.internal.functions.a.h();
        dj.a aVar = io.reactivex.internal.functions.a.f298692c;
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.l(this, gVarH, gVarH2, gVarH3, aVar, aVar, io.reactivex.internal.functions.a.h(), qVar, aVar));
    }

    @f
    @cj.d
    public final b<T> q(@f dj.g<? super org.reactivestreams.w> gVar) {
        io.reactivex.internal.functions.b.g(gVar, "onSubscribe is null");
        dj.g gVarH = io.reactivex.internal.functions.a.h();
        dj.g gVarH2 = io.reactivex.internal.functions.a.h();
        dj.g gVarH3 = io.reactivex.internal.functions.a.h();
        dj.a aVar = io.reactivex.internal.functions.a.f298692c;
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.l(this, gVarH, gVarH2, gVarH3, aVar, aVar, gVar, io.reactivex.internal.functions.a.f298696g, aVar));
    }

    @cj.d
    public final b<T> r(@f r<? super T> rVar) {
        io.reactivex.internal.functions.b.g(rVar, "predicate");
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.d(this, rVar));
    }

    @cj.d
    public final b<T> s(@f r<? super T> rVar, @f dj.c<? super Long, ? super Throwable, a> cVar) {
        io.reactivex.internal.functions.b.g(rVar, "predicate");
        io.reactivex.internal.functions.b.g(cVar, "errorHandler is null");
        return io.reactivex.plugins.a.V(new e(this, rVar, cVar));
    }

    @cj.d
    public final b<T> t(@f r<? super T> rVar, @f a aVar) {
        io.reactivex.internal.functions.b.g(rVar, "predicate");
        io.reactivex.internal.functions.b.g(aVar, "errorHandler is null");
        return io.reactivex.plugins.a.V(new e(this, rVar, aVar));
    }

    @f
    @cj.d
    public final <R> b<R> u(@f o<? super T, ? extends u<? extends R>> oVar) {
        return x(oVar, false, Integer.MAX_VALUE, l.Y());
    }

    @f
    @cj.d
    public final <R> b<R> v(@f o<? super T, ? extends u<? extends R>> oVar, boolean z10) {
        return x(oVar, z10, Integer.MAX_VALUE, l.Y());
    }

    @f
    @cj.d
    public final <R> b<R> w(@f o<? super T, ? extends u<? extends R>> oVar, boolean z10, int i10) {
        return x(oVar, z10, i10, l.Y());
    }

    @f
    @cj.d
    public final <R> b<R> x(@f o<? super T, ? extends u<? extends R>> oVar, boolean z10, int i10, int i11) {
        io.reactivex.internal.functions.b.g(oVar, "mapper is null");
        io.reactivex.internal.functions.b.h(i10, "maxConcurrency");
        io.reactivex.internal.functions.b.h(i11, t1.b.f296115c);
        return io.reactivex.plugins.a.V(new io.reactivex.internal.operators.parallel.f(this, oVar, z10, i10, i11));
    }
}
