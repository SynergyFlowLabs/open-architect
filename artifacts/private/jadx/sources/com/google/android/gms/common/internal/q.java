package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public interface q extends IInterface {
    void v6(int i10, @NonNull Bundle bundle) throws RemoteException;

    void w8(int i10, IBinder iBinder, zzk zzkVar) throws RemoteException;

    void xa(int i10, @NonNull IBinder iBinder, @NonNull Bundle bundle) throws RemoteException;
}
