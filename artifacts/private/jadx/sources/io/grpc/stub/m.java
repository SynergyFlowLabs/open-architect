package io.grpc.stub;

/* JADX INFO: loaded from: classes13.dex */
public interface m<V> {
    void onCompleted();

    void onError(Throwable th2);

    void onNext(V v10);
}
