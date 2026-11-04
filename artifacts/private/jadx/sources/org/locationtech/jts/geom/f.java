package org.locationtech.jts.geom;

import java.util.Comparator;

/* JADX INFO: loaded from: classes14.dex */
public class f implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f338115a;

    public f() {
        this.f338115a = Integer.MAX_VALUE;
    }

    public static int a(double d10, double d11) {
        if (d10 < d11) {
            return -1;
        }
        if (d10 > d11) {
            return 1;
        }
        if (Double.isNaN(d10)) {
            return Double.isNaN(d11) ? 0 : -1;
        }
        return Double.isNaN(d11) ? 1 : 0;
    }

    protected int b(e eVar, e eVar2, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            int iA = a(eVar.ij(i10, i12), eVar2.ij(i10, i12));
            if (iA != 0) {
                return iA;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        boolean z10;
        e eVar = (e) obj;
        e eVar2 = (e) obj2;
        int size = eVar.size();
        int size2 = eVar2.size();
        int iRg = eVar.Rg();
        int iRg2 = eVar2.Rg();
        int i10 = iRg2 < iRg ? iRg2 : iRg;
        int i11 = this.f338115a;
        if (i11 <= i10) {
            i10 = i11;
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (iRg < iRg2) {
                return -1;
            }
            if (iRg > iRg2) {
                return 1;
            }
        }
        int i12 = 0;
        while (i12 < size && i12 < size2) {
            int iB = b(eVar, eVar2, i12, i10);
            if (iB != 0) {
                return iB;
            }
            i12++;
        }
        if (i12 < size) {
            return 1;
        }
        return i12 < size2 ? -1 : 0;
    }

    public f(int i10) {
        this.f338115a = i10;
    }
}
