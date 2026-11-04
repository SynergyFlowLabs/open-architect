package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        byte[] bArrH = null;
        String strG = null;
        byte[] bArrH2 = null;
        byte[] bArrH3 = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 2) {
                bArrH = i6.a.h(parcel, iX);
            } else if (iO != 3) {
                int i10 = 3 | 4;
                if (iO == 4) {
                    bArrH2 = i6.a.h(parcel, iX);
                } else if (iO != 5) {
                    i6.a.h0(parcel, iX);
                } else {
                    bArrH3 = i6.a.h(parcel, iX);
                }
            } else {
                strG = i6.a.G(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new SignResponseData(bArrH, strG, bArrH2, bArrH3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignResponseData[i10];
    }
}
