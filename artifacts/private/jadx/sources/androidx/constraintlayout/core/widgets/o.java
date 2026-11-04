package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class o extends e {
    public ArrayList<e> B1;

    public o() {
        this.B1 = new ArrayList<>();
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void R0() {
        this.B1.clear();
        super.R0();
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void R1(int i10, int i11) {
        super.R1(i10, i11);
        int size = this.B1.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.B1.get(i12).R1(Y(), Z());
        }
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void W0(androidx.constraintlayout.core.c cVar) {
        super.W0(cVar);
        int size = this.B1.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.B1.get(i10).W0(cVar);
        }
    }

    public void a(e eVar) {
        this.B1.add(eVar);
        if (eVar.U() != null) {
            ((o) eVar.U()).p2(eVar);
        }
        eVar.T1(this);
    }

    public void l2(e... eVarArr) {
        for (e eVar : eVarArr) {
            a(eVar);
        }
    }

    public ArrayList<e> m2() {
        return this.B1;
    }

    public f n2() {
        e eVarU = U();
        f fVar = this instanceof f ? (f) this : null;
        while (eVarU != null) {
            e eVarU2 = eVarU.U();
            if (eVarU instanceof f) {
                fVar = (f) eVarU;
            }
            eVarU = eVarU2;
        }
        return fVar;
    }

    public void o2() {
        ArrayList<e> arrayList = this.B1;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.B1.get(i10);
            if (eVar instanceof o) {
                ((o) eVar).o2();
            }
        }
    }

    public void p2(e eVar) {
        this.B1.remove(eVar);
        eVar.R0();
    }

    public void q2() {
        this.B1.clear();
    }

    public o(int i10, int i11, int i12, int i13) {
        super(i10, i11, i12, i13);
        this.B1 = new ArrayList<>();
    }

    public o(int i10, int i11) {
        super(i10, i11);
        this.B1 = new ArrayList<>();
    }
}
