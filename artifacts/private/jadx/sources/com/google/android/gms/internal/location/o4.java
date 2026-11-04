package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface o4 extends IInterface {
    void J4(int i10, PendingIntent pendingIntent) throws RemoteException;

    void f9(int i10, String[] strArr) throws RemoteException;

    void vf(int i10, String[] strArr) throws RemoteException;
}
