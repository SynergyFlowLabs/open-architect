package io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class g0<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f301584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final TimeUnit f301585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.j0 f301586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f301587e;

    static final class a<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f301589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeUnit f301590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.j0.c f301591d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f301592e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        io.reactivex.disposables.c f301593f;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.g0$a$a, reason: collision with other inner class name */
        final class RunnableC2172a implements Runnable {
            RunnableC2172a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f301588a.onComplete();
                    a.this.f301591d.dispose();
                } catch (Throwable th2) {
                    a.this.f301591d.dispose();
                    throw th2;
                }
            }
        }

        final class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Throwable f301595a;

            b(Throwable th2) {
                this.f301595a = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f301588a.onError(this.f301595a);
                    a.this.f301591d.dispose();
                } catch (Throwable th2) {
                    a.this.f301591d.dispose();
                    throw th2;
                }
            }
        }

        final class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final T f301597a;

            c(T t10) {
                this.f301597a = t10;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f301588a.onNext(this.f301597a);
            }
        }

        a(io.reactivex.i0<? super T> i0Var, long j10, TimeUnit timeUnit, io.reactivex.j0.c cVar, boolean z10) {
            this.f301588a = i0Var;
            this.f301589b = j10;
            this.f301590c = timeUnit;
            this.f301591d = cVar;
            this.f301592e = z10;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301593f, cVar)) {
                this.f301593f = cVar;
                this.f301588a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301593f.dispose();
            this.f301591d.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301591d.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301591d.c(new RunnableC2172a(), this.f301589b, this.f301590c);
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301591d.c(new b(th2), this.f301592e ? this.f301589b : 0L, this.f301590c);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f301591d.c(new c(t10), this.f301589b, this.f301590c);
        }
    }

    public g0(io.reactivex.g0<T> g0Var, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var, boolean z10) {
        super(g0Var);
        this.f301584b = j10;
        this.f301585c = timeUnit;
        this.f301586d = j0Var;
        this.f301587e = z10;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(this.f301587e ? i0Var : new io.reactivex.observers.m(i0Var), this.f301584b, this.f301585c, this.f301586d.c(), this.f301587e));
    }
}
