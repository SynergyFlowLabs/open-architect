package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class h0<T, R> extends io.reactivex.internal.operators.maybe.a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.o<? super T, ? extends io.reactivex.y<? extends R>> f300817b;

    static final class a<T, R> extends AtomicReference<io.reactivex.disposables.c> implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f300818d = 4375739915521278546L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super R> f300819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.o<? super T, ? extends io.reactivex.y<? extends R>> f300820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f300821c;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.maybe.h0$a$a, reason: collision with other inner class name */
        final class C2150a implements io.reactivex.v<R> {
            C2150a() {
            }

            @Override // io.reactivex.v
            public void b(R r10) {
                a.this.f300819a.b(r10);
            }

            @Override // io.reactivex.v
            public void d(io.reactivex.disposables.c cVar) {
                io.reactivex.internal.disposables.d.o(a.this, cVar);
            }

            @Override // io.reactivex.v
            public void onComplete() {
                a.this.f300819a.onComplete();
            }

            @Override // io.reactivex.v
            public void onError(Throwable th2) {
                a.this.f300819a.onError(th2);
            }
        }

        a(io.reactivex.v<? super R> vVar, dj.o<? super T, ? extends io.reactivex.y<? extends R>> oVar) {
            this.f300819a = vVar;
            this.f300820b = oVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            try {
                io.reactivex.y yVar = (io.reactivex.y) io.reactivex.internal.functions.b.g(this.f300820b.apply(t10), "The mapper returned a null MaybeSource");
                if (k()) {
                    return;
                }
                yVar.a(new C2150a());
            } catch (Exception e10) {
                io.reactivex.exceptions.b.b(e10);
                this.f300819a.onError(e10);
            }
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f300821c, cVar)) {
                this.f300821c = cVar;
                this.f300819a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            io.reactivex.internal.disposables.d.b(this);
            this.f300821c.dispose();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return io.reactivex.internal.disposables.d.c(get());
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300819a.onComplete();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300819a.onError(th2);
        }
    }

    public h0(io.reactivex.y<T> yVar, dj.o<? super T, ? extends io.reactivex.y<? extends R>> oVar) {
        super(yVar);
        this.f300817b = oVar;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super R> vVar) {
        this.f300667a.a(new a(vVar, this.f300817b));
    }
}
