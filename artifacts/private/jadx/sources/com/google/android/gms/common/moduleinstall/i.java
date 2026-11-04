package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        int iZ = 0;
        boolean zP = false;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                iZ = i6.a.Z(parcel, iX);
            } else if (iO != 2) {
                i6.a.h0(parcel, iX);
            } else {
                zP = i6.a.P(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new ModuleInstallResponse(iZ, zP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ModuleInstallResponse[i10];
    }
}
