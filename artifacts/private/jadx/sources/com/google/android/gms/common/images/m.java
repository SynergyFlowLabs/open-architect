package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        int iZ = 0;
        int iZ2 = 0;
        Uri uri = null;
        int iZ3 = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                iZ = i6.a.Z(parcel, iX);
            } else if (iO == 2) {
                uri = (Uri) i6.a.C(parcel, iX, Uri.CREATOR);
            } else if (iO == 3) {
                iZ3 = i6.a.Z(parcel, iX);
            } else if (iO != 4) {
                i6.a.h0(parcel, iX);
            } else {
                iZ2 = i6.a.Z(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new WebImage(iZ, uri, iZ3, iZ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new WebImage[i10];
    }
}
