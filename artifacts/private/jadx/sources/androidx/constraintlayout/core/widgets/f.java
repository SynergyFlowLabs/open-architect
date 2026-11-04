package androidx.constraintlayout.core.widgets;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class f extends o {

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    private static final int f44760h2 = 8;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    private static final boolean f44761i2 = false;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    private static final boolean f44762j2 = false;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    static final boolean f44763k2 = false;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    static int f44764l2;
    androidx.constraintlayout.core.widgets.analyzer.b C1;
    public androidx.constraintlayout.core.widgets.analyzer.e D1;
    private int E1;
    protected androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0360b F1;
    private boolean G1;
    public androidx.constraintlayout.core.f H1;
    protected androidx.constraintlayout.core.e I1;
    int J1;
    int K1;
    int L1;
    int M1;
    public int N1;
    public int O1;
    c[] P1;
    c[] Q1;
    public boolean R1;
    public boolean S1;
    public boolean T1;
    public int U1;
    public int V1;
    private int W1;
    public boolean X1;
    private boolean Y1;
    private boolean Z1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    int f44765a2;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    private WeakReference<d> f44766b2;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    private WeakReference<d> f44767c2;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    private WeakReference<d> f44768d2;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    private WeakReference<d> f44769e2;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    HashSet<e> f44770f2;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.b.a f44771g2;

    public f() {
        this.C1 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.D1 = new androidx.constraintlayout.core.widgets.analyzer.e(this);
        this.F1 = null;
        this.G1 = false;
        this.I1 = new androidx.constraintlayout.core.e();
        this.N1 = 0;
        this.O1 = 0;
        this.P1 = new c[4];
        this.Q1 = new c[4];
        this.R1 = false;
        this.S1 = false;
        this.T1 = false;
        this.U1 = 0;
        this.V1 = 0;
        this.W1 = 257;
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = false;
        this.f44765a2 = 0;
        this.f44766b2 = null;
        this.f44767c2 = null;
        this.f44768d2 = null;
        this.f44769e2 = null;
        this.f44770f2 = new HashSet<>();
        this.f44771g2 = new androidx.constraintlayout.core.widgets.analyzer.b.a();
    }

    public static boolean S2(int i10, e eVar, androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0360b interfaceC0360b, androidx.constraintlayout.core.widgets.analyzer.b.a aVar, int i11) {
        int i12;
        int i13;
        if (interfaceC0360b == null) {
            return false;
        }
        if (eVar.l0() == 8 || (eVar instanceof h) || (eVar instanceof a)) {
            aVar.f44533e = 0;
            aVar.f44534f = 0;
            return false;
        }
        aVar.f44529a = eVar.H();
        aVar.f44530b = eVar.j0();
        aVar.f44531c = eVar.m0();
        aVar.f44532d = eVar.D();
        aVar.f44537i = false;
        aVar.f44538j = i11;
        e.b bVar = aVar.f44529a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f44530b == bVar2;
        boolean z12 = z10 && eVar.f44713f0 > 0.0f;
        boolean z13 = z11 && eVar.f44713f0 > 0.0f;
        if (z10 && eVar.r0(0) && eVar.f44746w == 0 && !z12) {
            aVar.f44529a = e.b.WRAP_CONTENT;
            if (z11 && eVar.f44748x == 0) {
                aVar.f44529a = e.b.FIXED;
            }
            z10 = false;
        }
        if (z11 && eVar.r0(1) && eVar.f44748x == 0 && !z13) {
            aVar.f44530b = e.b.WRAP_CONTENT;
            if (z10 && eVar.f44746w == 0) {
                aVar.f44530b = e.b.FIXED;
            }
            z11 = false;
        }
        if (eVar.G0()) {
            aVar.f44529a = e.b.FIXED;
            z10 = false;
        }
        if (eVar.H0()) {
            aVar.f44530b = e.b.FIXED;
            z11 = false;
        }
        if (z12) {
            if (eVar.f44750y[0] == 4) {
                aVar.f44529a = e.b.FIXED;
            } else if (!z11) {
                e.b bVar3 = aVar.f44530b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i13 = aVar.f44532d;
                } else {
                    aVar.f44529a = e.b.WRAP_CONTENT;
                    interfaceC0360b.b(eVar, aVar);
                    i13 = aVar.f44534f;
                }
                aVar.f44529a = bVar4;
                aVar.f44531c = (int) (eVar.A() * i13);
            }
        }
        if (z13) {
            if (eVar.f44750y[1] == 4) {
                aVar.f44530b = e.b.FIXED;
            } else if (!z10) {
                e.b bVar5 = aVar.f44529a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i12 = aVar.f44531c;
                } else {
                    aVar.f44530b = e.b.WRAP_CONTENT;
                    interfaceC0360b.b(eVar, aVar);
                    i12 = aVar.f44533e;
                }
                aVar.f44530b = bVar6;
                if (eVar.B() == -1) {
                    aVar.f44532d = (int) (i12 / eVar.A());
                } else {
                    aVar.f44532d = (int) (eVar.A() * i12);
                }
            }
        }
        interfaceC0360b.b(eVar, aVar);
        eVar.d2(aVar.f44533e);
        eVar.z1(aVar.f44534f);
        eVar.y1(aVar.f44536h);
        eVar.h1(aVar.f44535g);
        aVar.f44538j = androidx.constraintlayout.core.widgets.analyzer.b.a.f44526k;
        return aVar.f44537i;
    }

    private void U2() {
        this.N1 = 0;
        this.O1 = 0;
    }

    private void t2(e eVar) {
        int i10 = this.N1 + 1;
        c[] cVarArr = this.Q1;
        if (i10 >= cVarArr.length) {
            this.Q1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Q1[this.N1] = new c(eVar, 0, P2());
        this.N1++;
    }

    private void w2(d dVar, androidx.constraintlayout.core.i iVar) {
        this.I1.h(iVar, this.I1.s(dVar), 0, 5);
    }

    private void x2(d dVar, androidx.constraintlayout.core.i iVar) {
        this.I1.h(this.I1.s(dVar), iVar, 0, 5);
    }

    private void y2(e eVar) {
        int i10 = this.O1 + 1;
        c[] cVarArr = this.P1;
        if (i10 >= cVarArr.length) {
            this.P1 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.P1[this.O1] = new c(eVar, 1, P2());
        this.O1++;
    }

    void A2(d dVar) {
        WeakReference<d> weakReference = this.f44766b2;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.f44766b2.get().f()) {
            this.f44766b2 = new WeakReference<>(dVar);
        }
    }

    public void B2() {
        this.D1.f(H(), j0());
    }

    public boolean C2(boolean z10) {
        return this.D1.g(z10);
    }

    public boolean D2(boolean z10) {
        return this.D1.h(z10);
    }

    public boolean E2(boolean z10, int i10) {
        return this.D1.i(z10, i10);
    }

    public void F2(androidx.constraintlayout.core.f fVar) {
        this.H1 = fVar;
        this.I1.D(fVar);
    }

    public ArrayList<h> G2() {
        ArrayList<h> arrayList = new ArrayList<>();
        int size = this.B1.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.B1.get(i10);
            if (eVar instanceof h) {
                h hVar = (h) eVar;
                if (hVar.o2() == 0) {
                    arrayList.add(hVar);
                }
            }
        }
        return arrayList;
    }

    public androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0360b H2() {
        return this.F1;
    }

    public int I2() {
        return this.W1;
    }

    public androidx.constraintlayout.core.e J2() {
        return this.I1;
    }

    public ArrayList<h> K2() {
        ArrayList<h> arrayList = new ArrayList<>();
        int size = this.B1.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.B1.get(i10);
            if (eVar instanceof h) {
                h hVar = (h) eVar;
                if (hVar.o2() == 1) {
                    arrayList.add(hVar);
                }
            }
        }
        return arrayList;
    }

    public boolean L2() {
        return false;
    }

    public void M2() {
        this.D1.o();
    }

    public void N2() {
        this.D1.p();
    }

    public boolean O2() {
        return this.Z1;
    }

    public boolean P2() {
        return this.G1;
    }

    public boolean Q2() {
        return this.Y1;
    }

    @Override // androidx.constraintlayout.core.widgets.o, androidx.constraintlayout.core.widgets.e
    public void R0() {
        this.I1.W();
        this.J1 = 0;
        this.L1 = 0;
        this.K1 = 0;
        this.M1 = 0;
        this.X1 = false;
        super.R0();
    }

    public long R2(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.J1 = i17;
        this.K1 = i18;
        return this.C1.d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    public boolean T2(int i10) {
        if ((this.W1 & i10) != i10) {
            return false;
        }
        int i11 = 0 << 1;
        return true;
    }

    public void V2(androidx.constraintlayout.core.widgets.analyzer.b.InterfaceC0360b interfaceC0360b) {
        this.F1 = interfaceC0360b;
        this.D1.u(interfaceC0360b);
    }

    public void W2(int i10) {
        this.W1 = i10;
        androidx.constraintlayout.core.e.f43353w = T2(512);
    }

    public void X2(int i10, int i11, int i12, int i13) {
        this.J1 = i10;
        this.K1 = i11;
        this.L1 = i12;
        this.M1 = i13;
    }

    public void Y2(int i10) {
        this.E1 = i10;
    }

    public void Z2(boolean z10) {
        this.G1 = z10;
    }

    public boolean a3(androidx.constraintlayout.core.e eVar, boolean[] zArr) {
        zArr[2] = false;
        boolean zT2 = T2(64);
        k2(eVar, zT2);
        int size = this.B1.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar2 = this.B1.get(i10);
            eVar2.k2(eVar, zT2);
            if (eVar2.t0()) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void b0(StringBuilder sb2) {
        sb2.append(this.f44730o + ":{\n");
        sb2.append("  actualWidth:" + this.f44709d0);
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.f44711e0);
        sb2.append("\n");
        Iterator<e> it = m2().iterator();
        while (it.hasNext()) {
            it.next().b0(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }

    public void b3() {
        this.C1.e(this);
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public String f0() {
        return "ConstraintLayout";
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void j2(boolean z10, boolean z11) {
        super.j2(z10, z11);
        int size = this.B1.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.B1.get(i10).j2(z10, z11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x022b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0234  */
    /* JADX WARN: Code duplicated, block: B:127:0x023d A[LOOP:5: B:126:0x023b->B:127:0x023d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:146:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:149:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:152:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:154:0x0308  */
    /* JADX WARN: Code duplicated, block: B:160:0x032c  */
    /* JADX WARN: Code duplicated, block: B:167:0x034d A[PHI: r13 r19
      0x034d: PHI (r13v9 ??) = (r13v8 ??), (r13v11 ??), (r13v11 ??), (r13v11 ??) binds: [B:153:0x0306, B:162:0x0332, B:163:0x0334, B:165:0x033a] A[DONT_GENERATE, DONT_INLINE]
      0x034d: PHI (r19v4 ??) = (r19v3 ??), (r19v6 ??), (r19v6 ??), (r19v6 ??) binds: [B:153:0x0306, B:162:0x0332, B:163:0x0334, B:165:0x033a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:169:0x0351  */
    /* JADX WARN: Code duplicated, block: B:170:0x0356  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v23 */
    /* JADX WARN: Type inference failed for: r19v24 */
    /* JADX WARN: Type inference failed for: r19v25 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean] */
    @Override // androidx.constraintlayout.core.widgets.o
    public void o2() {
        int i10;
        int i11;
        boolean z10;
        int i12;
        ?? r18;
        char c10;
        ?? S2;
        int i13;
        ?? A3;
        ?? r19;
        int iMax;
        ?? r110;
        ?? r13;
        int iMax2;
        ?? r111;
        ?? r14;
        int i14;
        ?? r112;
        ?? r15;
        ?? r16;
        e.b bVar;
        e.b bVar2;
        ?? r10;
        ?? r17;
        ?? r11;
        e.b bVar3;
        int i15 = 0;
        this.f44717h0 = 0;
        this.f44719i0 = 0;
        this.Y1 = false;
        this.Z1 = false;
        int size = this.B1.size();
        int iMax3 = Math.max(0, m0());
        int iMax4 = Math.max(0, D());
        e.b[] bVarArr = this.f44705b0;
        boolean z11 = true;
        e.b bVar4 = bVarArr[1];
        e.b bVar5 = bVarArr[0];
        androidx.constraintlayout.core.f fVar = this.H1;
        if (fVar != null) {
            fVar.K++;
        }
        if (this.E1 == 0 && k.b(this.W1, 1)) {
            androidx.constraintlayout.core.widgets.analyzer.h.j(this, H2());
            for (int i16 = 0; i16 < size; i16++) {
                e eVar = this.B1.get(i16);
                if (eVar.F0() && !(eVar instanceof h) && !(eVar instanceof a) && !(eVar instanceof n) && !eVar.E0()) {
                    e.b bVarZ = eVar.z(0);
                    e.b bVarZ2 = eVar.z(1);
                    e.b bVar6 = e.b.MATCH_CONSTRAINT;
                    if (bVarZ != bVar6 || eVar.f44746w == 1 || bVarZ2 != bVar6 || eVar.f44748x == 1) {
                        S2(0, eVar, this.F1, new androidx.constraintlayout.core.widgets.analyzer.b.a(), androidx.constraintlayout.core.widgets.analyzer.b.a.f44526k);
                    }
                }
            }
        }
        char c11 = 2;
        if (size <= 2 || !((bVar5 == (bVar3 = e.b.WRAP_CONTENT) || bVar4 == bVar3) && k.b(this.W1, 1024) && androidx.constraintlayout.core.widgets.analyzer.i.c(this, H2()))) {
            i10 = iMax4;
            i11 = iMax3;
            z10 = false;
        } else {
            if (bVar5 == bVar3) {
                if (iMax3 >= m0() || iMax3 <= 0) {
                    iMax3 = m0();
                } else {
                    d2(iMax3);
                    this.Y1 = true;
                }
            }
            if (bVar4 == bVar3) {
                if (iMax4 >= D() || iMax4 <= 0) {
                    iMax4 = D();
                } else {
                    z1(iMax4);
                    this.Z1 = true;
                }
            }
            i10 = iMax4;
            i11 = iMax3;
            z10 = true;
        }
        boolean z12 = T2(64) || T2(128);
        androidx.constraintlayout.core.e eVar2 = this.I1;
        eVar2.f43365i = false;
        eVar2.f43366j = false;
        if (this.W1 != 0 && z12) {
            eVar2.f43366j = true;
        }
        ArrayList<e> arrayList = this.B1;
        e.b bVarH = H();
        e.b bVar7 = e.b.WRAP_CONTENT;
        boolean z13 = bVarH == bVar7 || j0() == bVar7;
        U2();
        for (int i17 = 0; i17 < size; i17++) {
            e eVar3 = this.B1.get(i17);
            if (eVar3 instanceof o) {
                ((o) eVar3).o2();
            }
        }
        boolean zT2 = T2(64);
        ?? r113 = z10;
        int i18 = 0;
        ?? r114 = 1;
        while (r114 != 0) {
            int i19 = i18 + 1;
            try {
                this.I1.W();
                U2();
                o(this.I1);
                int i20 = i15;
                while (i20 < size) {
                    i12 = i15;
                    try {
                        c10 = c11;
                        try {
                            this.B1.get(i20).o(this.I1);
                            i20++;
                            i15 = i12;
                            c11 = c10;
                        } catch (Exception e10) {
                            e = e10;
                            r18 = z11;
                            S2 = r114;
                            e.printStackTrace();
                            System.out.println("EXCEPTION : " + e);
                            if (S2 != 0) {
                                A3 = a3(this.I1, k.f44830n);
                            } else {
                                k2(this.I1, zT2);
                                for (i13 = i12; i13 < size; i13++) {
                                    this.B1.get(i13).k2(this.I1, zT2);
                                }
                                A3 = i12;
                            }
                            if (z13) {
                                r19 = A3 == true ? 1 : 0;
                            } else {
                                r19 = A3 == true ? 1 : 0;
                            }
                            iMax = Math.max(this.f44731o0, m0());
                            r13 = r113;
                            r110 = r19;
                            if (iMax > m0()) {
                                d2(iMax);
                                this.f44705b0[i12] = e.b.FIXED;
                                ?? r115 = r18;
                                r110 = r115 == true ? 1 : 0;
                                r13 = r115;
                            }
                            iMax2 = Math.max(this.f44733p0, D());
                            r14 = r13;
                            r111 = r110;
                            if (iMax2 > D()) {
                                z1(iMax2);
                                this.f44705b0[r18] = e.b.FIXED;
                                r17 = r18;
                                r111 = r17 == true ? 1 : 0;
                            }
                            if (r14 == 0) {
                                bVar = this.f44705b0[i12];
                                bVar2 = e.b.WRAP_CONTENT;
                                if (bVar == bVar2) {
                                    r14 = r17;
                                    r10 = r18;
                                    r14 = r14;
                                    r111 = r111;
                                } else {
                                    r14 = r17;
                                    r10 = r18;
                                    r14 = r14;
                                    r111 = r111;
                                }
                                if (this.f44705b0[r10] == bVar2) {
                                    r14 = r17;
                                    i14 = 8;
                                    r15 = r14;
                                    r112 = r111;
                                } else {
                                    r14 = r17;
                                    i14 = 8;
                                    r15 = r14;
                                    r112 = r111;
                                }
                            } else {
                                r14 = r17;
                                i14 = 8;
                                r15 = r14;
                                r112 = r111;
                            }
                            if (i19 > i14) {
                                r16 = i12;
                            } else {
                                r16 = r112;
                            }
                            i18 = i19;
                            i15 = i12;
                            c11 = c10;
                            z11 = true;
                            r113 = r15;
                            r114 = r16;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        c10 = c11;
                    }
                }
                i12 = i15;
                c10 = c11;
                S2 = s2(this.I1);
                WeakReference<d> weakReference = this.f44766b2;
                if (weakReference == null || weakReference.get() == null) {
                    r18 = z11;
                } else {
                    boolean z14 = z11;
                    try {
                        x2(this.f44766b2.get(), this.I1.s(this.R));
                        this.f44766b2 = null;
                        r18 = z14;
                    } catch (Exception e12) {
                        e = e12;
                        S2 = S2;
                        r18 = z14;
                        e.printStackTrace();
                        System.out.println("EXCEPTION : " + e);
                    }
                }
                WeakReference<d> weakReference2 = this.f44768d2;
                if (weakReference2 != null && weakReference2.get() != null) {
                    w2(this.f44768d2.get(), this.I1.s(this.T));
                    this.f44768d2 = null;
                }
                WeakReference<d> weakReference3 = this.f44767c2;
                if (weakReference3 != null && weakReference3.get() != null) {
                    x2(this.f44767c2.get(), this.I1.s(this.Q));
                    this.f44767c2 = null;
                }
                WeakReference<d> weakReference4 = this.f44769e2;
                if (weakReference4 != null && weakReference4.get() != null) {
                    w2(this.f44769e2.get(), this.I1.s(this.S));
                    this.f44769e2 = null;
                }
                if (S2 != 0) {
                    this.I1.R();
                }
            } catch (Exception e13) {
                e = e13;
                i12 = i15;
                r18 = z11;
                c10 = c11;
                S2 = r114;
            }
            if (S2 != 0) {
                A3 = a3(this.I1, k.f44830n);
            } else {
                k2(this.I1, zT2);
                while (i13 < size) {
                    this.B1.get(i13).k2(this.I1, zT2);
                }
                A3 = i12;
            }
            if (z13 || i19 >= 8 || !k.f44830n[c10]) {
                r19 = A3 == true ? 1 : 0;
            } else {
                int i21 = i12;
                int iMax5 = i21;
                int iMax6 = iMax5;
                while (i21 < size) {
                    r11 = A3;
                    e eVar4 = this.B1.get(i21);
                    iMax5 = Math.max(iMax5, eVar4.f44717h0 + eVar4.m0());
                    iMax6 = Math.max(iMax6, eVar4.f44719i0 + eVar4.D());
                    i21++;
                    r11 = r11 == true ? 1 : 0;
                }
                r11 = A3;
                ?? r116 = r11;
                int iMax7 = Math.max(this.f44731o0, iMax5);
                int iMax8 = Math.max(this.f44733p0, iMax6);
                e.b bVar8 = e.b.WRAP_CONTENT;
                r113 = r113;
                r19 = r116;
                if (bVar5 == bVar8 && m0() < iMax7) {
                    r113 = r113;
                    r19 = r116;
                    d2(iMax7);
                    this.f44705b0[i12] = bVar8;
                    ?? r117 = r18;
                    r19 = r117 == true ? 1 : 0;
                    r113 = r117;
                }
                if (bVar4 == bVar8 && D() < iMax8) {
                    z1(iMax8);
                    this.f44705b0[r18] = bVar8;
                    r113 = r18;
                    r19 = r113 == true ? 1 : 0;
                }
            }
            iMax = Math.max(this.f44731o0, m0());
            r13 = r113;
            r110 = r19;
            if (iMax > m0()) {
                d2(iMax);
                this.f44705b0[i12] = e.b.FIXED;
                ?? r118 = r18;
                r110 = r118 == true ? 1 : 0;
                r13 = r118;
            }
            iMax2 = Math.max(this.f44733p0, D());
            r14 = r13;
            r111 = r110;
            if (iMax2 > D()) {
                z1(iMax2);
                this.f44705b0[r18] = e.b.FIXED;
                r17 = r18;
                r111 = r17 == true ? 1 : 0;
            }
            if (r14 == 0) {
                bVar = this.f44705b0[i12];
                bVar2 = e.b.WRAP_CONTENT;
                if (bVar == bVar2 || i11 <= 0 || m0() <= i11) {
                    r14 = r17;
                    r10 = r18;
                    r14 = r14;
                    r111 = r111;
                } else {
                    ?? r12 = r18;
                    this.Y1 = r12;
                    this.f44705b0[i12] = e.b.FIXED;
                    d2(i11);
                    boolean z15 = r12 == true ? 1 : 0;
                    r111 = z15 ? 1 : 0;
                    r10 = r12;
                    r14 = z15;
                }
                if (this.f44705b0[r10] == bVar2 || i10 <= 0 || D() <= i10) {
                    r14 = r17;
                    i14 = 8;
                    r15 = r14;
                    r112 = r111;
                } else {
                    this.Z1 = r10;
                    this.f44705b0[r10] = e.b.FIXED;
                    z1(i10);
                    i14 = 8;
                    r15 = 1;
                    r112 = 1;
                }
            } else {
                r14 = r17;
                i14 = 8;
                r15 = r14;
                r112 = r111;
            }
            if (i19 > i14) {
                r16 = i12;
            } else {
                r16 = r112;
            }
            i18 = i19;
            i15 = i12;
            c11 = c10;
            z11 = true;
            r113 = r15;
            r114 = r16;
        }
        int i22 = i15;
        this.B1 = arrayList;
        if (r113 != 0) {
            e.b[] bVarArr2 = this.f44705b0;
            bVarArr2[i22] = bVar5;
            bVarArr2[1] = bVar4;
        }
        W0(this.I1.E());
    }

    void r2(e eVar, int i10) {
        if (i10 == 0) {
            t2(eVar);
        } else if (i10 == 1) {
            y2(eVar);
        }
    }

    public boolean s2(androidx.constraintlayout.core.e eVar) {
        f fVar;
        androidx.constraintlayout.core.e eVar2;
        boolean zT2 = T2(64);
        g(eVar, zT2);
        int size = this.B1.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar3 = this.B1.get(i10);
            eVar3.H1(0, false);
            eVar3.H1(1, false);
            if (eVar3 instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar4 = this.B1.get(i11);
                if (eVar4 instanceof a) {
                    ((a) eVar4).t2();
                }
            }
        }
        this.f44770f2.clear();
        for (int i12 = 0; i12 < size; i12++) {
            e eVar5 = this.B1.get(i12);
            if (eVar5.f()) {
                if (eVar5 instanceof n) {
                    this.f44770f2.add(eVar5);
                } else {
                    eVar5.g(eVar, zT2);
                }
            }
        }
        while (this.f44770f2.size() > 0) {
            int size2 = this.f44770f2.size();
            Iterator<e> it = this.f44770f2.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                if (nVar.p2(this.f44770f2)) {
                    nVar.g(eVar, zT2);
                    this.f44770f2.remove(nVar);
                    break;
                }
            }
            if (size2 == this.f44770f2.size()) {
                Iterator<e> it2 = this.f44770f2.iterator();
                while (it2.hasNext()) {
                    it2.next().g(eVar, zT2);
                }
                this.f44770f2.clear();
            }
        }
        if (androidx.constraintlayout.core.e.f43353w) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i13 = 0; i13 < size; i13++) {
                e eVar6 = this.B1.get(i13);
                if (!eVar6.f()) {
                    hashSet.add(eVar6);
                }
            }
            fVar = this;
            eVar2 = eVar;
            fVar.e(this, eVar2, hashSet, H() == e.b.WRAP_CONTENT ? 0 : 1, false);
            for (e eVar7 : hashSet) {
                k.a(fVar, eVar2, eVar7);
                eVar7.g(eVar2, zT2);
            }
        } else {
            fVar = this;
            eVar2 = eVar;
            for (int i14 = 0; i14 < size; i14++) {
                e eVar8 = fVar.B1.get(i14);
                if (eVar8 instanceof f) {
                    e.b[] bVarArr = eVar8.f44705b0;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar8.E1(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar8.Z1(e.b.FIXED);
                    }
                    eVar8.g(eVar2, zT2);
                    if (bVar == bVar3) {
                        eVar8.E1(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar8.Z1(bVar2);
                    }
                } else {
                    k.a(fVar, eVar2, eVar8);
                    if (!eVar8.f()) {
                        eVar8.g(eVar2, zT2);
                    }
                }
            }
        }
        if (fVar.N1 > 0) {
            b.b(fVar, eVar2, null, 0);
        }
        if (fVar.O1 > 0) {
            b.b(fVar, eVar2, null, 1);
        }
        return true;
    }

    public void u2(d dVar) {
        WeakReference<d> weakReference = this.f44769e2;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.f44769e2.get().f()) {
            this.f44769e2 = new WeakReference<>(dVar);
        }
    }

    public void v2(d dVar) {
        WeakReference<d> weakReference = this.f44767c2;
        if (weakReference != null && weakReference.get() != null && dVar.f() <= this.f44767c2.get().f()) {
            return;
        }
        this.f44767c2 = new WeakReference<>(dVar);
    }

    void z2(d dVar) {
        WeakReference<d> weakReference = this.f44768d2;
        if (weakReference == null || weakReference.get() == null || dVar.f() > this.f44768d2.get().f()) {
            this.f44768d2 = new WeakReference<>(dVar);
        }
    }

    public f(int i10, int i11, int i12, int i13) {
        super(i10, i11, i12, i13);
        this.C1 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.D1 = new androidx.constraintlayout.core.widgets.analyzer.e(this);
        this.F1 = null;
        this.G1 = false;
        this.I1 = new androidx.constraintlayout.core.e();
        this.N1 = 0;
        this.O1 = 0;
        this.P1 = new c[4];
        this.Q1 = new c[4];
        this.R1 = false;
        this.S1 = false;
        this.T1 = false;
        this.U1 = 0;
        this.V1 = 0;
        this.W1 = 257;
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = false;
        this.f44765a2 = 0;
        this.f44766b2 = null;
        this.f44767c2 = null;
        this.f44768d2 = null;
        this.f44769e2 = null;
        this.f44770f2 = new HashSet<>();
        this.f44771g2 = new androidx.constraintlayout.core.widgets.analyzer.b.a();
    }

    public f(int i10, int i11) {
        super(i10, i11);
        this.C1 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.D1 = new androidx.constraintlayout.core.widgets.analyzer.e(this);
        this.F1 = null;
        this.G1 = false;
        this.I1 = new androidx.constraintlayout.core.e();
        this.N1 = 0;
        this.O1 = 0;
        this.P1 = new c[4];
        this.Q1 = new c[4];
        this.R1 = false;
        this.S1 = false;
        this.T1 = false;
        this.U1 = 0;
        this.V1 = 0;
        this.W1 = 257;
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = false;
        this.f44765a2 = 0;
        this.f44766b2 = null;
        this.f44767c2 = null;
        this.f44768d2 = null;
        this.f44769e2 = null;
        this.f44770f2 = new HashSet<>();
        this.f44771g2 = new androidx.constraintlayout.core.widgets.analyzer.b.a();
    }

    public f(String str, int i10, int i11) {
        super(i10, i11);
        this.C1 = new androidx.constraintlayout.core.widgets.analyzer.b(this);
        this.D1 = new androidx.constraintlayout.core.widgets.analyzer.e(this);
        this.F1 = null;
        this.G1 = false;
        this.I1 = new androidx.constraintlayout.core.e();
        this.N1 = 0;
        this.O1 = 0;
        this.P1 = new c[4];
        this.Q1 = new c[4];
        this.R1 = false;
        this.S1 = false;
        this.T1 = false;
        this.U1 = 0;
        this.V1 = 0;
        this.W1 = 257;
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = false;
        this.f44765a2 = 0;
        this.f44766b2 = null;
        this.f44767c2 = null;
        this.f44768d2 = null;
        this.f44769e2 = null;
        this.f44770f2 = new HashSet<>();
        this.f44771g2 = new androidx.constraintlayout.core.widgets.analyzer.b.a();
        k1(str);
    }
}
