package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        ArrayList<String> arrayListI = null;
        ArrayList<String> arrayListI2 = null;
        ArrayList<String> arrayListI3 = null;
        ArrayList<String> arrayListI4 = null;
        ArrayList<String> arrayListI5 = null;
        int iZ = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 1:
                    iZ = i6.a.Z(parcel, iX);
                    break;
                case 2:
                    arrayListI = i6.a.I(parcel, iX);
                    break;
                case 3:
                    arrayListI2 = i6.a.I(parcel, iX);
                    break;
                case 4:
                    arrayListI3 = i6.a.I(parcel, iX);
                    break;
                case 5:
                    arrayListI4 = i6.a.I(parcel, iX);
                    break;
                case 6:
                    arrayListI5 = i6.a.I(parcel, iX);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new zzs(iZ, arrayListI, arrayListI2, arrayListI3, arrayListI4, arrayListI5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzs[i10];
    }
}
