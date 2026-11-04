package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class c0<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.q0<? extends T> f299144c;

    static final class a<T> extends io.reactivex.internal.subscribers.t<T, T> implements io.reactivex.n0<T> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final long f299145j = -7346385463600070225L;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f299146h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        io.reactivex.q0<? extends T> f299147i;

        a(org.reactivestreams.v<? super T> vVar, io.reactivex.q0<? extends T> q0Var) {
            super(vVar);
            this.f299147i = q0Var;
            this.f299146h = new AtomicReference<>();
        }

        @Override // io.reactivex.n0
        public void b(T t10) {
            a(t10);
        }

        @Override // io.reactivex.internal.subscribers.t, org.reactivestreams.w
        public void cancel() {
            super.cancel();
            io.reactivex.internal.disposables.d.b(this.f299146h);
        }

        @Override // io.reactivex.n0
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this.f299146h, cVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            this.f303421b = io.reactivex.internal.subscriptions.j.CANCELLED;
            io.reactivex.q0<? extends T> q0Var = this.f299147i;
            this.f299147i = null;
            q0Var.f(this);
        }

        @Override // org.reactivestreams.v
        public void onError(Throwable th2) {
            this.f303420a.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.v
        public void onNext(T t10) {
            this.f303423d++;
            this.f303420a.onNext((Object) t10);
        }
    }

    public c0(io.reactivex.l<T> lVar, io.reactivex.q0<? extends T> q0Var) {
        super(lVar);
        this.f299144c = q0Var;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar, this.f299144c));
    }
}
