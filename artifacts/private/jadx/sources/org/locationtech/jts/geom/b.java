package org.locationtech.jts.geom;

import java.util.Collection;
import java.util.Comparator;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final org.locationtech.jts.geom.a[] f338097a = new org.locationtech.jts.geom.a[0];

    public static class a implements Comparator {
        public int a(Object obj, Object obj2) {
            org.locationtech.jts.geom.a[] aVarArr = (org.locationtech.jts.geom.a[]) obj;
            org.locationtech.jts.geom.a[] aVarArr2 = (org.locationtech.jts.geom.a[]) obj2;
            if (aVarArr.length < aVarArr2.length) {
                return -1;
            }
            if (aVarArr.length > aVarArr2.length) {
                return 1;
            }
            if (aVarArr.length == 0) {
                return 0;
            }
            int iK = b.k(aVarArr);
            int iK2 = b.k(aVarArr2);
            int length = iK > 0 ? 0 : aVarArr.length - 1;
            int length2 = iK2 > 0 ? 0 : aVarArr.length - 1;
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                int iCompareTo = aVarArr[length].compareTo(aVarArr2[length2]);
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                length += iK;
                length2 += iK2;
            }
            return 0;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            org.locationtech.jts.geom.a[] aVarArr = (org.locationtech.jts.geom.a[]) obj;
            org.locationtech.jts.geom.a[] aVarArr2 = (org.locationtech.jts.geom.a[]) obj2;
            if (aVarArr.length < aVarArr2.length) {
                return -1;
            }
            if (aVarArr.length > aVarArr2.length) {
                return 1;
            }
            if (aVarArr.length == 0) {
                return 0;
            }
            int iC = b.c(aVarArr, aVarArr2);
            if (b.n(aVarArr, aVarArr2)) {
                return 0;
            }
            return iC;
        }
    }

    /* JADX INFO: renamed from: org.locationtech.jts.geom.b$b, reason: collision with other inner class name */
    public static class C2424b implements Comparator {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return b.c((org.locationtech.jts.geom.a[]) obj, (org.locationtech.jts.geom.a[]) obj2);
        }
    }

    private b() {
    }

    public static org.locationtech.jts.geom.a[] b(int i10, org.locationtech.jts.geom.a[] aVarArr) {
        return aVarArr.length >= i10 ? aVarArr : new org.locationtech.jts.geom.a[0];
    }

    public static int c(org.locationtech.jts.geom.a[] aVarArr, org.locationtech.jts.geom.a[] aVarArr2) {
        int i10 = 0;
        while (i10 < aVarArr.length && i10 < aVarArr2.length) {
            int iCompareTo = aVarArr[i10].compareTo(aVarArr2[i10]);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            i10++;
        }
        if (i10 < aVarArr2.length) {
            return -1;
        }
        return i10 < aVarArr.length ? 1 : 0;
    }

    public static void d(org.locationtech.jts.geom.a[] aVarArr, int i10, org.locationtech.jts.geom.a[] aVarArr2, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            aVarArr2[i11 + i13] = new org.locationtech.jts.geom.a(aVarArr[i10 + i13]);
        }
    }

    public static org.locationtech.jts.geom.a[] e(org.locationtech.jts.geom.a[] aVarArr) {
        org.locationtech.jts.geom.a[] aVarArr2 = new org.locationtech.jts.geom.a[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            aVarArr2[i10] = new org.locationtech.jts.geom.a(aVarArr[i10]);
        }
        return aVarArr2;
    }

    public static m f(org.locationtech.jts.geom.a[] aVarArr) {
        m mVar = new m();
        for (org.locationtech.jts.geom.a aVar : aVarArr) {
            mVar.x(aVar);
        }
        return mVar;
    }

    public static boolean g(org.locationtech.jts.geom.a[] aVarArr, org.locationtech.jts.geom.a[] aVarArr2) {
        if (aVarArr == aVarArr2) {
            return true;
        }
        if (aVarArr == null || aVarArr2 == null || aVarArr.length != aVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            if (!aVarArr[i10].equals(aVarArr2[i10])) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(org.locationtech.jts.geom.a[] aVarArr, org.locationtech.jts.geom.a[] aVarArr2, Comparator comparator) {
        if (aVarArr == aVarArr2) {
            return true;
        }
        if (aVarArr != null && aVarArr2 != null) {
            if (aVarArr.length != aVarArr2.length) {
                return false;
            }
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                if (comparator.compare(aVarArr[i10], aVarArr2[i10]) != 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static org.locationtech.jts.geom.a[] i(org.locationtech.jts.geom.a[] aVarArr, int i10, int i11) {
        int i12 = 0;
        int i13 = 2 ^ 0;
        int iC = tm.b.c(i10, 0, aVarArr.length);
        int iC2 = tm.b.c(i11, -1, aVarArr.length);
        int i14 = (iC2 - iC) + 1;
        if (iC2 < 0) {
            i14 = 0;
        }
        if (iC >= aVarArr.length) {
            i14 = 0;
        }
        if (iC2 < iC) {
            i14 = 0;
        }
        org.locationtech.jts.geom.a[] aVarArr2 = new org.locationtech.jts.geom.a[i14];
        if (i14 != 0) {
            while (iC <= iC2) {
                aVarArr2[i12] = aVarArr[iC];
                iC++;
                i12++;
            }
        }
        return aVarArr2;
    }

    public static boolean j(org.locationtech.jts.geom.a[] aVarArr) {
        for (int i10 = 1; i10 < aVarArr.length; i10++) {
            if (aVarArr[i10 - 1].equals(aVarArr[i10])) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int k(org.locationtech.jts.geom.a[] aVarArr) {
        for (int i10 = 0; i10 < aVarArr.length / 2; i10++) {
            int iCompareTo = aVarArr[i10].compareTo(aVarArr[(aVarArr.length - 1) - i10]);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 1;
    }

    public static int l(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a[] aVarArr) {
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            if (aVar.equals(aVarArr[i10])) {
                return i10;
            }
        }
        return -1;
    }

    public static org.locationtech.jts.geom.a[] m(org.locationtech.jts.geom.a[] aVarArr, m mVar) {
        d dVar = new d();
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            if (mVar.X(aVarArr[i10])) {
                int i11 = 5 >> 1;
                dVar.i(aVarArr[i10], true);
            }
        }
        return dVar.Uf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean n(org.locationtech.jts.geom.a[] aVarArr, org.locationtech.jts.geom.a[] aVarArr2) {
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            if (aVarArr[i10].compareTo(aVarArr2[(aVarArr.length - i10) - 1]) != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean o(org.locationtech.jts.geom.a[] aVarArr) {
        return aVarArr.length >= 4 && aVarArr[0].p(aVarArr[aVarArr.length - 1]);
    }

    public static org.locationtech.jts.geom.a p(org.locationtech.jts.geom.a[] aVarArr) {
        org.locationtech.jts.geom.a aVar = null;
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            if (aVar == null || aVar.compareTo(aVarArr[i10]) > 0) {
                aVar = aVarArr[i10];
            }
        }
        return aVar;
    }

    public static org.locationtech.jts.geom.a q(org.locationtech.jts.geom.a[] aVarArr, org.locationtech.jts.geom.a[] aVarArr2) {
        for (org.locationtech.jts.geom.a aVar : aVarArr) {
            if (l(aVar, aVarArr2) < 0) {
                return aVar;
            }
        }
        return null;
    }

    public static org.locationtech.jts.geom.a[] r(org.locationtech.jts.geom.a[] aVarArr) {
        int i10 = 0;
        for (org.locationtech.jts.geom.a aVar : aVarArr) {
            if (aVar != null) {
                i10++;
            }
        }
        org.locationtech.jts.geom.a[] aVarArr2 = new org.locationtech.jts.geom.a[i10];
        if (i10 != 0) {
            int i11 = 0;
            for (org.locationtech.jts.geom.a aVar2 : aVarArr) {
                if (aVar2 != null) {
                    aVarArr2[i11] = aVar2;
                    i11++;
                }
            }
        }
        return aVarArr2;
    }

    public static org.locationtech.jts.geom.a[] s(org.locationtech.jts.geom.a[] aVarArr) {
        return !j(aVarArr) ? aVarArr : new d(aVarArr, false).Uf();
    }

    public static void t(org.locationtech.jts.geom.a[] aVarArr) {
        int length = aVarArr.length - 1;
        int i10 = length / 2;
        for (int i11 = 0; i11 <= i10; i11++) {
            org.locationtech.jts.geom.a aVar = aVarArr[i11];
            int i12 = length - i11;
            aVarArr[i11] = aVarArr[i12];
            aVarArr[i12] = aVar;
        }
    }

    public static void u(org.locationtech.jts.geom.a[] aVarArr, org.locationtech.jts.geom.a aVar) {
        int iL = l(aVar, aVarArr);
        if (iL < 0) {
            return;
        }
        org.locationtech.jts.geom.a[] aVarArr2 = new org.locationtech.jts.geom.a[aVarArr.length];
        System.arraycopy(aVarArr, iL, aVarArr2, 0, aVarArr.length - iL);
        System.arraycopy(aVarArr, 0, aVarArr2, aVarArr.length - iL, iL);
        System.arraycopy(aVarArr2, 0, aVarArr, 0, aVarArr.length);
    }

    public static org.locationtech.jts.geom.a[] v(Collection collection) {
        return (org.locationtech.jts.geom.a[]) collection.toArray(f338097a);
    }
}
