package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class b1<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super Throwable, ? extends io.reactivex.y<? extends T>> f300691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f300692c;

    static final class a<T> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f300693d = 2026620218879969836L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super Throwable, ? extends io.reactivex.y<? extends T>> f300695b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f300696c;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.maybe.b1$a$a, reason: collision with other inner class name */
        static final class C2146a<T> implements io.reactivex.v<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final io.reactivex.v<? super T> f300697a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final AtomicReference<io.reactivex.disposables.c> f300698b;

            C2146a(io.reactivex.v<? super T> vVar, AtomicReference<io.reactivex.disposables.c> atomicReference) {
                this.f300697a = vVar;
                this.f300698b = atomicReference;
            }

            @Override // io.reactivex.v
            public void b(T t10) {
                this.f300697a.b(t10);
            }

            @Override // io.reactivex.v
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.o(this.f300698b, cVar);
            }

            @Override // io.reactivex.v
            public void onComplete() {
                this.f300697a.onComplete();
            }

            @Override // io.reactivex.v
            public void onError(Throwable th2) {
                this.f300697a.onError(th2);
            }
        }

        a(io.reactivex.v<? super T> vVar, dj.o<? super Throwable, ? extends io.reactivex.y<? extends T>> oVar, boolean z10) {
            this.f300694a = vVar;
            this.f300695b = oVar;
            this.f300696c = z10;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f300694a.b(t10);
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.o(this, cVar)) {
                this.f300694a.d(this);
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

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300694a.onComplete();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            if (!this.f300696c && !(th2 instanceof Exception)) {
                this.f300694a.onError(th2);
                return;
            }
            try {
                io.reactivex.y yVar = (io.reactivex.y) io.reactivex.internal.functions.b.g(this.f300695b.apply(th2), "The resumeFunction returned a null MaybeSource");
                io.reactivex.internal.disposables.d.d(this, null);
                yVar.a(new C2146a(this.f300694a, this));
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                this.f300694a.onError(new io.reactivex.exceptions.a(th2, th3));
            }
        }
    }

    public b1(io.reactivex.y<T> yVar, dj.o<? super Throwable, ? extends io.reactivex.y<? extends T>> oVar, boolean z10) {
        super(yVar);
        this.f300691b = oVar;
        this.f300692c = z10;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        this.f300667a.a(new a(vVar, this.f300691b, this.f300692c));
    }
}
