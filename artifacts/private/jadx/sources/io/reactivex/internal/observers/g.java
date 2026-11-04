package io.reactivex.internal.observers;

/* JADX INFO: loaded from: classes8.dex */
public final class g<T> extends e<T> {
    @Override // io.reactivex.i0
    public void onError(Throwable th2) {
        this.f298746a = null;
        this.f298747b = th2;
        countDown();
    }

    @Override // io.reactivex.i0
    public void onNext(T t10) {
        this.f298746a = t10;
    }
}
