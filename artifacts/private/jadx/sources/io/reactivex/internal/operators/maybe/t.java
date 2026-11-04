package io.reactivex.internal.operators.maybe;

/* JADX INFO: loaded from: classes10.dex */
public final class t<T> extends io.reactivex.s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final io.reactivex.y<T> f300966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final dj.a f300967b;

    final class a implements io.reactivex.v<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final io.reactivex.v<? super T> f300968a;

        a(io.reactivex.v<? super T> vVar) {
            this.f300968a = vVar;
        }

        @Override // io.reactivex.v
        public void b(T t10) {
            try {
                t.this.f300967b.run();
                this.f300968a.b(t10);
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f300968a.onError(th2);
            }
        }

        @Override // io.reactivex.v
        public void d(io.reactivex.disposables.c cVar) {
            this.f300968a.d(cVar);
        }

        @Override // io.reactivex.v
        public void onComplete() {
            try {
                t.this.f300967b.run();
                this.f300968a.onComplete();
            } catch (Throwable th2) {
                io.reactivex.exceptions.b.b(th2);
                this.f300968a.onError(th2);
            }
        }

        @Override // io.reactivex.v
        public void onError(Throwable th2) {
            try {
                t.this.f300967b.run();
            } catch (Throwable th3) {
                io.reactivex.exceptions.b.b(th3);
                th2 = new io.reactivex.exceptions.a(th2, th3);
            }
            this.f300968a.onError(th2);
        }
    }

    public t(io.reactivex.y<T> yVar, dj.a aVar) {
        this.f300966a = yVar;
        this.f300967b = aVar;
    }

    @Override // io.reactivex.s
    protected void s1(io.reactivex.v<? super T> vVar) {
        this.f300966a.a(new a(vVar));
    }
}
