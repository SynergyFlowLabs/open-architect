package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        long jC0 = -1;
        long jC1 = -1;
        int iZ = 1;
        int iZ2 = 1;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO != 1) {
                int i10 = 6 << 2;
                if (iO == 2) {
                    iZ2 = i6.a.Z(parcel, iX);
                } else if (iO == 3) {
                    jC0 = i6.a.c0(parcel, iX);
                } else if (iO != 4) {
                    i6.a.h0(parcel, iX);
                } else {
                    jC1 = i6.a.c0(parcel, iX);
                }
            } else {
                iZ = i6.a.Z(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new zzal(iZ, iZ2, jC0, jC1);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzal[i10];
    }
}
