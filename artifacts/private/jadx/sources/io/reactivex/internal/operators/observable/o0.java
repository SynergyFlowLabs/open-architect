package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes10.dex */
public final class o0<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.g<? super T> f302048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.g<? super Throwable> f302049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final dj.a f302050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final dj.a f302051e;

    static final class a<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.g<? super T> f302053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.g<? super Throwable> f302054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final dj.a f302055d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final dj.a f302056e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        io.reactivex.disposables.c f302057f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f302058g;

        a(io.reactivex.i0<? super T> i0Var, dj.g<? super T> gVar, dj.g<? super Throwable> gVar2, dj.a aVar, dj.a aVar2) {
            this.f302052a = i0Var;
            this.f302053b = gVar;
            this.f302054c = gVar2;
            this.f302055d = aVar;
            this.f302056e = aVar2;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302057f, cVar)) {
                this.f302057f = cVar;
                this.f302052a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f302057f.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302057f.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f302058g) {
                return;
            }
            try {
                this.f302055d.run();
                this.f302058g = true;
                this.f302052a.onComplete();
                try {
                    this.f302056e.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                onError(th3);
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f302058g) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f302058g = true;
            try {
                this.f302054c.accept(th2);
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                th2 = new io.reactivex.exceptions.a(th2, th3);
            }
            this.f302052a.onError(th2);
            try {
                this.f302056e.run();
            } catch (Throwable th4) {
                io.reactivex.exceptions.b.b(th4);
                io.reactivex.plugins.a.Y(th4);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f302058g) {
                return;
            }
            try {
                this.f302053b.accept(t10);
                this.f302052a.onNext(t10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f302057f.dispose();
                onError(th2);
            }
        }
    }

    public o0(io.reactivex.g0<T> g0Var, dj.g<? super T> gVar, dj.g<? super Throwable> gVar2, dj.a aVar, dj.a aVar2) {
        super(g0Var);
        this.f302048b = gVar;
        this.f302049c = gVar2;
        this.f302050d = aVar;
        this.f302051e = aVar2;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(i0Var, this.f302048b, this.f302049c, this.f302050d, this.f302051e));
    }
}
