package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class h1 extends com.google.android.gms.internal.common.a implements q {
    h1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.common.internal.q
    public final void v6(int i10, Bundle bundle) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.common.internal.q
    public final void w8(int i10, IBinder iBinder, zzk zzkVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.common.internal.q
    public final void xa(int i10, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel parcelP = p();
        parcelP.writeInt(i10);
        parcelP.writeStrongBinder(iBinder);
        com.google.android.gms.internal.common.s.c(parcelP, bundle);
        k(1, parcelP);
    }
}
