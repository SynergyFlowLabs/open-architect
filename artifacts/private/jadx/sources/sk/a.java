package sk;

import androidx.collection.g3;
import com.facebook.appevents.p;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModelKt;
import java.math.BigInteger;
import org.apache.commons.lang3.c0;

/* JADX INFO: loaded from: classes14.dex */
public final class a extends Number implements Comparable<a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f376031f = 65382027393090L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f376032g = new a(0, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f376033h = new a(1, 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f376034i = new a(1, 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f376035j = new a(1, 3);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f376036k = new a(2, 3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f376037l = new a(1, 4);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f376038m = new a(2, 4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f376039n = new a(3, 4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f376040o = new a(1, 5);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f376041s = new a(2, 5);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f376042t = new a(3, 5);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f376043v = new a(4, 5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f376044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f376045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient int f376046c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient String f376047d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient String f376048e = null;

    private a(int i10, int i11) {
        this.f376044a = i10;
        this.f376045b = i11;
    }

    public static a E(int i10, int i11) {
        if (i11 == 0) {
            throw new ArithmeticException("The denominator must not be zero");
        }
        if (i10 == 0) {
            return f376032g;
        }
        if (i11 == Integer.MIN_VALUE && (i10 & 1) == 0) {
            i10 /= 2;
            i11 /= 2;
        }
        if (i11 < 0) {
            if (i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE) {
                throw new ArithmeticException("overflow: can't negate");
            }
            i10 = -i10;
            i11 = -i11;
        }
        int iH = H(i10, i11);
        return new a(i10 / iH, i11 / iH);
    }

    private static int H(int i10, int i11) {
        int i12;
        if (i10 == 0 || i11 == 0) {
            if (i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE) {
                throw new ArithmeticException("overflow: gcd is 2^31");
            }
            return Math.abs(i10) + Math.abs(i11);
        }
        if (Math.abs(i10) != 1 && Math.abs(i11) != 1) {
            if (i10 > 0) {
                i10 = -i10;
            }
            if (i11 > 0) {
                i11 = -i11;
            }
            int i13 = 0;
            while (true) {
                i12 = i10 & 1;
                if (i12 != 0 || (i11 & 1) != 0 || i13 >= 31) {
                    break;
                }
                i10 /= 2;
                i11 /= 2;
                i13++;
            }
            if (i13 == 31) {
                throw new ArithmeticException("overflow: gcd is 2^31");
            }
            int i14 = i12 == 1 ? i11 : -(i10 / 2);
            while (true) {
                if ((i14 & 1) == 0) {
                    i14 /= 2;
                } else {
                    if (i14 > 0) {
                        i10 = -i14;
                    } else {
                        i11 = i14;
                    }
                    i14 = (i11 - i10) / 2;
                    if (i14 == 0) {
                        return (-i10) * (1 << i13);
                    }
                }
            }
        }
        return 1;
    }

    private static int L(int i10, int i11) {
        long j10 = ((long) i10) * ((long) i11);
        if (j10 < g3.f12261h || j10 > g3.f12256c) {
            throw new ArithmeticException("overflow: mul");
        }
        return (int) j10;
    }

    private static int M(int i10, int i11) {
        long j10 = ((long) i10) * ((long) i11);
        if (j10 <= g3.f12256c) {
            return (int) j10;
        }
        throw new ArithmeticException("overflow: mulPos");
    }

    private static int T(int i10, int i11) {
        long j10 = ((long) i10) - ((long) i11);
        if (j10 < g3.f12261h || j10 > g3.f12256c) {
            throw new ArithmeticException("overflow: add");
        }
        return (int) j10;
    }

    private static int n(int i10, int i11) {
        long j10 = ((long) i10) + ((long) i11);
        if (j10 < g3.f12261h || j10 > g3.f12256c) {
            throw new ArithmeticException("overflow: add");
        }
        return (int) j10;
    }

    private a o(a aVar, boolean z10) {
        c0.v(aVar != null, "The fraction must not be null", new Object[0]);
        if (this.f376044a == 0) {
            return z10 ? aVar : aVar.O();
        }
        if (aVar.f376044a == 0) {
            return this;
        }
        int iH = H(this.f376045b, aVar.f376045b);
        if (iH == 1) {
            int iL = L(this.f376044a, aVar.f376045b);
            int iL2 = L(aVar.f376044a, this.f376045b);
            return new a(z10 ? n(iL, iL2) : T(iL, iL2), M(this.f376045b, aVar.f376045b));
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(this.f376044a).multiply(BigInteger.valueOf(aVar.f376045b / iH));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(aVar.f376044a).multiply(BigInteger.valueOf(this.f376045b / iH));
        BigInteger bigIntegerAdd = z10 ? bigIntegerMultiply.add(bigIntegerMultiply2) : bigIntegerMultiply.subtract(bigIntegerMultiply2);
        int iIntValue = bigIntegerAdd.mod(BigInteger.valueOf(iH)).intValue();
        int iH2 = iIntValue == 0 ? iH : H(iIntValue, iH);
        BigInteger bigIntegerDivide = bigIntegerAdd.divide(BigInteger.valueOf(iH2));
        if (bigIntegerDivide.bitLength() <= 31) {
            return new a(bigIntegerDivide.intValue(), M(this.f376045b / iH, aVar.f376045b / iH2));
        }
        throw new ArithmeticException("overflow: numerator too large after multiply");
    }

    public static a s(double d10) {
        int i10;
        int i11;
        int i12 = d10 < 0.0d ? -1 : 1;
        double dAbs = Math.abs(d10);
        if (dAbs > 2.147483647E9d || Double.isNaN(dAbs)) {
            throw new ArithmeticException("The value must not be greater than Integer.MAX_VALUE or NaN");
        }
        int i13 = (int) dAbs;
        double d11 = dAbs - ((double) i13);
        int i14 = (int) d11;
        double d12 = d11 - ((double) i14);
        double d13 = Double.MAX_VALUE;
        int i15 = 1;
        int i16 = 1;
        double d14 = 1.0d;
        int i17 = 0;
        int i18 = 0;
        int i19 = 1;
        while (true) {
            int i20 = (int) (d14 / d12);
            double d15 = d14 - (((double) i20) * d12);
            int i21 = (i14 * i19) + i17;
            int i22 = (i14 * i18) + i15;
            i10 = i12;
            double dAbs2 = Math.abs(d11 - (((double) i21) / ((double) i22)));
            i11 = i16 + 1;
            if (d13 <= dAbs2 || i22 > 10000 || i22 <= 0 || i11 >= 25) {
                break;
            }
            d13 = dAbs2;
            i12 = i10;
            i16 = i11;
            i17 = i19;
            i15 = i18;
            i19 = i21;
            i18 = i22;
            i14 = i20;
            d14 = d12;
            d12 = d15;
        }
        if (i11 != 25) {
            return E((i19 + (i13 * i18)) * i10, i18);
        }
        throw new ArithmeticException("Unable to convert double to fraction");
    }

    public static a t(int i10, int i11) {
        if (i11 == 0) {
            throw new ArithmeticException("The denominator must not be zero");
        }
        if (i11 < 0) {
            if (i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE) {
                throw new ArithmeticException("overflow: can't negate");
            }
            i10 = -i10;
            i11 = -i11;
        }
        return new a(i10, i11);
    }

    public static a v(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new ArithmeticException("The denominator must not be zero");
        }
        if (i12 < 0) {
            throw new ArithmeticException("The denominator must not be negative");
        }
        if (i11 < 0) {
            throw new ArithmeticException("The numerator must not be negative");
        }
        long j10 = i10 < 0 ? (((long) i10) * ((long) i12)) - ((long) i11) : (((long) i10) * ((long) i12)) + ((long) i11);
        if (j10 < g3.f12261h || j10 > g3.f12256c) {
            throw new ArithmeticException("Numerator too large to represent as an Integer.");
        }
        return new a((int) j10, i12);
    }

    public static a w(String str) {
        c0.v(str != null, "The string must not be null", new Object[0]);
        if (str.indexOf(46) >= 0) {
            return s(Double.parseDouble(str));
        }
        int iIndexOf = str.indexOf(32);
        if (iIndexOf <= 0) {
            int iIndexOf2 = str.indexOf(47);
            return iIndexOf2 < 0 ? t(Integer.parseInt(str), 1) : t(Integer.parseInt(str.substring(0, iIndexOf2)), Integer.parseInt(str.substring(iIndexOf2 + 1)));
        }
        int i10 = Integer.parseInt(str.substring(0, iIndexOf));
        String strSubstring = str.substring(iIndexOf + 1);
        int iIndexOf3 = strSubstring.indexOf(47);
        if (iIndexOf3 >= 0) {
            return v(i10, Integer.parseInt(strSubstring.substring(0, iIndexOf3)), Integer.parseInt(strSubstring.substring(iIndexOf3 + 1)));
        }
        throw new NumberFormatException("The fraction could not be parsed as the format X Y/Z");
    }

    public int D() {
        return this.f376044a / this.f376045b;
    }

    public a I() {
        int i10 = this.f376044a;
        if (i10 == 0) {
            throw new ArithmeticException("Unable to invert zero.");
        }
        if (i10 != Integer.MIN_VALUE) {
            return i10 < 0 ? new a(-this.f376045b, -i10) : new a(this.f376045b, i10);
        }
        throw new ArithmeticException("overflow: can't negate numerator");
    }

    public a N(a aVar) {
        c0.v(aVar != null, "The fraction must not be null", new Object[0]);
        int i10 = this.f376044a;
        if (i10 != 0 && aVar.f376044a != 0) {
            int iH = H(i10, aVar.f376045b);
            int iH2 = H(aVar.f376044a, this.f376045b);
            return E(L(this.f376044a / iH, aVar.f376044a / iH2), M(this.f376045b / iH2, aVar.f376045b / iH));
        }
        return f376032g;
    }

    public a O() {
        int i10 = this.f376044a;
        if (i10 != Integer.MIN_VALUE) {
            return new a(-i10, this.f376045b);
        }
        throw new ArithmeticException("overflow: too large to negate");
    }

    public a R(int i10) {
        if (i10 == 1) {
            return this;
        }
        if (i10 == 0) {
            return f376033h;
        }
        if (i10 < 0) {
            return i10 == Integer.MIN_VALUE ? I().R(2).R(-(i10 / 2)) : I().R(-i10);
        }
        a aVarN = N(this);
        return i10 % 2 == 0 ? aVarN.R(i10 / 2) : aVarN.R(i10 / 2).N(this);
    }

    public a S() {
        int i10 = this.f376044a;
        if (i10 == 0) {
            a aVar = f376032g;
            if (!equals(aVar)) {
                return aVar;
            }
        } else {
            int iH = H(Math.abs(i10), this.f376045b);
            if (iH != 1) {
                return t(this.f376044a / iH, this.f376045b / iH);
            }
        }
        return this;
    }

    public a U(a aVar) {
        return o(aVar, false);
    }

    public String V() {
        if (this.f376048e == null) {
            int i10 = this.f376044a;
            if (i10 == 0) {
                this.f376048e = p.f99189d0;
            } else {
                int i11 = this.f376045b;
                if (i10 == i11) {
                    this.f376048e = "1";
                } else if (i10 == i11 * (-1)) {
                    this.f376048e = CreateTicketViewModelKt.EmailId;
                } else {
                    if (i10 > 0) {
                        i10 = -i10;
                    }
                    if (i10 < (-i11)) {
                        int iZ = z();
                        if (iZ == 0) {
                            this.f376048e = Integer.toString(D());
                        } else {
                            this.f376048e = D() + " " + iZ + "/" + r();
                        }
                    } else {
                        this.f376048e = x() + "/" + r();
                    }
                }
            }
        }
        return this.f376048e;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return ((double) this.f376044a) / ((double) this.f376045b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x() == aVar.x() && r() == aVar.r();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.f376044a / this.f376045b;
    }

    public int hashCode() {
        if (this.f376046c == 0) {
            this.f376046c = ((x() + 629) * 37) + r();
        }
        return this.f376046c;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.f376044a / this.f376045b;
    }

    public a k() {
        return this.f376044a >= 0 ? this : O();
    }

    public a l(a aVar) {
        return o(aVar, true);
    }

    @Override // java.lang.Number
    public long longValue() {
        return ((long) this.f376044a) / ((long) this.f376045b);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        if (this == aVar) {
            return 0;
        }
        int i10 = this.f376044a;
        int i11 = aVar.f376044a;
        if (i10 == i11 && this.f376045b == aVar.f376045b) {
            return 0;
        }
        long j10 = ((long) i10) * ((long) aVar.f376045b);
        long j11 = ((long) i11) * ((long) this.f376045b);
        if (j10 == j11) {
            return 0;
        }
        return j10 < j11 ? -1 : 1;
    }

    public a q(a aVar) {
        c0.v(aVar != null, "The fraction must not be null", new Object[0]);
        if (aVar.f376044a != 0) {
            return N(aVar.I());
        }
        throw new ArithmeticException("The fraction to divide by must not be zero");
    }

    public int r() {
        return this.f376045b;
    }

    public String toString() {
        if (this.f376047d == null) {
            this.f376047d = x() + "/" + r();
        }
        return this.f376047d;
    }

    public int x() {
        return this.f376044a;
    }

    public int z() {
        return Math.abs(this.f376044a % this.f376045b);
    }
}
