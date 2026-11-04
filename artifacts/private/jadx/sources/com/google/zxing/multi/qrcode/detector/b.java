package com.google.zxing.multi.qrcode.detector;

import com.google.zxing.m;
import com.google.zxing.qrcode.detector.d;
import com.google.zxing.qrcode.detector.e;
import com.google.zxing.qrcode.detector.f;
import com.google.zxing.t;
import com.google.zxing.u;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class b extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final f[] f130525i = new f[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f130526j = 180.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f130527k = 9.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f130528l = 0.05f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f130529m = 0.5f;

    /* JADX INFO: renamed from: com.google.zxing.multi.qrcode.detector.b$b, reason: collision with other inner class name */
    private static final class C1434b implements Serializable, Comparator<d> {
        private C1434b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            double dI = dVar2.i() - dVar.i();
            if (dI < 0.0d) {
                return -1;
            }
            return dI > 0.0d ? 1 : 0;
        }
    }

    b(com.google.zxing.common.b bVar) {
        super(bVar);
    }

    private d[][] s() throws m {
        List<d> listL = l();
        int size = listL.size();
        if (size < 3) {
            throw m.a();
        }
        if (size == 3) {
            return new d[][]{new d[]{listL.get(0), listL.get(1), listL.get(2)}};
        }
        Collections.sort(listL, new C1434b());
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < size - 2; i10++) {
            d dVar = listL.get(i10);
            if (dVar != null) {
                for (int i11 = i10 + 1; i11 < size - 1; i11++) {
                    d dVar2 = listL.get(i11);
                    if (dVar2 != null) {
                        float fI = (dVar.i() - dVar2.i()) / Math.min(dVar.i(), dVar2.i());
                        if (Math.abs(dVar.i() - dVar2.i()) > 0.5f && fI >= f130528l) {
                            break;
                        }
                        for (int i12 = i11 + 1; i12 < size; i12++) {
                            d dVar3 = listL.get(i12);
                            if (dVar3 != null) {
                                float fI2 = (dVar2.i() - dVar3.i()) / Math.min(dVar2.i(), dVar3.i());
                                if (Math.abs(dVar2.i() - dVar3.i()) > 0.5f && fI2 >= f130528l) {
                                    break;
                                }
                                d[] dVarArr = {dVar, dVar2, dVar3};
                                t.e(dVarArr);
                                f fVar = new f(dVarArr);
                                float fB = t.b(fVar.b(), fVar.a());
                                float fB2 = t.b(fVar.c(), fVar.a());
                                float fB3 = t.b(fVar.b(), fVar.c());
                                float fI3 = (fB + fB3) / (dVar.i() * 2.0f);
                                if (fI3 <= f130526j && fI3 >= f130527k && Math.abs((fB - fB3) / Math.min(fB, fB3)) < 0.1f) {
                                    float fSqrt = (float) Math.sqrt((fB * fB) + (fB3 * fB3));
                                    if (Math.abs((fB2 - fSqrt) / Math.min(fB2, fSqrt)) < 0.1f) {
                                        arrayList.add(dVarArr);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            throw m.a();
        }
        return (d[][]) arrayList.toArray(new d[arrayList.size()][]);
    }

    public f[] r(Map<com.google.zxing.e, ?> map) throws m {
        boolean z10 = map != null && map.containsKey(com.google.zxing.e.TRY_HARDER);
        com.google.zxing.common.b bVarK = k();
        int iH = bVarK.h();
        int iL = bVarK.l();
        int i10 = (iH * 3) / 388;
        if (i10 < 3 || z10) {
            i10 = 3;
        }
        int[] iArr = new int[5];
        for (int i11 = i10 - 1; i11 < iH; i11 += i10) {
            b(iArr);
            int i12 = 0;
            for (int i13 = 0; i13 < iL; i13++) {
                if (bVarK.e(i13, i11)) {
                    if ((i12 & 1) == 1) {
                        i12++;
                    }
                    iArr[i12] = iArr[i12] + 1;
                } else if ((i12 & 1) != 0) {
                    iArr[i12] = iArr[i12] + 1;
                } else if (i12 != 4) {
                    i12++;
                    iArr[i12] = iArr[i12] + 1;
                } else if (e.h(iArr) && m(iArr, i11, i13)) {
                    b(iArr);
                    i12 = 0;
                } else {
                    q(iArr);
                    i12 = 3;
                }
            }
            if (e.h(iArr)) {
                m(iArr, i11, iL);
            }
        }
        d[][] dVarArrS = s();
        ArrayList arrayList = new ArrayList();
        for (d[] dVarArr : dVarArrS) {
            t.e(dVarArr);
            arrayList.add(new f(dVarArr));
        }
        return arrayList.isEmpty() ? f130525i : (f[]) arrayList.toArray(new f[arrayList.size()]);
    }

    b(com.google.zxing.common.b bVar, u uVar) {
        super(bVar, uVar);
    }
}
