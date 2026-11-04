package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class yd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        byte[] bArrH = null;
        String strG = null;
        Bundle bundleG = null;
        String strG2 = null;
        long jC0 = 0;
        long jC1 = 0;
        int iZ = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 1:
                    jC0 = i6.a.c0(parcel, iX);
                    break;
                case 2:
                    bArrH = i6.a.h(parcel, iX);
                    break;
                case 3:
                    strG = i6.a.G(parcel, iX);
                    break;
                case 4:
                    bundleG = i6.a.g(parcel, iX);
                    break;
                case 5:
                    iZ = i6.a.Z(parcel, iX);
                    break;
                case 6:
                    jC1 = i6.a.c0(parcel, iX);
                    break;
                case 7:
                    strG2 = i6.a.G(parcel, iX);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new zzom(jC0, bArrH, strG, bundleG, iZ, jC1, strG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzom[i10];
    }
}
