package com.google.android.gms.internal.location;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
final class y extends c0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ boolean f108219t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(d0 d0Var, com.google.android.gms.common.api.l lVar, boolean z10) {
        super(lVar);
        this.f108219t = z10;
    }

    @Override // com.google.android.gms.common.api.internal.e.a
    protected final /* bridge */ /* synthetic */ void w(com.google.android.gms.common.api.a.b bVar) throws RemoteException {
        d3 d3Var = (d3) bVar;
        if (this.f108219t) {
            d3Var.M0(d0.m(this));
        } else {
            d3Var.N0(d0.m(this));
        }
    }
}
