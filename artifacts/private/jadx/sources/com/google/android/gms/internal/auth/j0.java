package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class j0 extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f107665a;

    j0(l0 l0Var, com.google.android.gms.tasks.l lVar) {
        this.f107665a = lVar;
    }

    @Override // com.google.android.gms.internal.auth.a0, com.google.android.gms.internal.auth.d0
    public final void P8(ProxyResponse proxyResponse) throws RemoteException {
        com.google.android.gms.common.api.internal.c0.b(new Status(proxyResponse.f105590a), proxyResponse, this.f107665a);
    }
}
