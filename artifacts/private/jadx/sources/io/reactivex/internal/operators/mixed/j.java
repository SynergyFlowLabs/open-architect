package io.reactivex.internal.operators.mixed;

import io.reactivex.b0;
import io.reactivex.g0;
import io.reactivex.i0;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class j<T, R> extends b0<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final y<T> f301169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends g0<? extends R>> f301170b;

    static final class a<T, R> extends AtomicReference<io.reactivex.disposables.c> implements i0<R>, v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f301171c = -8948264376121066672L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final i0<? super R> f301172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends g0<? extends R>> f301173b;

        a(i0<? super R> i0Var, dj.o<? super T, ? extends g0<? extends R>> oVar) {
            this.f301172a = i0Var;
            this.f301173b = oVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            try {
                ((g0) io.reactivex.internal.functions.b.g(this.f301173b.apply(t10), "The mapper returned a null Publisher")).a(this);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f301172a.onError(th2);
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
            this.f301172a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301172a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(R r10) {
            this.f301172a.onNext(r10);
        }
    }

    public j(y<T> yVar, dj.o<? super T, ? extends g0<? extends R>> oVar) {
        this.f301169a = yVar;
        this.f301170b = oVar;
    }

    @Override // io.reactivex.b0
    protected void H5(i0<? super R> i0Var) {
        a aVar = new a(i0Var, this.f301170b);
        i0Var.d(aVar);
        this.f301169a.a(aVar);
    }
}
