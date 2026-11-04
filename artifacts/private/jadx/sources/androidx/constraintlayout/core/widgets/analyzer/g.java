package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: loaded from: classes2.dex */
class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f44573m;

    g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f44556e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f44556e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.f
    public void e(int i10) {
        if (!this.f44561j) {
            this.f44561j = true;
            this.f44558g = i10;
            for (d dVar : this.f44562k) {
                dVar.a(dVar);
            }
        }
    }
}
