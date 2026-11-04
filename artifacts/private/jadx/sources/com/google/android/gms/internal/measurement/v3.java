package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
final class v3 extends c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.w8 f108914a;

    v3(com.google.android.gms.measurement.internal.w8 w8Var) {
        this.f108914a = w8Var;
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final int c() {
        return System.identityHashCode(this.f108914a);
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final void s1(String str, String str2, Bundle bundle, long j10) {
        this.f108914a.a(str, str2, bundle, j10);
    }
}
