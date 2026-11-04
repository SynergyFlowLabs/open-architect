package com.google.android.material.color.utilities;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class d6 implements y5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f112117g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f112118h = 33;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f112119i = 35937;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int[] f112120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f112121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[] f112122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f112123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    double[] f112124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    b[] f112125f;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f112126a;

        static {
            int[] iArr = new int[d.values().length];
            f112126a = iArr;
            try {
                iArr[d.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f112126a[d.GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f112126a[d.BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f112134a;

        c(int i10, int i11) {
            this.f112134a = i11;
        }
    }

    private enum d {
        RED,
        GREEN,
        BLUE
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f112139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        double f112140b;

        e(int i10, double d10) {
            this.f112139a = i10;
            this.f112140b = d10;
        }
    }

    static int b(b bVar, d dVar, int[] iArr) {
        int i10;
        int i11;
        int i12 = a.f112126a[dVar.ordinal()];
        if (i12 == 1) {
            i10 = (-iArr[h(bVar.f112127a, bVar.f112130d, bVar.f112132f)]) + iArr[h(bVar.f112127a, bVar.f112130d, bVar.f112131e)] + iArr[h(bVar.f112127a, bVar.f112129c, bVar.f112132f)];
            i11 = iArr[h(bVar.f112127a, bVar.f112129c, bVar.f112131e)];
        } else if (i12 == 2) {
            i10 = (-iArr[h(bVar.f112128b, bVar.f112129c, bVar.f112132f)]) + iArr[h(bVar.f112128b, bVar.f112129c, bVar.f112131e)] + iArr[h(bVar.f112127a, bVar.f112129c, bVar.f112132f)];
            i11 = iArr[h(bVar.f112127a, bVar.f112129c, bVar.f112131e)];
        } else {
            if (i12 != 3) {
                throw new IllegalArgumentException("unexpected direction " + dVar);
            }
            i10 = (-iArr[h(bVar.f112128b, bVar.f112130d, bVar.f112131e)]) + iArr[h(bVar.f112128b, bVar.f112129c, bVar.f112131e)] + iArr[h(bVar.f112127a, bVar.f112130d, bVar.f112131e)];
            i11 = iArr[h(bVar.f112127a, bVar.f112129c, bVar.f112131e)];
        }
        return i10 - i11;
    }

    static int h(int i10, int i11, int i12) {
        return (i10 << 10) + (i10 << 6) + i10 + (i11 << 5) + i11 + i12;
    }

    static int j(b bVar, d dVar, int i10, int[] iArr) {
        int i11;
        int i12;
        int i13 = a.f112126a[dVar.ordinal()];
        if (i13 == 1) {
            i11 = (iArr[h(i10, bVar.f112130d, bVar.f112132f)] - iArr[h(i10, bVar.f112130d, bVar.f112131e)]) - iArr[h(i10, bVar.f112129c, bVar.f112132f)];
            i12 = iArr[h(i10, bVar.f112129c, bVar.f112131e)];
        } else if (i13 == 2) {
            i11 = (iArr[h(bVar.f112128b, i10, bVar.f112132f)] - iArr[h(bVar.f112128b, i10, bVar.f112131e)]) - iArr[h(bVar.f112127a, i10, bVar.f112132f)];
            i12 = iArr[h(bVar.f112127a, i10, bVar.f112131e)];
        } else {
            if (i13 != 3) {
                throw new IllegalArgumentException("unexpected direction " + dVar);
            }
            i11 = (iArr[h(bVar.f112128b, bVar.f112130d, i10)] - iArr[h(bVar.f112128b, bVar.f112129c, i10)]) - iArr[h(bVar.f112127a, bVar.f112130d, i10)];
            i12 = iArr[h(bVar.f112127a, bVar.f112129c, i10)];
        }
        return i11 + i12;
    }

    static int l(b bVar, int[] iArr) {
        return ((((((iArr[h(bVar.f112128b, bVar.f112130d, bVar.f112132f)] - iArr[h(bVar.f112128b, bVar.f112130d, bVar.f112131e)]) - iArr[h(bVar.f112128b, bVar.f112129c, bVar.f112132f)]) + iArr[h(bVar.f112128b, bVar.f112129c, bVar.f112131e)]) - iArr[h(bVar.f112127a, bVar.f112130d, bVar.f112132f)]) + iArr[h(bVar.f112127a, bVar.f112130d, bVar.f112131e)]) + iArr[h(bVar.f112127a, bVar.f112129c, bVar.f112132f)]) - iArr[h(bVar.f112127a, bVar.f112129c, bVar.f112131e)];
    }

    @Override // com.google.android.material.color.utilities.y5
    public b6 a(int[] iArr, int i10) {
        c(new a6().a(iArr, i10).f112101a);
        e();
        List<Integer> listF = f(d(i10).f112134a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Integer num : listF) {
            num.intValue();
            linkedHashMap.put(num, 0);
        }
        return new b6(linkedHashMap);
    }

    void c(Map<Integer, Integer> map) {
        this.f112120a = new int[f112119i];
        this.f112121b = new int[f112119i];
        this.f112122c = new int[f112119i];
        this.f112123d = new int[f112119i];
        this.f112124e = new double[f112119i];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int iQ = com.google.android.material.color.utilities.c.q(iIntValue);
            int i10 = com.google.android.material.color.utilities.c.i(iIntValue);
            int iG = com.google.android.material.color.utilities.c.g(iIntValue);
            int iH = h((iQ >> 3) + 1, (i10 >> 3) + 1, (iG >> 3) + 1);
            int[] iArr = this.f112120a;
            iArr[iH] = iArr[iH] + iIntValue2;
            int[] iArr2 = this.f112121b;
            iArr2[iH] = iArr2[iH] + (iQ * iIntValue2);
            int[] iArr3 = this.f112122c;
            iArr3[iH] = iArr3[iH] + (i10 * iIntValue2);
            int[] iArr4 = this.f112123d;
            iArr4[iH] = iArr4[iH] + (iG * iIntValue2);
            double[] dArr = this.f112124e;
            dArr[iH] = dArr[iH] + ((double) (iIntValue2 * ((iQ * iQ) + (i10 * i10) + (iG * iG))));
        }
    }

    c d(int i10) {
        int i11;
        this.f112125f = new b[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            this.f112125f[i12] = new b(null);
        }
        double[] dArr = new double[i10];
        b bVar = this.f112125f[0];
        bVar.f112128b = 32;
        bVar.f112130d = 32;
        bVar.f112132f = 32;
        int i13 = 0;
        int i14 = 1;
        while (i14 < i10) {
            b[] bVarArr = this.f112125f;
            if (g(bVarArr[i13], bVarArr[i14]).booleanValue()) {
                b bVar2 = this.f112125f[i13];
                dArr[i13] = bVar2.f112133g > 1 ? k(bVar2) : 0.0d;
                b bVar3 = this.f112125f[i14];
                dArr[i14] = bVar3.f112133g > 1 ? k(bVar3) : 0.0d;
            } else {
                dArr[i13] = 0.0d;
                i14--;
            }
            double d10 = dArr[0];
            int i15 = 0;
            for (int i16 = 1; i16 <= i14; i16++) {
                double d11 = dArr[i16];
                if (d11 > d10) {
                    i15 = i16;
                    d10 = d11;
                }
            }
            if (d10 <= 0.0d) {
                i11 = i14 + 1;
                return new c(i10, i11);
            }
            i14++;
            i13 = i15;
        }
        i11 = i10;
        return new c(i10, i11);
    }

    void e() {
        int i10 = 1;
        while (true) {
            int i11 = 33;
            if (i10 >= 33) {
                return;
            }
            int[] iArr = new int[33];
            int[] iArr2 = new int[33];
            int[] iArr3 = new int[33];
            int[] iArr4 = new int[33];
            double[] dArr = new double[33];
            int i12 = 1;
            while (i12 < i11) {
                int i13 = 0;
                int i14 = 0;
                double d10 = 0.0d;
                int i15 = 1;
                int i16 = 0;
                int i17 = 0;
                while (i15 < i11) {
                    int iH = h(i10, i12, i15);
                    i13 += this.f112120a[iH];
                    i16 += this.f112121b[iH];
                    i17 += this.f112122c[iH];
                    i14 += this.f112123d[iH];
                    d10 += this.f112124e[iH];
                    iArr[i15] = iArr[i15] + i13;
                    iArr2[i15] = iArr2[i15] + i16;
                    iArr3[i15] = iArr3[i15] + i17;
                    iArr4[i15] = iArr4[i15] + i14;
                    dArr[i15] = dArr[i15] + d10;
                    int iH2 = h(i10 - 1, i12, i15);
                    int i18 = i15;
                    int[] iArr5 = this.f112120a;
                    iArr5[iH] = iArr5[iH2] + iArr[i18];
                    int[] iArr6 = this.f112121b;
                    iArr6[iH] = iArr6[iH2] + iArr2[i18];
                    int[] iArr7 = this.f112122c;
                    iArr7[iH] = iArr7[iH2] + iArr3[i18];
                    int[] iArr8 = this.f112123d;
                    iArr8[iH] = iArr8[iH2] + iArr4[i18];
                    double[] dArr2 = this.f112124e;
                    dArr2[iH] = dArr2[iH2] + dArr[i18];
                    i15 = i18 + 1;
                    i11 = 33;
                }
                i12++;
                i11 = 33;
            }
            i10++;
        }
    }

    List<Integer> f(int i10) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < i10; i11++) {
            b bVar = this.f112125f[i11];
            int iL = l(bVar, this.f112120a);
            if (iL > 0) {
                int iL2 = l(bVar, this.f112121b) / iL;
                int iL3 = l(bVar, this.f112122c) / iL;
                arrayList.add(Integer.valueOf(((l(bVar, this.f112123d) / iL) & 255) | ((iL2 & 255) << 16) | (-16777216) | ((iL3 & 255) << 8)));
            }
        }
        return arrayList;
    }

    Boolean g(b bVar, b bVar2) {
        int iL = l(bVar, this.f112121b);
        int iL2 = l(bVar, this.f112122c);
        int iL3 = l(bVar, this.f112123d);
        int iL4 = l(bVar, this.f112120a);
        d dVar = d.RED;
        e eVarI = i(bVar, dVar, bVar.f112127a + 1, bVar.f112128b, iL, iL2, iL3, iL4);
        d dVar2 = d.GREEN;
        e eVarI2 = i(bVar, dVar2, bVar.f112129c + 1, bVar.f112130d, iL, iL2, iL3, iL4);
        d dVar3 = d.BLUE;
        e eVarI3 = i(bVar, dVar3, bVar.f112131e + 1, bVar.f112132f, iL, iL2, iL3, iL4);
        double d10 = eVarI.f112140b;
        double d11 = eVarI2.f112140b;
        double d12 = eVarI3.f112140b;
        if (d10 < d11 || d10 < d12) {
            if (d11 >= d10 && d11 >= d12) {
                dVar3 = dVar2;
            }
        } else {
            if (eVarI.f112139a < 0) {
                return Boolean.FALSE;
            }
            dVar3 = dVar;
        }
        bVar2.f112128b = bVar.f112128b;
        bVar2.f112130d = bVar.f112130d;
        bVar2.f112132f = bVar.f112132f;
        int i10 = a.f112126a[dVar3.ordinal()];
        if (i10 == 1) {
            int i11 = eVarI.f112139a;
            bVar.f112128b = i11;
            bVar2.f112127a = i11;
            bVar2.f112129c = bVar.f112129c;
            bVar2.f112131e = bVar.f112131e;
        } else if (i10 == 2) {
            int i12 = eVarI2.f112139a;
            bVar.f112130d = i12;
            bVar2.f112127a = bVar.f112127a;
            bVar2.f112129c = i12;
            bVar2.f112131e = bVar.f112131e;
        } else if (i10 == 3) {
            int i13 = eVarI3.f112139a;
            bVar.f112132f = i13;
            bVar2.f112127a = bVar.f112127a;
            bVar2.f112129c = bVar.f112129c;
            bVar2.f112131e = i13;
        }
        bVar.f112133g = (bVar.f112128b - bVar.f112127a) * (bVar.f112130d - bVar.f112129c) * (bVar.f112132f - bVar.f112131e);
        bVar2.f112133g = (bVar2.f112128b - bVar2.f112127a) * (bVar2.f112130d - bVar2.f112129c) * (bVar2.f112132f - bVar2.f112131e);
        return Boolean.TRUE;
    }

    e i(b bVar, d dVar, int i10, int i11, int i12, int i13, int i14, int i15) {
        d6 d6Var = this;
        b bVar2 = bVar;
        int iB = b(bVar2, dVar, d6Var.f112121b);
        int iB2 = b(bVar2, dVar, d6Var.f112122c);
        int iB3 = b(bVar2, dVar, d6Var.f112123d);
        int iB4 = b(bVar2, dVar, d6Var.f112120a);
        int i16 = -1;
        double d10 = 0.0d;
        int i17 = i10;
        while (i17 < i11) {
            int iJ = j(bVar2, dVar, i17, d6Var.f112121b) + iB;
            int iJ2 = j(bVar2, dVar, i17, d6Var.f112122c) + iB2;
            int iJ3 = j(bVar2, dVar, i17, d6Var.f112123d) + iB3;
            int iJ4 = j(bVar2, dVar, i17, d6Var.f112120a) + iB4;
            if (iJ4 != 0) {
                double d11 = ((double) (((iJ * iJ) + (iJ2 * iJ2)) + (iJ3 * iJ3))) / ((double) iJ4);
                int i18 = i12 - iJ;
                int i19 = i13 - iJ2;
                int i20 = i14 - iJ3;
                int i21 = i15 - iJ4;
                if (i21 != 0) {
                    double d12 = d11 + (((double) (((i18 * i18) + (i19 * i19)) + (i20 * i20))) / ((double) i21));
                    if (d12 > d10) {
                        d10 = d12;
                        i16 = i17;
                    }
                }
            }
            i17++;
            d6Var = this;
            bVar2 = bVar;
        }
        return new e(i16, d10);
    }

    double k(b bVar) {
        int iL = l(bVar, this.f112121b);
        int iL2 = l(bVar, this.f112122c);
        int iL3 = l(bVar, this.f112123d);
        return (((((((this.f112124e[h(bVar.f112128b, bVar.f112130d, bVar.f112132f)] - this.f112124e[h(bVar.f112128b, bVar.f112130d, bVar.f112131e)]) - this.f112124e[h(bVar.f112128b, bVar.f112129c, bVar.f112132f)]) + this.f112124e[h(bVar.f112128b, bVar.f112129c, bVar.f112131e)]) - this.f112124e[h(bVar.f112127a, bVar.f112130d, bVar.f112132f)]) + this.f112124e[h(bVar.f112127a, bVar.f112130d, bVar.f112131e)]) + this.f112124e[h(bVar.f112127a, bVar.f112129c, bVar.f112132f)]) - this.f112124e[h(bVar.f112127a, bVar.f112129c, bVar.f112131e)]) - (((double) (((iL * iL) + (iL2 * iL2)) + (iL3 * iL3))) / ((double) l(bVar, this.f112120a)));
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f112127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f112128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f112129c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f112130d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112131e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f112132f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f112133g;

        private b() {
            this.f112127a = 0;
            this.f112128b = 0;
            this.f112129c = 0;
            this.f112130d = 0;
            this.f112131e = 0;
            this.f112132f = 0;
            this.f112133g = 0;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }
}
