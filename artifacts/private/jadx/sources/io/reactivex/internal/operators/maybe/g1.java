package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class g1<T> extends io.reactivex.k0<T> implements ej.f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.y<T> f300805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.q0<? extends T> f300806b;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f300807c = 4603919676453758899L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super T> f300808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.q0<? extends T> f300809b;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.maybe.g1$a$a, reason: collision with other inner class name */
        static final class C2149a<T> implements io.reactivex.n0<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final io.reactivex.n0<? super T> f300810a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final AtomicReference<io.reactivex.disposables.c> f300811b;

            C2149a(io.reactivex.n0<? super T> n0Var, AtomicReference<io.reactivex.disposables.c> atomicReference) {
                this.f300810a = n0Var;
                this.f300811b = atomicReference;
            }

            @Override // io.reactivex.n0
            public void b(T t10) {
                this.f300810a.b(t10);
            }

            @Override // io.reactivex.n0
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.o(this.f300811b, cVar);
            }

            @Override // io.reactivex.n0
            public void onError(Throwable th2) {
                this.f300810a.onError(th2);
            }
        }

        a(io.reactivex.n0<? super T> n0Var, io.reactivex.q0<? extends T> q0Var) {
            this.f300808a = n0Var;
            this.f300809b = q0Var;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f300808a.b(t10);
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.o(this, cVar)) {
                this.f300808a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.v
        public void onComplete() {
            io.reactivex.disposables.c cVar = get();
            if (cVar == io.reactivex.internal.disposables.d.DISPOSED || !compareAndSet(cVar, null)) {
                return;
            }
            this.f300809b.f(new C2149a(this.f300808a, this));
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300808a.onError(th2);
        }
    }

    public g1(io.reactivex.y<T> yVar, io.reactivex.q0<? extends T> q0Var) {
        this.f300805a = yVar;
        this.f300806b = q0Var;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f300805a.a(new a(n0Var, this.f300806b));
    }

    @Override // ej.f
    public io.reactivex.y<T> source() {
        return this.f300805a;
    }
}
