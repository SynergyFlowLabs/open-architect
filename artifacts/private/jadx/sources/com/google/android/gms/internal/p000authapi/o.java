package com.google.android.gms.internal.p000authapi;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.tasks.l;

/* JADX INFO: loaded from: classes4.dex */
final class o extends k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f107519a;

    o(q qVar, l lVar) {
        this.f107519a = lVar;
    }

    @Override // com.google.android.gms.internal.p000authapi.l0
    public final void y0(Status status, PendingIntent pendingIntent) throws RemoteException {
        c0.b(status, pendingIntent, this.f107519a);
    }
}
