package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.internal.location.zze;

/* JADX INFO: loaded from: classes4.dex */
public final class w0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        WorkSource workSource = new WorkSource();
        zze zzeVar = null;
        int iZ = 0;
        boolean zP = false;
        int iZ2 = 0;
        long jC0 = Long.MAX_VALUE;
        long jC1 = Long.MAX_VALUE;
        int iZ3 = 102;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 1:
                    jC0 = i6.a.c0(parcel, iX);
                    break;
                case 2:
                    iZ = i6.a.Z(parcel, iX);
                    break;
                case 3:
                    iZ3 = i6.a.Z(parcel, iX);
                    break;
                case 4:
                    jC1 = i6.a.c0(parcel, iX);
                    break;
                case 5:
                    zP = i6.a.P(parcel, iX);
                    break;
                case 6:
                    workSource = (WorkSource) i6.a.C(parcel, iX, WorkSource.CREATOR);
                    break;
                case 7:
                    iZ2 = i6.a.Z(parcel, iX);
                    break;
                case 8:
                default:
                    i6.a.h0(parcel, iX);
                    break;
                case 9:
                    zzeVar = (zze) i6.a.C(parcel, iX, zze.CREATOR);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new CurrentLocationRequest(jC0, iZ, iZ3, jC1, zP, iZ2, workSource, zzeVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new CurrentLocationRequest[i10];
    }
}
