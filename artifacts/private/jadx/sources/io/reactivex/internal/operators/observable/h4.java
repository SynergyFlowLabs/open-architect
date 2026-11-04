package io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class h4<T, B> extends io.reactivex.internal.operators.observable.a<T, io.reactivex.b0<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<? extends io.reactivex.g0<B>> f301677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f301678c;

    static final class a<T, B> extends io.reactivex.observers.e<B> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b<T, B> f301679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f301680c;

        a(b<T, B> bVar) {
            this.f301679b = bVar;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            if (this.f301680c) {
                return;
            }
            this.f301680c = true;
            this.f301679b.c();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (this.f301680c) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f301680c = true;
                this.f301679b.e(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(B b10) {
            if (this.f301680c) {
                return;
            }
            this.f301680c = true;
            dispose();
            this.f301679b.f(this);
        }
    }

    static final class b<T, B> extends AtomicInteger implements io.reactivex.i0<T>, io.reactivex.disposables.c, Runnable {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final long f301681l = 2233020065421370272L;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final a<Object, Object> f301682m = new a<>(null);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final Object f301683n = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super io.reactivex.b0<T>> f301684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f301685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<a<T, B>> f301686c = new AtomicReference<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicInteger f301687d = new AtomicInteger(1);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final io.reactivex.internal.queue.a<Object> f301688e = new io.reactivex.internal.queue.a<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.internal.util.c f301689f = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final AtomicBoolean f301690g = new AtomicBoolean();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final Callable<? extends io.reactivex.g0<B>> f301691h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        io.reactivex.disposables.c f301692i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        volatile boolean f301693j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        io.reactivex.subjects.j<T> f301694k;

        b(io.reactivex.i0<? super io.reactivex.b0<T>> i0Var, int i10, Callable<? extends io.reactivex.g0<B>> callable) {
            this.f301684a = i0Var;
            this.f301685b = i10;
            this.f301691h = callable;
        }

        void a() {
            AtomicReference<a<T, B>> atomicReference = this.f301686c;
            a<Object, Object> aVar = f301682m;
            a<T, B> andSet = atomicReference.getAndSet((a<T, B>) aVar);
            if (andSet == null || andSet == aVar) {
                return;
            }
            andSet.dispose();
        }

        void b() {
            if (getAndIncrement() == 0) {
                io.reactivex.i0<? super io.reactivex.b0<T>> i0Var = this.f301684a;
                io.reactivex.internal.queue.a<Object> aVar = this.f301688e;
                io.reactivex.internal.util.c cVar = this.f301689f;
                int iAddAndGet = 1;
                while (this.f301687d.get() != 0) {
                    io.reactivex.subjects.j<T> jVar = this.f301694k;
                    boolean z10 = this.f301693j;
                    if (z10 && cVar.get() != null) {
                        aVar.clear();
                        Throwable thC = cVar.c();
                        if (jVar != null) {
                            this.f301694k = null;
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
                                this.f301694k = null;
                                jVar.onComplete();
                            }
                            i0Var.onComplete();
                        } else {
                            if (jVar != null) {
                                this.f301694k = null;
                                jVar.onError(thC2);
                            }
                            i0Var.onError(thC2);
                        }
                    } else if (z11) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                        }
                    } else if (objPoll != f301683n) {
                        jVar.onNext((T) objPoll);
                    } else {
                        if (jVar != null) {
                            this.f301694k = null;
                            jVar.onComplete();
                        }
                        if (!this.f301690g.get()) {
                            io.reactivex.subjects.j<T> jVarO8 = io.reactivex.subjects.j.o8(this.f301685b, this);
                            this.f301694k = jVarO8;
                            this.f301687d.getAndIncrement();
                            try {
                                io.reactivex.g0 g0Var = (io.reactivex.g0) io.reactivex.internal.functions.b.g(this.f301691h.call(), "The other Callable returned a null ObservableSource");
                                a aVar2 = new a(this);
                                if (androidx.compose.animation.core.z1.a(this.f301686c, null, aVar2)) {
                                    g0Var.a(aVar2);
                                    i0Var.onNext(jVarO8);
                                }
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.b.b(th2);
                                cVar.a(th2);
                                this.f301693j = true;
                            }
                        }
                    }
                }
                aVar.clear();
                this.f301694k = null;
            }
        }

        void c() {
            this.f301692i.dispose();
            this.f301693j = true;
            b();
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301692i, cVar)) {
                this.f301692i = cVar;
                this.f301684a.d(this);
                this.f301688e.offer(f301683n);
                b();
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f301690g.compareAndSet(false, true)) {
                a();
                if (this.f301687d.decrementAndGet() == 0) {
                    this.f301692i.dispose();
                }
            }
        }

        void e(Throwable th2) {
            this.f301692i.dispose();
            if (!this.f301689f.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f301693j = true;
                b();
            }
        }

        void f(a<T, B> aVar) {
            androidx.compose.animation.core.z1.a(this.f301686c, aVar, null);
            this.f301688e.offer(f301683n);
            b();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301690g.get();
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            a();
            this.f301693j = true;
            b();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            a();
            if (!this.f301689f.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            int i10 = 0 << 1;
            this.f301693j = true;
            b();
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f301688e.offer(t10);
            b();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f301687d.decrementAndGet() == 0) {
                this.f301692i.dispose();
            }
        }
    }

    public h4(io.reactivex.g0<T> g0Var, Callable<? extends io.reactivex.g0<B>> callable, int i10) {
        super(g0Var);
        this.f301677b = callable;
        this.f301678c = i10;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super io.reactivex.b0<T>> i0Var) {
        this.f301291a.a(new b(i0Var, this.f301678c, this.f301677b));
    }
}
