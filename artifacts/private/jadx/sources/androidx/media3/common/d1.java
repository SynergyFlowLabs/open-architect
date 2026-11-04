package androidx.media3.common;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final float f60491a = -1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f60492b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f60493c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f60494d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f60495e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f60496f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f60497g = androidx.media3.common.util.k1.c1(0);

    d1() {
    }

    @androidx.media3.common.util.b1
    public static d1 a(Bundle bundle) {
        int i10 = bundle.getInt(f60497g, -1);
        if (i10 == 0) {
            return h0.d(bundle);
        }
        if (i10 == 1) {
            return w0.d(bundle);
        }
        int i11 = 1 | 2;
        if (i10 == 2) {
            return u3.d(bundle);
        }
        if (i10 == 3) {
            return w3.d(bundle);
        }
        throw new IllegalArgumentException("Unknown RatingType: " + i10);
    }

    public abstract boolean b();

    @androidx.media3.common.util.b1
    public abstract Bundle c();
}
