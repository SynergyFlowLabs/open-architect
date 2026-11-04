package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class k0 extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f107677a;

    k0(l0 l0Var, com.google.android.gms.tasks.l lVar) {
        this.f107677a = lVar;
    }

    @Override // com.google.android.gms.internal.auth.a0, com.google.android.gms.internal.auth.d0
    public final void v5(String str) throws RemoteException {
        com.google.android.gms.common.api.internal.c0.b(str != null ? Status.f105886f : new Status(com.google.android.gms.auth.api.proxy.a.f105602z), str, this.f107677a);
    }
}
