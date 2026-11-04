package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
class l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f111783h = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f111784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<k> f111785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<k> f111786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f111787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f111788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f111789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f111790g;

    private l(@NonNull k kVar, List<k> list, List<k> list2) {
        this.f111784a = kVar;
        this.f111785b = Collections.unmodifiableList(list);
        this.f111786c = Collections.unmodifiableList(list2);
        float f10 = list.get(list.size() - 1).c().f111775a - kVar.c().f111775a;
        this.f111789f = f10;
        float f11 = kVar.j().f111775a - list2.get(list2.size() - 1).j().f111775a;
        this.f111790g = f11;
        this.f111787d = m(f10, list, true);
        this.f111788e = m(f11, list2, false);
    }

    private k a(List<k> list, float f10, float[] fArr) {
        float[] fArrO = o(list, f10, fArr);
        return fArrO[0] >= 0.5f ? list.get((int) fArrO[2]) : list.get((int) fArrO[1]);
    }

    private static int b(k kVar, float f10) {
        for (int i10 = kVar.i(); i10 < kVar.g().size(); i10++) {
            if (f10 == kVar.g().get(i10).f111777c) {
                return i10;
            }
        }
        return kVar.g().size() - 1;
    }

    private static int c(k kVar) {
        for (int i10 = 0; i10 < kVar.g().size(); i10++) {
            if (!kVar.g().get(i10).f111779e) {
                return i10;
            }
        }
        return -1;
    }

    private static int d(k kVar, float f10) {
        for (int iB = kVar.b() - 1; iB >= 0; iB--) {
            if (f10 == kVar.g().get(iB).f111777c) {
                return iB;
            }
        }
        return 0;
    }

    private static int e(k kVar) {
        for (int size = kVar.g().size() - 1; size >= 0; size--) {
            if (!kVar.g().get(size).f111779e) {
                return size;
            }
        }
        return -1;
    }

    static l f(b bVar, k kVar, float f10, float f11, float f12) {
        return new l(kVar, p(bVar, kVar, f10, f11), n(bVar, kVar, f10, f12));
    }

    private static float[] m(float f10, List<k> list, boolean z10) {
        int size = list.size();
        float[] fArr = new float[size];
        int i10 = 1;
        while (i10 < size) {
            int i11 = i10 - 1;
            k kVar = list.get(i11);
            k kVar2 = list.get(i10);
            fArr[i10] = i10 == size + (-1) ? 1.0f : fArr[i11] + ((z10 ? kVar2.c().f111775a - kVar.c().f111775a : kVar.j().f111775a - kVar2.j().f111775a) / f10);
            i10++;
        }
        return fArr;
    }

    private static List<k> n(b bVar, k kVar, float f10, float f11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(kVar);
        int iE = e(kVar);
        float fD = bVar.i() ? bVar.d() : bVar.b();
        if (!r(bVar, kVar) && iE != -1) {
            int i10 = iE - kVar.i();
            float f12 = kVar.c().f111776b - (kVar.c().f111778d / 2.0f);
            if (i10 <= 0 && kVar.h().f111780f > 0.0f) {
                arrayList.add(v(kVar, f12 - kVar.h().f111780f, fD));
                return arrayList;
            }
            int i11 = 0;
            float f13 = 0.0f;
            while (i11 < i10) {
                k kVar2 = (k) arrayList.get(arrayList.size() - 1);
                int i12 = iE - i11;
                float f14 = f13 + kVar.g().get(i12).f111780f;
                int i13 = i12 + 1;
                k kVarT = t(kVar2, iE, i13 < kVar.g().size() ? d(kVar2, kVar.g().get(i13).f111777c) + 1 : 0, f12 - f14, kVar.b() + i11 + 1, kVar.i() + i11 + 1, fD);
                if (i11 == i10 - 1 && f11 > 0.0f) {
                    kVarT = u(kVarT, f11, fD, false, f10);
                }
                arrayList.add(kVarT);
                i11++;
                f13 = f14;
            }
        } else if (f11 > 0.0f) {
            arrayList.add(u(kVar, f11, fD, false, f10));
        }
        return arrayList;
    }

    private static float[] o(List<k> list, float f10, float[] fArr) {
        int size = list.size();
        float f11 = fArr[0];
        int i10 = 1;
        while (i10 < size) {
            float f12 = fArr[i10];
            if (f10 <= f12) {
                return new float[]{com.google.android.material.animation.b.b(0.0f, 1.0f, f11, f12, f10), i10 - 1, i10};
            }
            i10++;
            f11 = f12;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static List<k> p(b bVar, k kVar, float f10, float f11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(kVar);
        int iC = c(kVar);
        float fD = bVar.i() ? bVar.d() : bVar.b();
        if (!q(kVar) && iC != -1) {
            int iB = kVar.b() - iC;
            float f12 = kVar.c().f111776b - (kVar.c().f111778d / 2.0f);
            if (iB <= 0 && kVar.a().f111780f > 0.0f) {
                arrayList.add(v(kVar, f12 + kVar.a().f111780f, fD));
                return arrayList;
            }
            int i10 = 0;
            float f13 = 0.0f;
            while (i10 < iB) {
                k kVar2 = (k) arrayList.get(arrayList.size() - 1);
                int i11 = iC + i10;
                int size = kVar.g().size() - 1;
                float f14 = f13 + kVar.g().get(i11).f111780f;
                int i12 = i11 - 1;
                if (i12 >= 0) {
                    size = b(kVar2, kVar.g().get(i12).f111777c) - 1;
                }
                k kVarT = t(kVar2, iC, size, f12 + f14, (kVar.b() - i10) - 1, (kVar.i() - i10) - 1, fD);
                if (i10 == iB - 1 && f11 > 0.0f) {
                    kVarT = u(kVarT, f11, fD, true, f10);
                }
                arrayList.add(kVarT);
                i10++;
                f13 = f14;
            }
        } else if (f11 > 0.0f) {
            arrayList.add(u(kVar, f11, fD, true, f10));
        }
        return arrayList;
    }

    private static boolean q(k kVar) {
        if (kVar.a().f111776b - (kVar.a().f111778d / 2.0f) < 0.0f || kVar.a() != kVar.d()) {
            return false;
        }
        int i10 = 7 & 1;
        return true;
    }

    private static boolean r(b bVar, k kVar) {
        int iB = bVar.b();
        if (bVar.i()) {
            iB = bVar.d();
        }
        return kVar.h().f111776b + (kVar.h().f111778d / 2.0f) <= ((float) iB) && kVar.h() == kVar.k();
    }

    private static k s(List<k> list, float f10, float[] fArr) {
        float[] fArrO = o(list, f10, fArr);
        return k.m(list.get((int) fArrO[1]), list.get((int) fArrO[2]), fArrO[0]);
    }

    private static k t(k kVar, int i10, int i11, float f10, int i12, int i13, float f11) {
        ArrayList arrayList = new ArrayList(kVar.g());
        arrayList.add(i11, (k.c) arrayList.remove(i10));
        k.b bVar = new k.b(kVar.f(), f11);
        int i14 = 0;
        while (i14 < arrayList.size()) {
            k.c cVar = (k.c) arrayList.get(i14);
            float f12 = cVar.f111778d;
            bVar.e(f10 + (f12 / 2.0f), cVar.f111777c, f12, i14 >= i12 && i14 <= i13, cVar.f111779e, cVar.f111780f);
            f10 += cVar.f111778d;
            i14++;
        }
        return bVar.i();
    }

    private static k u(k kVar, float f10, float f11, boolean z10, float f12) {
        ArrayList arrayList = new ArrayList(kVar.g());
        k.b bVar = new k.b(kVar.f(), f11);
        float fL = f10 / kVar.l();
        float f13 = z10 ? f10 : 0.0f;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            k.c cVar = (k.c) arrayList.get(i10);
            if (cVar.f111779e) {
                bVar.e(cVar.f111776b, cVar.f111777c, cVar.f111778d, false, true, cVar.f111780f);
            } else {
                boolean z11 = i10 >= kVar.b() && i10 <= kVar.i();
                float f14 = cVar.f111778d - fL;
                float fB = g.b(f14, kVar.f(), f12);
                float f15 = (f14 / 2.0f) + f13;
                float f16 = f15 - cVar.f111776b;
                bVar.f(f15, fB, f14, z11, false, cVar.f111780f, z10 ? f16 : 0.0f, z10 ? 0.0f : f16);
                f13 += f14;
            }
            i10++;
        }
        return bVar.i();
    }

    private static k v(k kVar, float f10, float f11) {
        return t(kVar, 0, 0, f10, kVar.b(), kVar.i(), f11);
    }

    k g() {
        return this.f111784a;
    }

    k h() {
        List<k> list = this.f111786c;
        return list.get(list.size() - 1);
    }

    Map<Integer, k> i(int i10, int i11, int i12, boolean z10) {
        float f10 = this.f111784a.f();
        HashMap map = new HashMap();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i13 >= i10) {
                break;
            }
            int i15 = z10 ? (i10 - i13) - 1 : i13;
            if (i15 * f10 * (z10 ? -1 : 1) > i12 - this.f111790g || i13 >= i10 - this.f111786c.size()) {
                Integer numValueOf = Integer.valueOf(i15);
                List<k> list = this.f111786c;
                map.put(numValueOf, list.get(n1.a.e(i14, 0, list.size() - 1)));
                i14++;
            }
            i13++;
        }
        int i16 = 0;
        for (int i17 = i10 - 1; i17 >= 0; i17--) {
            int i18 = z10 ? (i10 - i17) - 1 : i17;
            if (i18 * f10 * (z10 ? -1 : 1) < i11 + this.f111789f || i17 < this.f111785b.size()) {
                Integer numValueOf2 = Integer.valueOf(i18);
                List<k> list2 = this.f111785b;
                map.put(numValueOf2, list2.get(n1.a.e(i16, 0, list2.size() - 1)));
                i16++;
            }
        }
        return map;
    }

    public k j(float f10, float f11, float f12) {
        return k(f10, f11, f12, false);
    }

    k k(float f10, float f11, float f12, boolean z10) {
        float fB;
        List<k> list;
        float[] fArr;
        float f13 = this.f111789f + f11;
        float f14 = f12 - this.f111790g;
        float f15 = l().a().f111781g;
        float f16 = h().h().f111782h;
        if (this.f111789f == f15) {
            f13 += f15;
        }
        if (this.f111790g == f16) {
            f14 -= f16;
        }
        if (f10 < f13) {
            fB = com.google.android.material.animation.b.b(1.0f, 0.0f, f11, f13, f10);
            list = this.f111785b;
            fArr = this.f111787d;
        } else {
            if (f10 <= f14) {
                return this.f111784a;
            }
            fB = com.google.android.material.animation.b.b(0.0f, 1.0f, f14, f12, f10);
            list = this.f111786c;
            fArr = this.f111788e;
        }
        return z10 ? a(list, fB, fArr) : s(list, fB, fArr);
    }

    k l() {
        List<k> list = this.f111785b;
        return list.get(list.size() - 1);
    }
}
