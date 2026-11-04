package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        String strG = null;
        String strG2 = null;
        byte[] bArrH = null;
        AuthenticatorAttestationResponse authenticatorAttestationResponse = null;
        AuthenticatorAssertionResponse authenticatorAssertionResponse = null;
        AuthenticatorErrorResponse authenticatorErrorResponse = null;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = null;
        String strG3 = null;
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
                    authenticatorAttestationResponse = (AuthenticatorAttestationResponse) i6.a.C(parcel, iX, AuthenticatorAttestationResponse.CREATOR);
                    break;
                case 5:
                    authenticatorAssertionResponse = (AuthenticatorAssertionResponse) i6.a.C(parcel, iX, AuthenticatorAssertionResponse.CREATOR);
                    break;
                case 6:
                    authenticatorErrorResponse = (AuthenticatorErrorResponse) i6.a.C(parcel, iX, AuthenticatorErrorResponse.CREATOR);
                    break;
                case 7:
                    authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) i6.a.C(parcel, iX, AuthenticationExtensionsClientOutputs.CREATOR);
                    break;
                case 8:
                    strG3 = i6.a.G(parcel, iX);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new PublicKeyCredential(strG, strG2, bArrH, authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, strG3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PublicKeyCredential[i10];
    }
}
