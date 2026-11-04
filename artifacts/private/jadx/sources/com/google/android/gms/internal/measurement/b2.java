package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class b2 extends n0 implements e2 {
    b2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final int c() throws RemoteException {
        Parcel parcelI = i(2, k());
        int i10 = parcelI.readInt();
        parcelI.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final void s1(String str, String str2, Bundle bundle, long j10) throws RemoteException {
        Parcel parcelK = k();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        p0.c(parcelK, bundle);
        parcelK.writeLong(j10);
        n(1, parcelK);
    }
}
