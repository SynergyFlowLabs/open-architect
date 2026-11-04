package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        Bundle bundleG = null;
        int iZ = 0;
        int iZ2 = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                iZ = i6.a.Z(parcel, iX);
            } else if (iO == 2) {
                iZ2 = i6.a.Z(parcel, iX);
            } else if (iO != 3) {
                i6.a.h0(parcel, iX);
            } else {
                bundleG = i6.a.g(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new GoogleSignInOptionsExtensionParcelable(iZ, iZ2, bundleG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInOptionsExtensionParcelable[i10];
    }
}
