package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class f4<T, B> extends io.reactivex.internal.operators.observable.a<T, io.reactivex.b0<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.g0<B> f301562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f301563c;

    static final class a<T, B> extends io.reactivex.observers.e<B> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b<T, B> f301564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f301565c;

        a(b<T, B> bVar) {
            this.f301564b = bVar;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f301565c) {
                return;
            }
            this.f301565c = true;
            this.f301564b.b();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f301565c) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f301565c = true;
                this.f301564b.c(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(B b10) {
            if (this.f301565c) {
                return;
            }
            this.f301564b.e();
        }
    }

    static final class b<T, B> extends AtomicInteger implements io.reactivex.i0<T>, io.reactivex.disposables.c, Runnable {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final long f301566k = 2233020065421370272L;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final Object f301567l = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super io.reactivex.b0<T>> f301568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f301569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final a<T, B> f301570c = new a<>(this);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f301571d = new AtomicReference<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicInteger f301572e = new AtomicInteger(1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.internal.queue.a<Object> f301573f = new io.reactivex.internal.queue.a<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final io.reactivex.internal.util.c f301574g = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicBoolean f301575h = new AtomicBoolean();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f301576i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        io.reactivex.subjects.j<T> f301577j;

        b(io.reactivex.i0<? super io.reactivex.b0<T>> i0Var, int i10) {
            this.f301568a = i0Var;
            this.f301569b = i10;
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.i0<? super io.reactivex.b0<T>> i0Var = this.f301568a;
            io.reactivex.internal.queue.a<Object> aVar = this.f301573f;
            io.reactivex.internal.util.c cVar = this.f301574g;
            int iAddAndGet = 1;
            while (this.f301572e.get() != 0) {
                io.reactivex.subjects.j<T> jVar = this.f301577j;
                boolean z10 = this.f301576i;
                if (z10 && cVar.get() != null) {
                    aVar.clear();
                    Throwable thC = cVar.c();
                    if (jVar != null) {
                        this.f301577j = null;
                        jVar.onError(thC);
                    }
                    i0Var.onError(thC);
                    return;
                }
                Object objPoll = aVar.poll();
                boolean z11 = objPoll == null;
                if (z10 && z11) {
                    Throwable thC2 = cVar.c();
                    if (thC2 == null) {
                        if (jVar != null) {
                            this.f301577j = null;
                            jVar.onComplete();
                        }
                        i0Var.onComplete();
                        return;
                    }
                    if (jVar != null) {
                        this.f301577j = null;
                        jVar.onError(thC2);
                    }
                    i0Var.onError(thC2);
                    return;
                }
                if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != f301567l) {
                    jVar.onNext((T) objPoll);
                } else {
                    if (jVar != null) {
                        this.f301577j = null;
                        jVar.onComplete();
                    }
                    if (!this.f301575h.get()) {
                        io.reactivex.subjects.j<T> jVarO8 = io.reactivex.subjects.j.o8(this.f301569b, this);
                        this.f301577j = jVarO8;
                        this.f301572e.getAndIncrement();
                        i0Var.onNext(jVarO8);
                    }
                }
            }
            aVar.clear();
            this.f301577j = null;
        }

        void b() {
            io.reactivex.internal.disposables.d.b(this.f301571d);
            this.f301576i = true;
            a();
        }

        void c(Throwable th2) {
            io.reactivex.internal.disposables.d.b(this.f301571d);
            if (!this.f301574g.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f301576i = true;
                a();
            }
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.o(this.f301571d, cVar)) {
                e();
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f301575h.compareAndSet(false, true)) {
                this.f301570c.dispose();
                if (this.f301572e.decrementAndGet() == 0) {
                    io.reactivex.internal.disposables.d.b(this.f301571d);
                }
            }
        }

        void e() {
            this.f301573f.offer(f301567l);
            a();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301575h.get();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301570c.dispose();
            this.f301576i = true;
            a();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f301570c.dispose();
            if (!this.f301574g.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f301576i = true;
                a();
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f301573f.offer(t10);
            a();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f301572e.decrementAndGet() == 0) {
                io.reactivex.internal.disposables.d.b(this.f301571d);
            }
        }
    }

    public f4(io.reactivex.g0<T> g0Var, io.reactivex.g0<B> g0Var2, int i10) {
        super(g0Var);
        this.f301562b = g0Var2;
        this.f301563c = i10;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super io.reactivex.b0<T>> i0Var) {
        b bVar = new b(i0Var, this.f301563c);
        i0Var.d(bVar);
        this.f301562b.a(bVar.f301570c);
        this.f301291a.a(bVar);
    }
}
