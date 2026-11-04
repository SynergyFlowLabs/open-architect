package io.reactivex.internal.operators.maybe;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class c0<T, R> extends io.reactivex.l<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.y<T> f300707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends Iterable<? extends R>> f300708c;

    static final class a<T, R> extends io.reactivex.internal.subscriptions.c<R> implements io.reactivex.v<T> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f300709i = -8938804753851907758L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final org.reactivestreams.v<? super R> f300710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.o<? super T, ? extends Iterable<? extends R>> f300711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicLong f300712d = new AtomicLong();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        io.reactivex.disposables.c f300713e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile Iterator<? extends R> f300714f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f300715g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f300716h;

        a(org.reactivestreams.v<? super R> vVar, dj.o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.f300710b = vVar;
            this.f300711c = oVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            try {
                Iterator<? extends R> it = this.f300711c.apply(t10).iterator();
                if (!it.hasNext()) {
                    this.f300710b.onComplete();
                } else {
                    this.f300714f = it;
                    c();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f300710b.onError(th2);
            }
        }

        void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            org.reactivestreams.v<? super R> vVar = this.f300710b;
            Iterator<? extends R> it = this.f300714f;
            if (this.f300716h && it != null) {
                vVar.onNext(null);
                vVar.onComplete();
                return;
            }
            int iAddAndGet = 1;
            while (true) {
                if (it != null) {
                    long j10 = this.f300712d.get();
                    if (j10 == Long.MAX_VALUE) {
                        f(vVar, it);
                        return;
                    }
                    long j11 = 0;
                    while (j11 != j10) {
                        if (this.f300715g) {
                            return;
                        }
                        try {
                            vVar.onNext((Object) io.reactivex.internal.functions.b.g(it.next(), "The iterator returned a null value"));
                            if (this.f300715g) {
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
                        io.reactivex.internal.util.d.e(this.f300712d, j11);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (it == null) {
                    it = this.f300714f;
                }
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f300715g = true;
            this.f300713e.dispose();
            this.f300713e = io.reactivex.internal.disposables.d.DISPOSED;
        }

        @Override // ej.o
        public void clear() {
            this.f300714f = null;
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f300713e, cVar)) {
                this.f300713e = cVar;
                this.f300710b.l(this);
            }
        }

        void f(org.reactivestreams.v<? super R> vVar, Iterator<? extends R> it) {
            while (!this.f300715g) {
                try {
                    vVar.onNext(it.next());
                    if (this.f300715g) {
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
            return this.f300714f == null;
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300710b.onComplete();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300713e = io.reactivex.internal.disposables.d.DISPOSED;
            this.f300710b.onError(th2);
        }

        @Override // ej.k
        public int p(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f300716h = true;
            return 2;
        }

        @Override // ej.o
        @cj.g
        public R poll() throws Exception {
            Iterator<? extends R> it = this.f300714f;
            if (it == null) {
                return null;
            }
            R r10 = (R) io.reactivex.internal.functions.b.g(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f300714f = null;
            }
            return r10;
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10)) {
                io.reactivex.internal.util.d.a(this.f300712d, j10);
                c();
            }
        }
    }

    public c0(io.reactivex.y<T> yVar, dj.o<? super T, ? extends Iterable<? extends R>> oVar) {
        this.f300707b = yVar;
        this.f300708c = oVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super R> vVar) {
        this.f300707b.a(new a(vVar, this.f300708c));
    }
}
