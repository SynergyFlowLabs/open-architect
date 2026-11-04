package io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class n2<T> extends io.reactivex.b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.observables.a<T> f302014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f302015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f302016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f302017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.j0 f302018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    a f302019f;

    static final class a extends AtomicReference<io.reactivex.disposables.c> implements Runnable, dj.g<io.reactivex.disposables.c> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f302020f = -4552101107598366241L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final n2<?> f302021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f302022b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f302023c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f302024d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f302025e;

        a(n2<?> n2Var) {
            this.f302021a = n2Var;
        }

        @Override // dj.g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(io.reactivex.disposables.c cVar) throws Exception {
            io.reactivex.internal.disposables.d.d(this, cVar);
            synchronized (this.f302021a) {
                try {
                    if (this.f302025e) {
                        ((io.reactivex.internal.disposables.g) this.f302021a.f302014a).b(cVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f302021a.j8(this);
        }
    }

    static final class b<T> extends AtomicBoolean implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f302026e = -7419642935409022375L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final n2<T> f302028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final a f302029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        io.reactivex.disposables.c f302030d;

        b(io.reactivex.i0<? super T> i0Var, n2<T> n2Var, a aVar) {
            this.f302027a = i0Var;
            this.f302028b = n2Var;
            this.f302029c = aVar;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302030d, cVar)) {
                this.f302030d = cVar;
                this.f302027a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302030d.dispose();
            if (compareAndSet(false, true)) {
                this.f302028b.h8(this.f302029c);
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302030d.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.f302028b.i8(this.f302029c);
                this.f302027a.onComplete();
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (!compareAndSet(false, true)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302028b.i8(this.f302029c);
                this.f302027a.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f302027a.onNext(t10);
        }
    }

    public n2(io.reactivex.observables.a<T> aVar) {
        this(aVar, 1, 0L, TimeUnit.NANOSECONDS, io.reactivex.schedulers.b.i());
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        a aVar;
        boolean z10;
        io.reactivex.disposables.c cVar;
        synchronized (this) {
            try {
                aVar = this.f302019f;
                if (aVar == null) {
                    aVar = new a(this);
                    this.f302019f = aVar;
                }
                long j10 = aVar.f302023c;
                if (j10 == 0 && (cVar = aVar.f302022b) != null) {
                    cVar.dispose();
                }
                long j11 = j10 + 1;
                aVar.f302023c = j11;
                if (aVar.f302024d || j11 != this.f302015b) {
                    z10 = false;
                } else {
                    z10 = true;
                    aVar.f302024d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f302014a.a(new b(i0Var, this, aVar));
        if (z10) {
            this.f302014a.l8(aVar);
        }
    }

    void h8(a aVar) {
        synchronized (this) {
            try {
                a aVar2 = this.f302019f;
                if (aVar2 != null && aVar2 == aVar) {
                    long j10 = aVar.f302023c - 1;
                    aVar.f302023c = j10;
                    if (j10 == 0 && aVar.f302024d) {
                        if (this.f302016c == 0) {
                            j8(aVar);
                            return;
                        }
                        io.reactivex.internal.disposables.h hVar = new io.reactivex.internal.disposables.h();
                        aVar.f302022b = hVar;
                        hVar.a(this.f302018e.f(aVar, this.f302016c, this.f302017d));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void i8(a aVar) {
        synchronized (this) {
            try {
                a aVar2 = this.f302019f;
                if (aVar2 != null && aVar2 == aVar) {
                    this.f302019f = null;
                    io.reactivex.disposables.c cVar = aVar.f302022b;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                }
                long j10 = aVar.f302023c - 1;
                aVar.f302023c = j10;
                if (j10 == 0) {
                    io.reactivex.observables.a<T> aVar3 = this.f302014a;
                    if (aVar3 instanceof io.reactivex.disposables.c) {
                        ((io.reactivex.disposables.c) aVar3).dispose();
                    } else if (aVar3 instanceof io.reactivex.internal.disposables.g) {
                        ((io.reactivex.internal.disposables.g) aVar3).b(aVar.get());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void j8(a aVar) {
        synchronized (this) {
            try {
                if (aVar.f302023c == 0 && aVar == this.f302019f) {
                    this.f302019f = null;
                    io.reactivex.disposables.c cVar = aVar.get();
                    io.reactivex.internal.disposables.d.b(aVar);
                    io.reactivex.observables.a<T> aVar2 = this.f302014a;
                    if (aVar2 instanceof io.reactivex.disposables.c) {
                        ((io.reactivex.disposables.c) aVar2).dispose();
                    } else if (aVar2 instanceof io.reactivex.internal.disposables.g) {
                        if (cVar == null) {
                            aVar.f302025e = true;
                        } else {
                            ((io.reactivex.internal.disposables.g) aVar2).b(cVar);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public n2(io.reactivex.observables.a<T> aVar, int i10, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
        this.f302014a = aVar;
        this.f302015b = i10;
        this.f302016c = j10;
        this.f302017d = timeUnit;
        this.f302018e = j0Var;
    }
}
