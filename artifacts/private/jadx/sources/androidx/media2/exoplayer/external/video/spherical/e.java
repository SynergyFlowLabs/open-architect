package androidx.media2.exoplayer.external.video.spherical;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.util.w;
import androidx.media2.exoplayer.external.util.x;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f57907a = 2037673328;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f57908b = 1836279920;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f57909c = 1918990112;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f57910d = 1684433976;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f57911e = 1835365224;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f57912f = 1886547818;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f57913g = 10000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f57914h = 32000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f57915i = 128000;

    private e() {
    }

    @p0
    public static d a(byte[] projectionData, int stereoMode) {
        ArrayList<d.b> arrayListF;
        x xVar = new x(projectionData);
        try {
            arrayListF = c(xVar) ? f(xVar) : e(xVar);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListF = null;
        }
        if (arrayListF == null) {
            return null;
        }
        int size = arrayListF.size();
        boolean z10 = false | true;
        if (size == 1) {
            return new d(arrayListF.get(0), stereoMode);
        }
        if (size != 2) {
            return null;
        }
        return new d(arrayListF.get(0), arrayListF.get(1), stereoMode);
    }

    private static int b(int n10) {
        return (-(n10 & 1)) ^ (n10 >> 1);
    }

    private static boolean c(x input) {
        input.R(4);
        int iL = input.l();
        input.Q(0);
        return iL == 1886547818;
    }

    @p0
    private static d.b d(x input) {
        int iL = input.l();
        d.b bVar = null;
        if (iL > 10000) {
            return null;
        }
        float[] fArr = new float[iL];
        for (int i10 = 0; i10 < iL; i10++) {
            fArr[i10] = input.k();
        }
        int iL2 = input.l();
        if (iL2 > 32000) {
            return null;
        }
        double d10 = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) iL) * 2.0d) / dLog);
        w wVar = new w(input.f57720a);
        int i11 = 8;
        wVar.n(input.c() * 8);
        float[] fArr2 = new float[iL2 * 5];
        int[] iArr = new int[5];
        int i12 = 0;
        int i13 = 0;
        while (i12 < iL2) {
            d.b bVar2 = bVar;
            int i14 = 0;
            while (i14 < 5) {
                int iB = iArr[i14] + b(wVar.h(iCeil));
                if (iB >= iL || iB < 0) {
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
        d.b bVar3 = bVar;
        wVar.n((wVar.e() + 7) & (-8));
        int i15 = 32;
        int iH = wVar.h(32);
        d.c[] cVarArr = new d.c[iH];
        int i16 = 0;
        while (i16 < iH) {
            int iH2 = wVar.h(i11);
            int iH3 = wVar.h(i11);
            int iH4 = wVar.h(i15);
            if (iH4 > 128000) {
                return bVar3;
            }
            int i17 = iH;
            int iCeil2 = (int) Math.ceil(Math.log(((double) iL2) * d10) / dLog);
            float[] fArr3 = new float[iH4 * 3];
            float[] fArr4 = new float[iH4 * 2];
            int i18 = 0;
            int i19 = 0;
            while (i18 < iH4) {
                int iB2 = i19 + b(wVar.h(iCeil2));
                if (iB2 < 0 || iB2 >= iL2) {
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
            cVarArr[i16] = new d.c(iH2, fArr3, fArr4, iH3);
            i16++;
            iH = i17;
            i15 = 32;
            d10 = 2.0d;
            i11 = 8;
        }
        return new d.b(cVarArr);
    }

    @p0
    private static ArrayList<d.b> e(x input) {
        if (input.D() != 0) {
            return null;
        }
        input.R(7);
        int iL = input.l();
        if (iL == f57910d) {
            x xVar = new x();
            Inflater inflater = new Inflater(true);
            try {
                if (!q0.m0(input, xVar, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                input = xVar;
            } catch (Throwable th2) {
                inflater.end();
                throw th2;
            }
        } else if (iL != f57909c) {
            return null;
        }
        return g(input);
    }

    @p0
    private static ArrayList<d.b> f(x input) {
        int iL;
        input.R(8);
        int iC = input.c();
        int iD = input.d();
        while (iC < iD && (iL = input.l() + iC) > iC && iL <= iD) {
            int iL2 = input.l();
            if (iL2 == f57907a || iL2 == f57908b) {
                input.P(iL);
                return e(input);
            }
            input.Q(iL);
            iC = iL;
        }
        return null;
    }

    @p0
    private static ArrayList<d.b> g(x input) {
        ArrayList<d.b> arrayList = new ArrayList<>();
        int iC = input.c();
        int iD = input.d();
        while (iC < iD) {
            int iL = input.l() + iC;
            if (iL > iC && iL <= iD) {
                if (input.l() == f57911e) {
                    d.b bVarD = d(input);
                    if (bVarD == null) {
                        return null;
                    }
                    arrayList.add(bVarD);
                }
                input.Q(iL);
                iC = iL;
            }
            return null;
        }
        return arrayList;
    }
}
