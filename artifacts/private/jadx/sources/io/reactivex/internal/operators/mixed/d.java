package io.reactivex.internal.operators.mixed;

import io.reactivex.y;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes10.dex */
public final class d<T, R> extends io.reactivex.l<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.l<T> f301068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends y<? extends R>> f301069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.internal.util.j f301070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f301071e;

    static final class a<T, R> extends AtomicInteger implements io.reactivex.q<T>, w {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final long f301072s = -9140123220065488293L;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final int f301073t = 0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        static final int f301074v = 1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        static final int f301075w = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final v<? super R> f301076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends y<? extends R>> f301077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f301078c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicLong f301079d = new AtomicLong();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.internal.util.c f301080e = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final C2155a<R> f301081f = new C2155a<>(this);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final ej.n<T> f301082g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final io.reactivex.internal.util.j f301083h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        w f301084i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f301085j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f301086k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        long f301087l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f301088m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        R f301089n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        volatile int f301090o;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.d$a$a, reason: collision with other inner class name */
        static final class C2155a<R> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<R> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f301091b = -3051469169682093892L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final a<?, R> f301092a;

            C2155a(a<?, R> aVar) {
                this.f301092a = aVar;
            }

            void a() {
                io.reactivex.internal.disposables.d.b(this);
            }

            @Override // io.reactivex.v
            public void b(R r10) {
                this.f301092a.d(r10);
            }

            @Override // io.reactivex.v
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.d(this, cVar);
            }

            @Override // io.reactivex.v
            public void onComplete() {
                this.f301092a.b();
            }

            @Override // io.reactivex.v
            public void onError(Throwable th2) {
                this.f301092a.c(th2);
            }
        }

        a(v<? super R> vVar, dj.o<? super T, ? extends y<? extends R>> oVar, int i10, io.reactivex.internal.util.j jVar) {
            this.f301076a = vVar;
            this.f301077b = oVar;
            this.f301078c = i10;
            this.f301083h = jVar;
            this.f301082g = new io.reactivex.internal.queue.b(i10);
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            v<? super R> vVar = this.f301076a;
            io.reactivex.internal.util.j jVar = this.f301083h;
            ej.n<T> nVar = this.f301082g;
            io.reactivex.internal.util.c cVar = this.f301080e;
            AtomicLong atomicLong = this.f301079d;
            int i10 = this.f301078c;
            int i11 = i10 - (i10 >> 1);
            int iAddAndGet = 1;
            while (true) {
                if (!this.f301086k) {
                    int i12 = this.f301090o;
                    if (cVar.get() != null && (jVar == io.reactivex.internal.util.j.IMMEDIATE || (jVar == io.reactivex.internal.util.j.BOUNDARY && i12 == 0))) {
                        break;
                    }
                    if (i12 == 0) {
                        boolean z10 = this.f301085j;
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
                            int i13 = this.f301088m + 1;
                            if (i13 == i11) {
                                this.f301088m = 0;
                                this.f301084i.request(i11);
                            } else {
                                this.f301088m = i13;
                            }
                            try {
                                y yVar = (y) io.reactivex.internal.functions.b.g(this.f301077b.apply(tPoll), "The mapper returned a null MaybeSource");
                                this.f301090o = 1;
                                yVar.a(this.f301081f);
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.b.b(th2);
                                this.f301084i.cancel();
                                nVar.clear();
                                cVar.a(th2);
                                vVar.onError(cVar.c());
                                return;
                            }
                        }
                    } else if (i12 == 2) {
                        long j10 = this.f301087l;
                        if (j10 != atomicLong.get()) {
                            R r10 = this.f301089n;
                            this.f301089n = null;
                            vVar.onNext(r10);
                            this.f301087l = j10 + 1;
                            this.f301090o = 0;
                        }
                    }
                } else {
                    nVar.clear();
                    this.f301089n = null;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            nVar.clear();
            this.f301089n = null;
            vVar.onError(cVar.c());
        }

        void b() {
            this.f301090o = 0;
            a();
        }

        void c(Throwable th2) {
            if (!this.f301080e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f301083h != io.reactivex.internal.util.j.END) {
                this.f301084i.cancel();
            }
            this.f301090o = 0;
            a();
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f301086k = true;
            this.f301084i.cancel();
            this.f301081f.a();
            if (getAndIncrement() == 0) {
                this.f301082g.clear();
                this.f301089n = null;
            }
        }

        void d(R r10) {
            this.f301089n = r10;
            this.f301090o = 2;
            a();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f301084i, wVar)) {
                this.f301084i = wVar;
                this.f301076a.l(this);
                wVar.request(this.f301078c);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f301085j = true;
            a();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (!this.f301080e.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f301083h == io.reactivex.internal.util.j.IMMEDIATE) {
                this.f301081f.a();
            }
            this.f301085j = true;
            a();
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f301082g.offer(t10)) {
                a();
            } else {
                this.f301084i.cancel();
                onError(new io.reactivex.exceptions.c("queue full?!"));
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            io.reactivex.internal.util.d.a(this.f301079d, j10);
            a();
        }
    }

    public d(io.reactivex.l<T> lVar, dj.o<? super T, ? extends y<? extends R>> oVar, io.reactivex.internal.util.j jVar, int i10) {
        this.f301068b = lVar;
        this.f301069c = oVar;
        this.f301070d = jVar;
        this.f301071e = i10;
    }

    @Override // io.reactivex.l
    protected void k6(v<? super R> vVar) {
        this.f301068b.j6(new a(vVar, this.f301069c, this.f301071e, this.f301070d));
    }
}
