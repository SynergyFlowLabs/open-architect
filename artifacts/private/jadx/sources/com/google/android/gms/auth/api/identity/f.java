package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        boolean zP = false;
        boolean zP2 = false;
        boolean zP3 = false;
        boolean zP4 = false;
        ArrayList arrayListL = null;
        String strG = null;
        Account account = null;
        String strG2 = null;
        String strG3 = null;
        Bundle bundleG = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 1:
                    arrayListL = i6.a.L(parcel, iX, Scope.CREATOR);
                    break;
                case 2:
                    strG = i6.a.G(parcel, iX);
                    break;
                case 3:
                    zP = i6.a.P(parcel, iX);
                    break;
                case 4:
                    zP2 = i6.a.P(parcel, iX);
                    break;
                case 5:
                    account = (Account) i6.a.C(parcel, iX, Account.CREATOR);
                    break;
                case 6:
                    strG2 = i6.a.G(parcel, iX);
                    break;
                case 7:
                    strG3 = i6.a.G(parcel, iX);
                    break;
                case 8:
                    zP3 = i6.a.P(parcel, iX);
                    break;
                case 9:
                    bundleG = i6.a.g(parcel, iX);
                    break;
                case 10:
                    zP4 = i6.a.P(parcel, iX);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new AuthorizationRequest(arrayListL, strG, zP, zP2, account, strG2, strG3, zP3, bundleG, zP4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthorizationRequest[i10];
    }
}
