package io.reactivex.internal.operators.mixed;

import androidx.compose.animation.core.z1;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes10.dex */
public final class g<T, R> extends io.reactivex.l<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.l<T> f301131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final dj.o<? super T, ? extends y<? extends R>> f301132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f301133d;

    static final class a<T, R> extends AtomicInteger implements io.reactivex.q<T>, w {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final long f301134k = -5402190102429853762L;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final C2158a<Object> f301135l = new C2158a<>(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final v<? super R> f301136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends y<? extends R>> f301137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f301138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.util.c f301139d = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicLong f301140e = new AtomicLong();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final AtomicReference<C2158a<R>> f301141f = new AtomicReference<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        w f301142g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f301143h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f301144i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        long f301145j;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.g$a$a, reason: collision with other inner class name */
        static final class C2158a<R> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<R> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final long f301146c = 8042919737683345351L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final a<?, R> f301147a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            volatile R f301148b;

            C2158a(a<?, R> aVar) {
                this.f301147a = aVar;
            }

            void a() {
                io.reactivex.internal.disposables.d.b(this);
            }

            @Override // io.reactivex.v
            public void b(R r10) {
                this.f301148b = r10;
                this.f301147a.b();
            }

            @Override // io.reactivex.v
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.o(this, cVar);
            }

            @Override // io.reactivex.v
            public void onComplete() {
                this.f301147a.c(this);
            }

            @Override // io.reactivex.v
            public void onError(Throwable th2) {
                this.f301147a.d(this, th2);
            }
        }

        a(v<? super R> vVar, dj.o<? super T, ? extends y<? extends R>> oVar, boolean z10) {
            this.f301136a = vVar;
            this.f301137b = oVar;
            this.f301138c = z10;
        }

        void a() {
            AtomicReference<C2158a<R>> atomicReference = this.f301141f;
            C2158a<Object> c2158a = f301135l;
            C2158a<R> andSet = atomicReference.getAndSet((C2158a<R>) c2158a);
            if (andSet == null || andSet == c2158a) {
                return;
            }
            andSet.a();
        }

        void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            v<? super R> vVar = this.f301136a;
            io.reactivex.internal.util.c cVar = this.f301139d;
            AtomicReference<C2158a<R>> atomicReference = this.f301141f;
            AtomicLong atomicLong = this.f301140e;
            long j10 = this.f301145j;
            int iAddAndGet = 1;
            while (!this.f301144i) {
                if (cVar.get() != null && !this.f301138c) {
                    vVar.onError(cVar.c());
                    return;
                }
                boolean z10 = this.f301143h;
                C2158a<R> c2158a = atomicReference.get();
                boolean z11 = c2158a == null;
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
                if (z11 || c2158a.f301148b == null || j10 == atomicLong.get()) {
                    this.f301145j = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    z1.a(atomicReference, c2158a, null);
                    vVar.onNext(c2158a.f301148b);
                    j10++;
                }
            }
        }

        void c(C2158a<R> c2158a) {
            if (z1.a(this.f301141f, c2158a, null)) {
                b();
            }
        }

        @Override // org.reactivestreams.w
        public void cancel() {
            this.f301144i = true;
            this.f301142g.cancel();
            a();
        }

        void d(C2158a<R> c2158a, Throwable th2) {
            if (!z1.a(this.f301141f, c2158a, null) || !this.f301139d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f301138c) {
                this.f301142g.cancel();
                a();
            }
            b();
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f301142g, wVar)) {
                this.f301142g = wVar;
                this.f301136a.l(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f301143h = true;
            b();
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (!this.f301139d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (!this.f301138c) {
                a();
            }
            this.f301143h = true;
            b();
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            C2158a<R> c2158a;
            C2158a<R> c2158a2 = this.f301141f.get();
            if (c2158a2 != null) {
                c2158a2.a();
            }
            try {
                y yVar = (y) io.reactivex.internal.functions.b.g(this.f301137b.apply(t10), "The mapper returned a null MaybeSource");
                C2158a c2158a3 = new C2158a(this);
                do {
                    c2158a = this.f301141f.get();
                    if (c2158a == f301135l) {
                        return;
                    }
                } while (!z1.a(this.f301141f, c2158a, c2158a3));
                yVar.a(c2158a3);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f301142g.cancel();
                this.f301141f.getAndSet((C2158a<R>) f301135l);
                onError(th2);
            }
        }

        @Override // org.reactivestreams.w
        public void request(long j10) {
            io.reactivex.internal.util.d.a(this.f301140e, j10);
            b();
        }
    }

    public g(io.reactivex.l<T> lVar, dj.o<? super T, ? extends y<? extends R>> oVar, boolean z10) {
        this.f301131b = lVar;
        this.f301132c = oVar;
        this.f301133d = z10;
    }

    @Override // io.reactivex.l
    protected void k6(v<? super R> vVar) {
        this.f301131b.j6(new a(vVar, this.f301132c, this.f301133d));
    }
}
