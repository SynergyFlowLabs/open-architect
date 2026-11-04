package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r4 extends b0 implements s4 {
    public r4() {
        super("com.google.android.gms.location.internal.ILocationAvailabilityStatusCallback");
    }

    @Override // com.google.android.gms.internal.location.b0
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) c1.a(parcel, Status.CREATOR);
        LocationAvailability locationAvailability = (LocationAvailability) c1.a(parcel, LocationAvailability.CREATOR);
        c1.d(parcel);
        u9(status, locationAvailability);
        return true;
    }
}
