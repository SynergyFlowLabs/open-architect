package io.reactivex.internal.observers;

/* JADX INFO: loaded from: classes8.dex */
public final class a0<T> implements io.reactivex.f, org.reactivestreams.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final org.reactivestreams.v<? super T> f298741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    io.reactivex.disposables.c f298742b;

    public a0(org.reactivestreams.v<? super T> vVar) {
        this.f298741a = vVar;
    }

    @Override // org.reactivestreams.w
    public void cancel() {
        this.f298742b.dispose();
    }

    @Override // io.reactivex.f
    public void d(io.reactivex.disposables.c cVar) {
        if (io.reactivex.internal.disposables.d.q(this.f298742b, cVar)) {
            this.f298742b = cVar;
            this.f298741a.l(this);
        }
    }

    @Override // io.reactivex.f
    public void onComplete() {
        this.f298741a.onComplete();
    }

    @Override // io.reactivex.f
    public void onError(Throwable th2) {
        this.f298741a.onError(th2);
    }

    @Override // org.reactivestreams.w
    public void request(long j10) {
    }
}
