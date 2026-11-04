package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
final class u2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ x2 f106229a;

    u2(x2 x2Var) {
        this.f106229a = x2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f106229a.f106263g.d(new ConnectionResult(4));
    }
}
