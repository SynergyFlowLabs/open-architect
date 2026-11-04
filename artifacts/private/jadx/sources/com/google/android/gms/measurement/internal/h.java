package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        String strG = null;
        String strG2 = null;
        zzpl zzplVar = null;
        String strG3 = null;
        zzbg zzbgVar = null;
        zzbg zzbgVar2 = null;
        zzbg zzbgVar3 = null;
        long jC0 = 0;
        long jC1 = 0;
        long jC2 = 0;
        boolean zP = false;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 2:
                    strG = i6.a.G(parcel, iX);
                    break;
                case 3:
                    strG2 = i6.a.G(parcel, iX);
                    break;
                case 4:
                    zzplVar = (zzpl) i6.a.C(parcel, iX, zzpl.CREATOR);
                    break;
                case 5:
                    jC0 = i6.a.c0(parcel, iX);
                    break;
                case 6:
                    zP = i6.a.P(parcel, iX);
                    break;
                case 7:
                    strG3 = i6.a.G(parcel, iX);
                    break;
                case 8:
                    zzbgVar = (zzbg) i6.a.C(parcel, iX, zzbg.CREATOR);
                    break;
                case 9:
                    jC1 = i6.a.c0(parcel, iX);
                    break;
                case 10:
                    zzbgVar2 = (zzbg) i6.a.C(parcel, iX, zzbg.CREATOR);
                    break;
                case 11:
                    jC2 = i6.a.c0(parcel, iX);
                    break;
                case 12:
                    zzbgVar3 = (zzbg) i6.a.C(parcel, iX, zzbg.CREATOR);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new zzah(strG, strG2, zzplVar, jC0, zP, strG3, zzbgVar, jC1, zzbgVar2, jC2, zzbgVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzah[i10];
    }
}
