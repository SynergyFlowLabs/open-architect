package com.google.zxing.qrcode.detector;

import com.google.zxing.m;
import com.google.zxing.u;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.zxing.common.b f130933a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f130935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f130936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f130937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f130938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f130939g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final u f130941i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a> f130934b = new ArrayList(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f130940h = new int[3];

    b(com.google.zxing.common.b bVar, int i10, int i11, int i12, int i13, float f10, u uVar) {
        this.f130933a = bVar;
        this.f130935c = i10;
        this.f130936d = i11;
        this.f130937e = i12;
        this.f130938f = i13;
        this.f130939g = f10;
        this.f130941i = uVar;
    }

    private static float a(int[] iArr, int i10) {
        return (i10 - iArr[2]) - (iArr[1] / 2.0f);
    }

    private float b(int i10, int i11, int i12, int i13) {
        int i14;
        com.google.zxing.common.b bVar = this.f130933a;
        int iH = bVar.h();
        int[] iArr = this.f130940h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i15 = i10;
        while (i15 >= 0 && bVar.e(i11, i15)) {
            int i16 = iArr[1];
            if (i16 > i12) {
                break;
            }
            iArr[1] = i16 + 1;
            i15--;
        }
        if (i15 >= 0 && iArr[1] <= i12) {
            while (i15 >= 0 && !bVar.e(i11, i15)) {
                int i17 = iArr[0];
                if (i17 > i12) {
                    break;
                }
                iArr[0] = i17 + 1;
                i15--;
            }
            if (iArr[0] > i12) {
                return Float.NaN;
            }
            int i18 = i10 + 1;
            while (i18 < iH && bVar.e(i11, i18)) {
                int i19 = iArr[1];
                if (i19 > i12) {
                    break;
                }
                iArr[1] = i19 + 1;
                i18++;
            }
            if (i18 != iH && iArr[1] <= i12) {
                while (i18 < iH && !bVar.e(i11, i18) && (i14 = iArr[2]) <= i12) {
                    iArr[2] = i14 + 1;
                    i18++;
                }
                int i20 = iArr[2];
                if (i20 <= i12 && Math.abs(((iArr[0] + iArr[1]) + i20) - i13) * 5 < i13 * 2 && d(iArr)) {
                    return a(iArr, i18);
                }
            }
        }
        return Float.NaN;
    }

    private boolean d(int[] iArr) {
        float f10 = this.f130939g;
        float f11 = f10 / 2.0f;
        for (int i10 = 0; i10 < 3; i10++) {
            if (Math.abs(f10 - iArr[i10]) >= f11) {
                return false;
            }
        }
        return true;
    }

    private a e(int[] iArr, int i10, int i11) {
        int i12 = iArr[0] + iArr[1] + iArr[2];
        float fA = a(iArr, i11);
        float fB = b(i10, (int) fA, iArr[1] * 2, i12);
        if (!Float.isNaN(fB)) {
            float f10 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
            for (a aVar : this.f130934b) {
                if (aVar.f(f10, fB, fA)) {
                    return aVar.g(fB, fA, f10);
                }
            }
            a aVar2 = new a(fA, fB, f10);
            this.f130934b.add(aVar2);
            u uVar = this.f130941i;
            if (uVar != null) {
                uVar.a(aVar2);
            }
        }
        return null;
    }

    a c() throws m {
        a aVarE;
        a aVarE2;
        int i10 = this.f130935c;
        int i11 = this.f130938f;
        int i12 = this.f130937e + i10;
        int i13 = this.f130936d + (i11 / 2);
        int[] iArr = new int[3];
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = ((i14 & 1) == 0 ? (i14 + 1) / 2 : -((i14 + 1) / 2)) + i13;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i16 = i10;
            while (i16 < i12 && !this.f130933a.e(i16, i15)) {
                i16++;
            }
            int i17 = 0;
            while (i16 < i12) {
                if (!this.f130933a.e(i16, i15)) {
                    if (i17 == 1) {
                        i17++;
                    }
                    iArr[i17] = iArr[i17] + 1;
                } else if (i17 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i17 != 2) {
                    i17++;
                    iArr[i17] = iArr[i17] + 1;
                } else {
                    if (d(iArr) && (aVarE2 = e(iArr, i15, i16)) != null) {
                        return aVarE2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i17 = 1;
                }
                i16++;
            }
            if (d(iArr) && (aVarE = e(iArr, i15, i12)) != null) {
                return aVarE;
            }
        }
        if (this.f130934b.isEmpty()) {
            throw m.a();
        }
        return this.f130934b.get(0);
    }
}
