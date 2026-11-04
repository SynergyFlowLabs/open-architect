package io.reactivex.internal.operators.maybe;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class e0<T, R> extends io.reactivex.internal.operators.maybe.a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.y<? extends R>> f300751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super Throwable, ? extends io.reactivex.y<? extends R>> f300752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Callable<? extends io.reactivex.y<? extends R>> f300753d;

    static final class a<T, R> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f300754f = 4375739915521278546L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super R> f300755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.y<? extends R>> f300756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.o<? super Throwable, ? extends io.reactivex.y<? extends R>> f300757c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Callable<? extends io.reactivex.y<? extends R>> f300758d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.c f300759e;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.maybe.e0$a$a, reason: collision with other inner class name */
        final class C2147a implements io.reactivex.v<R> {
            C2147a() {
            }

            @Override // io.reactivex.v
            public void b(R r10) {
                a.this.f300755a.b(r10);
            }

            @Override // io.reactivex.v
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.o(a.this, cVar);
            }

            @Override // io.reactivex.v
            public void onComplete() {
                a.this.f300755a.onComplete();
            }

            @Override // io.reactivex.v
            public void onError(Throwable th2) {
                a.this.f300755a.onError(th2);
            }
        }

        a(io.reactivex.v<? super R> vVar, dj.o<? super T, ? extends io.reactivex.y<? extends R>> oVar, dj.o<? super Throwable, ? extends io.reactivex.y<? extends R>> oVar2, Callable<? extends io.reactivex.y<? extends R>> callable) {
            this.f300755a = vVar;
            this.f300756b = oVar;
            this.f300757c = oVar2;
            this.f300758d = callable;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            try {
                ((io.reactivex.y) io.reactivex.internal.functions.b.g(this.f300756b.apply(t10), "The onSuccessMapper returned a null MaybeSource")).a(new C2147a());
            } catch (Exception e10) {
                io.reactivex.exceptions.b.b(e10);
                this.f300755a.onError(e10);
            }
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f300759e, cVar)) {
                this.f300759e = cVar;
                this.f300755a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
            this.f300759e.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.v
        public void onComplete() {
            try {
                ((io.reactivex.y) io.reactivex.internal.functions.b.g(this.f300758d.call(), "The onCompleteSupplier returned a null MaybeSource")).a(new C2147a());
            } catch (Exception e10) {
                io.reactivex.exceptions.b.b(e10);
                this.f300755a.onError(e10);
            }
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            try {
                ((io.reactivex.y) io.reactivex.internal.functions.b.g(this.f300757c.apply(th2), "The onErrorMapper returned a null MaybeSource")).a(new C2147a());
            } catch (Exception e10) {
                io.reactivex.exceptions.b.b(e10);
                this.f300755a.onError(new io.reactivex.exceptions.a(th2, e10));
            }
        }
    }

    public e0(io.reactivex.y<T> yVar, dj.o<? super T, ? extends io.reactivex.y<? extends R>> oVar, dj.o<? super Throwable, ? extends io.reactivex.y<? extends R>> oVar2, Callable<? extends io.reactivex.y<? extends R>> callable) {
        super(yVar);
        this.f300751b = oVar;
        this.f300752c = oVar2;
        this.f300753d = callable;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super R> vVar) {
        this.f300667a.a(new a(vVar, this.f300751b, this.f300752c, this.f300753d));
    }
}
