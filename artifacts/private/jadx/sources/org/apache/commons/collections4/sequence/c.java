package org.apache.commons.collections4.sequence;

/* JADX INFO: loaded from: classes14.dex */
public abstract class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f336267a;

    protected c(T t10) {
        this.f336267a = t10;
    }

    public abstract void a(a<T> aVar);

    protected T b() {
        return this.f336267a;
    }
}
