package io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class v3<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f302464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final TimeUnit f302465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.j0 f302466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f302467e;

    static final class a<T> extends AtomicInteger implements io.reactivex.i0<T>, io.reactivex.disposables.c, Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final long f302468m = -8296689127439125014L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f302470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeUnit f302471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.j0.c f302472d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f302473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicReference<T> f302474f = new AtomicReference<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        io.reactivex.disposables.c f302475g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f302476h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Throwable f302477i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f302478j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile boolean f302479k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f302480l;

        a(io.reactivex.i0<? super T> i0Var, long j10, TimeUnit timeUnit, io.reactivex.j0.c cVar, boolean z10) {
            this.f302469a = i0Var;
            this.f302470b = j10;
            this.f302471c = timeUnit;
            this.f302472d = cVar;
            this.f302473e = z10;
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.f302474f;
            io.reactivex.i0<? super T> i0Var = this.f302469a;
            int iAddAndGet = 1;
            while (!this.f302478j) {
                boolean z10 = this.f302476h;
                if (z10 && this.f302477i != null) {
                    atomicReference.lazySet(null);
                    i0Var.onError(this.f302477i);
                    this.f302472d.dispose();
                    return;
                }
                boolean z11 = atomicReference.get() == null;
                if (z10) {
                    T andSet = atomicReference.getAndSet(null);
                    if (!z11 && this.f302473e) {
                        i0Var.onNext(andSet);
                    }
                    i0Var.onComplete();
                    this.f302472d.dispose();
                    return;
                }
                if (z11) {
                    if (this.f302479k) {
                        this.f302480l = false;
                        this.f302479k = false;
                    }
                } else if (!this.f302480l || this.f302479k) {
                    i0Var.onNext(atomicReference.getAndSet(null));
                    this.f302479k = false;
                    this.f302480l = true;
                    this.f302472d.c(this, this.f302470b, this.f302471c);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302475g, cVar)) {
                this.f302475g = cVar;
                this.f302469a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302478j = true;
            this.f302475g.dispose();
            this.f302472d.dispose();
            if (getAndIncrement() == 0) {
                this.f302474f.lazySet(null);
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302478j;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f302476h = true;
            a();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f302477i = th2;
            this.f302476h = true;
            a();
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f302474f.set(t10);
            a();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f302479k = true;
            a();
        }
    }

    public v3(io.reactivex.b0<T> b0Var, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var, boolean z10) {
        super(b0Var);
        this.f302464b = j10;
        this.f302465c = timeUnit;
        this.f302466d = j0Var;
        this.f302467e = z10;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(i0Var, this.f302464b, this.f302465c, this.f302466d.c(), this.f302467e));
    }
}
