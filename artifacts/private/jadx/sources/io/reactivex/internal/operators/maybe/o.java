package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class o<T> extends io.reactivex.s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.y<T> f300911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final io.reactivex.i f300912b;

    static final class a<T> implements io.reactivex.v<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReference<io.reactivex.disposables.c> f300913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.v<? super T> f300914b;

        a(AtomicReference<io.reactivex.disposables.c> atomicReference, io.reactivex.v<? super T> vVar) {
            this.f300913a = atomicReference;
            this.f300914b = vVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f300914b.b(t10);
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            io.reactivex.internal.disposables.d.d(this.f300913a, cVar);
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300914b.onComplete();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300914b.onError(th2);
        }
    }

    static final class b<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.f, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final long f300915c = 703409937383992161L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final io.reactivex.y<T> f300917b;

        b(io.reactivex.v<? super T> vVar, io.reactivex.y<T> yVar) {
            this.f300916a = vVar;
            this.f300917b = yVar;
        }

        @Override // io.reactivex.f
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.o(this, cVar)) {
                this.f300916a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.f
        public void onComplete() {
            this.f300917b.a(new a(this, this.f300916a));
        }

        @Override // io.reactivex.f
        public void onError(Throwable th2) {
            this.f300916a.onError(th2);
        }
    }

    public o(io.reactivex.y<T> yVar, io.reactivex.i iVar) {
        this.f300911a = yVar;
        this.f300912b = iVar;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        this.f300912b.b(new b(vVar, this.f300911a));
    }
}
