package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class v1 extends n0 implements x1 {
    v1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.x1
    public final void r(Bundle bundle) throws RemoteException {
        Parcel parcelK = k();
        p0.c(parcelK, bundle);
        n(1, parcelK);
    }
}
