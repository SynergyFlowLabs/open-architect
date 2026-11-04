package androidx.media3.common;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends d1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f60619j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f60620k = androidx.media3.common.util.k1.c1(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f60621l = androidx.media3.common.util.k1.c1(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f60622h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f60623i;

    public h0() {
        this.f60622h = false;
        this.f60623i = false;
    }

    @androidx.media3.common.util.b1
    public static h0 d(Bundle bundle) {
        androidx.media3.common.util.a.a(bundle.getInt(d1.f60497g, -1) == 0);
        return bundle.getBoolean(f60620k, false) ? new h0(bundle.getBoolean(f60621l, false)) : new h0();
    }

    @Override // androidx.media3.common.d1
    public boolean b() {
        return this.f60622h;
    }

    @Override // androidx.media3.common.d1
    @androidx.media3.common.util.b1
    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(d1.f60497g, 0);
        bundle.putBoolean(f60620k, this.f60622h);
        bundle.putBoolean(f60621l, this.f60623i);
        return bundle;
    }

    public boolean e() {
        return this.f60623i;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f60623i == h0Var.f60623i && this.f60622h == h0Var.f60622h;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f60622h), Boolean.valueOf(this.f60623i));
    }

    public h0(boolean z10) {
        this.f60622h = true;
        this.f60623i = z10;
    }
}
