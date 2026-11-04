package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i1 extends com.google.android.gms.internal.location.b0 implements j1 {
    public i1() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static j1 k(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return iInterfaceQueryLocalInterface instanceof j1 ? (j1) iInterfaceQueryLocalInterface : new h1(iBinder);
    }

    @Override // com.google.android.gms.internal.location.b0
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            LocationResult locationResult = (LocationResult) com.google.android.gms.internal.location.c1.a(parcel, LocationResult.CREATOR);
            com.google.android.gms.internal.location.c1.d(parcel);
            sc(locationResult);
        } else if (i10 == 2) {
            LocationAvailability locationAvailability = (LocationAvailability) com.google.android.gms.internal.location.c1.a(parcel, LocationAvailability.CREATOR);
            com.google.android.gms.internal.location.c1.d(parcel);
            U2(locationAvailability);
        } else {
            if (i10 != 3) {
                return false;
            }
            c();
        }
        return true;
    }
}
