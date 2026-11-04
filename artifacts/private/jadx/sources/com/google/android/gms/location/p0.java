package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        WorkSource workSource = null;
        String strG = null;
        int[] iArrU = null;
        String strG2 = null;
        String strG3 = null;
        long jC0 = 0;
        long jC1 = 0;
        boolean zP = false;
        boolean zP2 = false;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 1:
                    jC0 = i6.a.c0(parcel, iX);
                    break;
                case 2:
                    zP = i6.a.P(parcel, iX);
                    break;
                case 3:
                    workSource = (WorkSource) i6.a.C(parcel, iX, WorkSource.CREATOR);
                    break;
                case 4:
                    strG = i6.a.G(parcel, iX);
                    break;
                case 5:
                    iArrU = i6.a.u(parcel, iX);
                    break;
                case 6:
                    zP2 = i6.a.P(parcel, iX);
                    break;
                case 7:
                    strG2 = i6.a.G(parcel, iX);
                    break;
                case 8:
                    jC1 = i6.a.c0(parcel, iX);
                    break;
                case 9:
                    strG3 = i6.a.G(parcel, iX);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new zzb(jC0, zP, workSource, strG, iArrU, zP2, strG2, jC1, strG3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzb[i10];
    }
}
