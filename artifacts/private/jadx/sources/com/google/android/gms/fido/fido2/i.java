package com.google.android.gms.fido.fido2;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.internal.fido.b1;

/* JADX INFO: loaded from: classes4.dex */
final class i extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f107331a;

    i(a aVar, com.google.android.gms.tasks.l lVar) {
        this.f107331a = lVar;
    }

    @Override // com.google.android.gms.internal.fido.c1
    public final void t(Status status, PendingIntent pendingIntent) throws RemoteException {
        c0.b(status, pendingIntent, this.f107331a);
    }
}
