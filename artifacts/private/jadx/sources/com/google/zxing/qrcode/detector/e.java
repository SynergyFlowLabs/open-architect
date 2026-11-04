package com.google.zxing.qrcode.detector;

import com.google.zxing.m;
import com.google.zxing.t;
import com.google.zxing.u;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f130946f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static final int f130947g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static final int f130948h = 97;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.zxing.common.b f130949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<d> f130950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f130951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f130952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u f130953e;

    private static final class b implements Serializable, Comparator<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f130954a;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            int iCompare = Integer.compare(dVar2.h(), dVar.h());
            return iCompare == 0 ? Float.compare(Math.abs(dVar.i() - this.f130954a), Math.abs(dVar2.i() - this.f130954a)) : iCompare;
        }

        private b(float f10) {
            this.f130954a = f10;
        }
    }

    private static final class c implements Serializable, Comparator<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f130955a;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return Float.compare(Math.abs(dVar2.i() - this.f130955a), Math.abs(dVar.i() - this.f130955a));
        }

        private c(float f10) {
            this.f130955a = f10;
        }
    }

    public e(com.google.zxing.common.b bVar) {
        this(bVar, null);
    }

    private static float a(int[] iArr, int i10) {
        return ((i10 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    private boolean c(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int[] iArrJ = j();
        int i15 = 0;
        while (i10 >= i15 && i11 >= i15 && this.f130949a.e(i11 - i15, i10 - i15)) {
            iArrJ[2] = iArrJ[2] + 1;
            i15++;
        }
        if (iArrJ[2] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && !this.f130949a.e(i11 - i15, i10 - i15)) {
            iArrJ[1] = iArrJ[1] + 1;
            i15++;
        }
        if (iArrJ[1] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && this.f130949a.e(i11 - i15, i10 - i15)) {
            iArrJ[0] = iArrJ[0] + 1;
            i15++;
        }
        if (iArrJ[0] == 0) {
            return false;
        }
        int iH = this.f130949a.h();
        int iL = this.f130949a.l();
        int i16 = 1;
        while (true) {
            int i17 = i10 + i16;
            if (i17 >= iH || (i14 = i11 + i16) >= iL || !this.f130949a.e(i14, i17)) {
                break;
            }
            iArrJ[2] = iArrJ[2] + 1;
            i16++;
        }
        while (true) {
            int i18 = i10 + i16;
            if (i18 >= iH || (i13 = i11 + i16) >= iL || this.f130949a.e(i13, i18)) {
                break;
            }
            iArrJ[3] = iArrJ[3] + 1;
            i16++;
        }
        if (iArrJ[3] == 0) {
            return false;
        }
        while (true) {
            int i19 = i10 + i16;
            if (i19 >= iH || (i12 = i11 + i16) >= iL || !this.f130949a.e(i12, i19)) {
                break;
            }
            iArrJ[4] = iArrJ[4] + 1;
            i16++;
        }
        if (iArrJ[4] == 0) {
            return false;
        }
        return i(iArrJ);
    }

    private float d(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        com.google.zxing.common.b bVar = this.f130949a;
        int iL = bVar.l();
        int[] iArrJ = j();
        int i18 = i10;
        while (i18 >= 0 && bVar.e(i18, i11)) {
            iArrJ[2] = iArrJ[2] + 1;
            i18--;
        }
        if (i18 < 0) {
            return Float.NaN;
        }
        while (i18 >= 0 && !bVar.e(i18, i11) && (i17 = iArrJ[1]) <= i12) {
            iArrJ[1] = i17 + 1;
            i18--;
        }
        if (i18 >= 0 && iArrJ[1] <= i12) {
            while (i18 >= 0 && bVar.e(i18, i11) && (i16 = iArrJ[0]) <= i12) {
                iArrJ[0] = i16 + 1;
                i18--;
            }
            if (iArrJ[0] > i12) {
                return Float.NaN;
            }
            int i19 = i10 + 1;
            while (i19 < iL && bVar.e(i19, i11)) {
                iArrJ[2] = iArrJ[2] + 1;
                i19++;
            }
            if (i19 == iL) {
                return Float.NaN;
            }
            while (i19 < iL && !bVar.e(i19, i11) && (i15 = iArrJ[3]) < i12) {
                iArrJ[3] = i15 + 1;
                i19++;
            }
            if (i19 != iL && iArrJ[3] < i12) {
                while (i19 < iL && bVar.e(i19, i11) && (i14 = iArrJ[4]) < i12) {
                    iArrJ[4] = i14 + 1;
                    i19++;
                }
                int i20 = iArrJ[4];
                if (i20 < i12 && Math.abs(((((iArrJ[0] + iArrJ[1]) + iArrJ[2]) + iArrJ[3]) + i20) - i13) * 5 < i13) {
                    if (h(iArrJ)) {
                        return a(iArrJ, i19);
                    }
                }
                return Float.NaN;
            }
        }
        return Float.NaN;
    }

    private float e(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        com.google.zxing.common.b bVar = this.f130949a;
        int iH = bVar.h();
        int[] iArrJ = j();
        int i17 = i10;
        while (i17 >= 0 && bVar.e(i11, i17)) {
            iArrJ[2] = iArrJ[2] + 1;
            i17--;
        }
        if (i17 < 0) {
            return Float.NaN;
        }
        while (i17 >= 0 && !bVar.e(i11, i17)) {
            int i18 = iArrJ[1];
            if (i18 > i12) {
                break;
            }
            iArrJ[1] = i18 + 1;
            i17--;
        }
        if (i17 >= 0 && iArrJ[1] <= i12) {
            while (i17 >= 0 && bVar.e(i11, i17) && (i16 = iArrJ[0]) <= i12) {
                iArrJ[0] = i16 + 1;
                i17--;
            }
            if (iArrJ[0] > i12) {
                return Float.NaN;
            }
            int i19 = i10 + 1;
            while (i19 < iH && bVar.e(i11, i19)) {
                iArrJ[2] = iArrJ[2] + 1;
                i19++;
            }
            if (i19 == iH) {
                return Float.NaN;
            }
            while (i19 < iH && !bVar.e(i11, i19) && (i15 = iArrJ[3]) < i12) {
                iArrJ[3] = i15 + 1;
                i19++;
            }
            if (i19 != iH && iArrJ[3] < i12) {
                while (i19 < iH && bVar.e(i11, i19) && (i14 = iArrJ[4]) < i12) {
                    iArrJ[4] = i14 + 1;
                    i19++;
                }
                int i20 = iArrJ[4];
                if (i20 < i12 && Math.abs(((((iArrJ[0] + iArrJ[1]) + iArrJ[2]) + iArrJ[3]) + i20) - i13) * 5 < i13 * 2 && h(iArrJ)) {
                    return a(iArrJ, i19);
                }
            }
        }
        return Float.NaN;
    }

    private int g() {
        if (this.f130950b.size() <= 1) {
            return 0;
        }
        d dVar = null;
        for (d dVar2 : this.f130950b) {
            if (dVar2.h() >= 2) {
                if (dVar != null) {
                    this.f130951c = true;
                    return ((int) (Math.abs(dVar.c() - dVar2.c()) - Math.abs(dVar.d() - dVar2.d()))) / 2;
                }
                dVar = dVar2;
            }
        }
        return 0;
    }

    protected static boolean h(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f10 = i10 / 7.0f;
        float f11 = f10 / 2.0f;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs(f10 - ((float) iArr[1])) < f11 && Math.abs((f10 * 3.0f) - ((float) iArr[2])) < 3.0f * f11 && Math.abs(f10 - ((float) iArr[3])) < f11 && Math.abs(f10 - ((float) iArr[4])) < f11;
    }

    protected static boolean i(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f10 = i10 / 7.0f;
        float f11 = f10 / 1.333f;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs(f10 - ((float) iArr[1])) < f11 && Math.abs((f10 * 3.0f) - ((float) iArr[2])) < 3.0f * f11 && Math.abs(f10 - ((float) iArr[3])) < f11 && Math.abs(f10 - ((float) iArr[4])) < f11;
    }

    private int[] j() {
        b(this.f130952d);
        return this.f130952d;
    }

    private boolean o() {
        int size = this.f130950b.size();
        float fAbs = 0.0f;
        int i10 = 0;
        float fI = 0.0f;
        for (d dVar : this.f130950b) {
            if (dVar.h() >= 2) {
                i10++;
                fI += dVar.i();
            }
        }
        if (i10 < 3) {
            return false;
        }
        float f10 = fI / size;
        Iterator<d> it = this.f130950b.iterator();
        while (it.hasNext()) {
            fAbs += Math.abs(it.next().i() - f10);
        }
        return fAbs <= fI * 0.05f;
    }

    private d[] p() throws m {
        int size = this.f130950b.size();
        if (size < 3) {
            throw m.a();
        }
        float fI = 0.0f;
        if (size > 3) {
            Iterator<d> it = this.f130950b.iterator();
            float f10 = 0.0f;
            float f11 = 0.0f;
            while (it.hasNext()) {
                float fI2 = it.next().i();
                f10 += fI2;
                f11 += fI2 * fI2;
            }
            float f12 = size;
            float f13 = f10 / f12;
            float fSqrt = (float) Math.sqrt((f11 / f12) - (f13 * f13));
            Collections.sort(this.f130950b, new c(f13));
            float fMax = Math.max(0.2f * f13, fSqrt);
            int i10 = 0;
            while (i10 < this.f130950b.size() && this.f130950b.size() > 3) {
                if (Math.abs(this.f130950b.get(i10).i() - f13) > fMax) {
                    this.f130950b.remove(i10);
                    i10--;
                }
                i10++;
            }
        }
        if (this.f130950b.size() > 3) {
            Iterator<d> it2 = this.f130950b.iterator();
            while (it2.hasNext()) {
                fI += it2.next().i();
            }
            Collections.sort(this.f130950b, new b(fI / this.f130950b.size()));
            List<d> list = this.f130950b;
            list.subList(3, list.size()).clear();
        }
        return new d[]{this.f130950b.get(0), this.f130950b.get(1), this.f130950b.get(2)};
    }

    protected final void b(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr[i10] = 0;
        }
    }

    final f f(Map<com.google.zxing.e, ?> map) throws m {
        boolean z10 = map != null && map.containsKey(com.google.zxing.e.TRY_HARDER);
        int iH = this.f130949a.h();
        int iL = this.f130949a.l();
        int i10 = (iH * 3) / 388;
        if (i10 < 3 || z10) {
            i10 = 3;
        }
        int[] iArr = new int[5];
        int i11 = i10 - 1;
        boolean zO = false;
        while (i11 < iH && !zO) {
            b(iArr);
            int i12 = 0;
            int i13 = 0;
            while (i12 < iL) {
                if (this.f130949a.e(i12, i11)) {
                    if ((i13 & 1) == 1) {
                        i13++;
                    }
                    iArr[i13] = iArr[i13] + 1;
                } else if ((i13 & 1) != 0) {
                    iArr[i13] = iArr[i13] + 1;
                } else if (i13 != 4) {
                    i13++;
                    iArr[i13] = iArr[i13] + 1;
                } else if (h(iArr) && m(iArr, i11, i12)) {
                    if (this.f130951c) {
                        zO = o();
                    } else {
                        int iG = g();
                        int i14 = iArr[2];
                        if (iG > i14) {
                            i11 += (iG - i14) - 2;
                            i12 = iL - 1;
                        }
                    }
                    b(iArr);
                    i10 = 2;
                    i13 = 0;
                } else {
                    q(iArr);
                    i13 = 3;
                }
                i12++;
            }
            if (h(iArr) && m(iArr, i11, iL)) {
                i10 = iArr[0];
                if (this.f130951c) {
                    zO = o();
                }
            }
            i11 += i10;
        }
        d[] dVarArrP = p();
        t.e(dVarArrP);
        return new f(dVarArrP);
    }

    protected final com.google.zxing.common.b k() {
        return this.f130949a;
    }

    protected final List<d> l() {
        return this.f130950b;
    }

    protected final boolean m(int[] iArr, int i10, int i11) {
        int i12 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int iA = (int) a(iArr, i11);
        float fE = e(i10, iA, iArr[2], i12);
        if (!Float.isNaN(fE)) {
            int i13 = (int) fE;
            float fD = d(iA, i13, iArr[2], i12);
            if (!Float.isNaN(fD) && c(i13, (int) fD)) {
                float f10 = i12 / 7.0f;
                for (int i14 = 0; i14 < this.f130950b.size(); i14++) {
                    d dVar = this.f130950b.get(i14);
                    if (dVar.f(f10, fE, fD)) {
                        this.f130950b.set(i14, dVar.g(fE, fD, f10));
                        return true;
                    }
                }
                d dVar2 = new d(fD, fE, f10);
                this.f130950b.add(dVar2);
                u uVar = this.f130953e;
                if (uVar != null) {
                    uVar.a(dVar2);
                }
                return true;
            }
        }
        return false;
    }

    @Deprecated
    protected final boolean n(int[] iArr, int i10, int i11, boolean z10) {
        return m(iArr, i10, i11);
    }

    protected final void q(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    public e(com.google.zxing.common.b bVar, u uVar) {
        this.f130949a = bVar;
        this.f130950b = new ArrayList();
        this.f130952d = new int[5];
        this.f130953e = uVar;
    }
}
