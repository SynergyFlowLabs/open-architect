package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        HashSet hashSet = new HashSet();
        int iZ = 0;
        String strG = null;
        byte[] bArrH = null;
        PendingIntent pendingIntent = null;
        DeviceMetaData deviceMetaData = null;
        int iZ2 = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 1:
                    iZ = i6.a.Z(parcel, iX);
                    hashSet.add(1);
                    break;
                case 2:
                    strG = i6.a.G(parcel, iX);
                    hashSet.add(2);
                    break;
                case 3:
                    iZ2 = i6.a.Z(parcel, iX);
                    hashSet.add(3);
                    break;
                case 4:
                    bArrH = i6.a.h(parcel, iX);
                    hashSet.add(4);
                    break;
                case 5:
                    pendingIntent = (PendingIntent) i6.a.C(parcel, iX, PendingIntent.CREATOR);
                    hashSet.add(5);
                    break;
                case 6:
                    deviceMetaData = (DeviceMetaData) i6.a.C(parcel, iX, DeviceMetaData.CREATOR);
                    hashSet.add(6);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        if (parcel.dataPosition() == iI0) {
            return new zzw(hashSet, iZ, strG, iZ2, bArrH, pendingIntent, deviceMetaData);
        }
        throw new i6.a.C1923a("Overread allowed size end=" + iI0, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzw[i10];
    }
}
