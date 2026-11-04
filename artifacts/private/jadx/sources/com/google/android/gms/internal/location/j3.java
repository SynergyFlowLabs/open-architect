package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class j3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        long jC0 = Long.MAX_VALUE;
        LocationRequest locationRequest = null;
        ArrayList arrayListL = null;
        String strG = null;
        boolean zP = false;
        boolean zP2 = false;
        boolean zP3 = false;
        boolean zP4 = false;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                locationRequest = (LocationRequest) i6.a.C(parcel, iX, LocationRequest.CREATOR);
            } else if (iO == 5) {
                arrayListL = i6.a.L(parcel, iX, ClientIdentity.CREATOR);
            } else if (iO == 8) {
                zP = i6.a.P(parcel, iX);
            } else if (iO != 9) {
                switch (iO) {
                    case 11:
                        zP3 = i6.a.P(parcel, iX);
                        break;
                    case 12:
                        zP4 = i6.a.P(parcel, iX);
                        break;
                    case 13:
                        strG = i6.a.G(parcel, iX);
                        break;
                    case 14:
                        jC0 = i6.a.c0(parcel, iX);
                        break;
                    default:
                        i6.a.h0(parcel, iX);
                        break;
                }
            } else {
                zP2 = i6.a.P(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new zzeg(locationRequest, arrayListL, zP, zP2, zP3, zP4, strG, jC0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzeg[i10];
    }
}
