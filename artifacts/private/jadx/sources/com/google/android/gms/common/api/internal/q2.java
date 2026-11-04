package com.google.android.gms.common.api.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
final class q2 extends d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ v.a f106187b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q2(v.a aVar, o.a aVar2) {
        super(aVar2);
        this.f106187b = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.d0
    protected final void b(com.google.android.gms.common.api.a.b bVar, com.google.android.gms.tasks.l<Boolean> lVar) throws RemoteException {
        this.f106187b.f106234b.accept(bVar, lVar);
    }
}
