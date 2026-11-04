package org.threeten.bp;

import androidx.constraintlayout.core.motion.utils.v;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public final class u extends org.threeten.bp.chrono.h<g> implements org.threeten.bp.temporal.e, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<u> f340454e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f340455f = -6260982410461394882L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f340456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f340457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f340458d;

    class a implements org.threeten.bp.temporal.l<u> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public u a(org.threeten.bp.temporal.f fVar) {
            return u.g0(fVar);
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f340459a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.a.values().length];
            f340459a = iArr;
            try {
                iArr[org.threeten.bp.temporal.a.f340344m3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f340459a[org.threeten.bp.temporal.a.f340346n3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private u(h hVar, s sVar, r rVar) {
        this.f340456b = hVar;
        this.f340457c = sVar;
        this.f340458d = rVar;
    }

    public static u B0() {
        return C0(org.threeten.bp.a.g());
    }

    public static u C0(org.threeten.bp.a aVar) {
        cn.d.j(aVar, "clock");
        return H0(aVar.c(), aVar.b());
    }

    public static u D0(r rVar) {
        return C0(org.threeten.bp.a.f(rVar));
    }

    public static u E0(int i10, int i11, int i12, int i13, int i14, int i15, int i16, r rVar) {
        return K0(h.D0(i10, i11, i12, i13, i14, i15, i16), rVar, null);
    }

    public static u F0(g gVar, i iVar, r rVar) {
        return G0(h.H0(gVar, iVar), rVar);
    }

    public static u G0(h hVar, r rVar) {
        return K0(hVar, rVar, null);
    }

    public static u H0(f fVar, r rVar) {
        cn.d.j(fVar, "instant");
        cn.d.j(rVar, "zone");
        return f0(fVar.H(), fVar.I(), rVar);
    }

    public static u I0(h hVar, s sVar, r rVar) {
        cn.d.j(hVar, "localDateTime");
        cn.d.j(sVar, v.c.R);
        cn.d.j(rVar, "zone");
        return f0(hVar.T(sVar), hVar.l0(), rVar);
    }

    private static u J0(h hVar, s sVar, r rVar) {
        cn.d.j(hVar, "localDateTime");
        cn.d.j(sVar, v.c.R);
        cn.d.j(rVar, "zone");
        if ((rVar instanceof s) && !sVar.equals(rVar)) {
            throw new IllegalArgumentException("ZoneId must match ZoneOffset");
        }
        return new u(hVar, sVar, rVar);
    }

    public static u K0(h hVar, r rVar, s sVar) {
        cn.d.j(hVar, "localDateTime");
        cn.d.j(rVar, "zone");
        if (rVar instanceof s) {
            return new u(hVar, (s) rVar, rVar);
        }
        org.threeten.bp.zone.g gVarZ = rVar.z();
        List<s> listH = gVarZ.h(hVar);
        if (listH.size() == 1) {
            sVar = listH.get(0);
        } else if (listH.size() == 0) {
            org.threeten.bp.zone.e eVarE = gVarZ.e(hVar);
            hVar = hVar.T0(eVarE.n().v());
            sVar = eVarE.q();
        } else if (sVar == null || !listH.contains(sVar)) {
            sVar = (s) cn.d.j(listH.get(0), v.c.R);
        }
        return new u(hVar, sVar, rVar);
    }

    public static u L0(h hVar, s sVar, r rVar) {
        cn.d.j(hVar, "localDateTime");
        cn.d.j(sVar, v.c.R);
        cn.d.j(rVar, "zone");
        org.threeten.bp.zone.g gVarZ = rVar.z();
        if (gVarZ.k(hVar, sVar)) {
            return new u(hVar, sVar, rVar);
        }
        org.threeten.bp.zone.e eVarE = gVarZ.e(hVar);
        if (eVarE != null && eVarE.t()) {
            throw new org.threeten.bp.b("LocalDateTime '" + hVar + "' does not exist in zone '" + rVar + "' due to a gap in the local time-line, typically caused by daylight savings");
        }
        throw new org.threeten.bp.b("ZoneOffset '" + sVar + "' is not valid for LocalDateTime '" + hVar + "' in zone '" + rVar + "'");
    }

    public static u M0(CharSequence charSequence) {
        return N0(charSequence, org.threeten.bp.format.c.f340050p);
    }

    public static u N0(CharSequence charSequence, org.threeten.bp.format.c cVar) {
        cn.d.j(cVar, "formatter");
        return (u) cVar.r(charSequence, f340454e);
    }

    static u Y0(DataInput dataInput) throws IOException {
        return J0(h.X0(dataInput), s.Z(dataInput), (r) o.a(dataInput));
    }

    private u Z0(h hVar) {
        return I0(hVar, this.f340457c, this.f340458d);
    }

    private u a1(h hVar) {
        return K0(hVar, this.f340458d, this.f340457c);
    }

    private u b1(s sVar) {
        return (sVar.equals(this.f340457c) || !this.f340458d.z().k(this.f340456b, sVar)) ? this : new u(this.f340456b, sVar, this.f340458d);
    }

    private static u f0(long j10, int i10, r rVar) {
        s sVarB = rVar.z().b(f.a0(j10, i10));
        return new u(h.I0(j10, i10, sVarB), sVarB, rVar);
    }

    public static u g0(org.threeten.bp.temporal.f fVar) {
        if (fVar instanceof u) {
            return (u) fVar;
        }
        try {
            r rVarW = r.w(fVar);
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340344m3;
            if (fVar.q(aVar)) {
                try {
                    return f0(fVar.t(aVar), fVar.l(org.threeten.bp.temporal.a.f340329e), rVarW);
                } catch (org.threeten.bp.b unused) {
                }
            }
            return G0(h.d0(fVar), rVarW);
        } catch (org.threeten.bp.b unused2) {
            throw new org.threeten.bp.b("Unable to obtain ZonedDateTime from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName());
        }
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 6, this);
    }

    public u A0(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = X0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.X0(j11);
    }

    @Override // org.threeten.bp.chrono.h
    public s E() {
        return this.f340457c;
    }

    @Override // org.threeten.bp.chrono.h
    public r H() {
        return this.f340458d;
    }

    @Override // org.threeten.bp.chrono.h, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public u v(long j10, org.threeten.bp.temporal.m mVar) {
        if (mVar instanceof org.threeten.bp.temporal.b) {
            return mVar.isDateBased() ? a1(this.f340456b.v(j10, mVar)) : Z0(this.f340456b.v(j10, mVar));
        }
        return (u) mVar.b(this, j10);
    }

    @Override // org.threeten.bp.chrono.h, cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public u n(org.threeten.bp.temporal.i iVar) {
        return (u) iVar.c(this);
    }

    public u Q0(long j10) {
        return a1(this.f340456b.O0(j10));
    }

    public u R0(long j10) {
        return Z0(this.f340456b.P0(j10));
    }

    public u S0(long j10) {
        return Z0(this.f340456b.Q0(j10));
    }

    public u T0(long j10) {
        return a1(this.f340456b.R0(j10));
    }

    public u U0(long j10) {
        return Z0(this.f340456b.S0(j10));
    }

    public u V0(long j10) {
        return Z0(this.f340456b.T0(j10));
    }

    public u W0(long j10) {
        return a1(this.f340456b.U0(j10));
    }

    @Override // org.threeten.bp.chrono.h
    public i X() {
        return this.f340456b.W();
    }

    public u X0(long j10) {
        return a1(this.f340456b.W0(j10));
    }

    @Override // org.threeten.bp.chrono.h, cn.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.o c(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.d(this);
        }
        if (jVar != org.threeten.bp.temporal.a.f340344m3 && jVar != org.threeten.bp.temporal.a.f340346n3) {
            return this.f340456b.c(jVar);
        }
        return jVar.range();
    }

    @Override // org.threeten.bp.chrono.h
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public g V() {
        return this.f340456b.V();
    }

    @Override // org.threeten.bp.chrono.h, cn.c, org.threeten.bp.temporal.f
    public <R> R d(org.threeten.bp.temporal.l<R> lVar) {
        return lVar == org.threeten.bp.temporal.k.b() ? (R) V() : (R) super.d(lVar);
    }

    @Override // org.threeten.bp.chrono.h
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public h W() {
        return this.f340456b;
    }

    @Override // org.threeten.bp.temporal.e
    public boolean e(org.threeten.bp.temporal.m mVar) {
        if (mVar instanceof org.threeten.bp.temporal.b) {
            return mVar.isDateBased() || mVar.isTimeBased();
        }
        return mVar != null && mVar.c(this);
    }

    public l e1() {
        return l.q0(this.f340456b, this.f340457c);
    }

    @Override // org.threeten.bp.chrono.h
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f340456b.equals(uVar.f340456b) && this.f340457c.equals(uVar.f340457c) && this.f340458d.equals(uVar.f340458d)) {
                return true;
            }
        }
        return false;
    }

    public u f1(org.threeten.bp.temporal.m mVar) {
        return a1(this.f340456b.Z0(mVar));
    }

    @Override // org.threeten.bp.chrono.h, cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public u s(org.threeten.bp.temporal.g gVar) {
        if (gVar instanceof g) {
            return a1(h.H0((g) gVar, this.f340456b.W()));
        }
        if (gVar instanceof i) {
            return a1(h.H0(this.f340456b.V(), (i) gVar));
        }
        if (gVar instanceof h) {
            return a1((h) gVar);
        }
        if (!(gVar instanceof f)) {
            return gVar instanceof s ? b1((s) gVar) : (u) gVar.b(this);
        }
        f fVar = (f) gVar;
        return f0(fVar.H(), fVar.I(), this.f340458d);
    }

    public int h0() {
        return this.f340456b.e0();
    }

    @Override // org.threeten.bp.chrono.h, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public u o(org.threeten.bp.temporal.j jVar, long j10) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return (u) jVar.b(this, j10);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        int i10 = b.f340459a[aVar.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? a1(this.f340456b.o(jVar, j10)) : b1(s.X(aVar.k(j10)));
        }
        return f0(j10, o0(), this.f340458d);
    }

    @Override // org.threeten.bp.chrono.h
    public int hashCode() {
        return Integer.rotateLeft(this.f340458d.hashCode(), 3) ^ (this.f340456b.hashCode() ^ this.f340457c.hashCode());
    }

    public d i0() {
        return this.f340456b.f0();
    }

    public u i1(int i10) {
        return a1(this.f340456b.d1(i10));
    }

    public int j0() {
        return this.f340456b.g0();
    }

    public u j1(int i10) {
        return a1(this.f340456b.e1(i10));
    }

    @Override // org.threeten.bp.temporal.e
    public long k(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        u uVarG0 = g0(eVar);
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return mVar.d(this, uVarG0);
        }
        u uVarD0 = uVarG0.d0(this.f340458d);
        return mVar.isDateBased() ? this.f340456b.k(uVarD0.f340456b, mVar) : e1().k(uVarD0.e1(), mVar);
    }

    public int k0() {
        return this.f340456b.h0();
    }

    @Override // org.threeten.bp.chrono.h
    /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
    public u a0() {
        org.threeten.bp.zone.e eVarE = H().z().e(this.f340456b);
        if (eVarE != null && eVarE.v()) {
            s sVarR = eVarE.r();
            if (!sVarR.equals(this.f340457c)) {
                return new u(this.f340456b, sVarR, this.f340458d);
            }
        }
        return this;
    }

    @Override // org.threeten.bp.chrono.h, cn.c, org.threeten.bp.temporal.f
    public int l(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return super.l(jVar);
        }
        int i10 = b.f340459a[((org.threeten.bp.temporal.a) jVar).ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? this.f340456b.l(jVar) : E().S();
        }
        throw new org.threeten.bp.b("Field too large for an int: " + jVar);
    }

    public int l0() {
        return this.f340456b.i0();
    }

    public u l1() {
        if (this.f340458d.equals(this.f340457c)) {
            return this;
        }
        h hVar = this.f340456b;
        s sVar = this.f340457c;
        return new u(hVar, sVar, sVar);
    }

    public j m0() {
        return this.f340456b.j0();
    }

    public u m1(int i10) {
        return a1(this.f340456b.f1(i10));
    }

    public int n0() {
        return this.f340456b.k0();
    }

    @Override // org.threeten.bp.chrono.h
    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public u c0() {
        org.threeten.bp.zone.e eVarE = H().z().e(W());
        if (eVarE != null) {
            s sVarQ = eVarE.q();
            if (!sVarQ.equals(this.f340457c)) {
                return new u(this.f340456b, sVarQ, this.f340458d);
            }
        }
        return this;
    }

    public int o0() {
        return this.f340456b.l0();
    }

    public int p0() {
        return this.f340456b.m0();
    }

    public u p1(int i10) {
        return a1(this.f340456b.g1(i10));
    }

    @Override // org.threeten.bp.temporal.f
    public boolean q(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a) && (jVar == null || !jVar.c(this))) {
            return false;
        }
        return true;
    }

    public int q0() {
        return this.f340456b.n0();
    }

    public u q1(int i10) {
        return a1(this.f340456b.h1(i10));
    }

    @Override // org.threeten.bp.chrono.h, cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public u f(long j10, org.threeten.bp.temporal.m mVar) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = v(Long.MAX_VALUE, mVar);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.v(j11, mVar);
    }

    public u r1(int i10) {
        return a1(this.f340456b.i1(i10));
    }

    @Override // org.threeten.bp.chrono.h, cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public u p(org.threeten.bp.temporal.i iVar) {
        return (u) iVar.b(this);
    }

    public u s1(int i10) {
        return a1(this.f340456b.j1(i10));
    }

    @Override // org.threeten.bp.chrono.h, org.threeten.bp.temporal.f
    public long t(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.e(this);
        }
        int i10 = b.f340459a[((org.threeten.bp.temporal.a) jVar).ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? this.f340456b.t(jVar) : E().S();
        }
        return toEpochSecond();
    }

    public u t0(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = Q0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.Q0(j11);
    }

    public u t1(int i10) {
        return a1(this.f340456b.k1(i10));
    }

    @Override // org.threeten.bp.chrono.h
    public String toString() {
        String str = this.f340456b.toString() + this.f340457c.toString();
        if (this.f340457c == this.f340458d) {
            return str;
        }
        return str + AbstractJsonLexerKt.BEGIN_LIST + this.f340458d.toString() + AbstractJsonLexerKt.END_LIST;
    }

    public u u0(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = R0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.R0(j11);
    }

    @Override // org.threeten.bp.chrono.h
    /* JADX INFO: renamed from: u1, reason: merged with bridge method [inline-methods] */
    public u d0(r rVar) {
        cn.d.j(rVar, "zone");
        return this.f340458d.equals(rVar) ? this : f0(this.f340456b.T(this.f340457c), this.f340456b.l0(), rVar);
    }

    public u v0(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = S0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.S0(j11);
    }

    @Override // org.threeten.bp.chrono.h
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public u e0(r rVar) {
        cn.d.j(rVar, "zone");
        return this.f340458d.equals(rVar) ? this : K0(this.f340456b, rVar, this.f340457c);
    }

    public u w0(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = T0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.T0(j11);
    }

    void w1(DataOutput dataOutput) throws IOException {
        this.f340456b.l1(dataOutput);
        this.f340457c.d0(dataOutput);
        this.f340458d.M(dataOutput);
    }

    @Override // org.threeten.bp.chrono.h
    public String x(org.threeten.bp.format.c cVar) {
        return super.x(cVar);
    }

    public u x0(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = U0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.U0(j11);
    }

    public u y0(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = V0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.V0(j11);
    }

    public u z0(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = W0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.W0(j11);
    }
}
