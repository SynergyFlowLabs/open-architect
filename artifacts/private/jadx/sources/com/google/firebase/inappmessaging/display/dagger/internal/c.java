package com.google.firebase.inappmessaging.display.dagger.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class c<T> implements ij.c<T>, r8.b<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f122173c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f122174d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile ij.c<T> f122175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f122176b = f122173c;

    private c(ij.c<T> cVar) {
        this.f122175a = cVar;
    }

    public static <P extends ij.c<T>, T> r8.b<T> a(P p10) {
        return p10 instanceof r8.b ? (r8.b) p10 : new c((ij.c) f.b(p10));
    }

    public static <P extends ij.c<T>, T> ij.c<T> b(P p10) {
        f.b(p10);
        return p10 instanceof c ? p10 : new c(p10);
    }

    private static Object c(Object obj, Object obj2) {
        if (obj == f122173c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // ij.c
    public T get() {
        T t10;
        T t11 = (T) this.f122176b;
        Object obj = f122173c;
        if (t11 != obj) {
            return t11;
        }
        synchronized (this) {
            try {
                t10 = (T) this.f122176b;
                if (t10 == obj) {
                    t10 = this.f122175a.get();
                    this.f122176b = c(this.f122176b, t10);
                    this.f122175a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }
}
