package io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class h3<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f301661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final TimeUnit f301662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.j0 f301663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f301664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f301665f;

    static final class a<T> extends AtomicInteger implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final long f301666k = -5677354903406201275L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f301668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final TimeUnit f301669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.j0 f301670d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.internal.queue.c<Object> f301671e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final boolean f301672f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        io.reactivex.disposables.c f301673g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f301674h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f301675i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Throwable f301676j;

        a(io.reactivex.i0<? super T> i0Var, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var, int i10, boolean z10) {
            this.f301667a = i0Var;
            this.f301668b = j10;
            this.f301669c = timeUnit;
            this.f301670d = j0Var;
            this.f301671e = new io.reactivex.internal.queue.c<>(i10);
            this.f301672f = z10;
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.i0<? super T> i0Var = this.f301667a;
            io.reactivex.internal.queue.c<Object> cVar = this.f301671e;
            boolean z10 = this.f301672f;
            TimeUnit timeUnit = this.f301669c;
            io.reactivex.j0 j0Var = this.f301670d;
            long j10 = this.f301668b;
            int iAddAndGet = 1;
            while (!this.f301674h) {
                boolean z11 = this.f301675i;
                Long l10 = (Long) cVar.peek();
                boolean z12 = l10 == null;
                long jD = j0Var.d(timeUnit);
                if (!z12 && l10.longValue() > jD - j10) {
                    z12 = true;
                }
                if (z11) {
                    if (!z10) {
                        Throwable th2 = this.f301676j;
                        if (th2 != null) {
                            this.f301671e.clear();
                            i0Var.onError(th2);
                            return;
                        } else if (z12) {
                            i0Var.onComplete();
                            return;
                        }
                    } else if (z12) {
                        Throwable th3 = this.f301676j;
                        if (th3 != null) {
                            i0Var.onError(th3);
                            return;
                        } else {
                            i0Var.onComplete();
                            return;
                        }
                    }
                }
                if (z12) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    cVar.poll();
                    i0Var.onNext(cVar.poll());
                }
            }
            this.f301671e.clear();
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301673g, cVar)) {
                this.f301673g = cVar;
                this.f301667a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f301674h) {
                return;
            }
            this.f301674h = true;
            this.f301673g.dispose();
            if (getAndIncrement() == 0) {
                this.f301671e.clear();
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301674h;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301675i = true;
            a();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301676j = th2;
            this.f301675i = true;
            a();
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f301671e.r(Long.valueOf(this.f301670d.d(this.f301669c)), t10);
            a();
        }
    }

    public h3(io.reactivex.g0<T> g0Var, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var, int i10, boolean z10) {
        super(g0Var);
        this.f301661b = j10;
        this.f301662c = timeUnit;
        this.f301663d = j0Var;
        this.f301664e = i10;
        this.f301665f = z10;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(i0Var, this.f301661b, this.f301662c, this.f301663d, this.f301664e, this.f301665f));
    }
}
