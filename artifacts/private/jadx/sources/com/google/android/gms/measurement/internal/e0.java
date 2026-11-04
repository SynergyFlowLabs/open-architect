package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements Parcelable.Creator {
    static void a(zzbg zzbgVar, Parcel parcel, int i10) {
        String str = zzbgVar.f110858a;
        int iA = i6.b.a(parcel);
        boolean z10 = false;
        i6.b.Y(parcel, 2, str, false);
        i6.b.S(parcel, 3, zzbgVar.f110859b, i10, false);
        i6.b.Y(parcel, 4, zzbgVar.f110860c, false);
        i6.b.K(parcel, 5, zzbgVar.f110861d);
        i6.b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        long jC0 = 0;
        String strG = null;
        zzbe zzbeVar = null;
        String strG2 = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO == 2) {
                strG = i6.a.G(parcel, iX);
            } else if (iO == 3) {
                zzbeVar = (zzbe) i6.a.C(parcel, iX, zzbe.CREATOR);
            } else if (iO == 4) {
                strG2 = i6.a.G(parcel, iX);
            } else if (iO != 5) {
                i6.a.h0(parcel, iX);
            } else {
                jC0 = i6.a.c0(parcel, iX);
            }
        }
        i6.a.N(parcel, iI0);
        return new zzbg(strG, zzbeVar, strG2, jC0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbg[i10];
    }
}
