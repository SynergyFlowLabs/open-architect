package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.location.LocationSettingsRequest;

/* JADX INFO: loaded from: classes4.dex */
final class a2 extends b2 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ LocationSettingsRequest f108083t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a2(c2 c2Var, com.google.android.gms.common.api.l lVar, LocationSettingsRequest locationSettingsRequest, String str) {
        super(lVar);
        this.f108083t = locationSettingsRequest;
    }

    @Override // com.google.android.gms.common.api.internal.e.a
    protected final /* synthetic */ void w(com.google.android.gms.common.api.a.b bVar) throws RemoteException {
        LocationSettingsRequest locationSettingsRequest = this.f108083t;
        com.google.android.gms.common.internal.w.b(locationSettingsRequest != null, "locationSettingsRequest can't be null");
        ((q4) ((d3) bVar).M()).q8(locationSettingsRequest, new j2(this), null);
    }
}
