package com.google.android.gms.internal.p001authapiphone;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends a implements IInterface {
    k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    public final void n(h hVar) throws RemoteException {
        Parcel parcelI = i();
        f.c(parcelI, hVar);
        k(4, parcelI);
    }

    public final void p(String str, j jVar) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeString(str);
        f.c(parcelI, jVar);
        k(5, parcelI);
    }

    public final void s(com.google.android.gms.common.api.internal.k kVar) throws RemoteException {
        Parcel parcelI = i();
        f.c(parcelI, kVar);
        k(3, parcelI);
    }

    public final void u(com.google.android.gms.common.api.internal.k kVar) throws RemoteException {
        Parcel parcelI = i();
        f.c(parcelI, kVar);
        k(6, parcelI);
    }

    public final void v(m mVar) throws RemoteException {
        Parcel parcelI = i();
        f.c(parcelI, mVar);
        k(1, parcelI);
    }

    public final void w(String str, m mVar) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeString(str);
        f.c(parcelI, mVar);
        k(2, parcelI);
    }
}
