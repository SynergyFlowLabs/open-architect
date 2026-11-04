package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
final class q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f106188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConnectionResult f106189b;

    q3(ConnectionResult connectionResult, int i10) {
        com.google.android.gms.common.internal.w.r(connectionResult);
        this.f106189b = connectionResult;
        this.f106188a = i10;
    }

    final int a() {
        return this.f106188a;
    }

    final ConnectionResult b() {
        return this.f106189b;
    }
}
