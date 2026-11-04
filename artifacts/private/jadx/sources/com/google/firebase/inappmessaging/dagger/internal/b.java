package com.google.firebase.inappmessaging.dagger.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class b<T> implements ij.c<T>, q8.c<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f122126c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f122127d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile ij.c<T> f122128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f122129b = f122126c;

    private b(ij.c<T> cVar) {
        this.f122128a = cVar;
    }

    public static <P extends ij.c<T>, T> q8.c<T> a(P p10) {
        return p10 instanceof q8.c ? (q8.c) p10 : new b((ij.c) e.b(p10));
    }

    public static <P extends ij.c<T>, T> ij.c<T> b(P p10) {
        e.b(p10);
        return p10 instanceof b ? p10 : new b(p10);
    }

    private static Object c(Object obj, Object obj2) {
        if (obj == f122126c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // ij.c
    public T get() {
        T t10;
        T t11 = (T) this.f122129b;
        Object obj = f122126c;
        if (t11 != obj) {
            return t11;
        }
        synchronized (this) {
            try {
                t10 = (T) this.f122129b;
                if (t10 == obj) {
                    t10 = this.f122128a.get();
                    this.f122129b = c(this.f122129b, t10);
                    this.f122128a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }
}
