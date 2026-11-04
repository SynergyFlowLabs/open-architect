package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class w0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        boolean zP = false;
        boolean zP2 = false;
        String strG = null;
        String strG2 = null;
        byte[] bArrH = null;
        byte[] bArrH2 = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 1:
                    strG = i6.a.G(parcel, iX);
                    break;
                case 2:
                    strG2 = i6.a.G(parcel, iX);
                    break;
                case 3:
                    bArrH = i6.a.h(parcel, iX);
                    break;
                case 4:
                    bArrH2 = i6.a.h(parcel, iX);
                    break;
                case 5:
                    zP = i6.a.P(parcel, iX);
                    break;
                case 6:
                    zP2 = i6.a.P(parcel, iX);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new FidoCredentialDetails(strG, strG2, bArrH, bArrH2, zP, zP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new FidoCredentialDetails[i10];
    }
}
