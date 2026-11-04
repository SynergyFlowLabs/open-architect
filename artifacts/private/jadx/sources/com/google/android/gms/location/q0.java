package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        ArrayList arrayListL = null;
        Bundle bundleG = null;
        int iZ = 0;
        long jC0 = 0;
        long jC1 = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                arrayListL = i6.a.L(parcel, iX, DetectedActivity.CREATOR);
            } else if (iO == 2) {
                jC0 = i6.a.c0(parcel, iX);
            } else if (iO == 3) {
                jC1 = i6.a.c0(parcel, iX);
            } else if (iO == 4) {
                iZ = i6.a.Z(parcel, iX);
            } else if (iO != 5) {
                i6.a.h0(parcel, iX);
            } else {
                bundleG = i6.a.g(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new ActivityRecognitionResult(arrayListL, jC0, jC1, iZ, bundleG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ActivityRecognitionResult[i10];
    }
}
