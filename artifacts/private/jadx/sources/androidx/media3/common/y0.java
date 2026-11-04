package androidx.media3.common;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y0 f61871d = new y0(1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f61872e = androidx.media3.common.util.k1.c1(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f61873f = androidx.media3.common.util.k1.c1(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f61874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f61875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f61876c;

    public y0(@androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10) {
        this(f10, 1.0f);
    }

    @androidx.media3.common.util.b1
    public static y0 a(Bundle bundle) {
        return new y0(bundle.getFloat(f61872e, 1.0f), bundle.getFloat(f61873f, 1.0f));
    }

    @androidx.media3.common.util.b1
    public long b(long j10) {
        return j10 * ((long) this.f61876c);
    }

    @androidx.media3.common.util.b1
    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putFloat(f61872e, this.f61874a);
        bundle.putFloat(f61873f, this.f61875b);
        return bundle;
    }

    @androidx.annotation.j
    public y0 d(@androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10) {
        return new y0(f10, this.f61875b);
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y0.class == obj.getClass()) {
            y0 y0Var = (y0) obj;
            if (this.f61874a == y0Var.f61874a && this.f61875b == y0Var.f61875b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f61874a)) * 31) + Float.floatToRawIntBits(this.f61875b);
    }

    public String toString() {
        return androidx.media3.common.util.k1.S("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f61874a), Float.valueOf(this.f61875b));
    }

    public y0(@androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10, @androidx.annotation.x(from = 0.0d, fromInclusive = false) float f11) {
        androidx.media3.common.util.a.a(f10 > 0.0f);
        androidx.media3.common.util.a.a(f11 > 0.0f);
        this.f61874a = f10;
        this.f61875b = f11;
        this.f61876c = Math.round(f10 * 1000.0f);
    }
}
