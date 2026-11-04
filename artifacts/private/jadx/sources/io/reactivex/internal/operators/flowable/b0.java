package io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class b0<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.reactivex.y<? extends T> f299101c;

    static final class a<T> extends io.reactivex.internal.subscribers.t<T, T> implements io.reactivex.v<T> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final long f299102k = -7346385463600070225L;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f299103h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        io.reactivex.y<? extends T> f299104i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f299105j;

        a(org.reactivestreams.v<? super T> vVar, io.reactivex.y<? extends T> yVar) {
            super(vVar);
            this.f299104i = yVar;
            this.f299103h = new AtomicReference<>();
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            a(t10);
        }

        @Override // io.reactivex.internal.subscribers.t, org.reactivestreams.w
        public void cancel() {
            super.cancel();
            io.reactivex.internal.disposables.d.b(this.f299103h);
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.o(this.f299103h, cVar);
        }

        @Override // org.reactivestreams.v
        public void onComplete() {
            if (this.f299105j) {
                this.f303420a.onComplete();
                return;
            }
            this.f299105j = true;
            this.f303421b = io.reactivex.internal.subscriptions.j.CANCELLED;
            io.reactivex.y<? extends T> yVar = this.f299104i;
            this.f299104i = null;
            yVar.a(this);
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

    public b0(io.reactivex.l<T> lVar, io.reactivex.y<? extends T> yVar) {
        super(lVar);
        this.f299101c = yVar;
    }

    @Override // io.reactivex.l
    protected void k6(org.reactivestreams.v<? super T> vVar) {
        this.f299043b.j6(new a(vVar, this.f299101c));
    }
}
