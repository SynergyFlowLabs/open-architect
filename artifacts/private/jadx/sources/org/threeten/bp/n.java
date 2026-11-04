package org.threeten.bp;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes14.dex */
public final class n extends org.threeten.bp.chrono.f implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f340272e = -8290556941213247973L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f340274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f340275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f340276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f340271d = new n(0, 0, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f340273f = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);

    private n(int i10, int i11, int i12) {
        this.f340274a = i10;
        this.f340275b = i11;
        this.f340276c = i12;
    }

    public static n A(int i10) {
        return n(0, 0, i10);
    }

    public static n B(int i10) {
        return n(0, i10, 0);
    }

    public static n C(int i10) {
        return n(0, 0, cn.d.m(i10, 7));
    }

    public static n D(int i10) {
        return n(i10, 0, 0);
    }

    public static n E(CharSequence charSequence) {
        cn.d.j(charSequence, "text");
        Matcher matcher = f340273f.matcher(charSequence);
        if (matcher.matches()) {
            int i10 = 1;
            if ("-".equals(matcher.group(1))) {
                i10 = -1;
                int i11 = 1 ^ (-1);
            }
            String strGroup = matcher.group(2);
            String strGroup2 = matcher.group(3);
            String strGroup3 = matcher.group(4);
            String strGroup4 = matcher.group(5);
            if (strGroup != null || strGroup2 != null || strGroup3 != null || strGroup4 != null) {
                try {
                    return n(F(charSequence, strGroup, i10), F(charSequence, strGroup2, i10), cn.d.k(F(charSequence, strGroup4, i10), cn.d.m(F(charSequence, strGroup3, i10), 7)));
                } catch (NumberFormatException e10) {
                    throw ((org.threeten.bp.format.f) new org.threeten.bp.format.f("Text cannot be parsed to a Period", charSequence, 0).initCause(e10));
                }
            }
        }
        throw new org.threeten.bp.format.f("Text cannot be parsed to a Period", charSequence, 0);
    }

    private static int F(CharSequence charSequence, String str, int i10) {
        if (str == null) {
            return 0;
        }
        try {
            return cn.d.m(Integer.parseInt(str), i10);
        } catch (ArithmeticException e10) {
            throw ((org.threeten.bp.format.f) new org.threeten.bp.format.f("Text cannot be parsed to a Period", charSequence, 0).initCause(e10));
        }
    }

    public static n m(g gVar, g gVar2) {
        return gVar.U(gVar2);
    }

    private static n n(int i10, int i11, int i12) {
        return ((i10 | i11) | i12) == 0 ? f340271d : new n(i10, i11, i12);
    }

    public static n o(org.threeten.bp.temporal.i iVar) {
        if (iVar instanceof n) {
            return (n) iVar;
        }
        if ((iVar instanceof org.threeten.bp.chrono.f) && !org.threeten.bp.chrono.o.f339936e.equals(((org.threeten.bp.chrono.f) iVar).e())) {
            throw new b("Period requires ISO chronology: " + iVar);
        }
        cn.d.j(iVar, "amount");
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        for (org.threeten.bp.temporal.m mVar : iVar.getUnits()) {
            long jD = iVar.d(mVar);
            if (mVar == org.threeten.bp.temporal.b.YEARS) {
                iR = cn.d.r(jD);
            } else if (mVar == org.threeten.bp.temporal.b.MONTHS) {
                iR2 = cn.d.r(jD);
            } else {
                if (mVar != org.threeten.bp.temporal.b.DAYS) {
                    throw new b("Unit must be Years, Months or Days, but was " + mVar);
                }
                iR3 = cn.d.r(jD);
            }
        }
        return n(iR, iR2, iR3);
    }

    private Object readResolve() {
        return ((this.f340274a | this.f340275b) | this.f340276c) == 0 ? f340271d : this;
    }

    public static n z(int i10, int i11, int i12) {
        return n(i10, i11, i12);
    }

    @Override // org.threeten.bp.chrono.f
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public n l(org.threeten.bp.temporal.i iVar) {
        n nVarO = o(iVar);
        return n(cn.d.k(this.f340274a, nVarO.f340274a), cn.d.k(this.f340275b, nVarO.f340275b), cn.d.k(this.f340276c, nVarO.f340276c));
    }

    public n H(long j10) {
        return j10 == 0 ? this : n(this.f340274a, this.f340275b, cn.d.r(cn.d.l(this.f340276c, j10)));
    }

    public n I(long j10) {
        return j10 == 0 ? this : n(this.f340274a, cn.d.r(cn.d.l(this.f340275b, j10)), this.f340276c);
    }

    public n J(long j10) {
        return j10 == 0 ? this : n(cn.d.r(cn.d.l(this.f340274a, j10)), this.f340275b, this.f340276c);
    }

    public long K() {
        return (((long) this.f340274a) * 12) + ((long) this.f340275b);
    }

    public n L(int i10) {
        return i10 == this.f340276c ? this : n(this.f340274a, this.f340275b, i10);
    }

    public n M(int i10) {
        return i10 == this.f340275b ? this : n(this.f340274a, i10, this.f340276c);
    }

    public n N(int i10) {
        return i10 == this.f340274a ? this : n(i10, this.f340275b, this.f340276c);
    }

    @Override // org.threeten.bp.chrono.f, org.threeten.bp.temporal.i
    public org.threeten.bp.temporal.e b(org.threeten.bp.temporal.e eVar) {
        cn.d.j(eVar, "temporal");
        int i10 = this.f340274a;
        if (i10 != 0) {
            eVar = this.f340275b != 0 ? eVar.f(K(), org.threeten.bp.temporal.b.MONTHS) : eVar.f(i10, org.threeten.bp.temporal.b.YEARS);
        } else {
            int i11 = this.f340275b;
            if (i11 != 0) {
                eVar = eVar.f(i11, org.threeten.bp.temporal.b.MONTHS);
            }
        }
        int i12 = this.f340276c;
        return i12 != 0 ? eVar.f(i12, org.threeten.bp.temporal.b.DAYS) : eVar;
    }

    @Override // org.threeten.bp.chrono.f, org.threeten.bp.temporal.i
    public org.threeten.bp.temporal.e c(org.threeten.bp.temporal.e eVar) {
        cn.d.j(eVar, "temporal");
        int i10 = this.f340274a;
        if (i10 != 0) {
            eVar = this.f340275b != 0 ? eVar.v(K(), org.threeten.bp.temporal.b.MONTHS) : eVar.v(i10, org.threeten.bp.temporal.b.YEARS);
        } else {
            int i11 = this.f340275b;
            if (i11 != 0) {
                eVar = eVar.v(i11, org.threeten.bp.temporal.b.MONTHS);
            }
        }
        int i12 = this.f340276c;
        return i12 != 0 ? eVar.v(i12, org.threeten.bp.temporal.b.DAYS) : eVar;
    }

    @Override // org.threeten.bp.chrono.f, org.threeten.bp.temporal.i
    public long d(org.threeten.bp.temporal.m mVar) {
        int i10;
        if (mVar == org.threeten.bp.temporal.b.YEARS) {
            i10 = this.f340274a;
        } else if (mVar == org.threeten.bp.temporal.b.MONTHS) {
            i10 = this.f340275b;
        } else {
            if (mVar != org.threeten.bp.temporal.b.DAYS) {
                throw new org.threeten.bp.temporal.n("Unsupported unit: " + mVar);
            }
            i10 = this.f340276c;
        }
        return i10;
    }

    @Override // org.threeten.bp.chrono.f
    public org.threeten.bp.chrono.j e() {
        return org.threeten.bp.chrono.o.f339936e;
    }

    @Override // org.threeten.bp.chrono.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f340274a == nVar.f340274a && this.f340275b == nVar.f340275b && this.f340276c == nVar.f340276c) {
                return true;
            }
        }
        return false;
    }

    @Override // org.threeten.bp.chrono.f
    public boolean f() {
        return this.f340274a < 0 || this.f340275b < 0 || this.f340276c < 0;
    }

    @Override // org.threeten.bp.chrono.f
    public boolean g() {
        return this == f340271d;
    }

    @Override // org.threeten.bp.chrono.f, org.threeten.bp.temporal.i
    public List<org.threeten.bp.temporal.m> getUnits() {
        return Collections.unmodifiableList(Arrays.asList(org.threeten.bp.temporal.b.YEARS, org.threeten.bp.temporal.b.MONTHS, org.threeten.bp.temporal.b.DAYS));
    }

    @Override // org.threeten.bp.chrono.f
    public int hashCode() {
        return this.f340274a + Integer.rotateLeft(this.f340275b, 8) + Integer.rotateLeft(this.f340276c, 16);
    }

    public int p() {
        return this.f340276c;
    }

    public int q() {
        return this.f340275b;
    }

    public int r() {
        return this.f340274a;
    }

    @Override // org.threeten.bp.chrono.f
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public n h(org.threeten.bp.temporal.i iVar) {
        n nVarO = o(iVar);
        return n(cn.d.p(this.f340274a, nVarO.f340274a), cn.d.p(this.f340275b, nVarO.f340275b), cn.d.p(this.f340276c, nVarO.f340276c));
    }

    public n t(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = H(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.H(j11);
    }

    @Override // org.threeten.bp.chrono.f
    public String toString() {
        if (this == f340271d) {
            return "P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('P');
        int i10 = this.f340274a;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append(ni.f.f333371h);
        }
        int i11 = this.f340275b;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append(ni.f.f333370g);
        }
        int i12 = this.f340276c;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('D');
        }
        return sb2.toString();
    }

    public n u(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = I(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.I(j11);
    }

    public n v(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = J(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.J(j11);
    }

    @Override // org.threeten.bp.chrono.f
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public n i(int i10) {
        return (this == f340271d || i10 == 1) ? this : n(cn.d.m(this.f340274a, i10), cn.d.m(this.f340275b, i10), cn.d.m(this.f340276c, i10));
    }

    @Override // org.threeten.bp.chrono.f
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public n j() {
        return i(-1);
    }

    @Override // org.threeten.bp.chrono.f
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public n k() {
        long jK = K();
        long j10 = jK / 12;
        int i10 = (int) (jK % 12);
        return (j10 == ((long) this.f340274a) && i10 == this.f340275b) ? this : n(cn.d.r(j10), i10, this.f340276c);
    }
}
