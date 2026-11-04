package com.google.zxing.datamatrix.detector;

import com.google.zxing.common.g;
import com.google.zxing.common.i;
import com.google.zxing.m;
import com.google.zxing.t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.zxing.common.b f130406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w9.c f130407b;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t f130408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t f130409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f130410c;

        t a() {
            return this.f130408a;
        }

        t b() {
            return this.f130409b;
        }

        int c() {
            return this.f130410c;
        }

        public String toString() {
            return this.f130408a + "/" + this.f130409b + '/' + this.f130410c;
        }

        private b(t tVar, t tVar2, int i10) {
            this.f130408a = tVar;
            this.f130409b = tVar2;
            this.f130410c = i10;
        }
    }

    private static final class c implements Serializable, Comparator<b> {
        private c() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar.c() - bVar2.c();
        }
    }

    public a(com.google.zxing.common.b bVar) throws m {
        this.f130406a = bVar;
        this.f130407b = new w9.c(bVar);
    }

    private t a(t tVar, t tVar2, t tVar3, t tVar4, int i10) {
        float f10 = i10;
        float fD = d(tVar, tVar2) / f10;
        float fD2 = d(tVar3, tVar4);
        t tVar5 = new t(tVar4.c() + (((tVar4.c() - tVar3.c()) / fD2) * fD), tVar4.d() + (fD * ((tVar4.d() - tVar3.d()) / fD2)));
        float fD3 = d(tVar, tVar3) / f10;
        float fD4 = d(tVar2, tVar4);
        t tVar6 = new t(tVar4.c() + (((tVar4.c() - tVar2.c()) / fD4) * fD3), tVar4.d() + (fD3 * ((tVar4.d() - tVar2.d()) / fD4)));
        if (f(tVar5)) {
            if (!f(tVar6) || Math.abs(h(tVar3, tVar5).c() - h(tVar2, tVar5).c()) <= Math.abs(h(tVar3, tVar6).c() - h(tVar2, tVar6).c())) {
                return tVar5;
            }
        } else if (!f(tVar6)) {
            return null;
        }
        return tVar6;
    }

    private t b(t tVar, t tVar2, t tVar3, t tVar4, int i10, int i11) {
        float fD = d(tVar, tVar2) / i10;
        float fD2 = d(tVar3, tVar4);
        t tVar5 = new t(tVar4.c() + (((tVar4.c() - tVar3.c()) / fD2) * fD), tVar4.d() + (fD * ((tVar4.d() - tVar3.d()) / fD2)));
        float fD3 = d(tVar, tVar3) / i11;
        float fD4 = d(tVar2, tVar4);
        t tVar6 = new t(tVar4.c() + (((tVar4.c() - tVar2.c()) / fD4) * fD3), tVar4.d() + (fD3 * ((tVar4.d() - tVar2.d()) / fD4)));
        if (f(tVar5)) {
            if (!f(tVar6) || Math.abs(i10 - h(tVar3, tVar5).c()) + Math.abs(i11 - h(tVar2, tVar5).c()) <= Math.abs(i10 - h(tVar3, tVar6).c()) + Math.abs(i11 - h(tVar2, tVar6).c())) {
                return tVar5;
            }
        } else if (!f(tVar6)) {
            return null;
        }
        return tVar6;
    }

    private static int d(t tVar, t tVar2) {
        return w9.a.c(t.b(tVar, tVar2));
    }

    private static void e(Map<t, Integer> map, t tVar) {
        Integer num = map.get(tVar);
        map.put(tVar, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    private boolean f(t tVar) {
        return tVar.c() >= 0.0f && tVar.c() < ((float) this.f130406a.l()) && tVar.d() > 0.0f && tVar.d() < ((float) this.f130406a.h());
    }

    private static com.google.zxing.common.b g(com.google.zxing.common.b bVar, t tVar, t tVar2, t tVar3, t tVar4, int i10, int i11) throws m {
        float f10 = i10 - 0.5f;
        float f11 = i11 - 0.5f;
        return i.b().c(bVar, i10, i11, 0.5f, 0.5f, f10, 0.5f, f10, f11, 0.5f, f11, tVar.c(), tVar.d(), tVar4.c(), tVar4.d(), tVar3.c(), tVar3.d(), tVar2.c(), tVar2.d());
    }

    private b h(t tVar, t tVar2) {
        int iC = (int) tVar.c();
        int iD = (int) tVar.d();
        int iC2 = (int) tVar2.c();
        int iD2 = (int) tVar2.d();
        int i10 = 0;
        boolean z10 = Math.abs(iD2 - iD) > Math.abs(iC2 - iC);
        if (z10) {
            iD = iC;
            iC = iD;
            iD2 = iC2;
            iC2 = iD2;
        }
        int iAbs = Math.abs(iC2 - iC);
        int iAbs2 = Math.abs(iD2 - iD);
        int i11 = (-iAbs) / 2;
        int i12 = iD < iD2 ? 1 : -1;
        int i13 = iC >= iC2 ? -1 : 1;
        boolean zE = this.f130406a.e(z10 ? iD : iC, z10 ? iC : iD);
        while (iC != iC2) {
            boolean zE2 = this.f130406a.e(z10 ? iD : iC, z10 ? iC : iD);
            if (zE2 != zE) {
                i10++;
                zE = zE2;
            }
            i11 += iAbs2;
            if (i11 > 0) {
                if (iD == iD2) {
                    break;
                }
                iD += i12;
                i11 -= iAbs;
            }
            iC += i13;
        }
        return new b(tVar, tVar2, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g c() throws m {
        t tVar;
        t tVar2;
        com.google.zxing.common.b bVarG;
        t[] tVarArrC = this.f130407b.c();
        t tVar3 = tVarArrC[0];
        t tVar4 = tVarArrC[1];
        t tVar5 = tVarArrC[2];
        t tVar6 = tVarArrC[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(h(tVar3, tVar4));
        arrayList.add(h(tVar3, tVar5));
        arrayList.add(h(tVar4, tVar6));
        arrayList.add(h(tVar5, tVar6));
        t tVar7 = null;
        Collections.sort(arrayList, new c());
        b bVar = (b) arrayList.get(0);
        b bVar2 = (b) arrayList.get(1);
        HashMap map = new HashMap();
        e(map, bVar.a());
        e(map, bVar.b());
        e(map, bVar2.a());
        e(map, bVar2.b());
        t tVar8 = null;
        t tVar9 = null;
        for (Map.Entry entry : map.entrySet()) {
            t tVar10 = (t) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                tVar8 = tVar10;
            } else if (tVar7 == null) {
                tVar7 = tVar10;
            } else {
                tVar9 = tVar10;
            }
        }
        if (tVar7 == null || tVar8 == null || tVar9 == null) {
            throw m.a();
        }
        t[] tVarArr = {tVar7, tVar8, tVar9};
        t.e(tVarArr);
        t tVar11 = tVarArr[0];
        t tVar12 = tVarArr[1];
        t tVar13 = tVarArr[2];
        if (!map.containsKey(tVar3)) {
            tVar4 = tVar3;
        } else if (map.containsKey(tVar4)) {
            tVar4 = !map.containsKey(tVar5) ? tVar5 : tVar6;
        }
        int iC = h(tVar13, tVar4).c();
        int iC2 = h(tVar11, tVar4).c();
        if ((iC & 1) == 1) {
            iC++;
        }
        int i10 = iC + 2;
        if ((iC2 & 1) == 1) {
            iC2++;
        }
        int i11 = iC2 + 2;
        if (i10 * 4 >= i11 * 7 || i11 * 4 >= i10 * 7) {
            tVar = tVar13;
            tVar2 = tVar12;
            t tVarB = b(tVar2, tVar11, tVar, tVar4, i10, i11);
            tVar11 = tVar11;
            if (tVarB != null) {
                tVar4 = tVarB;
            }
            int iC3 = h(tVar, tVar4).c();
            int iC4 = h(tVar11, tVar4).c();
            if ((iC3 & 1) == 1) {
                iC3++;
            }
            int i12 = iC3;
            if ((iC4 & 1) == 1) {
                iC4++;
            }
            bVarG = g(this.f130406a, tVar, tVar2, tVar11, tVar4, i12, iC4);
        } else {
            tVar = tVar13;
            tVar2 = tVar12;
            t tVarA = a(tVar2, tVar11, tVar, tVar4, Math.min(i11, i10));
            if (tVarA != null) {
                tVar4 = tVarA;
            }
            int iMax = Math.max(h(tVar, tVar4).c(), h(tVar11, tVar4).c());
            int i13 = iMax + 1;
            if ((i13 & 1) == 1) {
                i13 = iMax + 2;
            }
            int i14 = i13;
            bVarG = g(this.f130406a, tVar, tVar2, tVar11, tVar4, i14, i14);
        }
        return new g(bVarG, new t[]{tVar, tVar2, tVar11, tVar4});
    }
}
