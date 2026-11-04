package org.threeten.bp.chrono;

import java.io.Serializable;
import org.threeten.bp.chrono.c;

/* JADX INFO: loaded from: classes14.dex */
abstract class b<D extends c> extends c implements org.threeten.bp.temporal.e, org.threeten.bp.temporal.g, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f339854b = 6282433883239719096L;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f339855a;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.b.values().length];
            f339855a = iArr;
            try {
                iArr[org.threeten.bp.temporal.b.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f339855a[org.threeten.bp.temporal.b.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f339855a[org.threeten.bp.temporal.b.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f339855a[org.threeten.bp.temporal.b.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f339855a[org.threeten.bp.temporal.b.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f339855a[org.threeten.bp.temporal.b.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f339855a[org.threeten.bp.temporal.b.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    b() {
    }

    @Override // org.threeten.bp.chrono.c
    public f U(c cVar) {
        throw new UnsupportedOperationException("Not supported in ThreeTen backport");
    }

    b<D> X(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = d0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.d0(j11);
    }

    b<D> Y(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = e0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.e0(j11);
    }

    b<D> Z(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = f0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.f0(j11);
    }

    b<D> a0(long j10) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            this = g0(Long.MAX_VALUE);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return this.g0(j11);
    }

    @Override // org.threeten.bp.chrono.c, org.threeten.bp.temporal.e
    /* JADX INFO: renamed from: c0 */
    public b<D> v(long j10, org.threeten.bp.temporal.m mVar) {
        if (!(mVar instanceof org.threeten.bp.temporal.b)) {
            return (b) E().q(mVar.b(this, j10));
        }
        switch (a.f339855a[((org.threeten.bp.temporal.b) mVar).ordinal()]) {
            case 1:
                return d0(j10);
            case 2:
                return d0(cn.d.n(j10, 7));
            case 3:
                return e0(j10);
            case 4:
                return g0(j10);
            case 5:
                return g0(cn.d.n(j10, 10));
            case 6:
                return g0(cn.d.n(j10, 100));
            case 7:
                return g0(cn.d.n(j10, 1000));
            default:
                throw new org.threeten.bp.b(mVar + " not valid for chronology " + E().getId());
        }
    }

    abstract b<D> d0(long j10);

    abstract b<D> e0(long j10);

    b<D> f0(long j10) {
        return d0(cn.d.n(j10, 7));
    }

    abstract b<D> g0(long j10);

    @Override // org.threeten.bp.temporal.e
    public long k(org.threeten.bp.temporal.e eVar, org.threeten.bp.temporal.m mVar) {
        c cVarE = E().e(eVar);
        return mVar instanceof org.threeten.bp.temporal.b ? org.threeten.bp.g.i0(this).k(cVarE, mVar) : mVar.d(this, cVarE);
    }

    @Override // org.threeten.bp.chrono.c
    public d<?> w(org.threeten.bp.i iVar) {
        return e.Z(this, iVar);
    }
}
