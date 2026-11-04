package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class j extends e implements i {
    public e[] B1 = new e[4];
    public int C1 = 0;

    @Override // androidx.constraintlayout.core.widgets.i
    public void a(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i10 = this.C1 + 1;
        e[] eVarArr = this.B1;
        if (i10 > eVarArr.length) {
            this.B1 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.B1;
        int i11 = this.C1;
        eVarArr2[i11] = eVar;
        this.C1 = i11 + 1;
    }

    @Override // androidx.constraintlayout.core.widgets.i
    public void b() {
        this.C1 = 0;
        Arrays.fill(this.B1, (Object) null);
    }

    @Override // androidx.constraintlayout.core.widgets.i
    public void c(f fVar) {
    }

    public void l2(ArrayList<androidx.constraintlayout.core.widgets.analyzer.o> arrayList, int i10, androidx.constraintlayout.core.widgets.analyzer.o oVar) {
        for (int i11 = 0; i11 < this.C1; i11++) {
            oVar.a(this.B1[i11]);
        }
        for (int i12 = 0; i12 < this.C1; i12++) {
            androidx.constraintlayout.core.widgets.analyzer.i.a(this.B1[i12], i10, arrayList, oVar);
        }
    }

    public int m2(int i10) {
        int i11;
        int i12;
        for (int i13 = 0; i13 < this.C1; i13++) {
            e eVar = this.B1[i13];
            if (i10 == 0 && (i12 = eVar.S0) != -1) {
                return i12;
            }
            if (i10 == 1 && (i11 = eVar.T0) != -1) {
                return i11;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void n(e eVar, HashMap<e, e> map) {
        super.n(eVar, map);
        j jVar = (j) eVar;
        this.C1 = 0;
        int i10 = jVar.C1;
        for (int i11 = 0; i11 < i10; i11++) {
            a(map.get(jVar.B1[i11]));
        }
    }
}
