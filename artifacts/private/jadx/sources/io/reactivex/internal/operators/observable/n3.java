package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class n3<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f302031b;

    static final class a<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f302033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f302034c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f302035d;

        a(io.reactivex.i0<? super T> i0Var, long j10) {
            this.f302032a = i0Var;
            this.f302035d = j10;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302034c, cVar)) {
                this.f302034c = cVar;
                if (this.f302035d != 0) {
                    this.f302032a.d(this);
                    return;
                }
                this.f302033b = true;
                cVar.dispose();
                io.reactivex.internal.disposables.e.d(this.f302032a);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302034c.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302034c.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f302033b) {
                return;
            }
            this.f302033b = true;
            this.f302034c.dispose();
            this.f302032a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f302033b) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f302033b = true;
            this.f302034c.dispose();
            this.f302032a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f302033b) {
                return;
            }
            long j10 = this.f302035d;
            long j11 = j10 - 1;
            this.f302035d = j11;
            if (j10 > 0) {
                boolean z10 = j11 == 0;
                this.f302032a.onNext(t10);
                if (z10) {
                    onComplete();
                }
            }
        }
    }

    public n3(io.reactivex.g0<T> g0Var, long j10) {
        super(g0Var);
        this.f302031b = j10;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(i0Var, this.f302031b));
    }
}
