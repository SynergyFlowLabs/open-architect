package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class q1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        int iZ = 0;
        boolean zP = false;
        boolean zP2 = false;
        int iZ2 = 0;
        int iZ3 = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                iZ = i6.a.Z(parcel, iX);
            } else if (iO == 2) {
                zP = i6.a.P(parcel, iX);
            } else if (iO == 3) {
                zP2 = i6.a.P(parcel, iX);
            } else if (iO == 4) {
                iZ2 = i6.a.Z(parcel, iX);
            } else if (iO != 5) {
                i6.a.h0(parcel, iX);
            } else {
                iZ3 = i6.a.Z(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new RootTelemetryConfiguration(iZ, zP, zP2, iZ2, iZ3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new RootTelemetryConfiguration[i10];
    }
}
