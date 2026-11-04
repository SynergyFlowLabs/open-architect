package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class s2<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super io.reactivex.l<T>, ? extends org.reactivestreams.u<? extends R>> f300143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f300144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f300145e;

    static final class a<T> extends io.reactivex.l<T> implements io.reactivex.q<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final b[] f300146m = new b[0];

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final b[] f300147n = new b[0];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f300150d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f300151e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f300152f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile ej.o<T> f300154h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f300155i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f300156j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Throwable f300157k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f300158l;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicInteger f300148b = new AtomicInteger();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicReference<org.reactivestreams.w> f300153g = new AtomicReference<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<b<T>[]> f300149c = new AtomicReference<>(f300146m);

        a(int i10, boolean z10) {
            this.f300150d = i10;
            this.f300151e = i10 - (i10 >> 2);
            this.f300152f = z10;
        }

        boolean M8(b<T> bVar) {
            b<T>[] bVarArr;
            b[] bVarArr2;
            do {
                bVarArr = this.f300149c.get();
                if (bVarArr == f300147n) {
                    return false;
                }
                int length = bVarArr.length;
                bVarArr2 = new b[length + 1];
                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                bVarArr2[length] = bVar;
            } while (!androidx.compose.animation.core.z1.a(this.f300149c, bVarArr, bVarArr2));
            return true;
        }

        void N8() {
            for (b<T> bVar : this.f300149c.getAndSet(f300147n)) {
                if (bVar.get() != Long.MIN_VALUE) {
                    bVar.f300160a.onComplete();
                }
            }
        }

        void O8() {
            AtomicReference<b<T>[]> atomicReference;
            Throwable th2;
            Throwable th3;
            if (this.f300148b.getAndIncrement() != 0) {
                return;
            }
            ej.o<T> oVar = this.f300154h;
            int i10 = this.f300158l;
            int i11 = this.f300151e;
            boolean z10 = this.f300155i != 1;
            AtomicReference<b<T>[]> atomicReference2 = this.f300149c;
            b<T>[] bVarArr = atomicReference2.get();
            int iAddAndGet = 1;
            while (true) {
                int length = bVarArr.length;
                if (oVar == null || length == 0) {
                    atomicReference = atomicReference2;
                } else {
                    int length2 = bVarArr.length;
                    long j10 = Long.MAX_VALUE;
                    long j11 = Long.MAX_VALUE;
                    int i12 = 0;
                    while (i12 < length2) {
                        b<T> bVar = bVarArr[i12];
                        AtomicReference<b<T>[]> atomicReference3 = atomicReference2;
                        long j12 = bVar.get() - bVar.f300162c;
                        if (j12 == Long.MIN_VALUE) {
                            length--;
                        } else if (j11 > j12) {
                            j11 = j12;
                        }
                        i12++;
                        atomicReference2 = atomicReference3;
                    }
                    atomicReference = atomicReference2;
                    long j13 = 0;
                    if (length == 0) {
                        j11 = 0;
                    }
                    while (true) {
                        if (j11 != j13) {
                            if (k()) {
                                oVar.clear();
                                return;
                            }
                            boolean z11 = this.f300156j;
                            if (z11 && !this.f300152f && (th3 = this.f300157k) != null) {
                                P8(th3);
                                return;
                            }
                            try {
                                T tPoll = oVar.poll();
                                boolean z12 = tPoll == null;
                                if (z11 && z12) {
                                    Throwable th4 = this.f300157k;
                                    if (th4 != null) {
                                        P8(th4);
                                        return;
                                    } else {
                                        N8();
                                        return;
                                    }
                                }
                                if (!z12) {
                                    int length3 = bVarArr.length;
                                    int i13 = 0;
                                    boolean z13 = false;
                                    while (i13 < length3) {
                                        b<T> bVar2 = bVarArr[i13];
                                        long j14 = bVar2.get();
                                        if (j14 != Long.MIN_VALUE) {
                                            if (j14 != j10) {
                                                bVar2.f300162c++;
                                            }
                                            bVar2.f300160a.onNext(tPoll);
                                        } else {
                                            z13 = true;
                                        }
                                        i13++;
                                        j10 = Long.MAX_VALUE;
                                    }
                                    j11--;
                                    if (z10 && (i10 = i10 + 1) == i11) {
                                        this.f300153g.get().request(i11);
                                        i10 = 0;
                                    }
                                    b<T>[] bVarArr2 = atomicReference.get();
                                    if (z13 || bVarArr2 != bVarArr) {
                                        bVarArr = bVarArr2;
                                    } else {
                                        j13 = 0;
                                        j10 = Long.MAX_VALUE;
                                    }
                                }
                                atomicReference2 = atomicReference;
                            } catch (Throwable th5) {
                                io.reactivex.exceptions.b.b(th5);
                                io.reactivex.internal.subscriptions.j.b(this.f300153g);
                                P8(th5);
                                return;
                            }
                        }
                        if (j11 == j13) {
                            if (k()) {
                                oVar.clear();
                                return;
                            }
                            boolean z14 = this.f300156j;
                            if (z14 && !this.f300152f && (th2 = this.f300157k) != null) {
                                P8(th2);
                                return;
                            }
                            if (z14 && oVar.isEmpty()) {
                                Throwable th6 = this.f300157k;
                                if (th6 != null) {
                                    P8(th6);
                                    return;
                                } else {
                                    N8();
                                    return;
                                }
                            }
                        }
                    }
                }
                this.f300158l = i10;
                iAddAndGet = this.f300148b.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (oVar == null) {
                    oVar = this.f300154h;
                }
                bVarArr = atomicReference.get();
                atomicReference2 = atomicReference;
            }
        }

        void P8(Throwable th2) {
            for (b<T> bVar : this.f300149c.getAndSet(f300147n)) {
                if (bVar.get() != Long.MIN_VALUE) {
                    bVar.f300160a.onError(th2);
                }
            }
        }

        void Q8(b<T> bVar) {
            b<T>[] bVarArr;
            b[] bVarArr2;
            do {
                bVarArr = this.f300149c.get();
                int length = bVarArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (bVarArr[i10] == bVar) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    bVarArr2 = f300146m;
                } else {
                    b[] bVarArr3 = new b[length - 1];
                    System.arraycopy(bVarArr, 0, bVarArr3, 0, i10);
                    System.arraycopy(bVarArr, i10 + 1, bVarArr3, i10, (length - i10) - 1);
                    bVarArr2 = bVarArr3;
                }
            } while (!androidx.compose.animation.core.z1.a(this.f300149c, bVarArr, bVarArr2));
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            ej.o<T> oVar;
            io.reactivex.internal.subscriptions.j.b(this.f300153g);
            if (this.f300148b.getAndIncrement() != 0 || (oVar = this.f300154h) == null) {
                return;
            }
            oVar.clear();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300153g.get() == io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.l
        protected void k6(org.reactivestreams.v<? super T> vVar) {
            b<T> bVar = new b<>(vVar, this);
            vVar.l(bVar);
            if (M8(bVar)) {
                if (bVar.a()) {
                    Q8(bVar);
                    return;
                } else {
                    O8();
                    return;
                }
            }
            Throwable th2 = this.f300157k;
            if (th2 != null) {
                vVar.onError(th2);
            } else {
                vVar.onComplete();
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.n(this.f300153g, wVar)) {
                if (wVar instanceof ej.l) {
                    ej.l lVar = (ej.l) wVar;
                    int iP = lVar.p(3);
                    if (iP == 1) {
                        this.f300155i = iP;
                        this.f300154h = lVar;
                        this.f300156j = true;
                        O8();
                        return;
                    }
                    if (iP == 2) {
                        this.f300155i = iP;
                        this.f300154h = lVar;
                        io.reactivex.internal.util.v.j(wVar, this.f300150d);
                        return;
                    }
                }
                this.f300154h = io.reactivex.internal.util.v.c(this.f300150d);
                io.reactivex.internal.util.v.j(wVar, this.f300150d);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f300156j) {
                return;
            }
            this.f300156j = true;
            O8();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f300156j) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f300157k = th2;
            this.f300156j = true;
            O8();
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f300156j) {
                return;
            }
            if (this.f300155i != 0 || this.f300154h.offer(t10)) {
                O8();
            } else {
                this.f300153g.get().cancel();
                onError(new io.reactivex.exceptions.c());
            }
        }
    }

    static final class b<T> extends AtomicLong implements org.reactivestreams.w {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f300159d = 8664815189257569791L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f300160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final a<T> f300161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f300162c;

        b(org.reactivestreams.v<? super T> vVar, a<T> aVar) {
            this.f300160a = vVar;
            this.f300161b = aVar;
        }

        public boolean a() {
            return get() == Long.MIN_VALUE;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f300161b.Q8(this);
                this.f300161b.O8();
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.b(this, j10);
                this.f300161b.O8();
            }
        }
    }

    static final class c<R> implements io.reactivex.q<R>, org.reactivestreams.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super R> f300163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final a<?> f300164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        org.reactivestreams.w f300165c;

        c(org.reactivestreams.v<? super R> vVar, a<?> aVar) {
            this.f300163a = vVar;
            this.f300164b = aVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f300165c.cancel();
            this.f300164b.dispose();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300165c, wVar)) {
                this.f300165c = wVar;
                this.f300163a.l(this);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f300163a.onComplete();
            this.f300164b.dispose();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f300163a.onError(th2);
            this.f300164b.dispose();
        }

        @Override // org.reactivestreams.v
        public void onNext(R r10) {
            this.f300163a.onNext(r10);
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            this.f300165c.request(j10);
        }
    }

    public s2(io.reactivex.l<T> lVar, dj.o<? super io.reactivex.l<T>, ? extends org.reactivestreams.u<? extends R>> oVar, int i10, boolean z10) {
        super(lVar);
        this.f300143c = oVar;
        this.f300144d = i10;
        this.f300145e = z10;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super R> vVar) {
        a aVar = new a(this.f300144d, this.f300145e);
        try {
            ((org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.f300143c.apply(aVar), "selector returned a null Publisher")).e(new c(vVar, aVar));
            this.f299043b.j6(aVar);
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.subscriptions.g.c(th2, vVar);
        }
    }
}
