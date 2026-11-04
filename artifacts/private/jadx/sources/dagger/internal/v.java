package dagger.internal;

/* JADX INFO: loaded from: classes13.dex */
public final class v<T> implements ij.c<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f269736c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f269737d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile ij.c<T> f269738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f269739b = f269736c;

    private v(ij.c<T> cVar) {
        this.f269738a = cVar;
    }

    public static <P extends ij.c<T>, T> ij.c<T> a(P p10) {
        return ((p10 instanceof v) || (p10 instanceof g)) ? p10 : new v((ij.c) p.b(p10));
    }

    @Override // ij.c
    public T get() {
        T t10 = (T) this.f269739b;
        if (t10 != f269736c) {
            return t10;
        }
        ij.c<T> cVar = this.f269738a;
        if (cVar == null) {
            return (T) this.f269739b;
        }
        T t11 = cVar.get();
        this.f269739b = t11;
        this.f269738a = null;
        return t11;
    }
}
