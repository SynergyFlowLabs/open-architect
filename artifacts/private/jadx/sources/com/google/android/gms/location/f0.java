package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        Status status = null;
        LocationSettingsStates locationSettingsStates = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                status = (Status) i6.a.C(parcel, iX, Status.CREATOR);
            } else if (iO != 2) {
                i6.a.h0(parcel, iX);
            } else {
                locationSettingsStates = (LocationSettingsStates) i6.a.C(parcel, iX, LocationSettingsStates.CREATOR);
            }
        }
        i6.a.N(parcel, iI0);
        return new LocationSettingsResult(status, locationSettingsStates);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationSettingsResult[i10];
    }
}
