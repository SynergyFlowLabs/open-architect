package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
final class w extends c0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ PendingIntent f108206t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(d0 d0Var, com.google.android.gms.common.api.l lVar, PendingIntent pendingIntent) {
        super(lVar);
        this.f108206t = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.e.a
    protected final /* bridge */ /* synthetic */ void w(com.google.android.gms.common.api.a.b bVar) throws RemoteException {
        ((d3) bVar).L0(this.f108206t, d0.m(this), null);
    }
}
