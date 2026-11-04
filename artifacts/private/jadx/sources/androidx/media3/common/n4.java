package androidx.media3.common;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class n4 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f60990e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f60991f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f60992g = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n4 f60993h = new n4(0, 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f60994i = androidx.media3.common.util.k1.c1(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f60995j = androidx.media3.common.util.k1.c1(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f60996k = androidx.media3.common.util.k1.c1(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.g0(from = 0)
    public final int f60997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.g0(from = 0)
    public final int f60998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.g0(from = 0, to = 359)
    @Deprecated
    public final int f60999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.x(from = 0.0d, fromInclusive = false)
    public final float f61000d;

    @androidx.media3.common.util.b1
    public n4(@androidx.annotation.g0(from = 0) int i10, @androidx.annotation.g0(from = 0) int i11) {
        this(i10, i11, 1.0f);
    }

    @androidx.media3.common.util.b1
    public static n4 a(Bundle bundle) {
        return new n4(bundle.getInt(f60994i, 0), bundle.getInt(f60995j, 0), bundle.getFloat(f60996k, 1.0f));
    }

    @androidx.media3.common.util.b1
    public Bundle b() {
        Bundle bundle = new Bundle();
        int i10 = this.f60997a;
        if (i10 != 0) {
            bundle.putInt(f60994i, i10);
        }
        int i11 = this.f60998b;
        if (i11 != 0) {
            bundle.putInt(f60995j, i11);
        }
        float f10 = this.f61000d;
        if (f10 != 1.0f) {
            bundle.putFloat(f60996k, f10);
        }
        return bundle;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n4) {
            n4 n4Var = (n4) obj;
            if (this.f60997a == n4Var.f60997a && this.f60998b == n4Var.f60998b && this.f61000d == n4Var.f61000d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((217 + this.f60997a) * 31) + this.f60998b) * 31) + Float.floatToRawIntBits(this.f61000d);
    }

    @androidx.media3.common.util.b1
    public n4(@androidx.annotation.g0(from = 0) int i10, @androidx.annotation.g0(from = 0) int i11, @androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10) {
        this.f60997a = i10;
        this.f60998b = i11;
        this.f60999c = 0;
        this.f61000d = f10;
    }

    @androidx.media3.common.util.b1
    @Deprecated
    public n4(@androidx.annotation.g0(from = 0) int i10, @androidx.annotation.g0(from = 0) int i11, @androidx.annotation.g0(from = 0, to = 359) int i12, @androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10) {
        this(i10, i11, f10);
    }
}
