package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class i extends cn.c implements org.threeten.bp.temporal.e, org.threeten.bp.temporal.g, Comparable<i>, Serializable {
    static final long X = 60000000000L;
    static final long Y = 3600000000000L;
    static final long Z = 86400000000000L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f340212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f340213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f340214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f340215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<i> f340216i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final i[] f340217j = new i[24];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final int f340218k = 24;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final int f340219l = 60;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f340220m = 1440;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f340221n = 60;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final int f340222o = 3600;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final long f340223p0 = 6414437269572265201L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final int f340224s = 86400;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final long f340225t = 86400000;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final long f340226v = 86400000000L;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final long f340227w = 1000000000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f340228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte f340229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte f340230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f340231d;

    class a implements org.threeten.bp.temporal.l<i> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(org.threeten.bp.temporal.f fVar) {
            return i.H(fVar);
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f340232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f340233b;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.b.values().length];
            f340233b = iArr;
            try {
                iArr[org.threeten.bp.temporal.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f340233b[org.threeten.bp.temporal.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f340233b[org.threeten.bp.temporal.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f340233b[org.threeten.bp.temporal.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f340233b[org.threeten.bp.temporal.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f340233b[org.threeten.bp.temporal.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f340233b[org.threeten.bp.temporal.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[org.threeten.bp.temporal.a.values().length];
            f340232a = iArr2;
            try {
                iArr2[org.threeten.bp.temporal.a.f340329e.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f340232a[org.threeten.bp.temporal.a.f340330f.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f340232a[org.threeten.bp.temporal.a.f340331g.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f340232a[org.threeten.bp.temporal.a.f340333h.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f340232a[org.threeten.bp.temporal.a.f340335i.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f340232a[org.threeten.bp.temporal.a.f340337j.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f340232a[org.threeten.bp.temporal.a.f340339k.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f340232a[org.threeten.bp.temporal.a.f340341l.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f340232a[org.threeten.bp.temporal.a.f340343m.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f340232a[org.threeten.bp.temporal.a.f340345n.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f340232a[org.threeten.bp.temporal.a.f340347o.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f340232a[org.threeten.bp.temporal.a.f340352s.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f340232a[org.threeten.bp.temporal.a.f340353t.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f340232a[org.threeten.bp.temporal.a.f340354v.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f340232a[org.threeten.bp.temporal.a.f340355w.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    static {
        int i10 = 0;
        while (true) {
            i[] iVarArr = f340217j;
            if (i10 >= iVarArr.length) {
                i iVar = iVarArr[0];
                f340214g = iVar;
                f340215h = iVarArr[12];
                f340212e = iVar;
                f340213f = new i(23, 59, 59, p.f340294c);
                return;
            }
            iVarArr[i10] = new i(i10, 0, 0, 0);
            i10++;
        }
    }

    private i(int i10, int i11, int i12, int i13) {
        this.f340228a = (byte) i10;
        this.f340229b = (byte) i11;
        this.f340230c = (byte) i12;
        this.f340231d = i13;
    }

    private static i D(int i10, int i11, int i12, int i13) {
        return ((i11 | i12) | i13) == 0 ? f340217j[i10] : new i(i10, i11, i12, i13);
    }

    public static i H(org.threeten.bp.temporal.f fVar) {
        i iVar = (i) fVar.d(org.threeten.bp.temporal.k.c());
        if (iVar != null) {
            return iVar;
        }
        throw new org.threeten.bp.b("Unable to obtain LocalTime from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName());
    }

    private int I(org.threeten.bp.temporal.j jVar) {
        switch (b.f340232a[((org.threeten.bp.temporal.a) jVar).ordinal()]) {
            case 1:
                return this.f340231d;
            case 2:
                throw new org.threeten.bp.b("Field too large for an int: " + jVar);
            case 3:
                return this.f340231d / 1000;
            case 4:
                throw new org.threeten.bp.b("Field too large for an int: " + jVar);
            case 5:
                return this.f340231d / 1000000;
            case 6:
                return (int) (t0() / 1000000);
            case 7:
                return this.f340230c;
            case 8:
                return u0();
            case 9:
                return this.f340229b;
            case 10:
                return (this.f340228a * 60) + this.f340229b;
            case 11:
                return this.f340228a % com.google.common.base.c.f116461n;
            case 12:
                int i10 = this.f340228a % com.google.common.base.c.f116461n;
                if (i10 % 12 == 0) {
                    return 12;
                }
                return i10;
            case 13:
                return this.f340228a;
            case 14:
                byte b10 = this.f340228a;
                if (b10 == 0) {
                    return 24;
                }
                return b10;
            case 15:
                return this.f340228a / com.google.common.base.c.f116461n;
            default:
                throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
        }
    }

    public static i a0() {
        return c0(org.threeten.bp.a.g());
    }

    public static i c0(org.threeten.bp.a aVar) {
        cn.d.j(aVar, "clock");
        f fVarC = aVar.c();
        long jH = ((fVarC.H() % 86400) + ((long) aVar.b().z().b(fVarC).S())) % 86400;
        if (jH < 0) {
            jH += 86400;
        }
        return j0(jH, fVarC.I());
    }

    public static i d0(r rVar) {
        return c0(org.threeten.bp.a.f(rVar));
    }

    public static i e0(int i10, int i11) {
        org.threeten.bp.temporal.a.f340353t.l(i10);
        if (i11 == 0) {
            return f340217j[i10];
        }
        org.threeten.bp.temporal.a.f340343m.l(i11);
        return new i(i10, i11, 0, 0);
    }

    public static i f0(int i10, int i11, int i12) {
        org.threeten.bp.temporal.a.f340353t.l(i10);
        if ((i11 | i12) == 0) {
            return f340217j[i10];
        }
        org.threeten.bp.temporal.a.f340343m.l(i11);
        org.threeten.bp.temporal.a.f340339k.l(i12);
        return new i(i10, i11, i12, 0);
    }

    public static i g0(int i10, int i11, int i12, int i13) {
        org.threeten.bp.temporal.a.f340353t.l(i10);
        org.threeten.bp.temporal.a.f340343m.l(i11);
        org.threeten.bp.temporal.a.f340339k.l(i12);
        org.threeten.bp.temporal.a.f340329e.l(i13);
        return D(i10, i11, i12, i13);
    }

    public static i h0(long j10) {
        org.threeten.bp.temporal.a.f340330f.l(j10);
        int i10 = (int) (j10 / Y);
        long j11 = j10 - (((long) i10) * Y);
        int i11 = (int) (j11 / X);
        long j12 = j11 - (((long) i11) * X);
        int i12 = (int) (j12 / 1000000000);
        return D(i10, i11, i12, (int) (j12 - (((long) i12) * 1000000000)));
    }

    public static i i0(long j10) {
        org.threeten.bp.temporal.a.f340341l.l(j10);
        int i10 = (int) (j10 / 3600);
        long j11 = j10 - ((long) (i10 * f340222o));
        int i11 = (int) (j11 / 60);
        return D(i10, i11, (int) (j11 - ((long) (i11 * 60))), 0);
    }

    static i j0(long j10, int i10) {
        org.threeten.bp.temporal.a.f340341l.l(j10);
        org.threeten.bp.temporal.a.f340329e.l(i10);
        int i11 = (int) (j10 / 3600);
        long j11 = j10 - ((long) (i11 * f340222o));
        int i12 = (int) (j11 / 60);
        return D(i11, i12, (int) (j11 - ((long) (i12 * 60))), i10);
    }

    public static i k0(CharSequence charSequence) {
        return l0(charSequence, org.threeten.bp.format.c.f340045k);
    }

    public static i l0(CharSequence charSequence, org.threeten.bp.format.c cVar) {
        cn.d.j(cVar, "formatter");
        return (i) cVar.r(charSequence, f340216i);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    static i s0(DataInput dataInput) throws IOException {
        int i10;
        int i11;
        int i12 = dataInput.readByte();
        int i13 = 0;
        if (i12 < 0) {
            i12 = ~i12;
            i11 = 0;
            i10 = 0;
        } else {
            byte b10 = dataInput.readByte();
            if (b10 < 0) {
                int i14 = ~b10;
                i10 = 0;
                i13 = i14;
                i11 = 0;
            } else {
                byte b11 = dataInput.readByte();
                if (b11 < 0) {
                    i11 = ~b11;
                    i10 = 0;
                    i13 = b10;
                } else {
                    i10 = dataInput.readInt();
                    i13 = b10;
                    i11 = b11;
                }
            }
        }
        return g0(i12, i13, i11, i10);
    }

    private Object writeReplace() {
        return new o((byte) 5, this);
    }

    public i A0(int i10) {
        if (this.f340231d == i10) {
            return this;
        }
        org.threeten.bp.temporal.a.f340329e.l(i10);
        return D(this.f340228a, this.f340229b, this.f340230c, i10);
    }

    public i B0(int i10) {
        if (this.f340230c == i10) {
            return this;
        }
        org.threeten.bp.temporal.a.f340339k.l(i10);
        return D(this.f340228a, this.f340229b, i10, this.f340231d);
    }

    void C0(DataOutput dataOutput) throws IOException {
        if (this.f340231d != 0) {
            dataOutput.writeByte(this.f340228a);
            dataOutput.writeByte(this.f340229b);
            dataOutput.writeByte(this.f340230c);
            dataOutput.writeInt(this.f340231d);
            return;
        }
        if (this.f340230c != 0) {
            dataOutput.writeByte(this.f340228a);
            dataOutput.writeByte(this.f340229b);
            dataOutput.writeByte(~this.f340230c);
        } else if (this.f340229b == 0) {
            dataOutput.writeByte(~this.f340228a);
        } else {
            dataOutput.writeByte(this.f340228a);
            dataOutput.writeByte(~this.f340229b);
        }
    }

    public String E(org.threeten.bp.format.c cVar) {
        cn.d.j(cVar, "formatter");
        return cVar.d(this);
    }

    public int L() {
        return this.f340228a;
    }

    public int M() {
        return this.f340229b;
    }

    public int N() {
        return this.f340231d;
    }

    public int O() {
        return this.f340230c;
    }

    public boolean S(i iVar) {
        return compareTo(iVar) > 0;
    }

    public boolean T(i iVar) {
        return compareTo(iVar) < 0;
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public i f(long j10, org.threeten.bp.temporal.m mVar) {
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
    public i p(org.threeten.bp.temporal.i iVar) {
        return (i) iVar.b(this);
    }

    public i W(long j10) {
        return o0(-(j10 % 24));
    }

    public i X(long j10) {
        return p0(-(j10 % 1440));
    }

    public i Y(long j10) {
        return q0(-(j10 % Z));
    }

    public i Z(long j10) {
        return r0(-(j10 % 86400));
    }

    @Override // org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e b(org.threeten.bp.temporal.e eVar) {
        return eVar.o(org.threeten.bp.temporal.a.f340330f, t0());
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.o c(org.threeten.bp.temporal.j jVar) {
        return super.c(jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cn.c, org.threeten.bp.temporal.f
    public <R> R d(org.threeten.bp.temporal.l<R> lVar) {
        if (lVar == org.threeten.bp.temporal.k.e()) {
            return (R) org.threeten.bp.temporal.b.NANOS;
        }
        if (lVar == org.threeten.bp.temporal.k.c()) {
            return this;
        }
        if (lVar != org.threeten.bp.temporal.k.a() && lVar != org.threeten.bp.temporal.k.g() && lVar != org.threeten.bp.temporal.k.f() && lVar != org.threeten.bp.temporal.k.d() && lVar != org.threeten.bp.temporal.k.b()) {
            return lVar.a(this);
        }
        return null;
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
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f340228a == iVar.f340228a && this.f340229b == iVar.f340229b && this.f340230c == iVar.f340230c && this.f340231d == iVar.f340231d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long jT0 = t0();
        return (int) (jT0 ^ (jT0 >>> 32));
    }

    @Override // org.threeten.bp.temporal.e
    public long k(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        i iVarH = H(eVar);
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return mVar.d(this, iVarH);
        }
        long jT0 = iVarH.t0() - t0();
        switch (b.f340233b[((org.threeten.bp.temporal.b) mVar).ordinal()]) {
            case 1:
                break;
            case 2:
                jT0 /= 1000;
                break;
            case 3:
                return jT0 / 1000000;
            case 4:
                return jT0 / 1000000000;
            case 5:
                return jT0 / X;
            case 6:
                return jT0 / Y;
            case 7:
                return jT0 / 43200000000000L;
            default:
                throw new org.threeten.bp.temporal.n("Unsupported unit: " + mVar);
        }
        return jT0;
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public int l(org.threeten.bp.temporal.j jVar) {
        return jVar instanceof org.threeten.bp.temporal.a ? I(jVar) : super.l(jVar);
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public i v(long j10, org.threeten.bp.temporal.m mVar) {
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return (i) mVar.b(this, j10);
        }
        switch (b.f340233b[((org.threeten.bp.temporal.b) mVar).ordinal()]) {
            case 1:
                return q0(j10);
            case 2:
                return q0((j10 % f340226v) * 1000);
            case 3:
                return q0((j10 % 86400000) * 1000000);
            case 4:
                return r0(j10);
            case 5:
                return p0(j10);
            case 6:
                return o0(j10);
            case 7:
                return o0((j10 % 2) * 12);
            default:
                throw new org.threeten.bp.temporal.n("Unsupported unit: " + mVar);
        }
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public i n(org.threeten.bp.temporal.i iVar) {
        return (i) iVar.c(this);
    }

    public i o0(long j10) {
        return j10 == 0 ? this : D(((((int) (j10 % 24)) + this.f340228a) + 24) % 24, this.f340229b, this.f340230c, this.f340231d);
    }

    public i p0(long j10) {
        if (j10 != 0) {
            int i10 = (this.f340228a * 60) + this.f340229b;
            int i11 = ((((int) (j10 % 1440)) + i10) + f340220m) % f340220m;
            if (i10 != i11) {
                return D(i11 / 60, i11 % 60, this.f340230c, this.f340231d);
            }
        }
        return this;
    }

    @Override // org.threeten.bp.temporal.f
    public boolean q(org.threeten.bp.temporal.j jVar) {
        if (jVar instanceof org.threeten.bp.temporal.a) {
            return jVar.isTimeBased();
        }
        return jVar != null && jVar.c(this);
    }

    public i q0(long j10) {
        if (j10 != 0) {
            long jT0 = t0();
            long j11 = (((j10 % Z) + jT0) + Z) % Z;
            if (jT0 != j11) {
                return D((int) (j11 / Y), (int) ((j11 / X) % 60), (int) ((j11 / 1000000000) % 60), (int) (j11 % 1000000000));
            }
        }
        return this;
    }

    public i r0(long j10) {
        if (j10 != 0) {
            int i10 = (this.f340228a * com.google.common.base.c.f116465r) + (this.f340229b * 60) + this.f340230c;
            int i11 = ((((int) (j10 % 86400)) + i10) + f340224s) % f340224s;
            if (i10 != i11) {
                return D(i11 / f340222o, (i11 / 60) % 60, i11 % 60, this.f340231d);
            }
        }
        return this;
    }

    @Override // org.threeten.bp.temporal.f
    public long t(org.threeten.bp.temporal.j jVar) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.e(this);
        }
        if (jVar == org.threeten.bp.temporal.a.f340330f) {
            return t0();
        }
        return jVar == org.threeten.bp.temporal.a.f340333h ? t0() / 1000 : I(jVar);
    }

    public long t0() {
        return (((long) this.f340228a) * Y) + (((long) this.f340229b) * X) + (((long) this.f340230c) * 1000000000) + ((long) this.f340231d);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(18);
        byte b10 = this.f340228a;
        byte b11 = this.f340229b;
        byte b12 = this.f340230c;
        int i10 = this.f340231d;
        sb2.append(b10 < 10 ? com.facebook.appevents.p.f99189d0 : "");
        sb2.append((int) b10);
        sb2.append(b11 < 10 ? ":0" : ":");
        sb2.append((int) b11);
        if (b12 > 0 || i10 > 0) {
            sb2.append(b12 < 10 ? ":0" : ":");
            sb2.append((int) b12);
            if (i10 > 0) {
                sb2.append('.');
                if (i10 % 1000000 == 0) {
                    sb2.append(Integer.toString((i10 / 1000000) + 1000).substring(1));
                } else if (i10 % 1000 == 0) {
                    sb2.append(Integer.toString((i10 / 1000) + 1000000).substring(1));
                } else {
                    sb2.append(Integer.toString(i10 + 1000000000).substring(1));
                }
            }
        }
        return sb2.toString();
    }

    public int u0() {
        return (this.f340228a * com.google.common.base.c.f116465r) + (this.f340229b * 60) + this.f340230c;
    }

    public i v0(org.threeten.bp.temporal.m mVar) {
        if (mVar == org.threeten.bp.temporal.b.NANOS) {
            return this;
        }
        e duration = mVar.getDuration();
        if (duration.v() > 86400) {
            throw new org.threeten.bp.b("Unit is too large to be used for truncation");
        }
        long jW0 = duration.w0();
        if (Z % jW0 == 0) {
            return h0((t0() / jW0) * jW0);
        }
        throw new org.threeten.bp.b("Unit must divide into a standard day without remainder");
    }

    public h w(g gVar) {
        return h.H0(gVar, this);
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public i s(org.threeten.bp.temporal.g gVar) {
        return gVar instanceof i ? (i) gVar : (i) gVar.b(this);
    }

    public m x(s sVar) {
        return m.e0(this, sVar);
    }

    @Override // org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public i o(org.threeten.bp.temporal.j jVar, long j10) {
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return (i) jVar.b(this, j10);
        }
        org.threeten.bp.temporal.a aVar = (org.threeten.bp.temporal.a) jVar;
        aVar.l(j10);
        switch (b.f340232a[aVar.ordinal()]) {
            case 1:
                return A0((int) j10);
            case 2:
                return h0(j10);
            case 3:
                return A0(((int) j10) * 1000);
            case 4:
                return h0(j10 * 1000);
            case 5:
                return A0(((int) j10) * 1000000);
            case 6:
                return h0(j10 * 1000000);
            case 7:
                return B0((int) j10);
            case 8:
                return r0(j10 - ((long) u0()));
            case 9:
                return z0((int) j10);
            case 10:
                return p0(j10 - ((long) ((this.f340228a * 60) + this.f340229b)));
            case 11:
                return o0(j10 - ((long) (this.f340228a % com.google.common.base.c.f116461n)));
            case 12:
                if (j10 == 12) {
                    j10 = 0;
                }
                return o0(j10 - ((long) (this.f340228a % com.google.common.base.c.f116461n)));
            case 13:
                return y0((int) j10);
            case 14:
                if (j10 == 24) {
                    j10 = 0;
                }
                return y0((int) j10);
            case 15:
                return o0((j10 - ((long) (this.f340228a / com.google.common.base.c.f116461n))) * 12);
            default:
                throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
        }
    }

    public i y0(int i10) {
        if (this.f340228a == i10) {
            return this;
        }
        org.threeten.bp.temporal.a.f340353t.l(i10);
        return D(i10, this.f340229b, this.f340230c, this.f340231d);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        int iA = cn.d.a(this.f340228a, iVar.f340228a);
        return (iA == 0 && (iA = cn.d.a(this.f340229b, iVar.f340229b)) == 0 && (iA = cn.d.a(this.f340230c, iVar.f340230c)) == 0) ? cn.d.a(this.f340231d, iVar.f340231d) : iA;
    }

    public i z0(int i10) {
        if (this.f340229b == i10) {
            return this;
        }
        org.threeten.bp.temporal.a.f340343m.l(i10);
        return D(this.f340228a, i10, this.f340230c, this.f340231d);
    }
}
