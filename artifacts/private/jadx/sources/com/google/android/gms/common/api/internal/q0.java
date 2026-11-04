package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
final class q0 extends k1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ConnectionResult f106184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ s0 f106185c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q0(s0 s0Var, j1 j1Var, ConnectionResult connectionResult) {
        super(j1Var);
        this.f106184b = connectionResult;
        this.f106185c = s0Var;
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void a() {
        this.f106185c.f106197c.l(this.f106184b);
    }
}
