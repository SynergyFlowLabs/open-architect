package io.reactivex.internal.operators.mixed;

import io.reactivex.b0;
import io.reactivex.g0;
import io.reactivex.i0;
import io.reactivex.n0;
import io.reactivex.q0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class s<T, R> extends b0<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final q0<T> f301286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends g0<? extends R>> f301287b;

    static final class a<T, R> extends AtomicReference<io.reactivex.disposables.c> implements i0<R>, n0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f301288c = -8948264376121066672L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final i0<? super R> f301289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends g0<? extends R>> f301290b;

        a(i0<? super R> i0Var, dj.o<? super T, ? extends g0<? extends R>> oVar) {
            this.f301289a = i0Var;
            this.f301290b = oVar;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            try {
                ((g0) io.reactivex.internal.functions.b.g(this.f301290b.apply(t10), "The mapper returned a null Publisher")).a(this);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f301289a.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.d(this, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301289a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301289a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(R r10) {
            this.f301289a.onNext(r10);
        }
    }

    public s(q0<T> q0Var, dj.o<? super T, ? extends g0<? extends R>> oVar) {
        this.f301286a = q0Var;
        this.f301287b = oVar;
    }

    @Override // io.reactivex.b0
    protected void H5(i0<? super R> i0Var) {
        a aVar = new a(i0Var, this.f301287b);
        i0Var.d(aVar);
        this.f301286a.f(aVar);
    }
}
