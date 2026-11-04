package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        String strG = null;
        ConnectionResult connectionResult = null;
        int iZ = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                iZ = i6.a.Z(parcel, iX);
            } else if (iO == 2) {
                strG = i6.a.G(parcel, iX);
            } else if (iO == 3) {
                pendingIntent = (PendingIntent) i6.a.C(parcel, iX, PendingIntent.CREATOR);
            } else if (iO != 4) {
                i6.a.h0(parcel, iX);
            } else {
                connectionResult = (ConnectionResult) i6.a.C(parcel, iX, ConnectionResult.CREATOR);
            }
        }
        i6.a.N(parcel, iI0);
        return new Status(iZ, strG, pendingIntent, connectionResult);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
