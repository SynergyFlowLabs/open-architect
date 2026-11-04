package io.reactivex.internal.operators.mixed;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes10.dex */
public final class c<T> extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.l<T> f301049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.i> f301050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.internal.util.j f301051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f301052d;

    static final class a<T> extends AtomicInteger implements io.reactivex.q<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final long f301053m = 3610901111000061034L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f301054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.i> f301055b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.util.j f301056c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.util.c f301057d = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final C2154a f301058e = new C2154a(this);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f301059f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final ej.n<T> f301060g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        w f301061h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f301062i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f301063j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f301064k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f301065l;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.c$a$a, reason: collision with other inner class name */
        static final class C2154a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f301066b = 5638352172918776687L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final a<?> f301067a;

            C2154a(a<?> aVar) {
                this.f301067a = aVar;
            }

            void a() {
                io.reactivex.internal.disposables.d.b(this);
            }

            @Override // io.reactivex.f
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.d(this, cVar);
            }

            @Override // io.reactivex.f
            public void onComplete() {
                this.f301067a.b();
            }

            @Override // io.reactivex.f
            public void onError(Throwable th2) {
                this.f301067a.c(th2);
            }
        }

        a(io.reactivex.f fVar, dj.o<? super T, ? extends io.reactivex.i> oVar, io.reactivex.internal.util.j jVar, int i10) {
            this.f301054a = fVar;
            this.f301055b = oVar;
            this.f301056c = jVar;
            this.f301059f = i10;
            this.f301060g = new io.reactivex.internal.queue.b(i10);
        }

        void a() {
            if (getAndIncrement() == 0) {
                while (!this.f301064k) {
                    if (!this.f301062i) {
                        if (this.f301056c == io.reactivex.internal.util.j.BOUNDARY && this.f301057d.get() != null) {
                            this.f301060g.clear();
                            this.f301054a.onError(this.f301057d.c());
                            return;
                        }
                        boolean z10 = this.f301063j;
                        T tPoll = this.f301060g.poll();
                        boolean z11 = tPoll == null;
                        if (z10 && z11) {
                            Throwable thC = this.f301057d.c();
                            if (thC != null) {
                                this.f301054a.onError(thC);
                                return;
                            } else {
                                this.f301054a.onComplete();
                                return;
                            }
                        }
                        if (!z11) {
                            int i10 = this.f301059f;
                            int i11 = i10 - (i10 >> 1);
                            int i12 = this.f301065l + 1;
                            if (i12 == i11) {
                                this.f301065l = 0;
                                this.f301061h.request(i11);
                            } else {
                                this.f301065l = i12;
                            }
                            try {
                                io.reactivex.i iVar = (io.reactivex.i) io.reactivex.internal.functions.b.g(this.f301055b.apply(tPoll), "The mapper returned a null CompletableSource");
                                this.f301062i = true;
                                iVar.b(this.f301058e);
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.b.b(th2);
                                this.f301060g.clear();
                                this.f301061h.cancel();
                                this.f301057d.a(th2);
                                this.f301054a.onError(this.f301057d.c());
                                return;
                            }
                        }
                    }
                    if (decrementAndGet() == 0) {
                    }
                }
                this.f301060g.clear();
            }
        }

        void b() {
            this.f301062i = false;
            a();
        }

        void c(Throwable th2) {
            if (!this.f301057d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f301056c != io.reactivex.internal.util.j.IMMEDIATE) {
                this.f301062i = false;
                a();
                return;
            }
            this.f301061h.cancel();
            Throwable thC = this.f301057d.c();
            if (thC != io.reactivex.internal.util.k.f303486a) {
                this.f301054a.onError(thC);
            }
            if (getAndIncrement() == 0) {
                this.f301060g.clear();
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301064k = true;
            this.f301061h.cancel();
            this.f301058e.a();
            if (getAndIncrement() == 0) {
                this.f301060g.clear();
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301064k;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f301061h, wVar)) {
                this.f301061h = wVar;
                this.f301054a.d(this);
                wVar.request(this.f301059f);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f301063j = true;
            a();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (!this.f301057d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f301056c != io.reactivex.internal.util.j.IMMEDIATE) {
                this.f301063j = true;
                a();
                return;
            }
            this.f301058e.a();
            Throwable thC = this.f301057d.c();
            if (thC != io.reactivex.internal.util.k.f303486a) {
                this.f301054a.onError(thC);
            }
            if (getAndIncrement() == 0) {
                this.f301060g.clear();
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            if (this.f301060g.offer(t10)) {
                a();
            } else {
                this.f301061h.cancel();
                onError(new io.reactivex.exceptions.c("Queue full?!"));
            }
        }
    }

    public c(io.reactivex.l<T> lVar, dj.o<? super T, ? extends io.reactivex.i> oVar, io.reactivex.internal.util.j jVar, int i10) {
        this.f301049a = lVar;
        this.f301050b = oVar;
        this.f301051c = jVar;
        this.f301052d = i10;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        this.f301049a.j6(new a(fVar, this.f301050b, this.f301051c, this.f301052d));
    }
}
