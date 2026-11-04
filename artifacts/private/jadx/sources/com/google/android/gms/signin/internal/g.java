package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        ArrayList<String> arrayListI = null;
        String strG = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                arrayListI = i6.a.I(parcel, iX);
            } else if (iO != 2) {
                i6.a.h0(parcel, iX);
            } else {
                strG = i6.a.G(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new zag(arrayListI, strG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zag[i10];
    }
}
