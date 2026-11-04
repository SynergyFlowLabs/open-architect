package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class d2<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.j0 f301445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f301446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f301447d;

    static final class a<T> extends io.reactivex.internal.observers.b<T> implements io.reactivex.i0<T>, Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final long f301448m = 6576896619930983584L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.j0.c f301450c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f301451d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f301452e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ej.o<T> f301453f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        io.reactivex.disposables.c f301454g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Throwable f301455h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f301456i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f301457j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f301458k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f301459l;

        a(io.reactivex.i0<? super T> i0Var, io.reactivex.j0.c cVar, boolean z10, int i10) {
            this.f301449b = i0Var;
            this.f301450c = cVar;
            this.f301451d = z10;
            this.f301452e = i10;
        }

        boolean a(boolean z10, boolean z11, io.reactivex.i0<? super T> i0Var) {
            if (this.f301457j) {
                this.f301453f.clear();
                return true;
            }
            if (z10) {
                Throwable th2 = this.f301455h;
                if (this.f301451d) {
                    if (z11) {
                        this.f301457j = true;
                        if (th2 != null) {
                            i0Var.onError(th2);
                        } else {
                            i0Var.onComplete();
                        }
                        this.f301450c.dispose();
                        return true;
                    }
                } else {
                    if (th2 != null) {
                        this.f301457j = true;
                        this.f301453f.clear();
                        i0Var.onError(th2);
                        this.f301450c.dispose();
                        return true;
                    }
                    if (z11) {
                        this.f301457j = true;
                        i0Var.onComplete();
                        this.f301450c.dispose();
                        return true;
                    }
                }
            }
            return false;
        }

        void c() {
            int iAddAndGet = 1;
            while (!this.f301457j) {
                boolean z10 = this.f301456i;
                Throwable th2 = this.f301455h;
                if (!this.f301451d && z10 && th2 != null) {
                    this.f301457j = true;
                    this.f301449b.onError(this.f301455h);
                    this.f301450c.dispose();
                    return;
                }
                this.f301449b.onNext(null);
                if (z10) {
                    this.f301457j = true;
                    Throwable th3 = this.f301455h;
                    if (th3 != null) {
                        this.f301449b.onError(th3);
                    } else {
                        this.f301449b.onComplete();
                    }
                    this.f301450c.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    break;
                }
            }
        }

        @Override // ej.o
        public void clear() {
            this.f301453f.clear();
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301454g, cVar)) {
                this.f301454g = cVar;
                if (cVar instanceof ej.j) {
                    ej.j jVar = (ej.j) cVar;
                    int iP = jVar.p(7);
                    if (iP == 1) {
                        this.f301458k = iP;
                        this.f301453f = jVar;
                        this.f301456i = true;
                        this.f301449b.d(this);
                        f();
                        return;
                    }
                    if (iP == 2) {
                        this.f301458k = iP;
                        this.f301453f = jVar;
                        this.f301449b.d(this);
                        return;
                    }
                }
                this.f301453f = new io.reactivex.internal.queue.c(this.f301452e);
                this.f301449b.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (!this.f301457j) {
                this.f301457j = true;
                this.f301454g.dispose();
                this.f301450c.dispose();
                if (getAndIncrement() == 0) {
                    this.f301453f.clear();
                }
            }
        }

        void e() {
            ej.o<T> oVar = this.f301453f;
            io.reactivex.i0<? super T> i0Var = this.f301449b;
            int iAddAndGet = 1;
            while (!a(this.f301456i, oVar.isEmpty(), i0Var)) {
                while (true) {
                    boolean z10 = this.f301456i;
                    try {
                        T tPoll = oVar.poll();
                        boolean z11 = tPoll == null;
                        if (a(z10, z11, i0Var)) {
                            return;
                        }
                        if (z11) {
                            break;
                        } else {
                            i0Var.onNext(tPoll);
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.b.b(th2);
                        this.f301457j = true;
                        this.f301454g.dispose();
                        oVar.clear();
                        i0Var.onError(th2);
                        this.f301450c.dispose();
                        return;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        void f() {
            if (getAndIncrement() == 0) {
                this.f301450c.b(this);
            }
        }

        @Override // ej.o
        public boolean isEmpty() {
            return this.f301453f.isEmpty();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301457j;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f301456i) {
                return;
            }
            this.f301456i = true;
            f();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f301456i) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f301455h = th2;
            this.f301456i = true;
            f();
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f301456i) {
                return;
            }
            if (this.f301458k != 2) {
                this.f301453f.offer(t10);
            }
            f();
        }

        @Override // ej.k
        public int p(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f301459l = true;
            return 2;
        }

        @Override // ej.o
        @cj.g
        public T poll() throws Exception {
            return this.f301453f.poll();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f301459l) {
                c();
            } else {
                e();
            }
        }
    }

    public d2(io.reactivex.g0<T> g0Var, io.reactivex.j0 j0Var, boolean z10, int i10) {
        super(g0Var);
        this.f301445b = j0Var;
        this.f301446c = z10;
        this.f301447d = i10;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        io.reactivex.j0 j0Var = this.f301445b;
        if (j0Var instanceof io.reactivex.internal.schedulers.s) {
            this.f301291a.a(i0Var);
        } else {
            this.f301291a.a(new a(i0Var, j0Var.c(), this.f301446c, this.f301447d));
        }
    }
}
