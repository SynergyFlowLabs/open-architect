package com.google.android.gms.common.moduleinstall;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            if (i6.a.O(iX) != 1) {
                i6.a.h0(parcel, iX);
            } else {
                pendingIntent = (PendingIntent) i6.a.C(parcel, iX, PendingIntent.CREATOR);
            }
        }
        i6.a.N(parcel, iI0);
        return new ModuleInstallIntentResponse(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ModuleInstallIntentResponse[i10];
    }
}
