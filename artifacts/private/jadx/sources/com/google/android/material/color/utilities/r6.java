package com.google.android.material.color.utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: loaded from: classes4.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class r6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f112249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l f112250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<l> f112251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<l> f112252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<l, Double> f112253e;

    private r6() {
        throw new UnsupportedOperationException();
    }

    private l d() {
        return g().get(0);
    }

    private List<l> f() {
        List<l> list = this.f112252d;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (double d10 = 0.0d; d10 <= 360.0d; d10 += 1.0d) {
            arrayList.add(l.a(d10, this.f112249a.c(), this.f112249a.e()));
        }
        List<l> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.f112252d = listUnmodifiableList;
        return listUnmodifiableList;
    }

    private List<l> g() {
        List<l> list = this.f112251c;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(f());
        arrayList.add(this.f112249a);
        Collections.sort(arrayList, Comparator.comparing(new Function() { // from class: com.google.android.material.color.utilities.p6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f112245a.i().get((l) obj);
            }
        }, new Comparator() { // from class: com.google.android.material.color.utilities.q6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Double) obj).compareTo((Double) obj2);
            }
        }));
        this.f112251c = arrayList;
        return arrayList;
    }

    private Map<l, Double> i() {
        Map<l, Double> map = this.f112253e;
        if (map != null) {
            return map;
        }
        ArrayList<l> arrayList = new ArrayList(f());
        arrayList.add(this.f112249a);
        HashMap map2 = new HashMap();
        for (l lVar : arrayList) {
            map2.put(lVar, Double.valueOf(l(lVar)));
        }
        this.f112253e = map2;
        return map2;
    }

    private l j() {
        return g().get(g().size() - 1);
    }

    private static boolean k(double d10, double d11, double d12) {
        if (d11 < d12) {
            return d11 <= d10 && d10 <= d12;
        }
        return d11 <= d10 || d10 <= d12;
    }

    public static double l(l lVar) {
        double[] dArrL = c.l(lVar.k());
        return ((Math.pow(Math.hypot(dArrL[1], dArrL[2]), 1.07d) * 0.02d) * Math.cos(Math.toRadians(v5.g(v5.g(Math.toDegrees(Math.atan2(dArrL[2], dArrL[1]))) - 50.0d)))) - 0.5d;
    }

    public List<l> b() {
        return c(5, 12);
    }

    public List<l> c(int i10, int i11) {
        int iRound = (int) Math.round(this.f112249a.d());
        l lVar = f().get(iRound);
        double dH = h(lVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(lVar);
        double dAbs = 0.0d;
        double dAbs2 = 0.0d;
        int i12 = 0;
        while (i12 < 360) {
            double dH2 = h(f().get(v5.h(iRound + i12)));
            dAbs2 += Math.abs(dH2 - dH);
            i12++;
            dH = dH2;
        }
        double d10 = dAbs2 / ((double) i11);
        double dH3 = h(lVar);
        int i13 = 1;
        while (arrayList.size() < i11) {
            l lVar2 = f().get(v5.h(iRound + i13));
            double dH4 = h(lVar2);
            dAbs += Math.abs(dH4 - dH3);
            boolean z10 = dAbs >= ((double) arrayList.size()) * d10;
            int i14 = 1;
            while (z10 && arrayList.size() < i11) {
                arrayList.add(lVar2);
                int i15 = i13;
                z10 = dAbs >= ((double) (arrayList.size() + i14)) * d10;
                i14++;
                i13 = i15;
            }
            i13++;
            if (i13 > 360) {
                while (arrayList.size() < i11) {
                    arrayList.add(lVar2);
                }
                break;
            }
            dH3 = dH4;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f112249a);
        int iFloor = (int) Math.floor((((double) i10) - 1.0d) / 2.0d);
        for (int i16 = 1; i16 < iFloor + 1; i16++) {
            int size = 0 - i16;
            while (size < 0) {
                size += arrayList.size();
            }
            if (size >= arrayList.size()) {
                size %= arrayList.size();
            }
            arrayList2.add(0, (l) arrayList.get(size));
        }
        int i17 = i10 - iFloor;
        for (int i18 = 1; i18 < i17; i18++) {
            int size2 = i18;
            while (size2 < 0) {
                size2 += arrayList.size();
            }
            if (size2 >= arrayList.size()) {
                size2 %= arrayList.size();
            }
            arrayList2.add((l) arrayList.get(size2));
        }
        return arrayList2;
    }

    public l e() {
        double d10;
        l lVar = this.f112250b;
        if (lVar != null) {
            return lVar;
        }
        double d11 = d().d();
        double dDoubleValue = i().get(d()).doubleValue();
        double d12 = j().d();
        double dDoubleValue2 = i().get(j()).doubleValue() - dDoubleValue;
        boolean zK = k(this.f112249a.d(), d11, d12);
        double d13 = zK ? d12 : d11;
        double d14 = zK ? d11 : d12;
        l lVar2 = f().get((int) Math.round(this.f112249a.d()));
        double d15 = 1.0d;
        double dH = 1.0d - h(this.f112249a);
        double d16 = 1000.0d;
        double d17 = 0.0d;
        while (d17 <= 360.0d) {
            double dG = v5.g((d15 * d17) + d13);
            if (k(dG, d13, d14)) {
                d10 = d15;
                l lVar3 = f().get((int) Math.round(dG));
                double dAbs = Math.abs(dH - ((i().get(lVar3).doubleValue() - dDoubleValue) / dDoubleValue2));
                if (dAbs < d16) {
                    lVar2 = lVar3;
                    d16 = dAbs;
                }
            } else {
                d10 = d15;
            }
            d17 += d10;
            d15 = d10;
        }
        this.f112250b = lVar2;
        return lVar2;
    }

    public double h(l lVar) {
        double dDoubleValue = i().get(j()).doubleValue() - i().get(d()).doubleValue();
        double dDoubleValue2 = i().get(lVar).doubleValue() - i().get(d()).doubleValue();
        if (dDoubleValue == 0.0d) {
            return 0.5d;
        }
        return dDoubleValue2 / dDoubleValue;
    }

    public r6(l lVar) {
        this.f112249a = lVar;
    }
}
