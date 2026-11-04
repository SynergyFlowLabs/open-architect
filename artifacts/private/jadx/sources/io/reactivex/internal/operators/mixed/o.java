package io.reactivex.internal.operators.mixed;

import androidx.compose.animation.core.z1;
import io.reactivex.b0;
import io.reactivex.i0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class o<T> extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b0<T> f301241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.i> f301242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f301243c;

    static final class a<T> implements i0<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final C2163a f301244h = new C2163a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f301245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.i> f301246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f301247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.reactivex.internal.util.c f301248d = new io.reactivex.internal.util.c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReference<C2163a> f301249e = new AtomicReference<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f301250f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        io.reactivex.disposables.c f301251g;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.mixed.o$a$a, reason: collision with other inner class name */
        static final class C2163a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f301252b = -8003404460084760287L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final a<?> f301253a;

            C2163a(a<?> aVar) {
                this.f301253a = aVar;
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
                this.f301253a.b(this);
            }

            @Override // io.reactivex.f
            public void onError(Throwable th2) {
                this.f301253a.c(this, th2);
            }
        }

        a(io.reactivex.f fVar, dj.o<? super T, ? extends io.reactivex.i> oVar, boolean z10) {
            this.f301245a = fVar;
            this.f301246b = oVar;
            this.f301247c = z10;
        }

        void a() {
            AtomicReference<C2163a> atomicReference = this.f301249e;
            C2163a c2163a = f301244h;
            C2163a andSet = atomicReference.getAndSet(c2163a);
            if (andSet == null || andSet == c2163a) {
                return;
            }
            andSet.a();
        }

        void b(C2163a c2163a) {
            if (z1.a(this.f301249e, c2163a, null) && this.f301250f) {
                Throwable thC = this.f301248d.c();
                if (thC == null) {
                    this.f301245a.onComplete();
                } else {
                    this.f301245a.onError(thC);
                }
            }
        }

        void c(C2163a c2163a, Throwable th2) {
            if (!z1.a(this.f301249e, c2163a, null) || !this.f301248d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f301247c) {
                if (this.f301250f) {
                    this.f301245a.onError(this.f301248d.c());
                    return;
                }
                return;
            }
            dispose();
            Throwable thC = this.f301248d.c();
            if (thC != io.reactivex.internal.util.k.f303486a) {
                this.f301245a.onError(thC);
            }
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f301251g, cVar)) {
                this.f301251g = cVar;
                this.f301245a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f301251g.dispose();
            a();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f301249e.get() == f301244h;
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f301250f = true;
            if (this.f301249e.get() == null) {
                Throwable thC = this.f301248d.c();
                if (thC == null) {
                    this.f301245a.onComplete();
                } else {
                    this.f301245a.onError(thC);
                }
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            if (!this.f301248d.a(th2)) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            if (this.f301247c) {
                onComplete();
                return;
            }
            a();
            Throwable thC = this.f301248d.c();
            if (thC != io.reactivex.internal.util.k.f303486a) {
                this.f301245a.onError(thC);
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            C2163a c2163a;
            try {
                io.reactivex.i iVar = (io.reactivex.i) io.reactivex.internal.functions.b.g(this.f301246b.apply(t10), "The mapper returned a null CompletableSource");
                C2163a c2163a2 = new C2163a(this);
                do {
                    c2163a = this.f301249e.get();
                    if (c2163a == f301244h) {
                        return;
                    }
                } while (!z1.a(this.f301249e, c2163a, c2163a2));
                if (c2163a != null) {
                    c2163a.a();
                }
                iVar.b(c2163a2);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f301251g.dispose();
                onError(th2);
            }
        }
    }

    public o(b0<T> b0Var, dj.o<? super T, ? extends io.reactivex.i> oVar, boolean z10) {
        this.f301241a = b0Var;
        this.f301242b = oVar;
        this.f301243c = z10;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        if (r.a(this.f301241a, this.f301242b, fVar)) {
            return;
        }
        this.f301241a.a(new a(fVar, this.f301242b, this.f301243c));
    }
}
