package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e5 extends com.google.android.gms.internal.measurement.n0 implements g5 {
    e5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.measurement.internal.g5
    public final void Ib(List list) throws RemoteException {
        Parcel parcelK = k();
        parcelK.writeTypedList(list);
        p(2, parcelK);
    }
}
