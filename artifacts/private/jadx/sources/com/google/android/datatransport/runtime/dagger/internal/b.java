package com.google.android.datatransport.runtime.dagger.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class b<T> implements ij.c<T>, y5.d<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f103515c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f103516d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile ij.c<T> f103517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f103518b = f103515c;

    private b(ij.c<T> cVar) {
        this.f103517a = cVar;
    }

    public static <P extends ij.c<T>, T> y5.d<T> a(P p10) {
        return p10 instanceof y5.d ? (y5.d) p10 : new b((ij.c) e.b(p10));
    }

    public static <P extends ij.c<T>, T> ij.c<T> b(P p10) {
        e.b(p10);
        return p10 instanceof b ? p10 : new b(p10);
    }

    private static Object c(Object obj, Object obj2) {
        if (obj == f103515c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // ij.c
    public T get() {
        T t10;
        T t11 = (T) this.f103518b;
        Object obj = f103515c;
        if (t11 != obj) {
            return t11;
        }
        synchronized (this) {
            try {
                t10 = (T) this.f103518b;
                if (t10 == obj) {
                    t10 = this.f103517a.get();
                    this.f103518b = c(this.f103518b, t10);
                    this.f103517a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }
}
