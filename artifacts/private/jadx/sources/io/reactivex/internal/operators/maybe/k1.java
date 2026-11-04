package io.reactivex.internal.operators.maybe;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class k1<T, U> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final org.reactivestreams.u<U> f300858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.y<? extends T> f300859c;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f300860b = 8663801314800248617L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300861a;

        a(io.reactivex.v<? super T> vVar) {
            this.f300861a = vVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f300861a.b(t10);
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this, cVar);
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300861a.onComplete();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300861a.onError(th2);
        }
    }

    static final class b<T, U> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f300862e = -5955289211445418871L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c<T, U> f300864b = new c<>(this);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.y<? extends T> f300865c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final a<T> f300866d;

        b(io.reactivex.v<? super T> vVar, io.reactivex.y<? extends T> yVar) {
            this.f300863a = vVar;
            this.f300865c = yVar;
            this.f300866d = yVar != null ? new a<>(vVar) : null;
        }

        public void a() {
            if (io.reactivex.internal.disposables.d.b(this)) {
                io.reactivex.y<? extends T> yVar = this.f300865c;
                if (yVar == null) {
                    this.f300863a.onError(new TimeoutException());
                } else {
                    yVar.a(this.f300866d);
                }
            }
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            io.reactivex.internal.subscriptions.j.b(this.f300864b);
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (getAndSet(dVar) != dVar) {
                this.f300863a.b(t10);
            }
        }

        public void c(Throwable th2) {
            if (io.reactivex.internal.disposables.d.b(this)) {
                this.f300863a.onError(th2);
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
            io.reactivex.internal.subscriptions.j.b(this.f300864b);
            a<T> aVar = this.f300866d;
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
            io.reactivex.internal.subscriptions.j.b(this.f300864b);
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (getAndSet(dVar) != dVar) {
                this.f300863a.onComplete();
            }
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            io.reactivex.internal.subscriptions.j.b(this.f300864b);
            io.reactivex.internal.disposables.d dVar = io.reactivex.internal.disposables.d.DISPOSED;
            if (getAndSet(dVar) != dVar) {
                this.f300863a.onError(th2);
            } else {
                io.reactivex.plugins.a.Y(th2);
            }
        }
    }

    static final class c<T, U> extends AtomicReference<org.reactivestreams.w> implements io.reactivex.q<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f300867b = 8663801314800248617L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b<T, U> f300868a;

        c(b<T, U> bVar) {
            this.f300868a = bVar;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            io.reactivex.internal.subscriptions.j.o(this, wVar, Long.MAX_VALUE);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f300868a.a();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f300868a.c(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(Object obj) {
            get().cancel();
            this.f300868a.a();
        }
    }

    public k1(io.reactivex.y<T> yVar, org.reactivestreams.u<U> uVar, io.reactivex.y<? extends T> yVar2) {
        super(yVar);
        this.f300858b = uVar;
        this.f300859c = yVar2;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        b bVar = new b(vVar, this.f300859c);
        vVar.d(bVar);
        this.f300858b.e(bVar.f300864b);
        this.f300667a.a(bVar);
    }
}
