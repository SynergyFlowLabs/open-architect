package io.reactivex.internal.operators.observable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class r2<T> extends io.reactivex.observables.a<T> implements ej.g<T>, io.reactivex.internal.disposables.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final b f302258e = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<T> f302259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AtomicReference<j<T>> f302260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final b<T> f302261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.g0<T> f302262d;

    static abstract class a<T> extends AtomicReference<f> implements h<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f302263c = 2346567790059478686L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        f f302264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f302265b;

        a() {
            f fVar = new f(null);
            this.f302264a = fVar;
            set(fVar);
        }

        final void a(f fVar) {
            this.f302264a.set(fVar);
            this.f302264a = fVar;
            this.f302265b++;
        }

        final void b(Collection<? super T> collection) {
            f fVarE = e();
            while (true) {
                fVarE = fVarE.get();
                if (fVarE == null) {
                    return;
                }
                Object objH = h(fVarE.f302275a);
                if (io.reactivex.internal.util.q.s(objH) || io.reactivex.internal.util.q.v(objH)) {
                    return;
                } else {
                    collection.add((Object) io.reactivex.internal.util.q.r(objH));
                }
            }
        }

        @Override // io.reactivex.internal.operators.observable.r2.h
        public final void c(d<T> dVar) {
            if (dVar.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                f fVarE = (f) dVar.a();
                if (fVarE == null) {
                    fVarE = e();
                    dVar.f302270c = fVarE;
                }
                while (true) {
                    if (dVar.k()) {
                        dVar.f302270c = null;
                        return;
                    }
                    f fVar = fVarE.get();
                    if (fVar != null) {
                        if (io.reactivex.internal.util.q.b(h(fVar.f302275a), dVar.f302269b)) {
                            dVar.f302270c = null;
                            return;
                        }
                        fVarE = fVar;
                    }
                }
                dVar.f302270c = fVarE;
                iAddAndGet = dVar.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.internal.operators.observable.r2.h
        public final void complete() {
            a(new f(d(io.reactivex.internal.util.q.k())));
            n();
        }

        Object d(Object obj) {
            return obj;
        }

        f e() {
            return get();
        }

        @Override // io.reactivex.internal.operators.observable.r2.h
        public final void error(Throwable th2) {
            a(new f(d(io.reactivex.internal.util.q.n(th2))));
            n();
        }

        boolean f() {
            Object obj = this.f302264a.f302275a;
            return obj != null && io.reactivex.internal.util.q.s(h(obj));
        }

        boolean g() {
            Object obj = this.f302264a.f302275a;
            return obj != null && io.reactivex.internal.util.q.v(h(obj));
        }

        Object h(Object obj) {
            return obj;
        }

        final void i() {
            f fVar = get().get();
            this.f302265b--;
            k(fVar);
        }

        final void j(int i10) {
            f fVar = get();
            while (i10 > 0) {
                fVar = fVar.get();
                i10--;
                this.f302265b--;
            }
            k(fVar);
        }

        final void k(f fVar) {
            set(fVar);
        }

        final void l() {
            f fVar = get();
            if (fVar.f302275a != null) {
                int i10 = 3 >> 0;
                f fVar2 = new f(null);
                fVar2.lazySet(fVar.get());
                set(fVar2);
            }
        }

        abstract void m();

        void n() {
            l();
        }

        @Override // io.reactivex.internal.operators.observable.r2.h
        public final void next(T t10) {
            a(new f(d(io.reactivex.internal.util.q.x(t10))));
            m();
        }
    }

    interface b<T> {
        h<T> call();
    }

    static final class c<R> implements dj.g<io.reactivex.disposables.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n4<R> f302266a;

        c(n4<R> n4Var) {
            this.f302266a = n4Var;
        }

        @Override // dj.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(io.reactivex.disposables.c cVar) {
            this.f302266a.a(cVar);
        }
    }

    static final class d<T> extends AtomicInteger implements io.reactivex.disposables.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f302267e = 2728361546769921047L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final j<T> f302268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f302270c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f302271d;

        d(j<T> jVar, io.reactivex.i0<? super T> i0Var) {
            this.f302268a = jVar;
            this.f302269b = i0Var;
        }

        <U> U a() {
            return (U) this.f302270c;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (!this.f302271d) {
                this.f302271d = true;
                this.f302268a.b(this);
                this.f302270c = null;
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302271d;
        }
    }

    static final class e<R, U> extends io.reactivex.b0<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Callable<? extends io.reactivex.observables.a<U>> f302272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final dj.o<? super io.reactivex.b0<U>, ? extends io.reactivex.g0<R>> f302273b;

        e(Callable<? extends io.reactivex.observables.a<U>> callable, dj.o<? super io.reactivex.b0<U>, ? extends io.reactivex.g0<R>> oVar) {
            this.f302272a = callable;
            this.f302273b = oVar;
        }

        @Override // io.reactivex.b0
        protected void H5(io.reactivex.i0<? super R> i0Var) {
            try {
                io.reactivex.observables.a aVar = (io.reactivex.observables.a) io.reactivex.internal.functions.b.g(this.f302272a.call(), "The connectableFactory returned a null ConnectableObservable");
                io.reactivex.g0 g0Var = (io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f302273b.apply(aVar), "The selector returned a null ObservableSource");
                n4 n4Var = new n4(i0Var);
                g0Var.a(n4Var);
                aVar.l8(new c(n4Var));
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.internal.disposables.e.l(th2, i0Var);
            }
        }
    }

    static final class f extends AtomicReference<f> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f302274b = 245354315435971818L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f302275a;

        f(Object obj) {
            this.f302275a = obj;
        }
    }

    static final class g<T> extends io.reactivex.observables.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.reactivex.observables.a<T> f302276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.reactivex.b0<T> f302277b;

        g(io.reactivex.observables.a<T> aVar, io.reactivex.b0<T> b0Var) {
            this.f302276a = aVar;
            this.f302277b = b0Var;
        }

        @Override // io.reactivex.b0
        protected void H5(io.reactivex.i0<? super T> i0Var) {
            this.f302277b.a(i0Var);
        }

        @Override // io.reactivex.observables.a
        public void l8(dj.g<? super io.reactivex.disposables.c> gVar) {
            this.f302276a.l8(gVar);
        }
    }

    interface h<T> {
        void c(d<T> dVar);

        void complete();

        void error(Throwable th2);

        void next(T t10);
    }

    static final class i<T> implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f302278a;

        i(int i10) {
            this.f302278a = i10;
        }

        @Override // io.reactivex.internal.operators.observable.r2.b
        public h<T> call() {
            return new n(this.f302278a);
        }
    }

    static final class j<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f302279e = -533785617179540163L;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final d[] f302280f = new d[0];

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final d[] f302281g = new d[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final h<T> f302282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f302283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<d[]> f302284c = new AtomicReference<>(f302280f);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicBoolean f302285d = new AtomicBoolean();

        j(h<T> hVar) {
            this.f302282a = hVar;
        }

        boolean a(d<T> dVar) {
            d[] dVarArr;
            d[] dVarArr2;
            do {
                dVarArr = this.f302284c.get();
                if (dVarArr == f302281g) {
                    return false;
                }
                int length = dVarArr.length;
                dVarArr2 = new d[length + 1];
                System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                dVarArr2[length] = dVar;
            } while (!androidx.compose.animation.core.z1.a(this.f302284c, dVarArr, dVarArr2));
            return true;
        }

        void b(d<T> dVar) {
            d[] dVarArr;
            d[] dVarArr2;
            do {
                dVarArr = this.f302284c.get();
                int length = dVarArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (dVarArr[i10].equals(dVar)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    dVarArr2 = f302280f;
                } else {
                    d[] dVarArr3 = new d[length - 1];
                    System.arraycopy(dVarArr, 0, dVarArr3, 0, i10);
                    System.arraycopy(dVarArr, i10 + 1, dVarArr3, i10, (length - i10) - 1);
                    dVarArr2 = dVarArr3;
                }
            } while (!androidx.compose.animation.core.z1.a(this.f302284c, dVarArr, dVarArr2));
        }

        void c() {
            for (d<T> dVar : this.f302284c.get()) {
                this.f302282a.c(dVar);
            }
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.o(this, cVar)) {
                c();
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302284c.set(f302281g);
            io.reactivex.internal.disposables.d.b(this);
        }

        void e() {
            for (d<T> dVar : this.f302284c.getAndSet(f302281g)) {
                this.f302282a.c(dVar);
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302284c.get() == f302281g;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f302283b) {
                return;
            }
            this.f302283b = true;
            this.f302282a.complete();
            e();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f302283b) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f302283b = true;
            this.f302282a.error(th2);
            e();
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f302283b) {
                return;
            }
            this.f302282a.next(t10);
            c();
        }
    }

    static final class k<T> implements io.reactivex.g0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicReference<j<T>> f302286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b<T> f302287b;

        k(AtomicReference<j<T>> atomicReference, b<T> bVar) {
            this.f302286a = atomicReference;
            this.f302287b = bVar;
        }

        @Override // io.reactivex.g0
        public void a(io.reactivex.i0<? super T> i0Var) {
            j<T> jVar;
            while (true) {
                jVar = this.f302286a.get();
                if (jVar != null) {
                    break;
                }
                j<T> jVar2 = new j<>(this.f302287b.call());
                if (androidx.compose.animation.core.z1.a(this.f302286a, null, jVar2)) {
                    jVar = jVar2;
                    break;
                }
            }
            d<T> dVar = new d<>(jVar, i0Var);
            i0Var.d(dVar);
            jVar.a(dVar);
            if (dVar.k()) {
                jVar.b(dVar);
            } else {
                jVar.f302282a.c(dVar);
            }
        }
    }

    static final class l<T> implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f302288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f302289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final TimeUnit f302290c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final io.reactivex.j0 f302291d;

        l(int i10, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
            this.f302288a = i10;
            this.f302289b = j10;
            this.f302290c = timeUnit;
            this.f302291d = j0Var;
        }

        @Override // io.reactivex.internal.operators.observable.r2.b
        public h<T> call() {
            return new m(this.f302288a, this.f302289b, this.f302290c, this.f302291d);
        }
    }

    static final class m<T> extends a<T> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f302292h = 3457957419649567404L;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.j0 f302293d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final long f302294e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final TimeUnit f302295f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final int f302296g;

        m(int i10, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
            this.f302293d = j0Var;
            this.f302296g = i10;
            this.f302294e = j10;
            this.f302295f = timeUnit;
        }

        @Override // io.reactivex.internal.operators.observable.r2.a
        Object d(Object obj) {
            return new io.reactivex.schedulers.d(obj, this.f302293d.d(this.f302295f), this.f302295f);
        }

        @Override // io.reactivex.internal.operators.observable.r2.a
        f e() {
            f fVar;
            long jD = this.f302293d.d(this.f302295f) - this.f302294e;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null) {
                    break;
                }
                io.reactivex.schedulers.d dVar = (io.reactivex.schedulers.d) fVar2.f302275a;
                if (io.reactivex.internal.util.q.s(dVar.d()) || io.reactivex.internal.util.q.v(dVar.d()) || dVar.a() > jD) {
                    break;
                }
                fVar3 = fVar2.get();
            }
            return fVar;
        }

        @Override // io.reactivex.internal.operators.observable.r2.a
        Object h(Object obj) {
            return ((io.reactivex.schedulers.d) obj).d();
        }

        @Override // io.reactivex.internal.operators.observable.r2.a
        void m() {
            f fVar;
            long jD = this.f302293d.d(this.f302295f) - this.f302294e;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            int i10 = 0;
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 != null) {
                    int i11 = this.f302265b;
                    if (i11 <= this.f302296g) {
                        if (((io.reactivex.schedulers.d) fVar2.f302275a).a() > jD) {
                            break;
                        }
                        i10++;
                        this.f302265b--;
                        fVar3 = fVar2.get();
                    } else {
                        i10++;
                        this.f302265b = i11 - 1;
                        fVar3 = fVar2.get();
                    }
                } else {
                    break;
                }
            }
            if (i10 != 0) {
                k(fVar);
            }
        }

        @Override // io.reactivex.internal.operators.observable.r2.a
        void n() {
            f fVar;
            long jD = this.f302293d.d(this.f302295f) - this.f302294e;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            int i10 = 0;
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null || this.f302265b <= 1 || ((io.reactivex.schedulers.d) fVar2.f302275a).a() > jD) {
                    break;
                }
                i10++;
                this.f302265b--;
                fVar3 = fVar2.get();
            }
            if (i10 != 0) {
                k(fVar);
            }
        }
    }

    static final class n<T> extends a<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f302297e = -5898283885385201806L;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f302298d;

        n(int i10) {
            this.f302298d = i10;
        }

        @Override // io.reactivex.internal.operators.observable.r2.a
        void m() {
            if (this.f302265b > this.f302298d) {
                i();
            }
        }
    }

    static final class o implements b<Object> {
        o() {
        }

        @Override // io.reactivex.internal.operators.observable.r2.b
        public h<Object> call() {
            return new p(16);
        }
    }

    static final class p<T> extends ArrayList<Object> implements h<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f302299b = 7063189396499112664L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile int f302300a;

        p(int i10) {
            super(i10);
        }

        @Override // io.reactivex.internal.operators.observable.r2.h
        public void c(d<T> dVar) {
            if (dVar.getAndIncrement() != 0) {
                return;
            }
            io.reactivex.i0<? super T> i0Var = dVar.f302269b;
            int iAddAndGet = 1;
            while (!dVar.k()) {
                int i10 = this.f302300a;
                Integer num = (Integer) dVar.a();
                int iIntValue = num != null ? num.intValue() : 0;
                while (iIntValue < i10) {
                    if (!io.reactivex.internal.util.q.b(get(iIntValue), i0Var) && !dVar.k()) {
                        iIntValue++;
                    }
                    return;
                }
                dVar.f302270c = Integer.valueOf(iIntValue);
                iAddAndGet = dVar.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.observable.r2.h
        public void complete() {
            add(io.reactivex.internal.util.q.k());
            this.f302300a++;
        }

        @Override // io.reactivex.internal.operators.observable.r2.h
        public void error(Throwable th2) {
            add(io.reactivex.internal.util.q.n(th2));
            this.f302300a++;
        }

        @Override // io.reactivex.internal.operators.observable.r2.h
        public void next(T t10) {
            add(io.reactivex.internal.util.q.x(t10));
            this.f302300a++;
        }
    }

    private r2(io.reactivex.g0<T> g0Var, io.reactivex.g0<T> g0Var2, AtomicReference<j<T>> atomicReference, b<T> bVar) {
        this.f302262d = g0Var;
        this.f302259a = g0Var2;
        this.f302260b = atomicReference;
        this.f302261c = bVar;
    }

    public static <T> io.reactivex.observables.a<T> s8(io.reactivex.g0<T> g0Var, int i10) {
        return i10 == Integer.MAX_VALUE ? w8(g0Var) : v8(g0Var, new i(i10));
    }

    public static <T> io.reactivex.observables.a<T> t8(io.reactivex.g0<T> g0Var, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
        return u8(g0Var, j10, timeUnit, j0Var, Integer.MAX_VALUE);
    }

    public static <T> io.reactivex.observables.a<T> u8(io.reactivex.g0<T> g0Var, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var, int i10) {
        return v8(g0Var, new l(i10, j10, timeUnit, j0Var));
    }

    static <T> io.reactivex.observables.a<T> v8(io.reactivex.g0<T> g0Var, b<T> bVar) {
        AtomicReference atomicReference = new AtomicReference();
        return io.reactivex.plugins.a.U(new r2(new k(atomicReference, bVar), g0Var, atomicReference, bVar));
    }

    public static <T> io.reactivex.observables.a<T> w8(io.reactivex.g0<? extends T> g0Var) {
        return v8(g0Var, f302258e);
    }

    public static <U, R> io.reactivex.b0<R> x8(Callable<? extends io.reactivex.observables.a<U>> callable, dj.o<? super io.reactivex.b0<U>, ? extends io.reactivex.g0<R>> oVar) {
        return io.reactivex.plugins.a.R(new e(callable, oVar));
    }

    public static <T> io.reactivex.observables.a<T> y8(io.reactivex.observables.a<T> aVar, io.reactivex.j0 j0Var) {
        return io.reactivex.plugins.a.U(new g(aVar, aVar.a4(j0Var)));
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        this.f302262d.a(i0Var);
    }

    @Override // io.reactivex.internal.disposables.g
    public void b(io.reactivex.disposables.c cVar) {
        androidx.compose.animation.core.z1.a(this.f302260b, (j) cVar, null);
    }

    @Override // io.reactivex.observables.a
    public void l8(dj.g<? super io.reactivex.disposables.c> gVar) {
        j<T> jVar;
        while (true) {
            jVar = this.f302260b.get();
            if (jVar != null && !jVar.k()) {
                break;
            }
            j<T> jVar2 = new j<>(this.f302261c.call());
            if (androidx.compose.animation.core.z1.a(this.f302260b, jVar, jVar2)) {
                jVar = jVar2;
                break;
            }
        }
        boolean z10 = !jVar.f302285d.get() && jVar.f302285d.compareAndSet(false, true);
        try {
            gVar.accept(jVar);
            if (z10) {
                this.f302259a.a(jVar);
            }
        } catch (Throwable th2) {
            if (z10) {
                jVar.f302285d.compareAndSet(true, false);
            }
            io.reactivex.exceptions.b.b(th2);
            throw io.reactivex.internal.util.k.f(th2);
        }
    }

    @Override // ej.g
    public io.reactivex.g0<T> source() {
        return this.f302259a;
    }
}
