package io.reactivex.internal.subscribers;

import org.reactivestreams.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class h<T, R> extends io.reactivex.internal.subscriptions.f<R> implements io.reactivex.q<T> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f303351o = 2984505488220891551L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected w f303352m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f303353n;

    public h(org.reactivestreams.v<? super R> vVar) {
        super(vVar);
    }

    @Override // io.reactivex.internal.subscriptions.f, org.reactivestreams.w
    public void cancel() {
        super.cancel();
        this.f303352m.cancel();
    }

    public void l(w wVar) {
        if (io.reactivex.internal.subscriptions.j.q(this.f303352m, wVar)) {
            this.f303352m = wVar;
            this.f303450b.l(this);
            wVar.request(Long.MAX_VALUE);
        }
    }

    public void onComplete() {
        if (this.f303353n) {
            f(this.f303451c);
        } else {
            this.f303450b.onComplete();
        }
    }

    public void onError(Throwable th2) {
        this.f303451c = null;
        this.f303450b.onError(th2);
    }
}
