package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        byte[] bArrH = null;
        byte[] bArrH2 = null;
        byte[] bArrH3 = null;
        long jC0 = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                jC0 = i6.a.c0(parcel, iX);
            } else if (iO == 2) {
                bArrH = i6.a.h(parcel, iX);
            } else if (iO == 3) {
                bArrH2 = i6.a.h(parcel, iX);
            } else if (iO != 4) {
                i6.a.h0(parcel, iX);
            } else {
                bArrH3 = i6.a.h(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new zzq(jC0, bArrH, bArrH2, bArrH3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzq[i10];
    }
}
