package org.locationtech.jts.precision;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f338968a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f338969b = 53;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f338970c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f338971d;

    public static int b(long j10, int i10) {
        return (j10 & (1 << i10)) != 0 ? 1 : 0;
    }

    public static int d(long j10, long j11) {
        int i10 = 0;
        for (int i11 = 52; i11 >= 0; i11--) {
            if (b(j10, i11) != b(j11, i11)) {
                return i10;
            }
            i10++;
        }
        return 52;
    }

    public static long e(long j10) {
        return j10 >> 52;
    }

    public static long g(long j10, int i10) {
        return j10 & (~((1 << i10) - 1));
    }

    public void a(double d10) {
        long jDoubleToLongBits = Double.doubleToLongBits(d10);
        if (this.f338968a) {
            this.f338970c = jDoubleToLongBits;
            this.f338971d = e(jDoubleToLongBits);
            this.f338968a = false;
        } else {
            if (e(jDoubleToLongBits) != this.f338971d) {
                this.f338970c = 0L;
                return;
            }
            int iD = d(this.f338970c, jDoubleToLongBits);
            this.f338969b = iD;
            this.f338970c = g(this.f338970c, 64 - (iD + 12));
        }
    }

    public double c() {
        return Double.longBitsToDouble(this.f338970c);
    }

    public String f(long j10) {
        double dLongBitsToDouble = Double.longBitsToDouble(j10);
        String str = "0000000000000000000000000000000000000000000000000000000000000000" + Long.toBinaryString(j10);
        String strSubstring = str.substring(str.length() - 64);
        return strSubstring.substring(0, 1) + "  " + strSubstring.substring(1, 12) + "(exp) " + strSubstring.substring(12) + " [ " + dLongBitsToDouble + " ]";
    }
}
