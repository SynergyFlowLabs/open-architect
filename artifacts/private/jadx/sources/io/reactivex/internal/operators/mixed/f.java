package io.reactivex.internal.operators.mixed;

import androidx.compose.animation.core.z1;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes10.dex */
public final class f<T> extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.l<T> f301118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.i> f301119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f301120c;

    static final class a<T> implements io.reactivex.q<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final C2157a f301121h = new C2157a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f301122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.i> f301123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f301124c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.util.c f301125d = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReference<C2157a> f301126e = new AtomicReference<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f301127f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        w f301128g;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.f$a$a, reason: collision with other inner class name */
        static final class C2157a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f301129b = -8003404460084760287L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final a<?> f301130a;

            C2157a(a<?> aVar) {
                this.f301130a = aVar;
            }

            void a() {
                io.reactivex.internal.disposables.d.b(this);
            }

            @Override // io.reactivex.f
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.o(this, cVar);
            }

            @Override // io.reactivex.f
            public void onComplete() {
                this.f301130a.b(this);
            }

            @Override // io.reactivex.f
            public void onError(Throwable th2) {
                this.f301130a.c(this, th2);
            }
        }

        a(io.reactivex.f fVar, dj.o<? super T, ? extends io.reactivex.i> oVar, boolean z10) {
            this.f301122a = fVar;
            this.f301123b = oVar;
            this.f301124c = z10;
        }

        void a() {
            AtomicReference<C2157a> atomicReference = this.f301126e;
            C2157a c2157a = f301121h;
            C2157a andSet = atomicReference.getAndSet(c2157a);
            if (andSet == null || andSet == c2157a) {
                return;
            }
            andSet.a();
        }

        void b(C2157a c2157a) {
            if (z1.a(this.f301126e, c2157a, null) && this.f301127f) {
                Throwable thC = this.f301125d.c();
                if (thC == null) {
                    this.f301122a.onComplete();
                } else {
                    this.f301122a.onError(thC);
                }
            }
        }

        void c(C2157a c2157a, Throwable th2) {
            if (!z1.a(this.f301126e, c2157a, null) || !this.f301125d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f301124c) {
                if (this.f301127f) {
                    this.f301122a.onError(this.f301125d.c());
                    return;
                }
                return;
            }
            dispose();
            Throwable thC = this.f301125d.c();
            if (thC != io.reactivex.internal.util.k.f303486a) {
                this.f301122a.onError(thC);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301128g.cancel();
            a();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301126e.get() == f301121h;
        }

        @Override // io.reactivex.q, org.reactivestreams.v
        public void l(w wVar) {
            if (io.reactivex.internal.subscriptions.j.q(this.f301128g, wVar)) {
                this.f301128g = wVar;
                this.f301122a.d(this);
                wVar.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f301127f = true;
            if (this.f301126e.get() == null) {
                Throwable thC = this.f301125d.c();
                if (thC == null) {
                    this.f301122a.onComplete();
                } else {
                    this.f301122a.onError(thC);
                }
            }
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            if (!this.f301125d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f301124c) {
                onComplete();
                return;
            }
            a();
            Throwable thC = this.f301125d.c();
            if (thC != io.reactivex.internal.util.k.f303486a) {
                this.f301122a.onError(thC);
            }
        }

        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            C2157a c2157a;
            try {
                io.reactivex.i iVar = (io.reactivex.i) io.reactivex.internal.functions.b.g(this.f301123b.apply(t10), "The mapper returned a null CompletableSource");
                C2157a c2157a2 = new C2157a(this);
                do {
                    c2157a = this.f301126e.get();
                    if (c2157a == f301121h) {
                        return;
                    }
                } while (!z1.a(this.f301126e, c2157a, c2157a2));
                if (c2157a != null) {
                    c2157a.a();
                }
                iVar.b(c2157a2);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f301128g.cancel();
                onError(th2);
            }
        }
    }

    public f(io.reactivex.l<T> lVar, dj.o<? super T, ? extends io.reactivex.i> oVar, boolean z10) {
        this.f301118a = lVar;
        this.f301119b = oVar;
        this.f301120c = z10;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        this.f301118a.j6(new a(fVar, this.f301119b, this.f301120c));
    }
}
