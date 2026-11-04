package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes14.dex */
public final class e implements org.threeten.bp.temporal.i, Comparable<e>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f340013d = 3078945930695997490L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f340014e = 1000000000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f340015f = 1000000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f340018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f340019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f340012c = new e(0, 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final BigInteger f340016g = BigInteger.valueOf(1000000000);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f340017h = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f340020a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.b.values().length];
            f340020a = iArr;
            try {
                iArr[org.threeten.bp.temporal.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f340020a[org.threeten.bp.temporal.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f340020a[org.threeten.bp.temporal.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f340020a[org.threeten.bp.temporal.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private e(long j10, int i10) {
        this.f340018a = j10;
        this.f340019b = i10;
    }

    public static e S(long j10, org.threeten.bp.temporal.m mVar) {
        return f340012c.f0(j10, mVar);
    }

    public static e T(long j10) {
        return o(cn.d.n(j10, 86400), 0);
    }

    public static e U(long j10) {
        return o(cn.d.n(j10, 3600), 0);
    }

    public static e V(long j10) {
        long j11 = j10 / 1000;
        int i10 = (int) (j10 % 1000);
        if (i10 < 0) {
            i10 += 1000;
            j11--;
        }
        return o(j11, i10 * 1000000);
    }

    public static e W(long j10) {
        return o(cn.d.n(j10, 60), 0);
    }

    public static e X(long j10) {
        long j11 = j10 / 1000000000;
        int i10 = (int) (j10 % 1000000000);
        if (i10 < 0) {
            i10 += 1000000000;
            j11--;
        }
        return o(j11, i10);
    }

    public static e Y(long j10) {
        return o(j10, 0);
    }

    public static e Z(long j10, long j11) {
        return o(cn.d.l(j10, cn.d.e(j11, 1000000000L)), cn.d.g(j11, 1000000000));
    }

    public static e a0(CharSequence charSequence) {
        cn.d.j(charSequence, "text");
        Matcher matcher = f340017h.matcher(charSequence);
        if (matcher.matches() && !androidx.exifinterface.media.a.f51379e5.equals(matcher.group(3))) {
            int i10 = 1;
            boolean zEquals = "-".equals(matcher.group(1));
            String strGroup = matcher.group(2);
            String strGroup2 = matcher.group(4);
            String strGroup3 = matcher.group(5);
            String strGroup4 = matcher.group(6);
            String strGroup5 = matcher.group(7);
            if (strGroup != null || strGroup2 != null || strGroup3 != null || strGroup4 != null) {
                long jD0 = d0(charSequence, strGroup, 86400, "days");
                long jD1 = d0(charSequence, strGroup2, 3600, "hours");
                long jD2 = d0(charSequence, strGroup3, 60, "minutes");
                long jD3 = d0(charSequence, strGroup4, 1, "seconds");
                if (strGroup4 != null && strGroup4.charAt(0) == '-') {
                    i10 = -1;
                }
                try {
                    return q(zEquals, jD0, jD1, jD2, jD3, c0(charSequence, strGroup5, i10));
                } catch (ArithmeticException e10) {
                    throw ((org.threeten.bp.format.f) new org.threeten.bp.format.f("Text cannot be parsed to a Duration: overflow", charSequence, 0).initCause(e10));
                }
            }
        }
        throw new org.threeten.bp.format.f("Text cannot be parsed to a Duration", charSequence, 0);
    }

    private static int c0(CharSequence charSequence, String str, int i10) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        try {
            return Integer.parseInt((str + "000000000").substring(0, 9)) * i10;
        } catch (ArithmeticException e10) {
            throw ((org.threeten.bp.format.f) new org.threeten.bp.format.f("Text cannot be parsed to a Duration: fraction", charSequence, 0).initCause(e10));
        } catch (NumberFormatException e11) {
            throw ((org.threeten.bp.format.f) new org.threeten.bp.format.f("Text cannot be parsed to a Duration: fraction", charSequence, 0).initCause(e11));
        }
    }

    private static long d0(CharSequence charSequence, String str, int i10, String str2) {
        if (str == null) {
            return 0L;
        }
        try {
            if (str.startsWith(org.slf4j.h.f339615a3)) {
                str = str.substring(1);
            }
            return cn.d.n(Long.parseLong(str), i10);
        } catch (ArithmeticException e10) {
            throw ((org.threeten.bp.format.f) new org.threeten.bp.format.f("Text cannot be parsed to a Duration: " + str2, charSequence, 0).initCause(e10));
        } catch (NumberFormatException e11) {
            throw ((org.threeten.bp.format.f) new org.threeten.bp.format.f("Text cannot be parsed to a Duration: " + str2, charSequence, 0).initCause(e11));
        }
    }

    private e e0(long j10, long j11) {
        if ((j10 | j11) == 0) {
            return this;
        }
        return Z(cn.d.l(cn.d.l(this.f340018a, j10), j11 / 1000000000), ((long) this.f340019b) + (j11 % 1000000000));
    }

    public static e l(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.e eVar2) {
        org.threeten.bp.temporal.b bVar = org.threeten.bp.temporal.b.SECONDS;
        long jK = eVar.k(eVar2, bVar);
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340329e;
        long j10 = 0;
        if (eVar.q(aVar) && eVar2.q(aVar)) {
            try {
                long jT = eVar.t(aVar);
                long jT2 = eVar2.t(aVar) - jT;
                if (jK > 0 && jT2 < 0) {
                    jT2 += 1000000000;
                } else if (jK < 0 && jT2 > 0) {
                    jT2 -= 1000000000;
                } else if (jK == 0 && jT2 != 0) {
                    try {
                        jK = eVar.k(eVar2.o(aVar, jT), bVar);
                    } catch (ArithmeticException | b unused) {
                    }
                }
                j10 = jT2;
            } catch (ArithmeticException | b unused2) {
            }
        }
        return Z(jK, j10);
    }

    static e n0(DataInput dataInput) throws IOException {
        return Z(dataInput.readLong(), dataInput.readInt());
    }

    private static e o(long j10, int i10) {
        return (((long) i10) | j10) == 0 ? f340012c : new e(j10, i10);
    }

    private static e p(BigDecimal bigDecimal) {
        BigInteger bigIntegerExact = bigDecimal.movePointRight(9).toBigIntegerExact();
        BigInteger[] bigIntegerArrDivideAndRemainder = bigIntegerExact.divideAndRemainder(f340016g);
        if (bigIntegerArrDivideAndRemainder[0].bitLength() <= 63) {
            return Z(bigIntegerArrDivideAndRemainder[0].longValue(), bigIntegerArrDivideAndRemainder[1].intValue());
        }
        throw new ArithmeticException("Exceeds capacity of Duration: " + bigIntegerExact);
    }

    private static e q(boolean z10, long j10, long j11, long j12, long j13, int i10) {
        long jL = cn.d.l(j10, cn.d.l(j11, cn.d.l(j12, j13)));
        return z10 ? Z(jL, i10).R() : Z(jL, i10);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static e s(org.threeten.bp.temporal.i iVar) {
        cn.d.j(iVar, "amount");
        e eVarF0 = f340012c;
        for (org.threeten.bp.temporal.m mVar : iVar.getUnits()) {
            eVarF0 = eVarF0.f0(iVar.d(mVar), mVar);
        }
        return eVarF0;
    }

    private Object writeReplace() {
        return new o((byte) 1, this);
    }

    private BigDecimal y0() {
        return BigDecimal.valueOf(this.f340018a).add(BigDecimal.valueOf(this.f340019b, 9));
    }

    public e A0(int i10) {
        org.threeten.bp.temporal.a.f340329e.k(i10);
        return o(this.f340018a, i10);
    }

    public e B0(long j10) {
        return o(j10, this.f340019b);
    }

    void C0(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.f340018a);
        dataOutput.writeInt(this.f340019b);
    }

    public e D(e eVar) {
        long jV = eVar.v();
        int iT = eVar.t();
        return jV == Long.MIN_VALUE ? e0(Long.MAX_VALUE, -iT).e0(1L, 0L) : e0(-jV, -iT);
    }

    public e E(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = h0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.h0(j11);
    }

    public e H(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = i0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.i0(j11);
    }

    public e I(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = j0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.j0(j11);
    }

    public e L(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = k0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.k0(j11);
    }

    public e M(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = l0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.l0(j11);
    }

    public e N(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = m0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.m0(j11);
    }

    public e O(long j10) {
        if (j10 == 0) {
            return f340012c;
        }
        return j10 == 1 ? this : p(y0().multiply(BigDecimal.valueOf(j10)));
    }

    public e R() {
        return O(-1L);
    }

    @Override // org.threeten.bp.temporal.i
    public org.threeten.bp.temporal.e b(org.threeten.bp.temporal.e eVar) {
        long j10 = this.f340018a;
        if (j10 != 0) {
            eVar = eVar.f(j10, org.threeten.bp.temporal.b.SECONDS);
        }
        int i10 = this.f340019b;
        return i10 != 0 ? eVar.f(i10, org.threeten.bp.temporal.b.NANOS) : eVar;
    }

    @Override // org.threeten.bp.temporal.i
    public org.threeten.bp.temporal.e c(org.threeten.bp.temporal.e eVar) {
        long j10 = this.f340018a;
        if (j10 != 0) {
            eVar = eVar.v(j10, org.threeten.bp.temporal.b.SECONDS);
        }
        int i10 = this.f340019b;
        return i10 != 0 ? eVar.v(i10, org.threeten.bp.temporal.b.NANOS) : eVar;
    }

    @Override // org.threeten.bp.temporal.i
    public long d(org.threeten.bp.temporal.m mVar) {
        if (mVar == org.threeten.bp.temporal.b.SECONDS) {
            return this.f340018a;
        }
        if (mVar == org.threeten.bp.temporal.b.NANOS) {
            return this.f340019b;
        }
        throw new org.threeten.bp.temporal.n("Unsupported unit: " + mVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f340018a == eVar.f340018a && this.f340019b == eVar.f340019b) {
                return true;
            }
        }
        return false;
    }

    public e f0(long j10, org.threeten.bp.temporal.m mVar) {
        cn.d.j(mVar, "unit");
        if (mVar == org.threeten.bp.temporal.b.DAYS) {
            return e0(cn.d.n(j10, 86400), 0L);
        }
        if (mVar.isDurationEstimated()) {
            throw new b("Unit must not have an estimated duration");
        }
        if (j10 == 0) {
            return this;
        }
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            e eVarO = mVar.getDuration().O(j10);
            return m0(eVarO.v()).l0(eVarO.t());
        }
        int i10 = a.f340020a[((org.threeten.bp.temporal.b) mVar).ordinal()];
        if (i10 == 1) {
            return l0(j10);
        }
        if (i10 == 2) {
            return m0((j10 / 1000000000) * 1000).l0((j10 % 1000000000) * 1000);
        }
        if (i10 != 3) {
            return i10 != 4 ? m0(cn.d.o(mVar.getDuration().f340018a, j10)) : m0(j10);
        }
        return j0(j10);
    }

    public e g0(e eVar) {
        return e0(eVar.v(), eVar.t());
    }

    @Override // org.threeten.bp.temporal.i
    public List<org.threeten.bp.temporal.m> getUnits() {
        return Collections.unmodifiableList(Arrays.asList(org.threeten.bp.temporal.b.SECONDS, org.threeten.bp.temporal.b.NANOS));
    }

    public e h0(long j10) {
        return e0(cn.d.n(j10, 86400), 0L);
    }

    public int hashCode() {
        long j10 = this.f340018a;
        return ((int) (j10 ^ (j10 >>> 32))) + (this.f340019b * 51);
    }

    public e i0(long j10) {
        return e0(cn.d.n(j10, 3600), 0L);
    }

    public e j0(long j10) {
        return e0(j10 / 1000, (j10 % 1000) * 1000000);
    }

    public e k() {
        return w() ? R() : this;
    }

    public e k0(long j10) {
        return e0(cn.d.n(j10, 60), 0L);
    }

    public e l0(long j10) {
        return e0(0L, j10);
    }

    public e m0(long j10) {
        return e0(j10, 0L);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        int iB = cn.d.b(this.f340018a, eVar.f340018a);
        return iB != 0 ? iB : this.f340019b - eVar.f340019b;
    }

    public long o0() {
        return this.f340018a / 86400;
    }

    public long p0() {
        return this.f340018a / 86400;
    }

    public long q0() {
        return this.f340018a / 3600;
    }

    public e r(long j10) {
        if (j10 != 0) {
            return j10 == 1 ? this : p(y0().divide(BigDecimal.valueOf(j10), RoundingMode.DOWN));
        }
        throw new ArithmeticException("Cannot divide by zero");
    }

    public int r0() {
        return (int) (q0() % 24);
    }

    public long s0() {
        return cn.d.l(cn.d.n(this.f340018a, 1000), this.f340019b / 1000000);
    }

    public int t() {
        return this.f340019b;
    }

    public int t0() {
        return this.f340019b / 1000000;
    }

    public String toString() {
        if (this == f340012c) {
            return "PT0S";
        }
        long j10 = this.f340018a;
        long j11 = j10 / 3600;
        int i10 = (int) ((j10 % 3600) / 60);
        int i11 = (int) (j10 % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j11 != 0) {
            sb2.append(j11);
            sb2.append('H');
        }
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append(ni.f.f333370g);
        }
        if (i11 == 0 && this.f340019b == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (i11 >= 0 || this.f340019b <= 0) {
            sb2.append(i11);
        } else if (i11 == -1) {
            sb2.append("-0");
        } else {
            sb2.append(i11 + 1);
        }
        if (this.f340019b > 0) {
            int length = sb2.length();
            if (i11 < 0) {
                sb2.append(2000000000 - this.f340019b);
            } else {
                sb2.append(this.f340019b + 1000000000);
            }
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }

    public long u0() {
        return this.f340018a / 60;
    }

    public long v() {
        return this.f340018a;
    }

    public int v0() {
        return (int) (u0() % 60);
    }

    public boolean w() {
        return this.f340018a < 0;
    }

    public long w0() {
        return cn.d.l(cn.d.n(this.f340018a, 1000000000), this.f340019b);
    }

    public boolean x() {
        return (this.f340018a | ((long) this.f340019b)) == 0;
    }

    public int x0() {
        return this.f340019b;
    }

    public e z(long j10, org.threeten.bp.temporal.m mVar) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = f0(Long.MAX_VALUE, mVar);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.f0(j11, mVar);
    }

    public int z0() {
        return (int) (this.f340018a % 60);
    }
}
