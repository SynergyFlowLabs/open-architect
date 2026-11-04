package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        FidoAppIdExtension fidoAppIdExtension = null;
        zzs zzsVar = null;
        UserVerificationMethodExtension userVerificationMethodExtension = null;
        zzz zzzVar = null;
        zzab zzabVar = null;
        zzad zzadVar = null;
        zzu zzuVar = null;
        zzag zzagVar = null;
        GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = null;
        zzai zzaiVar = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 2:
                    fidoAppIdExtension = (FidoAppIdExtension) i6.a.C(parcel, iX, FidoAppIdExtension.CREATOR);
                    break;
                case 3:
                    zzsVar = (zzs) i6.a.C(parcel, iX, zzs.CREATOR);
                    break;
                case 4:
                    userVerificationMethodExtension = (UserVerificationMethodExtension) i6.a.C(parcel, iX, UserVerificationMethodExtension.CREATOR);
                    break;
                case 5:
                    zzzVar = (zzz) i6.a.C(parcel, iX, zzz.CREATOR);
                    break;
                case 6:
                    zzabVar = (zzab) i6.a.C(parcel, iX, zzab.CREATOR);
                    break;
                case 7:
                    zzadVar = (zzad) i6.a.C(parcel, iX, zzad.CREATOR);
                    break;
                case 8:
                    zzuVar = (zzu) i6.a.C(parcel, iX, zzu.CREATOR);
                    break;
                case 9:
                    zzagVar = (zzag) i6.a.C(parcel, iX, zzag.CREATOR);
                    break;
                case 10:
                    googleThirdPartyPaymentExtension = (GoogleThirdPartyPaymentExtension) i6.a.C(parcel, iX, GoogleThirdPartyPaymentExtension.CREATOR);
                    break;
                case 11:
                    zzaiVar = (zzai) i6.a.C(parcel, iX, zzai.CREATOR);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new AuthenticationExtensions(fidoAppIdExtension, zzsVar, userVerificationMethodExtension, zzzVar, zzabVar, zzadVar, zzuVar, zzagVar, googleThirdPartyPaymentExtension, zzaiVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthenticationExtensions[i10];
    }
}
