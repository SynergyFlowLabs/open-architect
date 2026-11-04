package io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class v2<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f302450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final TimeUnit f302451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.j0 f302452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f302453e;

    static final class a<T> extends c<T> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f302454i = -7139995637533111443L;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicInteger f302455h;

        a(io.reactivex.i0<? super T> i0Var, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
            super(i0Var, j10, timeUnit, j0Var);
            this.f302455h = new AtomicInteger(1);
        }

        @Override // io.reactivex.internal.operators.observable.v2.c
        void b() {
            c();
            if (this.f302455h.decrementAndGet() == 0) {
                this.f302458a.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f302455h.incrementAndGet() == 2) {
                c();
                if (this.f302455h.decrementAndGet() == 0) {
                    this.f302458a.onComplete();
                }
            }
        }
    }

    static final class b<T> extends c<T> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f302456h = -7139995637533111443L;

        b(io.reactivex.i0<? super T> i0Var, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
            super(i0Var, j10, timeUnit, j0Var);
        }

        @Override // io.reactivex.internal.operators.observable.v2.c
        void b() {
            this.f302458a.onComplete();
        }

        @Override // java.lang.Runnable
        public void run() {
            c();
        }
    }

    static abstract class c<T> extends AtomicReference<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c, Runnable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final long f302457g = -3517602651313910099L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f302459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeUnit f302460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.j0 f302461d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f302462e = new AtomicReference<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        io.reactivex.disposables.c f302463f;

        c(io.reactivex.i0<? super T> i0Var, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
            this.f302458a = i0Var;
            this.f302459b = j10;
            this.f302460c = timeUnit;
            this.f302461d = j0Var;
        }

        void a() {
            io.reactivex.internal.disposables.d.b(this.f302462e);
        }

        abstract void b();

        void c() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f302458a.onNext(andSet);
            }
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302463f, cVar)) {
                this.f302463f = cVar;
                this.f302458a.d(this);
                io.reactivex.j0 j0Var = this.f302461d;
                long j10 = this.f302459b;
                io.reactivex.internal.disposables.d.d(this.f302462e, j0Var.g(this, j10, j10, this.f302460c));
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            a();
            this.f302463f.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302463f.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            a();
            b();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            a();
            this.f302458a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            lazySet(t10);
        }
    }

    public v2(io.reactivex.g0<T> g0Var, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var, boolean z10) {
        super(g0Var);
        this.f302450b = j10;
        this.f302451c = timeUnit;
        this.f302452d = j0Var;
        this.f302453e = z10;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        io.reactivex.observers.m mVar = new io.reactivex.observers.m(i0Var);
        if (this.f302453e) {
            this.f301291a.a(new a(mVar, this.f302450b, this.f302451c, this.f302452d));
        } else {
            this.f301291a.a(new b(mVar, this.f302450b, this.f302451c, this.f302452d));
        }
    }
}
