package com.google.android.material.color.utilities;

import com.canhub.cropper.core.CropImageOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f112232a = 48.0d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final double f112233b = 0.7d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final double f112234c = 0.3d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final double f112235d = 0.1d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final double f112236e = 5.0d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final double f112237f = 0.01d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f112238g = -12417548;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f112239h = 4;

    private static class a implements Comparator<b> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return Double.compare(bVar2.f112241b, bVar.f112241b);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f112240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f112241b;

        public b(l lVar, double d10) {
            this.f112240a = lVar;
            this.f112241b = d10;
        }
    }

    private o6() {
    }

    public static List<Integer> a(Map<Integer, Integer> map) {
        return d(map, 4, f112238g, true);
    }

    public static List<Integer> b(Map<Integer, Integer> map, int i10) {
        return d(map, i10, f112238g, true);
    }

    public static List<Integer> c(Map<Integer, Integer> map, int i10, int i11) {
        return d(map, i10, i11, true);
    }

    public static List<Integer> d(Map<Integer, Integer> map, int i10, int i11, boolean z10) {
        ArrayList<l> arrayList = new ArrayList();
        int[] iArr = new int[CropImageOptions.S3];
        double d10 = 0.0d;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            l lVarB = l.b(entry.getKey().intValue());
            arrayList.add(lVarB);
            int iFloor = (int) Math.floor(lVarB.d());
            int iIntValue = entry.getValue().intValue();
            iArr[iFloor] = iArr[iFloor] + iIntValue;
            d10 += (double) iIntValue;
        }
        double[] dArr = new double[CropImageOptions.S3];
        for (int i12 = 0; i12 < 360; i12++) {
            double d11 = ((double) iArr[i12]) / d10;
            for (int i13 = i12 - 14; i13 < i12 + 16; i13++) {
                int iH = v5.h(i13);
                dArr[iH] = dArr[iH] + d11;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (l lVar : arrayList) {
            double d12 = dArr[v5.h((int) Math.round(lVar.d()))];
            if (!z10 || (lVar.c() >= 5.0d && d12 > 0.01d)) {
                arrayList2.add(new b(lVar, (d12 * 100.0d * f112233b) + ((lVar.c() - f112232a) * (lVar.c() < f112232a ? f112235d : f112234c))));
            }
        }
        Collections.sort(arrayList2, new a());
        ArrayList arrayList3 = new ArrayList();
        for (int i14 = 90; i14 >= 15; i14--) {
            arrayList3.clear();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                l lVar2 = ((b) it.next()).f112240a;
                Iterator it2 = arrayList3.iterator();
                do {
                    if (!it2.hasNext()) {
                        arrayList3.add(lVar2);
                        break;
                    }
                } while (v5.c(lVar2.d(), ((l) it2.next()).d()) >= i14);
                if (arrayList3.size() >= i10) {
                    break;
                }
            }
            if (arrayList3.size() >= i10) {
                break;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (arrayList3.isEmpty()) {
            arrayList4.add(Integer.valueOf(i11));
            return arrayList4;
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(Integer.valueOf(((l) it3.next()).k()));
        }
        return arrayList4;
    }
}
