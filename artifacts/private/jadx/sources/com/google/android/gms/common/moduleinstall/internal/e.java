package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        ArrayList arrayListL = null;
        String strG = null;
        boolean zP = false;
        String strG2 = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO != 1) {
                int i10 = 0 >> 2;
                if (iO == 2) {
                    zP = i6.a.P(parcel, iX);
                } else if (iO == 3) {
                    strG2 = i6.a.G(parcel, iX);
                } else if (iO != 4) {
                    i6.a.h0(parcel, iX);
                } else {
                    strG = i6.a.G(parcel, iX);
                }
            } else {
                arrayListL = i6.a.L(parcel, iX, Feature.CREATOR);
            }
        }
        i6.a.N(parcel, iI0);
        return new ApiFeatureRequest(arrayListL, zP, strG2, strG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ApiFeatureRequest[i10];
    }
}
