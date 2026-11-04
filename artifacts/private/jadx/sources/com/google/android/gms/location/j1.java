package com.google.android.gms.location;

import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface j1 extends IInterface {
    void U2(LocationAvailability locationAvailability) throws RemoteException;

    void c() throws RemoteException;

    void sc(LocationResult locationResult) throws RemoteException;
}
