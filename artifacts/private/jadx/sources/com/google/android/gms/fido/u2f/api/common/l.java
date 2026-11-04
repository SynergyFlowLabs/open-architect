package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        KeyHandle keyHandle = null;
        String strG = null;
        String strG2 = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            int i10 = 0 & 2;
            if (iO == 2) {
                keyHandle = (KeyHandle) i6.a.C(parcel, iX, KeyHandle.CREATOR);
            } else if (iO == 3) {
                strG = i6.a.G(parcel, iX);
            } else if (iO != 4) {
                i6.a.h0(parcel, iX);
            } else {
                strG2 = i6.a.G(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new RegisteredKey(keyHandle, strG, strG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new RegisteredKey[i10];
    }
}
