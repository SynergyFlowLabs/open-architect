package io.reactivex.internal.operators.mixed;

import io.reactivex.b0;
import io.reactivex.i0;
import io.reactivex.n0;
import io.reactivex.q0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class n<T, R> extends b0<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b0<T> f301220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends q0<? extends R>> f301221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.internal.util.j f301222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f301223d;

    static final class a<T, R> extends AtomicInteger implements i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final long f301224l = -9140123220065488293L;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final int f301225m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final int f301226n = 1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final int f301227o = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final i0<? super R> f301228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends q0<? extends R>> f301229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.util.c f301230c = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final C2162a<R> f301231d = new C2162a<>(this);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final ej.n<T> f301232e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.internal.util.j f301233f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        io.reactivex.disposables.c f301234g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f301235h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f301236i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        R f301237j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile int f301238k;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.n$a$a, reason: collision with other inner class name */
        static final class C2162a<R> extends AtomicReference<io.reactivex.disposables.c> implements n0<R> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f301239b = -3051469169682093892L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final a<?, R> f301240a;

            C2162a(a<?, R> aVar) {
                this.f301240a = aVar;
            }

            void a() {
                io.reactivex.internal.disposables.d.b(this);
            }

            @Override // io.reactivex.n0
            public void b(R r10) {
                this.f301240a.c(r10);
            }

            @Override // io.reactivex.n0
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.d(this, cVar);
            }

            @Override // io.reactivex.n0
            public void onError(Throwable th2) {
                this.f301240a.b(th2);
            }
        }

        a(i0<? super R> i0Var, dj.o<? super T, ? extends q0<? extends R>> oVar, int i10, io.reactivex.internal.util.j jVar) {
            this.f301228a = i0Var;
            this.f301229b = oVar;
            this.f301233f = jVar;
            this.f301232e = new io.reactivex.internal.queue.c(i10);
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            i0<? super R> i0Var = this.f301228a;
            io.reactivex.internal.util.j jVar = this.f301233f;
            ej.n<T> nVar = this.f301232e;
            io.reactivex.internal.util.c cVar = this.f301230c;
            int iAddAndGet = 1;
            while (true) {
                if (!this.f301236i) {
                    int i10 = this.f301238k;
                    if (cVar.get() != null && (jVar == io.reactivex.internal.util.j.IMMEDIATE || (jVar == io.reactivex.internal.util.j.BOUNDARY && i10 == 0))) {
                        break;
                    }
                    if (i10 == 0) {
                        boolean z10 = this.f301235h;
                        T tPoll = nVar.poll();
                        boolean z11 = tPoll == null;
                        if (z10 && z11) {
                            Throwable thC = cVar.c();
                            if (thC == null) {
                                i0Var.onComplete();
                                return;
                            } else {
                                i0Var.onError(thC);
                                return;
                            }
                        }
                        if (!z11) {
                            try {
                                q0 q0Var = (q0) io.reactivex.internal.functions.b.g(this.f301229b.apply(tPoll), "The mapper returned a null SingleSource");
                                this.f301238k = 1;
                                q0Var.f(this.f301231d);
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.b.b(th2);
                                this.f301234g.dispose();
                                nVar.clear();
                                cVar.a(th2);
                                i0Var.onError(cVar.c());
                                return;
                            }
                        }
                    } else if (i10 == 2) {
                        R r10 = this.f301237j;
                        this.f301237j = null;
                        i0Var.onNext(r10);
                        this.f301238k = 0;
                    }
                } else {
                    nVar.clear();
                    this.f301237j = null;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            nVar.clear();
            this.f301237j = null;
            i0Var.onError(cVar.c());
        }

        void b(Throwable th2) {
            if (!this.f301230c.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f301233f != io.reactivex.internal.util.j.END) {
                this.f301234g.dispose();
            }
            this.f301238k = 0;
            a();
        }

        void c(R r10) {
            this.f301237j = r10;
            this.f301238k = 2;
            a();
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301234g, cVar)) {
                this.f301234g = cVar;
                this.f301228a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301236i = true;
            this.f301234g.dispose();
            this.f301231d.a();
            if (getAndIncrement() == 0) {
                this.f301232e.clear();
                this.f301237j = null;
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301236i;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301235h = true;
            a();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (!this.f301230c.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f301233f == io.reactivex.internal.util.j.IMMEDIATE) {
                this.f301231d.a();
            }
            this.f301235h = true;
            a();
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f301232e.offer(t10);
            a();
        }
    }

    public n(b0<T> b0Var, dj.o<? super T, ? extends q0<? extends R>> oVar, io.reactivex.internal.util.j jVar, int i10) {
        this.f301220a = b0Var;
        this.f301221b = oVar;
        this.f301222c = jVar;
        this.f301223d = i10;
    }

    @Override // io.reactivex.b0
    protected void H5(i0<? super R> i0Var) {
        if (r.c(this.f301220a, this.f301221b, i0Var)) {
            return;
        }
        this.f301220a.a(new a(i0Var, this.f301221b, this.f301223d, this.f301222c));
    }
}
