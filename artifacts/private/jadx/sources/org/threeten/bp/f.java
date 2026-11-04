package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class f extends cn.c implements org.threeten.bp.temporal.e, org.threeten.bp.temporal.g, Comparable<f>, Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f340027i = -665713676816604388L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f340028j = 1000000000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f340029k = 1000000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f340030l = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f340031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f340032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f340021c = new f(0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f340022d = -31557014167219200L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f340024f = a0(f340022d, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f340023e = 31556889864403199L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f340025g = a0(f340023e, 999999999);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<f> f340026h = new a();

    class a implements org.threeten.bp.temporal.l<f> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(org.threeten.bp.temporal.f fVar) {
            return f.E(fVar);
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f340033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f340034b;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.b.values().length];
            f340034b = iArr;
            try {
                iArr[org.threeten.bp.temporal.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f340034b[org.threeten.bp.temporal.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f340034b[org.threeten.bp.temporal.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f340034b[org.threeten.bp.temporal.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f340034b[org.threeten.bp.temporal.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f340034b[org.threeten.bp.temporal.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f340034b[org.threeten.bp.temporal.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f340034b[org.threeten.bp.temporal.b.DAYS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[org.threeten.bp.temporal.a.values().length];
            f340033a = iArr2;
            try {
                iArr2[org.threeten.bp.temporal.a.f340329e.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f340033a[org.threeten.bp.temporal.a.f340331g.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f340033a[org.threeten.bp.temporal.a.f340335i.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f340033a[org.threeten.bp.temporal.a.f340344m3.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private f(long j10, int i10) {
        this.f340031a = j10;
        this.f340032b = i10;
    }

    private static f D(long j10, int i10) {
        if ((((long) i10) | j10) == 0) {
            return f340021c;
        }
        if (j10 < f340022d || j10 > f340023e) {
            throw new org.threeten.bp.b("Instant exceeds minimum or maximum instant");
        }
        return new f(j10, i10);
    }

    public static f E(org.threeten.bp.temporal.f fVar) {
        try {
            return a0(fVar.t(org.threeten.bp.temporal.a.f340344m3), fVar.l(org.threeten.bp.temporal.a.f340329e));
        } catch (org.threeten.bp.b e10) {
            throw new org.threeten.bp.b("Unable to obtain Instant from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName(), e10);
        }
    }

    private long V(f fVar) {
        return cn.d.l(cn.d.n(cn.d.q(fVar.f340031a, this.f340031a), 1000000000), fVar.f340032b - this.f340032b);
    }

    public static f W() {
        return org.threeten.bp.a.h().c();
    }

    public static f X(org.threeten.bp.a aVar) {
        cn.d.j(aVar, "clock");
        return aVar.c();
    }

    public static f Y(long j10) {
        return D(cn.d.e(j10, 1000L), cn.d.g(j10, 1000) * 1000000);
    }

    public static f Z(long j10) {
        return D(j10, 0);
    }

    public static f a0(long j10, long j11) {
        return D(cn.d.l(j10, cn.d.e(j11, 1000000000L)), cn.d.g(j11, 1000000000));
    }

    public static f c0(CharSequence charSequence) {
        return (f) org.threeten.bp.format.c.f340054t.r(charSequence, f340026h);
    }

    private f d0(long j10, long j11) {
        if ((j10 | j11) == 0) {
            return this;
        }
        return a0(cn.d.l(cn.d.l(this.f340031a, j10), j11 / 1000000000), ((long) this.f340032b) + (j11 % 1000000000));
    }

    static f j0(DataInput dataInput) throws IOException {
        return a0(dataInput.readLong(), dataInput.readInt());
    }

    private long k0(f fVar) {
        long jQ = cn.d.q(fVar.f340031a, this.f340031a);
        long j10 = fVar.f340032b - this.f340032b;
        if (jQ <= 0 || j10 >= 0) {
            return (jQ >= 0 || j10 <= 0) ? jQ : jQ + 1;
        }
        return jQ - 1;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 2, this);
    }

    public long H() {
        return this.f340031a;
    }

    public int I() {
        return this.f340032b;
    }

    public boolean L(f fVar) {
        return compareTo(fVar) > 0;
    }

    public boolean M(f fVar) {
        return compareTo(fVar) < 0;
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public f f(long j10, org.threeten.bp.temporal.m mVar) {
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
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public f p(org.threeten.bp.temporal.i iVar) {
        return (f) iVar.b(this);
    }

    public f S(long j10) {
        return j10 == Long.MIN_VALUE ? g0(Long.MAX_VALUE).g0(1L) : g0(-j10);
    }

    public f T(long j10) {
        return j10 == Long.MIN_VALUE ? h0(Long.MAX_VALUE).h0(1L) : h0(-j10);
    }

    public f U(long j10) {
        return j10 == Long.MIN_VALUE ? i0(Long.MAX_VALUE).i0(1L) : i0(-j10);
    }

    @Override // org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e b(org.threeten.bp.temporal.e eVar) {
        return eVar.o(org.threeten.bp.temporal.a.f340344m3, this.f340031a).o(org.threeten.bp.temporal.a.f340329e, this.f340032b);
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.o c(org.threeten.bp.temporal.j jVar) {
        return super.c(jVar);
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public <R> R d(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return (R) org.threeten.bp.temporal.b.NANOS;
        }
        if (lVar == org.threeten.bp.temporal.k.b() || lVar == org.threeten.bp.temporal.k.c() || lVar == org.threeten.bp.temporal.k.a() || lVar == org.threeten.bp.temporal.k.g() || lVar == org.threeten.bp.temporal.k.f() || lVar == org.threeten.bp.temporal.k.d()) {
            return null;
        }
        return lVar.a(this);
    }

    @Override // org.threeten.bp.temporal.e
    public boolean e(org.threeten.bp.temporal.m mVar) {
        if (mVar instanceof org.threeten.bp.temporal.b) {
            return mVar.isTimeBased() || mVar == org.threeten.bp.temporal.b.DAYS;
        }
        return mVar != null && mVar.c(this);
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public f v(long j10, org.threeten.bp.temporal.m mVar) {
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return (f) mVar.b(this, j10);
        }
        switch (b.f340034b[((org.threeten.bp.temporal.b) mVar).ordinal()]) {
            case 1:
                return h0(j10);
            case 2:
                return d0(j10 / 1000000, (j10 % 1000000) * 1000);
            case 3:
                return g0(j10);
            case 4:
                return i0(j10);
            case 5:
                return i0(cn.d.n(j10, 60));
            case 6:
                return i0(cn.d.n(j10, 3600));
            case 7:
                return i0(cn.d.n(j10, 43200));
            case 8:
                return i0(cn.d.n(j10, 86400));
            default:
                throw new org.threeten.bp.temporal.n("Unsupported unit: " + mVar);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f340031a == fVar.f340031a && this.f340032b == fVar.f340032b) {
                return true;
            }
        }
        return false;
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public f n(org.threeten.bp.temporal.i iVar) {
        return (f) iVar.c(this);
    }

    public f g0(long j10) {
        return d0(j10 / 1000, (j10 % 1000) * 1000000);
    }

    public f h0(long j10) {
        return d0(0L, j10);
    }

    public int hashCode() {
        long j10 = this.f340031a;
        return ((int) (j10 ^ (j10 >>> 32))) + (this.f340032b * 51);
    }

    public f i0(long j10) {
        return d0(j10, 0L);
    }

    @Override // org.threeten.bp.temporal.e
    public long k(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        f fVarE = E(eVar);
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return mVar.d(this, fVarE);
        }
        switch (b.f340034b[((org.threeten.bp.temporal.b) mVar).ordinal()]) {
            case 1:
                return V(fVarE);
            case 2:
                return V(fVarE) / 1000;
            case 3:
                return cn.d.q(fVarE.l0(), l0());
            case 4:
                return k0(fVarE);
            case 5:
                return k0(fVarE) / 60;
            case 6:
                return k0(fVarE) / 3600;
            case 7:
                return k0(fVarE) / 43200;
            case 8:
                return k0(fVarE) / 86400;
            default:
                throw new org.threeten.bp.temporal.n("Unsupported unit: " + mVar);
        }
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public int l(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return c(jVar).a(jVar.e(this), jVar);
        }
        int i10 = b.f340033a[((org.threeten.bp.temporal.a) jVar).ordinal()];
        if (i10 == 1) {
            return this.f340032b;
        }
        if (i10 == 2) {
            return this.f340032b / 1000;
        }
        if (i10 == 3) {
            return this.f340032b / 1000000;
        }
        throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
    }

    public long l0() {
        long j10 = this.f340031a;
        return j10 >= 0 ? cn.d.l(cn.d.o(j10, 1000L), this.f340032b / 1000000) : cn.d.q(cn.d.o(j10 + 1, 1000L), 1000 - ((long) (this.f340032b / 1000000)));
    }

    public f m0(org.threeten.bp.temporal.m mVar) {
        if (mVar == org.threeten.bp.temporal.b.NANOS) {
            return this;
        }
        e duration = mVar.getDuration();
        if (duration.v() > 86400) {
            throw new org.threeten.bp.b("Unit is too large to be used for truncation");
        }
        long jW0 = duration.w0();
        if (86400000000000L % jW0 != 0) {
            throw new org.threeten.bp.b("Unit must divide into a standard day without remainder");
        }
        long j10 = ((this.f340031a % 86400) * 1000000000) + ((long) this.f340032b);
        return h0((cn.d.e(j10, jW0) * jW0) - j10);
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public f s(org.threeten.bp.temporal.g gVar) {
        return (f) gVar.b(this);
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public f o(org.threeten.bp.temporal.j jVar, long j10) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return (f) jVar.b(this, j10);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        aVar.l(j10);
        int i10 = b.f340033a[aVar.ordinal()];
        if (i10 == 1) {
            return j10 != ((long) this.f340032b) ? D(this.f340031a, (int) j10) : this;
        }
        if (i10 == 2) {
            int i11 = ((int) j10) * 1000;
            return i11 != this.f340032b ? D(this.f340031a, i11) : this;
        }
        if (i10 == 3) {
            int i12 = ((int) j10) * 1000000;
            return i12 != this.f340032b ? D(this.f340031a, i12) : this;
        }
        if (i10 == 4) {
            return j10 != this.f340031a ? D(j10, this.f340032b) : this;
        }
        throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
    }

    void p0(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.f340031a);
        dataOutput.writeInt(this.f340032b);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean q(org.threeten.bp.temporal.j jVar) {
        if (jVar instanceof org.threeten.bp.temporal.a) {
            return jVar == org.threeten.bp.temporal.a.f340344m3 || jVar == org.threeten.bp.temporal.a.f340329e || jVar == org.threeten.bp.temporal.a.f340331g || jVar == org.threeten.bp.temporal.a.f340335i;
        }
        return jVar != null && jVar.c(this);
    }

    @Override // org.threeten.bp.temporal.f
    public long t(org.threeten.bp.temporal.j jVar) {
        int i10;
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.e(this);
        }
        int i11 = b.f340033a[((org.threeten.bp.temporal.a) jVar).ordinal()];
        if (i11 == 1) {
            i10 = this.f340032b;
        } else if (i11 == 2) {
            i10 = this.f340032b / 1000;
        } else {
            if (i11 != 3) {
                if (i11 == 4) {
                    return this.f340031a;
                }
                throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
            }
            i10 = this.f340032b / 1000000;
        }
        return i10;
    }

    public String toString() {
        return org.threeten.bp.format.c.f340054t.d(this);
    }

    public l w(s sVar) {
        return l.r0(this, sVar);
    }

    public u x(r rVar) {
        return u.H0(this, rVar);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        int iB = cn.d.b(this.f340031a, fVar.f340031a);
        return iB != 0 ? iB : this.f340032b - fVar.f340032b;
    }
}
