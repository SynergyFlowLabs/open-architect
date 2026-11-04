package com.google.android.gms.internal.location;

import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class s1 extends t1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ List f108183t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s1(u1 u1Var, com.google.android.gms.common.api.l lVar, List list) {
        super(lVar);
        this.f108183t = list;
    }

    @Override // com.google.android.gms.common.api.internal.e.a
    protected final /* bridge */ /* synthetic */ void w(com.google.android.gms.common.api.a.b bVar) throws RemoteException {
        ((d3) bVar).B0(zzem.O1(this.f108183t), u1.e(this));
    }
}
