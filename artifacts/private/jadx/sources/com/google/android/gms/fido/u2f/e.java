package com.google.android.gms.fido.u2f;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.internal.fido.e1;
import com.google.android.gms.internal.fido.f1;
import com.google.android.gms.tasks.l;

/* JADX INFO: loaded from: classes4.dex */
final class e extends f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f107460a;

    e(a aVar, l lVar) {
        this.f107460a = lVar;
    }

    @Override // com.google.android.gms.internal.fido.g1
    public final void t(Status status, PendingIntent pendingIntent) throws RemoteException {
        c0.b(status, new e1(pendingIntent), this.f107460a);
    }
}
