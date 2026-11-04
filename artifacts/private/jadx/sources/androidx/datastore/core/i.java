package androidx.datastore.core;

/* JADX INFO: loaded from: classes2.dex */
public final class i<T> extends p0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f49505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f49506c;

    public i(T t10, int i10, int i11) {
        super(i11, null);
        this.f49505b = t10;
        this.f49506c = i10;
    }

    public final void b() {
        T t10 = this.f49505b;
        if ((t10 != null ? t10.hashCode() : 0) != this.f49506c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final int c() {
        return this.f49506c;
    }

    public final T d() {
        return this.f49505b;
    }
}
