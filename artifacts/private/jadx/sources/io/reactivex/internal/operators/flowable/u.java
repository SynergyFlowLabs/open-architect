package io.reactivex.internal.operators.flowable;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class u<T, R> extends io.reactivex.l<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @cj.g
    final org.reactivestreams.u<? extends T>[] f300267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @cj.g
    final Iterable<? extends org.reactivestreams.u<? extends T>> f300268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final dj.o<? super Object[], ? extends R> f300269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f300270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f300271f;

    static final class a<T, R> extends io.reactivex.internal.subscriptions.c<R> {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final long f300272o = -5082275438355852221L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.v<? super R> f300273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.o<? super Object[], ? extends R> f300274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final b<T>[] f300275d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.internal.queue.c<Object> f300276e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Object[] f300277f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final boolean f300278g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f300279h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f300280i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f300281j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f300282k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final AtomicLong f300283l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        volatile boolean f300284m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final AtomicReference<Throwable> f300285n;

        a(org.reactivestreams.v<? super R> vVar, dj.o<? super Object[], ? extends R> oVar, int i10, int i11, boolean z10) {
            this.f300273b = vVar;
            this.f300274c = oVar;
            b<T>[] bVarArr = new b[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                bVarArr[i12] = new b<>(this, i12, i11);
            }
            this.f300275d = bVarArr;
            this.f300277f = new Object[i10];
            this.f300276e = new io.reactivex.internal.queue.c<>(i11);
            this.f300283l = new AtomicLong();
            this.f300285n = new AtomicReference<>();
            this.f300278g = z10;
        }

        void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f300279h) {
                i();
            } else {
                h();
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f300282k = true;
            f();
        }

        @Override // ej.o
        public void clear() {
            this.f300276e.clear();
        }

        void f() {
            for (b<T> bVar : this.f300275d) {
                bVar.a();
            }
        }

        boolean g(boolean z10, boolean z11, org.reactivestreams.v<?> vVar, io.reactivex.internal.queue.c<?> cVar) {
            if (this.f300282k) {
                f();
                cVar.clear();
                return true;
            }
            if (z10) {
                if (!this.f300278g) {
                    Throwable thC = io.reactivex.internal.util.k.c(this.f300285n);
                    if (thC != null && thC != io.reactivex.internal.util.k.f303486a) {
                        f();
                        cVar.clear();
                        vVar.onError(thC);
                        return true;
                    }
                    if (z11) {
                        f();
                        vVar.onComplete();
                        return true;
                    }
                } else if (z11) {
                    f();
                    Throwable thC2 = io.reactivex.internal.util.k.c(this.f300285n);
                    if (thC2 == null || thC2 == io.reactivex.internal.util.k.f303486a) {
                        vVar.onComplete();
                    } else {
                        vVar.onError(thC2);
                    }
                    return true;
                }
            }
            return false;
        }

        void h() {
            org.reactivestreams.v<? super R> vVar = this.f300273b;
            io.reactivex.internal.queue.c<?> cVar = this.f300276e;
            int iAddAndGet = 1;
            do {
                long j10 = this.f300283l.get();
                long j11 = 0;
                while (j11 != j10) {
                    boolean z10 = this.f300284m;
                    Object objPoll = cVar.poll();
                    boolean z11 = objPoll == null;
                    if (g(z10, z11, vVar, cVar)) {
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    try {
                        vVar.onNext((Object) io.reactivex.internal.functions.b.g(this.f300274c.apply((Object[]) cVar.poll()), "The combiner returned a null value"));
                        ((b) objPoll).b();
                        j11++;
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.b.b(th2);
                        f();
                        io.reactivex.internal.util.k.a(this.f300285n, th2);
                        vVar.onError(io.reactivex.internal.util.k.c(this.f300285n));
                        return;
                    }
                }
                if (j11 == j10 && g(this.f300284m, cVar.isEmpty(), vVar, cVar)) {
                    return;
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.f300283l.addAndGet(-j11);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        void i() {
            org.reactivestreams.v<? super R> vVar = this.f300273b;
            io.reactivex.internal.queue.c<Object> cVar = this.f300276e;
            int iAddAndGet = 1;
            while (!this.f300282k) {
                Throwable th2 = this.f300285n.get();
                if (th2 != null) {
                    cVar.clear();
                    vVar.onError(th2);
                    return;
                }
                boolean z10 = this.f300284m;
                boolean zIsEmpty = cVar.isEmpty();
                if (!zIsEmpty) {
                    vVar.onNext(null);
                }
                if (z10 && zIsEmpty) {
                    vVar.onComplete();
                    return;
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            cVar.clear();
        }

        @Override // ej.o
        public boolean isEmpty() {
            return this.f300276e.isEmpty();
        }

        void j(int i10) {
            int i11;
            synchronized (this) {
                try {
                    Object[] objArr = this.f300277f;
                    if (objArr[i10] != null && (i11 = this.f300281j + 1) != objArr.length) {
                        this.f300281j = i11;
                    } else {
                        this.f300284m = true;
                        c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void k(int i10, Throwable th2) {
            if (!io.reactivex.internal.util.k.a(this.f300285n, th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                if (this.f300278g) {
                    j(i10);
                    return;
                }
                f();
                this.f300284m = true;
                c();
            }
        }

        void m(int i10, T t10) {
            boolean z10;
            synchronized (this) {
                try {
                    Object[] objArr = this.f300277f;
                    int i11 = this.f300280i;
                    if (objArr[i10] == null) {
                        i11++;
                        this.f300280i = i11;
                    }
                    objArr[i10] = t10;
                    if (objArr.length == i11) {
                        this.f300276e.r(this.f300275d[i10], objArr.clone());
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                this.f300275d[i10].b();
            } else {
                c();
            }
        }

        void o(org.reactivestreams.u<? extends T>[] uVarArr, int i10) {
            b<T>[] bVarArr = this.f300275d;
            for (int i11 = 0; i11 < i10 && !this.f300284m && !this.f300282k; i11++) {
                uVarArr[i11].e(bVarArr[i11]);
            }
        }

        @Override // ej.k
        public int p(int i10) {
            if ((i10 & 4) != 0) {
                return 0;
            }
            int i11 = i10 & 2;
            this.f300279h = i11 != 0;
            return i11;
        }

        @Override // ej.o
        @cj.g
        public R poll() throws Exception {
            Object objPoll = this.f300276e.poll();
            if (objPoll == null) {
                return null;
            }
            R r10 = (R) io.reactivex.internal.functions.b.g(this.f300274c.apply((Object[]) this.f300276e.poll()), "The combiner returned a null value");
            ((b) objPoll).b();
            return r10;
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f300283l, j10);
                c();
            }
        }
    }

    static final class b<T> extends AtomicReference<org.reactivestreams.w> implements io.reactivex.q<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f300286f = -8730235182291002949L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<T, ?> f300287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f300288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f300289c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f300290d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f300291e;

        b(a<T, ?> aVar, int i10, int i11) {
            this.f300287a = aVar;
            this.f300288b = i10;
            this.f300289c = i11;
            this.f300290d = i11 - (i11 >> 2);
        }

        public void a() {
            io.reactivex.internal.subscriptions.j.b(this);
        }

        public void b() {
            int i10 = this.f300291e + 1;
            if (i10 != this.f300290d) {
                this.f300291e = i10;
            } else {
                this.f300291e = 0;
                get().request(i10);
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            io.reactivex.internal.subscriptions.j.o(this, wVar, this.f300289c);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f300287a.j(this.f300288b);
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f300287a.k(this.f300288b, th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f300287a.m(this.f300288b, t10);
        }
    }

    final class c implements dj.o<T, R> {
        c() {
        }

        @Override // dj.o
        public R apply(T t10) throws Exception {
            return u.this.f300269d.apply(new Object[]{t10});
        }
    }

    public u(@cj.f org.reactivestreams.u<? extends T>[] uVarArr, @cj.f dj.o<? super Object[], ? extends R> oVar, int i10, boolean z10) {
        this.f300267b = uVarArr;
        this.f300268c = null;
        this.f300269d = oVar;
        this.f300270e = i10;
        this.f300271f = z10;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super R> vVar) {
        int length;
        org.reactivestreams.u<? extends T>[] uVarArr = this.f300267b;
        if (uVarArr == null) {
            uVarArr = new org.reactivestreams.u[8];
            try {
                Iterator it = (Iterator) io.reactivex.internal.functions.b.g(this.f300268c.iterator(), "The iterator returned is null");
                length = 0;
                while (it.hasNext()) {
                    try {
                        try {
                            org.reactivestreams.u<? extends T> uVar = (org.reactivestreams.u) io.reactivex.internal.functions.b.g(it.next(), "The publisher returned by the iterator is null");
                            if (length == uVarArr.length) {
                                org.reactivestreams.u<? extends T>[] uVarArr2 = new org.reactivestreams.u[(length >> 2) + length];
                                System.arraycopy(uVarArr, 0, uVarArr2, 0, length);
                                uVarArr = uVarArr2;
                            }
                            uVarArr[length] = uVar;
                            length++;
                        } catch (Throwable th2) {
                            io.reactivex.exceptions.b.b(th2);
                            io.reactivex.internal.subscriptions.g.c(th2, vVar);
                            return;
                        }
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.b.b(th3);
                        io.reactivex.internal.subscriptions.g.c(th3, vVar);
                        return;
                    }
                }
            } catch (Throwable th4) {
                io.reactivex.exceptions.b.b(th4);
                io.reactivex.internal.subscriptions.g.c(th4, vVar);
                return;
            }
        } else {
            length = uVarArr.length;
        }
        int i10 = length;
        if (i10 == 0) {
            io.reactivex.internal.subscriptions.g.b(vVar);
        } else {
            if (i10 == 1) {
                uVarArr[0].e(new b2.b(vVar, new c()));
                return;
            }
            a aVar = new a(vVar, this.f300269d, i10, this.f300270e, this.f300271f);
            vVar.l(aVar);
            aVar.o(uVarArr, i10);
        }
    }

    public u(@cj.f Iterable<? extends org.reactivestreams.u<? extends T>> iterable, @cj.f dj.o<? super Object[], ? extends R> oVar, int i10, boolean z10) {
        this.f300267b = null;
        this.f300268c = iterable;
        this.f300269d = oVar;
        this.f300270e = i10;
        this.f300271f = z10;
    }
}
