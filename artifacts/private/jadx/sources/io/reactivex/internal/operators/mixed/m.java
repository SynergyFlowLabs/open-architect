package io.reactivex.internal.operators.mixed;

import io.reactivex.b0;
import io.reactivex.i0;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class m<T, R> extends b0<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b0<T> f301199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends y<? extends R>> f301200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.internal.util.j f301201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f301202d;

    static final class a<T, R> extends AtomicInteger implements i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final long f301203l = -9140123220065488293L;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final int f301204m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final int f301205n = 1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final int f301206o = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final i0<? super R> f301207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends y<? extends R>> f301208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.internal.util.c f301209c = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final C2161a<R> f301210d = new C2161a<>(this);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final ej.n<T> f301211e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final io.reactivex.internal.util.j f301212f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        io.reactivex.disposables.c f301213g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f301214h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f301215i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        R f301216j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        volatile int f301217k;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.m$a$a, reason: collision with other inner class name */
        static final class C2161a<R> extends AtomicReference<io.reactivex.disposables.c> implements v<R> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f301218b = -3051469169682093892L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final a<?, R> f301219a;

            C2161a(a<?, R> aVar) {
                this.f301219a = aVar;
            }

            void a() {
                io.reactivex.internal.disposables.d.b(this);
            }

            @Override // io.reactivex.v
            public void b(R r10) {
                this.f301219a.e(r10);
            }

            @Override // io.reactivex.v
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.d(this, cVar);
            }

            @Override // io.reactivex.v
            public void onComplete() {
                this.f301219a.b();
            }

            @Override // io.reactivex.v
            public void onError(Throwable th2) {
                this.f301219a.c(th2);
            }
        }

        a(i0<? super R> i0Var, dj.o<? super T, ? extends y<? extends R>> oVar, int i10, io.reactivex.internal.util.j jVar) {
            this.f301207a = i0Var;
            this.f301208b = oVar;
            this.f301212f = jVar;
            this.f301211e = new io.reactivex.internal.queue.c(i10);
        }

        void a() {
            if (getAndIncrement() == 0) {
                i0<? super R> i0Var = this.f301207a;
                io.reactivex.internal.util.j jVar = this.f301212f;
                ej.n<T> nVar = this.f301211e;
                io.reactivex.internal.util.c cVar = this.f301209c;
                int iAddAndGet = 1;
                while (true) {
                    if (!this.f301215i) {
                        int i10 = this.f301217k;
                        if (cVar.get() != null && (jVar == io.reactivex.internal.util.j.IMMEDIATE || (jVar == io.reactivex.internal.util.j.BOUNDARY && i10 == 0))) {
                            break;
                        }
                        if (i10 == 0) {
                            boolean z10 = this.f301214h;
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
                                    y yVar = (y) io.reactivex.internal.functions.b.g(this.f301208b.apply(tPoll), "The mapper returned a null MaybeSource");
                                    this.f301217k = 1;
                                    yVar.a(this.f301210d);
                                } catch (Throwable th2) {
                                    io.reactivex.exceptions.b.b(th2);
                                    this.f301213g.dispose();
                                    nVar.clear();
                                    cVar.a(th2);
                                    i0Var.onError(cVar.c());
                                    return;
                                }
                            }
                        } else if (i10 == 2) {
                            R r10 = this.f301216j;
                            this.f301216j = null;
                            i0Var.onNext(r10);
                            this.f301217k = 0;
                        }
                    } else {
                        nVar.clear();
                        this.f301216j = null;
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                    }
                }
                nVar.clear();
                this.f301216j = null;
                i0Var.onError(cVar.c());
            }
        }

        void b() {
            this.f301217k = 0;
            a();
        }

        void c(Throwable th2) {
            if (!this.f301209c.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f301212f != io.reactivex.internal.util.j.END) {
                this.f301213g.dispose();
            }
            this.f301217k = 0;
            a();
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301213g, cVar)) {
                this.f301213g = cVar;
                this.f301207a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301215i = true;
            this.f301213g.dispose();
            this.f301210d.a();
            if (getAndIncrement() == 0) {
                this.f301211e.clear();
                this.f301216j = null;
            }
        }

        void e(R r10) {
            this.f301216j = r10;
            this.f301217k = 2;
            a();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301215i;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301214h = true;
            a();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (!this.f301209c.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f301212f == io.reactivex.internal.util.j.IMMEDIATE) {
                this.f301210d.a();
            }
            this.f301214h = true;
            a();
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f301211e.offer(t10);
            a();
        }
    }

    public m(b0<T> b0Var, dj.o<? super T, ? extends y<? extends R>> oVar, io.reactivex.internal.util.j jVar, int i10) {
        this.f301199a = b0Var;
        this.f301200b = oVar;
        this.f301201c = jVar;
        this.f301202d = i10;
    }

    @Override // io.reactivex.b0
    protected void H5(i0<? super R> i0Var) {
        if (r.b(this.f301199a, this.f301200b, i0Var)) {
            return;
        }
        this.f301199a.a(new a(i0Var, this.f301200b, this.f301202d, this.f301201c));
    }
}
