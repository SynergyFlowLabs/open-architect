package io.reactivex.internal.operators.parallel;

import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;
import org.reactivestreams.u;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes10.dex */
public final class h<T> extends io.reactivex.parallel.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final u<? extends T> f302741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f302742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f302743c;

    static final class a<T> extends AtomicInteger implements q<T> {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final long f302744o = -4470634016609963609L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final v<? super T>[] f302745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicLongArray f302746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long[] f302747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f302748d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f302749e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        w f302750f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ej.o<T> f302751g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Throwable f302752h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f302753i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f302754j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f302755k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final AtomicInteger f302756l = new AtomicInteger();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f302757m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f302758n;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.parallel.h$a$a, reason: collision with other inner class name */
        final class C2186a implements w {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final int f302759a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final int f302760b;

            C2186a(int i10, int i11) {
                this.f302759a = i10;
                this.f302760b = i11;
            }

            @Override // org.reactivestreams.w
            public void cancel() {
                if (a.this.f302746b.compareAndSet(this.f302759a + this.f302760b, 0L, 1L)) {
                    a aVar = a.this;
                    int i10 = this.f302760b;
                    aVar.a(i10 + i10);
                }
            }

            @Override // org.reactivestreams.w
            public void request(long j10) {
                long j11;
                if (io.reactivex.internal.subscriptions.j.p(j10)) {
                    AtomicLongArray atomicLongArray = a.this.f302746b;
                    do {
                        j11 = atomicLongArray.get(this.f302759a);
                        if (j11 == Long.MAX_VALUE) {
                            return;
                        }
                    } while (!atomicLongArray.compareAndSet(this.f302759a, j11, io.reactivex.internal.util.d.c(j11, j10)));
                    if (a.this.f302756l.get() == this.f302760b) {
                        a.this.b();
                    }
                }
            }
        }

        a(v<? super T>[] vVarArr, int i10) {
            this.f302745a = vVarArr;
            this.f302748d = i10;
            this.f302749e = i10 - (i10 >> 2);
            int length = vVarArr.length;
            int i11 = length + length;
            AtomicLongArray atomicLongArray = new AtomicLongArray(i11 + 1);
            this.f302746b = atomicLongArray;
            atomicLongArray.lazySet(i11, length);
            this.f302747c = new long[length];
        }

        void a(int i10) {
            if (this.f302746b.decrementAndGet(i10) == 0) {
                this.f302755k = true;
                this.f302750f.cancel();
                if (getAndIncrement() == 0) {
                    this.f302751g.clear();
                }
            }
        }

        void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f302758n == 1) {
                d();
            } else {
                c();
            }
        }

        void c() {
            Throwable th2;
            ej.o<T> oVar = this.f302751g;
            v<? super T>[] vVarArr = this.f302745a;
            AtomicLongArray atomicLongArray = this.f302746b;
            long[] jArr = this.f302747c;
            int length = jArr.length;
            int i10 = this.f302754j;
            int i11 = this.f302757m;
            int iAddAndGet = 1;
            while (true) {
                int i12 = 0;
                int i13 = 0;
                do {
                    if (this.f302755k) {
                        oVar.clear();
                        return;
                    }
                    boolean z10 = this.f302753i;
                    if (z10 && (th2 = this.f302752h) != null) {
                        oVar.clear();
                        int length2 = vVarArr.length;
                        while (i12 < length2) {
                            vVarArr[i12].onError(th2);
                            i12++;
                        }
                        return;
                    }
                    boolean zIsEmpty = oVar.isEmpty();
                    if (z10 && zIsEmpty) {
                        int length3 = vVarArr.length;
                        while (i12 < length3) {
                            vVarArr[i12].onComplete();
                            i12++;
                        }
                        return;
                    }
                    if (zIsEmpty) {
                        break;
                    }
                    long j10 = atomicLongArray.get(i10);
                    long j11 = jArr[i10];
                    if (j10 == j11 || atomicLongArray.get(length + i10) != 0) {
                        i13++;
                    } else {
                        try {
                            T tPoll = oVar.poll();
                            if (tPoll == null) {
                                break;
                            }
                            vVarArr[i10].onNext(tPoll);
                            jArr[i10] = j11 + 1;
                            i11++;
                            if (i11 == this.f302749e) {
                                this.f302750f.request(i11);
                                i11 = 0;
                            }
                            i13 = 0;
                        } catch (Throwable th3) {
                            io.reactivex.exceptions.b.b(th3);
                            this.f302750f.cancel();
                            int length4 = vVarArr.length;
                            while (i12 < length4) {
                                vVarArr[i12].onError(th3);
                                i12++;
                            }
                            return;
                        }
                    }
                    i10++;
                    if (i10 == length) {
                        i10 = 0;
                    }
                } while (i13 != length);
                int i14 = get();
                if (i14 == iAddAndGet) {
                    this.f302754j = i10;
                    this.f302757m = i11;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i14;
                }
            }
        }

        void d() {
            ej.o<T> oVar = this.f302751g;
            v<? super T>[] vVarArr = this.f302745a;
            AtomicLongArray atomicLongArray = this.f302746b;
            long[] jArr = this.f302747c;
            int length = jArr.length;
            int i10 = this.f302754j;
            int iAddAndGet = 1;
            while (true) {
                int i11 = 0;
                int i12 = 0;
                do {
                    if (this.f302755k) {
                        oVar.clear();
                        return;
                    }
                    if (oVar.isEmpty()) {
                        int length2 = vVarArr.length;
                        while (i11 < length2) {
                            vVarArr[i11].onComplete();
                            i11++;
                        }
                        return;
                    }
                    long j10 = atomicLongArray.get(i10);
                    long j11 = jArr[i10];
                    if (j10 == j11 || atomicLongArray.get(length + i10) != 0) {
                        i12++;
                    } else {
                        try {
                            T tPoll = oVar.poll();
                            if (tPoll == null) {
                                int length3 = vVarArr.length;
                                while (i11 < length3) {
                                    vVarArr[i11].onComplete();
                                    i11++;
                                }
                                return;
                            }
                            vVarArr[i10].onNext(tPoll);
                            jArr[i10] = j11 + 1;
                            i12 = 0;
                        } catch (Throwable th2) {
                            io.reactivex.exceptions.b.b(th2);
                            this.f302750f.cancel();
                            int length4 = vVarArr.length;
                            while (i11 < length4) {
                                vVarArr[i11].onError(th2);
                                i11++;
                            }
                            return;
                        }
                    }
                    i10++;
                    if (i10 == length) {
                        i10 = 0;
                    }
                } while (i12 != length);
                int i13 = get();
                if (i13 == iAddAndGet) {
                    this.f302754j = i10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i13;
                }
            }
        }

        void e() {
            v<? super T>[] vVarArr = this.f302745a;
            int length = vVarArr.length;
            int i10 = 0;
            while (i10 < length && !this.f302755k) {
                int i11 = i10 + 1;
                this.f302756l.lazySet(i11);
                vVarArr[i10].l(new C2186a(i10, length));
                i10 = i11;
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f302750f, wVar)) {
                this.f302750f = wVar;
                if (wVar instanceof ej.l) {
                    ej.l lVar = (ej.l) wVar;
                    int iP = lVar.p(7);
                    if (iP == 1) {
                        this.f302758n = iP;
                        this.f302751g = lVar;
                        this.f302753i = true;
                        e();
                        b();
                        return;
                    }
                    if (iP == 2) {
                        this.f302758n = iP;
                        this.f302751g = lVar;
                        e();
                        wVar.request(this.f302748d);
                        return;
                    }
                }
                this.f302751g = new io.reactivex.internal.queue.b(this.f302748d);
                e();
                wVar.request(this.f302748d);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f302753i = true;
            b();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f302752h = th2;
            this.f302753i = true;
            b();
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f302758n != 0 || this.f302751g.offer(t10)) {
                b();
            } else {
                this.f302750f.cancel();
                onError(new io.reactivex.exceptions.c("Queue is full?"));
            }
        }
    }

    public h(u<? extends T> uVar, int i10, int i11) {
        this.f302741a = uVar;
        this.f302742b = i10;
        this.f302743c = i11;
    }

    @Override // io.reactivex.parallel.b
    public int F() {
        return this.f302742b;
    }

    @Override // io.reactivex.parallel.b
    public void Q(v<? super T>[] vVarArr) {
        if (U(vVarArr)) {
            this.f302741a.e(new a(vVarArr, this.f302743c));
        }
    }
}
