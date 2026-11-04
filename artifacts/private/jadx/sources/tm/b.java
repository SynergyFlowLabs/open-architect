package tm;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f381091a = Math.log(10.0d);

    public static double a(double d10, double d11) {
        return (d10 + d11) / 2.0d;
    }

    public static double b(double d10, double d11, double d12) {
        if (d10 < d11) {
            return d11;
        }
        return d10 > d12 ? d12 : d10;
    }

    public static int c(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    public static double d(double d10) {
        double dLog = Math.log(d10);
        return (Double.isInfinite(dLog) || Double.isNaN(dLog)) ? dLog : dLog / f381091a;
    }

    public static double e(double d10, double d11, double d12) {
        if (d11 > d10) {
            d10 = d11;
        }
        return d12 > d10 ? d12 : d10;
    }

    public static double f(double d10, double d11, double d12, double d13) {
        if (d11 > d10) {
            d10 = d11;
        }
        if (d12 <= d10) {
            d12 = d10;
        }
        return d13 > d12 ? d13 : d12;
    }

    public static double g(double d10, double d11, double d12, double d13) {
        if (d11 < d10) {
            d10 = d11;
        }
        if (d12 >= d10) {
            d12 = d10;
        }
        return d13 < d12 ? d13 : d12;
    }

    public static int h(int i10, int i11) {
        return i10 < 0 ? i11 - ((-i10) % i11) : i10 % i11;
    }
}
