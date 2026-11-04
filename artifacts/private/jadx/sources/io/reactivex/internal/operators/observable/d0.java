package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class d0<T, U> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.g0<U>> f301432b;

    static final class a<T, U> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.g0<U>> f301434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f301435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f301436d = new AtomicReference<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile long f301437e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f301438f;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.d0$a$a, reason: collision with other inner class name */
        static final class C2171a<T, U> extends io.reactivex.observers.e<U> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final a<T, U> f301439b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final long f301440c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final T f301441d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            boolean f301442e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final AtomicBoolean f301443f = new AtomicBoolean();

            C2171a(a<T, U> aVar, long j10, T t10) {
                this.f301439b = aVar;
                this.f301440c = j10;
                this.f301441d = t10;
            }

            void c() {
                if (this.f301443f.compareAndSet(false, true)) {
                    this.f301439b.a(this.f301440c, this.f301441d);
                }
            }

            @Override // io.reactivex.i0
            public void onComplete() {
                if (this.f301442e) {
                    return;
                }
                this.f301442e = true;
                c();
            }

            @Override // io.reactivex.i0
            public void onError(Throwable th2) {
                if (this.f301442e) {
                    io.reactivex.plugins.a.Y(th2);
                } else {
                    this.f301442e = true;
                    this.f301439b.onError(th2);
                }
            }

            @Override // io.reactivex.i0
            public void onNext(U u10) {
                if (this.f301442e) {
                    return;
                }
                this.f301442e = true;
                dispose();
                c();
            }
        }

        a(io.reactivex.i0<? super T> i0Var, dj.o<? super T, ? extends io.reactivex.g0<U>> oVar) {
            this.f301433a = i0Var;
            this.f301434b = oVar;
        }

        void a(long j10, T t10) {
            if (j10 == this.f301437e) {
                this.f301433a.onNext(t10);
            }
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301435c, cVar)) {
                this.f301435c = cVar;
                this.f301433a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301435c.dispose();
            io.reactivex.internal.disposables.d.b(this.f301436d);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301435c.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f301438f) {
                return;
            }
            this.f301438f = true;
            io.reactivex.disposables.c cVar = this.f301436d.get();
            if (cVar != io.reactivex.internal.disposables.d.DISPOSED) {
                ((C2171a) cVar).c();
                io.reactivex.internal.disposables.d.b(this.f301436d);
                this.f301433a.onComplete();
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            io.reactivex.internal.disposables.d.b(this.f301436d);
            this.f301433a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f301438f) {
                return;
            }
            long j10 = this.f301437e + 1;
            this.f301437e = j10;
            io.reactivex.disposables.c cVar = this.f301436d.get();
            if (cVar != null) {
                cVar.dispose();
            }
            try {
                io.reactivex.g0 g0Var = (io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f301434b.apply(t10), "The ObservableSource supplied is null");
                C2171a c2171a = new C2171a(this, j10, t10);
                if (androidx.compose.animation.core.z1.a(this.f301436d, cVar, c2171a)) {
                    g0Var.a(c2171a);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                dispose();
                this.f301433a.onError(th2);
            }
        }
    }

    public d0(io.reactivex.g0<T> g0Var, dj.o<? super T, ? extends io.reactivex.g0<U>> oVar) {
        super(g0Var);
        this.f301432b = oVar;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(new io.reactivex.observers.m(i0Var), this.f301432b));
    }
}
