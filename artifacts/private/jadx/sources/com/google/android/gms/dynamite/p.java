package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.s;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends com.google.android.gms.internal.common.a implements IInterface {
    p(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final com.google.android.gms.dynamic.d L(com.google.android.gms.dynamic.d dVar, String str, int i10, com.google.android.gms.dynamic.d dVar2) throws RemoteException {
        Parcel parcelP = p();
        s.e(parcelP, dVar);
        parcelP.writeString(str);
        parcelP.writeInt(i10);
        s.e(parcelP, dVar2);
        Parcel parcelI = i(8, parcelP);
        com.google.android.gms.dynamic.d dVarK = com.google.android.gms.dynamic.d.a.k(parcelI.readStrongBinder());
        parcelI.recycle();
        return dVarK;
    }

    public final com.google.android.gms.dynamic.d M(com.google.android.gms.dynamic.d dVar, String str, int i10) throws RemoteException {
        Parcel parcelP = p();
        s.e(parcelP, dVar);
        parcelP.writeString(str);
        parcelP.writeInt(i10);
        Parcel parcelI = i(4, parcelP);
        com.google.android.gms.dynamic.d dVarK = com.google.android.gms.dynamic.d.a.k(parcelI.readStrongBinder());
        parcelI.recycle();
        return dVarK;
    }

    public final com.google.android.gms.dynamic.d O(com.google.android.gms.dynamic.d dVar, String str, boolean z10, long j10) throws RemoteException {
        Parcel parcelP = p();
        s.e(parcelP, dVar);
        parcelP.writeString(str);
        parcelP.writeInt(z10 ? 1 : 0);
        parcelP.writeLong(j10);
        Parcel parcelI = i(7, parcelP);
        com.google.android.gms.dynamic.d dVarK = com.google.android.gms.dynamic.d.a.k(parcelI.readStrongBinder());
        parcelI.recycle();
        return dVarK;
    }

    public final int s() throws RemoteException {
        Parcel parcelI = i(6, p());
        int i10 = parcelI.readInt();
        parcelI.recycle();
        return i10;
    }

    public final int u(com.google.android.gms.dynamic.d dVar, String str, boolean z10) throws RemoteException {
        Parcel parcelP = p();
        s.e(parcelP, dVar);
        parcelP.writeString(str);
        parcelP.writeInt(z10 ? 1 : 0);
        Parcel parcelI = i(3, parcelP);
        int i10 = parcelI.readInt();
        parcelI.recycle();
        return i10;
    }

    public final int v(com.google.android.gms.dynamic.d dVar, String str, boolean z10) throws RemoteException {
        Parcel parcelP = p();
        s.e(parcelP, dVar);
        parcelP.writeString(str);
        parcelP.writeInt(z10 ? 1 : 0);
        Parcel parcelI = i(5, parcelP);
        int i10 = parcelI.readInt();
        parcelI.recycle();
        return i10;
    }

    public final com.google.android.gms.dynamic.d w(com.google.android.gms.dynamic.d dVar, String str, int i10) throws RemoteException {
        Parcel parcelP = p();
        s.e(parcelP, dVar);
        parcelP.writeString(str);
        parcelP.writeInt(i10);
        Parcel parcelI = i(2, parcelP);
        com.google.android.gms.dynamic.d dVarK = com.google.android.gms.dynamic.d.a.k(parcelI.readStrongBinder());
        parcelI.recycle();
        return dVarK;
    }
}
