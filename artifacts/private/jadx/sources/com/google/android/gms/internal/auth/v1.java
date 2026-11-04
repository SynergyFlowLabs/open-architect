package com.google.android.gms.internal.auth;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Uri f107853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f107854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f107855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f107856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f107857e;

    private v1(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, @fj.h d2 d2Var) {
        this.f107853a = uri;
        this.f107854b = "";
        this.f107855c = "";
        this.f107856d = z10;
        this.f107857e = z12;
    }

    public final v1 a() {
        return new v1(null, this.f107853a, this.f107854b, this.f107855c, this.f107856d, false, true, false, null);
    }

    public final v1 b() {
        if (!this.f107854b.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        boolean z10 = true & false;
        int i10 = 7 ^ 1;
        return new v1(null, this.f107853a, this.f107854b, this.f107855c, true, false, this.f107857e, false, null);
    }

    public final z1 c(String str, double d10) {
        return new t1(this, str, Double.valueOf(0.0d), true);
    }

    public final z1 d(String str, long j10) {
        return new r1(this, str, Long.valueOf(j10), true);
    }

    public final z1 e(String str, boolean z10) {
        return new s1(this, str, Boolean.valueOf(z10), true);
    }

    public final z1 f(String str, Object obj, z6 z6Var) {
        return new u1(this, "getTokenRefactor__blocked_packages", obj, true, z6Var);
    }

    public v1(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
