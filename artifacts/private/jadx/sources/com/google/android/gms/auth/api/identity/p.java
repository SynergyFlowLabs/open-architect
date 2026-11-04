package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        byte[] bArrH = null;
        boolean zP = false;
        String strG = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                zP = i6.a.P(parcel, iX);
            } else if (iO == 2) {
                bArrH = i6.a.h(parcel, iX);
            } else if (iO != 3) {
                i6.a.h0(parcel, iX);
            } else {
                strG = i6.a.G(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new BeginSignInRequest.PasskeysRequestOptions(zP, bArrH, strG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new BeginSignInRequest.PasskeysRequestOptions[i10];
    }
}
