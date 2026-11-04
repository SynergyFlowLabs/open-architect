package io.reactivex.internal.operators.mixed;

import io.reactivex.b0;
import io.reactivex.i0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class l<T> extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b0<T> f301181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.i> f301182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.internal.util.j f301183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f301184d;

    static final class a<T> extends AtomicInteger implements i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final long f301185l = 3610901111000061034L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f301186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.i> f301187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.util.j f301188c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.util.c f301189d = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final C2160a f301190e = new C2160a(this);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f301191f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ej.o<T> f301192g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        io.reactivex.disposables.c f301193h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f301194i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f301195j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f301196k;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.l$a$a, reason: collision with other inner class name */
        static final class C2160a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f301197b = 5638352172918776687L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final a<?> f301198a;

            C2160a(a<?> aVar) {
                this.f301198a = aVar;
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
                this.f301198a.b();
            }

            @Override // io.reactivex.f
            public void onError(Throwable th2) {
                this.f301198a.c(th2);
            }
        }

        a(io.reactivex.f fVar, dj.o<? super T, ? extends io.reactivex.i> oVar, io.reactivex.internal.util.j jVar, int i10) {
            this.f301186a = fVar;
            this.f301187b = oVar;
            this.f301188c = jVar;
            this.f301191f = i10;
        }

        void a() {
            io.reactivex.i iVar;
            boolean z10;
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.util.c cVar = this.f301189d;
            io.reactivex.internal.util.j jVar = this.f301188c;
            while (!this.f301196k) {
                if (!this.f301194i) {
                    if (jVar == io.reactivex.internal.util.j.BOUNDARY && cVar.get() != null) {
                        this.f301196k = true;
                        this.f301192g.clear();
                        this.f301186a.onError(cVar.c());
                        return;
                    }
                    boolean z11 = this.f301195j;
                    try {
                        T tPoll = this.f301192g.poll();
                        if (tPoll != null) {
                            iVar = (io.reactivex.i) io.reactivex.internal.functions.b.g(this.f301187b.apply(tPoll), "The mapper returned a null CompletableSource");
                            z10 = false;
                        } else {
                            iVar = null;
                            z10 = true;
                        }
                        if (z11 && z10) {
                            this.f301196k = true;
                            Throwable thC = cVar.c();
                            if (thC != null) {
                                this.f301186a.onError(thC);
                                return;
                            } else {
                                this.f301186a.onComplete();
                                return;
                            }
                        }
                        if (!z10) {
                            this.f301194i = true;
                            iVar.b(this.f301190e);
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.b.b(th2);
                        this.f301196k = true;
                        this.f301192g.clear();
                        this.f301193h.dispose();
                        cVar.a(th2);
                        this.f301186a.onError(cVar.c());
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f301192g.clear();
        }

        void b() {
            this.f301194i = false;
            a();
        }

        void c(Throwable th2) {
            if (!this.f301189d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f301188c != io.reactivex.internal.util.j.IMMEDIATE) {
                this.f301194i = false;
                a();
                return;
            }
            this.f301196k = true;
            this.f301193h.dispose();
            Throwable thC = this.f301189d.c();
            if (thC != io.reactivex.internal.util.k.f303486a) {
                this.f301186a.onError(thC);
            }
            if (getAndIncrement() == 0) {
                this.f301192g.clear();
            }
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301193h, cVar)) {
                this.f301193h = cVar;
                if (cVar instanceof ej.j) {
                    ej.j jVar = (ej.j) cVar;
                    int iP = jVar.p(3);
                    if (iP == 1) {
                        this.f301192g = jVar;
                        this.f301195j = true;
                        this.f301186a.d(this);
                        a();
                        return;
                    }
                    if (iP == 2) {
                        this.f301192g = jVar;
                        this.f301186a.d(this);
                        return;
                    }
                }
                this.f301192g = new io.reactivex.internal.queue.c(this.f301191f);
                this.f301186a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301196k = true;
            this.f301193h.dispose();
            this.f301190e.a();
            if (getAndIncrement() == 0) {
                this.f301192g.clear();
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301196k;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301195j = true;
            a();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (!this.f301189d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f301188c != io.reactivex.internal.util.j.IMMEDIATE) {
                this.f301195j = true;
                a();
                return;
            }
            this.f301196k = true;
            this.f301190e.a();
            Throwable thC = this.f301189d.c();
            if (thC != io.reactivex.internal.util.k.f303486a) {
                this.f301186a.onError(thC);
            }
            if (getAndIncrement() == 0) {
                this.f301192g.clear();
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (t10 != null) {
                this.f301192g.offer(t10);
            }
            a();
        }
    }

    public l(b0<T> b0Var, dj.o<? super T, ? extends io.reactivex.i> oVar, io.reactivex.internal.util.j jVar, int i10) {
        this.f301181a = b0Var;
        this.f301182b = oVar;
        this.f301183c = jVar;
        this.f301184d = i10;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        if (!r.a(this.f301181a, this.f301182b, fVar)) {
            this.f301181a.a(new a(fVar, this.f301182b, this.f301183c, this.f301184d));
        }
    }
}
