package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class e1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        boolean zP = false;
        String strG = null;
        IBinder iBinderY = null;
        boolean zP2 = false;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                strG = i6.a.G(parcel, iX);
            } else if (iO == 2) {
                iBinderY = i6.a.Y(parcel, iX);
            } else if (iO == 3) {
                zP = i6.a.P(parcel, iX);
            } else if (iO != 4) {
                i6.a.h0(parcel, iX);
            } else {
                zP2 = i6.a.P(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new zzw(strG, iBinderY, zP, zP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzw[i10];
    }
}
