package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class w0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        int iZ = -1;
        int iZ2 = 0;
        int iZ3 = 0;
        int iZ4 = 0;
        int iZ5 = 0;
        String strG = null;
        String strG2 = null;
        long jC0 = 0;
        long jC1 = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 1:
                    iZ2 = i6.a.Z(parcel, iX);
                    break;
                case 2:
                    iZ3 = i6.a.Z(parcel, iX);
                    break;
                case 3:
                    iZ4 = i6.a.Z(parcel, iX);
                    break;
                case 4:
                    jC0 = i6.a.c0(parcel, iX);
                    break;
                case 5:
                    jC1 = i6.a.c0(parcel, iX);
                    break;
                case 6:
                    strG = i6.a.G(parcel, iX);
                    break;
                case 7:
                    strG2 = i6.a.G(parcel, iX);
                    break;
                case 8:
                    iZ5 = i6.a.Z(parcel, iX);
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
        return new MethodInvocation(iZ2, iZ3, iZ4, jC0, jC1, strG, strG2, iZ5, iZ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new MethodInvocation[i10];
    }
}
