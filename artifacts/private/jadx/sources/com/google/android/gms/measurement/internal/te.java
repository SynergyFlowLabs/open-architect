package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class te {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f110562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.i7 f110563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f110564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f110565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final cb f110566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f110567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f110568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f110569h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f110570i;

    /* synthetic */ te(long j10, com.google.android.gms.internal.measurement.i7 i7Var, String str, Map map, cb cbVar, long j11, long j12, long j13, int i10, byte[] bArr) {
        this.f110562a = j10;
        this.f110563b = i7Var;
        this.f110564c = str;
        this.f110565d = map;
        this.f110566e = cbVar;
        this.f110567f = j11;
        this.f110568g = j12;
        this.f110569h = j13;
        this.f110570i = i10;
    }

    public final ce a() {
        return new ce(this.f110564c, this.f110565d, this.f110566e, null);
    }

    public final zzom b() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f110565d.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        long j10 = this.f110562a;
        com.google.android.gms.internal.measurement.i7 i7Var = this.f110563b;
        String str = this.f110564c;
        cb cbVar = this.f110566e;
        return new zzom(j10, i7Var.g(), str, bundle, cbVar.a(), this.f110568g, "");
    }

    public final long c() {
        return this.f110562a;
    }

    @androidx.annotation.p0
    public final com.google.android.gms.internal.measurement.i7 d() {
        return this.f110563b;
    }

    public final String e() {
        return this.f110564c;
    }

    public final cb f() {
        return this.f110566e;
    }

    public final long g() {
        return this.f110567f;
    }

    public final long h() {
        return this.f110569h;
    }

    public final int i() {
        return this.f110570i;
    }
}
