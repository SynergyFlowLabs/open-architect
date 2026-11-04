package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        String strG = null;
        int iZ = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                iZ = i6.a.Z(parcel, iX);
            } else if (iO != 2) {
                i6.a.h0(parcel, iX);
            } else {
                strG = i6.a.G(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new zzbw(iZ, strG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbw[i10];
    }
}
