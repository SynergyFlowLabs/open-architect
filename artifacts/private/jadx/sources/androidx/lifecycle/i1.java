package androidx.lifecycle;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
class i1 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f52362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g.a f52363b;

    i1(Object obj) {
        this.f52362a = obj;
        this.f52363b = g.f52336c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.j0
    public void e(o0 o0Var, c0.a aVar) {
        this.f52363b.a(o0Var, aVar, this.f52362a);
    }
}
