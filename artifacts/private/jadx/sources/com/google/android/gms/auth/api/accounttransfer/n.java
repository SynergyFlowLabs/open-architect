package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzav;

/* JADX INFO: loaded from: classes4.dex */
final class n extends s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ zzav f105112f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(b bVar, int i10, zzav zzavVar) {
        super(1610);
        this.f105112f = zzavVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.q
    protected final void f(com.google.android.gms.internal.auth.u uVar) throws RemoteException {
        uVar.u(this.f105116e, this.f105112f);
    }
}
