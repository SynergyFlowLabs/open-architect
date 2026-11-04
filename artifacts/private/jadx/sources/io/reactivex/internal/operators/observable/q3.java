package io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public final class q3<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f302192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f302193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimeUnit f302194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.j0 f302195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f302196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f302197g;

    static final class a<T> extends AtomicBoolean implements io.reactivex.i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final long f302198k = -5677354903406201275L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f302200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f302201c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final TimeUnit f302202d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.j0 f302203e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.internal.queue.c<Object> f302204f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final boolean f302205g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        io.reactivex.disposables.c f302206h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f302207i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Throwable f302208j;

        a(io.reactivex.i0<? super T> i0Var, long j10, long j11, TimeUnit timeUnit, io.reactivex.j0 j0Var, int i10, boolean z10) {
            this.f302199a = i0Var;
            this.f302200b = j10;
            this.f302201c = j11;
            this.f302202d = timeUnit;
            this.f302203e = j0Var;
            this.f302204f = new io.reactivex.internal.queue.c<>(i10);
            this.f302205g = z10;
        }

        void a() {
            Throwable th2;
            if (compareAndSet(false, true)) {
                io.reactivex.i0<? super T> i0Var = this.f302199a;
                io.reactivex.internal.queue.c<Object> cVar = this.f302204f;
                boolean z10 = this.f302205g;
                while (!this.f302207i) {
                    if (!z10 && (th2 = this.f302208j) != null) {
                        cVar.clear();
                        i0Var.onError(th2);
                        return;
                    }
                    Object objPoll = cVar.poll();
                    if (objPoll == null) {
                        Throwable th3 = this.f302208j;
                        if (th3 != null) {
                            i0Var.onError(th3);
                            return;
                        } else {
                            i0Var.onComplete();
                            return;
                        }
                    }
                    Object objPoll2 = cVar.poll();
                    if (((Long) objPoll).longValue() >= this.f302203e.d(this.f302202d) - this.f302201c) {
                        i0Var.onNext(objPoll2);
                    }
                }
                cVar.clear();
            }
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f302206h, cVar)) {
                this.f302206h = cVar;
                this.f302199a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f302207i) {
                return;
            }
            this.f302207i = true;
            this.f302206h.dispose();
            if (compareAndSet(false, true)) {
                this.f302204f.clear();
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f302207i;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            a();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f302208j = th2;
            a();
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            io.reactivex.internal.queue.c<Object> cVar = this.f302204f;
            long jD = this.f302203e.d(this.f302202d);
            long j10 = this.f302201c;
            long j11 = this.f302200b;
            boolean z10 = j11 == Long.MAX_VALUE;
            cVar.r(Long.valueOf(jD), t10);
            while (!cVar.isEmpty()) {
                if (((Long) cVar.peek()).longValue() > jD - j10 && (z10 || (cVar.m() >> 1) <= j11)) {
                    return;
                }
                cVar.poll();
                cVar.poll();
            }
        }
    }

    public q3(io.reactivex.g0<T> g0Var, long j10, long j11, TimeUnit timeUnit, io.reactivex.j0 j0Var, int i10, boolean z10) {
        super(g0Var);
        this.f302192b = j10;
        this.f302193c = j11;
        this.f302194d = timeUnit;
        this.f302195e = j0Var;
        this.f302196f = i10;
        this.f302197g = z10;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        this.f301291a.a(new a(i0Var, this.f302192b, this.f302193c, this.f302194d, this.f302195e, this.f302196f, this.f302197g));
    }
}
