package androidx.media3.common;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class u3 extends d1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f61455j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f61456k = 5;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f61457l = androidx.media3.common.util.k1.c1(1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f61458m = androidx.media3.common.util.k1.c1(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.g0(from = 1)
    private final int f61459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f61460i;

    public u3(@androidx.annotation.g0(from = 1) int i10) {
        androidx.media3.common.util.a.b(i10 > 0, "maxStars must be a positive integer");
        this.f61459h = i10;
        this.f61460i = -1.0f;
    }

    @androidx.media3.common.util.b1
    public static u3 d(Bundle bundle) {
        androidx.media3.common.util.a.a(bundle.getInt(d1.f60497g, -1) == 2);
        int i10 = bundle.getInt(f61457l, 5);
        float f10 = bundle.getFloat(f61458m, -1.0f);
        return f10 == -1.0f ? new u3(i10) : new u3(i10, f10);
    }

    @Override // androidx.media3.common.d1
    public boolean b() {
        return this.f61460i != -1.0f;
    }

    @Override // androidx.media3.common.d1
    @androidx.media3.common.util.b1
    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f60497g, 2);
        bundle.putInt(f61457l, this.f61459h);
        bundle.putFloat(f61458m, this.f61460i);
        return bundle;
    }

    @androidx.annotation.g0(from = 1)
    public int e() {
        return this.f61459h;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (!(obj instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj;
        return this.f61459h == u3Var.f61459h && this.f61460i == u3Var.f61460i;
    }

    public float f() {
        return this.f61460i;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f61459h), Float.valueOf(this.f61460i));
    }

    public u3(@androidx.annotation.g0(from = 1) int i10, @androidx.annotation.x(from = 0.0d) float f10) {
        boolean z10 = false;
        androidx.media3.common.util.a.b(i10 > 0, "maxStars must be a positive integer");
        if (f10 >= 0.0f && f10 <= i10) {
            z10 = true;
        }
        androidx.media3.common.util.a.b(z10, "starRating is out of range [0, maxStars]");
        this.f61459h = i10;
        this.f61460i = f10;
    }
}
