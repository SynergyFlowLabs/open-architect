package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class p2<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.e f302116b;

    static final class a<T> extends AtomicInteger implements io.reactivex.i0<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f302117e = -7098360935104053232L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f302119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.g0<? extends T> f302120c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final dj.e f302121d;

        a(io.reactivex.i0<? super T> i0Var, dj.e eVar, io.reactivex.internal.disposables.h hVar, io.reactivex.g0<? extends T> g0Var) {
            this.f302118a = i0Var;
            this.f302119b = hVar;
            this.f302120c = g0Var;
            this.f302121d = eVar;
        }

        void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                do {
                    this.f302120c.a(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            this.f302119b.a(cVar);
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            try {
                if (this.f302121d.a()) {
                    this.f302118a.onComplete();
                } else {
                    a();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f302118a.onError(th2);
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f302118a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f302118a.onNext(t10);
        }
    }

    public p2(io.reactivex.b0<T> b0Var, dj.e eVar) {
        super(b0Var);
        this.f302116b = eVar;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        io.reactivex.internal.disposables.h hVar = new io.reactivex.internal.disposables.h();
        i0Var.d(hVar);
        new a(i0Var, this.f302116b, hVar, this.f301291a).a();
    }
}
