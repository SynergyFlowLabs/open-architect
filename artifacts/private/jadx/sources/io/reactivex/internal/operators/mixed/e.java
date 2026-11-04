package io.reactivex.internal.operators.mixed;

import io.reactivex.n0;
import io.reactivex.q0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes10.dex */
public final class e<T, R> extends io.reactivex.l<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.l<T> f301093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends q0<? extends R>> f301094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.internal.util.j f301095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f301096e;

    static final class a<T, R> extends AtomicInteger implements io.reactivex.q<T>, w {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final long f301097s = -9140123220065488293L;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final int f301098t = 0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        static final int f301099v = 1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        static final int f301100w = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final v<? super R> f301101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends q0<? extends R>> f301102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f301103c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicLong f301104d = new AtomicLong();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.internal.util.c f301105e = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final C2156a<R> f301106f = new C2156a<>(this);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final ej.n<T> f301107g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final io.reactivex.internal.util.j f301108h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        w f301109i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f301110j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f301111k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        long f301112l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f301113m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        R f301114n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        volatile int f301115o;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.e$a$a, reason: collision with other inner class name */
        static final class C2156a<R> extends AtomicReference<io.reactivex.disposables.c> implements n0<R> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f301116b = -3051469169682093892L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final a<?, R> f301117a;

            C2156a(a<?, R> aVar) {
                this.f301117a = aVar;
            }

            void a() {
                io.reactivex.internal.disposables.d.b(this);
            }

            @Override // io.reactivex.n0
            public void b(R r10) {
                this.f301117a.c(r10);
            }

            @Override // io.reactivex.n0
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.d(this, cVar);
            }

            @Override // io.reactivex.n0
            public void onError(Throwable th2) {
                this.f301117a.b(th2);
            }
        }

        a(v<? super R> vVar, dj.o<? super T, ? extends q0<? extends R>> oVar, int i10, io.reactivex.internal.util.j jVar) {
            this.f301101a = vVar;
            this.f301102b = oVar;
            this.f301103c = i10;
            this.f301108h = jVar;
            this.f301107g = new io.reactivex.internal.queue.b(i10);
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            v<? super R> vVar = this.f301101a;
            io.reactivex.internal.util.j jVar = this.f301108h;
            ej.n<T> nVar = this.f301107g;
            io.reactivex.internal.util.c cVar = this.f301105e;
            AtomicLong atomicLong = this.f301104d;
            int i10 = this.f301103c;
            int i11 = i10 - (i10 >> 1);
            int iAddAndGet = 1;
            while (true) {
                if (!this.f301111k) {
                    int i12 = this.f301115o;
                    if (cVar.get() != null && (jVar == io.reactivex.internal.util.j.IMMEDIATE || (jVar == io.reactivex.internal.util.j.BOUNDARY && i12 == 0))) {
                        break;
                    }
                    if (i12 == 0) {
                        boolean z10 = this.f301110j;
                        T tPoll = nVar.poll();
                        boolean z11 = tPoll == null;
                        if (z10 && z11) {
                            Throwable thC = cVar.c();
                            if (thC == null) {
                                vVar.onComplete();
                                return;
                            } else {
                                vVar.onError(thC);
                                return;
                            }
                        }
                        if (!z11) {
                            int i13 = this.f301113m + 1;
                            if (i13 == i11) {
                                this.f301113m = 0;
                                this.f301109i.request(i11);
                            } else {
                                this.f301113m = i13;
                            }
                            try {
                                q0 q0Var = (q0) io.reactivex.internal.functions.b.g(this.f301102b.apply(tPoll), "The mapper returned a null SingleSource");
                                this.f301115o = 1;
                                q0Var.f(this.f301106f);
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.b.b(th2);
                                this.f301109i.cancel();
                                nVar.clear();
                                cVar.a(th2);
                                vVar.onError(cVar.c());
                                return;
                            }
                        }
                    } else if (i12 == 2) {
                        long j10 = this.f301112l;
                        if (j10 != atomicLong.get()) {
                            R r10 = this.f301114n;
                            this.f301114n = null;
                            vVar.onNext(r10);
                            this.f301112l = j10 + 1;
                            this.f301115o = 0;
                        }
                    }
                } else {
                    nVar.clear();
                    this.f301114n = null;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            nVar.clear();
            this.f301114n = null;
            vVar.onError(cVar.c());
        }

        void b(Throwable th2) {
            if (!this.f301105e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f301108h != io.reactivex.internal.util.j.END) {
                this.f301109i.cancel();
            }
            this.f301115o = 0;
            a();
        }

        void c(R r10) {
            this.f301114n = r10;
            this.f301115o = 2;
            a();
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f301111k = true;
            this.f301109i.cancel();
            this.f301106f.a();
            if (getAndIncrement() == 0) {
                this.f301107g.clear();
                this.f301114n = null;
            }
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f301109i, wVar)) {
                this.f301109i = wVar;
                this.f301101a.l(this);
                wVar.request(this.f301103c);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f301110j = true;
            a();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (!this.f301105e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f301108h == io.reactivex.internal.util.j.IMMEDIATE) {
                this.f301106f.a();
            }
            this.f301110j = true;
            a();
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f301107g.offer(t10)) {
                a();
            } else {
                this.f301109i.cancel();
                onError(new io.reactivex.exceptions.c("queue full?!"));
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            io.reactivex.internal.util.d.a(this.f301104d, j10);
            a();
        }
    }

    public e(io.reactivex.l<T> lVar, dj.o<? super T, ? extends q0<? extends R>> oVar, io.reactivex.internal.util.j jVar, int i10) {
        this.f301093b = lVar;
        this.f301094c = oVar;
        this.f301095d = jVar;
        this.f301096e = i10;
    }

    @Override // io.reactivex.l
    protected void k6(v<? super R> vVar) {
        this.f301093b.j6(new a(vVar, this.f301094c, this.f301096e, this.f301095d));
    }
}
