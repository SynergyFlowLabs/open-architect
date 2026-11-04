package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class c1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        String strG = null;
        IBinder iBinderY = null;
        zzr zzrVar = null;
        boolean zP = false;
        boolean zP2 = false;
        boolean zP3 = false;
        boolean zP4 = false;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 1:
                    strG = i6.a.G(parcel, iX);
                    break;
                case 2:
                    zP = i6.a.P(parcel, iX);
                    break;
                case 3:
                    zP2 = i6.a.P(parcel, iX);
                    break;
                case 4:
                    iBinderY = i6.a.Y(parcel, iX);
                    break;
                case 5:
                    zP3 = i6.a.P(parcel, iX);
                    break;
                case 6:
                    zP4 = i6.a.P(parcel, iX);
                    break;
                case 7:
                    zzrVar = (zzr) i6.a.C(parcel, iX, zzr.CREATOR);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new zzs(strG, zP, zP2, iBinderY, zP3, zP4, zzrVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzs[i10];
    }
}
