package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l1 extends com.google.android.gms.internal.location.b0 implements m1 {
    public l1() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static m1 k(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return iInterfaceQueryLocalInterface instanceof m1 ? (m1) iInterfaceQueryLocalInterface : new k1(iBinder);
    }

    @Override // com.google.android.gms.internal.location.b0
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            Location location = (Location) com.google.android.gms.internal.location.c1.a(parcel, Location.CREATOR);
            com.google.android.gms.internal.location.c1.d(parcel);
            J1(location);
        } else {
            if (i10 != 2) {
                return false;
            }
            j();
        }
        return true;
    }
}
