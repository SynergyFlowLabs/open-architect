package io.reactivex.internal.operators.flowable;

import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class p<T, U extends Collection<? super T>, B> extends io.reactivex.internal.operators.flowable.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final org.reactivestreams.u<B> f299959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Callable<U> f299960d;

    static final class a<T, U extends Collection<? super T>, B> extends io.reactivex.subscribers.b<B> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b<T, U, B> f299961b;

        a(b<T, U, B> bVar) {
            this.f299961b = bVar;
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f299961b.onComplete();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f299961b.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(B b10) {
            this.f299961b.n();
        }
    }

    static final class b<T, U extends Collection<? super T>, B> extends io.reactivex.internal.subscribers.n<T, U, U> implements io.reactivex.q<T>, org.reactivestreams.w, io.reactivex.disposables.c {
        final Callable<U> G3;
        final org.reactivestreams.u<B> H3;
        org.reactivestreams.w I3;
        io.reactivex.disposables.c J3;
        U K3;

        b(org.reactivestreams.v<? super U> vVar, Callable<U> callable, org.reactivestreams.u<B> uVar) {
            super(vVar, new io.reactivex.internal.queue.a());
            this.G3 = callable;
            this.H3 = uVar;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (!this.D3) {
                this.D3 = true;
                this.J3.dispose();
                this.I3.cancel();
                if (b()) {
                    this.C3.clear();
                }
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            cancel();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.D3;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.I3, wVar)) {
                this.I3 = wVar;
                try {
                    this.K3 = (U) io.reactivex.internal.functions.b.g(this.G3.call(), "The buffer supplied is null");
                    a aVar = new a(this);
                    this.J3 = aVar;
                    this.B3.l(this);
                    if (this.D3) {
                        return;
                    }
                    wVar.request(Long.MAX_VALUE);
                    this.H3.e(aVar);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    this.D3 = true;
                    wVar.cancel();
                    io.reactivex.internal.subscriptions.g.c(th2, this.B3);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.subscribers.n, io.reactivex.internal.util.u
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean f(org.reactivestreams.v<? super U> vVar, U u10) {
            this.B3.onNext((Object) u10);
            return true;
        }

        void n() {
            try {
                U u10 = (U) io.reactivex.internal.functions.b.g(this.G3.call(), "The buffer supplied is null");
                synchronized (this) {
                    try {
                        U u11 = this.K3;
                        if (u11 == null) {
                            return;
                        }
                        this.K3 = u10;
                        h(u11, false, this);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                cancel();
                this.B3.onError(th3);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            synchronized (this) {
                try {
                    U u10 = this.K3;
                    if (u10 == null) {
                        return;
                    }
                    this.K3 = null;
                    this.C3.offer(u10);
                    this.E3 = true;
                    if (b()) {
                        io.reactivex.internal.util.v.e(this.C3, this.B3, false, this, this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            cancel();
            this.B3.onError(th2);
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            synchronized (this) {
                try {
                    U u10 = this.K3;
                    if (u10 == null) {
                        return;
                    }
                    u10.add(t10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            j(j10);
        }
    }

    public p(io.reactivex.l<T> lVar, org.reactivestreams.u<B> uVar, Callable<U> callable) {
        super(lVar);
        this.f299959c = uVar;
        this.f299960d = callable;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super U> vVar) {
        this.f299043b.j6(new b(new io.reactivex.subscribers.e(vVar), this.f299960d, this.f299959c));
    }
}
