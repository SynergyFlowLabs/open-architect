package org.locationtech.jts.geomgraph;

/* JADX INFO: loaded from: classes14.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f338375a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f338376b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f338377c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f338378d = 3;

    public static int a(int i10, int i11) {
        if (i10 == i11) {
            return i10;
        }
        if (((i10 - i11) + 4) % 4 == 2) {
            return -1;
        }
        int i12 = i10 < i11 ? i10 : i11;
        if (i10 <= i11) {
            i10 = i11;
        }
        if (i12 == 0 && i10 == 3) {
            return 3;
        }
        return i12;
    }

    public static boolean b(int i10, int i11) {
        if (i11 != 3) {
            return i10 == i11 || i10 == i11 + 1;
        }
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    public static boolean c(int i10) {
        if (i10 != 0 && i10 != 1) {
            return false;
        }
        return true;
    }

    public static boolean d(int i10, int i11) {
        return i10 != i11 && ((i10 - i11) + 4) % 4 == 2;
    }

    public static int e(double d10, double d11) {
        if (d10 != 0.0d || d11 != 0.0d) {
            if (d10 >= 0.0d) {
                return d11 >= 0.0d ? 0 : 3;
            }
            return d11 >= 0.0d ? 1 : 2;
        }
        throw new IllegalArgumentException("Cannot compute the quadrant for point ( " + d10 + ", " + d11 + " )");
    }

    public static int f(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        double d10 = aVar2.f338092a;
        double d11 = aVar.f338092a;
        if (d10 != d11 || aVar2.f338093b != aVar.f338093b) {
            if (d10 >= d11) {
                return aVar2.f338093b >= aVar.f338093b ? 0 : 3;
            }
            return aVar2.f338093b >= aVar.f338093b ? 1 : 2;
        }
        throw new IllegalArgumentException("Cannot compute the quadrant for two identical points " + aVar);
    }
}
