package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        PendingIntent pendingIntent = null;
        Bundle bundleG = null;
        byte[] bArrH = null;
        int iZ = 0;
        int iZ2 = 0;
        int iZ3 = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                iZ2 = i6.a.Z(parcel, iX);
            } else if (iO == 2) {
                pendingIntent = (PendingIntent) i6.a.C(parcel, iX, PendingIntent.CREATOR);
            } else if (iO == 3) {
                iZ3 = i6.a.Z(parcel, iX);
            } else if (iO == 4) {
                bundleG = i6.a.g(parcel, iX);
            } else if (iO == 5) {
                bArrH = i6.a.h(parcel, iX);
            } else if (iO != 1000) {
                i6.a.h0(parcel, iX);
            } else {
                iZ = i6.a.Z(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new ProxyResponse(iZ, iZ2, pendingIntent, iZ3, bundleG, bArrH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ProxyResponse[i10];
    }
}
