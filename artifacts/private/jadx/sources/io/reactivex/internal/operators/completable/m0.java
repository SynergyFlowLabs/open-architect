package io.reactivex.internal.operators.completable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public final class m0 extends io.reactivex.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.i f298987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f298988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final TimeUnit f298989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.j0 f298990d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final io.reactivex.i f298991e;

    final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f298992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.disposables.b f298993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.f f298994c;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.completable.m0$a$a, reason: collision with other inner class name */
        final class C2127a implements io.reactivex.f {
            C2127a() {
            }

            @Override // io.reactivex.f
            public void d(io.reactivex.disposables.c cVar) {
                a.this.f298993b.c(cVar);
            }

            @Override // io.reactivex.f
            public void onComplete() {
                a.this.f298993b.dispose();
                a.this.f298994c.onComplete();
            }

            @Override // io.reactivex.f
            public void onError(Throwable th2) {
                a.this.f298993b.dispose();
                a.this.f298994c.onError(th2);
            }
        }

        a(AtomicBoolean atomicBoolean, io.reactivex.disposables.b bVar, io.reactivex.f fVar) {
            this.f298992a = atomicBoolean;
            this.f298993b = bVar;
            this.f298994c = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f298992a.compareAndSet(false, true)) {
                this.f298993b.e();
                io.reactivex.i iVar = m0.this.f298991e;
                if (iVar != null) {
                    iVar.b(new C2127a());
                    return;
                }
                io.reactivex.f fVar = this.f298994c;
                m0 m0Var = m0.this;
                fVar.onError(new TimeoutException(io.reactivex.internal.util.k.e(m0Var.f298988b, m0Var.f298989c)));
            }
        }
    }

    static final class b implements io.reactivex.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.reactivex.disposables.b f298997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f298998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.reactivex.f f298999c;

        b(io.reactivex.disposables.b bVar, AtomicBoolean atomicBoolean, io.reactivex.f fVar) {
            this.f298997a = bVar;
            this.f298998b = atomicBoolean;
            this.f298999c = fVar;
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            this.f298997a.c(cVar);
        }

        @Override // io.reactivex.f
        public void onComplete() {
            if (this.f298998b.compareAndSet(false, true)) {
                this.f298997a.dispose();
                this.f298999c.onComplete();
            }
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            if (!this.f298998b.compareAndSet(false, true)) {
                io.reactivex.plugins.a.Y(th2);
            } else {
                this.f298997a.dispose();
                this.f298999c.onError(th2);
            }
        }
    }

    public m0(io.reactivex.i iVar, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var, io.reactivex.i iVar2) {
        this.f298987a = iVar;
        this.f298988b = j10;
        this.f298989c = timeUnit;
        this.f298990d = j0Var;
        this.f298991e = iVar2;
    }

    @Override // io.reactivex.c
    public void J0(io.reactivex.f fVar) {
        io.reactivex.disposables.b bVar = new io.reactivex.disposables.b();
        fVar.d(bVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        bVar.c(this.f298990d.f(new a(atomicBoolean, bVar, fVar), this.f298988b, this.f298989c));
        this.f298987a.b(new b(bVar, atomicBoolean, fVar));
    }
}
