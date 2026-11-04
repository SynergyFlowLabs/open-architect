package io.reactivex.internal.subscribers;

/* JADX INFO: loaded from: classes11.dex */
public final class e<T> extends c<T> {
    @Override // org.reactivestreams.v
    public void onError(Throwable th2) {
        this.f303336a = null;
        this.f303337b = th2;
        countDown();
    }

    @Override // org.reactivestreams.v
    public void onNext(T t10) {
        this.f303336a = t10;
    }
}
