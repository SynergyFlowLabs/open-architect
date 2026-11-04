package org.locationtech.jts.noding;

/* JADX INFO: loaded from: classes14.dex */
public class q implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.geom.a[] f338607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f338608b;

    public q(org.locationtech.jts.geom.a[] aVarArr) {
        this.f338607a = aVarArr;
        this.f338608b = c(aVarArr);
    }

    private static int b(org.locationtech.jts.geom.a[] aVarArr, boolean z10, org.locationtech.jts.geom.a[] aVarArr2, boolean z11) {
        int i10 = z10 ? 1 : -1;
        int i11 = z11 ? 1 : -1;
        int length = z10 ? aVarArr.length : -1;
        int length2 = z11 ? aVarArr2.length : -1;
        int length3 = z10 ? 0 : aVarArr.length - 1;
        int length4 = z11 ? 0 : aVarArr2.length - 1;
        while (true) {
            int iCompareTo = aVarArr[length3].compareTo(aVarArr2[length4]);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            length3 += i10;
            length4 += i11;
            boolean z12 = length3 == length;
            boolean z13 = length4 == length2;
            if (z12 && !z13) {
                return -1;
            }
            if (!z12 && z13) {
                return 1;
            }
            if (z12 && z13) {
                return 0;
            }
        }
    }

    private static boolean c(org.locationtech.jts.geom.a[] aVarArr) {
        return org.locationtech.jts.geom.b.k(aVarArr) == 1;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        q qVar = (q) obj;
        return b(this.f338607a, this.f338608b, qVar.f338607a, qVar.f338608b);
    }
}
