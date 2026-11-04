package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.o;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends com.google.android.gms.internal.base.a implements IInterface {
    f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void s(int i10) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeInt(i10);
        n(7, parcelI);
    }

    public final void u(o oVar, int i10, boolean z10) throws RemoteException {
        Parcel parcelI = i();
        com.google.android.gms.internal.base.c.d(parcelI, oVar);
        parcelI.writeInt(i10);
        parcelI.writeInt(z10 ? 1 : 0);
        n(9, parcelI);
    }

    public final void v(zai zaiVar, e eVar) throws RemoteException {
        Parcel parcelI = i();
        com.google.android.gms.internal.base.c.c(parcelI, zaiVar);
        com.google.android.gms.internal.base.c.d(parcelI, eVar);
        n(12, parcelI);
    }
}
