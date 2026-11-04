package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class e2<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super Throwable, ? extends io.reactivex.g0<? extends T>> f301504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f301505c;

    static final class a<T> implements io.reactivex.i0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super Throwable, ? extends io.reactivex.g0<? extends T>> f301507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f301508c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f301509d = new io.reactivex.internal.disposables.h();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f301510e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f301511f;

        a(io.reactivex.i0<? super T> i0Var, dj.o<? super Throwable, ? extends io.reactivex.g0<? extends T>> oVar, boolean z10) {
            this.f301506a = i0Var;
            this.f301507b = oVar;
            this.f301508c = z10;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            this.f301509d.a(cVar);
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f301511f) {
                return;
            }
            this.f301511f = true;
            this.f301510e = true;
            this.f301506a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f301510e) {
                if (this.f301511f) {
                    io.reactivex.plugins.a.Y(th2);
                    return;
                } else {
                    this.f301506a.onError(th2);
                    return;
                }
            }
            this.f301510e = true;
            if (this.f301508c && !(th2 instanceof Exception)) {
                this.f301506a.onError(th2);
                return;
            }
            try {
                io.reactivex.g0<? extends T> g0VarApply = this.f301507b.apply(th2);
                if (g0VarApply != null) {
                    g0VarApply.a(this);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("Observable is null");
                nullPointerException.initCause(th2);
                this.f301506a.onError(nullPointerException);
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                this.f301506a.onError(new io.reactivex.exceptions.a(th2, th3));
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f301511f) {
                return;
            }
            this.f301506a.onNext(t10);
        }
    }

    public e2(io.reactivex.g0<T> g0Var, dj.o<? super Throwable, ? extends io.reactivex.g0<? extends T>> oVar, boolean z10) {
        super(g0Var);
        this.f301504b = oVar;
        this.f301505c = z10;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        a aVar = new a(i0Var, this.f301504b, this.f301505c);
        i0Var.d(aVar.f301509d);
        this.f301291a.a(aVar);
    }
}
