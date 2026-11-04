package com.google.android.gms.internal.location;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
final class h2 extends l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f108117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.location.j1 f108118b;

    h2(com.google.android.gms.tasks.l lVar, com.google.android.gms.location.j1 j1Var) {
        this.f108117a = lVar;
        this.f108118b = j1Var;
    }

    @Override // com.google.android.gms.internal.location.m4
    public final void j() throws RemoteException {
        this.f108118b.c();
    }

    @Override // com.google.android.gms.internal.location.m4
    public final void s3(zzl zzlVar) {
        com.google.android.gms.common.api.internal.c0.a(zzlVar.t(), this.f108117a);
    }
}
