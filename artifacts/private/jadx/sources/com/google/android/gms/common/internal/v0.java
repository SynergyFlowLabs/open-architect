package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class v0 extends com.google.android.gms.internal.base.a implements IInterface {
    v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final com.google.android.gms.dynamic.d s(com.google.android.gms.dynamic.d dVar, zax zaxVar) throws RemoteException {
        Parcel parcelI = i();
        com.google.android.gms.internal.base.c.d(parcelI, dVar);
        com.google.android.gms.internal.base.c.c(parcelI, zaxVar);
        Parcel parcelK = k(2, parcelI);
        com.google.android.gms.dynamic.d dVarK = com.google.android.gms.dynamic.d.a.k(parcelK.readStrongBinder());
        parcelK.recycle();
        return dVarK;
    }
}
