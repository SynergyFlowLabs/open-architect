package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

/* JADX INFO: loaded from: classes4.dex */
final class n0 extends f0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ ProxyRequest f107714t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n0(q0 q0Var, com.google.android.gms.common.api.l lVar, ProxyRequest proxyRequest) {
        super(lVar);
        this.f107714t = proxyRequest;
    }

    @Override // com.google.android.gms.internal.auth.f0
    protected final void C(Context context, e0 e0Var) throws RemoteException {
        e0Var.s(new m0(this), this.f107714t);
    }
}
