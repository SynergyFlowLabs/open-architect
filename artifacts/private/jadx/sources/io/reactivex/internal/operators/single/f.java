package io.reactivex.internal.operators.single;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class f<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.q0<? extends T> f302932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f302933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final TimeUnit f302934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final io.reactivex.j0 f302935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f302936e;

    final class a implements io.reactivex.n0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.reactivex.internal.disposables.h f302937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.n0<? super T> f302938b;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.single.f$a$a, reason: collision with other inner class name */
        final class RunnableC2188a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Throwable f302940a;

            RunnableC2188a(Throwable th2) {
                this.f302940a = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f302938b.onError(this.f302940a);
            }
        }

        final class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final T f302942a;

            b(T t10) {
                this.f302942a = t10;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f302938b.b(this.f302942a);
            }
        }

        a(io.reactivex.internal.disposables.h hVar, io.reactivex.n0<? super T> n0Var) {
            this.f302937a = hVar;
            this.f302938b = n0Var;
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            io.reactivex.internal.disposables.h hVar = this.f302937a;
            io.reactivex.j0 j0Var = f.this.f302935d;
            b bVar = new b(t10);
            f fVar = f.this;
            hVar.a(j0Var.f(bVar, fVar.f302933b, fVar.f302934c));
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            this.f302937a.a(cVar);
        }

        @Override // io.reactivex.n0
        public void onError(Throwable th2) {
            io.reactivex.internal.disposables.h hVar = this.f302937a;
            io.reactivex.j0 j0Var = f.this.f302935d;
            RunnableC2188a runnableC2188a = new RunnableC2188a(th2);
            f fVar = f.this;
            hVar.a(j0Var.f(runnableC2188a, fVar.f302936e ? fVar.f302933b : 0L, fVar.f302934c));
        }
    }

    public f(io.reactivex.q0<? extends T> q0Var, long j10, TimeUnit timeUnit, io.reactivex.j0 j0Var, boolean z10) {
        this.f302932a = q0Var;
        this.f302933b = j10;
        this.f302934c = timeUnit;
        this.f302935d = j0Var;
        this.f302936e = z10;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        io.reactivex.internal.disposables.h hVar = new io.reactivex.internal.disposables.h();
        n0Var.d(hVar);
        this.f302932a.f(new a(hVar, n0Var));
    }
}
