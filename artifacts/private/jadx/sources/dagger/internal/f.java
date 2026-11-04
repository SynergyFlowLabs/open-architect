package dagger.internal;

/* JADX INFO: loaded from: classes13.dex */
public final class f<T> implements h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ij.c<T> f269715a;

    public static <T> void b(ij.c<T> cVar, ij.c<T> cVar2) {
        p.b(cVar2);
        f fVar = (f) cVar;
        if (fVar.f269715a != null) {
            throw new IllegalStateException();
        }
        fVar.f269715a = cVar2;
    }

    ij.c<T> a() {
        return (ij.c) p.b(this.f269715a);
    }

    @Deprecated
    public void c(ij.c<T> cVar) {
        b(this, cVar);
    }

    @Override // ij.c
    public T get() {
        ij.c<T> cVar = this.f269715a;
        if (cVar != null) {
            return cVar.get();
        }
        throw new IllegalStateException();
    }
}
