package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes4.dex */
final class z2 extends b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ b0.a f106291d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z2(b0.a aVar, Feature[] featureArr, boolean z10, int i10) {
        super(featureArr, z10, i10);
        this.f106291d = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.b0
    protected final void b(com.google.android.gms.common.api.a.b bVar, com.google.android.gms.tasks.l lVar) throws RemoteException {
        this.f106291d.f105962a.accept(bVar, lVar);
    }
}
