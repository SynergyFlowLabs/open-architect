package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzax;

/* JADX INFO: loaded from: classes4.dex */
final class j extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ zzax f105108e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(b bVar, int i10, zzax zzaxVar) {
        super(1607, null);
        this.f105108e = zzaxVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.q
    protected final void f(com.google.android.gms.internal.auth.u uVar) throws RemoteException {
        uVar.v(new i(this, this), this.f105108e);
    }
}
