package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        ArrayList arrayListL = null;
        Account account = null;
        String strG = null;
        String strG2 = null;
        ArrayList arrayListL2 = null;
        String strG3 = null;
        int iZ = 0;
        boolean zP = false;
        boolean zP2 = false;
        boolean zP3 = false;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 1:
                    iZ = i6.a.Z(parcel, iX);
                    break;
                case 2:
                    arrayListL = i6.a.L(parcel, iX, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) i6.a.C(parcel, iX, Account.CREATOR);
                    break;
                case 4:
                    zP = i6.a.P(parcel, iX);
                    break;
                case 5:
                    zP2 = i6.a.P(parcel, iX);
                    break;
                case 6:
                    zP3 = i6.a.P(parcel, iX);
                    break;
                case 7:
                    strG = i6.a.G(parcel, iX);
                    break;
                case 8:
                    strG2 = i6.a.G(parcel, iX);
                    break;
                case 9:
                    arrayListL2 = i6.a.L(parcel, iX, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    strG3 = i6.a.G(parcel, iX);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new GoogleSignInOptions(iZ, arrayListL, account, zP, zP2, zP3, strG, strG2, arrayListL2, strG3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
