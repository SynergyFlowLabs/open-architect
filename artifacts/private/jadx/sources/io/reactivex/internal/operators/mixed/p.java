package io.reactivex.internal.operators.mixed;

import androidx.compose.animation.core.z1;
import io.reactivex.b0;
import io.reactivex.i0;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class p<T, R> extends b0<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b0<T> f301254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends y<? extends R>> f301255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f301256c;

    static final class a<T, R> extends AtomicInteger implements i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f301257i = -5402190102429853762L;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final C2164a<Object> f301258j = new C2164a<>(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final i0<? super R> f301259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends y<? extends R>> f301260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f301261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.util.c f301262d = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReference<C2164a<R>> f301263e = new AtomicReference<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        io.reactivex.disposables.c f301264f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f301265g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f301266h;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.p$a$a, reason: collision with other inner class name */
        static final class C2164a<R> extends AtomicReference<io.reactivex.disposables.c> implements v<R> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final long f301267c = 8042919737683345351L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final a<?, R> f301268a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            volatile R f301269b;

            C2164a(a<?, R> aVar) {
                this.f301268a = aVar;
            }

            void a() {
                io.reactivex.internal.disposables.d.b(this);
            }

            @Override // io.reactivex.v
            public void b(R r10) {
                this.f301269b = r10;
                this.f301268a.b();
            }

            @Override // io.reactivex.v
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.o(this, cVar);
            }

            @Override // io.reactivex.v
            public void onComplete() {
                this.f301268a.c(this);
            }

            @Override // io.reactivex.v
            public void onError(Throwable th2) {
                this.f301268a.e(this, th2);
            }
        }

        a(i0<? super R> i0Var, dj.o<? super T, ? extends y<? extends R>> oVar, boolean z10) {
            this.f301259a = i0Var;
            this.f301260b = oVar;
            this.f301261c = z10;
        }

        void a() {
            AtomicReference<C2164a<R>> atomicReference = this.f301263e;
            C2164a<Object> c2164a = f301258j;
            C2164a<R> andSet = atomicReference.getAndSet((C2164a<R>) c2164a);
            if (andSet != null && andSet != c2164a) {
                andSet.a();
            }
        }

        void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            i0<? super R> i0Var = this.f301259a;
            io.reactivex.internal.util.c cVar = this.f301262d;
            AtomicReference<C2164a<R>> atomicReference = this.f301263e;
            int iAddAndGet = 1;
            while (!this.f301266h) {
                if (cVar.get() != null && !this.f301261c) {
                    i0Var.onError(cVar.c());
                    return;
                }
                boolean z10 = this.f301265g;
                C2164a<R> c2164a = atomicReference.get();
                boolean z11 = c2164a == null;
                if (z10 && z11) {
                    Throwable thC = cVar.c();
                    if (thC != null) {
                        i0Var.onError(thC);
                        return;
                    } else {
                        i0Var.onComplete();
                        return;
                    }
                }
                if (z11 || c2164a.f301269b == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    z1.a(atomicReference, c2164a, null);
                    i0Var.onNext(c2164a.f301269b);
                }
            }
        }

        void c(C2164a<R> c2164a) {
            if (z1.a(this.f301263e, c2164a, null)) {
                b();
            }
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301264f, cVar)) {
                this.f301264f = cVar;
                this.f301259a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301266h = true;
            this.f301264f.dispose();
            a();
        }

        void e(C2164a<R> c2164a, Throwable th2) {
            if (!z1.a(this.f301263e, c2164a, null) || !this.f301262d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f301261c) {
                this.f301264f.dispose();
                a();
            }
            b();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301266h;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301265g = true;
            b();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (!this.f301262d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f301261c) {
                a();
            }
            this.f301265g = true;
            b();
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            C2164a<R> c2164a;
            C2164a<R> c2164a2 = this.f301263e.get();
            if (c2164a2 != null) {
                c2164a2.a();
            }
            try {
                y yVar = (y) io.reactivex.internal.functions.b.g(this.f301260b.apply(t10), "The mapper returned a null MaybeSource");
                C2164a c2164a3 = new C2164a(this);
                do {
                    c2164a = this.f301263e.get();
                    if (c2164a == f301258j) {
                        return;
                    }
                } while (!z1.a(this.f301263e, c2164a, c2164a3));
                yVar.a(c2164a3);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f301264f.dispose();
                this.f301263e.getAndSet((C2164a<R>) f301258j);
                onError(th2);
            }
        }
    }

    public p(b0<T> b0Var, dj.o<? super T, ? extends y<? extends R>> oVar, boolean z10) {
        this.f301254a = b0Var;
        this.f301255b = oVar;
        this.f301256c = z10;
    }

    @Override // io.reactivex.b0
    protected void H5(i0<? super R> i0Var) {
        if (!r.b(this.f301254a, this.f301255b, i0Var)) {
            this.f301254a.a(new a(i0Var, this.f301255b, this.f301256c));
        }
    }
}
