package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes4.dex */
final class z2 extends com.google.android.gms.location.i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v2 f108227a;

    z2(v2 v2Var) {
        this.f108227a = v2Var;
    }

    @Override // com.google.android.gms.location.j1
    public final void U2(LocationAvailability locationAvailability) throws RemoteException {
        this.f108227a.a().d(new x2(this, locationAvailability));
    }

    @Override // com.google.android.gms.location.j1
    public final void c() {
        this.f108227a.a().d(new y2(this));
    }

    final z2 n(com.google.android.gms.common.api.internal.o oVar) {
        this.f108227a.b(oVar);
        return this;
    }

    final void p() {
        this.f108227a.a().a();
    }

    final /* synthetic */ v2 s() {
        return this.f108227a;
    }

    @Override // com.google.android.gms.location.j1
    public final void sc(LocationResult locationResult) throws RemoteException {
        this.f108227a.a().d(new w2(this, locationResult));
    }
}
