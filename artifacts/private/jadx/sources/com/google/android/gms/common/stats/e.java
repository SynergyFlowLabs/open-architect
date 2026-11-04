package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        int iZ = 0;
        int iZ2 = 0;
        int iZ3 = 0;
        int iZ4 = 0;
        boolean zP = false;
        String strG = null;
        ArrayList<String> arrayListI = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        String strG5 = null;
        long jC0 = 0;
        long jC1 = 0;
        long jC2 = 0;
        float fV = 0.0f;
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
                case 7:
                case 9:
                default:
                    i6.a.h0(parcel, iX);
                    break;
                case 4:
                    strG = i6.a.G(parcel, iX);
                    break;
                case 5:
                    iZ3 = i6.a.Z(parcel, iX);
                    break;
                case 6:
                    arrayListI = i6.a.I(parcel, iX);
                    break;
                case 8:
                    jC1 = i6.a.c0(parcel, iX);
                    break;
                case 10:
                    strG3 = i6.a.G(parcel, iX);
                    break;
                case 11:
                    iZ2 = i6.a.Z(parcel, iX);
                    break;
                case 12:
                    strG2 = i6.a.G(parcel, iX);
                    break;
                case 13:
                    strG4 = i6.a.G(parcel, iX);
                    break;
                case 14:
                    iZ4 = i6.a.Z(parcel, iX);
                    break;
                case 15:
                    fV = i6.a.V(parcel, iX);
                    break;
                case 16:
                    jC2 = i6.a.c0(parcel, iX);
                    break;
                case 17:
                    strG5 = i6.a.G(parcel, iX);
                    break;
                case 18:
                    zP = i6.a.P(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new WakeLockEvent(iZ, jC0, iZ2, strG, iZ3, arrayListI, strG2, jC1, iZ4, strG3, strG4, fV, jC2, strG5, zP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new WakeLockEvent[i10];
    }
}
