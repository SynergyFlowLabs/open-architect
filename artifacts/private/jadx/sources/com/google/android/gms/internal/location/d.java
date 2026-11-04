package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class d extends f {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ long f108092t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final /* synthetic */ PendingIntent f108093u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(g gVar, com.google.android.gms.common.api.l lVar, long j10, PendingIntent pendingIntent) {
        super(lVar);
        this.f108092t = j10;
        this.f108093u = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.e.a
    protected final /* bridge */ /* synthetic */ void w(com.google.android.gms.common.api.a.b bVar) throws RemoteException {
        PendingIntent pendingIntent = this.f108093u;
        e4 e4Var = (e4) bVar;
        com.google.android.gms.common.internal.w.r(pendingIntent);
        long j10 = this.f108092t;
        com.google.android.gms.common.internal.w.b(j10 >= 0, "detectionIntervalMillis must be >= 0");
        ((q4) e4Var.M()).W6(j10, true, pendingIntent);
        o(Status.f105886f);
    }
}
