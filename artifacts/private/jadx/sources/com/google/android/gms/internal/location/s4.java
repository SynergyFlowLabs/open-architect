package com.google.android.gms.internal.location;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;

/* JADX INFO: loaded from: classes4.dex */
public interface s4 extends IInterface {
    void u9(Status status, LocationAvailability locationAvailability) throws RemoteException;
}
