package androidx.media3.exoplayer.video.spherical;

import androidx.annotation.p0;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.n0;
import androidx.media3.common.util.o0;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f66487a = 2037673328;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f66488b = 1836279920;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f66489c = 1918990112;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f66490d = 1684433976;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f66491e = 1835365224;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f66492f = 1886547818;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f66493g = 10000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f66494h = 32000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f66495i = 128000;

    private f() {
    }

    @p0
    public static e a(byte[] bArr, int i10) {
        ArrayList<e.b> arrayListF;
        o0 o0Var = new o0(bArr);
        try {
            arrayListF = c(o0Var) ? f(o0Var) : e(o0Var);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListF = null;
        }
        if (arrayListF == null) {
            return null;
        }
        int size = arrayListF.size();
        if (size == 1) {
            return new e(arrayListF.get(0), i10);
        }
        if (size != 2) {
            return null;
        }
        return new e(arrayListF.get(0), arrayListF.get(1), i10);
    }

    private static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >> 1);
    }

    private static boolean c(o0 o0Var) {
        o0Var.b0(4);
        int iS = o0Var.s();
        o0Var.a0(0);
        return iS == 1886547818;
    }

    @p0
    private static e.b d(o0 o0Var) {
        int iS = o0Var.s();
        e.b bVar = null;
        if (iS > 10000) {
            return null;
        }
        float[] fArr = new float[iS];
        for (int i10 = 0; i10 < iS; i10++) {
            fArr[i10] = o0Var.r();
        }
        int iS2 = o0Var.s();
        if (iS2 > 32000) {
            return null;
        }
        double d10 = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) iS) * 2.0d) / dLog);
        n0 n0Var = new n0(o0Var.e());
        int i11 = 8;
        n0Var.q(o0Var.f() * 8);
        float[] fArr2 = new float[iS2 * 5];
        int[] iArr = new int[5];
        int i12 = 0;
        int i13 = 0;
        while (i12 < iS2) {
            e.b bVar2 = bVar;
            int i14 = 0;
            while (i14 < 5) {
                int iB = iArr[i14] + b(n0Var.h(iCeil));
                if (iB >= iS || iB < 0) {
                    return bVar2;
                }
                fArr2[i13] = fArr[iB];
                iArr[i14] = iB;
                i14++;
                i13++;
            }
            i12++;
            bVar = bVar2;
        }
        e.b bVar3 = bVar;
        n0Var.q((n0Var.e() + 7) & (-8));
        int i15 = 32;
        int iH = n0Var.h(32);
        e.c[] cVarArr = new e.c[iH];
        int i16 = 0;
        while (i16 < iH) {
            int iH2 = n0Var.h(i11);
            int iH3 = n0Var.h(i11);
            int iH4 = n0Var.h(i15);
            if (iH4 > 128000) {
                return bVar3;
            }
            int i17 = iH;
            int iCeil2 = (int) Math.ceil(Math.log(((double) iS2) * d10) / dLog);
            float[] fArr3 = new float[iH4 * 3];
            float[] fArr4 = new float[iH4 * 2];
            int i18 = 0;
            int i19 = 0;
            while (i18 < iH4) {
                int iB2 = i19 + b(n0Var.h(iCeil2));
                if (iB2 < 0 || iB2 >= iS2) {
                    return bVar3;
                }
                int i20 = i18 * 3;
                int i21 = iB2 * 5;
                fArr3[i20] = fArr2[i21];
                fArr3[i20 + 1] = fArr2[i21 + 1];
                fArr3[i20 + 2] = fArr2[i21 + 2];
                int i22 = i18 * 2;
                fArr4[i22] = fArr2[i21 + 3];
                fArr4[i22 + 1] = fArr2[i21 + 4];
                i18++;
                i19 = iB2;
            }
            cVarArr[i16] = new e.c(iH2, fArr3, fArr4, iH3);
            i16++;
            iH = i17;
            i15 = 32;
            d10 = 2.0d;
            i11 = 8;
        }
        return new e.b(cVarArr);
    }

    @p0
    private static ArrayList<e.b> e(o0 o0Var) {
        if (o0Var.L() != 0) {
            return null;
        }
        o0Var.b0(7);
        int iS = o0Var.s();
        if (iS == f66490d) {
            o0 o0Var2 = new o0();
            Inflater inflater = new Inflater(true);
            try {
                if (!k1.b1(o0Var, o0Var2, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                o0Var = o0Var2;
            } catch (Throwable th2) {
                inflater.end();
                throw th2;
            }
        } else if (iS != f66489c) {
            return null;
        }
        return g(o0Var);
    }

    @p0
    private static ArrayList<e.b> f(o0 o0Var) {
        int iS;
        o0Var.b0(8);
        int iF = o0Var.f();
        int iG = o0Var.g();
        while (iF < iG && (iS = o0Var.s() + iF) > iF && iS <= iG) {
            int iS2 = o0Var.s();
            if (iS2 == f66487a || iS2 == f66488b) {
                o0Var.Z(iS);
                return e(o0Var);
            }
            o0Var.a0(iS);
            iF = iS;
        }
        return null;
    }

    @p0
    private static ArrayList<e.b> g(o0 o0Var) {
        ArrayList<e.b> arrayList = new ArrayList<>();
        int iF = o0Var.f();
        int iG = o0Var.g();
        while (iF < iG) {
            int iS = o0Var.s() + iF;
            if (iS <= iF || iS > iG) {
                return null;
            }
            if (o0Var.s() == f66491e) {
                e.b bVarD = d(o0Var);
                if (bVarD == null) {
                    return null;
                }
                arrayList.add(bVarD);
            }
            o0Var.a0(iS);
            iF = iS;
        }
        return arrayList;
    }
}
