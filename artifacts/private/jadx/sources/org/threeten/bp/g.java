package org.threeten.bp;

import com.planner5d.library.widget.preloader.shimmer.ShimmerTextView;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class g extends org.threeten.bp.chrono.c implements org.threeten.bp.temporal.e, org.threeten.bp.temporal.g, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f340194e = C0(p.f340293b, 1, 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f340195f = C0(p.f340294c, 12, 31);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<g> f340196g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f340197h = 2942565459149668126L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f340198i = 146097;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final long f340199j = 719528;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f340200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final short f340201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final short f340202d;

    class a implements org.threeten.bp.temporal.l<g> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(org.threeten.bp.temporal.f fVar) {
            return g.i0(fVar);
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f340203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f340204b;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.b.values().length];
            f340204b = iArr;
            try {
                iArr[org.threeten.bp.temporal.b.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f340204b[org.threeten.bp.temporal.b.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f340204b[org.threeten.bp.temporal.b.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f340204b[org.threeten.bp.temporal.b.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f340204b[org.threeten.bp.temporal.b.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f340204b[org.threeten.bp.temporal.b.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f340204b[org.threeten.bp.temporal.b.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f340204b[org.threeten.bp.temporal.b.ERAS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[org.threeten.bp.temporal.a.values().length];
            f340203a = iArr2;
            try {
                iArr2[org.threeten.bp.temporal.a.f340349p0.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f340203a[org.threeten.bp.temporal.a.f340350p1.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f340203a[org.threeten.bp.temporal.a.f340351p2.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f340203a[org.threeten.bp.temporal.a.f340338j3.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f340203a[org.threeten.bp.temporal.a.X.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f340203a[org.threeten.bp.temporal.a.Y.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f340203a[org.threeten.bp.temporal.a.Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f340203a[org.threeten.bp.temporal.a.H1.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f340203a[org.threeten.bp.temporal.a.f340332g3.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f340203a[org.threeten.bp.temporal.a.f340334h3.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f340203a[org.threeten.bp.temporal.a.f340336i3.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f340203a[org.threeten.bp.temporal.a.f340340k3.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f340203a[org.threeten.bp.temporal.a.f340342l3.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    private g(int i10, int i11, int i12) {
        this.f340200b = i10;
        this.f340201c = (short) i11;
        this.f340202d = (short) i12;
    }

    public static g A0(org.threeten.bp.a aVar) {
        cn.d.j(aVar, "clock");
        f fVarC = aVar.c();
        return E0(cn.d.e(fVarC.H() + ((long) aVar.b().z().b(fVarC).S()), 86400L));
    }

    public static g B0(r rVar) {
        return A0(org.threeten.bp.a.f(rVar));
    }

    public static g C0(int i10, int i11, int i12) {
        org.threeten.bp.temporal.a.f340340k3.l(i10);
        org.threeten.bp.temporal.a.f340334h3.l(i11);
        org.threeten.bp.temporal.a.f340349p0.l(i12);
        return g0(i10, j.L(i11), i12);
    }

    public static g D0(int i10, j jVar, int i11) {
        org.threeten.bp.temporal.a.f340340k3.l(i10);
        cn.d.j(jVar, "month");
        org.threeten.bp.temporal.a.f340349p0.l(i11);
        return g0(i10, jVar, i11);
    }

    public static g E0(long j10) {
        long j11;
        org.threeten.bp.temporal.a.H1.l(j10);
        long j12 = 719468 + j10;
        if (j12 < 0) {
            long j13 = ((j10 + 719469) / 146097) - 1;
            j11 = j13 * 400;
            j12 += (-j13) * 146097;
        } else {
            j11 = 0;
        }
        long j14 = ((j12 * 400) + 591) / 146097;
        long j15 = j12 - ((((j14 * 365) + (j14 / 4)) - (j14 / 100)) + (j14 / 400));
        if (j15 < 0) {
            j14--;
            j15 = j12 - ((((365 * j14) + (j14 / 4)) - (j14 / 100)) + (j14 / 400));
        }
        int i10 = (int) j15;
        int i11 = ((i10 * 5) + 2) / 153;
        return new g(org.threeten.bp.temporal.a.f340340k3.k(j14 + j11 + ((long) (i11 / 10))), ((i11 + 2) % 12) + 1, (i10 - (((i11 * 306) + 5) / 10)) + 1);
    }

    public static g F0(int i10, int i11) {
        long j10 = i10;
        org.threeten.bp.temporal.a.f340340k3.l(j10);
        org.threeten.bp.temporal.a.f340350p1.l(i11);
        boolean zIsLeapYear = org.threeten.bp.chrono.o.f339936e.isLeapYear(j10);
        if (i11 == 366 && !zIsLeapYear) {
            throw new org.threeten.bp.b("Invalid date 'DayOfYear 366' as '" + i10 + "' is not a leap year");
        }
        j jVarL = j.L(((i11 - 1) / 31) + 1);
        if (i11 > (jVarL.w(zIsLeapYear) + jVarL.D(zIsLeapYear)) - 1) {
            jVarL = jVarL.M(1L);
        }
        return g0(i10, jVarL, (i11 - jVarL.w(zIsLeapYear)) + 1);
    }

    public static g G0(CharSequence charSequence) {
        return H0(charSequence, org.threeten.bp.format.c.f340042h);
    }

    public static g H0(CharSequence charSequence, org.threeten.bp.format.c cVar) {
        cn.d.j(cVar, "formatter");
        return (g) cVar.r(charSequence, f340196g);
    }

    static g O0(DataInput dataInput) throws IOException {
        return C0(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private static g P0(int i10, int i11, int i12) {
        if (i11 == 2) {
            i12 = Math.min(i12, org.threeten.bp.chrono.o.f339936e.isLeapYear((long) i10) ? 29 : 28);
        } else if (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) {
            i12 = Math.min(i12, 30);
        }
        return C0(i10, i11, i12);
    }

    private static g g0(int i10, j jVar, int i11) {
        if (i11 <= 28 || i11 <= jVar.D(org.threeten.bp.chrono.o.f339936e.isLeapYear(i10))) {
            return new g(i10, jVar.getValue(), i11);
        }
        if (i11 == 29) {
            throw new org.threeten.bp.b("Invalid date 'February 29' as '" + i10 + "' is not a leap year");
        }
        throw new org.threeten.bp.b("Invalid date '" + jVar.name() + " " + i11 + "'");
    }

    public static g i0(org.threeten.bp.temporal.f fVar) {
        g gVar = (g) fVar.d(org.threeten.bp.temporal.k.b());
        if (gVar != null) {
            return gVar;
        }
        throw new org.threeten.bp.b("Unable to obtain LocalDate from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName());
    }

    private int j0(org.threeten.bp.temporal.j jVar) {
        switch (b.f340203a[((org.threeten.bp.temporal.a) jVar).ordinal()]) {
            case 1:
                return this.f340202d;
            case 2:
                return n0();
            case 3:
                return ((this.f340202d - 1) / 7) + 1;
            case 4:
                int i10 = this.f340200b;
                return i10 >= 1 ? i10 : 1 - i10;
            case 5:
                return m0().getValue();
            case 6:
                return ((this.f340202d - 1) % 7) + 1;
            case 7:
                return ((n0() - 1) % 7) + 1;
            case 8:
                throw new org.threeten.bp.b("Field too large for an int: " + jVar);
            case 9:
                return ((n0() - 1) / 7) + 1;
            case 10:
                return this.f340201c;
            case 11:
                throw new org.threeten.bp.b("Field too large for an int: " + jVar);
            case 12:
                return this.f340200b;
            case 13:
                return this.f340200b >= 1 ? 1 : 0;
            default:
                throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
        }
    }

    private long q0() {
        return (((long) this.f340200b) * 12) + ((long) (this.f340201c - 1));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 3, this);
    }

    private long y0(g gVar) {
        return (((gVar.q0() * 32) + ((long) gVar.l0())) - ((q0() * 32) + ((long) l0()))) / 32;
    }

    public static g z0() {
        return A0(org.threeten.bp.a.g());
    }

    @Override // org.threeten.bp.chrono.c
    public org.threeten.bp.chrono.k H() {
        return super.H();
    }

    @Override // org.threeten.bp.chrono.c
    public boolean I(org.threeten.bp.chrono.c cVar) {
        if (cVar instanceof g) {
            return f0((g) cVar) > 0;
        }
        return super.I(cVar);
    }

    @Override // org.threeten.bp.chrono.c, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public g v(long j10, org.threeten.bp.temporal.m mVar) {
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return (g) mVar.b(this, j10);
        }
        switch (b.f340204b[((org.threeten.bp.temporal.b) mVar).ordinal()]) {
            case 1:
                return K0(j10);
            case 2:
                return M0(j10);
            case 3:
                return L0(j10);
            case 4:
                return N0(j10);
            case 5:
                return N0(cn.d.n(j10, 10));
            case 6:
                return N0(cn.d.n(j10, 100));
            case 7:
                return N0(cn.d.n(j10, 1000));
            case 8:
                org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340342l3;
                return o(aVar, cn.d.l(t(aVar), j10));
            default:
                throw new org.threeten.bp.temporal.n("Unsupported unit: " + mVar);
        }
    }

    @Override // org.threeten.bp.chrono.c, cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public g n(org.threeten.bp.temporal.i iVar) {
        return (g) iVar.c(this);
    }

    public g K0(long j10) {
        return j10 == 0 ? this : E0(cn.d.l(toEpochDay(), j10));
    }

    @Override // org.threeten.bp.chrono.c
    public boolean L(org.threeten.bp.chrono.c cVar) {
        if (cVar instanceof g) {
            return f0((g) cVar) < 0;
        }
        return super.L(cVar);
    }

    public g L0(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (((long) this.f340200b) * 12) + ((long) (this.f340201c - 1)) + j10;
        return P0(org.threeten.bp.temporal.a.f340340k3.k(cn.d.e(j11, 12L)), cn.d.g(j11, 12) + 1, this.f340202d);
    }

    @Override // org.threeten.bp.chrono.c
    public boolean M(org.threeten.bp.chrono.c cVar) {
        if (cVar instanceof g) {
            return f0((g) cVar) == 0;
        }
        return super.M(cVar);
    }

    public g M0(long j10) {
        return K0(cn.d.n(j10, 7));
    }

    public g N0(long j10) {
        return j10 == 0 ? this : P0(org.threeten.bp.temporal.a.f340340k3.k(((long) this.f340200b) + j10), this.f340201c, this.f340202d);
    }

    @Override // org.threeten.bp.chrono.c
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public n U(org.threeten.bp.chrono.c cVar) {
        g gVarI0 = i0(cVar);
        long jQ0 = gVarI0.q0() - q0();
        int iLengthOfMonth = gVarI0.f340202d - this.f340202d;
        if (jQ0 > 0 && iLengthOfMonth < 0) {
            jQ0--;
            iLengthOfMonth = (int) (gVarI0.toEpochDay() - L0(jQ0).toEpochDay());
        } else if (jQ0 < 0 && iLengthOfMonth > 0) {
            jQ0++;
            iLengthOfMonth -= gVarI0.lengthOfMonth();
        }
        return n.z(cn.d.r(jQ0 / 12), (int) (jQ0 % 12), iLengthOfMonth);
    }

    @Override // org.threeten.bp.chrono.c, cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public g s(org.threeten.bp.temporal.g gVar) {
        return gVar instanceof g ? (g) gVar : (g) gVar.b(this);
    }

    @Override // org.threeten.bp.chrono.c, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public g o(org.threeten.bp.temporal.j jVar, long j10) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return (g) jVar.b(this, j10);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        aVar.l(j10);
        switch (b.f340203a[aVar.ordinal()]) {
            case 1:
                return T0((int) j10);
            case 2:
                return U0((int) j10);
            case 3:
                return M0(j10 - t(org.threeten.bp.temporal.a.f340351p2));
            case 4:
                if (this.f340200b < 1) {
                    j10 = 1 - j10;
                }
                return W0((int) j10);
            case 5:
                return K0(j10 - ((long) m0().getValue()));
            case 6:
                return K0(j10 - t(org.threeten.bp.temporal.a.Y));
            case 7:
                return K0(j10 - t(org.threeten.bp.temporal.a.Z));
            case 8:
                return E0(j10);
            case 9:
                return M0(j10 - t(org.threeten.bp.temporal.a.f340332g3));
            case 10:
                return V0((int) j10);
            case 11:
                return L0(j10 - t(org.threeten.bp.temporal.a.f340336i3));
            case 12:
                return W0((int) j10);
            case 13:
                return t(org.threeten.bp.temporal.a.f340342l3) == j10 ? this : W0(1 - this.f340200b);
            default:
                throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
        }
    }

    public g T0(int i10) {
        return this.f340202d == i10 ? this : C0(this.f340200b, this.f340201c, i10);
    }

    public g U0(int i10) {
        return n0() == i10 ? this : F0(this.f340200b, i10);
    }

    public g V0(int i10) {
        if (this.f340201c == i10) {
            return this;
        }
        org.threeten.bp.temporal.a.f340334h3.l(i10);
        return P0(this.f340200b, i10, this.f340202d);
    }

    public g W0(int i10) {
        if (this.f340200b == i10) {
            return this;
        }
        org.threeten.bp.temporal.a.f340340k3.l(i10);
        return P0(i10, this.f340201c, this.f340202d);
    }

    public h X() {
        return h.H0(this, i.f340214g);
    }

    void X0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.f340200b);
        dataOutput.writeByte(this.f340201c);
        dataOutput.writeByte(this.f340202d);
    }

    public u Y(r rVar) {
        org.threeten.bp.zone.e eVarE;
        cn.d.j(rVar, "zone");
        h hVarW = w(i.f340214g);
        if (!(rVar instanceof s) && (eVarE = rVar.z().e(hVarW)) != null && eVarE.t()) {
            hVarW = eVarE.k();
        }
        return u.G0(hVarW, rVar);
    }

    public h Z(int i10, int i11) {
        return w(i.e0(i10, i11));
    }

    public h a0(int i10, int i11, int i12) {
        return w(i.f0(i10, i11, i12));
    }

    @Override // org.threeten.bp.chrono.c, org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e b(org.threeten.bp.temporal.e eVar) {
        return super.b(eVar);
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.o c(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.d(this);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        if (!aVar.isDateBased()) {
            throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
        }
        int i10 = b.f340203a[aVar.ordinal()];
        if (i10 == 1) {
            return org.threeten.bp.temporal.o.k(1L, lengthOfMonth());
        }
        if (i10 == 2) {
            return org.threeten.bp.temporal.o.k(1L, lengthOfYear());
        }
        if (i10 == 3) {
            return org.threeten.bp.temporal.o.k(1L, (o0() != j.FEBRUARY || isLeapYear()) ? 5L : 4L);
        }
        if (i10 != 4) {
            return jVar.range();
        }
        return r0() <= 0 ? org.threeten.bp.temporal.o.k(1L, 1000000000L) : org.threeten.bp.temporal.o.k(1L, 999999999L);
    }

    public h c0(int i10, int i11, int i12, int i13) {
        return w(i.g0(i10, i11, i12, i13));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.threeten.bp.chrono.c, cn.c, org.threeten.bp.temporal.f
    public <R> R d(org.threeten.bp.temporal.l<R> lVar) {
        return lVar == org.threeten.bp.temporal.k.b() ? this : (R) super.d(lVar);
    }

    @Override // org.threeten.bp.chrono.c
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public h w(i iVar) {
        return h.H0(this, iVar);
    }

    public l e0(m mVar) {
        return l.q0(h.H0(this, mVar.q0()), mVar.L());
    }

    @Override // org.threeten.bp.chrono.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && f0((g) obj) == 0;
    }

    int f0(g gVar) {
        int i10 = this.f340200b - gVar.f340200b;
        return (i10 == 0 && (i10 = this.f340201c - gVar.f340201c) == 0) ? this.f340202d - gVar.f340202d : i10;
    }

    long h0(g gVar) {
        return gVar.toEpochDay() - toEpochDay();
    }

    @Override // org.threeten.bp.chrono.c
    public int hashCode() {
        int i10 = this.f340200b;
        return (i10 & (-2048)) ^ (((i10 << 11) + (this.f340201c << 6)) + this.f340202d);
    }

    @Override // org.threeten.bp.chrono.c
    public boolean isLeapYear() {
        return org.threeten.bp.chrono.o.f339936e.isLeapYear(this.f340200b);
    }

    @Override // org.threeten.bp.temporal.e
    public long k(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        g gVarI0 = i0(eVar);
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return mVar.d(this, gVarI0);
        }
        switch (b.f340204b[((org.threeten.bp.temporal.b) mVar).ordinal()]) {
            case 1:
                return h0(gVarI0);
            case 2:
                return h0(gVarI0) / 7;
            case 3:
                return y0(gVarI0);
            case 4:
                return y0(gVarI0) / 12;
            case 5:
                return y0(gVarI0) / 120;
            case 6:
                return y0(gVarI0) / ShimmerTextView.f258575k;
            case 7:
                return y0(gVarI0) / 12000;
            case 8:
                org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340342l3;
                return gVarI0.t(aVar) - t(aVar);
            default:
                throw new org.threeten.bp.temporal.n("Unsupported unit: " + mVar);
        }
    }

    @Override // org.threeten.bp.chrono.c
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public org.threeten.bp.chrono.o E() {
        return org.threeten.bp.chrono.o.f339936e;
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public int l(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? j0(jVar) : super.l(jVar);
    }

    public int l0() {
        return this.f340202d;
    }

    @Override // org.threeten.bp.chrono.c
    public int lengthOfMonth() {
        short s10 = this.f340201c;
        if (s10 != 2) {
            return (s10 == 4 || s10 == 6 || s10 == 9 || s10 == 11) ? 30 : 31;
        }
        return isLeapYear() ? 29 : 28;
    }

    @Override // org.threeten.bp.chrono.c
    public int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    public d m0() {
        return d.z(cn.d.g(toEpochDay() + 3, 7) + 1);
    }

    public int n0() {
        return (o0().w(isLeapYear()) + this.f340202d) - 1;
    }

    public j o0() {
        return j.L(this.f340201c);
    }

    public int p0() {
        return this.f340201c;
    }

    @Override // org.threeten.bp.chrono.c, org.threeten.bp.temporal.f
    public boolean q(org.threeten.bp.temporal.j jVar) {
        return super.q(jVar);
    }

    public int r0() {
        return this.f340200b;
    }

    @Override // org.threeten.bp.chrono.c, cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public g f(long j10, org.threeten.bp.temporal.m mVar) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = v(Long.MAX_VALUE, mVar);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.v(j11, mVar);
    }

    @Override // org.threeten.bp.temporal.f
    public long t(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.e(this);
        }
        if (jVar == org.threeten.bp.temporal.a.H1) {
            return toEpochDay();
        }
        return jVar == org.threeten.bp.temporal.a.f340336i3 ? q0() : j0(jVar);
    }

    @Override // org.threeten.bp.chrono.c, cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public g p(org.threeten.bp.temporal.i iVar) {
        return (g) iVar.b(this);
    }

    @Override // org.threeten.bp.chrono.c
    public long toEpochDay() {
        long j10 = this.f340200b;
        long j11 = this.f340201c;
        long j12 = 365 * j10;
        long j13 = (j10 >= 0 ? j12 + (((3 + j10) / 4) - ((99 + j10) / 100)) + ((j10 + 399) / 400) : j12 - (((j10 / (-4)) - (j10 / (-100))) + (j10 / (-400)))) + (((367 * j11) - 362) / 12) + ((long) (this.f340202d - 1));
        if (j11 > 2) {
            j13 = !isLeapYear() ? j13 - 2 : j13 - 1;
        }
        return j13 - f340199j;
    }

    @Override // org.threeten.bp.chrono.c
    public String toString() {
        int i10 = this.f340200b;
        short s10 = this.f340201c;
        short s11 = this.f340202d;
        int iAbs = Math.abs(i10);
        StringBuilder sb2 = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i10 > 9999) {
                sb2.append('+');
            }
            sb2.append(i10);
        } else if (i10 < 0) {
            sb2.append(i10 - 10000);
            sb2.deleteCharAt(1);
        } else {
            sb2.append(i10 + 10000);
            sb2.deleteCharAt(0);
        }
        sb2.append(s10 < 10 ? "-0" : "-");
        sb2.append((int) s10);
        sb2.append(s11 < 10 ? "-0" : "-");
        sb2.append((int) s11);
        return sb2.toString();
    }

    public g u0(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = K0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.K0(j11);
    }

    public g v0(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = L0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.L0(j11);
    }

    public g w0(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = M0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.M0(j11);
    }

    @Override // org.threeten.bp.chrono.c, java.lang.Comparable
    /* JADX INFO: renamed from: x */
    public int compareTo(org.threeten.bp.chrono.c cVar) {
        return cVar instanceof g ? f0((g) cVar) : super.compareTo(cVar);
    }

    public g x0(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = N0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.N0(j11);
    }

    @Override // org.threeten.bp.chrono.c
    public String z(org.threeten.bp.format.c cVar) {
        return super.z(cVar);
    }
}
