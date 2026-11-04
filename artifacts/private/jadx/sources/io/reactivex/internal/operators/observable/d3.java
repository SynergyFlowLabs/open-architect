package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class d3<T> extends io.reactivex.s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.g0<T> f301460a;

    static final class a<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f301461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        io.reactivex.disposables.c f301462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        T f301463c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f301464d;

        a(io.reactivex.v<? super T> vVar) {
            this.f301461a = vVar;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301462b, cVar)) {
                this.f301462b = cVar;
                this.f301461a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301462b.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301462b.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f301464d) {
                return;
            }
            this.f301464d = true;
            T t10 = this.f301463c;
            this.f301463c = null;
            if (t10 == null) {
                this.f301461a.onComplete();
            } else {
                this.f301461a.b(t10);
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f301464d) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f301464d = true;
                this.f301461a.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f301464d) {
                return;
            }
            if (this.f301463c == null) {
                this.f301463c = t10;
                return;
            }
            this.f301464d = true;
            this.f301462b.dispose();
            this.f301461a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }
    }

    public d3(io.reactivex.g0<T> g0Var) {
        this.f301460a = g0Var;
    }

    @Override // io.reactivex.s
    public void s1(io.reactivex.v<? super T> vVar) {
        this.f301460a.a(new a(vVar));
    }
}
