package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zak;

/* JADX INFO: loaded from: classes4.dex */
final class v2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zak f106243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ x2 f106244b;

    v2(x2 x2Var, zak zakVar) {
        this.f106243a = zakVar;
        this.f106244b = x2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x2.u(this.f106244b, this.f106243a);
    }
}
