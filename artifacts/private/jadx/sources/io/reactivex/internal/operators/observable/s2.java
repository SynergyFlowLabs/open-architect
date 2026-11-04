package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class s2<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.d<? super Integer, ? super Throwable> f302326b;

    static final class a<T> extends AtomicInteger implements io.reactivex.i0<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f302327f = -7098360935104053232L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f302329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.g0<? extends T> f302330c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final dj.d<? super Integer, ? super Throwable> f302331d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f302332e;

        a(io.reactivex.i0<? super T> i0Var, dj.d<? super Integer, ? super Throwable> dVar, io.reactivex.internal.disposables.h hVar, io.reactivex.g0<? extends T> g0Var) {
            this.f302328a = i0Var;
            this.f302329b = hVar;
            this.f302330c = g0Var;
            this.f302331d = dVar;
        }

        void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f302329b.k()) {
                    this.f302330c.a(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            this.f302329b.a(cVar);
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f302328a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            try {
                dj.d<? super Integer, ? super Throwable> dVar = this.f302331d;
                int i10 = this.f302332e + 1;
                this.f302332e = i10;
                if (dVar.test(Integer.valueOf(i10), th2)) {
                    a();
                } else {
                    this.f302328a.onError(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                this.f302328a.onError(new io.reactivex.exceptions.a(th2, th3));
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f302328a.onNext(t10);
        }
    }

    public s2(io.reactivex.b0<T> b0Var, dj.d<? super Integer, ? super Throwable> dVar) {
        super(b0Var);
        this.f302326b = dVar;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        io.reactivex.internal.disposables.h hVar = new io.reactivex.internal.disposables.h();
        i0Var.d(hVar);
        new a(i0Var, this.f302326b, hVar, this.f301291a).a();
    }
}
