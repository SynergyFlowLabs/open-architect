package org.locationtech.jts.noding;

/* JADX INFO: loaded from: classes14.dex */
public class p {
    private p() {
    }

    public static int a(double d10, double d11) {
        if (d10 == 0.0d && d11 == 0.0d) {
            throw new IllegalArgumentException("Cannot compute the octant for point ( " + d10 + ", " + d11 + " )");
        }
        double dAbs = Math.abs(d10);
        double dAbs2 = Math.abs(d11);
        if (d10 >= 0.0d) {
            if (d11 >= 0.0d) {
                return dAbs >= dAbs2 ? 0 : 1;
            }
            return dAbs >= dAbs2 ? 7 : 6;
        }
        if (d11 >= 0.0d) {
            return dAbs >= dAbs2 ? 3 : 2;
        }
        return dAbs >= dAbs2 ? 4 : 5;
    }

    public static int b(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        double d10 = aVar2.f338092a - aVar.f338092a;
        double d11 = aVar2.f338093b - aVar.f338093b;
        if (d10 != 0.0d || d11 != 0.0d) {
            return a(d10, d11);
        }
        throw new IllegalArgumentException("Cannot compute the octant for two identical points " + aVar);
    }
}
