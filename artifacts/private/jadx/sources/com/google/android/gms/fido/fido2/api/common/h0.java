package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        boolean zP = false;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            if (i6.a.O(iX) != 1) {
                i6.a.h0(parcel, iX);
            } else {
                zP = i6.a.P(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new AuthenticationExtensionsCredPropsOutputs(zP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthenticationExtensionsCredPropsOutputs[i10];
    }
}
