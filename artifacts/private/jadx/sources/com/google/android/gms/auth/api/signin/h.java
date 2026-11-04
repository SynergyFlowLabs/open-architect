package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Parcelable.Creator {
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
        ArrayList arrayListL = null;
        String strG7 = null;
        String strG8 = null;
        long jC0 = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 2:
                    strG = i6.a.G(parcel, iX);
                    break;
                case 3:
                    strG2 = i6.a.G(parcel, iX);
                    break;
                case 4:
                    strG3 = i6.a.G(parcel, iX);
                    break;
                case 5:
                    strG4 = i6.a.G(parcel, iX);
                    break;
                case 6:
                    uri = (Uri) i6.a.C(parcel, iX, Uri.CREATOR);
                    break;
                case 7:
                    strG5 = i6.a.G(parcel, iX);
                    break;
                case 8:
                    jC0 = i6.a.c0(parcel, iX);
                    break;
                case 9:
                    strG6 = i6.a.G(parcel, iX);
                    break;
                case 10:
                    arrayListL = i6.a.L(parcel, iX, Scope.CREATOR);
                    break;
                case 11:
                    strG7 = i6.a.G(parcel, iX);
                    break;
                case 12:
                    strG8 = i6.a.G(parcel, iX);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new GoogleSignInAccount(strG, strG2, strG3, strG4, uri, strG5, jC0, strG6, arrayListL, strG7, strG8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
