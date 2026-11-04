package io.reactivex.internal.operators.observable;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class o<T, U extends Collection<? super T>, B> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<? extends io.reactivex.g0<B>> f302039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Callable<U> f302040c;

    static final class a<T, U extends Collection<? super T>, B> extends io.reactivex.observers.e<B> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b<T, U, B> f302041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f302042c;

        a(b<T, U, B> bVar) {
            this.f302041b = bVar;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f302042c) {
                return;
            }
            this.f302042c = true;
            this.f302041b.m();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f302042c) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f302042c = true;
                this.f302041b.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(B b10) {
            if (this.f302042c) {
                return;
            }
            this.f302042c = true;
            dispose();
            this.f302041b.m();
        }
    }

    static final class b<T, U extends Collection<? super T>, B> extends io.reactivex.internal.observers.v<T, U, U> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: q3, reason: collision with root package name */
        final Callable<U> f302043q3;

        /* JADX INFO: renamed from: r3, reason: collision with root package name */
        final Callable<? extends io.reactivex.g0<B>> f302044r3;

        /* JADX INFO: renamed from: s3, reason: collision with root package name */
        io.reactivex.disposables.c f302045s3;

        /* JADX INFO: renamed from: t3, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f302046t3;

        /* JADX INFO: renamed from: u3, reason: collision with root package name */
        U f302047u3;

        b(io.reactivex.i0<? super U> i0Var, Callable<U> callable, Callable<? extends io.reactivex.g0<B>> callable2) {
            super(i0Var, new io.reactivex.internal.queue.a());
            this.f302046t3 = new AtomicReference<>();
            this.f302043q3 = callable;
            this.f302044r3 = callable2;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302045s3, cVar)) {
                this.f302045s3 = cVar;
                io.reactivex.i0<? super V> i0Var = this.f298800l3;
                try {
                    this.f302047u3 = (U) io.reactivex.internal.functions.b.g(this.f302043q3.call(), "The buffer supplied is null");
                    try {
                        io.reactivex.g0 g0Var = (io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f302044r3.call(), "The boundary ObservableSource supplied is null");
                        a aVar = new a(this);
                        this.f302046t3.set(aVar);
                        i0Var.d(this);
                        if (this.f298802n3) {
                            return;
                        }
                        g0Var.a(aVar);
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.b.b(th2);
                        this.f298802n3 = true;
                        cVar.dispose();
                        io.reactivex.internal.disposables.e.l(th2, i0Var);
                    }
                } catch (Throwable th3) {
                    io.reactivex.exceptions.b.b(th3);
                    this.f298802n3 = true;
                    cVar.dispose();
                    io.reactivex.internal.disposables.e.l(th3, i0Var);
                }
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (!this.f298802n3) {
                this.f298802n3 = true;
                this.f302045s3.dispose();
                l();
                if (b()) {
                    this.f298801m3.clear();
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.observers.v, io.reactivex.internal.util.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void f(io.reactivex.i0<? super U> i0Var, U u10) {
            this.f298800l3.onNext((Object) u10);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f298802n3;
        }

        void l() {
            io.reactivex.internal.disposables.d.b(this.f302046t3);
        }

        void m() {
            try {
                U u10 = (U) io.reactivex.internal.functions.b.g(this.f302043q3.call(), "The buffer supplied is null");
                try {
                    io.reactivex.g0 g0Var = (io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f302044r3.call(), "The boundary ObservableSource supplied is null");
                    a aVar = new a(this);
                    if (io.reactivex.internal.disposables.d.d(this.f302046t3, aVar)) {
                        synchronized (this) {
                            try {
                                U u11 = this.f302047u3;
                                if (u11 == null) {
                                    return;
                                }
                                this.f302047u3 = u10;
                                g0Var.a(aVar);
                                h(u11, false, this);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    io.reactivex.exceptions.b.b(th3);
                    this.f298802n3 = true;
                    this.f302045s3.dispose();
                    this.f298800l3.onError(th3);
                }
            } catch (Throwable th4) {
                io.reactivex.exceptions.b.b(th4);
                dispose();
                this.f298800l3.onError(th4);
            }
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            synchronized (this) {
                try {
                    U u10 = this.f302047u3;
                    if (u10 == null) {
                        return;
                    }
                    this.f302047u3 = null;
                    this.f298801m3.offer(u10);
                    this.f298803o3 = true;
                    if (b()) {
                        io.reactivex.internal.util.v.d(this.f298801m3, this.f298800l3, false, this, this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            dispose();
            this.f298800l3.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            synchronized (this) {
                try {
                    U u10 = this.f302047u3;
                    if (u10 == null) {
                        return;
                    }
                    u10.add(t10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public o(io.reactivex.g0<T> g0Var, Callable<? extends io.reactivex.g0<B>> callable, Callable<U> callable2) {
        super(g0Var);
        this.f302039b = callable;
        this.f302040c = callable2;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super U> i0Var) {
        this.f301291a.a(new b(new io.reactivex.observers.m(i0Var), this.f302040c, this.f302039b));
    }
}
