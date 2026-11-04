package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes4.dex */
public final class c1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        Account account = null;
        int iZ = 0;
        int iZ2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO != 1) {
                int i10 = 7 >> 2;
                if (iO == 2) {
                    account = (Account) i6.a.C(parcel, iX, Account.CREATOR);
                } else if (iO == 3) {
                    iZ2 = i6.a.Z(parcel, iX);
                } else if (iO != 4) {
                    i6.a.h0(parcel, iX);
                } else {
                    googleSignInAccount = (GoogleSignInAccount) i6.a.C(parcel, iX, GoogleSignInAccount.CREATOR);
                }
            } else {
                iZ = i6.a.Z(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new zat(iZ, account, iZ2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zat[i10];
    }
}
