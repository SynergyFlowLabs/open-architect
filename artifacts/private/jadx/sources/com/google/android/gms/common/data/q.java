package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        String[] strArrH = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundleG = null;
        int iZ = 0;
        int iZ2 = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO != 1) {
                int i10 = 7 | 2;
                if (iO == 2) {
                    cursorWindowArr = (CursorWindow[]) i6.a.K(parcel, iX, CursorWindow.CREATOR);
                } else if (iO == 3) {
                    iZ2 = i6.a.Z(parcel, iX);
                } else if (iO == 4) {
                    bundleG = i6.a.g(parcel, iX);
                } else if (iO != 1000) {
                    i6.a.h0(parcel, iX);
                } else {
                    iZ = i6.a.Z(parcel, iX);
                }
            } else {
                strArrH = i6.a.H(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        DataHolder dataHolder = new DataHolder(iZ, strArrH, cursorWindowArr, iZ2, bundleG);
        dataHolder.W2();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new DataHolder[i10];
    }
}
