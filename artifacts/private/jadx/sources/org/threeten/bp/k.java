package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class k extends cn.c implements org.threeten.bp.temporal.f, org.threeten.bp.temporal.g, Comparable<k>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f340251d = -939150713474957432L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f340253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f340254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final org.threeten.bp.temporal.l<k> f340250c = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final org.threeten.bp.format.c f340252e = new org.threeten.bp.format.d().i("--").u(org.threeten.bp.temporal.a.f340334h3, 2).h(org.apache.commons.codec.language.l.f335457d).u(org.threeten.bp.temporal.a.f340349p0, 2).P();

    class a implements org.threeten.bp.temporal.l<k> {
        a() {
        }

        @Override // org.threeten.bp.temporal.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k a(org.threeten.bp.temporal.f fVar) {
            return k.D(fVar);
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f340255a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.a.values().length];
            f340255a = iArr;
            try {
                iArr[org.threeten.bp.temporal.a.f340349p0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f340255a[org.threeten.bp.temporal.a.f340334h3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private k(int i10, int i11) {
        this.f340253a = i10;
        this.f340254b = i11;
    }

    public static k D(org.threeten.bp.temporal.f fVar) {
        if (fVar instanceof k) {
            return (k) fVar;
        }
        try {
            if (!org.threeten.bp.chrono.o.f339936e.equals(org.threeten.bp.chrono.j.v(fVar))) {
                fVar = g.i0(fVar);
            }
            return U(fVar.l(org.threeten.bp.temporal.a.f340334h3), fVar.l(org.threeten.bp.temporal.a.f340349p0));
        } catch (org.threeten.bp.b unused) {
            throw new org.threeten.bp.b("Unable to obtain MonthDay from TemporalAccessor: " + fVar + ", type " + fVar.getClass().getName());
        }
    }

    public static k O() {
        return S(org.threeten.bp.a.g());
    }

    public static k S(org.threeten.bp.a aVar) {
        g gVarA0 = g.A0(aVar);
        return V(gVarA0.o0(), gVarA0.l0());
    }

    public static k T(r rVar) {
        return S(org.threeten.bp.a.f(rVar));
    }

    public static k U(int i10, int i11) {
        return V(j.L(i10), i11);
    }

    public static k V(j jVar, int i10) {
        cn.d.j(jVar, "month");
        org.threeten.bp.temporal.a.f340349p0.l(i10);
        if (i10 <= jVar.E()) {
            return new k(jVar.getValue(), i10);
        }
        throw new org.threeten.bp.b("Illegal value for DayOfMonth field, value " + i10 + " is not valid for month " + jVar.name());
    }

    public static k W(CharSequence charSequence) {
        return X(charSequence, f340252e);
    }

    public static k X(CharSequence charSequence, org.threeten.bp.format.c cVar) {
        cn.d.j(cVar, "formatter");
        return (k) cVar.r(charSequence, f340250c);
    }

    static k Y(DataInput dataInput) throws IOException {
        return U(dataInput.readByte(), dataInput.readByte());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o(com.google.common.primitives.t.f119782a, this);
    }

    public int E() {
        return this.f340254b;
    }

    public j H() {
        return j.L(this.f340253a);
    }

    public int I() {
        return this.f340253a;
    }

    public boolean L(k kVar) {
        return compareTo(kVar) > 0;
    }

    public boolean M(k kVar) {
        return compareTo(kVar) < 0;
    }

    public boolean N(int i10) {
        return !(this.f340254b == 29 && this.f340253a == 2 && !p.O((long) i10));
    }

    public k Z(j jVar) {
        cn.d.j(jVar, "month");
        if (jVar.getValue() == this.f340253a) {
            return this;
        }
        return new k(jVar.getValue(), Math.min(this.f340254b, jVar.E()));
    }

    public k a0(int i10) {
        return i10 == this.f340254b ? this : U(this.f340253a, i10);
    }

    @Override // org.threeten.bp.temporal.g
    public org.threeten.bp.temporal.e b(org.threeten.bp.temporal.e eVar) {
        if (!org.threeten.bp.chrono.j.v(eVar).equals(org.threeten.bp.chrono.o.f339936e)) {
            throw new org.threeten.bp.b("Adjustment only supported on ISO date-time");
        }
        org.threeten.bp.temporal.e eVarO = eVar.o(org.threeten.bp.temporal.a.f340334h3, this.f340253a);
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.f340349p0;
        return eVarO.o(aVar, Math.min(eVarO.c(aVar).d(), this.f340254b));
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.o c(org.threeten.bp.temporal.j jVar) {
        if (jVar == org.threeten.bp.temporal.a.f340334h3) {
            return jVar.range();
        }
        return jVar == org.threeten.bp.temporal.a.f340349p0 ? org.threeten.bp.temporal.o.l(1L, H().H(), H().E()) : super.c(jVar);
    }

    public k c0(int i10) {
        return Z(j.L(i10));
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public <R> R d(org.threeten.bp.temporal.l<R> lVar) {
        return lVar == org.threeten.bp.temporal.k.a() ? (R) org.threeten.bp.chrono.o.f339936e : (R) super.d(lVar);
    }

    void d0(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.f340253a);
        dataOutput.writeByte(this.f340254b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f340253a == kVar.f340253a && this.f340254b == kVar.f340254b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f340253a << 6) + this.f340254b;
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public int l(org.threeten.bp.temporal.j jVar) {
        return c(jVar).a(t(jVar), jVar);
    }

    @Override // org.threeten.bp.temporal.f
    public boolean q(org.threeten.bp.temporal.j jVar) {
        if (jVar instanceof org.threeten.bp.temporal.a) {
            return jVar == org.threeten.bp.temporal.a.f340334h3 || jVar == org.threeten.bp.temporal.a.f340349p0;
        }
        return jVar != null && jVar.c(this);
    }

    @Override // org.threeten.bp.temporal.f
    public long t(org.threeten.bp.temporal.j jVar) {
        int i10;
        if (!(jVar instanceof org.threeten.bp.temporal.a)) {
            return jVar.e(this);
        }
        int i11 = b.f340255a[((org.threeten.bp.temporal.a) jVar).ordinal()];
        if (i11 != 1) {
            int i12 = 6 ^ 2;
            if (i11 != 2) {
                throw new org.threeten.bp.temporal.n("Unsupported field: " + jVar);
            }
            i10 = this.f340253a;
        } else {
            i10 = this.f340254b;
        }
        return i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append("--");
        sb2.append(this.f340253a < 10 ? com.facebook.appevents.p.f99189d0 : "");
        sb2.append(this.f340253a);
        sb2.append(this.f340254b < 10 ? "-0" : "-");
        sb2.append(this.f340254b);
        return sb2.toString();
    }

    public g w(int i10) {
        return g.C0(i10, this.f340253a, N(i10) ? this.f340254b : 28);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public int compareTo(k kVar) {
        int i10 = this.f340253a - kVar.f340253a;
        return i10 == 0 ? this.f340254b - kVar.f340254b : i10;
    }

    public String z(org.threeten.bp.format.c cVar) {
        cn.d.j(cVar, "formatter");
        return cVar.d(this);
    }
}
