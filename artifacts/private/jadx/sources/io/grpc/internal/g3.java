package io.grpc.internal;

/* JADX INFO: loaded from: classes13.dex */
public final class g3<T> implements z1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f3.d<T> f289221a;

    private g3(f3.d<T> dVar) {
        this.f289221a = dVar;
    }

    public static <T> g3<T> c(f3.d<T> dVar) {
        return new g3<>(dVar);
    }

    @Override // io.grpc.internal.z1
    public T a() {
        return (T) f3.d(this.f289221a);
    }

    @Override // io.grpc.internal.z1
    public T b(Object obj) {
        f3.f(this.f289221a, obj);
        return null;
    }
}
