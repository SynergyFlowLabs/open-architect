package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        String strG = null;
        int iZ = 0;
        FastJsonResponse.Field field = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                iZ = i6.a.Z(parcel, iX);
            } else if (iO == 2) {
                strG = i6.a.G(parcel, iX);
            } else if (iO != 3) {
                i6.a.h0(parcel, iX);
            } else {
                field = (FastJsonResponse.Field) i6.a.C(parcel, iX, FastJsonResponse.Field.CREATOR);
            }
        }
        i6.a.N(parcel, iI0);
        return new zam(iZ, strG, field);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zam[i10];
    }
}
