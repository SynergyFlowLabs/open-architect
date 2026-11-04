package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        HashSet hashSet = new HashSet();
        int iZ = 0;
        zzw zzwVar = null;
        String strG = null;
        String strG2 = null;
        String strG3 = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                iZ = i6.a.Z(parcel, iX);
                hashSet.add(1);
            } else if (iO == 2) {
                zzwVar = (zzw) i6.a.C(parcel, iX, zzw.CREATOR);
                hashSet.add(2);
            } else if (iO == 3) {
                strG = i6.a.G(parcel, iX);
                hashSet.add(3);
            } else if (iO == 4) {
                strG2 = i6.a.G(parcel, iX);
                hashSet.add(4);
            } else if (iO != 5) {
                i6.a.h0(parcel, iX);
            } else {
                strG3 = i6.a.G(parcel, iX);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == iI0) {
            return new zzu(hashSet, iZ, zzwVar, strG, strG2, strG3);
        }
        throw new i6.a.C1923a("Overread allowed size end=" + iI0, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzu[i10];
    }
}
