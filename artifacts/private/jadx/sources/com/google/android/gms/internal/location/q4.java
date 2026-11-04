package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.zzad;
import com.google.android.gms.location.zzb;

/* JADX INFO: loaded from: classes4.dex */
public interface q4 extends IInterface {
    void A9(zzem zzemVar, com.google.android.gms.common.api.internal.k kVar) throws RemoteException;

    void B2(zzj zzjVar) throws RemoteException;

    void Ba(zzb zzbVar, PendingIntent pendingIntent, com.google.android.gms.common.api.internal.k kVar) throws RemoteException;

    @Deprecated
    LocationAvailability C3(String str) throws RemoteException;

    void Eb(LastLocationRequest lastLocationRequest, zzee zzeeVar) throws RemoteException;

    @Deprecated
    void Fa(boolean z10) throws RemoteException;

    void Gb(zzee zzeeVar, com.google.android.gms.common.api.internal.k kVar) throws RemoteException;

    void H6(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, com.google.android.gms.common.api.internal.k kVar) throws RemoteException;

    @Deprecated
    void Jd(zzei zzeiVar) throws RemoteException;

    void Mc(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, com.google.android.gms.common.api.internal.k kVar) throws RemoteException;

    void P6(PendingIntent pendingIntent) throws RemoteException;

    com.google.android.gms.common.internal.p T4(CurrentLocationRequest currentLocationRequest, zzee zzeeVar) throws RemoteException;

    @Deprecated
    void T5(LastLocationRequest lastLocationRequest, u4 u4Var) throws RemoteException;

    @Deprecated
    void U8(zzem zzemVar, o4 o4Var) throws RemoteException;

    void V4(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, com.google.android.gms.common.api.internal.k kVar) throws RemoteException;

    void W6(long j10, boolean z10, PendingIntent pendingIntent) throws RemoteException;

    @Deprecated
    Location X() throws RemoteException;

    @Deprecated
    void X5(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, o4 o4Var) throws RemoteException;

    @Deprecated
    com.google.android.gms.common.internal.p Yd(CurrentLocationRequest currentLocationRequest, u4 u4Var) throws RemoteException;

    void Za(zzee zzeeVar, LocationRequest locationRequest, com.google.android.gms.common.api.internal.k kVar) throws RemoteException;

    void a4(PendingIntent pendingIntent, com.google.android.gms.common.api.internal.k kVar) throws RemoteException;

    void bd(Location location, com.google.android.gms.common.api.internal.k kVar) throws RemoteException;

    void ge(boolean z10, com.google.android.gms.common.api.internal.k kVar) throws RemoteException;

    void k4(j4 j4Var) throws RemoteException;

    void n4(zzad zzadVar, zzee zzeeVar) throws RemoteException;

    void q8(LocationSettingsRequest locationSettingsRequest, c cVar, String str) throws RemoteException;

    @Deprecated
    void t2(Location location) throws RemoteException;

    void w3(PendingIntent pendingIntent, com.google.android.gms.common.api.internal.k kVar) throws RemoteException;

    void y6(m4 m4Var) throws RemoteException;
}
