package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes4.dex */
final class t extends c0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.internal.o f108188t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final /* synthetic */ LocationRequest f108189u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(d0 d0Var, com.google.android.gms.common.api.l lVar, com.google.android.gms.common.api.internal.o oVar, LocationRequest locationRequest) {
        super(lVar);
        this.f108188t = oVar;
        this.f108189u = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.e.a
    protected final /* bridge */ /* synthetic */ void w(com.google.android.gms.common.api.a.b bVar) throws RemoteException {
        ((d3) bVar).H0(new a0(this.f108188t), this.f108189u, d0.m(this));
    }
}
