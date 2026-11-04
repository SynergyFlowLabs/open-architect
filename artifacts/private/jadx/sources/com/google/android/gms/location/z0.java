package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class z0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        float fV = 0.0f;
        float fV2 = 0.0f;
        float fV3 = 0.0f;
        float fV4 = 0.0f;
        byte bR = 0;
        long jC0 = 0;
        float[] fArrO = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO != 1) {
                switch (iO) {
                    case 4:
                        fV = i6.a.V(parcel, iX);
                        break;
                    case 5:
                        fV2 = i6.a.V(parcel, iX);
                        break;
                    case 6:
                        jC0 = i6.a.c0(parcel, iX);
                        break;
                    case 7:
                        bR = i6.a.R(parcel, iX);
                        break;
                    case 8:
                        fV3 = i6.a.V(parcel, iX);
                        break;
                    case 9:
                        fV4 = i6.a.V(parcel, iX);
                        break;
                    default:
                        i6.a.h0(parcel, iX);
                        break;
                }
            } else {
                fArrO = i6.a.o(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new DeviceOrientation(fArrO, fV, fV2, jC0, bR, fV3, fV4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new DeviceOrientation[i10];
    }
}
