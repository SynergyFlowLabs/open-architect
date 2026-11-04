package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class ud implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        int iZ = 0;
        long jC0 = 0;
        String strG = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            int i10 = 7 >> 1;
            if (iO == 1) {
                strG = i6.a.G(parcel, iX);
            } else if (iO == 2) {
                jC0 = i6.a.c0(parcel, iX);
            } else if (iO != 3) {
                i6.a.h0(parcel, iX);
            } else {
                iZ = i6.a.Z(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new zzoh(strG, jC0, iZ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzoh[i10];
    }
}
