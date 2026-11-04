package io.reactivex.internal.operators.flowable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class d3<T> extends io.reactivex.flowables.a<T> implements ej.h<T>, io.reactivex.internal.disposables.g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Callable f299201f = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.l<T> f299202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<j<T>> f299203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Callable<? extends g<T>> f299204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final org.reactivestreams.u<T> f299205e;

    static class a<T> extends AtomicReference<f> implements g<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f299206d = 2346567790059478686L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        f f299207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f299208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f299209c;

        a() {
            f fVar = new f(null, 0L);
            this.f299207a = fVar;
            set(fVar);
        }

        final void a(f fVar) {
            this.f299207a.set(fVar);
            this.f299207a = fVar;
            this.f299208b++;
        }

        final void b(Collection<? super T> collection) {
            f fVarE = e();
            while (true) {
                fVarE = fVarE.get();
                if (fVarE == null) {
                    return;
                }
                Object objH = h(fVarE.f299225a);
                if (io.reactivex.internal.util.q.s(objH) || io.reactivex.internal.util.q.v(objH)) {
                    return;
                } else {
                    collection.add((Object) io.reactivex.internal.util.q.r(objH));
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.d3.g
        public final void c(d<T> dVar) {
            f fVar;
            synchronized (dVar) {
                try {
                    if (dVar.f299218e) {
                        dVar.f299219f = true;
                        return;
                    }
                    dVar.f299218e = true;
                    while (!dVar.k()) {
                        long j10 = dVar.get();
                        boolean z10 = j10 == Long.MAX_VALUE;
                        f fVarE = (f) dVar.a();
                        if (fVarE == null) {
                            fVarE = e();
                            dVar.f299216c = fVarE;
                            io.reactivex.internal.util.d.a(dVar.f299217d, fVarE.f299226b);
                        }
                        long j11 = 0;
                        while (j10 != 0 && (fVar = fVarE.get()) != null) {
                            Object objH = h(fVar.f299225a);
                            try {
                                if (io.reactivex.internal.util.q.c(objH, dVar.f299215b)) {
                                    dVar.f299216c = null;
                                    return;
                                }
                                j11++;
                                j10--;
                                if (dVar.k()) {
                                    dVar.f299216c = null;
                                    return;
                                }
                                fVarE = fVar;
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.b.b(th2);
                                dVar.f299216c = null;
                                dVar.dispose();
                                if (io.reactivex.internal.util.q.v(objH) || io.reactivex.internal.util.q.s(objH)) {
                                    return;
                                }
                                dVar.f299215b.onError(th2);
                                return;
                            }
                        }
                        if (j11 != 0) {
                            dVar.f299216c = fVarE;
                            if (!z10) {
                                dVar.b(j11);
                            }
                        }
                        synchronized (dVar) {
                            try {
                                if (!dVar.f299219f) {
                                    dVar.f299218e = false;
                                    return;
                                }
                                dVar.f299219f = false;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                    dVar.f299216c = null;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.d3.g
        public final void complete() {
            Object objD = d(io.reactivex.internal.util.q.k());
            long j10 = this.f299209c + 1;
            this.f299209c = j10;
            a(new f(objD, j10));
            n();
        }

        Object d(Object obj) {
            return obj;
        }

        f e() {
            return get();
        }

        @Override // io.reactivex.internal.operators.flowable.d3.g
        public final void error(Throwable th2) {
            Object objD = d(io.reactivex.internal.util.q.n(th2));
            long j10 = this.f299209c + 1;
            this.f299209c = j10;
            a(new f(objD, j10));
            n();
        }

        boolean f() {
            Object obj = this.f299207a.f299225a;
            if (obj == null || !io.reactivex.internal.util.q.s(h(obj))) {
                return false;
            }
            int i10 = 3 >> 1;
            return true;
        }

        boolean g() {
            Object obj = this.f299207a.f299225a;
            return obj != null && io.reactivex.internal.util.q.v(h(obj));
        }

        Object h(Object obj) {
            return obj;
        }

        final void i() {
            f fVar = get().get();
            if (fVar == null) {
                throw new IllegalStateException("Empty list!");
            }
            this.f299208b--;
            k(fVar);
        }

        final void j(int i10) {
            f fVar = get();
            while (i10 > 0) {
                fVar = fVar.get();
                i10--;
                this.f299208b--;
            }
            k(fVar);
        }

        final void k(f fVar) {
            set(fVar);
        }

        final void l() {
            f fVar = get();
            if (fVar.f299225a != null) {
                f fVar2 = new f(null, 0L);
                fVar2.lazySet(fVar.get());
                set(fVar2);
            }
        }

        void m() {
        }

        void n() {
            l();
        }

        @Override // io.reactivex.internal.operators.flowable.d3.g
        public final void next(T t10) {
            Object objD = d(io.reactivex.internal.util.q.x(t10));
            long j10 = this.f299209c + 1;
            this.f299209c = j10;
            a(new f(objD, j10));
            m();
        }
    }

    static final class b<T> extends io.reactivex.flowables.a<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final io.reactivex.flowables.a<T> f299210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.reactivex.l<T> f299211c;

        b(io.reactivex.flowables.a<T> aVar, io.reactivex.l<T> lVar) {
            this.f299210b = aVar;
            this.f299211c = lVar;
        }

        @Override // io.reactivex.flowables.a
        public void Q8(dj.g<? super io.reactivex.disposables.c> gVar) {
            this.f299210b.Q8(gVar);
        }

        @Override // io.reactivex.l
        protected void k6(org.reactivestreams.v<? super T> vVar) {
            this.f299211c.e(vVar);
        }
    }

    static final class c implements Callable<Object> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new n(16);
        }
    }

    static final class d<T> extends AtomicLong implements org.reactivestreams.w, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f299212g = -4453897557930727610L;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final long f299213h = Long.MIN_VALUE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final j<T> f299214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f299216c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicLong f299217d = new AtomicLong();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f299218e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f299219f;

        d(j<T> jVar, org.reactivestreams.v<? super T> vVar) {
            this.f299214a = jVar;
            this.f299215b = vVar;
        }

        <U> U a() {
            return (U) this.f299216c;
        }

        public long b(long j10) {
            return io.reactivex.internal.util.d.f(this, j10);
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            dispose();
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f299214a.c(this);
                this.f299214a.b();
                this.f299216c = null;
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return get() == Long.MIN_VALUE;
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (!io.reactivex.internal.subscriptions.j.p(j10) || io.reactivex.internal.util.d.b(this, j10) == Long.MIN_VALUE) {
                return;
            }
            io.reactivex.internal.util.d.a(this.f299217d, j10);
            this.f299214a.b();
            this.f299214a.f299233a.c(this);
        }
    }

    static final class e<R, U> extends io.reactivex.l<R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Callable<? extends io.reactivex.flowables.a<U>> f299220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final dj.o<? super io.reactivex.l<U>, ? extends org.reactivestreams.u<R>> f299221c;

        final class a implements dj.g<io.reactivex.disposables.c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final io.reactivex.internal.subscribers.v<R> f299222a;

            a(io.reactivex.internal.subscribers.v<R> vVar) {
                this.f299222a = vVar;
            }

            @Override // dj.g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void accept(io.reactivex.disposables.c cVar) {
                this.f299222a.a(cVar);
            }
        }

        e(Callable<? extends io.reactivex.flowables.a<U>> callable, dj.o<? super io.reactivex.l<U>, ? extends org.reactivestreams.u<R>> oVar) {
            this.f299220b = callable;
            this.f299221c = oVar;
        }

        @Override // io.reactivex.l
        protected void k6(org.reactivestreams.v<? super R> vVar) {
            try {
                io.reactivex.flowables.a aVar = (io.reactivex.flowables.a) io.reactivex.internal.functions.b.g(this.f299220b.call(), "The connectableFactory returned null");
                try {
                    org.reactivestreams.u uVar = (org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.f299221c.apply(aVar), "The selector returned a null Publisher");
                    io.reactivex.internal.subscribers.v vVar2 = new io.reactivex.internal.subscribers.v(vVar);
                    uVar.e(vVar2);
                    aVar.Q8(new a(vVar2));
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    io.reactivex.internal.subscriptions.g.c(th2, vVar);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                io.reactivex.internal.subscriptions.g.c(th3, vVar);
            }
        }
    }

    static final class f extends AtomicReference<f> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f299224c = 245354315435971818L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f299225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f299226b;

        f(Object obj, long j10) {
            this.f299225a = obj;
            this.f299226b = j10;
        }
    }

    interface g<T> {
        void c(d<T> dVar);

        void complete();

        void error(Throwable th2);

        void next(T t10);
    }

    static final class h<T> implements Callable<g<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f299227a;

        h(int i10) {
            this.f299227a = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g<T> call() {
            return new m(this.f299227a);
        }
    }

    static final class i<T> implements org.reactivestreams.u<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicReference<j<T>> f299228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Callable<? extends g<T>> f299229b;

        i(AtomicReference<j<T>> atomicReference, Callable<? extends g<T>> callable) {
            this.f299228a = atomicReference;
            this.f299229b = callable;
        }

        @Override // org.reactivestreams.u
        public void e(org.reactivestreams.v<? super T> vVar) {
            j<T> jVar;
            while (true) {
                jVar = this.f299228a.get();
                if (jVar != null) {
                    break;
                }
                try {
                    j<T> jVar2 = new j<>(this.f299229b.call());
                    if (androidx.compose.animation.core.z1.a(this.f299228a, null, jVar2)) {
                        jVar = jVar2;
                        break;
                    }
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    io.reactivex.internal.subscriptions.g.c(th2, vVar);
                    return;
                }
            }
            d<T> dVar = new d<>(jVar, vVar);
            vVar.l(dVar);
            jVar.a(dVar);
            if (dVar.k()) {
                jVar.c(dVar);
            } else {
                jVar.b();
                jVar.f299233a.c(dVar);
            }
        }
    }

    static final class j<T> extends AtomicReference<org.reactivestreams.w> implements io.reactivex.q<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f299230h = 7224554242710036740L;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final d[] f299231i = new d[0];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final d[] f299232j = new d[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final g<T> f299233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f299234b;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f299238f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f299239g;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicInteger f299237e = new AtomicInteger();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<d<T>[]> f299235c = new AtomicReference<>(f299231i);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicBoolean f299236d = new AtomicBoolean();

        j(g<T> gVar) {
            this.f299233a = gVar;
        }

        boolean a(d<T> dVar) {
            d<T>[] dVarArr;
            d[] dVarArr2;
            dVar.getClass();
            do {
                dVarArr = this.f299235c.get();
                if (dVarArr == f299232j) {
                    return false;
                }
                int length = dVarArr.length;
                dVarArr2 = new d[length + 1];
                System.arraycopy(dVarArr, 0, dVarArr2, 0, length);
                dVarArr2[length] = dVar;
            } while (!androidx.compose.animation.core.z1.a(this.f299235c, dVarArr, dVarArr2));
            return true;
        }

        void b() {
            if (this.f299237e.getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!k()) {
                    d<T>[] dVarArr = this.f299235c.get();
                    long j10 = this.f299238f;
                    long jMax = j10;
                    for (d<T> dVar : dVarArr) {
                        jMax = Math.max(jMax, dVar.f299217d.get());
                    }
                    long j11 = this.f299239g;
                    org.reactivestreams.w wVar = get();
                    long j12 = jMax - j10;
                    if (j12 != 0) {
                        this.f299238f = jMax;
                        if (wVar == null) {
                            long j13 = j11 + j12;
                            if (j13 < 0) {
                                j13 = Long.MAX_VALUE;
                            }
                            this.f299239g = j13;
                        } else if (j11 != 0) {
                            this.f299239g = 0L;
                            wVar.request(j11 + j12);
                        } else {
                            wVar.request(j12);
                        }
                    } else if (j11 != 0 && wVar != null) {
                        this.f299239g = 0L;
                        wVar.request(j11);
                    }
                    iAddAndGet = this.f299237e.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        break;
                    }
                }
            }
        }

        void c(d<T> dVar) {
            d<T>[] dVarArr;
            d[] dVarArr2;
            do {
                dVarArr = this.f299235c.get();
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
                    dVarArr2 = f299231i;
                } else {
                    d[] dVarArr3 = new d[length - 1];
                    System.arraycopy(dVarArr, 0, dVarArr3, 0, i10);
                    System.arraycopy(dVarArr, i10 + 1, dVarArr3, i10, (length - i10) - 1);
                    dVarArr2 = dVarArr3;
                }
            } while (!androidx.compose.animation.core.z1.a(this.f299235c, dVarArr, dVarArr2));
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f299235c.set(f299232j);
            io.reactivex.internal.subscriptions.j.b(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f299235c.get() == f299232j;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.n(this, wVar)) {
                b();
                for (d<T> dVar : this.f299235c.get()) {
                    this.f299233a.c(dVar);
                }
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299234b) {
                return;
            }
            this.f299234b = true;
            this.f299233a.complete();
            for (d<T> dVar : this.f299235c.getAndSet(f299232j)) {
                this.f299233a.c(dVar);
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299234b) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f299234b = true;
            this.f299233a.error(th2);
            for (d<T> dVar : this.f299235c.getAndSet(f299232j)) {
                this.f299233a.c(dVar);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f299234b) {
                return;
            }
            this.f299233a.next(t10);
            boolean z10 = false;
            for (d<T> dVar : this.f299235c.get()) {
                this.f299233a.c(dVar);
            }
        }
    }

    static final class k<T> implements Callable<g<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f299240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f299241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final TimeUnit f299242c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final io.reactivex.j0 f299243d;

        k(int i10, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
            this.f299240a = i10;
            this.f299241b = j10;
            this.f299242c = timeUnit;
            this.f299243d = j0Var;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g<T> call() {
            return new l(this.f299240a, this.f299241b, this.f299242c, this.f299243d);
        }
    }

    static final class l<T> extends a<T> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f299244i = 3457957419649567404L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.j0 f299245e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final long f299246f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final TimeUnit f299247g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final int f299248h;

        l(int i10, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
            this.f299245e = j0Var;
            this.f299248h = i10;
            this.f299246f = j10;
            this.f299247g = timeUnit;
        }

        @Override // io.reactivex.internal.operators.flowable.d3.a
        Object d(Object obj) {
            return new io.reactivex.schedulers.d(obj, this.f299245e.d(this.f299247g), this.f299247g);
        }

        @Override // io.reactivex.internal.operators.flowable.d3.a
        f e() {
            f fVar;
            long jD = this.f299245e.d(this.f299247g) - this.f299246f;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null) {
                    break;
                }
                io.reactivex.schedulers.d dVar = (io.reactivex.schedulers.d) fVar2.f299225a;
                if (io.reactivex.internal.util.q.s(dVar.d()) || io.reactivex.internal.util.q.v(dVar.d()) || dVar.a() > jD) {
                    break;
                }
                fVar3 = fVar2.get();
            }
            return fVar;
        }

        @Override // io.reactivex.internal.operators.flowable.d3.a
        Object h(Object obj) {
            return ((io.reactivex.schedulers.d) obj).d();
        }

        @Override // io.reactivex.internal.operators.flowable.d3.a
        void m() {
            f fVar;
            long jD = this.f299245e.d(this.f299247g) - this.f299246f;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            int i10 = 0;
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 != null) {
                    int i11 = this.f299208b;
                    if (i11 <= this.f299248h) {
                        if (((io.reactivex.schedulers.d) fVar2.f299225a).a() > jD) {
                            break;
                        }
                        i10++;
                        this.f299208b--;
                        fVar3 = fVar2.get();
                    } else {
                        i10++;
                        this.f299208b = i11 - 1;
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

        @Override // io.reactivex.internal.operators.flowable.d3.a
        void n() {
            f fVar;
            long jD = this.f299245e.d(this.f299247g) - this.f299246f;
            f fVar2 = get();
            f fVar3 = fVar2.get();
            int i10 = 0;
            while (true) {
                f fVar4 = fVar3;
                fVar = fVar2;
                fVar2 = fVar4;
                if (fVar2 == null || this.f299208b <= 1 || ((io.reactivex.schedulers.d) fVar2.f299225a).a() > jD) {
                    break;
                }
                i10++;
                this.f299208b--;
                fVar3 = fVar2.get();
            }
            if (i10 != 0) {
                k(fVar);
            }
        }
    }

    static final class m<T> extends a<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f299249f = -5898283885385201806L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f299250e;

        m(int i10) {
            this.f299250e = i10;
        }

        @Override // io.reactivex.internal.operators.flowable.d3.a
        void m() {
            if (this.f299208b > this.f299250e) {
                i();
            }
        }
    }

    static final class n<T> extends ArrayList<Object> implements g<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f299251b = 7063189396499112664L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile int f299252a;

        n(int i10) {
            super(i10);
        }

        @Override // io.reactivex.internal.operators.flowable.d3.g
        public void c(d<T> dVar) {
            synchronized (dVar) {
                try {
                    if (dVar.f299218e) {
                        dVar.f299219f = true;
                        return;
                    }
                    dVar.f299218e = true;
                    org.reactivestreams.v<? super T> vVar = dVar.f299215b;
                    while (!dVar.k()) {
                        int i10 = this.f299252a;
                        Integer num = (Integer) dVar.a();
                        int iIntValue = num != null ? num.intValue() : 0;
                        long j10 = dVar.get();
                        long j11 = j10;
                        long j12 = 0;
                        while (j11 != 0 && iIntValue < i10) {
                            Object obj = get(iIntValue);
                            try {
                                if (io.reactivex.internal.util.q.c(obj, vVar) || dVar.k()) {
                                    return;
                                }
                                iIntValue++;
                                j11--;
                                j12++;
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.b.b(th2);
                                dVar.dispose();
                                if (io.reactivex.internal.util.q.v(obj) || io.reactivex.internal.util.q.s(obj)) {
                                    return;
                                }
                                vVar.onError(th2);
                                return;
                            }
                        }
                        if (j12 != 0) {
                            dVar.f299216c = Integer.valueOf(iIntValue);
                            if (j10 != Long.MAX_VALUE) {
                                dVar.b(j12);
                            }
                        }
                        synchronized (dVar) {
                            try {
                                if (!dVar.f299219f) {
                                    dVar.f299218e = false;
                                    return;
                                }
                                dVar.f299219f = false;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.d3.g
        public void complete() {
            add(io.reactivex.internal.util.q.k());
            this.f299252a++;
        }

        @Override // io.reactivex.internal.operators.flowable.d3.g
        public void error(Throwable th2) {
            add(io.reactivex.internal.util.q.n(th2));
            this.f299252a++;
        }

        @Override // io.reactivex.internal.operators.flowable.d3.g
        public void next(T t10) {
            add(io.reactivex.internal.util.q.x(t10));
            this.f299252a++;
        }
    }

    private d3(org.reactivestreams.u<T> uVar, io.reactivex.l<T> lVar, AtomicReference<j<T>> atomicReference, Callable<? extends g<T>> callable) {
        this.f299205e = uVar;
        this.f299202b = lVar;
        this.f299203c = atomicReference;
        this.f299204d = callable;
    }

    public static <T> io.reactivex.flowables.a<T> X8(io.reactivex.l<T> lVar, int i10) {
        return i10 == Integer.MAX_VALUE ? b9(lVar) : a9(lVar, new h(i10));
    }

    public static <T> io.reactivex.flowables.a<T> Y8(io.reactivex.l<T> lVar, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
        return Z8(lVar, j10, timeUnit, j0Var, Integer.MAX_VALUE);
    }

    public static <T> io.reactivex.flowables.a<T> Z8(io.reactivex.l<T> lVar, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var, int i10) {
        return a9(lVar, new k(i10, j10, timeUnit, j0Var));
    }

    static <T> io.reactivex.flowables.a<T> a9(io.reactivex.l<T> lVar, Callable<? extends g<T>> callable) {
        AtomicReference atomicReference = new AtomicReference();
        return io.reactivex.plugins.a.T(new d3(new i(atomicReference, callable), lVar, atomicReference, callable));
    }

    public static <T> io.reactivex.flowables.a<T> b9(io.reactivex.l<? extends T> lVar) {
        return a9(lVar, f299201f);
    }

    public static <U, R> io.reactivex.l<R> c9(Callable<? extends io.reactivex.flowables.a<U>> callable, dj.o<? super io.reactivex.l<U>, ? extends org.reactivestreams.u<R>> oVar) {
        return new e(callable, oVar);
    }

    public static <T> io.reactivex.flowables.a<T> d9(io.reactivex.flowables.a<T> aVar, io.reactivex.j0 j0Var) {
        return io.reactivex.plugins.a.T(new b(aVar, aVar.l4(j0Var)));
    }

    @Override // io.reactivex.flowables.a
    public void Q8(dj.g<? super io.reactivex.disposables.c> gVar) {
        j<T> jVar;
        while (true) {
            jVar = this.f299203c.get();
            if (jVar != null && !jVar.k()) {
                break;
            }
            try {
                j<T> jVar2 = new j<>(this.f299204d.call());
                if (androidx.compose.animation.core.z1.a(this.f299203c, jVar, jVar2)) {
                    jVar = jVar2;
                    break;
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                throw io.reactivex.internal.util.k.f(th2);
            }
        }
        boolean z10 = !jVar.f299236d.get() && jVar.f299236d.compareAndSet(false, true);
        try {
            gVar.accept(jVar);
            if (z10) {
                this.f299202b.j6(jVar);
            }
        } catch (Throwable th3) {
            if (z10) {
                jVar.f299236d.compareAndSet(true, false);
            }
            io.reactivex.exceptions.b.b(th3);
            throw io.reactivex.internal.util.k.f(th3);
        }
    }

    @Override // io.reactivex.internal.disposables.g
    public void b(io.reactivex.disposables.c cVar) {
        androidx.compose.animation.core.z1.a(this.f299203c, (j) cVar, null);
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299205e.e(vVar);
    }

    @Override // ej.h
    public org.reactivestreams.u<T> source() {
        return this.f299202b;
    }
}
