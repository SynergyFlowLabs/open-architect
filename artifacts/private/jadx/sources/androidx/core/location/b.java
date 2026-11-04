package androidx.core.location;

import android.location.GnssStatus;
import android.os.Build;
import androidx.annotation.b1;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
@w0(24)
@b1({b1.a.LIBRARY})
class b extends androidx.core.location.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final GnssStatus f47877i;

    @w0(26)
    static class a {
        private a() {
        }

        static float a(GnssStatus gnssStatus, int i10) {
            return gnssStatus.getCarrierFrequencyHz(i10);
        }

        static boolean b(GnssStatus gnssStatus, int i10) {
            return gnssStatus.hasCarrierFrequencyHz(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.core.location.b$b, reason: collision with other inner class name */
    @w0(30)
    static class C0391b {
        private C0391b() {
        }

        static float a(GnssStatus gnssStatus, int i10) {
            return gnssStatus.getBasebandCn0DbHz(i10);
        }

        static boolean b(GnssStatus gnssStatus, int i10) {
            return gnssStatus.hasBasebandCn0DbHz(i10);
        }
    }

    b(Object obj) {
        this.f47877i = (GnssStatus) androidx.core.util.t.l((GnssStatus) obj);
    }

    @Override // androidx.core.location.a
    public float a(int i10) {
        return this.f47877i.getAzimuthDegrees(i10);
    }

    @Override // androidx.core.location.a
    public float b(int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0391b.a(this.f47877i, i10);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.a
    public float c(int i10) {
        return a.a(this.f47877i, i10);
    }

    @Override // androidx.core.location.a
    public float d(int i10) {
        return this.f47877i.getCn0DbHz(i10);
    }

    @Override // androidx.core.location.a
    public int e(int i10) {
        return this.f47877i.getConstellationType(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f47877i.equals(((b) obj).f47877i);
        }
        return false;
    }

    @Override // androidx.core.location.a
    public float f(int i10) {
        return this.f47877i.getElevationDegrees(i10);
    }

    @Override // androidx.core.location.a
    public int g() {
        return this.f47877i.getSatelliteCount();
    }

    @Override // androidx.core.location.a
    public int h(int i10) {
        return this.f47877i.getSvid(i10);
    }

    public int hashCode() {
        return this.f47877i.hashCode();
    }

    @Override // androidx.core.location.a
    public boolean i(int i10) {
        return this.f47877i.hasAlmanacData(i10);
    }

    @Override // androidx.core.location.a
    public boolean j(int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0391b.b(this.f47877i, i10);
        }
        return false;
    }

    @Override // androidx.core.location.a
    public boolean k(int i10) {
        return a.b(this.f47877i, i10);
    }

    @Override // androidx.core.location.a
    public boolean l(int i10) {
        return this.f47877i.hasEphemerisData(i10);
    }

    @Override // androidx.core.location.a
    public boolean m(int i10) {
        return this.f47877i.usedInFix(i10);
    }
}
