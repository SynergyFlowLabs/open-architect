package dagger.internal;

/* JADX INFO: loaded from: classes13.dex */
public final class k<T> implements h<T>, fg.e<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k<Object> f269720b = new k<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f269721a;

    private k(T t10) {
        this.f269721a = t10;
    }

    public static <T> h<T> a(T t10) {
        return new k(p.c(t10, "instance cannot be null"));
    }

    public static <T> h<T> b(T t10) {
        return t10 == null ? c() : new k(t10);
    }

    private static <T> k<T> c() {
        return (k<T>) f269720b;
    }

    @Override // ij.c
    public T get() {
        return this.f269721a;
    }
}
