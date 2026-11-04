package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        long jC0 = 0;
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
                jC0 = i6.a.c0(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new ActivityTransitionEvent(iZ, iZ2, jC0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ActivityTransitionEvent[i10];
    }
}
