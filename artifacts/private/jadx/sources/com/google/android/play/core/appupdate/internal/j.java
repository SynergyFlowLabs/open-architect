package com.google.android.play.core.appupdate.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends a implements l {
    j(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.appupdate.internal.l
    public final void B8(String str, Bundle bundle, n nVar) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeString(str);
        i.c(parcelI, bundle);
        parcelI.writeStrongBinder(nVar);
        int i10 = 2 << 2;
        k(2, parcelI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.appupdate.internal.l
    public final void Y7(String str, Bundle bundle, n nVar) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeString(str);
        i.c(parcelI, bundle);
        parcelI.writeStrongBinder(nVar);
        k(3, parcelI);
    }
}
