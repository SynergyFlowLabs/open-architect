package io.reactivex.internal.operators.mixed;

import io.reactivex.b0;
import io.reactivex.g0;
import io.reactivex.i0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class a<R> extends b0<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.i f301037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final g0<? extends R> f301038b;

    /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.a$a, reason: collision with other inner class name */
    static final class C2153a<R> extends AtomicReference<io.reactivex.disposables.c> implements i0<R>, io.reactivex.f, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f301039c = -8948264376121066672L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final i0<? super R> f301040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g0<? extends R> f301041b;

        C2153a(i0<? super R> i0Var, g0<? extends R> g0Var) {
            this.f301041b = g0Var;
            this.f301040a = i0Var;
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
            g0<? extends R> g0Var = this.f301041b;
            if (g0Var == null) {
                this.f301040a.onComplete();
            } else {
                this.f301041b = null;
                g0Var.a(this);
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301040a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(R r10) {
            this.f301040a.onNext(r10);
        }
    }

    public a(io.reactivex.i iVar, g0<? extends R> g0Var) {
        this.f301037a = iVar;
        this.f301038b = g0Var;
    }

    @Override // io.reactivex.b0
    protected void H5(i0<? super R> i0Var) {
        C2153a c2153a = new C2153a(i0Var, this.f301038b);
        i0Var.d(c2153a);
        this.f301037a.b(c2153a);
    }
}
