package androidx.constraintlayout.core.widgets.analyzer;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
class k extends p {
    k(androidx.constraintlayout.core.widgets.e eVar) {
        super(eVar);
    }

    private void u(f fVar) {
        this.f44622h.f44562k.add(fVar);
        fVar.f44563l.add(this.f44622h);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p, androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) this.f44616b;
        int iQ2 = aVar.q2();
        Iterator<f> it = this.f44622h.f44563l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = it.next().f44558g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (iQ2 == 0 || iQ2 == 2) {
            this.f44622h.e(i11 + aVar.r2());
        } else {
            this.f44622h.e(i10 + aVar.r2());
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void d() {
        androidx.constraintlayout.core.widgets.e eVar = this.f44616b;
        if (eVar instanceof androidx.constraintlayout.core.widgets.a) {
            this.f44622h.f44553b = true;
            androidx.constraintlayout.core.widgets.a aVar = (androidx.constraintlayout.core.widgets.a) eVar;
            int iQ2 = aVar.q2();
            boolean zP2 = aVar.p2();
            int i10 = 0;
            if (iQ2 == 0) {
                this.f44622h.f44556e = f.a.LEFT;
                while (i10 < aVar.C1) {
                    androidx.constraintlayout.core.widgets.e eVar2 = aVar.B1[i10];
                    if (zP2 || eVar2.l0() != 8) {
                        f fVar = eVar2.f44710e.f44622h;
                        fVar.f44562k.add(this.f44622h);
                        this.f44622h.f44563l.add(fVar);
                    }
                    i10++;
                }
                u(this.f44616b.f44710e.f44622h);
                u(this.f44616b.f44710e.f44623i);
                return;
            }
            if (iQ2 == 1) {
                this.f44622h.f44556e = f.a.RIGHT;
                while (i10 < aVar.C1) {
                    androidx.constraintlayout.core.widgets.e eVar3 = aVar.B1[i10];
                    if (zP2 || eVar3.l0() != 8) {
                        f fVar2 = eVar3.f44710e.f44623i;
                        fVar2.f44562k.add(this.f44622h);
                        this.f44622h.f44563l.add(fVar2);
                    }
                    i10++;
                }
                u(this.f44616b.f44710e.f44622h);
                u(this.f44616b.f44710e.f44623i);
                return;
            }
            if (iQ2 == 2) {
                this.f44622h.f44556e = f.a.TOP;
                while (i10 < aVar.C1) {
                    androidx.constraintlayout.core.widgets.e eVar4 = aVar.B1[i10];
                    if (zP2 || eVar4.l0() != 8) {
                        f fVar3 = eVar4.f44712f.f44622h;
                        fVar3.f44562k.add(this.f44622h);
                        this.f44622h.f44563l.add(fVar3);
                    }
                    i10++;
                }
                u(this.f44616b.f44712f.f44622h);
                u(this.f44616b.f44712f.f44623i);
                return;
            }
            if (iQ2 != 3) {
                return;
            }
            this.f44622h.f44556e = f.a.BOTTOM;
            while (i10 < aVar.C1) {
                androidx.constraintlayout.core.widgets.e eVar5 = aVar.B1[i10];
                if (zP2 || eVar5.l0() != 8) {
                    f fVar4 = eVar5.f44712f.f44623i;
                    fVar4.f44562k.add(this.f44622h);
                    this.f44622h.f44563l.add(fVar4);
                }
                i10++;
            }
            u(this.f44616b.f44712f.f44622h);
            u(this.f44616b.f44712f.f44623i);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void e() {
        androidx.constraintlayout.core.widgets.e eVar = this.f44616b;
        if (eVar instanceof androidx.constraintlayout.core.widgets.a) {
            int iQ2 = ((androidx.constraintlayout.core.widgets.a) eVar).q2();
            if (iQ2 == 0 || iQ2 == 1) {
                this.f44616b.g2(this.f44622h.f44558g);
            } else {
                this.f44616b.h2(this.f44622h.f44558g);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void f() {
        this.f44617c = null;
        this.f44622h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void n() {
        this.f44622h.f44561j = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    boolean p() {
        return false;
    }
}
