package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        byte[] bArrH = null;
        byte[] bArrH2 = null;
        byte[] bArrH3 = null;
        String[] strArrH = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 2) {
                bArrH = i6.a.h(parcel, iX);
            } else if (iO == 3) {
                bArrH2 = i6.a.h(parcel, iX);
            } else if (iO == 4) {
                bArrH3 = i6.a.h(parcel, iX);
            } else if (iO != 5) {
                i6.a.h0(parcel, iX);
            } else {
                strArrH = i6.a.H(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new AuthenticatorAttestationResponse(bArrH, bArrH2, bArrH3, strArrH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthenticatorAttestationResponse[i10];
    }
}
