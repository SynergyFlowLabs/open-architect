package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationSettingsResult;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends b0 implements c {
    public b() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // com.google.android.gms.internal.location.b0
    protected final boolean i(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        LocationSettingsResult locationSettingsResult = (LocationSettingsResult) c1.a(parcel, LocationSettingsResult.CREATOR);
        c1.d(parcel);
        z2(locationSettingsResult);
        return true;
    }
}
