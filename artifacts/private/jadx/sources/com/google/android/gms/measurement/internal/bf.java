package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class bf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        boolean zP = false;
        int iZ = 0;
        boolean zP2 = false;
        boolean zP3 = false;
        int iZ2 = 0;
        int iZ3 = 0;
        long jC0 = 0;
        long jC1 = 0;
        long jC2 = 0;
        long jC3 = 0;
        long jC4 = 0;
        long jC5 = 0;
        long jC6 = 0;
        String strG = "";
        String strG2 = strG;
        String strG3 = strG2;
        String strG4 = strG3;
        String strG5 = null;
        String strG6 = null;
        String strG7 = null;
        String strG8 = null;
        String strG9 = null;
        String strG10 = null;
        Boolean boolQ = null;
        ArrayList<String> arrayListI = null;
        String strG11 = null;
        String strG12 = null;
        int iZ4 = 100;
        boolean zP4 = true;
        boolean zP5 = true;
        long jC7 = -2147483648L;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 2:
                    strG5 = i6.a.G(parcel, iX);
                    break;
                case 3:
                    strG6 = i6.a.G(parcel, iX);
                    break;
                case 4:
                    strG7 = i6.a.G(parcel, iX);
                    break;
                case 5:
                    strG8 = i6.a.G(parcel, iX);
                    break;
                case 6:
                    jC0 = i6.a.c0(parcel, iX);
                    break;
                case 7:
                    jC1 = i6.a.c0(parcel, iX);
                    break;
                case 8:
                    strG9 = i6.a.G(parcel, iX);
                    break;
                case 9:
                    zP4 = i6.a.P(parcel, iX);
                    break;
                case 10:
                    zP = i6.a.P(parcel, iX);
                    break;
                case 11:
                    jC7 = i6.a.c0(parcel, iX);
                    break;
                case 12:
                    strG10 = i6.a.G(parcel, iX);
                    break;
                case 13:
                case 17:
                case 19:
                case 20:
                case 24:
                case 33:
                default:
                    i6.a.h0(parcel, iX);
                    break;
                case 14:
                    jC2 = i6.a.c0(parcel, iX);
                    break;
                case 15:
                    iZ = i6.a.Z(parcel, iX);
                    break;
                case 16:
                    zP5 = i6.a.P(parcel, iX);
                    break;
                case 18:
                    zP2 = i6.a.P(parcel, iX);
                    break;
                case 21:
                    boolQ = i6.a.Q(parcel, iX);
                    break;
                case 22:
                    jC3 = i6.a.c0(parcel, iX);
                    break;
                case 23:
                    arrayListI = i6.a.I(parcel, iX);
                    break;
                case 25:
                    strG = i6.a.G(parcel, iX);
                    break;
                case 26:
                    strG2 = i6.a.G(parcel, iX);
                    break;
                case 27:
                    strG11 = i6.a.G(parcel, iX);
                    break;
                case 28:
                    zP3 = i6.a.P(parcel, iX);
                    break;
                case 29:
                    jC4 = i6.a.c0(parcel, iX);
                    break;
                case 30:
                    iZ4 = i6.a.Z(parcel, iX);
                    break;
                case 31:
                    strG3 = i6.a.G(parcel, iX);
                    break;
                case 32:
                    iZ2 = i6.a.Z(parcel, iX);
                    break;
                case 34:
                    jC5 = i6.a.c0(parcel, iX);
                    break;
                case 35:
                    strG12 = i6.a.G(parcel, iX);
                    break;
                case 36:
                    strG4 = i6.a.G(parcel, iX);
                    break;
                case 37:
                    jC6 = i6.a.c0(parcel, iX);
                    break;
                case 38:
                    iZ3 = i6.a.Z(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new zzr(strG5, strG6, strG7, strG8, jC0, jC1, strG9, zP4, zP, jC7, strG10, jC2, iZ, zP5, zP2, boolQ, jC3, arrayListI, strG, strG2, strG11, zP3, jC4, iZ4, strG3, iZ2, jC5, strG12, strG4, jC6, iZ3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzr[i10];
    }
}
