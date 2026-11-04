package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
abstract class g0 extends com.google.android.gms.common.api.internal.e.a {
    public g0(com.google.android.gms.common.api.l lVar) {
        super(com.google.android.gms.auth.api.b.f105147a, lVar);
    }

    protected abstract void C(Context context, e0 e0Var) throws RemoteException;

    @Override // com.google.android.gms.common.api.internal.e.a, com.google.android.gms.common.api.internal.e.b
    @g6.a
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        super.o((com.google.android.gms.common.api.v) obj);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.v k(Status status) {
        return new s0(status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.e.a
    protected final /* bridge */ /* synthetic */ void w(com.google.android.gms.common.api.a.b bVar) throws RemoteException {
        b0 b0Var = (b0) bVar;
        C(b0Var.G(), (e0) b0Var.M());
    }
}
