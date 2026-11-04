package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes4.dex */
public final class c2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        Bundle bundleG = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int iZ = 0;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                bundleG = i6.a.g(parcel, iX);
            } else if (iO == 2) {
                featureArr = (Feature[]) i6.a.K(parcel, iX, Feature.CREATOR);
            } else if (iO == 3) {
                iZ = i6.a.Z(parcel, iX);
            } else if (iO != 4) {
                i6.a.h0(parcel, iX);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) i6.a.C(parcel, iX, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        i6.a.N(parcel, iI0);
        return new zzk(bundleG, featureArr, iZ, connectionTelemetryConfiguration);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzk[i10];
    }
}
