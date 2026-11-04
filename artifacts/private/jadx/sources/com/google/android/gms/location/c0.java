package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.internal.location.zze;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        WorkSource workSource = new WorkSource();
        zze zzeVar = null;
        boolean zP = false;
        int iZ = 0;
        int iZ2 = 0;
        boolean zP2 = false;
        long jC0 = -1;
        float fV = 0.0f;
        int iZ3 = Integer.MAX_VALUE;
        long jC1 = Long.MAX_VALUE;
        long jC2 = Long.MAX_VALUE;
        long jC3 = 0;
        long jC4 = 600000;
        long jC5 = 3600000;
        int iZ4 = 102;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 1:
                    iZ4 = i6.a.Z(parcel, iX);
                    break;
                case 2:
                    jC5 = i6.a.c0(parcel, iX);
                    break;
                case 3:
                    jC4 = i6.a.c0(parcel, iX);
                    break;
                case 4:
                case 14:
                default:
                    i6.a.h0(parcel, iX);
                    break;
                case 5:
                    jC1 = i6.a.c0(parcel, iX);
                    break;
                case 6:
                    iZ3 = i6.a.Z(parcel, iX);
                    break;
                case 7:
                    fV = i6.a.V(parcel, iX);
                    break;
                case 8:
                    jC3 = i6.a.c0(parcel, iX);
                    break;
                case 9:
                    zP = i6.a.P(parcel, iX);
                    break;
                case 10:
                    jC2 = i6.a.c0(parcel, iX);
                    break;
                case 11:
                    jC0 = i6.a.c0(parcel, iX);
                    break;
                case 12:
                    iZ = i6.a.Z(parcel, iX);
                    break;
                case 13:
                    iZ2 = i6.a.Z(parcel, iX);
                    break;
                case 15:
                    zP2 = i6.a.P(parcel, iX);
                    break;
                case 16:
                    workSource = (WorkSource) i6.a.C(parcel, iX, WorkSource.CREATOR);
                    break;
                case 17:
                    zzeVar = (zze) i6.a.C(parcel, iX, zze.CREATOR);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new LocationRequest(iZ4, jC5, jC4, jC3, jC1, jC2, iZ3, fV, zP, jC0, iZ, iZ2, zP2, workSource, zzeVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
