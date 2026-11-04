package tm;

import com.facebook.appevents.p;
import com.google.firebase.crashlytics.internal.common.n0;
import java.io.Serializable;
import org.locationtech.jts.geom.l;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements Serializable, Comparable, Cloneable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final double f381082h = 1.23259516440783E-32d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final double f381083i = 1.34217729E8d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f381084j = 32;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f381087m = "E";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f381088n = "0.0E0";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f381089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f381090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f381077c = new a(3.141592653589793d, 1.2246467991473532E-16d);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f381078d = new a(6.283185307179586d, 2.4492935982947064E-16d);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f381079e = new a(1.5707963267948966d, 6.123233995736766E-17d);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f381080f = new a(2.718281828459045d, 1.4456468917292502E-16d);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f381081g = new a(Double.NaN, Double.NaN);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f381085k = H0(10.0d);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a f381086l = H0(1.0d);

    public a() {
        this.f381089a = 0.0d;
        this.f381090b = 0.0d;
        I(0.0d);
    }

    public static a A0(double d10) {
        return H0(d10).z0();
    }

    private static String B0(char c10, int i10) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < i10; i11++) {
            stringBuffer.append(c10);
        }
        return stringBuffer.toString();
    }

    private String E() {
        if (U()) {
            return n0.f121134h;
        }
        if (O()) {
            return "NaN ";
        }
        return null;
    }

    public static a H0(double d10) {
        return new a(d10);
    }

    private final void I(double d10) {
        this.f381089a = d10;
        this.f381090b = 0.0d;
    }

    public static a I0(String str) throws NumberFormatException {
        return e0(str);
    }

    private final void L(double d10, double d11) {
        this.f381089a = d10;
        this.f381090b = d11;
    }

    private final void M(a aVar) {
        this.f381089a = aVar.f381089a;
        this.f381090b = aVar.f381090b;
    }

    private static int X(double d10) {
        double dAbs = Math.abs(d10);
        int iFloor = (int) Math.floor(Math.log(dAbs) / Math.log(10.0d));
        return Math.pow(10.0d, (double) iFloor) * 10.0d <= dAbs ? iFloor + 1 : iFloor;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031 A[PHI: r2
      0x0031: PHI (r2v3 int) = (r2v2 int), (r2v9 int), (r2v2 int) binds: [B:7:0x0018, B:13:0x002b, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    public static a e0(String str) throws NumberFormatException {
        boolean z10;
        int i10;
        char cCharAt;
        char cCharAt2;
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        while (Character.isWhitespace(str.charAt(i12))) {
            i12++;
        }
        if (i12 >= length || !((cCharAt2 = str.charAt(i12)) == '-' || cCharAt2 == '+')) {
            z10 = false;
        } else {
            i12++;
            if (cCharAt2 == '-') {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        a aVar = new a();
        int i13 = 0;
        loop1: while (true) {
            i10 = i13;
            while (true) {
                if (i12 >= length) {
                    break loop1;
                }
                cCharAt = str.charAt(i12);
                i12++;
                if (Character.isDigit(cCharAt)) {
                    aVar.q0(f381085k);
                    aVar.i0(cCharAt - '0');
                    i13++;
                }
            }
            if (cCharAt != '.') {
                if (cCharAt != 'e' && cCharAt != 'E') {
                    throw new NumberFormatException("Unexpected character '" + cCharAt + "' at position " + i12 + " in string " + str);
                }
                String strSubstring = str.substring(i12);
                try {
                    i11 = Integer.parseInt(strSubstring);
                    break;
                } catch (NumberFormatException unused) {
                    throw new NumberFormatException("Invalid exponent " + strSubstring + " in string " + str);
                }
            }
        }
        int i14 = (i13 - i10) - i11;
        if (i14 != 0) {
            if (i14 > 0) {
                aVar = aVar.s(f381085k.f0(i14));
            } else if (i14 < 0) {
                aVar = aVar.c0(f381085k.f0(-i14));
            }
        }
        return z10 ? aVar.d0() : aVar;
    }

    private final a j0(double d10, double d11) {
        double d12 = this.f381089a;
        double d13 = d12 + d10;
        double d14 = this.f381090b;
        double d15 = d14 + d11;
        double d16 = d13 - d12;
        double d17 = d15 - d14;
        double d18 = (d10 - d16) + (d12 - (d13 - d16));
        double d19 = (d11 - d17) + (d14 - (d15 - d17));
        double d20 = d18 + d15;
        double d21 = d13 + d20;
        double d22 = d19 + d20 + (d13 - d21);
        double d23 = d21 + d22;
        this.f381089a = d23;
        this.f381090b = d22 + (d21 - d23);
        return this;
    }

    private final a m0(double d10, double d11) {
        double d12 = this.f381089a;
        double d13 = d12 / d10;
        double d14 = d13 * f381083i;
        double d15 = f381083i * d10;
        double d16 = d14 - (d14 - d13);
        double d17 = d13 - d16;
        double d18 = d13 * d10;
        double d19 = d15 - (d15 - d10);
        double d20 = d10 - d19;
        double d21 = ((((d12 - d18) - (((((d16 * d19) - d18) + (d16 * d20)) + (d19 * d17)) + (d17 * d20))) + this.f381090b) - (d13 * d11)) / d10;
        double d22 = d13 + d21;
        this.f381089a = d22;
        this.f381090b = (d13 - d22) + d21;
        return this;
    }

    public static a p(a aVar) {
        return new a(aVar);
    }

    private final a p0(double d10, double d11) {
        double d12 = this.f381089a;
        double d13 = d12 * f381083i;
        double d14 = f381083i * d10;
        double d15 = d13 - (d13 - d12);
        double d16 = d12 - d15;
        double d17 = d12 * d10;
        double d18 = d14 - (d14 - d10);
        double d19 = d10 - d18;
        double d20 = ((d15 * d18) - d17) + (d15 * d19) + (d18 * d16) + (d16 * d19) + (d12 * d11) + (this.f381090b * d10);
        double d21 = d17 + d20;
        this.f381089a = d21;
        this.f381090b = d20 + (d17 - d21);
        return this;
    }

    private static a q() {
        return new a(Double.NaN, Double.NaN);
    }

    private String x(boolean z10, int[] iArr) {
        char c10;
        boolean z11;
        a aVarK = k();
        int iX = X(aVarK.f381089a);
        a aVar = f381085k;
        a aVarS = aVarK.s(aVar.f0(iX));
        if (aVarS.H(aVar)) {
            aVarS = aVarS.s(aVar);
            iX++;
        } else if (aVarS.W(f381086l)) {
            aVarS = aVarS.c0(aVar);
            iX--;
        }
        int i10 = iX + 1;
        StringBuffer stringBuffer = new StringBuffer();
        int i11 = 7 ^ 0;
        for (int i12 = 0; i12 <= 31; i12++) {
            if (z10 && i12 == i10) {
                stringBuffer.append('.');
            }
            int i13 = (int) aVarS.f381089a;
            if (i13 < 0) {
                break;
            }
            if (i13 > 9) {
                z11 = true;
                c10 = '9';
            } else {
                c10 = (char) (i13 + 48);
                z11 = false;
            }
            stringBuffer.append(c10);
            a aVarD0 = aVarS.D0(H0(i13));
            a aVar2 = f381085k;
            aVarS = aVarD0.c0(aVar2);
            if (z11) {
                aVarS.k0(aVar2);
            }
            int iX2 = X(aVarS.f381089a);
            if (iX2 < 0 && Math.abs(iX2) >= 31 - i12) {
                break;
            }
        }
        iArr[0] = iX;
        return stringBuffer.toString();
    }

    public static a y0(double d10) {
        return H0(d10).o0(d10);
    }

    public final a C0(double d10) {
        return l(-d10);
    }

    public boolean D(a aVar) {
        double d10 = this.f381089a;
        double d11 = aVar.f381089a;
        if (d10 <= d11) {
            return d10 == d11 && this.f381090b >= aVar.f381090b;
        }
        return true;
    }

    public final a D0(a aVar) {
        return n(aVar.d0());
    }

    public String E0() {
        if (U()) {
            return f381088n;
        }
        String strE = E();
        if (strE != null) {
            return strE;
        }
        int[] iArr = new int[1];
        String strX = x(false, iArr);
        String str = "E" + iArr[0];
        if (strX.charAt(0) == '0') {
            throw new IllegalStateException("Found leading zero: " + strX);
        }
        String str2 = strX.charAt(0) + "." + (strX.length() > 1 ? strX.substring(1) : "");
        if (!S()) {
            return str2 + str;
        }
        return "-" + str2 + str;
    }

    public String F0() {
        String strE = E();
        if (strE != null) {
            return strE;
        }
        int[] iArr = new int[1];
        String strX = x(true, iArr);
        int i10 = iArr[0] + 1;
        if (strX.charAt(0) == '.') {
            strX = p.f99189d0 + strX;
        } else if (i10 < 0) {
            strX = "0." + B0(l.f338160j, -i10) + strX;
        } else if (strX.indexOf(46) == -1) {
            strX = strX + B0(l.f338160j, i10 - strX.length()) + ".0";
        }
        if (!S()) {
            return strX;
        }
        return "-" + strX;
    }

    public a G0() {
        if (O()) {
            return f381081g;
        }
        return T() ? z() : o();
    }

    public boolean H(a aVar) {
        double d10 = this.f381089a;
        double d11 = aVar.f381089a;
        if (d10 <= d11) {
            return d10 == d11 && this.f381090b > aVar.f381090b;
        }
        return true;
    }

    public int N() {
        return (int) this.f381089a;
    }

    public boolean O() {
        return Double.isNaN(this.f381089a);
    }

    public boolean S() {
        double d10 = this.f381089a;
        return d10 < 0.0d || (d10 == 0.0d && this.f381090b < 0.0d);
    }

    public boolean T() {
        double d10 = this.f381089a;
        return d10 > 0.0d || (d10 == 0.0d && this.f381090b > 0.0d);
    }

    public boolean U() {
        return this.f381089a == 0.0d && this.f381090b == 0.0d;
    }

    public boolean V(a aVar) {
        double d10 = this.f381089a;
        double d11 = aVar.f381089a;
        if (d10 >= d11 && (d10 != d11 || this.f381090b > aVar.f381090b)) {
            return false;
        }
        return true;
    }

    public boolean W(a aVar) {
        double d10 = this.f381089a;
        double d11 = aVar.f381089a;
        return d10 < d11 || (d10 == d11 && this.f381090b < aVar.f381090b);
    }

    public a Y(a aVar) {
        return D(aVar) ? this : aVar;
    }

    public a Z(a aVar) {
        return V(aVar) ? this : aVar;
    }

    public final a a0(double d10) {
        return Double.isNaN(d10) ? q() : p(this).p0(d10, 0.0d);
    }

    public final a c0(a aVar) {
        return aVar.O() ? q() : p(this).q0(aVar);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        a aVar = (a) obj;
        double d10 = this.f381089a;
        double d11 = aVar.f381089a;
        if (d10 < d11) {
            return -1;
        }
        if (d10 > d11) {
            return 1;
        }
        double d12 = this.f381090b;
        double d13 = aVar.f381090b;
        if (d12 < d13) {
            return -1;
        }
        return d12 > d13 ? 1 : 0;
    }

    public final a d0() {
        return O() ? this : new a(-this.f381089a, -this.f381090b);
    }

    public a f0(int i10) {
        if (i10 == 0.0d) {
            return H0(1.0d);
        }
        a aVar = new a(this);
        a aVarH0 = H0(1.0d);
        int iAbs = Math.abs(i10);
        if (iAbs > 1) {
            while (iAbs > 0) {
                if (iAbs % 2 == 1) {
                    aVarH0.q0(aVar);
                }
                iAbs /= 2;
                if (iAbs > 0) {
                    aVar = aVar.x0();
                }
            }
            aVar = aVarH0;
        }
        return i10 < 0 ? aVar.g0() : aVar;
    }

    public final a g0() {
        double d10 = this.f381089a;
        double d11 = 1.0d / d10;
        double d12 = d11 * f381083i;
        double d13 = f381083i * d10;
        double d14 = d12 - (d12 - d11);
        double d15 = d11 - d14;
        double d16 = d11 * d10;
        double d17 = d13 - (d13 - d10);
        double d18 = d10 - d17;
        double d19 = (((1.0d - d16) - (((((d14 * d17) - d16) + (d14 * d18)) + (d17 * d15)) + (d15 * d18))) - (this.f381090b * d11)) / d10;
        double d20 = d11 + d19;
        return new a(d20, (d11 - d20) + d19);
    }

    public a h0() {
        return O() ? this : l(0.5d).z();
    }

    public final a i0(double d10) {
        double d11 = this.f381089a;
        double d12 = d11 + d10;
        double d13 = d12 - d11;
        double d14 = (d10 - d13) + (d11 - (d12 - d13)) + this.f381090b;
        double d15 = d12 + d14;
        double d16 = d14 + (d12 - d15);
        double d17 = d15 + d16;
        this.f381089a = d17;
        this.f381090b = d16 + (d15 - d17);
        return this;
    }

    public a k() {
        if (O()) {
            return f381081g;
        }
        return S() ? d0() : new a(this);
    }

    public final a k0(a aVar) {
        return j0(aVar.f381089a, aVar.f381090b);
    }

    public final a l(double d10) {
        return p(this).i0(d10);
    }

    public final a l0(double d10) {
        return m0(d10, 0.0d);
    }

    public final a n(a aVar) {
        return p(this).k0(aVar);
    }

    public final a n0(a aVar) {
        return m0(aVar.f381089a, aVar.f381090b);
    }

    public a o() {
        if (O()) {
            return f381081g;
        }
        double dCeil = Math.ceil(this.f381089a);
        return new a(dCeil, dCeil == this.f381089a ? Math.ceil(this.f381090b) : 0.0d);
    }

    public final a o0(double d10) {
        return p0(d10, 0.0d);
    }

    public final a q0(a aVar) {
        return p0(aVar.f381089a, aVar.f381090b);
    }

    public final a r(double d10) {
        return Double.isNaN(d10) ? q() : p(this).m0(d10, 0.0d);
    }

    public a r0() {
        return q0(this);
    }

    public final a s(a aVar) {
        double d10 = this.f381089a;
        double d11 = aVar.f381089a;
        double d12 = d10 / d11;
        double d13 = d12 * f381083i;
        double d14 = f381083i * d11;
        double d15 = d13 - (d13 - d12);
        double d16 = d12 - d15;
        double d17 = d12 * d11;
        double d18 = d14 - (d14 - d11);
        double d19 = d11 - d18;
        double d20 = ((((d10 - d17) - (((((d15 * d18) - d17) + (d15 * d19)) + (d18 * d16)) + (d16 * d19))) + this.f381090b) - (aVar.f381090b * d12)) / d11;
        double d21 = d12 + d20;
        return new a(d21, (d12 - d21) + d20);
    }

    public final a s0(double d10) {
        return O() ? this : j0(-d10, 0.0d);
    }

    public double t() {
        return this.f381089a + this.f381090b;
    }

    public final a t0(a aVar) {
        return O() ? this : j0(-aVar.f381089a, -aVar.f381090b);
    }

    public String toString() {
        int iX = X(this.f381089a);
        return (iX < -3 || iX > 20) ? E0() : F0();
    }

    public a u0(double d10) {
        I(d10);
        return this;
    }

    public String v() {
        return "DD<" + this.f381089a + ", " + this.f381090b + ">";
    }

    public a v0(a aVar) {
        M(aVar);
        return this;
    }

    public boolean w(a aVar) {
        return this.f381089a == aVar.f381089a && this.f381090b == aVar.f381090b;
    }

    public int w0() {
        double d10 = this.f381089a;
        if (d10 > 0.0d) {
            return 1;
        }
        if (d10 < 0.0d) {
            return -1;
        }
        double d11 = this.f381090b;
        if (d11 > 0.0d) {
            return 1;
        }
        return d11 < 0.0d ? -1 : 0;
    }

    public a x0() {
        return c0(this);
    }

    public a z() {
        if (O()) {
            return f381081g;
        }
        double dFloor = Math.floor(this.f381089a);
        return new a(dFloor, dFloor == this.f381089a ? Math.floor(this.f381090b) : 0.0d);
    }

    public a z0() {
        if (U()) {
            return H0(0.0d);
        }
        if (S()) {
            return f381081g;
        }
        double dSqrt = 1.0d / Math.sqrt(this.f381089a);
        a aVarH0 = H0(this.f381089a * dSqrt);
        return aVarH0.l(D0(aVarH0.x0()).f381089a * dSqrt * 0.5d);
    }

    public a(double d10) {
        this.f381089a = 0.0d;
        this.f381090b = 0.0d;
        I(d10);
    }

    public a(double d10, double d11) {
        this.f381089a = 0.0d;
        this.f381090b = 0.0d;
        L(d10, d11);
    }

    public a(a aVar) {
        this.f381089a = 0.0d;
        this.f381090b = 0.0d;
        M(aVar);
    }

    public a(String str) throws NumberFormatException {
        this(e0(str));
    }
}
