package org.threeten.bp;

import androidx.constraintlayout.core.motion.utils.v;
import io.intercom.android.sdk.models.AttributeType;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class h extends org.threeten.bp.chrono.d<g> implements org.threeten.bp.temporal.e, org.threeten.bp.temporal.g, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f340205d = H0(g.f340194e, i.f340212e);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f340206e = H0(g.f340195f, i.f340213f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<h> f340207f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f340208g = 6207766400415563566L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f340209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f340210c;

    class a implements org.threeten.bp.temporal.l<h> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h a(org.threeten.bp.temporal.f fVar) {
            return h.d0(fVar);
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f340211a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.b.values().length];
            f340211a = iArr;
            try {
                iArr[org.threeten.bp.temporal.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f340211a[org.threeten.bp.temporal.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f340211a[org.threeten.bp.temporal.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f340211a[org.threeten.bp.temporal.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f340211a[org.threeten.bp.temporal.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f340211a[org.threeten.bp.temporal.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f340211a[org.threeten.bp.temporal.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private h(g gVar, i iVar) {
        this.f340209b = gVar;
        this.f340210c = iVar;
    }

    public static h A0(r rVar) {
        return z0(org.threeten.bp.a.f(rVar));
    }

    public static h B0(int i10, int i11, int i12, int i13, int i14) {
        return new h(g.C0(i10, i11, i12), i.e0(i13, i14));
    }

    public static h C0(int i10, int i11, int i12, int i13, int i14, int i15) {
        return new h(g.C0(i10, i11, i12), i.f0(i13, i14, i15));
    }

    public static h D0(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return new h(g.C0(i10, i11, i12), i.g0(i13, i14, i15, i16));
    }

    public static h E0(int i10, j jVar, int i11, int i12, int i13) {
        return new h(g.D0(i10, jVar, i11), i.e0(i12, i13));
    }

    public static h F0(int i10, j jVar, int i11, int i12, int i13, int i14) {
        return new h(g.D0(i10, jVar, i11), i.f0(i12, i13, i14));
    }

    public static h G0(int i10, j jVar, int i11, int i12, int i13, int i14, int i15) {
        return new h(g.D0(i10, jVar, i11), i.g0(i12, i13, i14, i15));
    }

    public static h H0(g gVar, i iVar) {
        cn.d.j(gVar, AttributeType.DATE);
        cn.d.j(iVar, "time");
        return new h(gVar, iVar);
    }

    public static h I0(long j10, int i10, s sVar) {
        cn.d.j(sVar, v.c.R);
        long jS = j10 + ((long) sVar.S());
        return new h(g.E0(cn.d.e(jS, 86400L)), i.j0(cn.d.g(jS, 86400), i10));
    }

    public static h J0(f fVar, r rVar) {
        cn.d.j(fVar, "instant");
        cn.d.j(rVar, "zone");
        return I0(fVar.H(), fVar.I(), rVar.z().b(fVar));
    }

    public static h K0(CharSequence charSequence) {
        return L0(charSequence, org.threeten.bp.format.c.f340048n);
    }

    public static h L0(CharSequence charSequence, org.threeten.bp.format.c cVar) {
        cn.d.j(cVar, "formatter");
        return (h) cVar.r(charSequence, f340207f);
    }

    private h V0(g gVar, long j10, long j11, long j12, long j13, int i10) {
        if ((j10 | j11 | j12 | j13) == 0) {
            return a1(gVar, this.f340210c);
        }
        long j14 = i10;
        long jT0 = this.f340210c.t0();
        long j15 = (((j13 % 86400000000000L) + ((j12 % 86400) * 1000000000) + ((j11 % 1440) * 60000000000L) + ((j10 % 24) * 3600000000000L)) * j14) + jT0;
        long jE = (((j13 / 86400000000000L) + (j12 / 86400) + (j11 / 1440) + (j10 / 24)) * j14) + cn.d.e(j15, 86400000000000L);
        long jH = cn.d.h(j15, 86400000000000L);
        return a1(gVar.K0(jE), jH == jT0 ? this.f340210c : i.h0(jH));
    }

    static h X0(DataInput dataInput) throws IOException {
        return H0(g.O0(dataInput), i.s0(dataInput));
    }

    private h a1(g gVar, i iVar) {
        return (this.f340209b == gVar && this.f340210c == iVar) ? this : new h(gVar, iVar);
    }

    private int c0(h hVar) {
        int iF0 = this.f340209b.f0(hVar.V());
        return iF0 == 0 ? this.f340210c.compareTo(hVar.W()) : iF0;
    }

    public static h d0(org.threeten.bp.temporal.f fVar) {
        if (fVar instanceof h) {
            return (h) fVar;
        }
        if (fVar instanceof u) {
            return ((u) fVar).W();
        }
        try {
            return new h(g.i0(fVar), i.H(fVar));
        } catch (org.threeten.bp.b unused) {
            throw new org.threeten.bp.b("Unable to obtain LocalDateTime from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName());
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 4, this);
    }

    public static h y0() {
        return z0(org.threeten.bp.a.g());
    }

    public static h z0(org.threeten.bp.a aVar) {
        cn.d.j(aVar, "clock");
        f fVarC = aVar.c();
        return I0(fVarC.H(), fVarC.I(), aVar.b().z().b(fVarC));
    }

    @Override // org.threeten.bp.chrono.d
    public boolean H(org.threeten.bp.chrono.d<?> dVar) {
        if (dVar instanceof h) {
            return c0((h) dVar) > 0;
        }
        return super.H(dVar);
    }

    @Override // org.threeten.bp.chrono.d
    public boolean I(org.threeten.bp.chrono.d<?> dVar) {
        if (dVar instanceof h) {
            return c0((h) dVar) < 0;
        }
        return super.I(dVar);
    }

    @Override // org.threeten.bp.chrono.d
    public boolean L(org.threeten.bp.chrono.d<?> dVar) {
        if (dVar instanceof h) {
            return c0((h) dVar) == 0;
        }
        return super.L(dVar);
    }

    @Override // org.threeten.bp.chrono.d, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public h v(long j10, org.threeten.bp.temporal.m mVar) {
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return (h) mVar.b(this, j10);
        }
        switch (b.f340211a[((org.threeten.bp.temporal.b) mVar).ordinal()]) {
            case 1:
                return S0(j10);
            case 2:
                return O0(j10 / 86400000000L).S0((j10 % 86400000000L) * 1000);
            case 3:
                return O0(j10 / 86400000).S0((j10 % 86400000) * 1000000);
            case 4:
                return T0(j10);
            case 5:
                return Q0(j10);
            case 6:
                return P0(j10);
            case 7:
                return O0(j10 / 256).P0((j10 % 256) * 12);
            default:
                return a1(this.f340209b.v(j10, mVar), this.f340210c);
        }
    }

    @Override // org.threeten.bp.chrono.d, cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public h n(org.threeten.bp.temporal.i iVar) {
        return (h) iVar.c(this);
    }

    public h O0(long j10) {
        return a1(this.f340209b.K0(j10), this.f340210c);
    }

    public h P0(long j10) {
        return V0(this.f340209b, j10, 0L, 0L, 0L, 1);
    }

    public h Q0(long j10) {
        return V0(this.f340209b, 0L, j10, 0L, 0L, 1);
    }

    public h R0(long j10) {
        return a1(this.f340209b.L0(j10), this.f340210c);
    }

    public h S0(long j10) {
        return V0(this.f340209b, 0L, 0L, 0L, j10, 1);
    }

    public h T0(long j10) {
        return V0(this.f340209b, 0L, 0L, j10, 0L, 1);
    }

    public h U0(long j10) {
        return a1(this.f340209b.M0(j10), this.f340210c);
    }

    @Override // org.threeten.bp.chrono.d
    public i W() {
        return this.f340210c;
    }

    public h W0(long j10) {
        return a1(this.f340209b.N0(j10), this.f340210c);
    }

    @Override // org.threeten.bp.chrono.d
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public g V() {
        return this.f340209b;
    }

    public l Z(s sVar) {
        return l.q0(this, sVar);
    }

    public h Z0(org.threeten.bp.temporal.m mVar) {
        return a1(this.f340209b, this.f340210c.v0(mVar));
    }

    @Override // org.threeten.bp.chrono.d
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public u w(r rVar) {
        return u.G0(this, rVar);
    }

    @Override // org.threeten.bp.chrono.d, org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e b(org.threeten.bp.temporal.e eVar) {
        return super.b(eVar);
    }

    @Override // org.threeten.bp.chrono.d, cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public h s(org.threeten.bp.temporal.g gVar) {
        if (gVar instanceof g) {
            return a1((g) gVar, this.f340210c);
        }
        if (gVar instanceof i) {
            return a1(this.f340209b, (i) gVar);
        }
        return gVar instanceof h ? (h) gVar : (h) gVar.b(this);
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.o c(org.threeten.bp.temporal.j jVar) {
        if (jVar instanceof org.threeten.bp.temporal.a) {
            return jVar.isTimeBased() ? this.f340210c.c(jVar) : this.f340209b.c(jVar);
        }
        return jVar.d(this);
    }

    @Override // org.threeten.bp.chrono.d, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public h o(org.threeten.bp.temporal.j jVar, long j10) {
        if (jVar instanceof org.threeten.bp.temporal.a) {
            return jVar.isTimeBased() ? a1(this.f340209b, this.f340210c.o(jVar, j10)) : a1(this.f340209b.o(jVar, j10), this.f340210c);
        }
        return (h) jVar.b(this, j10);
    }

    @Override // org.threeten.bp.chrono.d, cn.c, org.threeten.bp.temporal.f
    public <R> R d(org.threeten.bp.temporal.l<R> lVar) {
        return lVar == org.threeten.bp.temporal.k.b() ? (R) V() : (R) super.d(lVar);
    }

    public h d1(int i10) {
        return a1(this.f340209b.T0(i10), this.f340210c);
    }

    @Override // org.threeten.bp.temporal.e
    public boolean e(org.threeten.bp.temporal.m mVar) {
        if (mVar instanceof org.threeten.bp.temporal.b) {
            return mVar.isDateBased() || mVar.isTimeBased();
        }
        return mVar != null && mVar.c(this);
    }

    public int e0() {
        return this.f340209b.l0();
    }

    public h e1(int i10) {
        return a1(this.f340209b.U0(i10), this.f340210c);
    }

    @Override // org.threeten.bp.chrono.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f340209b.equals(hVar.f340209b) && this.f340210c.equals(hVar.f340210c)) {
                return true;
            }
        }
        return false;
    }

    public d f0() {
        return this.f340209b.m0();
    }

    public h f1(int i10) {
        return a1(this.f340209b, this.f340210c.y0(i10));
    }

    public int g0() {
        return this.f340209b.n0();
    }

    public h g1(int i10) {
        return a1(this.f340209b, this.f340210c.z0(i10));
    }

    public int h0() {
        return this.f340210c.L();
    }

    public h h1(int i10) {
        return a1(this.f340209b.V0(i10), this.f340210c);
    }

    @Override // org.threeten.bp.chrono.d
    public int hashCode() {
        return this.f340210c.hashCode() ^ this.f340209b.hashCode();
    }

    public int i0() {
        return this.f340210c.M();
    }

    public h i1(int i10) {
        return a1(this.f340209b, this.f340210c.A0(i10));
    }

    public j j0() {
        return this.f340209b.o0();
    }

    public h j1(int i10) {
        return a1(this.f340209b, this.f340210c.B0(i10));
    }

    @Override // org.threeten.bp.temporal.e
    public long k(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        h hVarD0 = d0(eVar);
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return mVar.d(this, hVarD0);
        }
        org.threeten.bp.temporal.b bVar = (org.threeten.bp.temporal.b) mVar;
        if (!bVar.isTimeBased()) {
            g gVarK0 = hVarD0.f340209b;
            if (gVarK0.I(this.f340209b) && hVarD0.f340210c.T(this.f340210c)) {
                gVarK0 = gVarK0.u0(1L);
            } else if (gVarK0.L(this.f340209b) && hVarD0.f340210c.S(this.f340210c)) {
                gVarK0 = gVarK0.K0(1L);
            }
            return this.f340209b.k(gVarK0, mVar);
        }
        long jH0 = this.f340209b.h0(hVarD0.f340209b);
        long jT0 = hVarD0.f340210c.t0() - this.f340210c.t0();
        if (jH0 > 0 && jT0 < 0) {
            jH0--;
            jT0 += 86400000000000L;
        } else if (jH0 < 0 && jT0 > 0) {
            jH0++;
            jT0 -= 86400000000000L;
        }
        switch (b.f340211a[bVar.ordinal()]) {
            case 1:
                return cn.d.l(cn.d.o(jH0, 86400000000000L), jT0);
            case 2:
                return cn.d.l(cn.d.o(jH0, 86400000000L), jT0 / 1000);
            case 3:
                return cn.d.l(cn.d.o(jH0, 86400000L), jT0 / 1000000);
            case 4:
                return cn.d.l(cn.d.n(jH0, 86400), jT0 / 1000000000);
            case 5:
                return cn.d.l(cn.d.n(jH0, 1440), jT0 / 60000000000L);
            case 6:
                return cn.d.l(cn.d.n(jH0, 24), jT0 / 3600000000000L);
            case 7:
                return cn.d.l(cn.d.n(jH0, 2), jT0 / 43200000000000L);
            default:
                throw new org.threeten.bp.temporal.n("Unsupported unit: " + mVar);
        }
    }

    public int k0() {
        return this.f340209b.p0();
    }

    public h k1(int i10) {
        return a1(this.f340209b.W0(i10), this.f340210c);
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public int l(org.threeten.bp.temporal.j jVar) {
        if (jVar instanceof org.threeten.bp.temporal.a) {
            return jVar.isTimeBased() ? this.f340210c.l(jVar) : this.f340209b.l(jVar);
        }
        return super.l(jVar);
    }

    public int l0() {
        return this.f340210c.N();
    }

    void l1(DataOutput dataOutput) throws IOException {
        this.f340209b.X0(dataOutput);
        this.f340210c.C0(dataOutput);
    }

    public int m0() {
        return this.f340210c.O();
    }

    public int n0() {
        return this.f340209b.r0();
    }

    @Override // org.threeten.bp.chrono.d, cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public h f(long j10, org.threeten.bp.temporal.m mVar) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = v(Long.MAX_VALUE, mVar);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.v(j11, mVar);
    }

    @Override // org.threeten.bp.chrono.d, cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public h p(org.threeten.bp.temporal.i iVar) {
        return (h) iVar.b(this);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean q(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar != null && jVar.c(this);
        }
        if (!jVar.isDateBased() && !jVar.isTimeBased()) {
            return false;
        }
        return true;
    }

    public h q0(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = O0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.O0(j11);
    }

    public h r0(long j10) {
        return V0(this.f340209b, j10, 0L, 0L, 0L, -1);
    }

    public h s0(long j10) {
        return V0(this.f340209b, 0L, j10, 0L, 0L, -1);
    }

    @Override // org.threeten.bp.temporal.f
    public long t(org.threeten.bp.temporal.j jVar) {
        if (jVar instanceof org.threeten.bp.temporal.a) {
            return jVar.isTimeBased() ? this.f340210c.t(jVar) : this.f340209b.t(jVar);
        }
        return jVar.e(this);
    }

    public h t0(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = R0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.R0(j11);
    }

    @Override // org.threeten.bp.chrono.d
    public String toString() {
        return this.f340209b.toString() + org.locationtech.jts.geom.l.f338158h + this.f340210c.toString();
    }

    public h u0(long j10) {
        return V0(this.f340209b, 0L, 0L, 0L, j10, -1);
    }

    public h v0(long j10) {
        return V0(this.f340209b, 0L, 0L, j10, 0L, -1);
    }

    public h w0(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = U0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.U0(j11);
    }

    @Override // org.threeten.bp.chrono.d, java.lang.Comparable
    /* JADX INFO: renamed from: x */
    public int compareTo(org.threeten.bp.chrono.d<?> dVar) {
        return dVar instanceof h ? c0((h) dVar) : super.compareTo(dVar);
    }

    public h x0(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = W0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.W0(j11);
    }

    @Override // org.threeten.bp.chrono.d
    public String z(org.threeten.bp.format.c cVar) {
        return super.z(cVar);
    }
}
