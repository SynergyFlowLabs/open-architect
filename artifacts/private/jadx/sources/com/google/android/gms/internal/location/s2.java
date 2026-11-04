package com.google.android.gms.internal.location;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
final class s2 extends l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f108184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.location.m1 f108185b;

    s2(com.google.android.gms.tasks.l lVar, com.google.android.gms.location.m1 m1Var) {
        this.f108184a = lVar;
        this.f108185b = m1Var;
    }

    @Override // com.google.android.gms.internal.location.m4
    public final void j() throws RemoteException {
        this.f108185b.j();
    }

    @Override // com.google.android.gms.internal.location.m4
    public final void s3(zzl zzlVar) {
        com.google.android.gms.common.api.internal.c0.a(zzlVar.t(), this.f108184a);
    }
}
