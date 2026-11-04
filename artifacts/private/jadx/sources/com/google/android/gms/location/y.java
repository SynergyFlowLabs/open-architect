package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zze;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        zze zzeVar = null;
        int iZ = 0;
        boolean zP = false;
        long jC0 = Long.MAX_VALUE;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                jC0 = i6.a.c0(parcel, iX);
            } else if (iO == 2) {
                iZ = i6.a.Z(parcel, iX);
            } else if (iO == 3) {
                zP = i6.a.P(parcel, iX);
            } else if (iO != 5) {
                i6.a.h0(parcel, iX);
            } else {
                zzeVar = (zze) i6.a.C(parcel, iX, zze.CREATOR);
            }
        }
        i6.a.N(parcel, iI0);
        return new LastLocationRequest(jC0, iZ, zP, zzeVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LastLocationRequest[i10];
    }
}
