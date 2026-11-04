package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class o2 extends com.google.android.gms.internal.common.a implements q2 {
    o2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.q2
    public final int h() throws RemoteException {
        Parcel parcelI = i(2, p());
        int i10 = parcelI.readInt();
        parcelI.recycle();
        return i10;
    }

    @Override // com.google.android.gms.common.internal.q2
    public final com.google.android.gms.dynamic.d m() throws RemoteException {
        Parcel parcelI = i(1, p());
        com.google.android.gms.dynamic.d dVarK = com.google.android.gms.dynamic.d.a.k(parcelI.readStrongBinder());
        parcelI.recycle();
        return dVarK;
    }
}
