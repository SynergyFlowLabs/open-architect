package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        ArrayList arrayListL = null;
        int iZ = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO != 1) {
                int i10 = 5 ^ 2;
                if (iO != 2) {
                    i6.a.h0(parcel, iX);
                } else {
                    arrayListL = i6.a.L(parcel, iX, AccountChangeEvent.CREATOR);
                }
            } else {
                iZ = i6.a.Z(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new AccountChangeEventsResponse(iZ, arrayListL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AccountChangeEventsResponse[i10];
    }
}
