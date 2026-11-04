package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes4.dex */
public final class e1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        Scope[] scopeArr = null;
        int iZ = 0;
        int iZ2 = 0;
        int iZ3 = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                iZ = i6.a.Z(parcel, iX);
            } else if (iO == 2) {
                iZ2 = i6.a.Z(parcel, iX);
            } else if (iO == 3) {
                iZ3 = i6.a.Z(parcel, iX);
            } else if (iO != 4) {
                i6.a.h0(parcel, iX);
            } else {
                scopeArr = (Scope[]) i6.a.K(parcel, iX, Scope.CREATOR);
            }
        }
        i6.a.N(parcel, iI0);
        return new zax(iZ, iZ2, iZ3, scopeArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zax[i10];
    }
}
