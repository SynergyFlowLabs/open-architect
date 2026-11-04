package ba;

import com.google.zxing.c;
import com.google.zxing.e;
import com.google.zxing.m;
import com.google.zxing.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f77732c = 0.42f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f77733d = 0.8f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f77736g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f77737h = 5;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f77738i = 25;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f77739j = 5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f77740k = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f77730a = {0, 4, 1, 5};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f77731b = {6, 2, 7, 3};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f77734e = {8, 1, 1, 1, 1, 1, 1, 3};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f77735f = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    private a() {
    }

    private static void a(t[] tVarArr, t[] tVarArr2, int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            tVarArr[iArr[i10]] = tVarArr2[i10];
        }
    }

    public static b b(c cVar, Map<e, ?> map, boolean z10) throws m {
        com.google.zxing.common.b bVarB = cVar.b();
        List<t[]> listC = c(z10, bVarB);
        if (listC.isEmpty()) {
            bVarB = bVarB.clone();
            bVarB.p();
            listC = c(z10, bVarB);
        }
        return new b(bVarB, listC);
    }

    private static List<t[]> c(boolean z10, com.google.zxing.common.b bVar) {
        int iC;
        float fD;
        ArrayList<t[]> arrayList = new ArrayList();
        int iMax = 0;
        int i10 = 0;
        loop0: while (true) {
            int i11 = i10;
            while (iMax < bVar.h()) {
                t[] tVarArrF = f(bVar, iMax, i10);
                if (tVarArrF[0] == null && tVarArrF[3] == null) {
                    if (i11 == 0) {
                        break;
                    }
                    for (t[] tVarArr : arrayList) {
                        t tVar = tVarArr[1];
                        if (tVar != null) {
                            iMax = (int) Math.max(iMax, tVar.d());
                        }
                        t tVar2 = tVarArr[3];
                        if (tVar2 != null) {
                            iMax = Math.max(iMax, (int) tVar2.d());
                        }
                    }
                    iMax += 5;
                    i10 = 0;
                } else {
                    arrayList.add(tVarArrF);
                    if (!z10) {
                        break loop0;
                    }
                    t tVar3 = tVarArrF[2];
                    if (tVar3 != null) {
                        iC = (int) tVar3.c();
                        fD = tVarArrF[2].d();
                    } else {
                        iC = (int) tVarArrF[4].c();
                        fD = tVarArrF[4].d();
                    }
                    iMax = (int) fD;
                    i10 = iC;
                    i11 = 1;
                }
            }
            break loop0;
        }
        return arrayList;
    }

    private static int[] d(com.google.zxing.common.b bVar, int i10, int i11, int i12, boolean z10, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i13 = 0;
        while (bVar.e(i10, i11) && i10 > 0) {
            int i14 = i13 + 1;
            if (i13 >= 3) {
                break;
            }
            i10--;
            i13 = i14;
        }
        int length = iArr.length;
        boolean z11 = z10;
        int i15 = 0;
        int i16 = i10;
        while (i10 < i12) {
            if (bVar.e(i10, i11) != z11) {
                iArr2[i15] = iArr2[i15] + 1;
            } else {
                if (i15 != length - 1) {
                    i15++;
                } else {
                    if (g(iArr2, iArr, 0.8f) < 0.42f) {
                        return new int[]{i16, i10};
                    }
                    i16 += iArr2[0] + iArr2[1];
                    int i17 = i15 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i17);
                    iArr2[i17] = 0;
                    iArr2[i15] = 0;
                    i15--;
                }
                iArr2[i15] = 1;
                z11 = !z11;
            }
            i10++;
        }
        if (i15 != length - 1 || g(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i16, i10 - 1};
    }

    private static t[] e(com.google.zxing.common.b bVar, int i10, int i11, int i12, int i13, int[] iArr) {
        int i14;
        boolean z10;
        int[] iArr2;
        t[] tVarArr = new t[4];
        int[] iArr3 = iArr;
        int[] iArr4 = new int[iArr3.length];
        int i15 = i12;
        while (true) {
            if (i15 >= i10) {
                i14 = i15;
                z10 = false;
                break;
            }
            int[] iArrD = d(bVar, i13, i15, i11, false, iArr3, iArr4);
            if (iArrD != null) {
                do {
                    i14 = i15;
                    iArr2 = iArrD;
                    if (i14 <= 0) {
                        break;
                    }
                    i15 = i14 - 1;
                    iArrD = d(bVar, i13, i15, i11, false, iArr, iArr4);
                } while (iArrD != null);
                float f10 = i14;
                tVarArr[0] = new t(iArr2[0], f10);
                tVarArr[1] = new t(iArr2[1], f10);
                z10 = true;
                break;
            }
            i15 += 5;
            iArr3 = iArr;
        }
        int i16 = i14 + 1;
        if (z10) {
            int[] iArr5 = {(int) tVarArr[0].c(), (int) tVarArr[1].c()};
            int i17 = i16;
            int i18 = 0;
            while (i17 < i10) {
                int[] iArrD2 = d(bVar, iArr5[0], i17, i11, false, iArr, iArr4);
                if (iArrD2 != null && Math.abs(iArr5[0] - iArrD2[0]) < 5 && Math.abs(iArr5[1] - iArrD2[1]) < 5) {
                    iArr5 = iArrD2;
                    i18 = 0;
                } else {
                    if (i18 > 25) {
                        break;
                    }
                    i18++;
                }
                i17++;
            }
            i16 = i17 - (i18 + 1);
            float f11 = i16;
            tVarArr[2] = new t(iArr5[0], f11);
            tVarArr[3] = new t(iArr5[1], f11);
        }
        if (i16 - i14 < 10) {
            Arrays.fill(tVarArr, (Object) null);
        }
        return tVarArr;
    }

    private static t[] f(com.google.zxing.common.b bVar, int i10, int i11) {
        int iH = bVar.h();
        int iL = bVar.l();
        t[] tVarArr = new t[8];
        int iD = i10;
        int i12 = i11;
        a(tVarArr, e(bVar, iH, iL, iD, i12, f77734e), f77730a);
        t tVar = tVarArr[4];
        if (tVar != null) {
            int iC = (int) tVar.c();
            iD = (int) tVarArr[4].d();
            i12 = iC;
        }
        a(tVarArr, e(bVar, iH, iL, iD, i12, f77735f), f77731b);
        return tVarArr;
    }

    private static float g(int[] iArr, int[] iArr2, float f10) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f11 = i10;
        float f12 = f11 / i11;
        float f13 = f10 * f12;
        float f14 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            float f15 = iArr2[i13] * f12;
            float f16 = i14;
            float f17 = f16 > f15 ? f16 - f15 : f15 - f16;
            if (f17 > f13) {
                return Float.POSITIVE_INFINITY;
            }
            f14 += f17;
        }
        return f14 / f11;
    }
}
