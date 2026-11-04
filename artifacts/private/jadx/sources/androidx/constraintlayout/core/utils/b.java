package androidx.constraintlayout.core.utils;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.core.widgets.f;
import androidx.constraintlayout.core.widgets.n;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class b extends n {

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public static final int f44480l2 = 0;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public static final int f44481m2 = 1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public static final int f44482n2 = 1;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public static final int f44483o2 = 2;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final int f44484p2 = 3;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    private static final int f44485q2 = 50;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    private static final int f44486r2 = 50;
    f Q1;
    private e[] R1;
    private int T1;
    private int U1;
    private int V1;
    private int W1;
    private float X1;
    private float Y1;
    private String Z1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    private String f44487a2;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    private String f44488b2;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    private String f44489c2;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    private int f44490d2;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    private boolean[][] f44492f2;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    private int[][] f44494h2;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    private int f44495i2;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    private int[][] f44496j2;
    private boolean S1 = false;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    private int f44491e2 = 0;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    Set<String> f44493g2 = new HashSet();

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    private int f44497k2 = 0;

    public b() {
        z3();
        d3();
    }

    public static /* synthetic */ int J2(String str, String str2) {
        return Integer.parseInt(str.split(":")[0]) - Integer.parseInt(str2.split(":")[0]);
    }

    private void K2() {
        m3();
        l3();
        L2();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    private void L2() {
        b bVar;
        int[][] iArr;
        int i10;
        int i11 = 0;
        while (i11 < this.C1) {
            if (this.f44493g2.contains(this.B1[i11].f44730o)) {
                bVar = this;
            } else {
                int iW2 = this.W2();
                int iY2 = this.Y2(iW2);
                int iR2 = this.R2(iW2);
                if (iW2 == -1) {
                    break;
                }
                if (!this.g3() || (iArr = this.f44496j2) == null || (i10 = this.f44497k2) >= iArr.length) {
                    bVar = this;
                    bVar.O2(bVar.B1[i11], iY2, iR2, 1, 1);
                } else {
                    int[] iArr2 = iArr[i10];
                    if (iArr2[0] == iW2) {
                        this.f44492f2[iY2][iR2] = true;
                        int i12 = 6 ^ 2;
                        if (this.f3(iY2, iR2, iArr2[1], iArr2[2])) {
                            e eVar = this.B1[i11];
                            int[] iArr3 = this.f44496j2[this.f44497k2];
                            int i13 = iArr3[1];
                            int i14 = iArr3[2];
                            bVar = this;
                            bVar.O2(eVar, iY2, iR2, i13, i14);
                            bVar.f44497k2++;
                        } else {
                            bVar = this;
                        }
                    } else {
                        bVar = this;
                        bVar.O2(bVar.B1[i11], iY2, iR2, 1, 1);
                    }
                }
            }
            i11++;
            this = bVar;
        }
    }

    private void M2(e eVar) {
        eVar.G1(-1.0f);
        eVar.Q.x();
        eVar.S.x();
    }

    private void N2(e eVar) {
        eVar.b2(-1.0f);
        eVar.R.x();
        eVar.T.x();
        eVar.U.x();
    }

    private void O2(e eVar, int i10, int i11, int i12, int i13) {
        eVar.Q.a(this.R1[i11].Q, 0);
        eVar.R.a(this.R1[i10].R, 0);
        eVar.S.a(this.R1[(i11 + i13) - 1].S, 0);
        eVar.T.a(this.R1[(i10 + i12) - 1].T, 0);
    }

    private void P2() {
        int iMax = Math.max(this.T1, this.V1);
        e[] eVarArr = this.R1;
        int i10 = 0;
        if (eVarArr == null) {
            this.R1 = new e[iMax];
            while (true) {
                e[] eVarArr2 = this.R1;
                if (i10 >= eVarArr2.length) {
                    return;
                }
                eVarArr2[i10] = i3();
                i10++;
            }
        } else {
            if (iMax == eVarArr.length) {
                return;
            }
            e[] eVarArr3 = new e[iMax];
            while (i10 < iMax) {
                e[] eVarArr4 = this.R1;
                if (i10 < eVarArr4.length) {
                    eVarArr3[i10] = eVarArr4[i10];
                } else {
                    eVarArr3[i10] = i3();
                }
                i10++;
            }
            while (true) {
                e[] eVarArr5 = this.R1;
                if (iMax >= eVarArr5.length) {
                    this.R1 = eVarArr3;
                    return;
                } else {
                    this.Q1.p2(eVarArr5[iMax]);
                    iMax++;
                }
            }
        }
    }

    private void Q2(boolean z10) {
        int[][] iArrJ3;
        int[][] iArrJ4;
        if (z10) {
            for (int i10 = 0; i10 < this.f44492f2.length; i10++) {
                int i11 = 0;
                while (true) {
                    boolean[][] zArr = this.f44492f2;
                    if (i11 < zArr[0].length) {
                        zArr[i10][i11] = true;
                        i11++;
                    }
                }
            }
            for (int i12 = 0; i12 < this.f44494h2.length; i12++) {
                int i13 = 0;
                while (true) {
                    int[][] iArr = this.f44494h2;
                    if (i13 < iArr[0].length) {
                        iArr[i12][i13] = -1;
                        i13++;
                    }
                }
            }
        }
        this.f44491e2 = 0;
        String str = this.f44489c2;
        if (str != null && !str.trim().isEmpty() && (iArrJ4 = j3(this.f44489c2, false)) != null) {
            b3(iArrJ4);
        }
        String str2 = this.f44488b2;
        if (str2 == null || str2.trim().isEmpty() || (iArrJ3 = j3(this.f44488b2, true)) == null) {
            return;
        }
        c3(iArrJ3);
    }

    private int R2(int i10) {
        return this.f44490d2 == 1 ? i10 / this.T1 : i10 % this.V1;
    }

    private int W2() {
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            i10 = this.f44491e2;
            if (i10 >= this.T1 * this.V1) {
                return -1;
            }
            int iY2 = Y2(i10);
            int iR2 = R2(this.f44491e2);
            boolean[] zArr = this.f44492f2[iY2];
            if (zArr[iR2]) {
                zArr[iR2] = false;
                z10 = true;
            }
            this.f44491e2++;
        }
        return i10;
    }

    private int Y2(int i10) {
        return this.f44490d2 == 1 ? i10 % this.T1 : i10 / this.V1;
    }

    private void b3(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!f3(Y2(iArr2[0]), R2(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    private void c3(int[][] iArr) {
        if (g3()) {
            return;
        }
        int i10 = 0;
        while (i10 < iArr.length) {
            int iY2 = this.Y2(iArr[i10][0]);
            int iR2 = this.R2(iArr[i10][0]);
            int[] iArr2 = iArr[i10];
            if (!this.f3(iY2, iR2, iArr2[1], iArr2[2])) {
                return;
            }
            e eVar = this.B1[i10];
            int[] iArr3 = iArr[i10];
            b bVar = this;
            bVar.O2(eVar, iY2, iR2, iArr3[1], iArr3[2]);
            bVar.f44493g2.add(bVar.B1[i10].f44730o);
            i10++;
            this = bVar;
        }
    }

    private void d3() {
        boolean[][] zArr;
        int[][] iArr = this.f44494h2;
        boolean z10 = false;
        if (iArr != null && iArr.length == this.C1 && (zArr = this.f44492f2) != null && zArr.length == this.T1 && zArr[0].length == this.V1) {
            z10 = true;
        }
        if (!z10) {
            e3();
        }
        Q2(z10);
    }

    private void e3() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.T1, this.V1);
        this.f44492f2 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i10 = this.C1;
        if (i10 > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, 4);
            this.f44494h2 = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    private boolean f3(int i10, int i11, int i12, int i13) {
        for (int i14 = i10; i14 < i10 + i12; i14++) {
            for (int i15 = i11; i15 < i11 + i13; i15++) {
                boolean[][] zArr = this.f44492f2;
                int i16 = 2 >> 0;
                if (i14 < zArr.length && i15 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i14];
                    if (zArr2[i15]) {
                        zArr2[i15] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean g3() {
        return (this.f44495i2 & 2) > 0;
    }

    private boolean h3() {
        return (this.f44495i2 & 1) > 0;
    }

    private e i3() {
        e eVar = new e();
        e.b[] bVarArr = eVar.f44705b0;
        e.b bVar = e.b.MATCH_CONSTRAINT;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        eVar.f44730o = String.valueOf(eVar.hashCode());
        return eVar;
    }

    private int[][] j3(String str, boolean z10) {
        try {
            String[] strArrSplit = str.split(",");
            Arrays.sort(strArrSplit, new Comparator() { // from class: androidx.constraintlayout.core.utils.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return b.J2((String) obj, (String) obj2);
                }
            });
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
            if (this.T1 != 1 && this.V1 != 1) {
                for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                    String[] strArrSplit2 = strArrSplit[i10].trim().split(":");
                    String[] strArrSplit3 = strArrSplit2[1].split("x");
                    iArr[i10][0] = Integer.parseInt(strArrSplit2[0]);
                    if (h3()) {
                        iArr[i10][1] = Integer.parseInt(strArrSplit3[1]);
                        iArr[i10][2] = Integer.parseInt(strArrSplit3[0]);
                    } else {
                        iArr[i10][1] = Integer.parseInt(strArrSplit3[0]);
                        iArr[i10][2] = Integer.parseInt(strArrSplit3[1]);
                    }
                }
                return iArr;
            }
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < strArrSplit.length; i13++) {
                String[] strArrSplit4 = strArrSplit[i13].trim().split(":");
                iArr[i13][0] = Integer.parseInt(strArrSplit4[0]);
                int[] iArr2 = iArr[i13];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.V1 == 1) {
                    iArr2[1] = Integer.parseInt(strArrSplit4[1]);
                    i11 += iArr[i13][1];
                    if (z10) {
                        i11--;
                    }
                }
                if (this.T1 == 1) {
                    iArr[i13][2] = Integer.parseInt(strArrSplit4[1]);
                    i12 += iArr[i13][2];
                    if (z10) {
                        i12--;
                    }
                }
            }
            if (i11 != 0 && !this.S1) {
                u3(this.T1 + i11);
            }
            if (i12 != 0 && !this.S1) {
                o3(this.V1 + i12);
            }
            this.S1 = true;
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    private float[] k3(int i10, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        float[] fArr = new float[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 < strArrSplit.length) {
                try {
                    fArr[i11] = Float.parseFloat(strArrSplit[i11]);
                } catch (Exception e10) {
                    System.err.println("Error parsing `" + strArrSplit[i11] + "`: " + e10.getMessage());
                    fArr[i11] = 1.0f;
                }
            } else {
                fArr[i11] = 1.0f;
            }
        }
        return fArr;
    }

    private void l3() {
        int i10;
        int iMax = Math.max(this.T1, this.V1);
        e eVar = this.R1[0];
        float[] fArrK3 = k3(this.V1, this.f44487a2);
        if (this.V1 == 1) {
            M2(eVar);
            eVar.Q.a(this.Q, 0);
            eVar.S.a(this.S, 0);
            return;
        }
        int i11 = 0;
        while (true) {
            i10 = this.V1;
            if (i11 >= i10) {
                break;
            }
            e eVar2 = this.R1[i11];
            M2(eVar2);
            if (fArrK3 != null) {
                eVar2.G1(fArrK3[i11]);
            }
            if (i11 > 0) {
                eVar2.Q.a(this.R1[i11 - 1].S, 0);
            } else {
                eVar2.Q.a(this.Q, 0);
            }
            if (i11 < this.V1 - 1) {
                eVar2.S.a(this.R1[i11 + 1].Q, 0);
            } else {
                eVar2.S.a(this.S, 0);
            }
            if (i11 > 0) {
                eVar2.Q.f44663g = (int) this.X1;
            }
            i11++;
        }
        while (i10 < iMax) {
            e eVar3 = this.R1[i10];
            M2(eVar3);
            eVar3.Q.a(this.Q, 0);
            eVar3.S.a(this.S, 0);
            i10++;
        }
    }

    private void m3() {
        int i10;
        int iMax = Math.max(this.T1, this.V1);
        e eVar = this.R1[0];
        float[] fArrK3 = k3(this.T1, this.Z1);
        if (this.T1 == 1) {
            N2(eVar);
            eVar.R.a(this.R, 0);
            eVar.T.a(this.T, 0);
            return;
        }
        int i11 = 0;
        while (true) {
            i10 = this.T1;
            if (i11 >= i10) {
                break;
            }
            e eVar2 = this.R1[i11];
            N2(eVar2);
            if (fArrK3 != null) {
                eVar2.b2(fArrK3[i11]);
            }
            if (i11 > 0) {
                eVar2.R.a(this.R1[i11 - 1].T, 0);
            } else {
                eVar2.R.a(this.R, 0);
            }
            if (i11 < this.T1 - 1) {
                eVar2.T.a(this.R1[i11 + 1].R, 0);
            } else {
                eVar2.T.a(this.T, 0);
            }
            if (i11 > 0) {
                eVar2.R.f44663g = (int) this.Y1;
            }
            i11++;
        }
        while (i10 < iMax) {
            e eVar3 = this.R1[i10];
            N2(eVar3);
            eVar3.R.a(this.R, 0);
            eVar3.T.a(this.T, 0);
            i10++;
        }
    }

    private void y3(boolean z10) {
        int[][] iArrJ3;
        if (this.T1 >= 1 && this.V1 >= 1) {
            if (z10) {
                for (int i10 = 0; i10 < this.f44492f2.length; i10++) {
                    int i11 = 0;
                    while (true) {
                        boolean[][] zArr = this.f44492f2;
                        if (i11 < zArr[0].length) {
                            zArr[i10][i11] = true;
                            i11++;
                        }
                    }
                }
                this.f44493g2.clear();
            }
            this.f44491e2 = 0;
            String str = this.f44489c2;
            if (str != null && !str.trim().isEmpty() && (iArrJ3 = j3(this.f44489c2, false)) != null) {
                b3(iArrJ3);
            }
            String str2 = this.f44488b2;
            if (str2 != null && !str2.trim().isEmpty()) {
                this.f44496j2 = j3(this.f44488b2, true);
            }
            P2();
            int[][] iArr = this.f44496j2;
            if (iArr != null) {
                c3(iArr);
            }
        }
    }

    private void z3() {
        int i10;
        int i11 = this.U1;
        if (i11 != 0 && (i10 = this.W1) != 0) {
            this.T1 = i11;
            this.V1 = i10;
            return;
        }
        int i12 = this.W1;
        if (i12 > 0) {
            this.V1 = i12;
            this.T1 = ((this.C1 + i12) - 1) / i12;
        } else if (i11 > 0) {
            this.T1 = i11;
            this.V1 = ((this.C1 + i11) - 1) / i11;
        } else {
            int iSqrt = (int) (Math.sqrt(this.C1) + 1.5d);
            this.T1 = iSqrt;
            this.V1 = ((this.C1 + iSqrt) - 1) / iSqrt;
        }
    }

    @p0
    public String S2() {
        return this.f44487a2;
    }

    @p0
    public f T2() {
        return this.Q1;
    }

    public int U2() {
        return this.f44495i2;
    }

    public float V2() {
        return this.X1;
    }

    public int X2() {
        return this.f44490d2;
    }

    @p0
    public String Z2() {
        return this.Z1;
    }

    public float a3() {
        return this.Y1;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void g(@p0 androidx.constraintlayout.core.e eVar, boolean z10) {
        super.g(eVar, z10);
        K2();
    }

    public void n3(@NonNull String str) {
        String str2 = this.f44487a2;
        if (str2 == null || !str2.equals(str)) {
            this.f44487a2 = str;
        }
    }

    public void o3(int i10) {
        if (i10 <= 50 && this.W1 != i10) {
            this.W1 = i10;
            z3();
            e3();
        }
    }

    public void p3(@NonNull f fVar) {
        this.Q1 = fVar;
    }

    public void q3(int i10) {
        this.f44495i2 = i10;
    }

    public void r3(float f10) {
        if (f10 >= 0.0f && this.X1 != f10) {
            this.X1 = f10;
        }
    }

    public void s3(int i10) {
        if ((i10 == 0 || i10 == 1) && this.f44490d2 != i10) {
            this.f44490d2 = i10;
        }
    }

    public void t3(@NonNull String str) {
        String str2 = this.Z1;
        if (str2 == null || !str2.equals(str)) {
            this.Z1 = str;
        }
    }

    public void u3(int i10) {
        if (i10 <= 50 && this.U1 != i10) {
            this.U1 = i10;
            z3();
            e3();
        }
    }

    public void v3(@NonNull String str) {
        String str2 = this.f44489c2;
        if (str2 == null || !str2.equals(str)) {
            this.S1 = false;
            this.f44489c2 = str;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.n
    public void w2(int i10, int i11, int i12, int i13) {
        super.w2(i10, i11, i12, i13);
        this.Q1 = (f) U();
        int i14 = 7 ^ 0;
        y3(false);
        this.Q1.l2(this.R1);
    }

    public void w3(@NonNull CharSequence charSequence) {
        String str = this.f44488b2;
        if (str == null || !str.equals(charSequence.toString())) {
            this.S1 = false;
            this.f44488b2 = charSequence.toString();
        }
    }

    public void x3(float f10) {
        if (f10 >= 0.0f && this.Y1 != f10) {
            this.Y1 = f10;
        }
    }

    public b(int i10, int i11) {
        this.U1 = i10;
        this.W1 = i11;
        if (i10 > 50) {
            this.U1 = 3;
        }
        if (i11 > 50) {
            this.W1 = 3;
        }
        z3();
        d3();
    }
}
