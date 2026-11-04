package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class t2<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.r<? super Throwable> f302351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f302352c;

    static final class a<T> extends AtomicInteger implements io.reactivex.i0<T> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final long f302353f = -7098360935104053232L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f302355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.g0<? extends T> f302356c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final dj.r<? super Throwable> f302357d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f302358e;

        a(io.reactivex.i0<? super T> i0Var, long j10, dj.r<? super Throwable> rVar, io.reactivex.internal.disposables.h hVar, io.reactivex.g0<? extends T> g0Var) {
            this.f302354a = i0Var;
            this.f302355b = hVar;
            this.f302356c = g0Var;
            this.f302357d = rVar;
            this.f302358e = j10;
        }

        void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f302355b.k()) {
                    this.f302356c.a(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            this.f302355b.a(cVar);
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            this.f302354a.onComplete();
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            long j10 = this.f302358e;
            if (j10 != Long.MAX_VALUE) {
                this.f302358e = j10 - 1;
            }
            if (j10 == 0) {
                this.f302354a.onError(th2);
                return;
            }
            try {
                if (this.f302357d.test(th2)) {
                    a();
                } else {
                    this.f302354a.onError(th2);
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                this.f302354a.onError(new io.reactivex.exceptions.a(th2, th3));
            }
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f302354a.onNext(t10);
        }
    }

    public t2(io.reactivex.b0<T> b0Var, long j10, dj.r<? super Throwable> rVar) {
        super(b0Var);
        this.f302351b = rVar;
        this.f302352c = j10;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        io.reactivex.internal.disposables.h hVar = new io.reactivex.internal.disposables.h();
        i0Var.d(hVar);
        new a(i0Var, this.f302352c, this.f302351b, hVar, this.f301291a).a();
    }
}
