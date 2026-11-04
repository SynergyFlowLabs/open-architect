package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.b0;

/* JADX INFO: loaded from: classes4.dex */
abstract class q extends b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected com.google.android.gms.tasks.l f105114d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* synthetic */ q(int i10, p pVar) {
        super(null, false, i10);
        int i11 = 1 << 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.b0
    protected final /* bridge */ /* synthetic */ void b(com.google.android.gms.common.api.a.b bVar, com.google.android.gms.tasks.l lVar) throws RemoteException {
        this.f105114d = lVar;
        f((com.google.android.gms.internal.auth.u) ((com.google.android.gms.internal.auth.q) bVar).M());
    }

    protected abstract void f(com.google.android.gms.internal.auth.u uVar) throws RemoteException;
}
