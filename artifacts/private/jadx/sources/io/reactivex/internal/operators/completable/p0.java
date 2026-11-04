package io.reactivex.internal.operators.completable;

/* JADX INFO: loaded from: classes10.dex */
public final class p0<T> extends io.reactivex.b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.i f299009a;

    static final class a extends io.reactivex.internal.observers.c<Void> implements io.reactivex.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<?> f299010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f299011b;

        a(io.reactivex.i0<?> i0Var) {
            this.f299010a = i0Var;
        }

        @Override // ej.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void poll() throws Exception {
            return null;
        }

        @Override // ej.o
        public void clear() {
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f299011b, cVar)) {
                this.f299011b = cVar;
                this.f299010a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f299011b.dispose();
        }

        @Override // ej.o
        public boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f299011b.k();
        }

        @Override // io.reactivex.f
        public void onComplete() {
            this.f299010a.onComplete();
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            this.f299010a.onError(th2);
        }

        @Override // ej.k
        public int p(int i10) {
            return i10 & 2;
        }
    }

    public p0(io.reactivex.i iVar) {
        this.f299009a = iVar;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        this.f299009a.b(new a(i0Var));
    }
}
