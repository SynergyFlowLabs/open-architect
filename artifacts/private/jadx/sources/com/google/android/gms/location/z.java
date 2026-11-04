package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        boolean zP = false;
        zzal[] zzalVarArr = null;
        long jC0 = 0;
        int iZ = 1;
        int iZ2 = 1;
        int iZ3 = 1000;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 1:
                    iZ = i6.a.Z(parcel, iX);
                    break;
                case 2:
                    iZ2 = i6.a.Z(parcel, iX);
                    break;
                case 3:
                    jC0 = i6.a.c0(parcel, iX);
                    break;
                case 4:
                    iZ3 = i6.a.Z(parcel, iX);
                    break;
                case 5:
                    zzalVarArr = (zzal[]) i6.a.K(parcel, iX, zzal.CREATOR);
                    break;
                case 6:
                    zP = i6.a.P(parcel, iX);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new LocationAvailability(iZ3, iZ, iZ2, jC0, zzalVarArr, zP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationAvailability[i10];
    }
}
