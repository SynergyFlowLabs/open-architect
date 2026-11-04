package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class i3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        IBinder iBinderY = null;
        IBinder iBinderY2 = null;
        PendingIntent pendingIntent = null;
        String strG = null;
        int iZ = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 1) {
                iZ = i6.a.Z(parcel, iX);
            } else if (iO == 2) {
                iBinderY = i6.a.Y(parcel, iX);
            } else if (iO == 3) {
                iBinderY2 = i6.a.Y(parcel, iX);
            } else if (iO == 4) {
                pendingIntent = (PendingIntent) i6.a.C(parcel, iX, PendingIntent.CREATOR);
            } else if (iO != 6) {
                i6.a.h0(parcel, iX);
            } else {
                strG = i6.a.G(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new zzee(iZ, iBinderY, iBinderY2, pendingIntent, strG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzee[i10];
    }
}
