package com.google.firebase.sessions.dagger.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class b<T> implements f<T>, m9.d<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f124979c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f124980d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile f<T> f124981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f124982b = f124979c;

    private b(f<T> fVar) {
        this.f124981a = fVar;
    }

    public static <P extends f<T>, T> m9.d<T> a(P p10) {
        return p10 instanceof m9.d ? (m9.d) p10 : new b((f) e.b(p10));
    }

    public static <P extends ij.c<T>, T> m9.d<T> b(P p10) {
        return a(g.a(p10));
    }

    public static <P extends f<T>, T> f<T> c(P p10) {
        e.b(p10);
        return p10 instanceof b ? p10 : new b(p10);
    }

    @Deprecated
    public static <P extends ij.c<T>, T> ij.c<T> d(P p10) {
        return c(g.a(p10));
    }

    private static Object e(Object obj, Object obj2) {
        if (obj != f124979c && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
        return obj2;
    }

    @Override // ij.c
    public T get() {
        T t10;
        T t11 = (T) this.f124982b;
        Object obj = f124979c;
        if (t11 != obj) {
            return t11;
        }
        synchronized (this) {
            try {
                t10 = (T) this.f124982b;
                if (t10 == obj) {
                    t10 = this.f124981a.get();
                    this.f124982b = e(this.f124982b, t10);
                    this.f124981a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }
}
