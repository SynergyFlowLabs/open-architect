package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 extends n0 implements s0 {
    q0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.s0
    public final Bundle D6(Bundle bundle) throws RemoteException {
        Parcel parcelK = k();
        p0.c(parcelK, bundle);
        Parcel parcelI = i(1, parcelK);
        Bundle bundle2 = (Bundle) p0.b(parcelI, Bundle.CREATOR);
        parcelI.recycle();
        return bundle2;
    }
}
