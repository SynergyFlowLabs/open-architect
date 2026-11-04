package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class o2<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f302087b;

    static final class a<T> extends AtomicInteger implements io.reactivex.i0<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final long f302088e = -7098360935104053232L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.i0<? super T> f302089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.internal.disposables.h f302090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.reactivex.g0<? extends T> f302091c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f302092d;

        a(io.reactivex.i0<? super T> i0Var, long j10, io.reactivex.internal.disposables.h hVar, io.reactivex.g0<? extends T> g0Var) {
            this.f302089a = i0Var;
            this.f302090b = hVar;
            this.f302091c = g0Var;
            this.f302092d = j10;
        }

        void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f302090b.k()) {
                    this.f302091c.a(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        break;
                    }
                }
            }
        }

        @Override // io.reactivex.i0
        public void d(io.reactivex.disposables.c cVar) {
            this.f302090b.a(cVar);
        }

        @Override // io.reactivex.i0
        public void onComplete() {
            long j10 = this.f302092d;
            if (j10 != Long.MAX_VALUE) {
                this.f302092d = j10 - 1;
            }
            if (j10 != 0) {
                a();
            } else {
                this.f302089a.onComplete();
            }
        }

        @Override // io.reactivex.i0
        public void onError(Throwable th2) {
            this.f302089a.onError(th2);
        }

        @Override // io.reactivex.i0
        public void onNext(T t10) {
            this.f302089a.onNext(t10);
        }
    }

    public o2(io.reactivex.b0<T> b0Var, long j10) {
        super(b0Var);
        this.f302087b = j10;
    }

    @Override // io.reactivex.b0
    public void H5(io.reactivex.i0<? super T> i0Var) {
        io.reactivex.internal.disposables.h hVar = new io.reactivex.internal.disposables.h();
        i0Var.d(hVar);
        long j10 = this.f302087b;
        new a(i0Var, j10 != Long.MAX_VALUE ? j10 - 1 : Long.MAX_VALUE, hVar, this.f301291a).a();
    }
}
