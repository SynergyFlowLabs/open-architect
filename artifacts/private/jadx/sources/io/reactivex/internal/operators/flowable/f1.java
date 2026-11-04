package io.reactivex.internal.operators.flowable;

import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class f1<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends Iterable<? extends R>> f299344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f299345d;

    static final class a<T, R> extends io.reactivex.internal.subscriptions.c<R> implements io.reactivex.q<T> {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final long f299346o = -3096000382929934955L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.v<? super R> f299347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.o<? super T, ? extends Iterable<? extends R>> f299348c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f299349d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f299350e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        org.reactivestreams.w f299352g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ej.o<T> f299353h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f299354i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f299355j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Iterator<? extends R> f299357l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f299358m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f299359n;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final AtomicReference<Throwable> f299356k = new AtomicReference<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicLong f299351f = new AtomicLong();

        a(org.reactivestreams.v<? super R> vVar, dj.o<? super T, ? extends Iterable<? extends R>> oVar, int i10) {
            this.f299347b = vVar;
            this.f299348c = oVar;
            this.f299349d = i10;
            this.f299350e = i10 - (i10 >> 2);
        }

        /* JADX WARN: Code duplicated, block: B:70:0x012d A[PHI: r6
          0x012d: PHI (r6v4 java.util.Iterator<? extends R>) = (r6v3 java.util.Iterator<? extends R>), (r6v6 java.util.Iterator<? extends R>) binds: [B:31:0x0086, B:68:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:89:0x0134 A[SYNTHETIC] */
        void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.v<?> vVar = this.f299347b;
            ej.o<T> oVar = this.f299353h;
            boolean z10 = true;
            boolean z11 = this.f299359n != 1;
            Iterator<? extends R> it = this.f299357l;
            int iAddAndGet = 1;
            while (true) {
                if (it == null) {
                    boolean z12 = this.f299354i;
                    try {
                        T tPoll = oVar.poll();
                        if (f(z12, tPoll == null ? z10 : false, vVar, oVar)) {
                            return;
                        }
                        if (tPoll != null) {
                            try {
                                it = this.f299348c.apply(tPoll).iterator();
                                if (it.hasNext()) {
                                    this.f299357l = it;
                                } else {
                                    g(z11);
                                    it = null;
                                }
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.b.b(th2);
                                this.f299352g.cancel();
                                io.reactivex.internal.util.k.a(this.f299356k, th2);
                                vVar.onError(io.reactivex.internal.util.k.c(this.f299356k));
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.b.b(th3);
                        this.f299352g.cancel();
                        io.reactivex.internal.util.k.a(this.f299356k, th3);
                        Throwable thC = io.reactivex.internal.util.k.c(this.f299356k);
                        this.f299357l = null;
                        oVar.clear();
                        vVar.onError(thC);
                        return;
                    }
                }
                if (it != null) {
                    long j10 = this.f299351f.get();
                    long j11 = 0;
                    while (j11 != j10) {
                        if (f(this.f299354i, false, vVar, oVar)) {
                            return;
                        }
                        try {
                            vVar.onNext((Object) io.reactivex.internal.functions.b.g(it.next(), "The iterator returned a null value"));
                            if (f(this.f299354i, false, vVar, oVar)) {
                                return;
                            }
                            j11++;
                            try {
                                if (!it.hasNext()) {
                                    g(z11);
                                    this.f299357l = null;
                                    it = null;
                                    break;
                                }
                            } catch (Throwable th4) {
                                io.reactivex.exceptions.b.b(th4);
                                this.f299357l = null;
                                this.f299352g.cancel();
                                io.reactivex.internal.util.k.a(this.f299356k, th4);
                                vVar.onError(io.reactivex.internal.util.k.c(this.f299356k));
                                return;
                            }
                        } catch (Throwable th5) {
                            io.reactivex.exceptions.b.b(th5);
                            this.f299357l = null;
                            this.f299352g.cancel();
                            io.reactivex.internal.util.k.a(this.f299356k, th5);
                            vVar.onError(io.reactivex.internal.util.k.c(this.f299356k));
                            return;
                        }
                    }
                    if (j11 == j10) {
                        if (f(this.f299354i, oVar.isEmpty() && it == null, vVar, oVar)) {
                            return;
                        }
                    }
                    if (j11 != 0 && j10 != Long.MAX_VALUE) {
                        this.f299351f.addAndGet(-j11);
                    }
                    if (it != null) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                z10 = true;
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (this.f299355j) {
                return;
            }
            this.f299355j = true;
            this.f299352g.cancel();
            if (getAndIncrement() == 0) {
                this.f299353h.clear();
            }
        }

        @Override // ej.o
        public void clear() {
            this.f299357l = null;
            this.f299353h.clear();
        }

        boolean f(boolean z10, boolean z11, org.reactivestreams.v<?> vVar, ej.o<?> oVar) {
            if (this.f299355j) {
                this.f299357l = null;
                oVar.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.f299356k.get() == null) {
                if (!z11) {
                    return false;
                }
                vVar.onComplete();
                return true;
            }
            Throwable thC = io.reactivex.internal.util.k.c(this.f299356k);
            this.f299357l = null;
            oVar.clear();
            vVar.onError(thC);
            return true;
        }

        void g(boolean z10) {
            if (z10) {
                int i10 = this.f299358m + 1;
                if (i10 != this.f299350e) {
                    this.f299358m = i10;
                } else {
                    this.f299358m = 0;
                    this.f299352g.request(i10);
                }
            }
        }

        @Override // ej.o
        public boolean isEmpty() {
            return this.f299357l == null && this.f299353h.isEmpty();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299352g, wVar)) {
                this.f299352g = wVar;
                if (wVar instanceof ej.l) {
                    ej.l lVar = (ej.l) wVar;
                    int iP = lVar.p(3);
                    int i10 = 3 >> 1;
                    if (iP == 1) {
                        this.f299359n = iP;
                        this.f299353h = lVar;
                        this.f299354i = true;
                        this.f299347b.l(this);
                        return;
                    }
                    if (iP == 2) {
                        this.f299359n = iP;
                        this.f299353h = lVar;
                        this.f299347b.l(this);
                        wVar.request(this.f299349d);
                        return;
                    }
                }
                this.f299353h = new io.reactivex.internal.queue.b(this.f299349d);
                this.f299347b.l(this);
                wVar.request(this.f299349d);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299354i) {
                return;
            }
            this.f299354i = true;
            c();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299354i || !io.reactivex.internal.util.k.a(this.f299356k, th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f299354i = true;
                c();
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f299354i) {
                return;
            }
            if (this.f299359n != 0 || this.f299353h.offer(t10)) {
                c();
            } else {
                onError(new io.reactivex.exceptions.c("Queue is full?!"));
            }
        }

        @Override // ej.k
        public int p(int i10) {
            return ((i10 & 1) == 0 || this.f299359n != 1) ? 0 : 1;
        }

        @Override // ej.o
        @cj.g
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f299357l;
            while (it == null) {
                T tPoll = this.f299353h.poll();
                if (tPoll != null) {
                    it = this.f299348c.apply(tPoll).iterator();
                    if (it.hasNext()) {
                        this.f299357l = it;
                        break;
                    }
                    it = null;
                } else {
                    return null;
                }
            }
            R r10 = (R) io.reactivex.internal.functions.b.g(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f299357l = null;
            }
            return r10;
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f299351f, j10);
                c();
            }
        }
    }

    public f1(io.reactivex.l<T> lVar, dj.o<? super T, ? extends Iterable<? extends R>> oVar, int i10) {
        super(lVar);
        this.f299344c = oVar;
        this.f299345d = i10;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super R> vVar) {
        io.reactivex.l<T> lVar = this.f299043b;
        if (!(lVar instanceof Callable)) {
            lVar.j6(new a(vVar, this.f299344c, this.f299345d));
            return;
        }
        try {
            Object objCall = ((Callable) lVar).call();
            if (objCall == null) {
                io.reactivex.internal.subscriptions.g.b(vVar);
                return;
            }
            try {
                j1.M8(vVar, this.f299344c.apply(objCall).iterator());
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
