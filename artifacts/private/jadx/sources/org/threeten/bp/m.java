package org.threeten.bp;

import androidx.constraintlayout.core.motion.utils.v;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class m extends cn.c implements org.threeten.bp.temporal.e, org.threeten.bp.temporal.g, Comparable<m>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f340264c = i.f340212e.x(s.f340322s);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f340265d = i.f340213f.x(s.f340321o);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<m> f340266e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f340267f = 7264499704384272492L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f340268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f340269b;

    class a implements org.threeten.bp.temporal.l<m> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m a(org.threeten.bp.temporal.f fVar) {
            return m.D(fVar);
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f340270a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.b.values().length];
            f340270a = iArr;
            try {
                iArr[org.threeten.bp.temporal.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f340270a[org.threeten.bp.temporal.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f340270a[org.threeten.bp.temporal.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f340270a[org.threeten.bp.temporal.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f340270a[org.threeten.bp.temporal.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f340270a[org.threeten.bp.temporal.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f340270a[org.threeten.bp.temporal.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private m(i iVar, s sVar) {
        this.f340268a = (i) cn.d.j(iVar, "time");
        this.f340269b = (s) cn.d.j(sVar, v.c.R);
    }

    public static m D(org.threeten.bp.temporal.f fVar) {
        if (fVar instanceof m) {
            return (m) fVar;
        }
        try {
            return new m(i.H(fVar), s.R(fVar));
        } catch (org.threeten.bp.b unused) {
            throw new org.threeten.bp.b("Unable to obtain OffsetTime from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName());
        }
    }

    public static m Z() {
        return a0(org.threeten.bp.a.g());
    }

    public static m a0(org.threeten.bp.a aVar) {
        cn.d.j(aVar, "clock");
        f fVarC = aVar.c();
        return f0(fVarC, aVar.b().z().b(fVarC));
    }

    public static m c0(r rVar) {
        return a0(org.threeten.bp.a.f(rVar));
    }

    public static m d0(int i10, int i11, int i12, int i13, s sVar) {
        return new m(i.g0(i10, i11, i12, i13), sVar);
    }

    public static m e0(i iVar, s sVar) {
        return new m(iVar, sVar);
    }

    public static m f0(f fVar, r rVar) {
        cn.d.j(fVar, "instant");
        cn.d.j(rVar, "zone");
        s sVarB = rVar.z().b(fVar);
        long jH = ((fVar.H() % 86400) + ((long) sVarB.S())) % 86400;
        if (jH < 0) {
            jH += 86400;
        }
        return new m(i.j0(jH, fVar.I()), sVarB);
    }

    public static m g0(CharSequence charSequence) {
        return h0(charSequence, org.threeten.bp.format.c.f340046l);
    }

    public static m h0(CharSequence charSequence, org.threeten.bp.format.c cVar) {
        cn.d.j(cVar, "formatter");
        return (m) cVar.r(charSequence, f340266e);
    }

    static m o0(DataInput dataInput) throws IOException {
        return e0(i.s0(dataInput), s.Z(dataInput));
    }

    private long p0() {
        return this.f340268a.t0() - (((long) this.f340269b.S()) * 1000000000);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private m s0(i iVar, s sVar) {
        return (this.f340268a == iVar && this.f340269b.equals(sVar)) ? this : new m(iVar, sVar);
    }

    private Object writeReplace() {
        return new o((byte) 66, this);
    }

    public m A0(int i10) {
        return s0(this.f340268a.B0(i10), this.f340269b);
    }

    void B0(DataOutput dataOutput) throws IOException {
        this.f340268a.C0(dataOutput);
        this.f340269b.d0(dataOutput);
    }

    public int E() {
        return this.f340268a.L();
    }

    public int H() {
        return this.f340268a.M();
    }

    public int I() {
        return this.f340268a.N();
    }

    public s L() {
        return this.f340269b;
    }

    public int M() {
        return this.f340268a.O();
    }

    public boolean N(m mVar) {
        return p0() > mVar.p0();
    }

    public boolean O(m mVar) {
        return p0() < mVar.p0();
    }

    public boolean S(m mVar) {
        return p0() == mVar.p0();
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public m f(long j10, org.threeten.bp.temporal.m mVar) {
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
    public m p(org.threeten.bp.temporal.i iVar) {
        return (m) iVar.b(this);
    }

    public m V(long j10) {
        return s0(this.f340268a.W(j10), this.f340269b);
    }

    public m W(long j10) {
        return s0(this.f340268a.X(j10), this.f340269b);
    }

    public m X(long j10) {
        return s0(this.f340268a.Y(j10), this.f340269b);
    }

    public m Y(long j10) {
        return s0(this.f340268a.Z(j10), this.f340269b);
    }

    @Override // org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e b(org.threeten.bp.temporal.e eVar) {
        return eVar.o(org.threeten.bp.temporal.a.f340330f, this.f340268a.t0()).o(org.threeten.bp.temporal.a.f340346n3, L().S());
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.o c(org.threeten.bp.temporal.j jVar) {
        if (jVar instanceof org.threeten.bp.temporal.a) {
            return jVar == org.threeten.bp.temporal.a.f340346n3 ? jVar.range() : this.f340268a.c(jVar);
        }
        return jVar.d(this);
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public <R> R d(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return (R) org.threeten.bp.temporal.b.NANOS;
        }
        if (lVar == org.threeten.bp.temporal.k.d() || lVar == org.threeten.bp.temporal.k.f()) {
            return (R) L();
        }
        if (lVar == org.threeten.bp.temporal.k.c()) {
            return (R) this.f340268a;
        }
        if (lVar == org.threeten.bp.temporal.k.a() || lVar == org.threeten.bp.temporal.k.b() || lVar == org.threeten.bp.temporal.k.g()) {
            return null;
        }
        return (R) super.d(lVar);
    }

    @Override // org.threeten.bp.temporal.e
    public boolean e(org.threeten.bp.temporal.m mVar) {
        if (mVar instanceof org.threeten.bp.temporal.b) {
            return mVar.isTimeBased();
        }
        return mVar != null && mVar.c(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f340268a.equals(mVar.f340268a) && this.f340269b.equals(mVar.f340269b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f340269b.hashCode() ^ this.f340268a.hashCode();
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public m v(long j10, org.threeten.bp.temporal.m mVar) {
        return mVar instanceof org.threeten.bp.temporal.b ? s0(this.f340268a.v(j10, mVar), this.f340269b) : (m) mVar.b(this, j10);
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public m n(org.threeten.bp.temporal.i iVar) {
        return (m) iVar.c(this);
    }

    @Override // org.threeten.bp.temporal.e
    public long k(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        m mVarD = D(eVar);
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return mVar.d(this, mVarD);
        }
        long jP0 = mVarD.p0() - p0();
        switch (b.f340270a[((org.threeten.bp.temporal.b) mVar).ordinal()]) {
            case 1:
                return jP0;
            case 2:
                return jP0 / 1000;
            case 3:
                return jP0 / 1000000;
            case 4:
                return jP0 / 1000000000;
            case 5:
                return jP0 / 60000000000L;
            case 6:
                return jP0 / 3600000000000L;
            case 7:
                return jP0 / 43200000000000L;
            default:
                throw new org.threeten.bp.temporal.n("Unsupported unit: " + mVar);
        }
    }

    public m k0(long j10) {
        return s0(this.f340268a.o0(j10), this.f340269b);
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public int l(org.threeten.bp.temporal.j jVar) {
        return super.l(jVar);
    }

    public m l0(long j10) {
        return s0(this.f340268a.p0(j10), this.f340269b);
    }

    public m m0(long j10) {
        return s0(this.f340268a.q0(j10), this.f340269b);
    }

    public m n0(long j10) {
        return s0(this.f340268a.r0(j10), this.f340269b);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean q(org.threeten.bp.temporal.j jVar) {
        if (jVar instanceof org.threeten.bp.temporal.a) {
            return jVar.isTimeBased() || jVar == org.threeten.bp.temporal.a.f340346n3;
        }
        return jVar != null && jVar.c(this);
    }

    public i q0() {
        return this.f340268a;
    }

    public m r0(org.threeten.bp.temporal.m mVar) {
        return s0(this.f340268a.v0(mVar), this.f340269b);
    }

    @Override // org.threeten.bp.temporal.f
    public long t(org.threeten.bp.temporal.j jVar) {
        if (jVar instanceof org.threeten.bp.temporal.a) {
            return jVar == org.threeten.bp.temporal.a.f340346n3 ? L().S() : this.f340268a.t(jVar);
        }
        return jVar.e(this);
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public m s(org.threeten.bp.temporal.g gVar) {
        if (gVar instanceof i) {
            return s0((i) gVar, this.f340269b);
        }
        if (gVar instanceof s) {
            return s0(this.f340268a, (s) gVar);
        }
        return gVar instanceof m ? (m) gVar : (m) gVar.b(this);
    }

    public String toString() {
        return this.f340268a.toString() + this.f340269b.toString();
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public m o(org.threeten.bp.temporal.j jVar, long j10) {
        if (jVar instanceof org.threeten.bp.temporal.a) {
            return jVar == org.threeten.bp.temporal.a.f340346n3 ? s0(this.f340268a, s.X(((org.threeten.bp.temporal.a) jVar).k(j10))) : s0(this.f340268a.o(jVar, j10), this.f340269b);
        }
        return (m) jVar.b(this, j10);
    }

    public m v0(int i10) {
        return s0(this.f340268a.y0(i10), this.f340269b);
    }

    public l w(g gVar) {
        return l.p0(gVar, this.f340268a, this.f340269b);
    }

    public m w0(int i10) {
        return s0(this.f340268a.z0(i10), this.f340269b);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public int compareTo(m mVar) {
        int iB;
        return (this.f340269b.equals(mVar.f340269b) || (iB = cn.d.b(p0(), mVar.p0())) == 0) ? this.f340268a.compareTo(mVar.f340268a) : iB;
    }

    public m x0(int i10) {
        return s0(this.f340268a.A0(i10), this.f340269b);
    }

    public m y0(s sVar) {
        if (sVar.equals(this.f340269b)) {
            return this;
        }
        return new m(this.f340268a.r0(sVar.S() - this.f340269b.S()), sVar);
    }

    public String z(org.threeten.bp.format.c cVar) {
        cn.d.j(cVar, "formatter");
        return cVar.d(this);
    }

    public m z0(s sVar) {
        return (sVar == null || !sVar.equals(this.f340269b)) ? new m(this.f340268a, sVar) : this;
    }
}
