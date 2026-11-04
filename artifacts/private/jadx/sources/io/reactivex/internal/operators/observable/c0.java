package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class c0<T> extends io.reactivex.b0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.e0<T> f301406a;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.d0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final long f301407b = -3434801548987643227L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f301408a;

        a(io.reactivex.i0<? super T> i0Var) {
            this.f301408a = i0Var;
        }

        @Override // io.reactivex.d0
        public boolean a(Throwable th2) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (k()) {
                return false;
            }
            try {
                this.f301408a.onError(th2);
                return true;
            } finally {
                dispose();
            }
        }

        @Override // io.reactivex.d0
        public void c(dj.f fVar) {
            d(new io.reactivex.internal.disposables.b(fVar));
        }

        @Override // io.reactivex.d0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.n(this, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.d0, io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.k
        public void onComplete() {
            if (k()) {
                return;
            }
            try {
                this.f301408a.onComplete();
            } finally {
                dispose();
            }
        }

        @Override // io.reactivex.k
        public void onError(Throwable th2) {
            if (!a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            }
        }

        @Override // io.reactivex.k
        public void onNext(T t10) {
            if (t10 == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                if (k()) {
                    return;
                }
                this.f301408a.onNext(t10);
            }
        }

        @Override // io.reactivex.d0
        public io.reactivex.d0<T> serialize() {
            return new b(this);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }
    }

    static final class b<T> extends AtomicInteger implements io.reactivex.d0<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f301409e = 4883307006032401862L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.d0<T> f301410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.internal.util.c f301411b = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.queue.c<T> f301412c = new io.reactivex.internal.queue.c<>(16);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f301413d;

        b(io.reactivex.d0<T> d0Var) {
            this.f301410a = d0Var;
        }

        @Override // io.reactivex.d0
        public boolean a(Throwable th2) {
            if (!this.f301410a.k() && !this.f301413d) {
                if (th2 == null) {
                    th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                if (this.f301411b.a(th2)) {
                    this.f301413d = true;
                    b();
                    return true;
                }
            }
            return false;
        }

        void b() {
            if (getAndIncrement() == 0) {
                e();
            }
        }

        @Override // io.reactivex.d0
        public void c(dj.f fVar) {
            this.f301410a.c(fVar);
        }

        @Override // io.reactivex.d0
        public void d(io.reactivex.disposables.c cVar) {
            this.f301410a.d(cVar);
        }

        void e() {
            io.reactivex.d0<T> d0Var = this.f301410a;
            io.reactivex.internal.queue.c<T> cVar = this.f301412c;
            io.reactivex.internal.util.c cVar2 = this.f301411b;
            int iAddAndGet = 1;
            while (!d0Var.k()) {
                if (cVar2.get() != null) {
                    cVar.clear();
                    d0Var.onError(cVar2.c());
                    return;
                }
                boolean z10 = this.f301413d;
                T tPoll = cVar.poll();
                boolean z11 = tPoll == null;
                if (z10 && z11) {
                    d0Var.onComplete();
                    return;
                } else if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    d0Var.onNext(tPoll);
                }
            }
            cVar.clear();
        }

        @Override // io.reactivex.d0, io.reactivex.disposables.c
        public boolean k() {
            return this.f301410a.k();
        }

        @Override // io.reactivex.k
        public void onComplete() {
            if (!this.f301410a.k() && !this.f301413d) {
                this.f301413d = true;
                b();
            }
        }

        @Override // io.reactivex.k
        public void onError(Throwable th2) {
            if (a(th2)) {
                return;
            }
            io.reactivex.plugins.a.Y(th2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
        
            if (getAndIncrement() != 0) goto L30;
         */
        @Override // io.reactivex.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onNext(T r4) {
            /*
                r3 = this;
                io.reactivex.d0<T> r0 = r3.f301410a
                r2 = 6
                boolean r0 = r0.k()
                r2 = 1
                if (r0 != 0) goto L56
                boolean r0 = r3.f301413d
                if (r0 == 0) goto L10
                r2 = 1
                goto L56
            L10:
                r2 = 0
                if (r4 != 0) goto L1f
                java.lang.NullPointerException r4 = new java.lang.NullPointerException
                java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
                r2 = 7
                r4.<init>(r0)
                r3.onError(r4)
                return
            L1f:
                int r0 = r3.get()
                r2 = 7
                if (r0 != 0) goto L3c
                r0 = 0
                r1 = 1
                boolean r0 = r3.compareAndSet(r0, r1)
                if (r0 == 0) goto L3c
                io.reactivex.d0<T> r0 = r3.f301410a
                r0.onNext(r4)
                int r4 = r3.decrementAndGet()
                r2 = 4
                if (r4 != 0) goto L4e
                r2 = 6
                goto L56
            L3c:
                r2 = 5
                io.reactivex.internal.queue.c<T> r0 = r3.f301412c
                monitor-enter(r0)
                r0.offer(r4)     // Catch: java.lang.Throwable -> L53
                r2 = 3
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
                r2 = 4
                int r4 = r3.getAndIncrement()
                r2 = 6
                if (r4 == 0) goto L4e
                goto L56
            L4e:
                r3.e()
                r2 = 1
                return
            L53:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
                throw r3
            L56:
                r2 = 6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.c0.b.onNext(java.lang.Object):void");
        }

        @Override // io.reactivex.d0
        public io.reactivex.d0<T> serialize() {
            return this;
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public String toString() {
            return this.f301410a.toString();
        }
    }

    public c0(io.reactivex.e0<T> e0Var) {
        this.f301406a = e0Var;
    }

    @Override // io.reactivex.b0
    protected void H5(io.reactivex.i0<? super T> i0Var) {
        a aVar = new a(i0Var);
        i0Var.d(aVar);
        try {
            this.f301406a.a(aVar);
        } catch (Throwable th2) {
            io.reactivex.exceptions.b.b(th2);
            aVar.onError(th2);
        }
    }
}
