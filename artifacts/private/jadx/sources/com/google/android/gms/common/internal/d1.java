package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
public final class d1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        int iZ = 0;
        boolean zP = false;
        boolean zP2 = false;
        IBinder iBinderY = null;
        ConnectionResult connectionResult = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                iZ = i6.a.Z(parcel, iX);
            } else if (iO == 2) {
                iBinderY = i6.a.Y(parcel, iX);
            } else if (iO == 3) {
                connectionResult = (ConnectionResult) i6.a.C(parcel, iX, ConnectionResult.CREATOR);
            } else if (iO == 4) {
                zP = i6.a.P(parcel, iX);
            } else if (iO != 5) {
                i6.a.h0(parcel, iX);
            } else {
                zP2 = i6.a.P(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new zav(iZ, iBinderY, connectionResult, zP, zP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zav[i10];
    }
}
