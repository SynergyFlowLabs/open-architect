package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzaz;

/* JADX INFO: loaded from: classes4.dex */
final class h extends s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ zzaz f105106f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(b bVar, int i10, zzaz zzazVar) {
        super(1606);
        this.f105106f = zzazVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.q
    protected final void f(com.google.android.gms.internal.auth.u uVar) throws RemoteException {
        uVar.w(this.f105116e, this.f105106f);
    }
}
