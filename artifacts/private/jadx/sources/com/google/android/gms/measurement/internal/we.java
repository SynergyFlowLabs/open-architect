package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class we implements Parcelable.Creator {
    static void a(zzpl zzplVar, Parcel parcel, int i10) {
        int i11 = zzplVar.f110874a;
        int iA = i6.b.a(parcel);
        i6.b.F(parcel, 1, i11);
        i6.b.Y(parcel, 2, zzplVar.f110875b, false);
        i6.b.K(parcel, 3, zzplVar.f110876c);
        i6.b.N(parcel, 4, zzplVar.f110877d, false);
        i6.b.z(parcel, 5, null, false);
        i6.b.Y(parcel, 6, zzplVar.f110878e, false);
        i6.b.Y(parcel, 7, zzplVar.f110879f, false);
        i6.b.u(parcel, 8, zzplVar.f110880g, false);
        i6.b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        String strG = null;
        Long lD0 = null;
        Float fW = null;
        String strG2 = null;
        String strG3 = null;
        Double dU = null;
        long jC0 = 0;
        int iZ = 0;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            switch (i6.a.O(iX)) {
                case 1:
                    iZ = i6.a.Z(parcel, iX);
                    break;
                case 2:
                    strG = i6.a.G(parcel, iX);
                    break;
                case 3:
                    jC0 = i6.a.c0(parcel, iX);
                    break;
                case 4:
                    lD0 = i6.a.d0(parcel, iX);
                    break;
                case 5:
                    fW = i6.a.W(parcel, iX);
                    break;
                case 6:
                    strG2 = i6.a.G(parcel, iX);
                    break;
                case 7:
                    strG3 = i6.a.G(parcel, iX);
                    break;
                case 8:
                    dU = i6.a.U(parcel, iX);
                    break;
                default:
                    i6.a.h0(parcel, iX);
                    break;
            }
        }
        i6.a.N(parcel, iI0);
        return new zzpl(iZ, strG, jC0, lD0, fW, strG2, strG3, dU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzpl[i10];
    }
}
