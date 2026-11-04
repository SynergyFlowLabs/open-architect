package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        boolean zP = false;
        int iZ = 0;
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
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
                    strG3 = i6.a.G(parcel, iX);
                    break;
                case 4:
                    strG4 = i6.a.G(parcel, iX);
                    break;
                case 5:
                    zP = i6.a.P(parcel, iX);
                    break;
                case 6:
                    iZ = i6.a.Z(parcel, iX);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new GetSignInIntentRequest(strG, strG2, strG3, strG4, zP, iZ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GetSignInIntentRequest[i10];
    }
}
