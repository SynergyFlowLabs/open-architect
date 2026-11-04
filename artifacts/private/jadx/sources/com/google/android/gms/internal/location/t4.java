package com.google.android.gms.internal.location;

import android.location.Location;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t4 extends b0 implements u4 {
    public t4() {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
    }

    @Override // com.google.android.gms.internal.location.b0
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) c1.a(parcel, Status.CREATOR);
        Location location = (Location) c1.a(parcel, Location.CREATOR);
        c1.d(parcel);
        l9(status, location);
        return true;
    }
}
