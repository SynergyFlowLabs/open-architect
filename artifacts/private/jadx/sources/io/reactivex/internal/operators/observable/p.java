package io.reactivex.internal.operators.observable;

import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class p<T, U extends Collection<? super T>, B> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g0<B> f302099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Callable<U> f302100c;

    static final class a<T, U extends Collection<? super T>, B> extends io.reactivex.observers.e<B> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b<T, U, B> f302101b;

        a(b<T, U, B> bVar) {
            this.f302101b = bVar;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f302101b.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f302101b.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(B b10) {
            this.f302101b.l();
        }
    }

    static final class b<T, U extends Collection<? super T>, B> extends io.reactivex.internal.observers.v<T, U, U> implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: q3, reason: collision with root package name */
        final Callable<U> f302102q3;

        /* JADX INFO: renamed from: r3, reason: collision with root package name */
        final io.reactivex.g0<B> f302103r3;

        /* JADX INFO: renamed from: s3, reason: collision with root package name */
        io.reactivex.disposables.c f302104s3;

        /* JADX INFO: renamed from: t3, reason: collision with root package name */
        io.reactivex.disposables.c f302105t3;

        /* JADX INFO: renamed from: u3, reason: collision with root package name */
        U f302106u3;

        b(io.reactivex.i0<? super U> i0Var, Callable<U> callable, io.reactivex.g0<B> g0Var) {
            super(i0Var, new io.reactivex.internal.queue.a());
            this.f302102q3 = callable;
            this.f302103r3 = g0Var;
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302104s3, cVar)) {
                this.f302104s3 = cVar;
                try {
                    this.f302106u3 = (U) io.reactivex.internal.functions.b.g(this.f302102q3.call(), "The buffer supplied is null");
                    a aVar = new a(this);
                    this.f302105t3 = aVar;
                    this.f298800l3.d(this);
                    if (!this.f298802n3) {
                        this.f302103r3.a(aVar);
                    }
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    this.f298802n3 = true;
                    cVar.dispose();
                    io.reactivex.internal.disposables.e.l(th2, this.f298800l3);
                }
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f298802n3) {
                return;
            }
            this.f298802n3 = true;
            this.f302105t3.dispose();
            this.f302104s3.dispose();
            if (b()) {
                this.f298801m3.clear();
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
            try {
                U u10 = (U) io.reactivex.internal.functions.b.g(this.f302102q3.call(), "The buffer supplied is null");
                synchronized (this) {
                    try {
                        U u11 = this.f302106u3;
                        if (u11 == null) {
                            return;
                        }
                        this.f302106u3 = u10;
                        h(u11, false, this);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                dispose();
                this.f298800l3.onError(th3);
            }
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            synchronized (this) {
                try {
                    U u10 = this.f302106u3;
                    if (u10 == null) {
                        return;
                    }
                    this.f302106u3 = null;
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
                    U u10 = this.f302106u3;
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

    public p(io.reactivex.g0<T> g0Var, io.reactivex.g0<B> g0Var2, Callable<U> callable) {
        super(g0Var);
        this.f302099b = g0Var2;
        this.f302100c = callable;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super U> i0Var) {
        this.f301291a.a(new b(new io.reactivex.observers.m(i0Var), this.f302100c, this.f302099b));
    }
}
