package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes4.dex */
final class l2 extends com.google.android.gms.location.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f108141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ d3 f108142b;

    l2(d3 d3Var, com.google.android.gms.tasks.l lVar) {
        this.f108141a = lVar;
        this.f108142b = d3Var;
    }

    @Override // com.google.android.gms.location.n
    public final void b(LocationResult locationResult) {
        this.f108141a.e(locationResult.b2());
        try {
            this.f108142b.K0(com.google.android.gms.common.api.internal.p.c(this, "GetCurrentLocation"), false, new com.google.android.gms.tasks.l());
        } catch (RemoteException unused) {
        }
    }
}
