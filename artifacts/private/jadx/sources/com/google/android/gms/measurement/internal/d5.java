package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface d5 extends IInterface {
    void Fe(zzr zzrVar) throws RemoteException;

    @androidx.annotation.p0
    byte[] G3(zzbg zzbgVar, String str) throws RemoteException;

    void I8(zzr zzrVar) throws RemoteException;

    List I9(String str, @androidx.annotation.p0 String str2, @androidx.annotation.p0 String str3) throws RemoteException;

    void Ka(zzah zzahVar) throws RemoteException;

    void N8(zzr zzrVar, zzoo zzooVar, j5 j5Var) throws RemoteException;

    void R5(zzbg zzbgVar, String str, @androidx.annotation.p0 String str2) throws RemoteException;

    List S8(String str, @androidx.annotation.p0 String str2, @androidx.annotation.p0 String str3, boolean z10) throws RemoteException;

    void V3(zzpl zzplVar, zzr zzrVar) throws RemoteException;

    @androidx.annotation.p0
    String Z4(zzr zzrVar) throws RemoteException;

    void b6(long j10, @androidx.annotation.p0 String str, @androidx.annotation.p0 String str2, String str3) throws RemoteException;

    void ba(zzr zzrVar) throws RemoteException;

    void e6(zzr zzrVar) throws RemoteException;

    List k8(@androidx.annotation.p0 String str, @androidx.annotation.p0 String str2, boolean z10, zzr zzrVar) throws RemoteException;

    void ke(zzr zzrVar) throws RemoteException;

    @androidx.annotation.p0
    List m5(zzr zzrVar, boolean z10) throws RemoteException;

    void m7(zzr zzrVar, zzaf zzafVar) throws RemoteException;

    List qa(zzr zzrVar, Bundle bundle) throws RemoteException;

    void u1(zzah zzahVar, zzr zzrVar) throws RemoteException;

    List v8(@androidx.annotation.p0 String str, @androidx.annotation.p0 String str2, zzr zzrVar) throws RemoteException;

    void wa(zzr zzrVar) throws RemoteException;

    void x3(zzbg zzbgVar, zzr zzrVar) throws RemoteException;

    zzao x7(zzr zzrVar) throws RemoteException;

    void xd(zzr zzrVar, Bundle bundle, g5 g5Var) throws RemoteException;

    void y3(zzr zzrVar) throws RemoteException;

    void z7(Bundle bundle, zzr zzrVar) throws RemoteException;
}
