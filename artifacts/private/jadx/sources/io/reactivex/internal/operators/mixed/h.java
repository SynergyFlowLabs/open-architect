package io.reactivex.internal.operators.mixed;

import androidx.compose.animation.core.z1;
import io.reactivex.n0;
import io.reactivex.q0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes10.dex */
public final class h<T, R> extends io.reactivex.l<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.l<T> f301149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends q0<? extends R>> f301150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f301151d;

    static final class a<T, R> extends AtomicInteger implements io.reactivex.q<T>, w {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final long f301152k = -5402190102429853762L;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final C2159a<Object> f301153l = new C2159a<>(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final v<? super R> f301154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends q0<? extends R>> f301155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f301156c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.util.c f301157d = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicLong f301158e = new AtomicLong();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicReference<C2159a<R>> f301159f = new AtomicReference<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        w f301160g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f301161h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f301162i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        long f301163j;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.h$a$a, reason: collision with other inner class name */
        static final class C2159a<R> extends AtomicReference<io.reactivex.disposables.c> implements n0<R> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final long f301164c = 8042919737683345351L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final a<?, R> f301165a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            volatile R f301166b;

            C2159a(a<?, R> aVar) {
                this.f301165a = aVar;
            }

            void a() {
                io.reactivex.internal.disposables.d.b(this);
            }

            @Override // io.reactivex.n0
            public void b(R r10) {
                this.f301166b = r10;
                this.f301165a.b();
            }

            @Override // io.reactivex.n0
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.o(this, cVar);
            }

            @Override // io.reactivex.n0
            public void onError(Throwable th2) {
                this.f301165a.c(this, th2);
            }
        }

        a(v<? super R> vVar, dj.o<? super T, ? extends q0<? extends R>> oVar, boolean z10) {
            this.f301154a = vVar;
            this.f301155b = oVar;
            this.f301156c = z10;
        }

        void a() {
            AtomicReference<C2159a<R>> atomicReference = this.f301159f;
            C2159a<Object> c2159a = f301153l;
            C2159a<R> andSet = atomicReference.getAndSet((C2159a<R>) c2159a);
            if (andSet != null && andSet != c2159a) {
                andSet.a();
            }
        }

        void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            v<? super R> vVar = this.f301154a;
            io.reactivex.internal.util.c cVar = this.f301157d;
            AtomicReference<C2159a<R>> atomicReference = this.f301159f;
            AtomicLong atomicLong = this.f301158e;
            long j10 = this.f301163j;
            int iAddAndGet = 1;
            while (!this.f301162i) {
                if (cVar.get() != null && !this.f301156c) {
                    vVar.onError(cVar.c());
                    return;
                }
                boolean z10 = this.f301161h;
                C2159a<R> c2159a = atomicReference.get();
                boolean z11 = c2159a == null;
                if (z10 && z11) {
                    Throwable thC = cVar.c();
                    if (thC != null) {
                        vVar.onError(thC);
                        return;
                    } else {
                        vVar.onComplete();
                        return;
                    }
                }
                if (z11 || c2159a.f301166b == null || j10 == atomicLong.get()) {
                    this.f301163j = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    z1.a(atomicReference, c2159a, null);
                    vVar.onNext(c2159a.f301166b);
                    j10++;
                }
            }
        }

        void c(C2159a<R> c2159a, Throwable th2) {
            if (!z1.a(this.f301159f, c2159a, null) || !this.f301157d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f301156c) {
                this.f301160g.cancel();
                a();
            }
            b();
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f301162i = true;
            this.f301160g.cancel();
            a();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f301160g, wVar)) {
                this.f301160g = wVar;
                this.f301154a.l(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f301161h = true;
            b();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (!this.f301157d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f301156c) {
                a();
            }
            this.f301161h = true;
            b();
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            C2159a<R> c2159a;
            C2159a<R> c2159a2 = this.f301159f.get();
            if (c2159a2 != null) {
                c2159a2.a();
            }
            try {
                q0 q0Var = (q0) io.reactivex.internal.functions.b.g(this.f301155b.apply(t10), "The mapper returned a null SingleSource");
                C2159a c2159a3 = new C2159a(this);
                do {
                    c2159a = this.f301159f.get();
                    if (c2159a == f301153l) {
                        return;
                    }
                } while (!z1.a(this.f301159f, c2159a, c2159a3));
                q0Var.f(c2159a3);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f301160g.cancel();
                this.f301159f.getAndSet((C2159a<R>) f301153l);
                onError(th2);
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            io.reactivex.internal.util.d.a(this.f301158e, j10);
            b();
        }
    }

    public h(io.reactivex.l<T> lVar, dj.o<? super T, ? extends q0<? extends R>> oVar, boolean z10) {
        this.f301149b = lVar;
        this.f301150c = oVar;
        this.f301151d = z10;
    }

    @Override // io.reactivex.l
    protected void k6(v<? super R> vVar) {
        this.f301149b.j6(new a(vVar, this.f301150c, this.f301151d));
    }
}
