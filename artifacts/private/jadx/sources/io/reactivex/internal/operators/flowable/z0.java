package io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class z0<T, U> extends io.reactivex.internal.operators.flowable.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends org.reactivestreams.u<? extends U>> f300572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f300573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f300574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f300575f;

    static final class a<T, U> extends AtomicReference<org.reactivestreams.w> implements io.reactivex.q<U>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f300576i = -4606175640614850599L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f300577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b<T, U> f300578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f300579c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f300580d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f300581e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile ej.o<U> f300582f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f300583g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f300584h;

        a(b<T, U> bVar, long j10) {
            this.f300577a = j10;
            this.f300578b = bVar;
            int i10 = bVar.f300591e;
            this.f300580d = i10;
            this.f300579c = i10 >> 2;
        }

        void a(long j10) {
            if (this.f300584h != 1) {
                long j11 = this.f300583g + j10;
                if (j11 >= this.f300579c) {
                    this.f300583g = 0L;
                    get().request(j11);
                    return;
                }
                this.f300583g = j11;
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.subscriptions.j.b(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return get() == io.reactivex.internal.subscriptions.j.CANCELLED;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.n(this, wVar)) {
                if (wVar instanceof ej.l) {
                    ej.l lVar = (ej.l) wVar;
                    int iP = lVar.p(7);
                    if (iP == 1) {
                        this.f300584h = iP;
                        this.f300582f = lVar;
                        this.f300581e = true;
                        this.f300578b.e();
                        return;
                    }
                    if (iP == 2) {
                        this.f300584h = iP;
                        this.f300582f = lVar;
                    }
                }
                wVar.request(this.f300580d);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f300581e = true;
            this.f300578b.e();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            lazySet(io.reactivex.internal.subscriptions.j.CANCELLED);
            this.f300578b.i(this, th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(U u10) {
            if (this.f300584h != 2) {
                this.f300578b.k(u10, this);
            } else {
                this.f300578b.e();
            }
        }
    }

    static final class b<T, U> extends AtomicInteger implements io.reactivex.q<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final long f300585v = -2117620485640801370L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super U> f300587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends org.reactivestreams.u<? extends U>> f300588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f300589c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f300590d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f300591e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile ej.n<U> f300592f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f300593g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final io.reactivex.internal.util.c f300594h = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f300595i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final AtomicReference<a<?, ?>[]> f300596j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final AtomicLong f300597k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        org.reactivestreams.w f300598l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        long f300599m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f300600n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f300601o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f300602s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final int f300603t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        static final a<?, ?>[] f300586w = new a[0];
        static final a<?, ?>[] X = new a[0];

        b(org.reactivestreams.v<? super U> vVar, dj.o<? super T, ? extends org.reactivestreams.u<? extends U>> oVar, boolean z10, int i10, int i11) {
            AtomicReference<a<?, ?>[]> atomicReference = new AtomicReference<>();
            this.f300596j = atomicReference;
            this.f300597k = new AtomicLong();
            this.f300587a = vVar;
            this.f300588b = oVar;
            this.f300589c = z10;
            this.f300590d = i10;
            this.f300591e = i11;
            this.f300603t = Math.max(1, i10 >> 1);
            atomicReference.lazySet(f300586w);
        }

        boolean a(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.f300596j.get();
                if (aVarArr == X) {
                    aVar.dispose();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!androidx.compose.animation.core.z1.a(this.f300596j, aVarArr, aVarArr2));
            return true;
        }

        boolean b() {
            if (this.f300595i) {
                c();
                return true;
            }
            if (this.f300589c || this.f300594h.get() == null) {
                return false;
            }
            c();
            Throwable thC = this.f300594h.c();
            if (thC != io.reactivex.internal.util.k.f303486a) {
                this.f300587a.onError(thC);
            }
            return true;
        }

        void c() {
            ej.n<U> nVar = this.f300592f;
            if (nVar != null) {
                nVar.clear();
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            ej.n<U> nVar;
            if (this.f300595i) {
                return;
            }
            this.f300595i = true;
            this.f300598l.cancel();
            d();
            if (getAndIncrement() != 0 || (nVar = this.f300592f) == null) {
                return;
            }
            nVar.clear();
        }

        void d() {
            a<?, ?>[] andSet;
            a<?, ?>[] aVarArr = this.f300596j.get();
            a<?, ?>[] aVarArr2 = X;
            if (aVarArr == aVarArr2 || (andSet = this.f300596j.getAndSet(aVarArr2)) == aVarArr2) {
                return;
            }
            for (a<?, ?> aVar : andSet) {
                aVar.dispose();
            }
            Throwable thC = this.f300594h.c();
            if (thC == null || thC == io.reactivex.internal.util.k.f303486a) {
                return;
            }
            io.reactivex.plugins.a.Y(thC);
        }

        void e() {
            if (getAndIncrement() == 0) {
                f();
            }
        }

        /* JADX WARN: Code duplicated, block: B:100:0x015e  */
        /* JADX WARN: Code duplicated, block: B:114:0x0183  */
        /* JADX WARN: Code duplicated, block: B:118:0x0190  */
        /* JADX WARN: Code duplicated, block: B:120:0x0194  */
        /* JADX WARN: Code duplicated, block: B:136:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:141:0x01c7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:143:0x01c7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:145:0x01c7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:155:0x019c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:156:0x018d A[EDGE_INSN: B:156:0x018d->B:117:0x018d BREAK  A[LOOP:3: B:65:0x00e3->B:121:0x0195], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:159:0x0195 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:162:0x00fc A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:163:0x0145 A[EDGE_INSN: B:163:0x0145->B:94:0x0145 BREAK  A[LOOP:5: B:77:0x0104->B:85:0x011a], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:66:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:69:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:73:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:76:0x0102  */
        /* JADX WARN: Code duplicated, block: B:82:0x010f  */
        /* JADX WARN: Code duplicated, block: B:85:0x011a A[LOOP:5: B:77:0x0104->B:85:0x011a, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:96:0x0149 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:97:0x014b  */
        /* JADX WARN: Code duplicated, block: B:98:0x0154  */
        /* JADX WARN: Multi-variable type inference failed */
        void f() {
            boolean z10;
            long j10;
            long j11;
            boolean z11;
            long j12;
            int i10;
            boolean z12;
            int i11;
            a<T, U> aVar;
            U uPoll;
            ej.o<U> oVar;
            boolean z13;
            Object obj;
            org.reactivestreams.v<? super U> vVar = this.f300587a;
            int iAddAndGet = 1;
            while (!b()) {
                ej.n<U> nVar = this.f300592f;
                long jAddAndGet = this.f300597k.get();
                boolean z14 = jAddAndGet == Long.MAX_VALUE;
                long j13 = 0;
                if (nVar != null) {
                    j10 = 0;
                    do {
                        long j14 = 0;
                        obj = null;
                        while (true) {
                            if (jAddAndGet == 0) {
                                z10 = true;
                                break;
                            }
                            z10 = true;
                            U uPoll2 = nVar.poll();
                            if (b()) {
                                return;
                            }
                            if (uPoll2 == null) {
                                obj = uPoll2;
                                break;
                            }
                            vVar.onNext(uPoll2);
                            j10++;
                            j14++;
                            jAddAndGet--;
                            obj = uPoll2;
                        }
                        if (j14 != 0) {
                            jAddAndGet = z14 ? Long.MAX_VALUE : this.f300597k.addAndGet(-j14);
                        }
                        if (jAddAndGet == 0) {
                            break;
                        }
                    } while (obj != null);
                } else {
                    z10 = true;
                    j10 = 0;
                }
                boolean z15 = this.f300593g;
                ej.n<U> nVar2 = this.f300592f;
                a<?, ?>[] aVarArr = this.f300596j.get();
                int length = aVarArr.length;
                if (z15 && ((nVar2 == null || nVar2.isEmpty()) && length == 0)) {
                    Throwable thC = this.f300594h.c();
                    if (thC != io.reactivex.internal.util.k.f303486a) {
                        if (thC == null) {
                            vVar.onComplete();
                            return;
                        } else {
                            vVar.onError(thC);
                            return;
                        }
                    }
                    return;
                }
                if (length != 0) {
                    long j15 = this.f300600n;
                    int i12 = this.f300601o;
                    if (length > i12) {
                        j12 = 1;
                        if (aVarArr[i12].f300577a != j15) {
                        }
                        i10 = i12;
                        z12 = false;
                        i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                aVarArr = aVarArr;
                                j11 = j13;
                                break;
                            }
                            if (b()) {
                                return;
                            }
                            aVar = aVarArr[i10];
                            uPoll = null;
                            while (!b()) {
                                oVar = aVar.f300582f;
                                if (oVar == null) {
                                    aVarArr = aVarArr;
                                    j11 = j13;
                                } else {
                                    j11 = j13;
                                    while (jAddAndGet != j11) {
                                        try {
                                            uPoll = oVar.poll();
                                            if (uPoll == null) {
                                                break;
                                            }
                                            vVar.onNext(uPoll);
                                            if (b()) {
                                                return;
                                            }
                                            jAddAndGet -= j12;
                                            j13 += j12;
                                        } catch (Throwable th2) {
                                            io.reactivex.exceptions.b.b(th2);
                                            aVar.dispose();
                                            this.f300594h.a(th2);
                                            if (!this.f300589c) {
                                                this.f300598l.cancel();
                                            }
                                            if (b()) {
                                                return;
                                            }
                                            j(aVar);
                                            i11++;
                                            aVarArr = aVarArr;
                                            z12 = z10;
                                        }
                                    }
                                    if (j13 != j11) {
                                        if (z14) {
                                            jAddAndGet = Long.MAX_VALUE;
                                        } else {
                                            jAddAndGet = this.f300597k.addAndGet(-j13);
                                        }
                                        aVar.a(j13);
                                    } else {
                                        aVarArr = aVarArr;
                                    }
                                    if (jAddAndGet == j11 && uPoll != null) {
                                        aVarArr = aVarArr;
                                        j13 = j11;
                                    }
                                }
                                z13 = aVar.f300581e;
                                ej.o<U> oVar2 = aVar.f300582f;
                                if (z13 && (oVar2 == null || oVar2.isEmpty())) {
                                    j(aVar);
                                    if (b()) {
                                        return;
                                    }
                                    j10 += j12;
                                    z12 = z10;
                                }
                                if (jAddAndGet == j11) {
                                    break;
                                }
                                i10++;
                                if (i10 == length) {
                                    i10 = 0;
                                }
                                i11++;
                                aVarArr = aVarArr;
                                j13 = j11;
                            }
                            return;
                        }
                        z11 = z12;
                        this.f300601o = i10;
                        this.f300600n = aVarArr[i10].f300577a;
                    } else {
                        j12 = 1;
                    }
                    if (length <= i12) {
                        i12 = 0;
                    }
                    for (int i13 = 0; i13 < length && aVarArr[i12].f300577a != j15; i13++) {
                        i12++;
                        if (i12 == length) {
                            i12 = 0;
                        }
                    }
                    this.f300601o = i12;
                    this.f300600n = aVarArr[i12].f300577a;
                    i10 = i12;
                    z12 = false;
                    i11 = 0;
                    while (true) {
                        if (i11 < length) {
                            aVarArr = aVarArr;
                            j11 = j13;
                            break;
                        }
                        if (b()) {
                            return;
                        }
                        aVar = aVarArr[i10];
                        uPoll = null;
                        while (!b()) {
                            oVar = aVar.f300582f;
                            if (oVar == null) {
                                aVarArr = aVarArr;
                                j11 = j13;
                            } else {
                                j11 = j13;
                                while (jAddAndGet != j11) {
                                    uPoll = oVar.poll();
                                    if (uPoll == null) {
                                        break;
                                        break;
                                    }
                                    vVar.onNext(uPoll);
                                    if (b()) {
                                        return;
                                    }
                                    jAddAndGet -= j12;
                                    j13 += j12;
                                }
                                if (j13 != j11) {
                                    if (z14) {
                                        jAddAndGet = this.f300597k.addAndGet(-j13);
                                    } else {
                                        jAddAndGet = Long.MAX_VALUE;
                                    }
                                    aVar.a(j13);
                                } else {
                                    aVarArr = aVarArr;
                                }
                                if (jAddAndGet == j11) {
                                }
                            }
                            z13 = aVar.f300581e;
                            ej.o<U> oVar3 = aVar.f300582f;
                            if (z13) {
                                j(aVar);
                                if (b()) {
                                    return;
                                }
                                j10 += j12;
                                z12 = z10;
                            }
                            if (jAddAndGet == j11) {
                                break;
                                break;
                            }
                            i10++;
                            if (i10 == length) {
                                i10 = 0;
                            }
                            i11++;
                            aVarArr = aVarArr;
                            j13 = j11;
                        }
                        return;
                    }
                    z11 = z12;
                    this.f300601o = i10;
                    this.f300600n = aVarArr[i10].f300577a;
                } else {
                    j11 = 0;
                    z11 = false;
                }
                long j16 = j10;
                if (j16 != j11 && !this.f300595i) {
                    this.f300598l.request(j16);
                }
                if (!z11 && (iAddAndGet = addAndGet(-iAddAndGet)) == 0) {
                    return;
                }
            }
        }

        ej.o<U> g(a<T, U> aVar) {
            ej.o<U> bVar = aVar.f300582f;
            if (bVar == null) {
                bVar = new io.reactivex.internal.queue.b<>(this.f300591e);
                aVar.f300582f = bVar;
            }
            return bVar;
        }

        ej.o<U> h() {
            ej.n<U> cVar = this.f300592f;
            if (cVar == null) {
                cVar = this.f300590d == Integer.MAX_VALUE ? new io.reactivex.internal.queue.c<>(this.f300591e) : new io.reactivex.internal.queue.b<>(this.f300590d);
                this.f300592f = cVar;
            }
            return cVar;
        }

        void i(a<T, U> aVar, Throwable th2) {
            if (!this.f300594h.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            aVar.f300581e = true;
            if (!this.f300589c) {
                this.f300598l.cancel();
                for (a<?, ?> aVar2 : this.f300596j.getAndSet(X)) {
                    aVar2.dispose();
                }
            }
            e();
        }

        /* JADX WARN: Multi-variable type inference failed */
        void j(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a<?, ?>[] aVarArr2;
            do {
                aVarArr = this.f300596j.get();
                int length = aVarArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (aVarArr[i10] == aVar) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr2 = f300586w;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                    System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!androidx.compose.animation.core.z1.a(this.f300596j, aVarArr, aVarArr2));
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
        
            if (decrementAndGet() == 0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x008c, code lost:
        
            if (getAndIncrement() != 0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
        
            f();
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void k(U r8, io.reactivex.internal.operators.flowable.z0.a<T, U> r9) {
            /*
                r7 = this;
                r6 = 4
                int r0 = r7.get()
                r6 = 4
                java.lang.String r1 = "Inner queue full?!"
                if (r0 != 0) goto L68
                r0 = 0
                r2 = 1
                boolean r0 = r7.compareAndSet(r0, r2)
                r6 = 7
                if (r0 == 0) goto L68
                java.util.concurrent.atomic.AtomicLong r0 = r7.f300597k
                long r2 = r0.get()
                ej.o<U> r0 = r9.f300582f
                r6 = 1
                r4 = 0
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r4 == 0) goto L49
                r6 = 5
                if (r0 == 0) goto L2b
                boolean r4 = r0.isEmpty()
                if (r4 == 0) goto L49
            L2b:
                org.reactivestreams.v<? super U> r0 = r7.f300587a
                r0.onNext(r8)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                r6 = 3
                if (r8 == 0) goto L40
                java.util.concurrent.atomic.AtomicLong r8 = r7.f300597k
                r6 = 4
                r8.decrementAndGet()
            L40:
                r0 = 1
                r0 = 1
                r9.a(r0)
                r6 = 3
                goto L60
            L49:
                r6 = 6
                if (r0 != 0) goto L50
                ej.o r0 = r7.g(r9)
            L50:
                boolean r8 = r0.offer(r8)
                r6 = 7
                if (r8 != 0) goto L60
                io.reactivex.exceptions.c r8 = new io.reactivex.exceptions.c
                r8.<init>(r1)
                r7.onError(r8)
                return
            L60:
                r6 = 2
                int r8 = r7.decrementAndGet()
                if (r8 != 0) goto L90
                goto L8e
            L68:
                ej.o<U> r0 = r9.f300582f
                if (r0 != 0) goto L77
                r6 = 0
                io.reactivex.internal.queue.b r0 = new io.reactivex.internal.queue.b
                r6 = 1
                int r2 = r7.f300591e
                r0.<init>(r2)
                r9.f300582f = r0
            L77:
                boolean r8 = r0.offer(r8)
                r6 = 1
                if (r8 != 0) goto L87
                io.reactivex.exceptions.c r8 = new io.reactivex.exceptions.c
                r8.<init>(r1)
                r7.onError(r8)
                return
            L87:
                r6 = 7
                int r8 = r7.getAndIncrement()
                if (r8 == 0) goto L90
            L8e:
                r6 = 3
                return
            L90:
                r7.f()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.z0.b.k(java.lang.Object, io.reactivex.internal.operators.flowable.z0$a):void");
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300598l, wVar)) {
                this.f300598l = wVar;
                this.f300587a.l(this);
                if (this.f300595i) {
                    return;
                }
                int i10 = this.f300590d;
                if (i10 == Integer.MAX_VALUE) {
                    wVar.request(Long.MAX_VALUE);
                } else {
                    wVar.request(i10);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
        
            if (decrementAndGet() == 0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
        
            if (getAndIncrement() != 0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
        
            f();
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void m(U r10) {
            /*
                r9 = this;
                int r0 = r9.get()
                r8 = 1
                java.lang.String r1 = "Scalar queue full?!"
                if (r0 != 0) goto L80
                r0 = 1
                r0 = 0
                r8 = 7
                r2 = 1
                boolean r3 = r9.compareAndSet(r0, r2)
                r8 = 3
                if (r3 == 0) goto L80
                java.util.concurrent.atomic.AtomicLong r3 = r9.f300597k
                long r3 = r3.get()
                r8 = 3
                ej.n<U> r5 = r9.f300592f
                r6 = 0
                int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r6 == 0) goto L63
                r8 = 5
                if (r5 == 0) goto L2c
                boolean r6 = r5.isEmpty()
                if (r6 == 0) goto L63
            L2c:
                org.reactivestreams.v<? super U> r1 = r9.f300587a
                r8 = 2
                r1.onNext(r10)
                r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r8 = 7
                int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r10 == 0) goto L42
                java.util.concurrent.atomic.AtomicLong r10 = r9.f300597k
                r8 = 0
                r10.decrementAndGet()
            L42:
                int r10 = r9.f300590d
                r8 = 3
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r10 == r1) goto L79
                boolean r10 = r9.f300595i
                r8 = 5
                if (r10 != 0) goto L79
                int r10 = r9.f300602s
                int r10 = r10 + r2
                r8 = 5
                r9.f300602s = r10
                int r1 = r9.f300603t
                if (r10 != r1) goto L79
                r9.f300602s = r0
                org.reactivestreams.w r10 = r9.f300598l
                r8 = 6
                long r0 = (long) r1
                r10.request(r0)
                goto L79
            L63:
                if (r5 != 0) goto L6a
                r8 = 3
                ej.o r5 = r9.h()
            L6a:
                boolean r10 = r5.offer(r10)
                if (r10 != 0) goto L79
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r1)
                r9.onError(r10)
                return
            L79:
                int r10 = r9.decrementAndGet()
                if (r10 != 0) goto L9d
                goto L9b
            L80:
                ej.o r0 = r9.h()
                boolean r10 = r0.offer(r10)
                if (r10 != 0) goto L94
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r1)
                r8 = 3
                r9.onError(r10)
                return
            L94:
                int r10 = r9.getAndIncrement()
                r8 = 6
                if (r10 == 0) goto L9d
            L9b:
                r8 = 6
                return
            L9d:
                r9.f()
                r8 = 0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.z0.b.m(java.lang.Object):void");
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f300593g) {
                return;
            }
            this.f300593g = true;
            e();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f300593g) {
                io.reactivex.plugins.a.Y(th2);
            } else if (!this.f300594h.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f300593g = true;
                e();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f300593g) {
                return;
            }
            try {
                org.reactivestreams.u uVar = (org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.f300588b.apply(t10), "The mapper returned a null Publisher");
                if (!(uVar instanceof Callable)) {
                    long j10 = this.f300599m;
                    this.f300599m = 1 + j10;
                    a aVar = new a(this, j10);
                    if (a(aVar)) {
                        uVar.e(aVar);
                        return;
                    }
                    return;
                }
                try {
                    Object objCall = ((Callable) uVar).call();
                    if (objCall != null) {
                        m(objCall);
                        return;
                    }
                    if (this.f300590d == Integer.MAX_VALUE || this.f300595i) {
                        return;
                    }
                    int i10 = this.f300602s + 1;
                    this.f300602s = i10;
                    int i11 = this.f300603t;
                    if (i10 == i11) {
                        this.f300602s = 0;
                        this.f300598l.request(i11);
                    }
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    this.f300594h.a(th2);
                    e();
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                this.f300598l.cancel();
                onError(th3);
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f300597k, j10);
                e();
            }
        }
    }

    public z0(io.reactivex.l<T> lVar, dj.o<? super T, ? extends org.reactivestreams.u<? extends U>> oVar, boolean z10, int i10, int i11) {
        super(lVar);
        this.f300572c = oVar;
        this.f300573d = z10;
        this.f300574e = i10;
        this.f300575f = i11;
    }

    public static <T, U> io.reactivex.q<T> M8(org.reactivestreams.v<? super U> vVar, dj.o<? super T, ? extends org.reactivestreams.u<? extends U>> oVar, boolean z10, int i10, int i11) {
        return new b(vVar, oVar, z10, i10, i11);
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super U> vVar) {
        if (j3.b(this.f299043b, vVar, this.f300572c)) {
            return;
        }
        this.f299043b.j6(M8(vVar, this.f300572c, this.f300573d, this.f300574e, this.f300575f));
    }
}
