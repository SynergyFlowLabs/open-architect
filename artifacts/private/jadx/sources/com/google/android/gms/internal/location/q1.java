package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.location.GeofencingRequest;

/* JADX INFO: loaded from: classes4.dex */
final class q1 extends t1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ GeofencingRequest f108172t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final /* synthetic */ PendingIntent f108173u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q1(u1 u1Var, com.google.android.gms.common.api.l lVar, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        super(lVar);
        this.f108172t = geofencingRequest;
        this.f108173u = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.e.a
    protected final /* bridge */ /* synthetic */ void w(com.google.android.gms.common.api.a.b bVar) throws RemoteException {
        ((d3) bVar).A0(this.f108172t, this.f108173u, u1.e(this));
    }
}
