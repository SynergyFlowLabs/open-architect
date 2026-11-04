package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class g4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        zzh zzhVar = null;
        IBinder iBinderY = null;
        IBinder iBinderY2 = null;
        int iZ = 1;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                iZ = i6.a.Z(parcel, iX);
            } else if (iO == 2) {
                zzhVar = (zzh) i6.a.C(parcel, iX, zzh.CREATOR);
            } else if (iO == 3) {
                iBinderY = i6.a.Y(parcel, iX);
            } else if (iO != 4) {
                i6.a.h0(parcel, iX);
            } else {
                iBinderY2 = i6.a.Y(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new zzj(iZ, zzhVar, iBinderY, iBinderY2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzj[i10];
    }
}
