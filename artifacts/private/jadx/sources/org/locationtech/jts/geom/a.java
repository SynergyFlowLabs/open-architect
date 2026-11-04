package org.locationtech.jts.geom;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes14.dex */
public class a implements Comparable, Cloneable, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f338087d = 6683108902428366910L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final double f338088e = Double.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f338089f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f338090g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f338091h = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f338092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f338093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f338094c;

    /* JADX INFO: renamed from: org.locationtech.jts.geom.a$a, reason: collision with other inner class name */
    public static class C2423a implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f338095a;

        public C2423a() {
            this(2);
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

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            a aVar = (a) obj;
            a aVar2 = (a) obj2;
            int iA = a(aVar.f338092a, aVar2.f338092a);
            if (iA != 0) {
                return iA;
            }
            int iA2 = a(aVar.f338093b, aVar2.f338093b);
            if (iA2 != 0) {
                return iA2;
            }
            if (this.f338095a <= 2) {
                return 0;
            }
            return a(aVar.f338094c, aVar2.f338094c);
        }

        public C2423a(int i10) {
            this.f338095a = 2;
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException("only 2 or 3 dimensions may be specified");
            }
            this.f338095a = i10;
        }
    }

    public a(double d10, double d11, double d12) {
        this.f338092a = d10;
        this.f338093b = d11;
        this.f338094c = d12;
    }

    public static int t(double d10) {
        long jDoubleToLongBits = Double.doubleToLongBits(d10);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public Object clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException unused) {
            org.locationtech.jts.util.a.f("this shouldn't happen because this class is Cloneable");
            return null;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        a aVar = (a) obj;
        double d10 = this.f338092a;
        double d11 = aVar.f338092a;
        if (d10 < d11) {
            return -1;
        }
        if (d10 > d11) {
            return 1;
        }
        double d12 = this.f338093b;
        double d13 = aVar.f338093b;
        if (d12 < d13) {
            return -1;
        }
        return d12 > d13 ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return p((a) obj);
        }
        return false;
    }

    public int hashCode() {
        return ((629 + t(this.f338092a)) * 37) + t(this.f338093b);
    }

    public a k() {
        return new a(this);
    }

    public double l(a aVar) {
        double d10 = this.f338092a - aVar.f338092a;
        double d11 = this.f338093b - aVar.f338093b;
        return Math.sqrt((d10 * d10) + (d11 * d11));
    }

    public double n(a aVar) {
        double d10 = this.f338092a - aVar.f338092a;
        double d11 = this.f338093b - aVar.f338093b;
        double d12 = this.f338094c - aVar.f338094c;
        return Math.sqrt((d10 * d10) + (d11 * d11) + (d12 * d12));
    }

    public boolean o(a aVar, double d10) {
        return org.locationtech.jts.util.i.a(this.f338094c, aVar.f338094c, d10);
    }

    public boolean p(a aVar) {
        return this.f338092a == aVar.f338092a && this.f338093b == aVar.f338093b;
    }

    public boolean q(a aVar, double d10) {
        if (org.locationtech.jts.util.i.a(this.f338092a, aVar.f338092a, d10) && org.locationtech.jts.util.i.a(this.f338093b, aVar.f338093b, d10)) {
            return true;
        }
        return false;
    }

    public boolean r(a aVar) {
        if (this.f338092a != aVar.f338092a || this.f338093b != aVar.f338093b) {
            return false;
        }
        double d10 = this.f338094c;
        return d10 == aVar.f338094c || (Double.isNaN(d10) && Double.isNaN(aVar.f338094c));
    }

    public double s(int i10) {
        if (i10 == 0) {
            return this.f338092a;
        }
        if (i10 == 1) {
            return this.f338093b;
        }
        if (i10 == 2) {
            return this.f338094c;
        }
        throw new IllegalArgumentException("Invalid ordinate index: " + i10);
    }

    public String toString() {
        return "(" + this.f338092a + ", " + this.f338093b + ", " + this.f338094c + ")";
    }

    public void v(a aVar) {
        this.f338092a = aVar.f338092a;
        this.f338093b = aVar.f338093b;
        this.f338094c = aVar.f338094c;
    }

    public void w(int i10, double d10) {
        if (i10 == 0) {
            this.f338092a = d10;
            return;
        }
        if (i10 == 1) {
            this.f338093b = d10;
        } else {
            if (i10 == 2) {
                this.f338094c = d10;
                return;
            }
            throw new IllegalArgumentException("Invalid ordinate index: " + i10);
        }
    }

    public a() {
        this(0.0d, 0.0d);
    }

    public a(a aVar) {
        this(aVar.f338092a, aVar.f338093b, aVar.f338094c);
    }

    public a(double d10, double d11) {
        this(d10, d11, Double.NaN);
    }
}
