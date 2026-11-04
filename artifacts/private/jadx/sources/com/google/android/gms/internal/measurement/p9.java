package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class p9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @fj.h
    final Uri f108733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f108734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f108735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f108736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f108737e;

    private p9(@fj.h String str, @fj.h Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, @fj.h com.google.common.base.t tVar) {
        this.f108733a = uri;
        this.f108734b = "";
        this.f108735c = "";
        this.f108736d = z10;
        this.f108737e = z12;
    }

    public final p9 a() {
        String str = this.f108734b;
        if (!str.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        int i10 = 3 ^ 0;
        return new p9(null, this.f108733a, str, this.f108735c, true, false, this.f108737e, false, null);
    }

    public final p9 b() {
        return new p9(null, this.f108733a, this.f108734b, this.f108735c, this.f108736d, false, true, false, null);
    }

    public final v9 c(String str, long j10) {
        Long lValueOf = Long.valueOf(j10);
        int i10 = v9.f108922k;
        return new l9(this, str, lValueOf, true);
    }

    public final v9 d(String str, boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        int i10 = v9.f108922k;
        return new m9(this, str, boolValueOf, true);
    }

    public final v9 e(String str, double d10) {
        Double dValueOf = Double.valueOf(-3.0d);
        int i10 = v9.f108922k;
        return new n9(this, "measurement.test.double_flag", dValueOf, true);
    }

    public final v9 f(String str, String str2) {
        int i10 = v9.f108922k;
        return new o9(this, str, str2, true);
    }

    public p9(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
