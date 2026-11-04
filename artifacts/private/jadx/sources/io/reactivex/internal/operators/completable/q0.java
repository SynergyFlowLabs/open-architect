package io.reactivex.internal.operators.completable;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class q0<T> extends io.reactivex.k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.i f299013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Callable<? extends T> f299014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final T f299015c;

    final class a implements io.reactivex.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.reactivex.n0<? super T> f299016a;

        a(io.reactivex.n0<? super T> n0Var) {
            this.f299016a = n0Var;
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            this.f299016a.d(cVar);
        }

        @Override // io.reactivex.f
        public void onComplete() {
            T tCall;
            q0 q0Var = q0.this;
            Callable<? extends T> callable = q0Var.f299014b;
            if (callable != null) {
                try {
                    tCall = callable.call();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    this.f299016a.onError(th2);
                    return;
                }
            } else {
                tCall = q0Var.f299015c;
            }
            if (tCall == null) {
                this.f299016a.onError(new NullPointerException("The value supplied is null"));
            } else {
                this.f299016a.b(tCall);
            }
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            this.f299016a.onError(th2);
        }
    }

    public q0(io.reactivex.i iVar, Callable<? extends T> callable, T t10) {
        this.f299013a = iVar;
        this.f299015c = t10;
        this.f299014b = callable;
    }

    @Override // io.reactivex.k0
    protected void d1(io.reactivex.n0<? super T> n0Var) {
        this.f299013a.b(new a(n0Var));
    }
}
