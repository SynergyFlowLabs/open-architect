package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
final class r1 extends t1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ PendingIntent f108177t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r1(u1 u1Var, com.google.android.gms.common.api.l lVar, PendingIntent pendingIntent) {
        super(lVar);
        this.f108177t = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.e.a
    protected final /* bridge */ /* synthetic */ void w(com.google.android.gms.common.api.a.b bVar) throws RemoteException {
        ((d3) bVar).B0(zzem.T1(this.f108177t), u1.e(this));
    }
}
