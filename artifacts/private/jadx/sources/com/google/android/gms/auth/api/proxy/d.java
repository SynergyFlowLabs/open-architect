package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        String strG = null;
        byte[] bArrH = null;
        Bundle bundleG = null;
        long jC0 = 0;
        int iZ = 0;
        int iZ2 = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                strG = i6.a.G(parcel, iX);
            } else if (iO == 2) {
                iZ2 = i6.a.Z(parcel, iX);
            } else if (iO == 3) {
                jC0 = i6.a.c0(parcel, iX);
            } else if (iO == 4) {
                bArrH = i6.a.h(parcel, iX);
            } else if (iO == 5) {
                bundleG = i6.a.g(parcel, iX);
            } else if (iO != 1000) {
                i6.a.h0(parcel, iX);
            } else {
                iZ = i6.a.Z(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new ProxyRequest(iZ, strG, iZ2, jC0, bArrH, bundleG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ProxyRequest[i10];
    }
}
