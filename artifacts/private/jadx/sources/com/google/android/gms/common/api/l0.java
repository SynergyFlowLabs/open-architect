package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        int iZ = 0;
        boolean zP = true;
        int iZ2 = 0;
        int iZ3 = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                iZ = i6.a.Z(parcel, iX);
            } else if (iO == 2) {
                iZ2 = i6.a.Z(parcel, iX);
            } else if (iO != 3) {
                int i10 = 2 ^ 4;
                if (iO != 4) {
                    i6.a.h0(parcel, iX);
                } else {
                    zP = i6.a.P(parcel, iX);
                }
            } else {
                iZ3 = i6.a.Z(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new ComplianceOptions(iZ, iZ2, iZ3, zP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ComplianceOptions[i10];
    }
}
