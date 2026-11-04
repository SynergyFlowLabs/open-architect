package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        String strG = "";
        GoogleSignInAccount googleSignInAccount = null;
        String strG2 = "";
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO != 4) {
                int i10 = 0 << 7;
                if (iO == 7) {
                    googleSignInAccount = (GoogleSignInAccount) i6.a.C(parcel, iX, GoogleSignInAccount.CREATOR);
                } else if (iO != 8) {
                    i6.a.h0(parcel, iX);
                } else {
                    strG2 = i6.a.G(parcel, iX);
                }
            } else {
                strG = i6.a.G(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new SignInAccount(strG, googleSignInAccount, strG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInAccount[i10];
    }
}
