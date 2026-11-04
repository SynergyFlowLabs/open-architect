package io.reactivex.internal.operators.observable;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class q0<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f302160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final T f302161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f302162d;

    static final class a<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f302164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final T f302165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f302166d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.c f302167e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f302168f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f302169g;

        a(io.reactivex.i0<? super T> i0Var, long j10, T t10, boolean z10) {
            this.f302163a = i0Var;
            this.f302164b = j10;
            this.f302165c = t10;
            this.f302166d = z10;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302167e, cVar)) {
                this.f302167e = cVar;
                this.f302163a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302167e.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302167e.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (!this.f302169g) {
                this.f302169g = true;
                T t10 = this.f302165c;
                if (t10 == null && this.f302166d) {
                    this.f302163a.onError(new NoSuchElementException());
                } else {
                    if (t10 != null) {
                        this.f302163a.onNext(t10);
                    }
                    this.f302163a.onComplete();
                }
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f302169g) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302169g = true;
                this.f302163a.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f302169g) {
                return;
            }
            long j10 = this.f302168f;
            if (j10 != this.f302164b) {
                this.f302168f = j10 + 1;
                return;
            }
            this.f302169g = true;
            this.f302167e.dispose();
            this.f302163a.onNext(t10);
            this.f302163a.onComplete();
        }
    }

    public q0(io.reactivex.g0<T> g0Var, long j10, T t10, boolean z10) {
        super(g0Var);
        this.f302160b = j10;
        this.f302161c = t10;
        this.f302162d = z10;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(i0Var, this.f302160b, this.f302161c, this.f302162d));
    }
}
