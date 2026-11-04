package com.google.android.gms.internal.location;

import android.location.Location;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public interface u4 extends IInterface {
    void l9(Status status, Location location) throws RemoteException;
}
