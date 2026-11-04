package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: loaded from: classes2.dex */
class j extends p {
    j(androidx.constraintlayout.core.widgets.e eVar) {
        super(eVar);
        eVar.f44710e.f();
        eVar.f44712f.f();
        this.f44620f = ((androidx.constraintlayout.core.widgets.h) eVar).o2();
    }

    private void u(f fVar) {
        this.f44622h.f44562k.add(fVar);
        fVar.f44563l.add(this.f44622h);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p, androidx.constraintlayout.core.widgets.analyzer.d
    public void a(d dVar) {
        f fVar = this.f44622h;
        if (fVar.f44554c && !fVar.f44561j) {
            this.f44622h.e((int) ((fVar.f44563l.get(0).f44558g * ((androidx.constraintlayout.core.widgets.h) this.f44616b).s2()) + 0.5f));
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void d() {
        androidx.constraintlayout.core.widgets.h hVar = (androidx.constraintlayout.core.widgets.h) this.f44616b;
        int iP2 = hVar.p2();
        int iR2 = hVar.r2();
        hVar.s2();
        if (hVar.o2() == 1) {
            if (iP2 != -1) {
                this.f44622h.f44563l.add(this.f44616b.f44707c0.f44710e.f44622h);
                this.f44616b.f44707c0.f44710e.f44622h.f44562k.add(this.f44622h);
                this.f44622h.f44557f = iP2;
            } else if (iR2 != -1) {
                this.f44622h.f44563l.add(this.f44616b.f44707c0.f44710e.f44623i);
                this.f44616b.f44707c0.f44710e.f44623i.f44562k.add(this.f44622h);
                this.f44622h.f44557f = -iR2;
            } else {
                f fVar = this.f44622h;
                fVar.f44553b = true;
                fVar.f44563l.add(this.f44616b.f44707c0.f44710e.f44623i);
                this.f44616b.f44707c0.f44710e.f44623i.f44562k.add(this.f44622h);
            }
            u(this.f44616b.f44710e.f44622h);
            u(this.f44616b.f44710e.f44623i);
            return;
        }
        if (iP2 != -1) {
            this.f44622h.f44563l.add(this.f44616b.f44707c0.f44712f.f44622h);
            this.f44616b.f44707c0.f44712f.f44622h.f44562k.add(this.f44622h);
            this.f44622h.f44557f = iP2;
        } else if (iR2 != -1) {
            this.f44622h.f44563l.add(this.f44616b.f44707c0.f44712f.f44623i);
            this.f44616b.f44707c0.f44712f.f44623i.f44562k.add(this.f44622h);
            this.f44622h.f44557f = -iR2;
        } else {
            f fVar2 = this.f44622h;
            fVar2.f44553b = true;
            fVar2.f44563l.add(this.f44616b.f44707c0.f44712f.f44623i);
            this.f44616b.f44707c0.f44712f.f44623i.f44562k.add(this.f44622h);
        }
        u(this.f44616b.f44712f.f44622h);
        u(this.f44616b.f44712f.f44623i);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void e() {
        if (((androidx.constraintlayout.core.widgets.h) this.f44616b).o2() == 1) {
            this.f44616b.g2(this.f44622h.f44558g);
        } else {
            this.f44616b.h2(this.f44622h.f44558g);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void f() {
        this.f44622h.c();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    void n() {
        this.f44622h.f44561j = false;
        this.f44623i.f44561j = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    boolean p() {
        return false;
    }
}
