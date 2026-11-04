package androidx.media3.common;

import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Surface f61716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f61717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f61718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f61719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f61720e;

    public v3(Surface surface, int i10, int i11) {
        this(surface, i10, i11, 0);
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3)) {
            return false;
        }
        v3 v3Var = (v3) obj;
        return this.f61717b == v3Var.f61717b && this.f61718c == v3Var.f61718c && this.f61719d == v3Var.f61719d && this.f61720e == v3Var.f61720e && this.f61716a.equals(v3Var.f61716a);
    }

    public int hashCode() {
        return (((((((this.f61716a.hashCode() * 31) + this.f61717b) * 31) + this.f61718c) * 31) + this.f61719d) * 31) + (this.f61720e ? 1 : 0);
    }

    public v3(Surface surface, int i10, int i11, int i12) {
        this(surface, i10, i11, i12, false);
    }

    public v3(Surface surface, int i10, int i11, int i12, boolean z10) {
        androidx.media3.common.util.a.b(i12 == 0 || i12 == 90 || i12 == 180 || i12 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.f61716a = surface;
        this.f61717b = i10;
        this.f61718c = i11;
        this.f61719d = i12;
        this.f61720e = z10;
    }
}
