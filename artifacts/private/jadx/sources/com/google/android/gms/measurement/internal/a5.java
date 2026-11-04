package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class a5 extends com.google.android.gms.internal.measurement.n0 implements d5 {
    a5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.d5
    public final void Fe(zzr zzrVar) throws RemoteException {
        Parcel parcelK = k();
        com.google.android.gms.internal.measurement.p0.c(parcelK, zzrVar);
        n(27, parcelK);
    }

    @Override // com.google.android.gms.measurement.internal.d5
    public final byte[] G3(zzbg zzbgVar, String str) throws RemoteException {
        Parcel parcelK = k();
        com.google.android.gms.internal.measurement.p0.c(parcelK, zzbgVar);
        parcelK.writeString(str);
        Parcel parcelI = i(9, parcelK);
        byte[] bArrCreateByteArray = parcelI.createByteArray();
        parcelI.recycle();
        return bArrCreateByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.d5
    public final void I8(zzr zzrVar) throws RemoteException {
        Parcel parcelK = k();
        com.google.android.gms.internal.measurement.p0.c(parcelK, zzrVar);
        n(20, parcelK);
    }

    @Override // com.google.android.gms.measurement.internal.d5
    public final List I9(String str, String str2, String str3) throws RemoteException {
        Parcel parcelK = k();
        parcelK.writeString(null);
        parcelK.writeString(str2);
        parcelK.writeString(str3);
        Parcel parcelI = i(17, parcelK);
        ArrayList arrayListCreateTypedArrayList = parcelI.createTypedArrayList(zzah.CREATOR);
        parcelI.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.d5
    public final void Ka(zzah zzahVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.d5
    public final void N8(zzr zzrVar, zzoo zzooVar, j5 j5Var) throws RemoteException {
        Parcel parcelK = k();
        com.google.android.gms.internal.measurement.p0.c(parcelK, zzrVar);
        com.google.android.gms.internal.measurement.p0.c(parcelK, zzooVar);
        com.google.android.gms.internal.measurement.p0.d(parcelK, j5Var);
        n(29, parcelK);
    }

    @Override // com.google.android.gms.measurement.internal.d5
    public final void R5(zzbg zzbgVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.d5
    public final List S8(String str, String str2, String str3, boolean z10) throws RemoteException {
        Parcel parcelK = k();
        parcelK.writeString(null);
        parcelK.writeString(str2);
        parcelK.writeString(str3);
        int i10 = com.google.android.gms.internal.measurement.p0.f108726b;
        parcelK.writeInt(z10 ? 1 : 0);
        Parcel parcelI = i(15, parcelK);
        ArrayList arrayListCreateTypedArrayList = parcelI.createTypedArrayList(zzpl.CREATOR);
        parcelI.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.d5
    public final void V3(zzpl zzplVar, zzr zzrVar) throws RemoteException {
        Parcel parcelK = k();
        com.google.android.gms.internal.measurement.p0.c(parcelK, zzplVar);
        com.google.android.gms.internal.measurement.p0.c(parcelK, zzrVar);
        n(2, parcelK);
    }

    @Override // com.google.android.gms.measurement.internal.d5
    public final String Z4(zzr zzrVar) throws RemoteException {
        Parcel parcelK = k();
        com.google.android.gms.internal.measurement.p0.c(parcelK, zzrVar);
        Parcel parcelI = i(11, parcelK);
        String string = parcelI.readString();
        parcelI.recycle();
        return string;
    }

    @Override // com.google.android.gms.measurement.internal.d5
    public final void b6(long j10, String str, String str2, String str3) throws RemoteException {
        Parcel parcelK = k();
        parcelK.writeLong(j10);
        parcelK.writeString(str);
        parcelK.writeString(str2);
        parcelK.writeString(str3);
        n(10, parcelK);
    }

    @Override // com.google.android.gms.measurement.internal.d5
    public final void ba(zzr zzrVar) throws RemoteException {
        Parcel parcelK = k();
        com.google.android.gms.internal.measurement.p0.c(parcelK, zzrVar);
        n(25, parcelK);
    }

    @Override // com.google.android.gms.measurement.internal.d5
    public final void e6(zzr zzrVar) throws RemoteException {
        Parcel parcelK = k();
        com.google.android.gms.internal.measurement.p0.c(parcelK, zzrVar);
        n(18, parcelK);
    }

    @Override // com.google.android.gms.measurement.internal.d5
    public final List k8(String str, String str2, boolean z10, zzr zzrVar) throws RemoteException {
        Parcel parcelK = k();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        int i10 = com.google.android.gms.internal.measurement.p0.f108726b;
        parcelK.writeInt(z10 ? 1 : 0);
        com.google.android.gms.internal.measurement.p0.c(parcelK, zzrVar);
        Parcel parcelI = i(14, parcelK);
        ArrayList arrayListCreateTypedArrayList = parcelI.createTypedArrayList(zzpl.CREATOR);
        parcelI.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.d5
    public final void ke(zzr zzrVar) throws RemoteException {
        Parcel parcelK = k();
        com.google.android.gms.internal.measurement.p0.c(parcelK, zzrVar);
        int i10 = 3 ^ 4;
        n(4, parcelK);
    }

    @Override // com.google.android.gms.measurement.internal.d5
    public final List m5(zzr zzrVar, boolean z10) throws RemoteException {
        Parcel parcelK = k();
        com.google.android.gms.internal.measurement.p0.c(parcelK, zzrVar);
        parcelK.writeInt(z10 ? 1 : 0);
        Parcel parcelI = i(7, parcelK);
        ArrayList arrayListCreateTypedArrayList = parcelI.createTypedArrayList(zzpl.CREATOR);
        parcelI.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.d5
    public final void m7(zzr zzrVar, zzaf zzafVar) throws RemoteException {
        Parcel parcelK = k();
        com.google.android.gms.internal.measurement.p0.c(parcelK, zzrVar);
        com.google.android.gms.internal.measurement.p0.c(parcelK, zzafVar);
        n(30, parcelK);
    }

    @Override // com.google.android.gms.measurement.internal.d5
    public final List qa(zzr zzrVar, Bundle bundle) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.d5
    public final void u1(zzah zzahVar, zzr zzrVar) throws RemoteException {
        Parcel parcelK = k();
        com.google.android.gms.internal.measurement.p0.c(parcelK, zzahVar);
        com.google.android.gms.internal.measurement.p0.c(parcelK, zzrVar);
        n(12, parcelK);
    }

    @Override // com.google.android.gms.measurement.internal.d5
    public final List v8(String str, String str2, zzr zzrVar) throws RemoteException {
        Parcel parcelK = k();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        com.google.android.gms.internal.measurement.p0.c(parcelK, zzrVar);
        Parcel parcelI = i(16, parcelK);
        ArrayList arrayListCreateTypedArrayList = parcelI.createTypedArrayList(zzah.CREATOR);
        parcelI.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.d5
    public final void wa(zzr zzrVar) throws RemoteException {
        Parcel parcelK = k();
        com.google.android.gms.internal.measurement.p0.c(parcelK, zzrVar);
        n(26, parcelK);
    }

    @Override // com.google.android.gms.measurement.internal.d5
    public final void x3(zzbg zzbgVar, zzr zzrVar) throws RemoteException {
        Parcel parcelK = k();
        com.google.android.gms.internal.measurement.p0.c(parcelK, zzbgVar);
        com.google.android.gms.internal.measurement.p0.c(parcelK, zzrVar);
        n(1, parcelK);
    }

    @Override // com.google.android.gms.measurement.internal.d5
    public final zzao x7(zzr zzrVar) throws RemoteException {
        Parcel parcelK = k();
        com.google.android.gms.internal.measurement.p0.c(parcelK, zzrVar);
        Parcel parcelI = i(21, parcelK);
        zzao zzaoVar = (zzao) com.google.android.gms.internal.measurement.p0.b(parcelI, zzao.CREATOR);
        parcelI.recycle();
        return zzaoVar;
    }

    @Override // com.google.android.gms.measurement.internal.d5
    public final void xd(zzr zzrVar, Bundle bundle, g5 g5Var) throws RemoteException {
        Parcel parcelK = k();
        com.google.android.gms.internal.measurement.p0.c(parcelK, zzrVar);
        com.google.android.gms.internal.measurement.p0.c(parcelK, bundle);
        com.google.android.gms.internal.measurement.p0.d(parcelK, g5Var);
        n(31, parcelK);
    }

    @Override // com.google.android.gms.measurement.internal.d5
    public final void y3(zzr zzrVar) throws RemoteException {
        Parcel parcelK = k();
        com.google.android.gms.internal.measurement.p0.c(parcelK, zzrVar);
        n(6, parcelK);
    }

    @Override // com.google.android.gms.measurement.internal.d5
    public final void z7(Bundle bundle, zzr zzrVar) throws RemoteException {
        Parcel parcelK = k();
        com.google.android.gms.internal.measurement.p0.c(parcelK, bundle);
        com.google.android.gms.internal.measurement.p0.c(parcelK, zzrVar);
        n(19, parcelK);
    }
}
