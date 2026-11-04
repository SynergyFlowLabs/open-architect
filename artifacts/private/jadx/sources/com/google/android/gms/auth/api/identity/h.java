package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        boolean zP = false;
        int iZ = 0;
        boolean zP2 = false;
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = null;
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = null;
        String strG = null;
        BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = null;
        BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 1:
                    passwordRequestOptions = (BeginSignInRequest.PasswordRequestOptions) i6.a.C(parcel, iX, BeginSignInRequest.PasswordRequestOptions.CREATOR);
                    break;
                case 2:
                    googleIdTokenRequestOptions = (BeginSignInRequest.GoogleIdTokenRequestOptions) i6.a.C(parcel, iX, BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR);
                    break;
                case 3:
                    strG = i6.a.G(parcel, iX);
                    break;
                case 4:
                    zP = i6.a.P(parcel, iX);
                    break;
                case 5:
                    iZ = i6.a.Z(parcel, iX);
                    break;
                case 6:
                    passkeysRequestOptions = (BeginSignInRequest.PasskeysRequestOptions) i6.a.C(parcel, iX, BeginSignInRequest.PasskeysRequestOptions.CREATOR);
                    break;
                case 7:
                    passkeyJsonRequestOptions = (BeginSignInRequest.PasskeyJsonRequestOptions) i6.a.C(parcel, iX, BeginSignInRequest.PasskeyJsonRequestOptions.CREATOR);
                    break;
                case 8:
                    zP2 = i6.a.P(parcel, iX);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, strG, zP, iZ, passkeysRequestOptions, passkeyJsonRequestOptions, zP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new BeginSignInRequest[i10];
    }
}
