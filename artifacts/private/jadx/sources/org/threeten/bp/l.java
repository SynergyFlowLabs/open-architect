package org.threeten.bp;

import androidx.constraintlayout.core.motion.utils.v;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes14.dex */
public final class l extends cn.b implements org.threeten.bp.temporal.e, org.threeten.bp.temporal.g, Comparable<l>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f340256c = h.f340205d.Z(s.f340322s);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f340257d = h.f340206e.Z(s.f340321o);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<l> f340258e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Comparator<l> f340259f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f340260g = 2287754244819255394L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f340261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f340262b;

    class a implements org.threeten.bp.temporal.l<l> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a(org.threeten.bp.temporal.f fVar) {
            return l.E(fVar);
        }
    }

    class b implements Comparator<l> {
        b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(l lVar, l lVar2) {
            int iB = cn.d.b(lVar.toEpochSecond(), lVar2.toEpochSecond());
            return iB == 0 ? cn.d.b(lVar.T(), lVar2.T()) : iB;
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f340263a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.a.values().length];
            f340263a = iArr;
            try {
                iArr[org.threeten.bp.temporal.a.f340344m3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f340263a[org.threeten.bp.temporal.a.f340346n3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private l(h hVar, s sVar) {
        this.f340261a = (h) cn.d.j(hVar, "dateTime");
        this.f340262b = (s) cn.d.j(sVar, v.c.R);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [org.threeten.bp.l] */
    public static l E(org.threeten.bp.temporal.f fVar) {
        if (fVar instanceof l) {
            return (l) fVar;
        }
        try {
            s sVarR = s.R(fVar);
            try {
                fVar = q0(h.d0(fVar), sVarR);
                return fVar;
            } catch (org.threeten.bp.b unused) {
                return r0(f.E(fVar), sVarR);
            }
        } catch (org.threeten.bp.b unused2) {
            throw new org.threeten.bp.b("Unable to obtain OffsetDateTime from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName());
        }
    }

    static l E0(DataInput dataInput) throws IOException {
        return q0(h.X0(dataInput), s.Z(dataInput));
    }

    private l M0(h hVar, s sVar) {
        return (this.f340261a == hVar && this.f340262b.equals(sVar)) ? this : new l(hVar, sVar);
    }

    public static l l0() {
        return m0(org.threeten.bp.a.g());
    }

    public static l m0(org.threeten.bp.a aVar) {
        cn.d.j(aVar, "clock");
        f fVarC = aVar.c();
        return r0(fVarC, aVar.b().z().b(fVarC));
    }

    public static l n0(r rVar) {
        return m0(org.threeten.bp.a.f(rVar));
    }

    public static l o0(int i10, int i11, int i12, int i13, int i14, int i15, int i16, s sVar) {
        return new l(h.D0(i10, i11, i12, i13, i14, i15, i16), sVar);
    }

    public static l p0(g gVar, i iVar, s sVar) {
        return new l(h.H0(gVar, iVar), sVar);
    }

    public static l q0(h hVar, s sVar) {
        return new l(hVar, sVar);
    }

    public static l r0(f fVar, r rVar) {
        cn.d.j(fVar, "instant");
        cn.d.j(rVar, "zone");
        s sVarB = rVar.z().b(fVar);
        return new l(h.I0(fVar.H(), fVar.I(), sVarB), sVarB);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static l s0(CharSequence charSequence) {
        return t0(charSequence, org.threeten.bp.format.c.f340049o);
    }

    public static l t0(CharSequence charSequence, org.threeten.bp.format.c cVar) {
        cn.d.j(cVar, "formatter");
        return (l) cVar.r(charSequence, f340258e);
    }

    public static Comparator<l> timeLineOrder() {
        return f340259f;
    }

    private Object writeReplace() {
        return new o((byte) 69, this);
    }

    public l A0(long j10) {
        return M0(this.f340261a.S0(j10), this.f340262b);
    }

    public l B0(long j10) {
        return M0(this.f340261a.T0(j10), this.f340262b);
    }

    public l C0(long j10) {
        return M0(this.f340261a.U0(j10), this.f340262b);
    }

    public String D(org.threeten.bp.format.c cVar) {
        cn.d.j(cVar, "formatter");
        return cVar.d(this);
    }

    public l D0(long j10) {
        return M0(this.f340261a.W0(j10), this.f340262b);
    }

    public f F0() {
        return this.f340261a.U(this.f340262b);
    }

    public g G0() {
        return this.f340261a.V();
    }

    public int H() {
        return this.f340261a.e0();
    }

    public h H0() {
        return this.f340261a;
    }

    public d I() {
        return this.f340261a.f0();
    }

    public i I0() {
        return this.f340261a.W();
    }

    public m J0() {
        return m.e0(this.f340261a.W(), this.f340262b);
    }

    public u K0() {
        return u.G0(this.f340261a, this.f340262b);
    }

    public int L() {
        return this.f340261a.g0();
    }

    public l L0(org.threeten.bp.temporal.m mVar) {
        return M0(this.f340261a.Z0(mVar), this.f340262b);
    }

    public int M() {
        return this.f340261a.h0();
    }

    public int N() {
        return this.f340261a.i0();
    }

    @Override // cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public l s(org.threeten.bp.temporal.g gVar) {
        if ((gVar instanceof g) || (gVar instanceof i) || (gVar instanceof h)) {
            return M0(this.f340261a.s(gVar), this.f340262b);
        }
        if (gVar instanceof f) {
            return r0((f) gVar, this.f340262b);
        }
        if (gVar instanceof s) {
            return M0(this.f340261a, (s) gVar);
        }
        return gVar instanceof l ? (l) gVar : (l) gVar.b(this);
    }

    public j O() {
        return this.f340261a.j0();
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public l o(org.threeten.bp.temporal.j jVar, long j10) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return (l) jVar.b(this, j10);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        int i10 = c.f340263a[aVar.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? M0(this.f340261a.o(jVar, j10), this.f340262b) : M0(this.f340261a, s.X(aVar.k(j10)));
        }
        return r0(f.a0(j10, T()), this.f340262b);
    }

    public l P0(int i10) {
        return M0(this.f340261a.d1(i10), this.f340262b);
    }

    public l Q0(int i10) {
        return M0(this.f340261a.e1(i10), this.f340262b);
    }

    public l R0(int i10) {
        return M0(this.f340261a.f1(i10), this.f340262b);
    }

    public int S() {
        return this.f340261a.k0();
    }

    public l S0(int i10) {
        return M0(this.f340261a.g1(i10), this.f340262b);
    }

    public int T() {
        return this.f340261a.l0();
    }

    public l T0(int i10) {
        return M0(this.f340261a.h1(i10), this.f340262b);
    }

    public s U() {
        return this.f340262b;
    }

    public l U0(int i10) {
        return M0(this.f340261a.i1(i10), this.f340262b);
    }

    public int V() {
        return this.f340261a.m0();
    }

    public l V0(s sVar) {
        if (sVar.equals(this.f340262b)) {
            return this;
        }
        return new l(this.f340261a.T0(sVar.S() - this.f340262b.S()), sVar);
    }

    public int W() {
        return this.f340261a.n0();
    }

    public l W0(s sVar) {
        return M0(this.f340261a, sVar);
    }

    public boolean X(l lVar) {
        long epochSecond = toEpochSecond();
        long epochSecond2 = lVar.toEpochSecond();
        if (epochSecond <= epochSecond2) {
            return epochSecond == epochSecond2 && I0().N() > lVar.I0().N();
        }
        return true;
    }

    public l X0(int i10) {
        return M0(this.f340261a.j1(i10), this.f340262b);
    }

    public boolean Y(l lVar) {
        long epochSecond = toEpochSecond();
        long epochSecond2 = lVar.toEpochSecond();
        if (epochSecond >= epochSecond2 && (epochSecond != epochSecond2 || I0().N() >= lVar.I0().N())) {
            return false;
        }
        return true;
    }

    public l Y0(int i10) {
        return M0(this.f340261a.k1(i10), this.f340262b);
    }

    public boolean Z(l lVar) {
        return toEpochSecond() == lVar.toEpochSecond() && I0().N() == lVar.I0().N();
    }

    void Z0(DataOutput dataOutput) throws IOException {
        this.f340261a.l1(dataOutput);
        this.f340262b.d0(dataOutput);
    }

    @Override // cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public l f(long j10, org.threeten.bp.temporal.m mVar) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = v(Long.MAX_VALUE, mVar);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.v(j11, mVar);
    }

    @Override // org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e b(org.threeten.bp.temporal.e eVar) {
        return eVar.o(org.threeten.bp.temporal.a.H1, G0().toEpochDay()).o(org.threeten.bp.temporal.a.f340330f, I0().t0()).o(org.threeten.bp.temporal.a.f340346n3, U().S());
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.o c(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.d(this);
        }
        if (jVar != org.threeten.bp.temporal.a.f340344m3 && jVar != org.threeten.bp.temporal.a.f340346n3) {
            return this.f340261a.c(jVar);
        }
        return jVar.range();
    }

    @Override // cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public l p(org.threeten.bp.temporal.i iVar) {
        return (l) iVar.b(this);
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public <R> R d(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.a()) {
            return (R) org.threeten.bp.chrono.o.f339936e;
        }
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return (R) org.threeten.bp.temporal.b.NANOS;
        }
        if (lVar != org.threeten.bp.temporal.k.d() && lVar != org.threeten.bp.temporal.k.f()) {
            if (lVar == org.threeten.bp.temporal.k.b()) {
                return (R) G0();
            }
            if (lVar == org.threeten.bp.temporal.k.c()) {
                return (R) I0();
            }
            if (lVar == org.threeten.bp.temporal.k.g()) {
                return null;
            }
            return (R) super.d(lVar);
        }
        return (R) U();
    }

    public l d0(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = w0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.w0(j11);
    }

    @Override // org.threeten.bp.temporal.e
    public boolean e(org.threeten.bp.temporal.m mVar) {
        if (mVar instanceof org.threeten.bp.temporal.b) {
            return mVar.isDateBased() || mVar.isTimeBased();
        }
        return mVar != null && mVar.c(this);
    }

    public l e0(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = x0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.x0(j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f340261a.equals(lVar.f340261a) && this.f340262b.equals(lVar.f340262b)) {
                return true;
            }
        }
        return false;
    }

    public l f0(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = y0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.y0(j11);
    }

    public l g0(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = z0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.z0(j11);
    }

    public l h0(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = A0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.A0(j11);
    }

    public int hashCode() {
        return this.f340262b.hashCode() ^ this.f340261a.hashCode();
    }

    public l i0(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = B0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.B0(j11);
    }

    public l j0(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = C0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.C0(j11);
    }

    @Override // org.threeten.bp.temporal.e
    public long k(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        l lVarE = E(eVar);
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return mVar.d(this, lVarE);
        }
        return this.f340261a.k(lVarE.V0(this.f340262b).f340261a, mVar);
    }

    public l k0(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = D0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.D0(j11);
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public int l(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return super.l(jVar);
        }
        int i10 = c.f340263a[((org.threeten.bp.temporal.a) jVar).ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? this.f340261a.l(jVar) : U().S();
        }
        throw new org.threeten.bp.b("Field too large for an int: " + jVar);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean q(org.threeten.bp.temporal.j jVar) {
        if (jVar instanceof org.threeten.bp.temporal.a) {
            return true;
        }
        return jVar != null && jVar.c(this);
    }

    @Override // org.threeten.bp.temporal.f
    public long t(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.e(this);
        }
        int i10 = c.f340263a[((org.threeten.bp.temporal.a) jVar).ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? this.f340261a.t(jVar) : U().S();
        }
        return toEpochSecond();
    }

    public long toEpochSecond() {
        return this.f340261a.T(this.f340262b);
    }

    public String toString() {
        return this.f340261a.toString() + this.f340262b.toString();
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public l v(long j10, org.threeten.bp.temporal.m mVar) {
        return mVar instanceof org.threeten.bp.temporal.b ? M0(this.f340261a.v(j10, mVar), this.f340262b) : (l) mVar.b(this, j10);
    }

    @Override // cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public l n(org.threeten.bp.temporal.i iVar) {
        return (l) iVar.c(this);
    }

    public u w(r rVar) {
        return u.I0(this.f340261a, this.f340262b, rVar);
    }

    public l w0(long j10) {
        return M0(this.f340261a.O0(j10), this.f340262b);
    }

    public u x(r rVar) {
        return u.K0(this.f340261a, rVar, this.f340262b);
    }

    public l x0(long j10) {
        return M0(this.f340261a.P0(j10), this.f340262b);
    }

    public l y0(long j10) {
        return M0(this.f340261a.Q0(j10), this.f340262b);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public int compareTo(l lVar) {
        if (U().equals(lVar.U())) {
            return H0().compareTo(lVar.H0());
        }
        int iB = cn.d.b(toEpochSecond(), lVar.toEpochSecond());
        return (iB == 0 && (iB = I0().N() - lVar.I0().N()) == 0) ? H0().compareTo(lVar.H0()) : iB;
    }

    public l z0(long j10) {
        return M0(this.f340261a.R0(j10), this.f340262b);
    }
}
