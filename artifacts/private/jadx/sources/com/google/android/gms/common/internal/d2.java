package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class d2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArrU = null;
        int[] iArrU2 = null;
        boolean zP = false;
        boolean zP2 = false;
        int iZ = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) i6.a.C(parcel, iX, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    zP = i6.a.P(parcel, iX);
                    break;
                case 3:
                    zP2 = i6.a.P(parcel, iX);
                    break;
                case 4:
                    iArrU = i6.a.u(parcel, iX);
                    break;
                case 5:
                    iZ = i6.a.Z(parcel, iX);
                    break;
                case 6:
                    iArrU2 = i6.a.u(parcel, iX);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zP, zP2, iArrU, iZ, iArrU2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ConnectionTelemetryConfiguration[i10];
    }
}
