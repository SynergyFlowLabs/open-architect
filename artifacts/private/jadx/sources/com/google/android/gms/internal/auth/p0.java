package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
final class p0 extends g0 {
    p0(q0 q0Var, com.google.android.gms.common.api.l lVar) {
        super(lVar);
    }

    @Override // com.google.android.gms.internal.auth.g0
    protected final void C(Context context, e0 e0Var) throws RemoteException {
        e0Var.p(new o0(this));
    }
}
