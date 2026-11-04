package com.google.android.gms.internal.location;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
final class v extends c0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.location.o f108199t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(d0 d0Var, com.google.android.gms.common.api.l lVar, com.google.android.gms.location.o oVar) {
        super(lVar);
        this.f108199t = oVar;
    }

    @Override // com.google.android.gms.common.api.internal.e.a
    protected final /* bridge */ /* synthetic */ void w(com.google.android.gms.common.api.a.b bVar) throws RemoteException {
        ((d3) bVar).J0(com.google.android.gms.common.api.internal.p.c(this.f108199t, com.google.android.gms.location.o.class.getSimpleName()), true, d0.m(this));
    }
}
