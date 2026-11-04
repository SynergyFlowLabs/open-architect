package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        boolean zP = false;
        boolean zP2 = false;
        boolean zP3 = false;
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        ArrayList<String> arrayListI = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 1:
                    zP = i6.a.P(parcel, iX);
                    break;
                case 2:
                    strG = i6.a.G(parcel, iX);
                    break;
                case 3:
                    strG2 = i6.a.G(parcel, iX);
                    break;
                case 4:
                    zP2 = i6.a.P(parcel, iX);
                    break;
                case 5:
                    strG3 = i6.a.G(parcel, iX);
                    break;
                case 6:
                    arrayListI = i6.a.I(parcel, iX);
                    break;
                case 7:
                    zP3 = i6.a.P(parcel, iX);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new BeginSignInRequest.GoogleIdTokenRequestOptions(zP, strG, strG2, zP2, strG3, arrayListI, zP3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new BeginSignInRequest.GoogleIdTokenRequestOptions[i10];
    }
}
