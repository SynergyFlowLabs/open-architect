package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class x<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> f300479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f300480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f300481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final io.reactivex.internal.util.j f300482f;

    static final class a<T, R> extends AtomicInteger implements io.reactivex.q<T>, org.reactivestreams.w, io.reactivex.internal.subscribers.l<R> {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final long f300483m = -4255299542215038287L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super R> f300484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> f300485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f300486c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f300487d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.internal.util.j f300488e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.internal.util.c f300489f = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicLong f300490g = new AtomicLong();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final io.reactivex.internal.queue.c<io.reactivex.internal.subscribers.k<R>> f300491h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        org.reactivestreams.w f300492i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f300493j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f300494k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        volatile io.reactivex.internal.subscribers.k<R> f300495l;

        a(org.reactivestreams.v<? super R> vVar, dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar, int i10, int i11, io.reactivex.internal.util.j jVar) {
            this.f300484a = vVar;
            this.f300485b = oVar;
            this.f300486c = i10;
            this.f300487d = i11;
            this.f300488e = jVar;
            this.f300491h = new io.reactivex.internal.queue.c<>(Math.min(i11, i10));
        }

        @Override // io.reactivex.internal.subscribers.l
        public void a(io.reactivex.internal.subscribers.k<R> kVar) {
            kVar.d();
            c();
        }

        @Override // io.reactivex.internal.subscribers.l
        public void b(io.reactivex.internal.subscribers.k<R> kVar, Throwable th2) {
            if (!this.f300489f.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            kVar.d();
            if (this.f300488e != io.reactivex.internal.util.j.END) {
                this.f300492i.cancel();
            }
            c();
        }

        @Override // io.reactivex.internal.subscribers.l
        public void c() {
            io.reactivex.internal.subscribers.k<R> kVarPoll;
            long j10;
            long j11;
            boolean z10;
            ej.o<R> oVarB;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.subscribers.k<R> kVar = this.f300495l;
            org.reactivestreams.v<? super R> vVar = this.f300484a;
            io.reactivex.internal.util.j jVar = this.f300488e;
            int iAddAndGet = 1;
            while (true) {
                long j12 = this.f300490g.get();
                if (kVar != null) {
                    kVarPoll = kVar;
                } else {
                    if (jVar != io.reactivex.internal.util.j.END && this.f300489f.get() != null) {
                        e();
                        vVar.onError(this.f300489f.c());
                        return;
                    }
                    boolean z11 = this.f300494k;
                    kVarPoll = this.f300491h.poll();
                    if (z11 && kVarPoll == null) {
                        Throwable thC = this.f300489f.c();
                        if (thC != null) {
                            vVar.onError(thC);
                            return;
                        } else {
                            vVar.onComplete();
                            return;
                        }
                    }
                    if (kVarPoll != null) {
                        this.f300495l = kVarPoll;
                    }
                }
                if (kVarPoll == null || (oVarB = kVarPoll.b()) == null) {
                    j10 = 0;
                    j11 = 0;
                    z10 = false;
                } else {
                    j11 = 0;
                    while (true) {
                        if (j11 == j12) {
                            j10 = 0;
                        } else {
                            if (this.f300493j) {
                                e();
                                return;
                            }
                            if (jVar == io.reactivex.internal.util.j.IMMEDIATE && this.f300489f.get() != null) {
                                this.f300495l = null;
                                kVarPoll.cancel();
                                e();
                                vVar.onError(this.f300489f.c());
                                return;
                            }
                            boolean zA = kVarPoll.a();
                            j10 = 0;
                            try {
                                R rPoll = oVarB.poll();
                                boolean z12 = rPoll == null;
                                if (zA && z12) {
                                    this.f300495l = null;
                                    this.f300492i.request(1L);
                                    kVarPoll = null;
                                    z10 = true;
                                    break;
                                }
                                if (!z12) {
                                    vVar.onNext(rPoll);
                                    j11++;
                                    kVarPoll.c();
                                }
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.b.b(th2);
                                this.f300495l = null;
                                kVarPoll.cancel();
                                e();
                                vVar.onError(th2);
                                return;
                            }
                        }
                        z10 = false;
                        break;
                    }
                    if (j11 == j12) {
                        if (this.f300493j) {
                            e();
                            return;
                        }
                        if (jVar == io.reactivex.internal.util.j.IMMEDIATE && this.f300489f.get() != null) {
                            this.f300495l = null;
                            kVarPoll.cancel();
                            e();
                            vVar.onError(this.f300489f.c());
                            return;
                        }
                        boolean zA2 = kVarPoll.a();
                        boolean zIsEmpty = oVarB.isEmpty();
                        if (zA2 && zIsEmpty) {
                            this.f300495l = null;
                            this.f300492i.request(1L);
                            kVarPoll = null;
                            z10 = true;
                        }
                    }
                }
                if (j11 != j10 && j12 != Long.MAX_VALUE) {
                    this.f300490g.addAndGet(-j11);
                }
                if (!z10 && (iAddAndGet = addAndGet(-iAddAndGet)) == 0) {
                    return;
                } else {
                    kVar = kVarPoll;
                }
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (this.f300493j) {
                return;
            }
            this.f300493j = true;
            this.f300492i.cancel();
            f();
        }

        @Override // io.reactivex.internal.subscribers.l
        public void d(io.reactivex.internal.subscribers.k<R> kVar, R r10) {
            if (kVar.b().offer(r10)) {
                c();
            } else {
                kVar.cancel();
                b(kVar, new io.reactivex.exceptions.c());
            }
        }

        void e() {
            io.reactivex.internal.subscribers.k<R> kVar = this.f300495l;
            this.f300495l = null;
            if (kVar != null) {
                kVar.cancel();
            }
            while (true) {
                io.reactivex.internal.subscribers.k<R> kVarPoll = this.f300491h.poll();
                if (kVarPoll == null) {
                    return;
                } else {
                    kVarPoll.cancel();
                }
            }
        }

        void f() {
            if (getAndIncrement() == 0) {
                do {
                    e();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f300492i, wVar)) {
                this.f300492i = wVar;
                this.f300484a.l(this);
                int i10 = this.f300486c;
                wVar.request(i10 == Integer.MAX_VALUE ? Long.MAX_VALUE : i10);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f300494k = true;
            c();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (!this.f300489f.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f300494k = true;
                c();
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            try {
                org.reactivestreams.u uVar = (org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.f300485b.apply(t10), "The mapper returned a null Publisher");
                io.reactivex.internal.subscribers.k<R> kVar = new io.reactivex.internal.subscribers.k<>(this, this.f300487d);
                if (this.f300493j) {
                    return;
                }
                this.f300491h.offer(kVar);
                uVar.e(kVar);
                if (this.f300493j) {
                    kVar.cancel();
                    f();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f300492i.cancel();
                onError(th2);
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f300490g, j10);
                c();
            }
        }
    }

    public x(io.reactivex.l<T> lVar, dj.o<? super T, ? extends org.reactivestreams.u<? extends R>> oVar, int i10, int i11, io.reactivex.internal.util.j jVar) {
        super(lVar);
        this.f300479c = oVar;
        this.f300480d = i10;
        this.f300481e = i11;
        this.f300482f = jVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super R> vVar) {
        this.f299043b.j6(new a(vVar, this.f300479c, this.f300480d, this.f300481e, this.f300482f));
    }
}
