package io.reactivex.internal.operators.flowable;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class o<T, U extends Collection<? super T>, B> extends io.reactivex.internal.operators.flowable.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Callable<? extends org.reactivestreams.u<B>> f299904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Callable<U> f299905d;

    static final class a<T, U extends Collection<? super T>, B> extends io.reactivex.subscribers.b<B> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b<T, U, B> f299906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f299907c;

        a(b<T, U, B> bVar) {
            this.f299906b = bVar;
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299907c) {
                return;
            }
            this.f299907c = true;
            this.f299906b.o();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (this.f299907c) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f299907c = true;
                this.f299906b.onError(th2);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(B b10) {
            if (this.f299907c) {
                return;
            }
            this.f299907c = true;
            b();
            this.f299906b.o();
        }
    }

    static final class b<T, U extends Collection<? super T>, B> extends io.reactivex.internal.subscribers.n<T, U, U> implements io.reactivex.q<T>, org.reactivestreams.w, io.reactivex.disposables.c {
        final Callable<U> G3;
        final Callable<? extends org.reactivestreams.u<B>> H3;
        org.reactivestreams.w I3;
        final AtomicReference<io.reactivex.disposables.c> J3;
        U K3;

        b(org.reactivestreams.v<? super U> vVar, Callable<U> callable, Callable<? extends org.reactivestreams.u<B>> callable2) {
            super(vVar, new io.reactivex.internal.queue.a());
            this.J3 = new AtomicReference<>();
            this.G3 = callable;
            this.H3 = callable2;
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (!this.D3) {
                this.D3 = true;
                this.I3.cancel();
                n();
                if (b()) {
                    this.C3.clear();
                }
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.I3.cancel();
            n();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            if (this.J3.get() != io.reactivex.internal.disposables.d.DISPOSED) {
                return false;
            }
            int i10 = 6 << 1;
            return true;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(org.reactivestreams.w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.I3, wVar)) {
                this.I3 = wVar;
                org.reactivestreams.v<? super V> vVar = this.B3;
                try {
                    this.K3 = (U) io.reactivex.internal.functions.b.g(this.G3.call(), "The buffer supplied is null");
                    try {
                        org.reactivestreams.u uVar = (org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.H3.call(), "The boundary publisher supplied is null");
                        a aVar = new a(this);
                        this.J3.set(aVar);
                        vVar.l(this);
                        if (this.D3) {
                            return;
                        }
                        wVar.request(Long.MAX_VALUE);
                        uVar.e(aVar);
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.b.b(th2);
                        this.D3 = true;
                        wVar.cancel();
                        io.reactivex.internal.subscriptions.g.c(th2, vVar);
                    }
                } catch (Throwable th3) {
                    io.reactivex.exceptions.b.b(th3);
                    this.D3 = true;
                    wVar.cancel();
                    io.reactivex.internal.subscriptions.g.c(th3, vVar);
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
            io.reactivex.internal.disposables.d.b(this.J3);
        }

        void o() {
            try {
                U u10 = (U) io.reactivex.internal.functions.b.g(this.G3.call(), "The buffer supplied is null");
                try {
                    org.reactivestreams.u uVar = (org.reactivestreams.u) io.reactivex.internal.functions.b.g(this.H3.call(), "The boundary publisher supplied is null");
                    a aVar = new a(this);
                    if (io.reactivex.internal.disposables.d.d(this.J3, aVar)) {
                        synchronized (this) {
                            try {
                                U u11 = this.K3;
                                if (u11 == null) {
                                    return;
                                }
                                this.K3 = u10;
                                uVar.e(aVar);
                                h(u11, false, this);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    io.reactivex.exceptions.b.b(th3);
                    this.D3 = true;
                    this.I3.cancel();
                    this.B3.onError(th3);
                }
            } catch (Throwable th4) {
                io.reactivex.exceptions.b.b(th4);
                cancel();
                this.B3.onError(th4);
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
                        boolean z10 = true & false;
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

    public o(io.reactivex.l<T> lVar, Callable<? extends org.reactivestreams.u<B>> callable, Callable<U> callable2) {
        super(lVar);
        this.f299904c = callable;
        this.f299905d = callable2;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super U> vVar) {
        this.f299043b.j6(new b(new io.reactivex.subscribers.e(vVar), this.f299905d, this.f299904c));
    }
}
