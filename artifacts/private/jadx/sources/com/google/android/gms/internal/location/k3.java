package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class k3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        zzeg zzegVar = null;
        IBinder iBinderY = null;
        IBinder iBinderY2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinderY3 = null;
        String strG = null;
        int iZ = 1;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 1:
                    iZ = i6.a.Z(parcel, iX);
                    break;
                case 2:
                    zzegVar = (zzeg) i6.a.C(parcel, iX, zzeg.CREATOR);
                    break;
                case 3:
                    iBinderY = i6.a.Y(parcel, iX);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) i6.a.C(parcel, iX, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinderY2 = i6.a.Y(parcel, iX);
                    break;
                case 6:
                    iBinderY3 = i6.a.Y(parcel, iX);
                    break;
                case 7:
                default:
                    i6.a.h0(parcel, iX);
                    break;
                case 8:
                    strG = i6.a.G(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new zzei(iZ, zzegVar, iBinderY, iBinderY2, pendingIntent, iBinderY3, strG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzei[i10];
    }
}
