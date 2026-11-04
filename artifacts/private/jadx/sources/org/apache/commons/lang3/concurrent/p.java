package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes14.dex */
public abstract class p<T> implements k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f337115b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile T f337116a = (T) f337115b;

    protected abstract T a() throws j;

    @Override // org.apache.commons.lang3.concurrent.k
    public T get() throws j {
        T tA;
        T t10 = this.f337116a;
        Object obj = f337115b;
        if (t10 != obj) {
            return t10;
        }
        synchronized (this) {
            try {
                tA = this.f337116a;
                if (tA == obj) {
                    tA = a();
                    this.f337116a = tA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tA;
    }
}
