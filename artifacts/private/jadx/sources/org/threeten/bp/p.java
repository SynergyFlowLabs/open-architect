package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class p extends cn.c implements org.threeten.bp.temporal.e, org.threeten.bp.temporal.g, Comparable<p>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f340293b = -999999999;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f340294c = 999999999;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f340296e = -23038383694477807L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f340298a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<p> f340295d = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final org.threeten.bp.format.c f340297f = new org.threeten.bp.format.d().v(org.threeten.bp.temporal.a.f340340k3, 4, 10, org.threeten.bp.format.l.EXCEEDS_PAD).P();

    class a implements org.threeten.bp.temporal.l<p> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p a(org.threeten.bp.temporal.f fVar) {
            return p.I(fVar);
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f340299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f340300b;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.b.values().length];
            f340300b = iArr;
            try {
                iArr[org.threeten.bp.temporal.b.YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f340300b[org.threeten.bp.temporal.b.DECADES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f340300b[org.threeten.bp.temporal.b.CENTURIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f340300b[org.threeten.bp.temporal.b.MILLENNIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f340300b[org.threeten.bp.temporal.b.ERAS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[org.threeten.bp.temporal.a.values().length];
            f340299a = iArr2;
            try {
                iArr2[org.threeten.bp.temporal.a.f340338j3.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f340299a[org.threeten.bp.temporal.a.f340340k3.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f340299a[org.threeten.bp.temporal.a.f340342l3.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private p(int i10) {
        this.f340298a = i10;
    }

    public static p I(org.threeten.bp.temporal.f fVar) {
        if (fVar instanceof p) {
            return (p) fVar;
        }
        try {
            if (!org.threeten.bp.chrono.o.f339936e.equals(org.threeten.bp.chrono.j.v(fVar))) {
                fVar = g.i0(fVar);
            }
            return a0(fVar.l(org.threeten.bp.temporal.a.f340340k3));
        } catch (org.threeten.bp.b unused) {
            throw new org.threeten.bp.b("Unable to obtain Year from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName());
        }
    }

    public static boolean O(long j10) {
        if ((3 & j10) == 0) {
            return j10 % 100 != 0 || j10 % 400 == 0;
        }
        return false;
    }

    public static p X() {
        return Y(org.threeten.bp.a.g());
    }

    public static p Y(org.threeten.bp.a aVar) {
        return a0(g.A0(aVar).r0());
    }

    public static p Z(r rVar) {
        return Y(org.threeten.bp.a.f(rVar));
    }

    public static p a0(int i10) {
        org.threeten.bp.temporal.a.f340340k3.l(i10);
        return new p(i10);
    }

    public static p c0(CharSequence charSequence) {
        return d0(charSequence, f340297f);
    }

    public static p d0(CharSequence charSequence, org.threeten.bp.format.c cVar) {
        cn.d.j(cVar, "formatter");
        return (p) cVar.r(charSequence, f340295d);
    }

    static p h0(DataInput dataInput) throws IOException {
        return a0(dataInput.readInt());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 67, this);
    }

    public g D(k kVar) {
        return kVar.w(this.f340298a);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public int compareTo(p pVar) {
        return this.f340298a - pVar.f340298a;
    }

    public String H(org.threeten.bp.format.c cVar) {
        cn.d.j(cVar, "formatter");
        return cVar.d(this);
    }

    public boolean L(p pVar) {
        if (this.f340298a <= pVar.f340298a) {
            return false;
        }
        int i10 = 3 << 1;
        return true;
    }

    public boolean M(p pVar) {
        return this.f340298a < pVar.f340298a;
    }

    public boolean N() {
        return O(this.f340298a);
    }

    public boolean S(k kVar) {
        return kVar != null && kVar.N(this.f340298a);
    }

    public int T() {
        return N() ? 366 : 365;
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public p f(long j10, org.threeten.bp.temporal.m mVar) {
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
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public p p(org.threeten.bp.temporal.i iVar) {
        return (p) iVar.b(this);
    }

    public p W(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = g0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.g0(j11);
    }

    @Override // org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e b(org.threeten.bp.temporal.e eVar) {
        if (org.threeten.bp.chrono.j.v(eVar).equals(org.threeten.bp.chrono.o.f339936e)) {
            return eVar.o(org.threeten.bp.temporal.a.f340340k3, this.f340298a);
        }
        throw new org.threeten.bp.b("Adjustment only supported on ISO date-time");
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.o c(org.threeten.bp.temporal.j jVar) {
        if (jVar == org.threeten.bp.temporal.a.f340338j3) {
            return org.threeten.bp.temporal.o.k(1L, this.f340298a <= 0 ? 1000000000L : 999999999L);
        }
        return super.c(jVar);
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public <R> R d(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.a()) {
            return (R) org.threeten.bp.chrono.o.f339936e;
        }
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return (R) org.threeten.bp.temporal.b.YEARS;
        }
        if (lVar == org.threeten.bp.temporal.k.b() || lVar == org.threeten.bp.temporal.k.c() || lVar == org.threeten.bp.temporal.k.f() || lVar == org.threeten.bp.temporal.k.g() || lVar == org.threeten.bp.temporal.k.d()) {
            return null;
        }
        return (R) super.d(lVar);
    }

    @Override // org.threeten.bp.temporal.e
    public boolean e(org.threeten.bp.temporal.m mVar) {
        if (mVar instanceof org.threeten.bp.temporal.b) {
            return mVar == org.threeten.bp.temporal.b.YEARS || mVar == org.threeten.bp.temporal.b.DECADES || mVar == org.threeten.bp.temporal.b.CENTURIES || mVar == org.threeten.bp.temporal.b.MILLENNIA || mVar == org.threeten.bp.temporal.b.ERAS;
        }
        return mVar != null && mVar.c(this);
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public p v(long j10, org.threeten.bp.temporal.m mVar) {
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return (p) mVar.b(this, j10);
        }
        int i10 = b.f340300b[((org.threeten.bp.temporal.b) mVar).ordinal()];
        if (i10 == 1) {
            return g0(j10);
        }
        if (i10 == 2) {
            return g0(cn.d.n(j10, 10));
        }
        if (i10 == 3) {
            return g0(cn.d.n(j10, 100));
        }
        if (i10 == 4) {
            return g0(cn.d.n(j10, 1000));
        }
        if (i10 == 5) {
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340342l3;
            return o(aVar, cn.d.l(t(aVar), j10));
        }
        throw new org.threeten.bp.temporal.n("Unsupported unit: " + mVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f340298a == ((p) obj).f340298a;
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public p n(org.threeten.bp.temporal.i iVar) {
        return (p) iVar.c(this);
    }

    public p g0(long j10) {
        return j10 == 0 ? this : a0(org.threeten.bp.temporal.a.f340340k3.k(((long) this.f340298a) + j10));
    }

    public int getValue() {
        return this.f340298a;
    }

    public int hashCode() {
        return this.f340298a;
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public p s(org.threeten.bp.temporal.g gVar) {
        return (p) gVar.b(this);
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public p o(org.threeten.bp.temporal.j jVar, long j10) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return (p) jVar.b(this, j10);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        aVar.l(j10);
        int i10 = b.f340299a[aVar.ordinal()];
        if (i10 == 1) {
            if (this.f340298a < 1) {
                j10 = 1 - j10;
            }
            return a0((int) j10);
        }
        if (i10 == 2) {
            return a0((int) j10);
        }
        if (i10 == 3) {
            return t(org.threeten.bp.temporal.a.f340342l3) == j10 ? this : a0(1 - this.f340298a);
        }
        throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
    }

    @Override // org.threeten.bp.temporal.e
    public long k(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        p pVarI = I(eVar);
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return mVar.d(this, pVarI);
        }
        long j10 = ((long) pVarI.f340298a) - ((long) this.f340298a);
        int i10 = b.f340300b[((org.threeten.bp.temporal.b) mVar).ordinal()];
        if (i10 == 1) {
            return j10;
        }
        if (i10 == 2) {
            return j10 / 10;
        }
        if (i10 == 3) {
            return j10 / 100;
        }
        if (i10 == 4) {
            return j10 / 1000;
        }
        if (i10 == 5) {
            org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340342l3;
            return pVarI.t(aVar) - t(aVar);
        }
        throw new org.threeten.bp.temporal.n("Unsupported unit: " + mVar);
    }

    void k0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.f340298a);
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public int l(org.threeten.bp.temporal.j jVar) {
        return c(jVar).a(t(jVar), jVar);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean q(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar != null && jVar.c(this);
        }
        if (jVar != org.threeten.bp.temporal.a.f340340k3 && jVar != org.threeten.bp.temporal.a.f340338j3 && jVar != org.threeten.bp.temporal.a.f340342l3) {
            return false;
        }
        return true;
    }

    @Override // org.threeten.bp.temporal.f
    public long t(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.e(this);
        }
        int i10 = b.f340299a[((org.threeten.bp.temporal.a) jVar).ordinal()];
        if (i10 == 1) {
            int i11 = this.f340298a;
            if (i11 < 1) {
                i11 = 1 - i11;
            }
            return i11;
        }
        if (i10 == 2) {
            return this.f340298a;
        }
        if (i10 == 3) {
            return this.f340298a < 1 ? 0 : 1;
        }
        throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
    }

    public String toString() {
        return Integer.toString(this.f340298a);
    }

    public g w(int i10) {
        return g.F0(this.f340298a, i10);
    }

    public q x(int i10) {
        return q.a0(this.f340298a, i10);
    }

    public q z(j jVar) {
        return q.c0(this.f340298a, jVar);
    }
}
