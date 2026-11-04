package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.zzs;
import com.google.android.gms.common.zzu;
import com.google.android.gms.common.zzw;

/* JADX INFO: loaded from: classes4.dex */
public final class k1 extends com.google.android.gms.internal.common.a implements m1 {
    k1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.m1
    public final boolean Q7(zzw zzwVar, com.google.android.gms.dynamic.d dVar) throws RemoteException {
        Parcel parcelP = p();
        com.google.android.gms.internal.common.s.c(parcelP, zzwVar);
        com.google.android.gms.internal.common.s.e(parcelP, dVar);
        Parcel parcelI = i(5, parcelP);
        boolean zF = com.google.android.gms.internal.common.s.f(parcelI);
        parcelI.recycle();
        return zF;
    }

    @Override // com.google.android.gms.common.internal.m1
    public final boolean f() throws RemoteException {
        Parcel parcelI = i(7, p());
        boolean zF = com.google.android.gms.internal.common.s.f(parcelI);
        parcelI.recycle();
        return zF;
    }

    @Override // com.google.android.gms.common.internal.m1
    public final zzu p1(zzs zzsVar) throws RemoteException {
        Parcel parcelP = p();
        com.google.android.gms.internal.common.s.c(parcelP, zzsVar);
        Parcel parcelI = i(8, parcelP);
        zzu zzuVar = (zzu) com.google.android.gms.internal.common.s.a(parcelI, zzu.CREATOR);
        parcelI.recycle();
        return zzuVar;
    }

    @Override // com.google.android.gms.common.internal.m1
    public final boolean q() throws RemoteException {
        Parcel parcelI = i(9, p());
        boolean zF = com.google.android.gms.internal.common.s.f(parcelI);
        parcelI.recycle();
        return zF;
    }

    @Override // com.google.android.gms.common.internal.m1
    public final zzu r8(zzs zzsVar) throws RemoteException {
        Parcel parcelP = p();
        com.google.android.gms.internal.common.s.c(parcelP, zzsVar);
        Parcel parcelI = i(6, parcelP);
        zzu zzuVar = (zzu) com.google.android.gms.internal.common.s.a(parcelI, zzu.CREATOR);
        parcelI.recycle();
        return zzuVar;
    }
}
