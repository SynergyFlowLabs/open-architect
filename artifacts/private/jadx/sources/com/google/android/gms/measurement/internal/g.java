package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        int i10 = 6 | 0;
        long jC0 = 0;
        long jC1 = 0;
        int iZ = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                jC0 = i6.a.c0(parcel, iX);
            } else if (iO == 2) {
                iZ = i6.a.Z(parcel, iX);
            } else if (iO != 3) {
                i6.a.h0(parcel, iX);
            } else {
                jC1 = i6.a.c0(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new zzaf(jC0, iZ, jC1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzaf[i10];
    }
}
