package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class l3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        int iZ = -1;
        int iZ2 = 0;
        short sF0 = 0;
        int iZ3 = 0;
        long jC0 = 0;
        float fV = 0.0f;
        double dT = 0.0d;
        double dT2 = 0.0d;
        String strG = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 1:
                    strG = i6.a.G(parcel, iX);
                    break;
                case 2:
                    jC0 = i6.a.c0(parcel, iX);
                    break;
                case 3:
                    sF0 = i6.a.f0(parcel, iX);
                    break;
                case 4:
                    dT = i6.a.T(parcel, iX);
                    break;
                case 5:
                    dT2 = i6.a.T(parcel, iX);
                    break;
                case 6:
                    fV = i6.a.V(parcel, iX);
                    break;
                case 7:
                    iZ2 = i6.a.Z(parcel, iX);
                    break;
                case 8:
                    iZ3 = i6.a.Z(parcel, iX);
                    break;
                case 9:
                    iZ = i6.a.Z(parcel, iX);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new zzek(strG, iZ2, sF0, dT, dT2, fV, jC0, iZ3, iZ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzek[i10];
    }
}
