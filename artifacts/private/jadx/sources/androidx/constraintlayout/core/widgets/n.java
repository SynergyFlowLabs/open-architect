package androidx.constraintlayout.core.widgets;

import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public class n extends j {
    private int D1 = 0;
    private int E1 = 0;
    private int F1 = 0;
    private int G1 = 0;
    private int H1 = 0;
    private int I1 = 0;
    private int J1 = 0;
    private int K1 = 0;
    private boolean L1 = false;
    private int M1 = 0;
    private int N1 = 0;
    protected androidx.constraintlayout.core.widgets.analyzer.b.a O1 = new androidx.constraintlayout.core.widgets.analyzer.b.a();
    androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0360b P1 = null;

    protected void A2(boolean z10) {
        this.L1 = z10;
    }

    public void B2(int i10, int i11) {
        this.M1 = i10;
        this.N1 = i11;
    }

    public void C2(int i10) {
        this.F1 = i10;
        this.D1 = i10;
        this.G1 = i10;
        this.E1 = i10;
        this.H1 = i10;
        this.I1 = i10;
    }

    public void D2(int i10) {
        this.E1 = i10;
    }

    public void E2(int i10) {
        this.I1 = i10;
    }

    public void F2(int i10) {
        this.F1 = i10;
        this.J1 = i10;
    }

    public void G2(int i10) {
        this.G1 = i10;
        this.K1 = i10;
    }

    public void H2(int i10) {
        this.H1 = i10;
        this.J1 = i10;
        this.K1 = i10;
    }

    public void I2(int i10) {
        this.D1 = i10;
    }

    @Override // androidx.constraintlayout.core.widgets.j, androidx.constraintlayout.core.widgets.i
    public void c(f fVar) {
        o2();
    }

    public void n2(boolean z10) {
        int i10 = this.H1;
        if (i10 > 0 || this.I1 > 0) {
            if (z10) {
                this.J1 = this.I1;
                this.K1 = i10;
            } else {
                this.J1 = i10;
                this.K1 = this.I1;
            }
        }
    }

    public void o2() {
        for (int i10 = 0; i10 < this.C1; i10++) {
            e eVar = this.B1[i10];
            if (eVar != null) {
                eVar.J1(true);
            }
        }
    }

    public boolean p2(HashSet<e> hashSet) {
        for (int i10 = 0; i10 < this.C1; i10++) {
            if (hashSet.contains(this.B1[i10])) {
                return true;
            }
        }
        return false;
    }

    public int q2() {
        return this.N1;
    }

    public int r2() {
        return this.M1;
    }

    public int s2() {
        return this.E1;
    }

    public int t2() {
        return this.J1;
    }

    public int u2() {
        return this.K1;
    }

    public int v2() {
        return this.D1;
    }

    public void w2(int i10, int i11, int i12, int i13) {
    }

    protected void x2(e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        while (this.P1 == null && U() != null) {
            this.P1 = ((f) U()).H2();
        }
        androidx.constraintlayout.core.widgets.analyzer.b.a aVar = this.O1;
        aVar.f44529a = bVar;
        aVar.f44530b = bVar2;
        aVar.f44531c = i10;
        aVar.f44532d = i11;
        this.P1.b(eVar, aVar);
        eVar.d2(this.O1.f44533e);
        eVar.z1(this.O1.f44534f);
        eVar.y1(this.O1.f44536h);
        eVar.h1(this.O1.f44535g);
    }

    protected boolean y2() {
        e eVar = this.f44707c0;
        androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0360b interfaceC0360bH2 = eVar != null ? ((f) eVar).H2() : null;
        if (interfaceC0360bH2 == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.C1; i10++) {
            e eVar2 = this.B1[i10];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b bVarZ = eVar2.z(0);
                e.b bVarZ2 = eVar2.z(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarZ != bVar || eVar2.f44746w == 1 || bVarZ2 != bVar || eVar2.f44748x == 1) {
                    if (bVarZ == bVar) {
                        bVarZ = e.b.WRAP_CONTENT;
                    }
                    if (bVarZ2 == bVar) {
                        bVarZ2 = e.b.WRAP_CONTENT;
                    }
                    androidx.constraintlayout.core.widgets.analyzer.b.a aVar = this.O1;
                    aVar.f44529a = bVarZ;
                    aVar.f44530b = bVarZ2;
                    aVar.f44531c = eVar2.m0();
                    this.O1.f44532d = eVar2.D();
                    interfaceC0360bH2.b(eVar2, this.O1);
                    eVar2.d2(this.O1.f44533e);
                    eVar2.z1(this.O1.f44534f);
                    eVar2.h1(this.O1.f44535g);
                }
            }
        }
        return true;
    }

    public boolean z2() {
        return this.L1;
    }
}
