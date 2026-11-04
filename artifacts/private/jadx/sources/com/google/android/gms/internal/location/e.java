package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class e extends f {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ PendingIntent f108100t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(g gVar, com.google.android.gms.common.api.l lVar, PendingIntent pendingIntent) {
        super(lVar);
        this.f108100t = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.e.a
    protected final /* bridge */ /* synthetic */ void w(com.google.android.gms.common.api.a.b bVar) throws RemoteException {
        ((e4) bVar).w0(this.f108100t);
        o(Status.f105886f);
    }
}
