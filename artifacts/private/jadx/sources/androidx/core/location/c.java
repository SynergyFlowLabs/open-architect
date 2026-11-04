package androidx.core.location;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import androidx.annotation.b1;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
class c extends a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f47880n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f47881o = 32;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f47882p = 33;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f47883q = 64;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f47884r = -87;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f47885s = 64;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f47886t = 24;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f47887u = 193;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f47888v = 200;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f47889w = 200;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f47890x = 35;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final GpsStatus f47891i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.b0("mWrapped")
    private int f47892j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.b0("mWrapped")
    private Iterator<GpsSatellite> f47893k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.b0("mWrapped")
    private int f47894l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.b0("mWrapped")
    private GpsSatellite f47895m;

    c(GpsStatus gpsStatus) {
        GpsStatus gpsStatus2 = (GpsStatus) androidx.core.util.t.l(gpsStatus);
        this.f47891i = gpsStatus2;
        this.f47892j = -1;
        this.f47893k = gpsStatus2.getSatellites().iterator();
        this.f47894l = -1;
        this.f47895m = null;
    }

    private static int p(int i10) {
        if (i10 > 0 && i10 <= 32) {
            return 1;
        }
        if (i10 >= 33 && i10 <= 64) {
            return 2;
        }
        if (i10 > 64 && i10 <= 88) {
            return 3;
        }
        if (i10 <= 200 || i10 > 235) {
            return (i10 < f47887u || i10 > 200) ? 0 : 4;
        }
        return 5;
    }

    private GpsSatellite q(int i10) {
        GpsSatellite gpsSatellite;
        synchronized (this.f47891i) {
            try {
                if (i10 < this.f47894l) {
                    this.f47893k = this.f47891i.getSatellites().iterator();
                    this.f47894l = -1;
                }
                while (true) {
                    int i11 = this.f47894l;
                    if (i11 >= i10) {
                        break;
                    }
                    this.f47894l = i11 + 1;
                    if (!this.f47893k.hasNext()) {
                        this.f47895m = null;
                        break;
                    }
                    this.f47895m = this.f47893k.next();
                }
                gpsSatellite = this.f47895m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (GpsSatellite) androidx.core.util.t.l(gpsSatellite);
    }

    private static int r(int i10) {
        int iP = p(i10);
        if (iP == 2) {
            return i10 + 87;
        }
        if (iP != 3) {
            return iP != 5 ? i10 : i10 - 200;
        }
        return i10 - 64;
    }

    @Override // androidx.core.location.a
    public float a(int i10) {
        return q(i10).getAzimuth();
    }

    @Override // androidx.core.location.a
    public float b(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.a
    public float c(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.a
    public float d(int i10) {
        return q(i10).getSnr();
    }

    @Override // androidx.core.location.a
    public int e(int i10) {
        return p(q(i10).getPrn());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f47891i.equals(((c) obj).f47891i);
        }
        return false;
    }

    @Override // androidx.core.location.a
    public float f(int i10) {
        return q(i10).getElevation();
    }

    @Override // androidx.core.location.a
    public int g() {
        int i10;
        synchronized (this.f47891i) {
            try {
                if (this.f47892j == -1) {
                    for (GpsSatellite gpsSatellite : this.f47891i.getSatellites()) {
                        this.f47892j++;
                    }
                    this.f47892j++;
                }
                i10 = this.f47892j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    @Override // androidx.core.location.a
    public int h(int i10) {
        return r(q(i10).getPrn());
    }

    public int hashCode() {
        return this.f47891i.hashCode();
    }

    @Override // androidx.core.location.a
    public boolean i(int i10) {
        return q(i10).hasAlmanac();
    }

    @Override // androidx.core.location.a
    public boolean j(int i10) {
        return false;
    }

    @Override // androidx.core.location.a
    public boolean k(int i10) {
        return false;
    }

    @Override // androidx.core.location.a
    public boolean l(int i10) {
        return q(i10).hasEphemeris();
    }

    @Override // androidx.core.location.a
    public boolean m(int i10) {
        return q(i10).usedInFix();
    }
}
