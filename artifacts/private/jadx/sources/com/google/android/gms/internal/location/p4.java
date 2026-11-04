package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
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
public final class p4 extends a implements q4 {
    p4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.internal.location.q4
    public final void A9(zzem zzemVar, com.google.android.gms.common.api.internal.k kVar) throws RemoteException {
        Parcel parcelI = i();
        c1.b(parcelI, zzemVar);
        c1.c(parcelI, kVar);
        n(98, parcelI);
    }

    @Override // com.google.android.gms.internal.location.q4
    public final void B2(zzj zzjVar) throws RemoteException {
        Parcel parcelI = i();
        c1.b(parcelI, zzjVar);
        n(75, parcelI);
    }

    @Override // com.google.android.gms.internal.location.q4
    public final void Ba(zzb zzbVar, PendingIntent pendingIntent, com.google.android.gms.common.api.internal.k kVar) throws RemoteException {
        Parcel parcelI = i();
        c1.b(parcelI, zzbVar);
        c1.b(parcelI, pendingIntent);
        c1.c(parcelI, kVar);
        n(70, parcelI);
    }

    @Override // com.google.android.gms.internal.location.q4
    public final LocationAvailability C3(String str) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeString(str);
        Parcel parcelK = k(34, parcelI);
        LocationAvailability locationAvailability = (LocationAvailability) c1.a(parcelK, LocationAvailability.CREATOR);
        parcelK.recycle();
        return locationAvailability;
    }

    @Override // com.google.android.gms.internal.location.q4
    public final void Eb(LastLocationRequest lastLocationRequest, zzee zzeeVar) throws RemoteException {
        Parcel parcelI = i();
        c1.b(parcelI, lastLocationRequest);
        c1.b(parcelI, zzeeVar);
        n(90, parcelI);
    }

    @Override // com.google.android.gms.internal.location.q4
    public final void Fa(boolean z10) throws RemoteException {
        Parcel parcelI = i();
        int i10 = c1.f108090b;
        parcelI.writeInt(z10 ? 1 : 0);
        n(12, parcelI);
    }

    @Override // com.google.android.gms.internal.location.q4
    public final void Gb(zzee zzeeVar, com.google.android.gms.common.api.internal.k kVar) throws RemoteException {
        Parcel parcelI = i();
        c1.b(parcelI, zzeeVar);
        c1.c(parcelI, kVar);
        n(89, parcelI);
    }

    @Override // com.google.android.gms.internal.location.q4
    public final void H6(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, com.google.android.gms.common.api.internal.k kVar) throws RemoteException {
        Parcel parcelI = i();
        c1.b(parcelI, activityTransitionRequest);
        c1.b(parcelI, pendingIntent);
        c1.c(parcelI, kVar);
        n(72, parcelI);
    }

    @Override // com.google.android.gms.internal.location.q4
    public final void Jd(zzei zzeiVar) throws RemoteException {
        Parcel parcelI = i();
        c1.b(parcelI, zzeiVar);
        n(59, parcelI);
    }

    @Override // com.google.android.gms.internal.location.q4
    public final void Mc(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, com.google.android.gms.common.api.internal.k kVar) throws RemoteException {
        Parcel parcelI = i();
        c1.b(parcelI, geofencingRequest);
        c1.b(parcelI, pendingIntent);
        c1.c(parcelI, kVar);
        n(97, parcelI);
    }

    @Override // com.google.android.gms.internal.location.q4
    public final void P6(PendingIntent pendingIntent) throws RemoteException {
        Parcel parcelI = i();
        c1.b(parcelI, pendingIntent);
        n(6, parcelI);
    }

    @Override // com.google.android.gms.internal.location.q4
    public final com.google.android.gms.common.internal.p T4(CurrentLocationRequest currentLocationRequest, zzee zzeeVar) throws RemoteException {
        Parcel parcelI = i();
        c1.b(parcelI, currentLocationRequest);
        c1.b(parcelI, zzeeVar);
        Parcel parcelK = k(92, parcelI);
        com.google.android.gms.common.internal.p pVarK = com.google.android.gms.common.internal.p.a.k(parcelK.readStrongBinder());
        parcelK.recycle();
        return pVarK;
    }

    @Override // com.google.android.gms.internal.location.q4
    public final void T5(LastLocationRequest lastLocationRequest, u4 u4Var) throws RemoteException {
        Parcel parcelI = i();
        c1.b(parcelI, lastLocationRequest);
        c1.c(parcelI, u4Var);
        n(82, parcelI);
    }

    @Override // com.google.android.gms.internal.location.q4
    public final void U8(zzem zzemVar, o4 o4Var) throws RemoteException {
        Parcel parcelI = i();
        c1.b(parcelI, zzemVar);
        c1.c(parcelI, o4Var);
        n(74, parcelI);
    }

    @Override // com.google.android.gms.internal.location.q4
    public final void V4(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, com.google.android.gms.common.api.internal.k kVar) throws RemoteException {
        Parcel parcelI = i();
        c1.b(parcelI, pendingIntent);
        c1.b(parcelI, sleepSegmentRequest);
        c1.c(parcelI, kVar);
        n(79, parcelI);
    }

    @Override // com.google.android.gms.internal.location.q4
    public final void W6(long j10, boolean z10, PendingIntent pendingIntent) throws RemoteException {
        Parcel parcelI = i();
        parcelI.writeLong(j10);
        int i10 = c1.f108090b;
        parcelI.writeInt(1);
        c1.b(parcelI, pendingIntent);
        n(5, parcelI);
    }

    @Override // com.google.android.gms.internal.location.q4
    public final Location X() throws RemoteException {
        Parcel parcelK = k(7, i());
        Location location = (Location) c1.a(parcelK, Location.CREATOR);
        parcelK.recycle();
        return location;
    }

    @Override // com.google.android.gms.internal.location.q4
    public final void X5(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, o4 o4Var) throws RemoteException {
        Parcel parcelI = i();
        c1.b(parcelI, geofencingRequest);
        c1.b(parcelI, pendingIntent);
        c1.c(parcelI, o4Var);
        n(57, parcelI);
    }

    @Override // com.google.android.gms.internal.location.q4
    public final com.google.android.gms.common.internal.p Yd(CurrentLocationRequest currentLocationRequest, u4 u4Var) throws RemoteException {
        Parcel parcelI = i();
        c1.b(parcelI, currentLocationRequest);
        c1.c(parcelI, u4Var);
        Parcel parcelK = k(87, parcelI);
        com.google.android.gms.common.internal.p pVarK = com.google.android.gms.common.internal.p.a.k(parcelK.readStrongBinder());
        parcelK.recycle();
        return pVarK;
    }

    @Override // com.google.android.gms.internal.location.q4
    public final void Za(zzee zzeeVar, LocationRequest locationRequest, com.google.android.gms.common.api.internal.k kVar) throws RemoteException {
        Parcel parcelI = i();
        c1.b(parcelI, zzeeVar);
        c1.b(parcelI, locationRequest);
        c1.c(parcelI, kVar);
        n(88, parcelI);
    }

    @Override // com.google.android.gms.internal.location.q4
    public final void a4(PendingIntent pendingIntent, com.google.android.gms.common.api.internal.k kVar) throws RemoteException {
        Parcel parcelI = i();
        c1.b(parcelI, pendingIntent);
        c1.c(parcelI, kVar);
        n(69, parcelI);
    }

    @Override // com.google.android.gms.internal.location.q4
    public final void bd(Location location, com.google.android.gms.common.api.internal.k kVar) throws RemoteException {
        Parcel parcelI = i();
        c1.b(parcelI, location);
        c1.c(parcelI, kVar);
        n(85, parcelI);
    }

    @Override // com.google.android.gms.internal.location.q4
    public final void ge(boolean z10, com.google.android.gms.common.api.internal.k kVar) throws RemoteException {
        Parcel parcelI = i();
        int i10 = c1.f108090b;
        parcelI.writeInt(z10 ? 1 : 0);
        c1.c(parcelI, kVar);
        n(84, parcelI);
    }

    @Override // com.google.android.gms.internal.location.q4
    public final void k4(j4 j4Var) throws RemoteException {
        Parcel parcelI = i();
        c1.c(parcelI, j4Var);
        n(95, parcelI);
    }

    @Override // com.google.android.gms.internal.location.q4
    public final void n4(zzad zzadVar, zzee zzeeVar) throws RemoteException {
        Parcel parcelI = i();
        c1.b(parcelI, zzadVar);
        c1.b(parcelI, zzeeVar);
        n(91, parcelI);
    }

    @Override // com.google.android.gms.internal.location.q4
    public final void q8(LocationSettingsRequest locationSettingsRequest, c cVar, String str) throws RemoteException {
        Parcel parcelI = i();
        c1.b(parcelI, locationSettingsRequest);
        c1.c(parcelI, cVar);
        parcelI.writeString(null);
        n(63, parcelI);
    }

    @Override // com.google.android.gms.internal.location.q4
    public final void t2(Location location) throws RemoteException {
        Parcel parcelI = i();
        c1.b(parcelI, location);
        n(13, parcelI);
    }

    @Override // com.google.android.gms.internal.location.q4
    public final void w3(PendingIntent pendingIntent, com.google.android.gms.common.api.internal.k kVar) throws RemoteException {
        Parcel parcelI = i();
        c1.b(parcelI, pendingIntent);
        c1.c(parcelI, kVar);
        n(73, parcelI);
    }

    @Override // com.google.android.gms.internal.location.q4
    public final void y6(m4 m4Var) throws RemoteException {
        Parcel parcelI = i();
        c1.c(parcelI, m4Var);
        n(67, parcelI);
    }
}
