package com.google.android.gms.internal.fido;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public interface c1 extends IInterface {
    void t(Status status, PendingIntent pendingIntent) throws RemoteException;
}
