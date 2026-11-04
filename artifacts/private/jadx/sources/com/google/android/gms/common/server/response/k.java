package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.zaa;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        String strG = null;
        String strG2 = null;
        zaa zaaVar = null;
        int iZ = 0;
        int iZ2 = 0;
        boolean zP = false;
        int iZ3 = 0;
        boolean zP2 = false;
        int iZ4 = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 1:
                    iZ = i6.a.Z(parcel, iX);
                    break;
                case 2:
                    iZ2 = i6.a.Z(parcel, iX);
                    break;
                case 3:
                    zP = i6.a.P(parcel, iX);
                    break;
                case 4:
                    iZ3 = i6.a.Z(parcel, iX);
                    break;
                case 5:
                    zP2 = i6.a.P(parcel, iX);
                    break;
                case 6:
                    strG = i6.a.G(parcel, iX);
                    break;
                case 7:
                    iZ4 = i6.a.Z(parcel, iX);
                    break;
                case 8:
                    strG2 = i6.a.G(parcel, iX);
                    break;
                case 9:
                    zaaVar = (zaa) i6.a.C(parcel, iX, zaa.CREATOR);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new FastJsonResponse.Field(iZ, iZ2, zP, iZ3, zP2, strG, iZ4, strG2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new FastJsonResponse.Field[i10];
    }
}
