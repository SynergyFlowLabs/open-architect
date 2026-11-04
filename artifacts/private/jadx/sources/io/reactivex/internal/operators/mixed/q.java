package io.reactivex.internal.operators.mixed;

import androidx.compose.animation.core.z1;
import io.reactivex.b0;
import io.reactivex.i0;
import io.reactivex.n0;
import io.reactivex.q0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class q<T, R> extends b0<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b0<T> f301270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends q0<? extends R>> f301271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f301272c;

    static final class a<T, R> extends AtomicInteger implements i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final long f301273i = -5402190102429853762L;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final C2165a<Object> f301274j = new C2165a<>(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final i0<? super R> f301275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends q0<? extends R>> f301276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f301277c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.util.c f301278d = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReference<C2165a<R>> f301279e = new AtomicReference<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        io.reactivex.disposables.c f301280f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        volatile boolean f301281g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f301282h;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.q$a$a, reason: collision with other inner class name */
        static final class C2165a<R> extends AtomicReference<io.reactivex.disposables.c> implements n0<R> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final long f301283c = 8042919737683345351L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final a<?, R> f301284a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            volatile R f301285b;

            C2165a(a<?, R> aVar) {
                this.f301284a = aVar;
            }

            void a() {
                io.reactivex.internal.disposables.d.b(this);
            }

            @Override // io.reactivex.n0
            public void b(R r10) {
                this.f301285b = r10;
                this.f301284a.b();
            }

            @Override // io.reactivex.n0
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.o(this, cVar);
            }

            @Override // io.reactivex.n0
            public void onError(Throwable th2) {
                this.f301284a.c(this, th2);
            }
        }

        a(i0<? super R> i0Var, dj.o<? super T, ? extends q0<? extends R>> oVar, boolean z10) {
            this.f301275a = i0Var;
            this.f301276b = oVar;
            this.f301277c = z10;
        }

        void a() {
            AtomicReference<C2165a<R>> atomicReference = this.f301279e;
            C2165a<Object> c2165a = f301274j;
            C2165a<R> andSet = atomicReference.getAndSet((C2165a<R>) c2165a);
            if (andSet != null && andSet != c2165a) {
                andSet.a();
            }
        }

        void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            i0<? super R> i0Var = this.f301275a;
            io.reactivex.internal.util.c cVar = this.f301278d;
            AtomicReference<C2165a<R>> atomicReference = this.f301279e;
            int iAddAndGet = 1;
            while (!this.f301282h) {
                if (cVar.get() != null && !this.f301277c) {
                    i0Var.onError(cVar.c());
                    return;
                }
                boolean z10 = this.f301281g;
                C2165a<R> c2165a = atomicReference.get();
                boolean z11 = c2165a == null;
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
                if (z11 || c2165a.f301285b == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    z1.a(atomicReference, c2165a, null);
                    i0Var.onNext(c2165a.f301285b);
                }
            }
        }

        void c(C2165a<R> c2165a, Throwable th2) {
            if (!z1.a(this.f301279e, c2165a, null) || !this.f301278d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f301277c) {
                this.f301280f.dispose();
                a();
            }
            b();
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301280f, cVar)) {
                this.f301280f = cVar;
                this.f301275a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301282h = true;
            this.f301280f.dispose();
            a();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301282h;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301281g = true;
            b();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (!this.f301278d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f301277c) {
                a();
            }
            this.f301281g = true;
            b();
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            C2165a<R> c2165a;
            C2165a<R> c2165a2 = this.f301279e.get();
            if (c2165a2 != null) {
                c2165a2.a();
            }
            try {
                q0 q0Var = (q0) io.reactivex.internal.functions.b.g(this.f301276b.apply(t10), "The mapper returned a null SingleSource");
                C2165a c2165a3 = new C2165a(this);
                do {
                    c2165a = this.f301279e.get();
                    if (c2165a == f301274j) {
                        return;
                    }
                } while (!z1.a(this.f301279e, c2165a, c2165a3));
                q0Var.f(c2165a3);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f301280f.dispose();
                this.f301279e.getAndSet((C2165a<R>) f301274j);
                onError(th2);
            }
        }
    }

    public q(b0<T> b0Var, dj.o<? super T, ? extends q0<? extends R>> oVar, boolean z10) {
        this.f301270a = b0Var;
        this.f301271b = oVar;
        this.f301272c = z10;
    }

    @Override // io.reactivex.b0
    protected void H5(i0<? super R> i0Var) {
        if (!r.c(this.f301270a, this.f301271b, i0Var)) {
            this.f301270a.a(new a(i0Var, this.f301271b, this.f301272c));
        }
    }
}
