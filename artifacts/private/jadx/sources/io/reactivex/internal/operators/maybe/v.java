package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class v<T> extends io.reactivex.k0<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.y<? extends T> f300987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.y<? extends T> f300988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.d<? super T, ? super T> f300989c;

    static final class a<T> extends AtomicInteger implements io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.n0<? super Boolean> f300990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b<T> f300991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final b<T> f300992c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final dj.d<? super T, ? super T> f300993d;

        a(io.reactivex.n0<? super Boolean> n0Var, dj.d<? super T, ? super T> dVar) {
            super(2);
            this.f300990a = n0Var;
            this.f300993d = dVar;
            this.f300991b = new b<>(this);
            this.f300992c = new b<>(this);
        }

        void a() {
            if (decrementAndGet() == 0) {
                Object obj = this.f300991b.f300996b;
                Object obj2 = this.f300992c.f300996b;
                if (obj == null || obj2 == null) {
                    this.f300990a.b(Boolean.valueOf(obj == null && obj2 == null));
                    return;
                }
                try {
                    this.f300990a.b(Boolean.valueOf(this.f300993d.test(obj, obj2)));
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    this.f300990a.onError(th2);
                }
            }
        }

        void b(b<T> bVar, Throwable th2) {
            if (getAndSet(0) <= 0) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            b<T> bVar2 = this.f300991b;
            if (bVar == bVar2) {
                this.f300992c.a();
            } else {
                bVar2.a();
            }
            this.f300990a.onError(th2);
        }

        void c(io.reactivex.y<? extends T> yVar, io.reactivex.y<? extends T> yVar2) {
            yVar.a(this.f300991b);
            yVar2.a(this.f300992c);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300991b.a();
            this.f300992c.a();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(this.f300991b.get());
        }
    }

    static final class b<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f300994c = -3031974433025990931L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a<T> f300995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f300996b;

        b(a<T> aVar) {
            this.f300995a = aVar;
        }

        public void a() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f300996b = t10;
            this.f300995a.a();
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this, cVar);
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300995a.a();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300995a.b(this, th2);
        }
    }

    public v(io.reactivex.y<? extends T> yVar, io.reactivex.y<? extends T> yVar2, dj.d<? super T, ? super T> dVar) {
        this.f300987a = yVar;
        this.f300988b = yVar2;
        this.f300989c = dVar;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super Boolean> n0Var) {
        a aVar = new a(n0Var, this.f300989c);
        n0Var.d(aVar);
        aVar.c(this.f300987a, this.f300988b);
    }
}
