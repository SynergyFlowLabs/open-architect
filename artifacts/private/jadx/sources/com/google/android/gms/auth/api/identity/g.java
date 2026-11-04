package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        ArrayList<String> arrayListI = null;
        GoogleSignInAccount googleSignInAccount = null;
        PendingIntent pendingIntent = null;
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
                    arrayListI = i6.a.I(parcel, iX);
                    break;
                case 5:
                    googleSignInAccount = (GoogleSignInAccount) i6.a.C(parcel, iX, GoogleSignInAccount.CREATOR);
                    break;
                case 6:
                    pendingIntent = (PendingIntent) i6.a.C(parcel, iX, PendingIntent.CREATOR);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new AuthorizationResult(strG, strG2, strG3, arrayListI, googleSignInAccount, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthorizationResult[i10];
    }
}
