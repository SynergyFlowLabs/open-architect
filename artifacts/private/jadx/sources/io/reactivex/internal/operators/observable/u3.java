package io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class u3<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f302403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final TimeUnit f302404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.j0 f302405d;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<T>, io.reactivex.disposables.c, Runnable {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f302406h = 786994795061867455L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f302408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeUnit f302409c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.j0.c f302410d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.c f302411e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f302412f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f302413g;

        a(io.reactivex.i0<? super T> i0Var, long j10, TimeUnit timeUnit, io.reactivex.j0.c cVar) {
            this.f302407a = i0Var;
            this.f302408b = j10;
            this.f302409c = timeUnit;
            this.f302410d = cVar;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302411e, cVar)) {
                this.f302411e = cVar;
                this.f302407a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302411e.dispose();
            this.f302410d.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302410d.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f302413g) {
                return;
            }
            this.f302413g = true;
            this.f302407a.onComplete();
            this.f302410d.dispose();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f302413g) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f302413g = true;
            this.f302407a.onError(th2);
            this.f302410d.dispose();
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f302412f || this.f302413g) {
                return;
            }
            this.f302412f = true;
            this.f302407a.onNext(t10);
            io.reactivex.disposables.c cVar = get();
            if (cVar != null) {
                cVar.dispose();
            }
            io.reactivex.internal.disposables.d.d(this, this.f302410d.c(this, this.f302408b, this.f302409c));
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f302412f = false;
        }
    }

    public u3(io.reactivex.g0<T> g0Var, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
        super(g0Var);
        this.f302403b = j10;
        this.f302404c = timeUnit;
        this.f302405d = j0Var;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(new io.reactivex.observers.m(i0Var), this.f302403b, this.f302404c, this.f302405d.c()));
    }
}
