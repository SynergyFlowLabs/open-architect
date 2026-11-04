package io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class v<T, U> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.g0<? extends U>> f302414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f302415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.internal.util.j f302416d;

    static final class a<T, R> extends AtomicInteger implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final long f302417m = -6951100001833242599L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super R> f302418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.g0<? extends R>> f302419b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f302420c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.util.c f302421d = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final C2179a<R> f302422e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f302423f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ej.o<T> f302424g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        io.reactivex.disposables.c f302425h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f302426i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f302427j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f302428k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f302429l;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.v$a$a, reason: collision with other inner class name */
        static final class C2179a<R> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<R> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final long f302430c = 2620149119579502636L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final io.reactivex.i0<? super R> f302431a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final a<?, R> f302432b;

            C2179a(io.reactivex.i0<? super R> i0Var, a<?, R> aVar) {
                this.f302431a = i0Var;
                this.f302432b = aVar;
            }

            void a() {
                io.reactivex.internal.disposables.d.b(this);
            }

            @Override // io.reactivex.i0
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.d(this, cVar);
            }

            @Override // io.reactivex.i0
            public void onComplete() {
                a<?, R> aVar = this.f302432b;
                aVar.f302426i = false;
                aVar.a();
            }

            @Override // io.reactivex.i0
            public void onError(Throwable th2) {
                a<?, R> aVar = this.f302432b;
                if (!aVar.f302421d.a(th2)) {
                    io.reactivex.plugins.a.Y(th2);
                    return;
                }
                if (!aVar.f302423f) {
                    aVar.f302425h.dispose();
                }
                aVar.f302426i = false;
                aVar.a();
            }

            @Override // io.reactivex.i0
            public void onNext(R r10) {
                this.f302431a.onNext(r10);
            }
        }

        a(io.reactivex.i0<? super R> i0Var, dj.o<? super T, ? extends io.reactivex.g0<? extends R>> oVar, int i10, boolean z10) {
            this.f302418a = i0Var;
            this.f302419b = oVar;
            this.f302420c = i10;
            this.f302423f = z10;
            this.f302422e = new C2179a<>(i0Var, this);
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.i0<? super R> i0Var = this.f302418a;
            ej.o<T> oVar = this.f302424g;
            io.reactivex.internal.util.c cVar = this.f302421d;
            while (true) {
                if (!this.f302426i) {
                    if (this.f302428k) {
                        oVar.clear();
                        return;
                    }
                    if (!this.f302423f && cVar.get() != null) {
                        oVar.clear();
                        this.f302428k = true;
                        i0Var.onError(cVar.c());
                        return;
                    }
                    boolean z10 = this.f302427j;
                    try {
                        T tPoll = oVar.poll();
                        boolean z11 = tPoll == null;
                        if (z10 && z11) {
                            this.f302428k = true;
                            Throwable thC = cVar.c();
                            if (thC != null) {
                                i0Var.onError(thC);
                                return;
                            } else {
                                i0Var.onComplete();
                                return;
                            }
                        }
                        if (!z11) {
                            try {
                                io.reactivex.g0 g0Var = (io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f302419b.apply(tPoll), "The mapper returned a null ObservableSource");
                                if (g0Var instanceof Callable) {
                                    try {
                                        a0.b bVar = (Object) ((Callable) g0Var).call();
                                        if (bVar != null && !this.f302428k) {
                                            i0Var.onNext(bVar);
                                        }
                                    } catch (Throwable th2) {
                                        io.reactivex.exceptions.b.b(th2);
                                        cVar.a(th2);
                                    }
                                } else {
                                    this.f302426i = true;
                                    g0Var.a(this.f302422e);
                                }
                            } catch (Throwable th3) {
                                io.reactivex.exceptions.b.b(th3);
                                this.f302428k = true;
                                this.f302425h.dispose();
                                oVar.clear();
                                cVar.a(th3);
                                i0Var.onError(cVar.c());
                                return;
                            }
                        }
                    } catch (Throwable th4) {
                        io.reactivex.exceptions.b.b(th4);
                        this.f302428k = true;
                        this.f302425h.dispose();
                        cVar.a(th4);
                        i0Var.onError(cVar.c());
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302425h, cVar)) {
                this.f302425h = cVar;
                if (cVar instanceof ej.j) {
                    ej.j jVar = (ej.j) cVar;
                    int iP = jVar.p(3);
                    if (iP == 1) {
                        this.f302429l = iP;
                        this.f302424g = jVar;
                        this.f302427j = true;
                        this.f302418a.d(this);
                        a();
                        return;
                    }
                    if (iP == 2) {
                        this.f302429l = iP;
                        this.f302424g = jVar;
                        this.f302418a.d(this);
                        return;
                    }
                }
                this.f302424g = new io.reactivex.internal.queue.c(this.f302420c);
                this.f302418a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302428k = true;
            this.f302425h.dispose();
            this.f302422e.a();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302428k;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f302427j = true;
            a();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (!this.f302421d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302427j = true;
                a();
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f302429l == 0) {
                this.f302424g.offer(t10);
            }
            a();
        }
    }

    static final class b<T, U> extends AtomicInteger implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final long f302433k = 8828587559905699186L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super U> f302434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.g0<? extends U>> f302435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final a<U> f302436c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f302437d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ej.o<T> f302438e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        io.reactivex.disposables.c f302439f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f302440g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f302441h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f302442i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f302443j;

        static final class a<U> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<U> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final long f302444c = -7449079488798789337L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final io.reactivex.i0<? super U> f302445a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final b<?, ?> f302446b;

            a(io.reactivex.i0<? super U> i0Var, b<?, ?> bVar) {
                this.f302445a = i0Var;
                this.f302446b = bVar;
            }

            void a() {
                io.reactivex.internal.disposables.d.b(this);
            }

            @Override // io.reactivex.i0
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.d(this, cVar);
            }

            @Override // io.reactivex.i0
            public void onComplete() {
                this.f302446b.b();
            }

            @Override // io.reactivex.i0
            public void onError(Throwable th2) {
                this.f302446b.dispose();
                this.f302445a.onError(th2);
            }

            @Override // io.reactivex.i0
            public void onNext(U u10) {
                this.f302445a.onNext(u10);
            }
        }

        b(io.reactivex.i0<? super U> i0Var, dj.o<? super T, ? extends io.reactivex.g0<? extends U>> oVar, int i10) {
            this.f302434a = i0Var;
            this.f302435b = oVar;
            this.f302437d = i10;
            this.f302436c = new a<>(i0Var, this);
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f302441h) {
                if (!this.f302440g) {
                    boolean z10 = this.f302442i;
                    try {
                        T tPoll = this.f302438e.poll();
                        boolean z11 = tPoll == null;
                        if (z10 && z11) {
                            this.f302441h = true;
                            this.f302434a.onComplete();
                            return;
                        } else if (!z11) {
                            try {
                                io.reactivex.g0 g0Var = (io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f302435b.apply(tPoll), "The mapper returned a null ObservableSource");
                                this.f302440g = true;
                                g0Var.a(this.f302436c);
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.b.b(th2);
                                dispose();
                                this.f302438e.clear();
                                this.f302434a.onError(th2);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        io.reactivex.exceptions.b.b(th3);
                        dispose();
                        this.f302438e.clear();
                        this.f302434a.onError(th3);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f302438e.clear();
        }

        void b() {
            this.f302440g = false;
            a();
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302439f, cVar)) {
                this.f302439f = cVar;
                if (cVar instanceof ej.j) {
                    ej.j jVar = (ej.j) cVar;
                    int iP = jVar.p(3);
                    if (iP == 1) {
                        this.f302443j = iP;
                        this.f302438e = jVar;
                        this.f302442i = true;
                        this.f302434a.d(this);
                        a();
                        return;
                    }
                    if (iP == 2) {
                        this.f302443j = iP;
                        this.f302438e = jVar;
                        this.f302434a.d(this);
                        return;
                    }
                }
                this.f302438e = new io.reactivex.internal.queue.c(this.f302437d);
                this.f302434a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302441h = true;
            this.f302436c.a();
            this.f302439f.dispose();
            if (getAndIncrement() == 0) {
                this.f302438e.clear();
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302441h;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f302442i) {
                return;
            }
            this.f302442i = true;
            a();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f302442i) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f302442i = true;
            dispose();
            this.f302434a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f302442i) {
                return;
            }
            if (this.f302443j == 0) {
                this.f302438e.offer(t10);
            }
            a();
        }
    }

    public v(io.reactivex.g0<T> g0Var, dj.o<? super T, ? extends io.reactivex.g0<? extends U>> oVar, int i10, io.reactivex.internal.util.j jVar) {
        super(g0Var);
        this.f302414b = oVar;
        this.f302416d = jVar;
        this.f302415c = Math.max(8, i10);
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super U> i0Var) {
        if (x2.b(this.f301291a, i0Var, this.f302414b)) {
            return;
        }
        if (this.f302416d == io.reactivex.internal.util.j.IMMEDIATE) {
            this.f301291a.a(new b(new io.reactivex.observers.m(i0Var), this.f302414b, this.f302415c));
        } else {
            this.f301291a.a(new a(i0Var, this.f302414b, this.f302415c, this.f302416d == io.reactivex.internal.util.j.END));
        }
    }
}
