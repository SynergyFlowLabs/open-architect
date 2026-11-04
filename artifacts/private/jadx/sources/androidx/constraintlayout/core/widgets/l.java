package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes2.dex */
public class l extends n {
    @Override // androidx.constraintlayout.core.widgets.e
    public void g(androidx.constraintlayout.core.e eVar, boolean z10) {
        super.g(eVar, z10);
        if (this.C1 > 0) {
            e eVar2 = this.B1[0];
            eVar2.S0();
            d.a aVar = d.a.LEFT;
            eVar2.j(aVar, this, aVar);
            d.a aVar2 = d.a.RIGHT;
            eVar2.j(aVar2, this, aVar2);
            d.a aVar3 = d.a.TOP;
            eVar2.j(aVar3, this, aVar3);
            d.a aVar4 = d.a.BOTTOM;
            eVar2.j(aVar4, this, aVar4);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.n
    public void w2(int i10, int i11, int i12, int i13) {
        int iT2 = t2() + u2();
        int iV2 = v2() + s2();
        if (this.C1 > 0) {
            iT2 += this.B1[0].m0();
            iV2 += this.B1[0].D();
        }
        int iMax = Math.max(Q(), iT2);
        int iMax2 = Math.max(P(), iV2);
        if (i10 != 1073741824) {
            if (i10 == Integer.MIN_VALUE) {
                i11 = Math.min(iMax, i11);
            } else {
                i11 = i10 == 0 ? iMax : 0;
            }
        }
        if (i12 != 1073741824) {
            if (i12 == Integer.MIN_VALUE) {
                i13 = Math.min(iMax2, i13);
            } else {
                i13 = i12 == 0 ? iMax2 : 0;
            }
        }
        B2(i11, i13);
        d2(i11);
        z1(i13);
        A2(this.C1 > 0);
    }
}
