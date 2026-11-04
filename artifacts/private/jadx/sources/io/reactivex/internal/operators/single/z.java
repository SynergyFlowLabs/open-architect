package io.reactivex.internal.operators.single;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class z<T, R> extends io.reactivex.l<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.q0<T> f303139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends Iterable<? extends R>> f303140c;

    static final class a<T, R> extends io.reactivex.internal.subscriptions.c<R> implements io.reactivex.n0<T> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f303141i = -8938804753851907758L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.v<? super R> f303142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.o<? super T, ? extends Iterable<? extends R>> f303143c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicLong f303144d = new AtomicLong();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.c f303145e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile Iterator<? extends R> f303146f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f303147g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f303148h;

        a(org.reactivestreams.v<? super R> vVar, dj.o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.f303142b = vVar;
            this.f303143c = oVar;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            try {
                Iterator<? extends R> it = this.f303143c.apply(t10).iterator();
                if (!it.hasNext()) {
                    this.f303142b.onComplete();
                } else {
                    this.f303146f = it;
                    c();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f303142b.onError(th2);
            }
        }

        void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.v<? super R> vVar = this.f303142b;
            Iterator<? extends R> it = this.f303146f;
            if (this.f303148h && it != null) {
                vVar.onNext(null);
                vVar.onComplete();
                return;
            }
            int iAddAndGet = 1;
            while (true) {
                if (it != null) {
                    long j10 = this.f303144d.get();
                    if (j10 == Long.MAX_VALUE) {
                        f(vVar, it);
                        return;
                    }
                    long j11 = 0;
                    while (j11 != j10) {
                        if (this.f303147g) {
                            return;
                        }
                        try {
                            vVar.onNext((Object) io.reactivex.internal.functions.b.g(it.next(), "The iterator returned a null value"));
                            if (this.f303147g) {
                                return;
                            }
                            j11++;
                            try {
                                if (!it.hasNext()) {
                                    vVar.onComplete();
                                    return;
                                }
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.b.b(th2);
                                vVar.onError(th2);
                                return;
                            }
                        } catch (Throwable th3) {
                            io.reactivex.exceptions.b.b(th3);
                            vVar.onError(th3);
                            return;
                        }
                    }
                    if (j11 != 0) {
                        io.reactivex.internal.util.d.e(this.f303144d, j11);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (it == null) {
                    it = this.f303146f;
                }
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f303147g = true;
            this.f303145e.dispose();
            this.f303145e = io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // ej.o
        public void clear() {
            this.f303146f = null;
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f303145e, cVar)) {
                this.f303145e = cVar;
                this.f303142b.l(this);
            }
        }

        void f(org.reactivestreams.v<? super R> vVar, Iterator<? extends R> it) {
            while (!this.f303147g) {
                try {
                    vVar.onNext(it.next());
                    if (this.f303147g) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            vVar.onComplete();
                            return;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.b.b(th2);
                        vVar.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    io.reactivex.exceptions.b.b(th3);
                    vVar.onError(th3);
                    return;
                }
            }
        }

        @Override // ej.o
        public boolean isEmpty() {
            return this.f303146f == null;
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            this.f303145e = io.reactivex.internal.disposables.d.DISPOSED;
            this.f303142b.onError(th2);
        }

        @Override // ej.k
        public int p(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f303148h = true;
            return 2;
        }

        @Override // ej.o
        @cj.g
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f303146f;
            if (it == null) {
                return null;
            }
            R r10 = (R) io.reactivex.internal.functions.b.g(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f303146f = null;
            }
            return r10;
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f303144d, j10);
                c();
            }
        }
    }

    public z(io.reactivex.q0<T> q0Var, dj.o<? super T, ? extends Iterable<? extends R>> oVar) {
        this.f303139b = q0Var;
        this.f303140c = oVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super R> vVar) {
        this.f303139b.f(new a(vVar, this.f303140c));
    }
}
