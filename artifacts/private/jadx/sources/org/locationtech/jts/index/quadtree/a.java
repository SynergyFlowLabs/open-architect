package org.locationtech.jts.index.quadtree;

import com.rabbitmq.client.r;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f338424c = 1023;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f338425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f338426b;

    public a(double d10) {
        this.f338425a = d10;
        this.f338426b = Double.doubleToLongBits(d10);
    }

    public static int b(double d10) {
        return new a(d10).e();
    }

    public static double f(double d10, double d11) {
        if (d10 == 0.0d || d11 == 0.0d) {
            return 0.0d;
        }
        a aVar = new a(d10);
        a aVar2 = new a(d11);
        if (aVar.e() != aVar2.e()) {
            return 0.0d;
        }
        aVar.k(64 - (aVar.g(aVar2) + 12));
        return aVar.d();
    }

    public static double h(int i10) {
        if (i10 > 1023 || i10 < -1022) {
            throw new IllegalArgumentException("Exponent out of bounds");
        }
        return Double.longBitsToDouble(((long) (i10 + 1023)) << 52);
    }

    public static String i(double d10) {
        return new a(d10).toString();
    }

    public static double j(double d10) {
        a aVar = new a(d10);
        aVar.k(52);
        return aVar.d();
    }

    public int a() {
        return ((int) (this.f338426b >> 52)) & r.f265987x3;
    }

    public int c(int i10) {
        return (this.f338426b & (1 << i10)) != 0 ? 1 : 0;
    }

    public double d() {
        return Double.longBitsToDouble(this.f338426b);
    }

    public int e() {
        return a() - 1023;
    }

    public int g(a aVar) {
        for (int i10 = 0; i10 < 52; i10++) {
            if (c(i10) != aVar.c(i10)) {
                return i10;
            }
        }
        return 52;
    }

    public void k(int i10) {
        this.f338426b = (~((1 << i10) - 1)) & this.f338426b;
    }

    public String toString() {
        String str = "0000000000000000000000000000000000000000000000000000000000000000" + Long.toBinaryString(this.f338426b);
        String strSubstring = str.substring(str.length() - 64);
        return strSubstring.substring(0, 1) + "  " + strSubstring.substring(1, 12) + "(" + e() + ") " + strSubstring.substring(12) + " [ " + this.f338425a + " ]";
    }
}
