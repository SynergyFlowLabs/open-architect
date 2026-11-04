package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class r2<T> extends io.reactivex.flowables.a<T> implements ej.h<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final long f300061f = Long.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.l<T> f300062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference<c<T>> f300063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f300064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final org.reactivestreams.u<T> f300065e;

    static final class a<T> implements org.reactivestreams.u<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicReference<c<T>> f300066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f300067b;

        a(AtomicReference<c<T>> atomicReference, int i10) {
            this.f300066a = atomicReference;
            this.f300067b = i10;
        }

        @Override // org.reactivestreams.u
        public void e(org.reactivestreams.v<? super T> vVar) {
            c<T> cVar;
            b<T> bVar = new b<>(vVar);
            vVar.l(bVar);
            while (true) {
                cVar = this.f300066a.get();
                if (cVar == null || cVar.k()) {
                    c<T> cVar2 = new c<>(this.f300066a, this.f300067b);
                    if (androidx.compose.animation.core.z1.a(this.f300066a, cVar, cVar2)) {
                        cVar = cVar2;
                    }
                }
                if (cVar.a(bVar)) {
                    break;
                }
            }
            if (bVar.get() == Long.MIN_VALUE) {
                cVar.d(bVar);
            } else {
                bVar.f300070b = cVar;
            }
            cVar.c();
        }
    }

    static final class b<T> extends AtomicLong implements org.reactivestreams.w {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f300068d = -4453897557930727610L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f300069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile c<T> f300070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f300071c;

        b(org.reactivestreams.v<? super T> vVar) {
            this.f300069a = vVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            c<T> cVar;
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (cVar = this.f300070b) == null) {
                return;
            }
            cVar.d(this);
            cVar.c();
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.b(this, j10);
                c<T> cVar = this.f300070b;
                if (cVar != null) {
                    cVar.c();
                }
            }
        }
    }

    static final class c<T> extends AtomicInteger implements io.reactivex.q<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f300072i = -202316842419149694L;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final b[] f300073j = new b[0];

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final b[] f300074k = new b[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReference<c<T>> f300075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f300076b;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile Object f300080f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f300081g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile ej.o<T> f300082h;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.w> f300079e = new AtomicReference<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<b<T>[]> f300077c = new AtomicReference<>(f300073j);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicBoolean f300078d = new AtomicBoolean();

        c(AtomicReference<c<T>> atomicReference, int i10) {
            this.f300075a = atomicReference;
            this.f300076b = i10;
        }

        boolean a(b<T> bVar) {
            b<T>[] bVarArr;
            b[] bVarArr2;
            do {
                bVarArr = this.f300077c.get();
                if (bVarArr == f300074k) {
                    return false;
                }
                int length = bVarArr.length;
                bVarArr2 = new b[length + 1];
                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                bVarArr2[length] = bVar;
            } while (!androidx.compose.animation.core.z1.a(this.f300077c, bVarArr, bVarArr2));
            return true;
        }

        boolean b(Object obj, boolean z10) {
            int i10 = 0;
            if (obj != null) {
                if (!io.reactivex.internal.util.q.s(obj)) {
                    Throwable thP = io.reactivex.internal.util.q.p(obj);
                    androidx.compose.animation.core.z1.a(this.f300075a, this, null);
                    b<T>[] andSet = this.f300077c.getAndSet(f300074k);
                    if (andSet.length != 0) {
                        int length = andSet.length;
                        while (i10 < length) {
                            andSet[i10].f300069a.onError(thP);
                            i10++;
                        }
                    } else {
                        io.reactivex.plugins.a.Y(thP);
                    }
                    return true;
                }
                if (z10) {
                    androidx.compose.animation.core.z1.a(this.f300075a, this, null);
                    b<T>[] andSet2 = this.f300077c.getAndSet(f300074k);
                    int length2 = andSet2.length;
                    while (i10 < length2) {
                        andSet2[i10].f300069a.onComplete();
                        i10++;
                    }
                    return true;
                }
            }
            return false;
        }

        void c() {
            boolean z10;
            T tPoll;
            b<T>[] bVarArr;
            T tPoll2;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<b<T>[]> atomicReference = this.f300077c;
            boolean z11 = true;
            b<T>[] bVarArr2 = atomicReference.get();
            int iAddAndGet = 1;
            while (true) {
                Object obj = this.f300080f;
                ej.o<T> oVar = this.f300082h;
                boolean z12 = (oVar == null || oVar.isEmpty()) ? z11 : false;
                if (b(obj, z12)) {
                    return;
                }
                if (z12) {
                    z10 = z11;
                } else {
                    int length = bVarArr2.length;
                    int i10 = 0;
                    long jMin = Long.MAX_VALUE;
                    for (b<T> bVar : bVarArr2) {
                        long j10 = bVar.get();
                        if (j10 != Long.MIN_VALUE) {
                            jMin = Math.min(jMin, j10 - bVar.f300071c);
                        } else {
                            i10++;
                        }
                    }
                    long j11 = 1;
                    if (length == i10) {
                        Object objN = this.f300080f;
                        try {
                            tPoll = oVar.poll();
                        } catch (Throwable th2) {
                            io.reactivex.exceptions.b.b(th2);
                            this.f300079e.get().cancel();
                            objN = io.reactivex.internal.util.q.n(th2);
                            this.f300080f = objN;
                            tPoll = null;
                        }
                        if (b(objN, tPoll == null ? z11 : false)) {
                            return;
                        }
                        if (this.f300081g != z11) {
                            this.f300079e.get().request(1L);
                        }
                        z10 = z11;
                        bVarArr = bVarArr2;
                    } else {
                        int i11 = 0;
                        while (true) {
                            long j12 = i11;
                            if (j12 < jMin) {
                                Object objN2 = this.f300080f;
                                try {
                                    tPoll2 = oVar.poll();
                                } catch (Throwable th3) {
                                    io.reactivex.exceptions.b.b(th3);
                                    this.f300079e.get().cancel();
                                    objN2 = io.reactivex.internal.util.q.n(th3);
                                    this.f300080f = objN2;
                                    tPoll2 = null;
                                }
                                boolean z13 = tPoll2 == null ? z11 : false;
                                if (b(objN2, z13)) {
                                    return;
                                }
                                if (z13) {
                                    z12 = z13;
                                } else {
                                    Object objR = io.reactivex.internal.util.q.r(tPoll2);
                                    int length2 = bVarArr2.length;
                                    int i12 = 0;
                                    boolean z14 = false;
                                    while (i12 < length2) {
                                        long j13 = j11;
                                        b<T> bVar2 = bVarArr2[i12];
                                        long j14 = bVar2.get();
                                        if (j14 != Long.MIN_VALUE) {
                                            if (j14 != Long.MAX_VALUE) {
                                                bVar2.f300071c += j13;
                                            }
                                            bVar2.f300069a.onNext(objR);
                                        } else {
                                            z14 = true;
                                        }
                                        i12++;
                                        bVarArr2 = bVarArr2;
                                        j11 = j13;
                                    }
                                    b<T>[] bVarArr3 = bVarArr2;
                                    long j15 = j11;
                                    i11++;
                                    b<T>[] bVarArr4 = atomicReference.get();
                                    if (z14 || bVarArr4 != bVarArr3) {
                                        if (i11 != 0 && this.f300081g != 1) {
                                            this.f300079e.get().request(i11);
                                        }
                                        bVarArr2 = bVarArr4;
                                        z11 = true;
                                    } else {
                                        bVarArr2 = bVarArr3;
                                        z12 = z13;
                                        j11 = j15;
                                        z11 = true;
                                    }
                                }
                            }
                            bVarArr = bVarArr2;
                            if (i11 != 0) {
                                z10 = true;
                                if (this.f300081g != 1) {
                                    this.f300079e.get().request(j12);
                                }
                            } else {
                                z10 = true;
                            }
                            if (jMin == 0 || z12) {
                            }
                            z11 = z10;
                        }
                    }
                    bVarArr2 = bVarArr;
                    z11 = z10;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                bVarArr2 = atomicReference.get();
                z11 = z10;
            }
        }

        void d(b<T> bVar) {
            b<T>[] bVarArr;
            b[] bVarArr2;
            do {
                bVarArr = this.f300077c.get();
                int length = bVarArr.length;
                if (length != 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            i10 = -1;
                            break;
                        } else if (bVarArr[i10].equals(bVar)) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (i10 < 0) {
                        break;
                    }
                    if (length == 1) {
                        bVarArr2 = f300073j;
                    } else {
                        b[] bVarArr3 = new b[length - 1];
                        System.arraycopy(bVarArr, 0, bVarArr3, 0, i10);
                        System.arraycopy(bVarArr, i10 + 1, bVarArr3, i10, (length - i10) - 1);
                        bVarArr2 = bVarArr3;
                    }
                } else {
                    break;
                }
            } while (!androidx.compose.animation.core.z1.a(this.f300077c, bVarArr, bVarArr2));
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            b<T>[] bVarArr = this.f300077c.get();
            b<T>[] bVarArr2 = f300074k;
            if (bVarArr != bVarArr2 && this.f300077c.getAndSet(bVarArr2) != bVarArr2) {
                androidx.compose.animation.core.z1.a(this.f300075a, this, null);
                io.reactivex.internal.subscriptions.j.b(this.f300079e);
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300077c.get() == f300074k;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.n(this.f300079e, wVar)) {
                if (wVar instanceof ej.l) {
                    ej.l lVar = (ej.l) wVar;
                    int iP = lVar.p(7);
                    if (iP == 1) {
                        this.f300081g = iP;
                        this.f300082h = lVar;
                        this.f300080f = io.reactivex.internal.util.q.k();
                        c();
                        return;
                    }
                    if (iP == 2) {
                        this.f300081g = iP;
                        this.f300082h = lVar;
                        wVar.request(this.f300076b);
                        return;
                    }
                }
                this.f300082h = new io.reactivex.internal.queue.b(this.f300076b);
                wVar.request(this.f300076b);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f300080f == null) {
                this.f300080f = io.reactivex.internal.util.q.k();
                c();
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f300080f != null) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f300080f = io.reactivex.internal.util.q.n(th2);
                c();
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f300081g != 0 || this.f300082h.offer(t10)) {
                c();
            } else {
                onError(new io.reactivex.exceptions.c("Prefetch queue is full?!"));
            }
        }
    }

    private r2(org.reactivestreams.u<T> uVar, io.reactivex.l<T> lVar, AtomicReference<c<T>> atomicReference, int i10) {
        this.f300065e = uVar;
        this.f300062b = lVar;
        this.f300063c = atomicReference;
        this.f300064d = i10;
    }

    public static <T> io.reactivex.flowables.a<T> X8(io.reactivex.l<T> lVar, int i10) {
        AtomicReference atomicReference = new AtomicReference();
        return io.reactivex.plugins.a.T(new r2(new a(atomicReference, i10), lVar, atomicReference, i10));
    }

    @Override // io.reactivex.flowables.a
    public void Q8(dj.g<? super io.reactivex.disposables.c> gVar) {
        c<T> cVar;
        while (true) {
            cVar = this.f300063c.get();
            if (cVar != null && !cVar.k()) {
                break;
            }
            c<T> cVar2 = new c<>(this.f300063c, this.f300064d);
            if (androidx.compose.animation.core.z1.a(this.f300063c, cVar, cVar2)) {
                cVar = cVar2;
                break;
            }
        }
        boolean z10 = false;
        if (!cVar.f300078d.get() && cVar.f300078d.compareAndSet(false, true)) {
            z10 = true;
        }
        try {
            gVar.accept(cVar);
            if (z10) {
                this.f300062b.j6(cVar);
            }
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            throw io.reactivex.internal.util.k.f(th2);
        }
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f300065e.e(vVar);
    }

    @Override // ej.h
    public org.reactivestreams.u<T> source() {
        return this.f300062b;
    }
}
