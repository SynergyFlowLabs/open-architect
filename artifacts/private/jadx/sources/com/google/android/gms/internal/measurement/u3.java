package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
final class u3 extends c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.measurement.internal.v8 f108885a;

    u3(com.google.android.gms.measurement.internal.v8 v8Var) {
        this.f108885a = v8Var;
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final int c() {
        return System.identityHashCode(this.f108885a);
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final void s1(String str, String str2, Bundle bundle, long j10) {
        this.f108885a.a(str, str2, bundle, j10);
    }
}
