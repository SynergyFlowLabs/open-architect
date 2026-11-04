package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        ConnectionResult connectionResult = null;
        int iZ = 0;
        zav zavVar = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                iZ = i6.a.Z(parcel, iX);
            } else if (iO == 2) {
                connectionResult = (ConnectionResult) i6.a.C(parcel, iX, ConnectionResult.CREATOR);
            } else if (iO != 3) {
                i6.a.h0(parcel, iX);
            } else {
                zavVar = (zav) i6.a.C(parcel, iX, zav.CREATOR);
            }
        }
        i6.a.N(parcel, iI0);
        return new zak(iZ, connectionResult, zavVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zak[i10];
    }
}
