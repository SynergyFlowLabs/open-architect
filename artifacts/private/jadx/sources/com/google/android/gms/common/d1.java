package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class d1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        String strG = null;
        zzu zzuVar = null;
        long jC0 = -1;
        boolean zP = false;
        int iZ = 0;
        int iZ2 = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 1:
                    zP = i6.a.P(parcel, iX);
                    break;
                case 2:
                    strG = i6.a.G(parcel, iX);
                    break;
                case 3:
                    iZ = i6.a.Z(parcel, iX);
                    break;
                case 4:
                    iZ2 = i6.a.Z(parcel, iX);
                    break;
                case 5:
                    jC0 = i6.a.c0(parcel, iX);
                    break;
                case 6:
                    zzuVar = (zzu) i6.a.C(parcel, iX, zzu.CREATOR);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new zzu(zP, strG, iZ, iZ2, jC0, zzuVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzu[i10];
    }
}
