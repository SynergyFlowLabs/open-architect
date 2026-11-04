package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes4.dex */
final class p2 extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ v.a f106165e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p2(v.a aVar, o oVar, Feature[] featureArr, boolean z10, int i10) {
        super(oVar, featureArr, z10, i10);
        this.f106165e = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.u
    protected final void d(com.google.android.gms.common.api.a.b bVar, com.google.android.gms.tasks.l<Void> lVar) throws RemoteException {
        this.f106165e.f106233a.accept(bVar, lVar);
    }
}
