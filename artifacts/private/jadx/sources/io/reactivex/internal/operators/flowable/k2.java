package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class k2<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f299638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f299639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f299640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final dj.a f299641f;

    static final class a<T> extends io.reactivex.internal.subscriptions.c<T> implements io.reactivex.q<T> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final long f299642l = -2514538129242366402L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ej.n<T> f299644c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f299645d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final dj.a f299646e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        org.reactivestreams.w f299647f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f299648g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f299649h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Throwable f299650i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final AtomicLong f299651j = new AtomicLong();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f299652k;

        a(org.reactivestreams.v<? super T> vVar, int i10, boolean z10, boolean z11, dj.a aVar) {
            this.f299643b = vVar;
            this.f299646e = aVar;
            this.f299645d = z11;
            this.f299644c = z10 ? new io.reactivex.internal.queue.c<>(i10) : new io.reactivex.internal.queue.b<>(i10);
        }

        void c() {
            if (getAndIncrement() == 0) {
                ej.n<T> nVar = this.f299644c;
                org.reactivestreams.v<? super T> vVar = this.f299643b;
                int iAddAndGet = 1;
                while (!f(this.f299649h, nVar.isEmpty(), vVar)) {
                    long j10 = this.f299651j.get();
                    long j11 = 0;
                    while (j11 != j10) {
                        boolean z10 = this.f299649h;
                        T tPoll = nVar.poll();
                        boolean z11 = tPoll == null;
                        if (f(z10, z11, vVar)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        vVar.onNext(tPoll);
                        j11++;
                    }
                    if (j11 == j10 && f(this.f299649h, nVar.isEmpty(), vVar)) {
                        return;
                    }
                    if (j11 != 0 && j10 != Long.MAX_VALUE) {
                        this.f299651j.addAndGet(-j11);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (this.f299648g) {
                return;
            }
            this.f299648g = true;
            this.f299647f.cancel();
            if (getAndIncrement() == 0) {
                this.f299644c.clear();
            }
        }

        @Override // ej.o
        public void clear() {
            this.f299644c.clear();
        }

        boolean f(boolean z10, boolean z11, org.reactivestreams.v<? super T> vVar) {
            if (this.f299648g) {
                this.f299644c.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.f299645d) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = this.f299650i;
                if (th2 != null) {
                    vVar.onError(th2);
                } else {
                    vVar.onComplete();
                }
                return true;
            }
            Throwable th3 = this.f299650i;
            if (th3 != null) {
                this.f299644c.clear();
                vVar.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            vVar.onComplete();
            return true;
        }

        @Override // ej.o
        public boolean isEmpty() {
            return this.f299644c.isEmpty();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f299647f, wVar)) {
                this.f299647f = wVar;
                this.f299643b.l(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299649h = true;
            if (this.f299652k) {
                this.f299643b.onComplete();
            } else {
                c();
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299650i = th2;
            this.f299649h = true;
            if (this.f299652k) {
                this.f299643b.onError(th2);
            } else {
                c();
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f299644c.offer(t10)) {
                if (this.f299652k) {
                    this.f299643b.onNext(null);
                    return;
                } else {
                    c();
                    return;
                }
            }
            this.f299647f.cancel();
            io.reactivex.exceptions.c cVar = new io.reactivex.exceptions.c("Buffer is full");
            try {
                this.f299646e.run();
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                cVar.initCause(th2);
            }
            onError(cVar);
        }

        @Override // ej.k
        public int p(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f299652k = true;
            return 2;
        }

        @Override // ej.o
        @cj.g
        public T poll() throws Exception {
            return this.f299644c.poll();
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (this.f299652k || !io.reactivex.internal.subscriptions.j.p(j10)) {
                return;
            }
            io.reactivex.internal.util.d.a(this.f299651j, j10);
            c();
        }
    }

    public k2(io.reactivex.l<T> lVar, int i10, boolean z10, boolean z11, dj.a aVar) {
        super(lVar);
        this.f299638c = i10;
        this.f299639d = z10;
        this.f299640e = z11;
        this.f299641f = aVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar, this.f299638c, this.f299639d, this.f299640e, this.f299641f));
    }
}
