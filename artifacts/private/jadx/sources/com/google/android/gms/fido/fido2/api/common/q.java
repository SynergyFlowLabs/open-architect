package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        String strG = null;
        byte[] bArrH = null;
        ArrayList arrayListL = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 2) {
                strG = i6.a.G(parcel, iX);
            } else if (iO == 3) {
                bArrH = i6.a.h(parcel, iX);
            } else if (iO != 4) {
                i6.a.h0(parcel, iX);
            } else {
                arrayListL = i6.a.L(parcel, iX, Transport.CREATOR);
            }
        }
        i6.a.N(parcel, iI0);
        return new PublicKeyCredentialDescriptor(strG, bArrH, arrayListL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PublicKeyCredentialDescriptor[i10];
    }
}
