package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
public final class p1 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectionResult f106620a;

    public p1(ConnectionResult connectionResult) {
        w.b(connectionResult.e2(), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.f106620a = connectionResult;
    }
}
