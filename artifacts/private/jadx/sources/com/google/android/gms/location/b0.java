package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zze;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        zze zzeVar = null;
        boolean zP = false;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                zP = i6.a.P(parcel, iX);
            } else if (iO != 2) {
                i6.a.h0(parcel, iX);
            } else {
                zzeVar = (zze) i6.a.C(parcel, iX, zze.CREATOR);
            }
        }
        i6.a.N(parcel, iI0);
        return new zzad(zP, zzeVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzad[i10];
    }
}
