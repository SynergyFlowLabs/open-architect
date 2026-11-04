package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.tasks.l;

/* JADX INFO: loaded from: classes4.dex */
final class t0 extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f107540a;

    t0(u0 u0Var, l lVar) {
        this.f107540a = lVar;
    }

    @Override // com.google.android.gms.internal.p000authapi.d0
    public final void Xe(Status status, AuthorizationResult authorizationResult) throws RemoteException {
        if (status.q2()) {
            this.f107540a.c(authorizationResult);
        } else {
            this.f107540a.b(c.a(status));
        }
    }
}
