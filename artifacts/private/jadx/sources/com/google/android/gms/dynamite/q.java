package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.s;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends com.google.android.gms.internal.common.a implements IInterface {
    q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final com.google.android.gms.dynamic.d s(com.google.android.gms.dynamic.d dVar, String str, int i10, com.google.android.gms.dynamic.d dVar2) throws RemoteException {
        Parcel parcelP = p();
        s.e(parcelP, dVar);
        parcelP.writeString(str);
        parcelP.writeInt(i10);
        s.e(parcelP, dVar2);
        Parcel parcelI = i(2, parcelP);
        com.google.android.gms.dynamic.d dVarK = com.google.android.gms.dynamic.d.a.k(parcelI.readStrongBinder());
        parcelI.recycle();
        return dVarK;
    }

    public final com.google.android.gms.dynamic.d u(com.google.android.gms.dynamic.d dVar, String str, int i10, com.google.android.gms.dynamic.d dVar2) throws RemoteException {
        Parcel parcelP = p();
        s.e(parcelP, dVar);
        parcelP.writeString(str);
        parcelP.writeInt(i10);
        s.e(parcelP, dVar2);
        Parcel parcelI = i(3, parcelP);
        com.google.android.gms.dynamic.d dVarK = com.google.android.gms.dynamic.d.a.k(parcelI.readStrongBinder());
        parcelI.recycle();
        return dVarK;
    }
}
