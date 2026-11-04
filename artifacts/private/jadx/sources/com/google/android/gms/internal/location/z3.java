package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class z3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        ArrayList arrayListL = null;
        zze zzeVar = null;
        int iZ = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                iZ = i6.a.Z(parcel, iX);
            } else if (iO == 3) {
                strG = i6.a.G(parcel, iX);
            } else if (iO == 4) {
                strG2 = i6.a.G(parcel, iX);
            } else if (iO == 6) {
                strG3 = i6.a.G(parcel, iX);
            } else if (iO == 7) {
                zzeVar = (zze) i6.a.C(parcel, iX, zze.CREATOR);
            } else if (iO != 8) {
                i6.a.h0(parcel, iX);
            } else {
                arrayListL = i6.a.L(parcel, iX, Feature.CREATOR);
            }
        }
        i6.a.N(parcel, iI0);
        return new zze(iZ, strG, strG2, strG3, arrayListL, zzeVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zze[i10];
    }
}
