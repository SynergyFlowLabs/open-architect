package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        ArrayList arrayListL = null;
        String strG = null;
        ArrayList arrayListL2 = null;
        String strG2 = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                arrayListL = i6.a.L(parcel, iX, ActivityTransition.CREATOR);
            } else if (iO == 2) {
                strG = i6.a.G(parcel, iX);
            } else if (iO == 3) {
                arrayListL2 = i6.a.L(parcel, iX, ClientIdentity.CREATOR);
            } else if (iO != 4) {
                i6.a.h0(parcel, iX);
            } else {
                strG2 = i6.a.G(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new ActivityTransitionRequest(arrayListL, strG, arrayListL2, strG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ActivityTransitionRequest[i10];
    }
}
