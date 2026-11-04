package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends a implements IInterface {
    u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
    }

    public final void p(t tVar, zzaq zzaqVar) throws RemoteException {
        Parcel parcelI = i();
        v0.d(parcelI, tVar);
        v0.c(parcelI, zzaqVar);
        n(7, parcelI);
    }

    public final void s(t tVar, zzbb zzbbVar) throws RemoteException {
        Parcel parcelI = i();
        v0.d(parcelI, tVar);
        v0.c(parcelI, zzbbVar);
        n(8, parcelI);
    }

    public final void u(t tVar, zzav zzavVar) throws RemoteException {
        Parcel parcelI = i();
        v0.d(parcelI, tVar);
        v0.c(parcelI, zzavVar);
        n(9, parcelI);
    }

    public final void v(t tVar, zzax zzaxVar) throws RemoteException {
        Parcel parcelI = i();
        v0.d(parcelI, tVar);
        v0.c(parcelI, zzaxVar);
        n(6, parcelI);
    }

    public final void w(t tVar, zzaz zzazVar) throws RemoteException {
        Parcel parcelI = i();
        v0.d(parcelI, tVar);
        v0.c(parcelI, zzazVar);
        n(5, parcelI);
    }
}
