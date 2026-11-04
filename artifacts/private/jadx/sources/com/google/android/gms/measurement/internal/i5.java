package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i5 extends com.google.android.gms.internal.measurement.o0 implements j5 {
    public i5() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.o0
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 2) {
            return false;
        }
        zzoq zzoqVar = (zzoq) com.google.android.gms.internal.measurement.p0.b(parcel, zzoq.CREATOR);
        com.google.android.gms.internal.measurement.p0.f(parcel);
        qe(zzoqVar);
        return true;
    }
}
