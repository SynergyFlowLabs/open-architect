package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class h5 extends com.google.android.gms.internal.measurement.n0 implements j5 {
    h5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.measurement.internal.j5
    public final void qe(zzoq zzoqVar) throws RemoteException {
        Parcel parcelK = k();
        com.google.android.gms.internal.measurement.p0.c(parcelK, zzoqVar);
        p(2, parcelK);
    }
}
