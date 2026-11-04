package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class h2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        Bundle bundleG = null;
        String strG = null;
        boolean zP = false;
        long jC0 = 0;
        long jC1 = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                jC0 = i6.a.c0(parcel, iX);
            } else if (iO == 2) {
                jC1 = i6.a.c0(parcel, iX);
            } else if (iO == 3) {
                zP = i6.a.P(parcel, iX);
            } else if (iO == 7) {
                bundleG = i6.a.g(parcel, iX);
            } else if (iO != 8) {
                i6.a.h0(parcel, iX);
            } else {
                strG = i6.a.G(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new zzdd(jC0, jC1, zP, bundleG, strG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdd[i10];
    }
}
