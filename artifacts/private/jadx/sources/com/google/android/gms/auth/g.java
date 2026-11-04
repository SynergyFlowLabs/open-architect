package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        String strG = null;
        String strG2 = null;
        int iZ = 0;
        int iZ2 = 0;
        int iZ3 = 0;
        long jC0 = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 1:
                    iZ = i6.a.Z(parcel, iX);
                    break;
                case 2:
                    jC0 = i6.a.c0(parcel, iX);
                    break;
                case 3:
                    strG = i6.a.G(parcel, iX);
                    break;
                case 4:
                    iZ2 = i6.a.Z(parcel, iX);
                    break;
                case 5:
                    iZ3 = i6.a.Z(parcel, iX);
                    break;
                case 6:
                    strG2 = i6.a.G(parcel, iX);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new AccountChangeEvent(iZ, jC0, strG, iZ2, iZ3, strG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AccountChangeEvent[i10];
    }
}
