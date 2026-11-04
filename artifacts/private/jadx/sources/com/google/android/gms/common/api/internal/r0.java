package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
final class r0 extends k1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.internal.f.c f106190b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r0(s0 s0Var, j1 j1Var, com.google.android.gms.common.internal.f.c cVar) {
        super(j1Var);
        this.f106190b = cVar;
    }

    @Override // com.google.android.gms.common.api.internal.k1
    public final void a() {
        this.f106190b.a(new ConnectionResult(16, null));
    }
}
