package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        int iZ = 0;
        PendingIntent pendingIntent = null;
        String strG = null;
        String strG2 = null;
        ArrayList<String> arrayListI = null;
        String strG3 = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 1:
                    pendingIntent = (PendingIntent) i6.a.C(parcel, iX, PendingIntent.CREATOR);
                    break;
                case 2:
                    strG = i6.a.G(parcel, iX);
                    break;
                case 3:
                    strG2 = i6.a.G(parcel, iX);
                    break;
                case 4:
                    arrayListI = i6.a.I(parcel, iX);
                    break;
                case 5:
                    strG3 = i6.a.G(parcel, iX);
                    break;
                case 6:
                    iZ = i6.a.Z(parcel, iX);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new SaveAccountLinkingTokenRequest(pendingIntent, strG, strG2, arrayListI, strG3, iZ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SaveAccountLinkingTokenRequest[i10];
    }
}
