package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = null;
        Uri uri = null;
        byte[] bArrH = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 2) {
                publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) i6.a.C(parcel, iX, PublicKeyCredentialCreationOptions.CREATOR);
            } else if (iO == 3) {
                uri = (Uri) i6.a.C(parcel, iX, Uri.CREATOR);
            } else if (iO != 4) {
                i6.a.h0(parcel, iX);
            } else {
                bArrH = i6.a.h(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new BrowserPublicKeyCredentialCreationOptions(publicKeyCredentialCreationOptions, uri, bArrH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new BrowserPublicKeyCredentialCreationOptions[i10];
    }
}
