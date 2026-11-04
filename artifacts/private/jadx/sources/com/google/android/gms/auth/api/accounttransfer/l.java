package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzaq;

/* JADX INFO: loaded from: classes4.dex */
final class l extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ zzaq f105110e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(b bVar, int i10, zzaq zzaqVar) {
        super(1608, null);
        this.f105110e = zzaqVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.q
    protected final void f(com.google.android.gms.internal.auth.u uVar) throws RemoteException {
        uVar.p(new k(this, this), this.f105110e);
    }
}
