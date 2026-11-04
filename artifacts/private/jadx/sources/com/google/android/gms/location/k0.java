package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        int iZ = 0;
        int iZ2 = 0;
        int iZ3 = 0;
        int iZ4 = 0;
        int iZ5 = 0;
        int iZ6 = 0;
        int iZ7 = 0;
        boolean zP = false;
        int iZ8 = 0;
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
                    iZ3 = i6.a.Z(parcel, iX);
                    break;
                case 4:
                    iZ4 = i6.a.Z(parcel, iX);
                    break;
                case 5:
                    iZ5 = i6.a.Z(parcel, iX);
                    break;
                case 6:
                    iZ6 = i6.a.Z(parcel, iX);
                    break;
                case 7:
                    iZ7 = i6.a.Z(parcel, iX);
                    break;
                case 8:
                    zP = i6.a.P(parcel, iX);
                    break;
                case 9:
                    iZ8 = i6.a.Z(parcel, iX);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new SleepClassifyEvent(iZ, iZ2, iZ3, iZ4, iZ5, iZ6, iZ7, zP, iZ8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SleepClassifyEvent[i10];
    }
}
