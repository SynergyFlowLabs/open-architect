package org.locationtech.jts.noding;

/* JADX INFO: loaded from: classes14.dex */
public class w {
    public static int a(int i10, org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        if (aVar.p(aVar2)) {
            return 0;
        }
        int iC = c(aVar.f338092a, aVar2.f338092a);
        int iC2 = c(aVar.f338093b, aVar2.f338093b);
        switch (i10) {
            case 0:
                return b(iC, iC2);
            case 1:
                return b(iC2, iC);
            case 2:
                return b(iC2, -iC);
            case 3:
                return b(-iC, iC2);
            case 4:
                return b(-iC, -iC2);
            case 5:
                return b(-iC2, -iC);
            case 6:
                return b(-iC2, iC);
            case 7:
                return b(iC, -iC2);
            default:
                org.locationtech.jts.util.a.f("invalid octant value");
                return 0;
        }
    }

    private static int b(int i10, int i11) {
        if (i10 < 0) {
            return -1;
        }
        if (i10 > 0) {
            return 1;
        }
        if (i11 < 0) {
            return -1;
        }
        return i11 > 0 ? 1 : 0;
    }

    public static int c(double d10, double d11) {
        if (d10 < d11) {
            return -1;
        }
        return d10 > d11 ? 1 : 0;
    }
}
