package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f1 extends com.google.android.gms.internal.location.b0 implements g1 {
    public f1() {
        super("com.google.android.gms.location.IDeviceOrientationListener");
    }

    public static g1 k(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return iInterfaceQueryLocalInterface instanceof g1 ? (g1) iInterfaceQueryLocalInterface : new e1(iBinder);
    }

    @Override // com.google.android.gms.internal.location.b0
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        DeviceOrientation deviceOrientation = (DeviceOrientation) com.google.android.gms.internal.location.c1.a(parcel, DeviceOrientation.CREATOR);
        com.google.android.gms.internal.location.c1.d(parcel);
        Qa(deviceOrientation);
        return true;
    }
}
