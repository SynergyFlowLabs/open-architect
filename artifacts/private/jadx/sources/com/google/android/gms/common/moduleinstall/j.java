package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        int iZ = 0;
        int iZ2 = 0;
        int iZ3 = 0;
        Long lD0 = null;
        Long lD1 = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                iZ = i6.a.Z(parcel, iX);
            } else if (iO == 2) {
                iZ2 = i6.a.Z(parcel, iX);
            } else if (iO == 3) {
                lD0 = i6.a.d0(parcel, iX);
            } else if (iO == 4) {
                lD1 = i6.a.d0(parcel, iX);
            } else if (iO != 5) {
                i6.a.h0(parcel, iX);
            } else {
                iZ3 = i6.a.Z(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new ModuleInstallStatusUpdate(iZ, iZ2, lD0, lD1, iZ3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ModuleInstallStatusUpdate[i10];
    }
}
