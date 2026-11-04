package io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class l0 extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.c f298975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.i f298976b;

    static final class a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.f, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f298977d = 3533011714830024923L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.f f298978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final C2126a f298979b = new C2126a(this);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicBoolean f298980c = new AtomicBoolean();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.completable.l0$a$a, reason: collision with other inner class name */
        static final class C2126a extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static final long f298981b = 5176264485428790318L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final a f298982a;

            C2126a(a aVar) {
                this.f298982a = aVar;
            }

            @Override // io.reactivex.f
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.o(this, cVar);
            }

            @Override // io.reactivex.f
            public void onComplete() {
                this.f298982a.a();
            }

            @Override // io.reactivex.f
            public void onError(Throwable th2) {
                this.f298982a.b(th2);
            }
        }

        a(io.reactivex.f fVar) {
            this.f298978a = fVar;
        }

        void a() {
            if (this.f298980c.compareAndSet(false, true)) {
                io.reactivex.internal.disposables.d.b(this);
                this.f298978a.onComplete();
            }
        }

        void b(Throwable th2) {
            if (!this.f298980c.compareAndSet(false, true)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                io.reactivex.internal.disposables.d.b(this);
                this.f298978a.onError(th2);
            }
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this, cVar);
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            if (this.f298980c.compareAndSet(false, true)) {
                io.reactivex.internal.disposables.d.b(this);
                io.reactivex.internal.disposables.d.b(this.f298979b);
            }
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f298980c.get();
        }

        @Override // io.reactivex.f
        public void onComplete() {
            if (this.f298980c.compareAndSet(false, true)) {
                io.reactivex.internal.disposables.d.b(this.f298979b);
                this.f298978a.onComplete();
            }
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            if (!this.f298980c.compareAndSet(false, true)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                io.reactivex.internal.disposables.d.b(this.f298979b);
                this.f298978a.onError(th2);
            }
        }
    }

    public l0(io.reactivex.c cVar, io.reactivex.i iVar) {
        this.f298975a = cVar;
        this.f298976b = iVar;
    }

    @Override // io.reactivex.c
    protected void J0(io.reactivex.f fVar) {
        a aVar = new a(fVar);
        fVar.d(aVar);
        this.f298976b.b(aVar.f298979b);
        this.f298975a.b(aVar);
    }
}
