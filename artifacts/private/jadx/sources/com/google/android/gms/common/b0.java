package com.google.android.gms.common;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f106338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f106339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f106340c;

    /* synthetic */ b0(String str, boolean z10, boolean z11, boolean z12, boolean z13, zzr zzrVar, g1 g1Var) {
        this.f106338a = str;
        this.f106339b = z10;
        this.f106340c = z13;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.IBinder, com.google.android.gms.dynamic.d] */
    final zzs a(Context context) {
        return new zzs(this.f106338a, this.f106339b, false, com.google.android.gms.dynamic.f.p(context), false, true, null);
    }

    final boolean b() {
        return this.f106340c;
    }
}
