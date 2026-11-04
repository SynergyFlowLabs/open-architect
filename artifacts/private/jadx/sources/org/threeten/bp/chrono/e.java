package org.threeten.bp.chrono;

import io.intercom.android.sdk.models.AttributeType;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import org.threeten.bp.chrono.c;

/* JADX INFO: loaded from: classes14.dex */
final class e<D extends c> extends d<D> implements org.threeten.bp.temporal.e, org.threeten.bp.temporal.g, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f339858d = 4556003607393004514L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f339859e = 24;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f339860f = 60;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f339861g = 1440;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f339862h = 60;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f339863i = 3600;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f339864j = 86400;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f339865k = 86400000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f339866l = 86400000000L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f339867m = 1000000000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f339868n = 60000000000L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f339869o = 3600000000000L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f339870s = 86400000000000L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D f339871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final org.threeten.bp.i f339872c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f339873a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.b.values().length];
            f339873a = iArr;
            try {
                iArr[org.threeten.bp.temporal.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f339873a[org.threeten.bp.temporal.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f339873a[org.threeten.bp.temporal.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f339873a[org.threeten.bp.temporal.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f339873a[org.threeten.bp.temporal.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f339873a[org.threeten.bp.temporal.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f339873a[org.threeten.bp.temporal.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private e(D d10, org.threeten.bp.i iVar) {
        cn.d.j(d10, AttributeType.DATE);
        cn.d.j(iVar, "time");
        this.f339871b = d10;
        this.f339872c = iVar;
    }

    static <R extends c> e<R> Z(R r10, org.threeten.bp.i iVar) {
        return new e<>(r10, iVar);
    }

    private e<D> c0(long j10) {
        return j0(this.f339871b.v(j10, org.threeten.bp.temporal.b.DAYS), this.f339872c);
    }

    private e<D> d0(long j10) {
        return h0(this.f339871b, j10, 0L, 0L, 0L);
    }

    private e<D> e0(long j10) {
        return h0(this.f339871b, 0L, j10, 0L, 0L);
    }

    private e<D> f0(long j10) {
        return h0(this.f339871b, 0L, 0L, 0L, j10);
    }

    private e<D> h0(D d10, long j10, long j11, long j12, long j13) {
        if ((j10 | j11 | j12 | j13) == 0) {
            return j0(d10, this.f339872c);
        }
        long j14 = (j13 / f339870s) + (j12 / 86400) + (j11 / 1440) + (j10 / 24);
        long j15 = (j13 % f339870s) + ((j12 % 86400) * 1000000000) + ((j11 % 1440) * f339868n) + ((j10 % 24) * f339869o);
        long jT0 = this.f339872c.t0();
        long j16 = j15 + jT0;
        long jE = j14 + cn.d.e(j16, f339870s);
        long jH = cn.d.h(j16, f339870s);
        return j0(d10.v(jE, org.threeten.bp.temporal.b.DAYS), jH == jT0 ? this.f339872c : org.threeten.bp.i.h0(jH));
    }

    static d<?> i0(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        return ((c) objectInput.readObject()).w((org.threeten.bp.i) objectInput.readObject());
    }

    private e<D> j0(org.threeten.bp.temporal.e eVar, org.threeten.bp.i iVar) {
        D d10 = this.f339871b;
        return (d10 == eVar && this.f339872c == iVar) ? this : new e<>(d10.E().q(eVar), iVar);
    }

    private Object writeReplace() {
        return new w(com.google.common.base.c.f116461n, this);
    }

    @Override // org.threeten.bp.chrono.d
    public D V() {
        return this.f339871b;
    }

    @Override // org.threeten.bp.chrono.d
    public org.threeten.bp.i W() {
        return this.f339872c;
    }

    @Override // org.threeten.bp.chrono.d, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public e<D> v(long j10, org.threeten.bp.temporal.m mVar) {
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return this.f339871b.E().r(mVar.b(this, j10));
        }
        switch (a.f339873a[((org.threeten.bp.temporal.b) mVar).ordinal()]) {
            case 1:
                return f0(j10);
            case 2:
                return c0(j10 / f339866l).f0((j10 % f339866l) * 1000);
            case 3:
                return c0(j10 / 86400000).f0((j10 % 86400000) * 1000000);
            case 4:
                return g0(j10);
            case 5:
                return e0(j10);
            case 6:
                return d0(j10);
            case 7:
                return c0(j10 / 256).d0((j10 % 256) * 12);
            default:
                return j0(this.f339871b.v(j10, mVar), this.f339872c);
        }
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public org.threeten.bp.temporal.o c(org.threeten.bp.temporal.j jVar) {
        if (jVar instanceof org.threeten.bp.temporal.a) {
            return jVar.isTimeBased() ? this.f339872c.c(jVar) : this.f339871b.c(jVar);
        }
        return jVar.d(this);
    }

    @Override // org.threeten.bp.temporal.e
    public boolean e(org.threeten.bp.temporal.m mVar) {
        int i10 = 4 | 0;
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return mVar != null && mVar.c(this);
        }
        if (!mVar.isDateBased() && !mVar.isTimeBased()) {
            return false;
        }
        return true;
    }

    e<D> g0(long j10) {
        return h0(this.f339871b, 0L, 0L, j10, 0L);
    }

    @Override // org.threeten.bp.temporal.e
    public long k(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        d<?> dVarZ = V().E().z(eVar);
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return mVar.d(this, dVarZ);
        }
        org.threeten.bp.temporal.b bVar = (org.threeten.bp.temporal.b) mVar;
        if (!bVar.isTimeBased()) {
            c cVarV = dVarZ.V();
            if (dVarZ.W().T(this.f339872c)) {
                cVarV = cVarV.f(1L, org.threeten.bp.temporal.b.DAYS);
            }
            return this.f339871b.k(cVarV, mVar);
        }
        org.threeten.bp.temporal.a aVar = org.threeten.bp.temporal.a.H1;
        long jT = dVarZ.t(aVar) - this.f339871b.t(aVar);
        switch (a.f339873a[bVar.ordinal()]) {
            case 1:
                jT = cn.d.o(jT, f339870s);
                break;
            case 2:
                jT = cn.d.o(jT, f339866l);
                break;
            case 3:
                jT = cn.d.o(jT, 86400000L);
                break;
            case 4:
                jT = cn.d.n(jT, f339864j);
                break;
            case 5:
                jT = cn.d.n(jT, f339861g);
                break;
            case 6:
                jT = cn.d.n(jT, 24);
                break;
            case 7:
                jT = cn.d.n(jT, 2);
                break;
        }
        return cn.d.l(jT, this.f339872c.k(dVarZ.W(), mVar));
    }

    @Override // org.threeten.bp.chrono.d, cn.b, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public e<D> s(org.threeten.bp.temporal.g gVar) {
        if (gVar instanceof c) {
            return j0((c) gVar, this.f339872c);
        }
        if (gVar instanceof org.threeten.bp.i) {
            return j0(this.f339871b, (org.threeten.bp.i) gVar);
        }
        return gVar instanceof e ? this.f339871b.E().r((e) gVar) : this.f339871b.E().r((e) gVar.b(this));
    }

    @Override // cn.c, org.threeten.bp.temporal.f
    public int l(org.threeten.bp.temporal.j jVar) {
        if (jVar instanceof org.threeten.bp.temporal.a) {
            return jVar.isTimeBased() ? this.f339872c.l(jVar) : this.f339871b.l(jVar);
        }
        return c(jVar).a(t(jVar), jVar);
    }

    @Override // org.threeten.bp.chrono.d, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public e<D> o(org.threeten.bp.temporal.j jVar, long j10) {
        if (jVar instanceof org.threeten.bp.temporal.a) {
            return jVar.isTimeBased() ? j0(this.f339871b, this.f339872c.o(jVar, j10)) : j0(this.f339871b.o(jVar, j10), this.f339872c);
        }
        return this.f339871b.E().r(jVar.b(this, j10));
    }

    @Override // org.threeten.bp.temporal.f
    public boolean q(org.threeten.bp.temporal.j jVar) {
        if (jVar instanceof org.threeten.bp.temporal.a) {
            return jVar.isDateBased() || jVar.isTimeBased();
        }
        return jVar != null && jVar.c(this);
    }

    @Override // org.threeten.bp.temporal.f
    public long t(org.threeten.bp.temporal.j jVar) {
        if (jVar instanceof org.threeten.bp.temporal.a) {
            return jVar.isTimeBased() ? this.f339872c.t(jVar) : this.f339871b.t(jVar);
        }
        return jVar.e(this);
    }

    @Override // org.threeten.bp.chrono.d
    public h<D> w(org.threeten.bp.r rVar) {
        return i.g0(this, rVar, null);
    }

    void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f339871b);
        objectOutput.writeObject(this.f339872c);
    }
}
