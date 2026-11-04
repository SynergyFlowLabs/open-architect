package org.threeten.bp.chrono;

import io.intercom.android.sdk.models.AttributeType;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class u extends b<u> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f339972d = 1300372329181994526L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final org.threeten.bp.g f339973c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f339974a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.a.values().length];
            f339974a = iArr;
            try {
                iArr[org.threeten.bp.temporal.a.f340349p0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f339974a[org.threeten.bp.temporal.a.f340350p1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f339974a[org.threeten.bp.temporal.a.f340351p2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f339974a[org.threeten.bp.temporal.a.f340338j3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int i10 = 5 >> 5;
                f339974a[org.threeten.bp.temporal.a.f340336i3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f339974a[org.threeten.bp.temporal.a.f340340k3.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f339974a[org.threeten.bp.temporal.a.f340342l3.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    u(org.threeten.bp.g gVar) {
        cn.d.j(gVar, AttributeType.DATE);
        this.f339973c = gVar;
    }

    public static u h0(org.threeten.bp.temporal.f fVar) {
        return t.f339968e.e(fVar);
    }

    private long k0() {
        return ((((long) l0()) * 12) + ((long) this.f339973c.p0())) - 1;
    }

    private int l0() {
        return this.f339973c.r0() - 1911;
    }

    public static u o0() {
        return p0(org.threeten.bp.a.g());
    }

    public static u p0(org.threeten.bp.a aVar) {
        return new u(org.threeten.bp.g.A0(aVar));
    }

    public static u q0(org.threeten.bp.r rVar) {
        return p0(org.threeten.bp.a.f(rVar));
    }

    public static u r0(int i10, int i11, int i12) {
        return t.f339968e.c(i10, i11, i12);
    }

    private Object writeReplace() {
        return new w((byte) 5, this);
    }

    static c x0(DataInput dataInput) throws IOException {
        return t.f339968e.c(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private u y0(org.threeten.bp.g gVar) {
        return gVar.equals(this.f339973c) ? this : new u(gVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // org.threeten.bp.chrono.c, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public u o(org.threeten.bp.temporal.j jVar, long j10) {
        int iA;
        int i10;
        int i11;
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return (u) jVar.b(this, j10);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        if (t(aVar) == j10) {
            return this;
        }
        int[] iArr = a.f339974a;
        int i12 = iArr[aVar.ordinal()];
        if (i12 == 4) {
            iA = E().L(aVar).a(j10, aVar);
            i10 = iArr[aVar.ordinal()];
            if (i10 != 4) {
                org.threeten.bp.g gVar = this.f339973c;
                if (l0() >= 1) {
                    i11 = iA + 1911;
                } else {
                    i11 = 1912 - iA;
                }
                return y0(gVar.W0(i11));
            }
            if (i10 != 6) {
                return y0(this.f339973c.W0(iA + 1911));
            }
            if (i10 == 7) {
                return y0(this.f339973c.W0(1912 - l0()));
            }
        } else {
            if (i12 == 5) {
                E().L(aVar).b(j10, aVar);
                return e0(j10 - k0());
            }
            if (i12 == 6 || i12 == 7) {
                iA = E().L(aVar).a(j10, aVar);
                i10 = iArr[aVar.ordinal()];
                if (i10 != 4) {
                    org.threeten.bp.g gVar2 = this.f339973c;
                    if (l0() >= 1) {
                        i11 = iA + 1911;
                    } else {
                        i11 = 1912 - iA;
                    }
                    return y0(gVar2.W0(i11));
                }
                if (i10 != 6) {
                    return y0(this.f339973c.W0(iA + 1911));
                }
                if (i10 == 7) {
                    return y0(this.f339973c.W0(1912 - l0()));
                }
            }
        }
        return y0(this.f339973c.o(jVar, j10));
    }

    void B0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(l(org.threeten.bp.temporal.a.f340340k3));
        dataOutput.writeByte(l(org.threeten.bp.temporal.a.f340334h3));
        dataOutput.writeByte(l(org.threeten.bp.temporal.a.f340349p0));
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c
    public f U(c cVar) {
        org.threeten.bp.n nVarU = this.f339973c.U(cVar);
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
        int i10 = a.f339974a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return this.f339973c.c(jVar);
        }
        if (i10 != 4) {
            return E().L(aVar);
        }
        org.threeten.bp.temporal.o oVarRange = org.threeten.bp.temporal.a.f340340k3.range();
        return org.threeten.bp.temporal.o.k(1L, l0() <= 0 ? (-oVarRange.e()) + 1912 : oVarRange.d() - 1911);
    }

    @Override // org.threeten.bp.chrono.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.f339973c.equals(((u) obj).f339973c);
        }
        return false;
    }

    @Override // org.threeten.bp.chrono.c
    public int hashCode() {
        return this.f339973c.hashCode() ^ E().getId().hashCode();
    }

    @Override // org.threeten.bp.chrono.c
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public t E() {
        return t.f339968e;
    }

    @Override // org.threeten.bp.chrono.c
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public v H() {
        return (v) super.H();
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.temporal.e
    public /* bridge */ /* synthetic */ long k(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        return super.k(eVar, mVar);
    }

    @Override // org.threeten.bp.chrono.c
    public int lengthOfMonth() {
        return this.f339973c.lengthOfMonth();
    }

    @Override // org.threeten.bp.chrono.c, cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public u f(long j10, org.threeten.bp.temporal.m mVar) {
        return (u) super.f(j10, mVar);
    }

    @Override // org.threeten.bp.chrono.c, cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public u p(org.threeten.bp.temporal.i iVar) {
        return (u) super.p(iVar);
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public u v(long j10, org.threeten.bp.temporal.m mVar) {
        return (u) super.v(j10, mVar);
    }

    @Override // org.threeten.bp.temporal.f
    public long t(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.e(this);
        }
        int i10 = a.f339974a[((org.threeten.bp.temporal.a) jVar).ordinal()];
        if (i10 == 4) {
            int iL0 = l0();
            if (iL0 < 1) {
                iL0 = 1 - iL0;
            }
            return iL0;
        }
        if (i10 == 5) {
            return k0();
        }
        if (i10 == 6) {
            return l0();
        }
        if (i10 != 7) {
            return this.f339973c.t(jVar);
        }
        return l0() < 1 ? 0 : 1;
    }

    @Override // org.threeten.bp.chrono.c, cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public u n(org.threeten.bp.temporal.i iVar) {
        return (u) super.n(iVar);
    }

    @Override // org.threeten.bp.chrono.c
    public long toEpochDay() {
        return this.f339973c.toEpochDay();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.b
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public u d0(long j10) {
        return y0(this.f339973c.K0(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.b
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public u e0(long j10) {
        return y0(this.f339973c.L0(j10));
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.chrono.c
    public final d<u> w(org.threeten.bp.i iVar) {
        return super.w(iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.b
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public u g0(long j10) {
        return y0(this.f339973c.N0(j10));
    }

    @Override // org.threeten.bp.chrono.c, cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public u s(org.threeten.bp.temporal.g gVar) {
        return (u) super.s(gVar);
    }
}
