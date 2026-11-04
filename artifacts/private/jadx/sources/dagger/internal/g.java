package dagger.internal;

/* JADX INFO: loaded from: classes13.dex */
public final class g<T> implements ij.c<T>, fg.e<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f269716c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f269717d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile ij.c<T> f269718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f269719b = f269716c;

    private g(ij.c<T> cVar) {
        this.f269718a = cVar;
    }

    public static <P extends ij.c<T>, T> fg.e<T> a(P p10) {
        return p10 instanceof fg.e ? (fg.e) p10 : new g((ij.c) p.b(p10));
    }

    public static <P extends ij.c<T>, T> ij.c<T> b(P p10) {
        p.b(p10);
        return p10 instanceof g ? p10 : new g(p10);
    }

    private static Object c(Object obj, Object obj2) {
        if (obj != f269716c && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
        return obj2;
    }

    @Override // ij.c
    public T get() {
        T t10;
        T t11 = (T) this.f269719b;
        Object obj = f269716c;
        if (t11 != obj) {
            return t11;
        }
        synchronized (this) {
            try {
                t10 = (T) this.f269719b;
                if (t10 == obj) {
                    t10 = this.f269718a.get();
                    this.f269719b = c(this.f269719b, t10);
                    this.f269718a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }
}
