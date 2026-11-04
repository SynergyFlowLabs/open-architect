package org.threeten.bp.chrono;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;

/* JADX INFO: loaded from: classes14.dex */
public final class r extends b<r> implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f339950f = -305327627230580483L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final org.threeten.bp.g f339951g = org.threeten.bp.g.C0(1873, 1, 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final org.threeten.bp.g f339952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient s f339953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int f339954e;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f339955a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.a.values().length];
            f339955a = iArr;
            try {
                iArr[org.threeten.bp.temporal.a.f340350p1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f339955a[org.threeten.bp.temporal.a.f340338j3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f339955a[org.threeten.bp.temporal.a.Y.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f339955a[org.threeten.bp.temporal.a.Z.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f339955a[org.threeten.bp.temporal.a.f340351p2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f339955a[org.threeten.bp.temporal.a.f340332g3.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f339955a[org.threeten.bp.temporal.a.f340342l3.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    r(org.threeten.bp.g gVar) {
        if (gVar.L(f339951g)) {
            throw new org.threeten.bp.b("Minimum supported date is January 1st Meiji 6");
        }
        s sVarX = s.x(gVar);
        this.f339953d = sVarX;
        this.f339954e = gVar.r0() - (sVarX.I().r0() - 1);
        this.f339952c = gVar;
    }

    private r A0(org.threeten.bp.g gVar) {
        return gVar.equals(this.f339952c) ? this : new r(gVar);
    }

    private r D0(int i10) {
        return E0(H(), i10);
    }

    private r E0(s sVar, int i10) {
        return A0(this.f339952c.W0(q.f339942f.I(sVar, i10)));
    }

    private org.threeten.bp.temporal.o h0(int i10) {
        Calendar calendar = Calendar.getInstance(q.f339941e);
        calendar.set(0, this.f339953d.getValue() + 2);
        calendar.set(this.f339954e, this.f339952c.p0() - 1, this.f339952c.l0());
        return org.threeten.bp.temporal.o.k(calendar.getActualMinimum(i10), calendar.getActualMaximum(i10));
    }

    public static r i0(org.threeten.bp.temporal.f fVar) {
        return q.f339942f.e(fVar);
    }

    private long k0() {
        return this.f339954e == 1 ? (this.f339952c.n0() - this.f339953d.I().n0()) + 1 : this.f339952c.n0();
    }

    public static r o0() {
        return p0(org.threeten.bp.a.g());
    }

    public static r p0(org.threeten.bp.a aVar) {
        return new r(org.threeten.bp.g.A0(aVar));
    }

    public static r q0(org.threeten.bp.r rVar) {
        return p0(org.threeten.bp.a.f(rVar));
    }

    public static r r0(int i10, int i11, int i12) {
        return new r(org.threeten.bp.g.C0(i10, i11, i12));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        s sVarX = s.x(this.f339952c);
        this.f339953d = sVarX;
        this.f339954e = this.f339952c.r0() - (sVarX.I().r0() - 1);
    }

    public static r s0(s sVar, int i10, int i11, int i12) {
        cn.d.j(sVar, "era");
        if (i10 < 1) {
            throw new org.threeten.bp.b("Invalid YearOfEra: " + i10);
        }
        org.threeten.bp.g gVarI = sVar.I();
        org.threeten.bp.g gVarW = sVar.w();
        org.threeten.bp.g gVarC0 = org.threeten.bp.g.C0((gVarI.r0() - 1) + i10, i11, i12);
        if (!gVarC0.L(gVarI) && !gVarC0.I(gVarW)) {
            return new r(sVar, i10, gVarC0);
        }
        throw new org.threeten.bp.b("Requested date is outside bounds of era " + sVar);
    }

    static r t0(s sVar, int i10, int i11) {
        cn.d.j(sVar, "era");
        if (i10 < 1) {
            throw new org.threeten.bp.b("Invalid YearOfEra: " + i10);
        }
        org.threeten.bp.g gVarI = sVar.I();
        org.threeten.bp.g gVarW = sVar.w();
        if (i10 == 1 && (i11 = i11 + (gVarI.n0() - 1)) > gVarI.lengthOfYear()) {
            throw new org.threeten.bp.b("DayOfYear exceeds maximum allowed in the first year of era " + sVar);
        }
        org.threeten.bp.g gVarF0 = org.threeten.bp.g.F0((gVarI.r0() - 1) + i10, i11);
        if (!gVarF0.L(gVarI) && !gVarF0.I(gVarW)) {
            return new r(sVar, i10, gVarF0);
        }
        throw new org.threeten.bp.b("Requested date is outside bounds of era " + sVar);
    }

    private Object writeReplace() {
        return new w((byte) 1, this);
    }

    static c z0(DataInput dataInput) throws IOException {
        return q.f339942f.c(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    @Override // org.threeten.bp.chrono.c, cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public r s(org.threeten.bp.temporal.g gVar) {
        return (r) super.s(gVar);
    }

    @Override // org.threeten.bp.chrono.c, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public r o(org.threeten.bp.temporal.j jVar, long j10) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return (r) jVar.b(this, j10);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        if (t(aVar) == j10) {
            return this;
        }
        int[] iArr = a.f339955a;
        int i10 = iArr[aVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 7) {
            int iA = E().L(aVar).a(j10, aVar);
            int i11 = iArr[aVar.ordinal()];
            if (i11 == 1) {
                return A0(this.f339952c.K0(((long) iA) - k0()));
            }
            if (i11 == 2) {
                return D0(iA);
            }
            if (i11 == 7) {
                return E0(s.z(iA), this.f339954e);
            }
        }
        return A0(this.f339952c.o(jVar, j10));
    }

    void F0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(l(org.threeten.bp.temporal.a.f340340k3));
        dataOutput.writeByte(l(org.threeten.bp.temporal.a.f340334h3));
        dataOutput.writeByte(l(org.threeten.bp.temporal.a.f340349p0));
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c
    public f U(c cVar) {
        org.threeten.bp.n nVarU = this.f339952c.U(cVar);
        return E().H(nVarU.r(), nVarU.q(), nVarU.p());
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.o c(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.d(this);
        }
        if (!q(jVar)) {
            throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        int i10 = a.f339955a[aVar.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? E().L(aVar) : h0(1);
        }
        return h0(6);
    }

    @Override // org.threeten.bp.chrono.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.f339952c.equals(((r) obj).f339952c);
        }
        return false;
    }

    @Override // org.threeten.bp.chrono.c
    public int hashCode() {
        return this.f339952c.hashCode() ^ E().getId().hashCode();
    }

    @Override // org.threeten.bp.chrono.c
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public q E() {
        return q.f339942f;
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.temporal.e
    public /* bridge */ /* synthetic */ long k(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        return super.k(eVar, mVar);
    }

    @Override // org.threeten.bp.chrono.c
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public s H() {
        return this.f339953d;
    }

    @Override // org.threeten.bp.chrono.c
    public int lengthOfMonth() {
        return this.f339952c.lengthOfMonth();
    }

    @Override // org.threeten.bp.chrono.c
    public int lengthOfYear() {
        Calendar calendar = Calendar.getInstance(q.f339941e);
        calendar.set(0, this.f339953d.getValue() + 2);
        calendar.set(this.f339954e, this.f339952c.p0() - 1, this.f339952c.l0());
        return calendar.getActualMaximum(6);
    }

    @Override // org.threeten.bp.chrono.c, cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public r f(long j10, org.threeten.bp.temporal.m mVar) {
        return (r) super.f(j10, mVar);
    }

    @Override // org.threeten.bp.chrono.c, cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public r p(org.threeten.bp.temporal.i iVar) {
        return (r) super.p(iVar);
    }

    @Override // org.threeten.bp.chrono.c, org.threeten.bp.temporal.f
    public boolean q(org.threeten.bp.temporal.j jVar) {
        if (jVar != org.threeten.bp.temporal.a.Y && jVar != org.threeten.bp.temporal.a.Z && jVar != org.threeten.bp.temporal.a.f340351p2 && jVar != org.threeten.bp.temporal.a.f340332g3) {
            return super.q(jVar);
        }
        return false;
    }

    @Override // org.threeten.bp.temporal.f
    public long t(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.e(this);
        }
        switch (a.f339955a[((org.threeten.bp.temporal.a) jVar).ordinal()]) {
            case 1:
                return k0();
            case 2:
                return this.f339954e;
            case 3:
            case 4:
            case 5:
            case 6:
                throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
            case 7:
                return this.f339953d.getValue();
            default:
                return this.f339952c.t(jVar);
        }
    }

    @Override // org.threeten.bp.chrono.c
    public long toEpochDay() {
        return this.f339952c.toEpochDay();
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public r v(long j10, org.threeten.bp.temporal.m mVar) {
        return (r) super.v(j10, mVar);
    }

    @Override // org.threeten.bp.chrono.c, cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public r n(org.threeten.bp.temporal.i iVar) {
        return (r) super.n(iVar);
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c
    public final d<r> w(org.threeten.bp.i iVar) {
        return super.w(iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.b
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public r d0(long j10) {
        return A0(this.f339952c.K0(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.b
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public r e0(long j10) {
        return A0(this.f339952c.L0(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.b
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public r g0(long j10) {
        return A0(this.f339952c.N0(j10));
    }

    r(s sVar, int i10, org.threeten.bp.g gVar) {
        if (!gVar.L(f339951g)) {
            this.f339953d = sVar;
            this.f339954e = i10;
            this.f339952c = gVar;
            return;
        }
        throw new org.threeten.bp.b("Minimum supported date is January 1st Meiji 6");
    }
}
