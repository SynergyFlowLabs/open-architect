package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        boolean zP = false;
        ArrayList arrayListL = null;
        boolean zP2 = false;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                arrayListL = i6.a.L(parcel, iX, LocationRequest.CREATOR);
            } else if (iO == 2) {
                zP = i6.a.P(parcel, iX);
            } else if (iO != 3) {
                i6.a.h0(parcel, iX);
            } else {
                zP2 = i6.a.P(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new LocationSettingsRequest(arrayListL, zP, zP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationSettingsRequest[i10];
    }
}
