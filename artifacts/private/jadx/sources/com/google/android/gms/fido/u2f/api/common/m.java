package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        Integer numA0 = null;
        Double dU = null;
        Uri uri = null;
        byte[] bArrH = null;
        ArrayList arrayListL = null;
        ChannelIdValue channelIdValue = null;
        String strG = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 2:
                    numA0 = i6.a.a0(parcel, iX);
                    break;
                case 3:
                    dU = i6.a.U(parcel, iX);
                    break;
                case 4:
                    uri = (Uri) i6.a.C(parcel, iX, Uri.CREATOR);
                    break;
                case 5:
                    bArrH = i6.a.h(parcel, iX);
                    break;
                case 6:
                    arrayListL = i6.a.L(parcel, iX, RegisteredKey.CREATOR);
                    break;
                case 7:
                    channelIdValue = (ChannelIdValue) i6.a.C(parcel, iX, ChannelIdValue.CREATOR);
                    break;
                case 8:
                    strG = i6.a.G(parcel, iX);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new SignRequestParams(numA0, dU, uri, bArrH, arrayListL, channelIdValue, strG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignRequestParams[i10];
    }
}
