package io.reactivex.internal.operators.maybe;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class r<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.a f300938b;

    static final class a<T> extends AtomicInteger implements io.reactivex.v<T>, io.reactivex.disposables.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final long f300939d = 4109457741734051389L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final dj.a f300941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        io.reactivex.disposables.c f300942c;

        a(io.reactivex.v<? super T> vVar, dj.a aVar) {
            this.f300940a = vVar;
            this.f300941b = aVar;
        }

        void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f300941b.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.b.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            }
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            this.f300940a.b(t10);
            a();
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            if (io.reactivex.internal.disposables.d.q(this.f300942c, cVar)) {
                this.f300942c = cVar;
                this.f300940a.d(this);
            }
        }

        @Override // io.reactivex.disposables.c
        public void dispose() {
            this.f300942c.dispose();
            a();
        }

        @Override // io.reactivex.disposables.c
        public boolean k() {
            return this.f300942c.k();
        }

        @Override // io.reactivex.v
        public void onComplete() {
            this.f300940a.onComplete();
            a();
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            this.f300940a.onError(th2);
            a();
        }
    }

    public r(io.reactivex.y<T> yVar, dj.a aVar) {
        super(yVar);
        this.f300938b = aVar;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        this.f300667a.a(new a(vVar, this.f300938b));
    }
}
