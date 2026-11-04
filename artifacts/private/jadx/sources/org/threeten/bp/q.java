package org.threeten.bp;

import com.planner5d.library.widget.preloader.shimmer.ShimmerTextView;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class q extends cn.c implements org.threeten.bp.temporal.e, org.threeten.bp.temporal.g, Comparable<q>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f340302d = 4183400860270640070L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f340304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f340305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<q> f340301c = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final org.threeten.bp.format.c f340303e = new org.threeten.bp.format.d().v(org.threeten.bp.temporal.a.f340340k3, 4, 10, org.threeten.bp.format.l.EXCEEDS_PAD).h(org.apache.commons.codec.language.l.f335457d).u(org.threeten.bp.temporal.a.f340334h3, 2).P();

    class a implements org.threeten.bp.temporal.l<q> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q a(org.threeten.bp.temporal.f fVar) {
            return q.E(fVar);
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f340306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f340307b;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.b.values().length];
            f340307b = iArr;
            try {
                iArr[org.threeten.bp.temporal.b.MONTHS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f340307b[org.threeten.bp.temporal.b.YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f340307b[org.threeten.bp.temporal.b.DECADES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f340307b[org.threeten.bp.temporal.b.CENTURIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f340307b[org.threeten.bp.temporal.b.MILLENNIA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f340307b[org.threeten.bp.temporal.b.ERAS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[org.threeten.bp.temporal.a.values().length];
            f340306a = iArr2;
            try {
                iArr2[org.threeten.bp.temporal.a.f340334h3.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f340306a[org.threeten.bp.temporal.a.f340336i3.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f340306a[org.threeten.bp.temporal.a.f340338j3.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f340306a[org.threeten.bp.temporal.a.f340340k3.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f340306a[org.threeten.bp.temporal.a.f340342l3.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private q(int i10, int i11) {
        this.f340304a = i10;
        this.f340305b = i11;
    }

    public static q E(org.threeten.bp.temporal.f fVar) {
        if (fVar instanceof q) {
            return (q) fVar;
        }
        try {
            if (!org.threeten.bp.chrono.o.f339936e.equals(org.threeten.bp.chrono.j.v(fVar))) {
                fVar = g.i0(fVar);
            }
            return a0(fVar.l(org.threeten.bp.temporal.a.f340340k3), fVar.l(org.threeten.bp.temporal.a.f340334h3));
        } catch (org.threeten.bp.b unused) {
            throw new org.threeten.bp.b("Unable to obtain YearMonth from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName());
        }
    }

    private long L() {
        return (((long) this.f340304a) * 12) + ((long) (this.f340305b - 1));
    }

    public static q X() {
        return Y(org.threeten.bp.a.g());
    }

    public static q Y(org.threeten.bp.a aVar) {
        g gVarA0 = g.A0(aVar);
        return c0(gVarA0.r0(), gVarA0.o0());
    }

    public static q Z(r rVar) {
        return Y(org.threeten.bp.a.f(rVar));
    }

    public static q a0(int i10, int i11) {
        org.threeten.bp.temporal.a.f340340k3.l(i10);
        org.threeten.bp.temporal.a.f340334h3.l(i11);
        return new q(i10, i11);
    }

    public static q c0(int i10, j jVar) {
        cn.d.j(jVar, "month");
        return a0(i10, jVar.getValue());
    }

    public static q d0(CharSequence charSequence) {
        return e0(charSequence, f340303e);
    }

    public static q e0(CharSequence charSequence, org.threeten.bp.format.c cVar) {
        cn.d.j(cVar, "formatter");
        return (q) cVar.r(charSequence, f340301c);
    }

    static q j0(DataInput dataInput) throws IOException {
        return a0(dataInput.readInt(), dataInput.readByte());
    }

    private q k0(int i10, int i11) {
        return (this.f340304a == i10 && this.f340305b == i11) ? this : new q(i10, i11);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 68, this);
    }

    public String D(org.threeten.bp.format.c cVar) {
        cn.d.j(cVar, "formatter");
        return cVar.d(this);
    }

    public j H() {
        return j.L(this.f340305b);
    }

    public int I() {
        return this.f340305b;
    }

    public int M() {
        return this.f340304a;
    }

    public boolean N(q qVar) {
        return compareTo(qVar) > 0;
    }

    public boolean O(q qVar) {
        return compareTo(qVar) < 0;
    }

    public boolean S(int i10) {
        return i10 >= 1 && i10 <= lengthOfMonth();
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public q f(long j10, org.threeten.bp.temporal.m mVar) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = v(Long.MAX_VALUE, mVar);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.v(j11, mVar);
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public q p(org.threeten.bp.temporal.i iVar) {
        return (q) iVar.b(this);
    }

    public q V(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = h0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.h0(j11);
    }

    public q W(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = i0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.i0(j11);
    }

    @Override // org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e b(org.threeten.bp.temporal.e eVar) {
        if (org.threeten.bp.chrono.j.v(eVar).equals(org.threeten.bp.chrono.o.f339936e)) {
            return eVar.o(org.threeten.bp.temporal.a.f340336i3, L());
        }
        throw new org.threeten.bp.b("Adjustment only supported on ISO date-time");
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.o c(org.threeten.bp.temporal.j jVar) {
        if (jVar == org.threeten.bp.temporal.a.f340338j3) {
            return org.threeten.bp.temporal.o.k(1L, M() <= 0 ? 1000000000L : 999999999L);
        }
        return super.c(jVar);
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public <R> R d(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.a()) {
            return (R) org.threeten.bp.chrono.o.f339936e;
        }
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return (R) org.threeten.bp.temporal.b.MONTHS;
        }
        if (lVar == org.threeten.bp.temporal.k.b() || lVar == org.threeten.bp.temporal.k.c() || lVar == org.threeten.bp.temporal.k.f() || lVar == org.threeten.bp.temporal.k.g() || lVar == org.threeten.bp.temporal.k.d()) {
            return null;
        }
        return (R) super.d(lVar);
    }

    @Override // org.threeten.bp.temporal.e
    public boolean e(org.threeten.bp.temporal.m mVar) {
        if (mVar instanceof org.threeten.bp.temporal.b) {
            return mVar == org.threeten.bp.temporal.b.MONTHS || mVar == org.threeten.bp.temporal.b.YEARS || mVar == org.threeten.bp.temporal.b.DECADES || mVar == org.threeten.bp.temporal.b.CENTURIES || mVar == org.threeten.bp.temporal.b.MILLENNIA || mVar == org.threeten.bp.temporal.b.ERAS;
        }
        return mVar != null && mVar.c(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f340304a == qVar.f340304a && this.f340305b == qVar.f340305b) {
                return true;
            }
        }
        return false;
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public q v(long j10, org.threeten.bp.temporal.m mVar) {
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return (q) mVar.b(this, j10);
        }
        switch (b.f340307b[((org.threeten.bp.temporal.b) mVar).ordinal()]) {
            case 1:
                return h0(j10);
            case 2:
                return i0(j10);
            case 3:
                return i0(cn.d.n(j10, 10));
            case 4:
                return i0(cn.d.n(j10, 100));
            case 5:
                return i0(cn.d.n(j10, 1000));
            case 6:
                org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340342l3;
                return o(aVar, cn.d.l(t(aVar), j10));
            default:
                throw new org.threeten.bp.temporal.n("Unsupported unit: " + mVar);
        }
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public q n(org.threeten.bp.temporal.i iVar) {
        return (q) iVar.c(this);
    }

    public q h0(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (((long) this.f340304a) * 12) + ((long) (this.f340305b - 1)) + j10;
        return k0(org.threeten.bp.temporal.a.f340340k3.k(cn.d.e(j11, 12L)), cn.d.g(j11, 12) + 1);
    }

    public int hashCode() {
        return (this.f340305b << 27) ^ this.f340304a;
    }

    public q i0(long j10) {
        return j10 == 0 ? this : k0(org.threeten.bp.temporal.a.f340340k3.k(((long) this.f340304a) + j10), this.f340305b);
    }

    public boolean isLeapYear() {
        return org.threeten.bp.chrono.o.f339936e.isLeapYear(this.f340304a);
    }

    @Override // org.threeten.bp.temporal.e
    public long k(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        q qVarE = E(eVar);
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return mVar.d(this, qVarE);
        }
        long jL = qVarE.L() - L();
        switch (b.f340307b[((org.threeten.bp.temporal.b) mVar).ordinal()]) {
            case 1:
                return jL;
            case 2:
                return jL / 12;
            case 3:
                return jL / 120;
            case 4:
                return jL / ShimmerTextView.f258575k;
            case 5:
                return jL / 12000;
            case 6:
                org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340342l3;
                return qVarE.t(aVar) - t(aVar);
            default:
                throw new org.threeten.bp.temporal.n("Unsupported unit: " + mVar);
        }
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public int l(org.threeten.bp.temporal.j jVar) {
        return c(jVar).a(t(jVar), jVar);
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public q s(org.threeten.bp.temporal.g gVar) {
        return (q) gVar.b(this);
    }

    public int lengthOfMonth() {
        return H().D(isLeapYear());
    }

    public int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public q o(org.threeten.bp.temporal.j jVar, long j10) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return (q) jVar.b(this, j10);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        aVar.l(j10);
        int i10 = b.f340306a[aVar.ordinal()];
        if (i10 == 1) {
            return n0((int) j10);
        }
        if (i10 == 2) {
            return h0(j10 - t(org.threeten.bp.temporal.a.f340336i3));
        }
        if (i10 == 3) {
            if (this.f340304a < 1) {
                j10 = 1 - j10;
            }
            return o0((int) j10);
        }
        if (i10 == 4) {
            return o0((int) j10);
        }
        if (i10 == 5) {
            return t(org.threeten.bp.temporal.a.f340342l3) == j10 ? this : o0(1 - this.f340304a);
        }
        throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
    }

    public q n0(int i10) {
        org.threeten.bp.temporal.a.f340334h3.l(i10);
        return k0(this.f340304a, i10);
    }

    public q o0(int i10) {
        org.threeten.bp.temporal.a.f340340k3.l(i10);
        return k0(i10, this.f340305b);
    }

    void p0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.f340304a);
        dataOutput.writeByte(this.f340305b);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean q(org.threeten.bp.temporal.j jVar) {
        if (jVar instanceof org.threeten.bp.temporal.a) {
            return jVar == org.threeten.bp.temporal.a.f340340k3 || jVar == org.threeten.bp.temporal.a.f340334h3 || jVar == org.threeten.bp.temporal.a.f340336i3 || jVar == org.threeten.bp.temporal.a.f340338j3 || jVar == org.threeten.bp.temporal.a.f340342l3;
        }
        return jVar != null && jVar.c(this);
    }

    @Override // org.threeten.bp.temporal.f
    public long t(org.threeten.bp.temporal.j jVar) {
        int i10;
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.e(this);
        }
        int i11 = b.f340306a[((org.threeten.bp.temporal.a) jVar).ordinal()];
        if (i11 == 1) {
            i10 = this.f340305b;
        } else {
            if (i11 == 2) {
                return L();
            }
            if (i11 == 3) {
                int i12 = this.f340304a;
                if (i12 < 1) {
                    i12 = 1 - i12;
                }
                return i12;
            }
            if (i11 != 4) {
                if (i11 == 5) {
                    return this.f340304a < 1 ? 0 : 1;
                }
                throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
            }
            i10 = this.f340304a;
        }
        return i10;
    }

    public String toString() {
        int iAbs = Math.abs(this.f340304a);
        StringBuilder sb2 = new StringBuilder(9);
        if (iAbs < 1000) {
            int i10 = this.f340304a;
            if (i10 < 0) {
                sb2.append(i10 - 10000);
                sb2.deleteCharAt(1);
            } else {
                sb2.append(i10 + 10000);
                int i11 = 7 & 0;
                sb2.deleteCharAt(0);
            }
        } else {
            sb2.append(this.f340304a);
        }
        sb2.append(this.f340305b < 10 ? "-0" : "-");
        sb2.append(this.f340305b);
        return sb2.toString();
    }

    public g w(int i10) {
        return g.C0(this.f340304a, this.f340305b, i10);
    }

    public g x() {
        return g.C0(this.f340304a, this.f340305b, lengthOfMonth());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public int compareTo(q qVar) {
        int i10 = this.f340304a - qVar.f340304a;
        return i10 == 0 ? this.f340305b - qVar.f340305b : i10;
    }
}
