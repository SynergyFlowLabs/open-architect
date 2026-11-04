package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends com.google.android.gms.internal.base.a implements IInterface {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void s(l lVar) throws RemoteException {
        Parcel parcelI = i();
        com.google.android.gms.internal.base.c.d(parcelI, lVar);
        p(1, parcelI);
    }
}
