package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class j2<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.j0 f299579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f299580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f299581e;

    static abstract class a<T> extends io.reactivex.internal.subscriptions.c<T> implements io.reactivex.q<T>, Runnable {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final long f299582o = -8241002408341274697L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.j0.c f299583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f299584c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f299585d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f299586e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicLong f299587f = new AtomicLong();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        org.reactivestreams.w f299588g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ej.o<T> f299589h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f299590i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f299591j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Throwable f299592k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f299593l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        long f299594m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f299595n;

        a(io.reactivex.j0.c cVar, boolean z10, int i10) {
            this.f299583b = cVar;
            this.f299584c = z10;
            this.f299585d = i10;
            this.f299586e = i10 - (i10 >> 2);
        }

        @Override // org.reactivestreams.w
        public final void cancel() {
            if (this.f299590i) {
                return;
            }
            this.f299590i = true;
            this.f299588g.cancel();
            this.f299583b.dispose();
            if (getAndIncrement() == 0) {
                this.f299589h.clear();
            }
        }

        @Override // ej.o
        public final void clear() {
            this.f299589h.clear();
        }

        final boolean f(boolean z10, boolean z11, org.reactivestreams.v<?> vVar) {
            if (this.f299590i) {
                clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.f299584c) {
                if (!z11) {
                    return false;
                }
                this.f299590i = true;
                Throwable th2 = this.f299592k;
                if (th2 != null) {
                    vVar.onError(th2);
                } else {
                    vVar.onComplete();
                }
                this.f299583b.dispose();
                return true;
            }
            Throwable th3 = this.f299592k;
            if (th3 != null) {
                this.f299590i = true;
                clear();
                vVar.onError(th3);
                this.f299583b.dispose();
                return true;
            }
            if (!z11) {
                return false;
            }
            this.f299590i = true;
            vVar.onComplete();
            this.f299583b.dispose();
            return true;
        }

        abstract void g();

        abstract void h();

        abstract void i();

        @Override // ej.o
        public final boolean isEmpty() {
            return this.f299589h.isEmpty();
        }

        final void j() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.f299583b.b(this);
        }

        @Override // org.reactivestreams.v
        public final void onComplete() {
            if (this.f299591j) {
                return;
            }
            this.f299591j = true;
            j();
        }

        @Override // org.reactivestreams.v
        public final void onError(Throwable th2) {
            if (this.f299591j) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f299592k = th2;
            this.f299591j = true;
            j();
        }

        @Override // org.reactivestreams.v
        public final void onNext(T t10) {
            if (this.f299591j) {
                return;
            }
            if (this.f299593l == 2) {
                j();
                return;
            }
            if (!this.f299589h.offer(t10)) {
                this.f299588g.cancel();
                this.f299592k = new io.reactivex.exceptions.c("Queue is full?!");
                this.f299591j = true;
            }
            j();
        }

        @Override // ej.k
        public final int p(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f299595n = true;
            return 2;
        }

        @Override // org.reactivestreams.w
        public final void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f299587f, j10);
                j();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f299595n) {
                h();
            } else if (this.f299593l == 1) {
                i();
            } else {
                g();
            }
        }
    }

    static final class b<T> extends a<T> {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final long f299596v = 644624475404284533L;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final ej.a<? super T> f299597s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        long f299598t;

        b(ej.a<? super T> aVar, io.reactivex.j0.c cVar, boolean z10, int i10) {
            super(cVar, z10, i10);
            this.f299597s = aVar;
        }

        @Override // io.reactivex.internal.operators.flowable.j2.a
        void g() {
            ej.a<? super T> aVar = this.f299597s;
            ej.o<T> oVar = this.f299589h;
            long j10 = this.f299594m;
            long j11 = this.f299598t;
            int iAddAndGet = 1;
            loop0: while (true) {
                long j12 = this.f299587f.get();
                while (j10 != j12) {
                    boolean z10 = this.f299591j;
                    try {
                        T tPoll = oVar.poll();
                        boolean z11 = tPoll == null;
                        if (f(z10, z11, aVar)) {
                            break loop0;
                        }
                        if (z11) {
                            break;
                        }
                        if (aVar.L(tPoll)) {
                            j10++;
                        }
                        j11++;
                        if (j11 == this.f299586e) {
                            this.f299588g.request(j11);
                            j11 = 0;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.b.b(th2);
                        this.f299590i = true;
                        this.f299588g.cancel();
                        oVar.clear();
                        aVar.onError(th2);
                        this.f299583b.dispose();
                        return;
                    }
                }
                if (j10 == j12 && f(this.f299591j, oVar.isEmpty(), aVar)) {
                    break;
                }
                int i10 = get();
                if (iAddAndGet == i10) {
                    this.f299594m = j10;
                    this.f299598t = j11;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        break;
                    }
                } else {
                    iAddAndGet = i10;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.j2.a
        void h() {
            int iAddAndGet = 1;
            while (!this.f299590i) {
                boolean z10 = this.f299591j;
                this.f299597s.onNext(null);
                if (z10) {
                    this.f299590i = true;
                    Throwable th2 = this.f299592k;
                    if (th2 != null) {
                        this.f299597s.onError(th2);
                    } else {
                        this.f299597s.onComplete();
                    }
                    this.f299583b.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    break;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.j2.a
        void i() {
            ej.a<? super T> aVar = this.f299597s;
            ej.o<T> oVar = this.f299589h;
            long j10 = this.f299594m;
            int iAddAndGet = 1;
            while (true) {
                long j11 = this.f299587f.get();
                while (j10 != j11) {
                    try {
                        T tPoll = oVar.poll();
                        if (this.f299590i) {
                            return;
                        }
                        if (tPoll == null) {
                            this.f299590i = true;
                            aVar.onComplete();
                            this.f299583b.dispose();
                            return;
                        } else if (aVar.L(tPoll)) {
                            j10++;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.b.b(th2);
                        this.f299590i = true;
                        this.f299588g.cancel();
                        aVar.onError(th2);
                        this.f299583b.dispose();
                        return;
                    }
                }
                if (this.f299590i) {
                    return;
                }
                if (oVar.isEmpty()) {
                    this.f299590i = true;
                    aVar.onComplete();
                    this.f299583b.dispose();
                    return;
                } else {
                    int i10 = get();
                    if (iAddAndGet == i10) {
                        this.f299594m = j10;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i10;
                    }
                }
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299588g, wVar)) {
                this.f299588g = wVar;
                if (wVar instanceof ej.l) {
                    ej.l lVar = (ej.l) wVar;
                    int iP = lVar.p(7);
                    if (iP == 1) {
                        this.f299593l = 1;
                        this.f299589h = lVar;
                        this.f299591j = true;
                        this.f299597s.l(this);
                        return;
                    }
                    if (iP == 2) {
                        this.f299593l = 2;
                        this.f299589h = lVar;
                        this.f299597s.l(this);
                        wVar.request(this.f299585d);
                        return;
                    }
                }
                this.f299589h = new io.reactivex.internal.queue.b(this.f299585d);
                this.f299597s.l(this);
                wVar.request(this.f299585d);
            }
        }

        @Override // ej.o
        @cj.g
        public T poll() throws Exception {
            T tPoll = this.f299589h.poll();
            if (tPoll != null && this.f299593l != 1) {
                long j10 = this.f299598t + 1;
                if (j10 == this.f299586e) {
                    this.f299598t = 0L;
                    this.f299588g.request(j10);
                    return tPoll;
                }
                this.f299598t = j10;
            }
            return tPoll;
        }
    }

    static final class c<T> extends a<T> implements io.reactivex.q<T> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final long f299599t = -4547113800637756442L;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299600s;

        c(org.reactivestreams.v<? super T> vVar, io.reactivex.j0.c cVar, boolean z10, int i10) {
            super(cVar, z10, i10);
            this.f299600s = vVar;
        }

        @Override // io.reactivex.internal.operators.flowable.j2.a
        void g() {
            org.reactivestreams.v<? super T> vVar = this.f299600s;
            ej.o<T> oVar = this.f299589h;
            long j10 = this.f299594m;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.f299587f.get();
                while (j10 != jAddAndGet) {
                    boolean z10 = this.f299591j;
                    try {
                        T tPoll = oVar.poll();
                        boolean z11 = tPoll == null;
                        if (f(z10, z11, vVar)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        vVar.onNext(tPoll);
                        j10++;
                        if (j10 == this.f299586e) {
                            if (jAddAndGet != Long.MAX_VALUE) {
                                jAddAndGet = this.f299587f.addAndGet(-j10);
                            }
                            this.f299588g.request(j10);
                            j10 = 0;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.b.b(th2);
                        this.f299590i = true;
                        this.f299588g.cancel();
                        oVar.clear();
                        vVar.onError(th2);
                        this.f299583b.dispose();
                        return;
                    }
                }
                if (j10 == jAddAndGet && f(this.f299591j, oVar.isEmpty(), vVar)) {
                    return;
                }
                int i10 = get();
                if (iAddAndGet == i10) {
                    this.f299594m = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i10;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.j2.a
        void h() {
            int iAddAndGet = 1;
            while (!this.f299590i) {
                boolean z10 = this.f299591j;
                this.f299600s.onNext(null);
                if (z10) {
                    this.f299590i = true;
                    Throwable th2 = this.f299592k;
                    if (th2 != null) {
                        this.f299600s.onError(th2);
                    } else {
                        this.f299600s.onComplete();
                    }
                    this.f299583b.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    break;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.j2.a
        void i() {
            org.reactivestreams.v<? super T> vVar = this.f299600s;
            ej.o<T> oVar = this.f299589h;
            long j10 = this.f299594m;
            int iAddAndGet = 1;
            loop0: while (true) {
                long j11 = this.f299587f.get();
                while (j10 != j11) {
                    try {
                        T tPoll = oVar.poll();
                        if (this.f299590i) {
                            break loop0;
                        }
                        if (tPoll == null) {
                            this.f299590i = true;
                            vVar.onComplete();
                            this.f299583b.dispose();
                            return;
                        }
                        vVar.onNext(tPoll);
                        j10++;
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.b.b(th2);
                        this.f299590i = true;
                        this.f299588g.cancel();
                        vVar.onError(th2);
                        this.f299583b.dispose();
                        return;
                    }
                }
                if (this.f299590i) {
                    break;
                }
                if (oVar.isEmpty()) {
                    this.f299590i = true;
                    vVar.onComplete();
                    this.f299583b.dispose();
                    return;
                } else {
                    int i10 = get();
                    if (iAddAndGet == i10) {
                        this.f299594m = j10;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            break;
                        }
                    } else {
                        iAddAndGet = i10;
                    }
                }
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299588g, wVar)) {
                this.f299588g = wVar;
                if (wVar instanceof ej.l) {
                    ej.l lVar = (ej.l) wVar;
                    int iP = lVar.p(7);
                    if (iP == 1) {
                        this.f299593l = 1;
                        this.f299589h = lVar;
                        this.f299591j = true;
                        this.f299600s.l(this);
                        return;
                    }
                    if (iP == 2) {
                        this.f299593l = 2;
                        this.f299589h = lVar;
                        this.f299600s.l(this);
                        wVar.request(this.f299585d);
                        return;
                    }
                }
                this.f299589h = new io.reactivex.internal.queue.b(this.f299585d);
                this.f299600s.l(this);
                wVar.request(this.f299585d);
            }
        }

        @Override // ej.o
        @cj.g
        public T poll() throws Exception {
            T tPoll = this.f299589h.poll();
            if (tPoll != null && this.f299593l != 1) {
                long j10 = this.f299594m + 1;
                if (j10 == this.f299586e) {
                    this.f299594m = 0L;
                    this.f299588g.request(j10);
                    return tPoll;
                }
                this.f299594m = j10;
            }
            return tPoll;
        }
    }

    public j2(io.reactivex.l<T> lVar, io.reactivex.j0 j0Var, boolean z10, int i10) {
        super(lVar);
        this.f299579c = j0Var;
        this.f299580d = z10;
        this.f299581e = i10;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super T> vVar) {
        io.reactivex.j0.c cVarC = this.f299579c.c();
        if (vVar instanceof ej.a) {
            this.f299043b.j6(new b((ej.a) vVar, cVarC, this.f299580d, this.f299581e));
        } else {
            this.f299043b.j6(new c(vVar, cVarC, this.f299580d, this.f299581e));
        }
    }
}
