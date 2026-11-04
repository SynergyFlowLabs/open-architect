package io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class e0<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f301485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final TimeUnit f301486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.j0 f301487d;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements Runnable, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f301488e = 6812032969491025141L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final T f301489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f301490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final b<T> f301491c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicBoolean f301492d = new AtomicBoolean();

        a(T t10, long j10, b<T> bVar) {
            this.f301489a = t10;
            this.f301490b = j10;
            this.f301491c = bVar;
        }

        public void a(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.d(this, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return get() == io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f301492d.compareAndSet(false, true)) {
                this.f301491c.a(this.f301490b, this.f301489a, this);
            }
        }
    }

    static final class b<T> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f301494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeUnit f301495c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.j0.c f301496d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.c f301497e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        io.reactivex.disposables.c f301498f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile long f301499g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f301500h;

        b(io.reactivex.i0<? super T> i0Var, long j10, TimeUnit timeUnit, io.reactivex.j0.c cVar) {
            this.f301493a = i0Var;
            this.f301494b = j10;
            this.f301495c = timeUnit;
            this.f301496d = cVar;
        }

        void a(long j10, T t10, a<T> aVar) {
            if (j10 == this.f301499g) {
                this.f301493a.onNext(t10);
                aVar.dispose();
            }
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301497e, cVar)) {
                this.f301497e = cVar;
                this.f301493a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301497e.dispose();
            this.f301496d.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301496d.k();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f301500h) {
                return;
            }
            this.f301500h = true;
            io.reactivex.disposables.c cVar = this.f301498f;
            if (cVar != null) {
                cVar.dispose();
            }
            a aVar = (a) cVar;
            if (aVar != null) {
                aVar.run();
            }
            this.f301493a.onComplete();
            this.f301496d.dispose();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f301500h) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            io.reactivex.disposables.c cVar = this.f301498f;
            if (cVar != null) {
                cVar.dispose();
            }
            this.f301500h = true;
            this.f301493a.onError(th2);
            this.f301496d.dispose();
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            if (this.f301500h) {
                return;
            }
            long j10 = this.f301499g + 1;
            this.f301499g = j10;
            io.reactivex.disposables.c cVar = this.f301498f;
            if (cVar != null) {
                cVar.dispose();
            }
            a aVar = new a(t10, j10, this);
            this.f301498f = aVar;
            aVar.a(this.f301496d.c(aVar, this.f301494b, this.f301495c));
        }
    }

    public e0(io.reactivex.g0<T> g0Var, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var) {
        super(g0Var);
        this.f301485b = j10;
        this.f301486c = timeUnit;
        this.f301487d = j0Var;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new b(new io.reactivex.observers.m(i0Var), this.f301485b, this.f301486c, this.f301487d.c()));
    }
}
