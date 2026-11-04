package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        HashSet hashSet = new HashSet();
        int iZ = 0;
        ArrayList arrayListL = null;
        zzs zzsVar = null;
        int iZ2 = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                iZ = i6.a.Z(parcel, iX);
                hashSet.add(1);
            } else if (iO == 2) {
                arrayListL = i6.a.L(parcel, iX, zzu.CREATOR);
                hashSet.add(2);
            } else if (iO == 3) {
                iZ2 = i6.a.Z(parcel, iX);
                hashSet.add(3);
            } else if (iO != 4) {
                i6.a.h0(parcel, iX);
            } else {
                zzsVar = (zzs) i6.a.C(parcel, iX, zzs.CREATOR);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == iI0) {
            return new zzo(hashSet, iZ, arrayListL, iZ2, zzsVar);
        }
        throw new i6.a.C1923a("Overread allowed size end=" + iI0, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzo[i10];
    }
}
