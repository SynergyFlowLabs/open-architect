package io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class m1<T, S> extends io.reactivex.l<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<S> f299755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.c<S, io.reactivex.k<T>, S> f299756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final dj.g<? super S> f299757d;

    static final class a<T, S> extends AtomicLong implements io.reactivex.k<T>, org.reactivestreams.w {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f299758h = 7565982551505011832L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.v<? super T> f299759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.c<S, ? super io.reactivex.k<T>, S> f299760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final dj.g<? super S> f299761c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        S f299762d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f299763e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f299764f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f299765g;

        a(org.reactivestreams.v<? super T> vVar, dj.c<S, ? super io.reactivex.k<T>, S> cVar, dj.g<? super S> gVar, S s10) {
            this.f299759a = vVar;
            this.f299760b = cVar;
            this.f299761c = gVar;
            this.f299762d = s10;
        }

        private void b(S s10) {
            try {
                this.f299761c.accept(s10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            if (!this.f299763e) {
                this.f299763e = true;
                if (io.reactivex.internal.util.d.a(this, 1L) == 0) {
                    S s10 = this.f299762d;
                    this.f299762d = null;
                    b(s10);
                }
            }
        }

        @Override // io.reactivex.k
        public void onComplete() {
            if (this.f299764f) {
                return;
            }
            this.f299764f = true;
            this.f299759a.onComplete();
        }

        @Override // io.reactivex.k
        public void onError(Throwable th2) {
            if (this.f299764f) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f299764f = true;
            this.f299759a.onError(th2);
        }

        @Override // io.reactivex.k
        public void onNext(T t10) {
            if (this.f299764f) {
                return;
            }
            if (this.f299765g) {
                onError(new IllegalStateException("onNext already called in this generate turn"));
            } else if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.f299765g = true;
                this.f299759a.onNext(t10);
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            if (io.reactivex.internal.subscriptions.j.p(j10) && io.reactivex.internal.util.d.a(this, j10) == 0) {
                S sApply = this.f299762d;
                dj.c<S, ? super io.reactivex.k<T>, S> cVar = this.f299760b;
                do {
                    long j11 = 0;
                    while (true) {
                        if (j11 == j10) {
                            j10 = get();
                            if (j11 == j10) {
                                break;
                            }
                        } else {
                            if (this.f299763e) {
                                this.f299762d = null;
                                b(sApply);
                                return;
                            }
                            this.f299765g = false;
                            try {
                                sApply = cVar.apply(sApply, this);
                                if (this.f299764f) {
                                    this.f299763e = true;
                                    this.f299762d = null;
                                    b(sApply);
                                    return;
                                }
                                j11++;
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.b.b(th2);
                                this.f299763e = true;
                                this.f299762d = null;
                                onError(th2);
                                b(sApply);
                                return;
                            }
                        }
                    }
                    this.f299762d = sApply;
                    j10 = addAndGet(-j11);
                } while (j10 != 0);
            }
        }
    }

    public m1(Callable<S> callable, dj.c<S, io.reactivex.k<T>, S> cVar, dj.g<? super S> gVar) {
        this.f299755b = callable;
        this.f299756c = cVar;
        this.f299757d = gVar;
    }

    @Override // io.reactivex.l
    public void k6(org.reactivestreams.v<? super T> vVar) {
        try {
            vVar.l(new a(vVar, this.f299756c, this.f299757d, this.f299755b.call()));
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            io.reactivex.internal.subscriptions.g.c(th2, vVar);
        }
    }
}
