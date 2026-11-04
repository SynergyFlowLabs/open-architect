package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class k1 extends com.google.android.gms.internal.location.a implements m1 {
    k1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationListener");
    }

    @Override // com.google.android.gms.location.m1
    public final void J1(Location location) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.location.m1
    public final void j() throws RemoteException {
        throw null;
    }
}
