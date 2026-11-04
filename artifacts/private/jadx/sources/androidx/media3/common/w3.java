package androidx.media3.common;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class w3 extends d1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f61804j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f61805k = androidx.media3.common.util.k1.c1(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f61806l = androidx.media3.common.util.k1.c1(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f61807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f61808i;

    public w3() {
        this.f61807h = false;
        this.f61808i = false;
    }

    @androidx.media3.common.util.b1
    public static w3 d(Bundle bundle) {
        int i10 = 5 >> 0;
        androidx.media3.common.util.a.a(bundle.getInt(d1.f60497g, -1) == 3);
        return bundle.getBoolean(f61805k, false) ? new w3(bundle.getBoolean(f61806l, false)) : new w3();
    }

    @Override // androidx.media3.common.d1
    public boolean b() {
        return this.f61807h;
    }

    @Override // androidx.media3.common.d1
    @androidx.media3.common.util.b1
    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f60497g, 3);
        bundle.putBoolean(f61805k, this.f61807h);
        bundle.putBoolean(f61806l, this.f61808i);
        return bundle;
    }

    public boolean e() {
        return this.f61808i;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (!(obj instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj;
        if (this.f61808i != w3Var.f61808i || this.f61807h != w3Var.f61807h) {
            return false;
        }
        int i10 = 6 | 1;
        return true;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f61807h), Boolean.valueOf(this.f61808i));
    }

    public w3(boolean z10) {
        this.f61807h = true;
        this.f61808i = z10;
    }
}
