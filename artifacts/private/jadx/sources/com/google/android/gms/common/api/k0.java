package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 implements Parcelable.Creator {
    public static final ApiMetadata a(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        ComplianceOptions complianceOptions = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            if (i6.a.O(iX) != 1) {
                i6.a.h0(parcel, iX);
            } else {
                complianceOptions = (ComplianceOptions) i6.a.C(parcel, iX, ComplianceOptions.CREATOR);
            }
        }
        i6.a.N(parcel, iI0);
        return new ApiMetadata(complianceOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ApiMetadata[i10];
    }
}
