package io.reactivex.internal.operators.maybe;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class j1<T, U> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.y<U> f300843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.y<? extends T> f300844c;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f300845b = 8663801314800248617L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300846a;

        a(io.reactivex.v<? super T> vVar) {
            this.f300846a = vVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f300846a.b(t10);
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this, cVar);
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300846a.onComplete();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300846a.onError(th2);
        }
    }

    static final class b<T, U> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f300847e = -5955289211445418871L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c<T, U> f300849b = new c<>(this);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.y<? extends T> f300850c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final a<T> f300851d;

        b(io.reactivex.v<? super T> vVar, io.reactivex.y<? extends T> yVar) {
            this.f300848a = vVar;
            this.f300850c = yVar;
            this.f300851d = yVar != null ? new a<>(vVar) : null;
        }

        public void a() {
            if (io.reactivex.internal.disposables.d.b(this)) {
                io.reactivex.y<? extends T> yVar = this.f300850c;
                if (yVar == null) {
                    this.f300848a.onError(new TimeoutException());
                } else {
                    yVar.a(this.f300851d);
                }
            }
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            io.reactivex.internal.disposables.d.b(this.f300849b);
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (getAndSet(dVar) != dVar) {
                this.f300848a.b(t10);
            }
        }

        public void c(Throwable th2) {
            if (io.reactivex.internal.disposables.d.b(this)) {
                this.f300848a.onError(th2);
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
            io.reactivex.internal.disposables.d.b(this.f300849b);
            a<T> aVar = this.f300851d;
            if (aVar != null) {
                io.reactivex.internal.disposables.d.b(aVar);
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.v
        public void onComplete() {
            io.reactivex.internal.disposables.d.b(this.f300849b);
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (getAndSet(dVar) != dVar) {
                this.f300848a.onComplete();
            }
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            io.reactivex.internal.disposables.d.b(this.f300849b);
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (getAndSet(dVar) != dVar) {
                this.f300848a.onError(th2);
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }
    }

    static final class c<T, U> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f300852b = 8663801314800248617L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b<T, U> f300853a;

        c(b<T, U> bVar) {
            this.f300853a = bVar;
        }

        @Override // io.reactivex.v
        public void b(Object obj) {
            this.f300853a.a();
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this, cVar);
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300853a.a();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300853a.c(th2);
        }
    }

    public j1(io.reactivex.y<T> yVar, io.reactivex.y<U> yVar2, io.reactivex.y<? extends T> yVar3) {
        super(yVar);
        this.f300843b = yVar2;
        this.f300844c = yVar3;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        b bVar = new b(vVar, this.f300844c);
        vVar.d(bVar);
        this.f300843b.a(bVar.f300849b);
        this.f300667a.a(bVar);
    }
}
