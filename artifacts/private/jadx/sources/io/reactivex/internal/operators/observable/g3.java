package io.reactivex.internal.operators.observable;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes10.dex */
public final class g3<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f301614b;

    static final class a<T> extends ArrayDeque<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f301615d = -3807491841935125653L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f301617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f301618c;

        a(io.reactivex.i0<? super T> i0Var, int i10) {
            super(i10);
            this.f301616a = i0Var;
            this.f301617b = i10;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301618c, cVar)) {
                this.f301618c = cVar;
                this.f301616a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301618c.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301618c.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301616a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301616a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f301617b == size()) {
                this.f301616a.onNext(poll());
            }
            offer(t10);
        }
    }

    public g3(io.reactivex.g0<T> g0Var, int i10) {
        super(g0Var);
        this.f301614b = i10;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(i0Var, this.f301614b));
    }
}
