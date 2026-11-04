package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class c1<T> extends io.reactivex.b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final T[] f301414a;

    static final class a<T> extends io.reactivex.internal.observers.c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final T[] f301416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f301417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f301418d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f301419e;

        a(io.reactivex.i0<? super T> i0Var, T[] tArr) {
            this.f301415a = i0Var;
            this.f301416b = tArr;
        }

        void a() {
            T[] tArr = this.f301416b;
            int length = tArr.length;
            for (int i10 = 0; i10 < length && !k(); i10++) {
                T t10 = tArr[i10];
                if (t10 == null) {
                    this.f301415a.onError(new NullPointerException("The " + i10 + "th element is null"));
                    return;
                }
                this.f301415a.onNext(t10);
            }
            if (k()) {
                return;
            }
            this.f301415a.onComplete();
        }

        @Override // ej.o
        public void clear() {
            this.f301417c = this.f301416b.length;
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301419e = true;
        }

        @Override // ej.o
        public boolean isEmpty() {
            return this.f301417c == this.f301416b.length;
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301419e;
        }

        @Override // ej.k
        public int p(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f301418d = true;
            return 1;
        }

        @Override // ej.o
        @cj.g
        public T poll() {
            int i10 = this.f301417c;
            T[] tArr = this.f301416b;
            if (i10 == tArr.length) {
                return null;
            }
            this.f301417c = i10 + 1;
            return (T) io.reactivex.internal.functions.b.g(tArr[i10], "The array element is null");
        }
    }

    public c1(T[] tArr) {
        this.f301414a = tArr;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        a aVar = new a(i0Var, this.f301414a);
        i0Var.d(aVar);
        if (aVar.f301418d) {
            return;
        }
        aVar.a();
    }
}
