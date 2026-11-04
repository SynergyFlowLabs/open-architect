package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzbb;

/* JADX INFO: loaded from: classes4.dex */
final class m extends s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ zzbb f105111f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(b bVar, int i10, zzbb zzbbVar) {
        super(1609);
        this.f105111f = zzbbVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.q
    protected final void f(com.google.android.gms.internal.auth.u uVar) throws RemoteException {
        uVar.s(this.f105116e, this.f105111f);
    }
}
