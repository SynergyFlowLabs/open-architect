package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class f4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        DeviceOrientationRequest deviceOrientationRequest = zzh.f108261e;
        List listL = zzh.f108260d;
        String strG = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                deviceOrientationRequest = (DeviceOrientationRequest) i6.a.C(parcel, iX, DeviceOrientationRequest.CREATOR);
            } else if (iO == 2) {
                listL = i6.a.L(parcel, iX, ClientIdentity.CREATOR);
            } else if (iO != 3) {
                i6.a.h0(parcel, iX);
            } else {
                strG = i6.a.G(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new zzh(deviceOrientationRequest, listL, strG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzh[i10];
    }
}
