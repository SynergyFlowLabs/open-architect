package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        ArrayList arrayListL = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            if (i6.a.O(iX) != 1) {
                i6.a.h0(parcel, iX);
            } else {
                arrayListL = i6.a.L(parcel, iX, UvmEntry.CREATOR);
            }
        }
        i6.a.N(parcel, iI0);
        return new UvmEntries(arrayListL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new UvmEntries[i10];
    }
}
