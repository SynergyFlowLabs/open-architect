package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        String strG4 = null;
        Uri uri = null;
        String strG5 = null;
        String strG6 = null;
        String strG7 = null;
        PublicKeyCredential publicKeyCredential = null;
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
                    strG4 = i6.a.G(parcel, iX);
                    break;
                case 5:
                    uri = (Uri) i6.a.C(parcel, iX, Uri.CREATOR);
                    break;
                case 6:
                    strG5 = i6.a.G(parcel, iX);
                    break;
                case 7:
                    strG6 = i6.a.G(parcel, iX);
                    break;
                case 8:
                    strG7 = i6.a.G(parcel, iX);
                    break;
                case 9:
                    publicKeyCredential = (PublicKeyCredential) i6.a.C(parcel, iX, PublicKeyCredential.CREATOR);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new SignInCredential(strG, strG2, strG3, strG4, uri, strG5, strG6, strG7, publicKeyCredential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInCredential[i10];
    }
}
