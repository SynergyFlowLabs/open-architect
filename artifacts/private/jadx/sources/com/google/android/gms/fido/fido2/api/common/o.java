package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
        byte[] bArrH = null;
        ArrayList arrayListL = null;
        Double dU = null;
        ArrayList arrayListL2 = null;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
        Integer numA0 = null;
        TokenBinding tokenBinding = null;
        String strG = null;
        AuthenticationExtensions authenticationExtensions = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 2:
                    publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) i6.a.C(parcel, iX, PublicKeyCredentialRpEntity.CREATOR);
                    break;
                case 3:
                    publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) i6.a.C(parcel, iX, PublicKeyCredentialUserEntity.CREATOR);
                    break;
                case 4:
                    bArrH = i6.a.h(parcel, iX);
                    break;
                case 5:
                    arrayListL = i6.a.L(parcel, iX, PublicKeyCredentialParameters.CREATOR);
                    break;
                case 6:
                    dU = i6.a.U(parcel, iX);
                    break;
                case 7:
                    arrayListL2 = i6.a.L(parcel, iX, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 8:
                    authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) i6.a.C(parcel, iX, AuthenticatorSelectionCriteria.CREATOR);
                    break;
                case 9:
                    numA0 = i6.a.a0(parcel, iX);
                    break;
                case 10:
                    tokenBinding = (TokenBinding) i6.a.C(parcel, iX, TokenBinding.CREATOR);
                    break;
                case 11:
                    strG = i6.a.G(parcel, iX);
                    break;
                case 12:
                    authenticationExtensions = (AuthenticationExtensions) i6.a.C(parcel, iX, AuthenticationExtensions.CREATOR);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArrH, arrayListL, dU, arrayListL2, authenticatorSelectionCriteria, numA0, tokenBinding, strG, authenticationExtensions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PublicKeyCredentialCreationOptions[i10];
    }
}
