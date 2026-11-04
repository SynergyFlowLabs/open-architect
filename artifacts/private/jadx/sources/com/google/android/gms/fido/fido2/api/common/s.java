package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        byte[] bArrH = null;
        Double dU = null;
        String strG = null;
        ArrayList arrayListL = null;
        Integer numA0 = null;
        TokenBinding tokenBinding = null;
        String strG2 = null;
        AuthenticationExtensions authenticationExtensions = null;
        Long lD0 = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 2:
                    bArrH = i6.a.h(parcel, iX);
                    break;
                case 3:
                    dU = i6.a.U(parcel, iX);
                    break;
                case 4:
                    strG = i6.a.G(parcel, iX);
                    break;
                case 5:
                    arrayListL = i6.a.L(parcel, iX, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 6:
                    numA0 = i6.a.a0(parcel, iX);
                    break;
                case 7:
                    tokenBinding = (TokenBinding) i6.a.C(parcel, iX, TokenBinding.CREATOR);
                    break;
                case 8:
                    strG2 = i6.a.G(parcel, iX);
                    break;
                case 9:
                    authenticationExtensions = (AuthenticationExtensions) i6.a.C(parcel, iX, AuthenticationExtensions.CREATOR);
                    break;
                case 10:
                    lD0 = i6.a.d0(parcel, iX);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new PublicKeyCredentialRequestOptions(bArrH, dU, strG, arrayListL, numA0, tokenBinding, strG2, authenticationExtensions, lD0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PublicKeyCredentialRequestOptions[i10];
    }
}
