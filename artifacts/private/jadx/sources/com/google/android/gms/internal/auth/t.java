package com.google.android.gms.internal.auth;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzo;
import com.google.android.gms.auth.api.accounttransfer.zzw;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public interface t extends IInterface {
    void V6(Status status) throws RemoteException;

    void b2(DeviceMetaData deviceMetaData) throws RemoteException;

    void g6(Status status, zzw zzwVar) throws RemoteException;

    void j() throws RemoteException;

    void ma(byte[] bArr) throws RemoteException;

    void x8(Status status, zzo zzoVar) throws RemoteException;

    void z5(Status status) throws RemoteException;
}
