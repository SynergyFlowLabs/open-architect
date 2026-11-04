package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = i6.a.i0(parcel);
        UvmEntries uvmEntries = null;
        zzf zzfVar = null;
        AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = null;
        zzh zzhVar = null;
        while (parcel.dataPosition() < iI0) {
            int iX = i6.a.X(parcel);
            int iO = i6.a.O(iX);
            if (iO != 1) {
                int i10 = 1 >> 2;
                if (iO != 2) {
                    int i11 = i10 ^ 3;
                    if (iO == 3) {
                        authenticationExtensionsCredPropsOutputs = (AuthenticationExtensionsCredPropsOutputs) i6.a.C(parcel, iX, AuthenticationExtensionsCredPropsOutputs.CREATOR);
                    } else if (iO != 4) {
                        i6.a.h0(parcel, iX);
                    } else {
                        zzhVar = (zzh) i6.a.C(parcel, iX, zzh.CREATOR);
                    }
                } else {
                    zzfVar = (zzf) i6.a.C(parcel, iX, zzf.CREATOR);
                }
            } else {
                uvmEntries = (UvmEntries) i6.a.C(parcel, iX, UvmEntries.CREATOR);
            }
        }
        i6.a.N(parcel, iI0);
        return new AuthenticationExtensionsClientOutputs(uvmEntries, zzfVar, authenticationExtensionsCredPropsOutputs, zzhVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthenticationExtensionsClientOutputs[i10];
    }
}
