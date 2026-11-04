package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: loaded from: classes4.dex */
final class u extends c0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ PendingIntent f108193t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final /* synthetic */ LocationRequest f108194u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(d0 d0Var, com.google.android.gms.common.api.l lVar, PendingIntent pendingIntent, LocationRequest locationRequest) {
        super(lVar);
        this.f108193t = pendingIntent;
        this.f108194u = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.e.a
    protected final /* bridge */ /* synthetic */ void w(com.google.android.gms.common.api.a.b bVar) throws RemoteException {
        ((d3) bVar).I0(this.f108193t, this.f108194u, d0.m(this));
    }
}
