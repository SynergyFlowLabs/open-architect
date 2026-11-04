package androidx.media3.common;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends d1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f61799i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f61800j = androidx.media3.common.util.k1.c1(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f61801h;

    public w0() {
        this.f61801h = -1.0f;
    }

    @androidx.media3.common.util.b1
    public static w0 d(Bundle bundle) {
        androidx.media3.common.util.a.a(bundle.getInt(d1.f60497g, -1) == 1);
        float f10 = bundle.getFloat(f61800j, -1.0f);
        return f10 == -1.0f ? new w0() : new w0(f10);
    }

    @Override // androidx.media3.common.d1
    public boolean b() {
        return this.f61801h != -1.0f;
    }

    @Override // androidx.media3.common.d1
    @androidx.media3.common.util.b1
    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f60497g, 1);
        bundle.putFloat(f61800j, this.f61801h);
        return bundle;
    }

    public float e() {
        return this.f61801h;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        return (obj instanceof w0) && this.f61801h == ((w0) obj).f61801h;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.f61801h));
    }

    public w0(@androidx.annotation.x(from = 0.0d, to = d0.i1.f268246o) float f10) {
        androidx.media3.common.util.a.b(f10 >= 0.0f && f10 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f61801h = f10;
    }
}
