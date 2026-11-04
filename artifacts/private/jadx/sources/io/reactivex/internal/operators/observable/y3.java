package io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class y3<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f302628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final TimeUnit f302629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.j0 f302630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.g0<? extends T> f302631e;

    static final class a<T> implements io.reactivex.i0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f302633b;

        a(io.reactivex.i0<? super T> i0Var, AtomicReference<io.reactivex.disposables.c> atomicReference) {
            this.f302632a = i0Var;
            this.f302633b = atomicReference;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.d(this.f302633b, cVar);
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f302632a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f302632a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f302632a.onNext(t10);
        }
    }

    static final class b<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.i0<T>, io.reactivex.disposables.c, d {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f302634i = 3764492702657003550L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f302636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeUnit f302637c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.j0.c f302638d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f302639e = new io.reactivex.internal.disposables.h();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicLong f302640f = new AtomicLong();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f302641g = new AtomicReference<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        io.reactivex.g0<? extends T> f302642h;

        b(io.reactivex.i0<? super T> i0Var, long j10, TimeUnit timeUnit, io.reactivex.j0.c cVar, io.reactivex.g0<? extends T> g0Var) {
            this.f302635a = i0Var;
            this.f302636b = j10;
            this.f302637c = timeUnit;
            this.f302638d = cVar;
            this.f302642h = g0Var;
        }

        @Override // io.reactivex.internal.operators.observable.y3.d
        public void b(long j10) {
            if (this.f302640f.compareAndSet(j10, Long.MAX_VALUE)) {
                io.reactivex.internal.disposables.d.b(this.f302641g);
                io.reactivex.g0<? extends T> g0Var = this.f302642h;
                this.f302642h = null;
                g0Var.a(new a(this.f302635a, this));
                this.f302638d.dispose();
            }
        }

        void c(long j10) {
            this.f302639e.a(this.f302638d.c(new e(j10, this), this.f302636b, this.f302637c));
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this.f302641g, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this.f302641g);
            io.reactivex.internal.disposables.d.b(this);
            this.f302638d.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f302640f.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f302639e.dispose();
                this.f302635a.onComplete();
                this.f302638d.dispose();
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f302640f.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f302639e.dispose();
            this.f302635a.onError(th2);
            this.f302638d.dispose();
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            long j10 = this.f302640f.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (this.f302640f.compareAndSet(j10, j11)) {
                    this.f302639e.get().dispose();
                    this.f302635a.onNext(t10);
                    c(j11);
                }
            }
        }
    }

    static final class c<T> extends AtomicLong implements io.reactivex.i0<T>, io.reactivex.disposables.c, d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f302643g = 3764492702657003550L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f302645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeUnit f302646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.j0.c f302647d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f302648e = new io.reactivex.internal.disposables.h();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f302649f = new AtomicReference<>();

        c(io.reactivex.i0<? super T> i0Var, long j10, TimeUnit timeUnit, io.reactivex.j0.c cVar) {
            this.f302644a = i0Var;
            this.f302645b = j10;
            this.f302646c = timeUnit;
            this.f302647d = cVar;
        }

        @Override // io.reactivex.internal.operators.observable.y3.d
        public void b(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                io.reactivex.internal.disposables.d.b(this.f302649f);
                this.f302644a.onError(new TimeoutException(io.reactivex.internal.util.k.e(this.f302645b, this.f302646c)));
                this.f302647d.dispose();
            }
        }

        void c(long j10) {
            this.f302648e.a(this.f302647d.c(new e(j10, this), this.f302645b, this.f302646c));
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this.f302649f, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this.f302649f);
            this.f302647d.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(this.f302649f.get());
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f302648e.dispose();
                this.f302644a.onComplete();
                this.f302647d.dispose();
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            this.f302648e.dispose();
            this.f302644a.onError(th2);
            this.f302647d.dispose();
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    this.f302648e.get().dispose();
                    this.f302644a.onNext(t10);
                    c(j11);
                }
            }
        }
    }

    interface d {
        void b(long j10);
    }

    static final class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final d f302650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f302651b;

        e(long j10, d dVar) {
            this.f302651b = j10;
            this.f302650a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f302650a.b(this.f302651b);
        }
    }

    public y3(io.reactivex.b0<T> b0Var, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var, io.reactivex.g0<? extends T> g0Var) {
        super(b0Var);
        this.f302628b = j10;
        this.f302629c = timeUnit;
        this.f302630d = j0Var;
        this.f302631e = g0Var;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        if (this.f302631e == null) {
            c cVar = new c(i0Var, this.f302628b, this.f302629c, this.f302630d.c());
            i0Var.d(cVar);
            cVar.c(0L);
            this.f301291a.a(cVar);
            return;
        }
        b bVar = new b(i0Var, this.f302628b, this.f302629c, this.f302630d.c(), this.f302631e);
        i0Var.d(bVar);
        bVar.c(0L);
        this.f301291a.a(bVar);
    }
}
