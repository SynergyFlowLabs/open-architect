package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.zzad;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class d3 extends com.google.android.gms.common.internal.k {

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public static final /* synthetic */ int f108095z3 = 0;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private final androidx.collection.h3 f108096v3;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private final androidx.collection.h3 f108097w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private final androidx.collection.h3 f108098x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private final androidx.collection.h3 f108099y3;

    public d3(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, com.google.android.gms.common.api.internal.f fVar, com.google.android.gms.common.api.internal.r rVar) {
        super(context, looper, 23, hVar, fVar, rVar);
        this.f108096v3 = new androidx.collection.h3();
        this.f108097w3 = new androidx.collection.h3();
        this.f108098x3 = new androidx.collection.h3();
        this.f108099y3 = new androidx.collection.h3();
    }

    private final boolean C0(Feature feature) {
        Feature feature2;
        Feature[] featureArrV = v();
        if (featureArrV != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= featureArrV.length) {
                    feature2 = null;
                    break;
                }
                feature2 = featureArrV[i10];
                if (feature.O1().equals(feature2.O1())) {
                    break;
                }
                i10++;
            }
            if (feature2 != null && feature2.T1() >= feature.T1()) {
                return true;
            }
        }
        return false;
    }

    public final void A0(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, com.google.android.gms.tasks.l lVar) throws RemoteException {
        if (C0(com.google.android.gms.location.b1.f109644n)) {
            ((q4) M()).Mc(geofencingRequest, pendingIntent, new n2(null, lVar));
        } else {
            ((q4) M()).X5(geofencingRequest, pendingIntent, new k2(lVar));
        }
    }

    public final void B0(zzem zzemVar, com.google.android.gms.tasks.l lVar) throws RemoteException {
        if (C0(com.google.android.gms.location.b1.f109644n)) {
            ((q4) M()).A9(zzemVar, new n2(null, lVar));
        } else {
            ((q4) M()).U8(zzemVar, new k2(lVar));
        }
    }

    @Override // com.google.android.gms.common.internal.f
    public final Feature[] C() {
        return com.google.android.gms.location.b1.f109646p;
    }

    public final void D0(zzad zzadVar, com.google.android.gms.tasks.l lVar) throws RemoteException {
        if (C0(com.google.android.gms.location.b1.f109640j)) {
            ((q4) M()).n4(zzadVar, new zzee(5, null, new p2(lVar), null, null));
        } else {
            lVar.c(((q4) M()).C3(G().getPackageName()));
        }
    }

    public final void E0(LastLocationRequest lastLocationRequest, com.google.android.gms.tasks.l lVar) throws RemoteException {
        if (C0(com.google.android.gms.location.b1.f109640j)) {
            ((q4) M()).Eb(lastLocationRequest, zzee.e2(new o2(lVar)));
        } else if (C0(com.google.android.gms.location.b1.f109636f)) {
            ((q4) M()).T5(lastLocationRequest, new o2(lVar));
        } else {
            lVar.c(((q4) M()).X());
        }
    }

    public final void F0(CurrentLocationRequest currentLocationRequest, com.google.android.gms.tasks.a aVar, final com.google.android.gms.tasks.l lVar) throws RemoteException {
        if (C0(com.google.android.gms.location.b1.f109640j)) {
            final com.google.android.gms.common.internal.p pVarT4 = ((q4) M()).T4(currentLocationRequest, zzee.e2(new o2(lVar)));
            if (aVar != null) {
                aVar.b(new com.google.android.gms.tasks.h() { // from class: com.google.android.gms.internal.location.h3
                    @Override // com.google.android.gms.tasks.h
                    public final /* synthetic */ void a() {
                        int i10 = d3.f108095z3;
                        try {
                            pVarT4.cancel();
                        } catch (RemoteException unused) {
                        }
                    }
                });
                return;
            }
            return;
        }
        if (C0(com.google.android.gms.location.b1.f109635e)) {
            final com.google.android.gms.common.internal.p pVarYd = ((q4) M()).Yd(currentLocationRequest, new o2(lVar));
            if (aVar != null) {
                aVar.b(new com.google.android.gms.tasks.h() { // from class: com.google.android.gms.internal.location.f3
                    @Override // com.google.android.gms.tasks.h
                    public final /* synthetic */ void a() {
                        int i10 = d3.f108095z3;
                        try {
                            pVarYd.cancel();
                        } catch (RemoteException unused) {
                        }
                    }
                });
                return;
            }
            return;
        }
        com.google.android.gms.common.api.internal.o oVarB = com.google.android.gms.common.api.internal.p.b(new l2(this, lVar), c4.a(), "GetCurrentLocation");
        final com.google.android.gms.common.api.internal.o.a aVarB = oVarB.b();
        Objects.requireNonNull(aVarB);
        m2 m2Var = new m2(this, oVarB, lVar);
        com.google.android.gms.tasks.l lVar2 = new com.google.android.gms.tasks.l();
        LocationRequest.a aVar2 = new LocationRequest.a(currentLocationRequest.e2(), 0L);
        aVar2.i(0L);
        aVar2.b(currentLocationRequest.O1());
        aVar2.c(currentLocationRequest.T1());
        aVar2.e(currentLocationRequest.b2());
        aVar2.m(currentLocationRequest.a());
        aVar2.l(currentLocationRequest.f2());
        aVar2.k(true);
        aVar2.n(currentLocationRequest.n2());
        H0(m2Var, aVar2.a(), lVar2);
        lVar2.a().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.location.e3
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task) {
                int i10 = d3.f108095z3;
                if (!task.u()) {
                    com.google.android.gms.tasks.l lVar3 = lVar;
                    Exception excP = task.p();
                    Objects.requireNonNull(excP);
                    lVar3.d(excP);
                }
            }
        });
        if (aVar != null) {
            aVar.b(new com.google.android.gms.tasks.h() { // from class: com.google.android.gms.internal.location.g3
                @Override // com.google.android.gms.tasks.h
                public final /* synthetic */ void a() {
                    try {
                        this.f108114a.K0(aVarB, true, new com.google.android.gms.tasks.l());
                    } catch (RemoteException unused) {
                    }
                }
            });
        }
    }

    public final void G0(v2 v2Var, LocationRequest locationRequest, com.google.android.gms.tasks.l lVar) throws RemoteException {
        c3 c3Var;
        com.google.android.gms.common.api.internal.o oVarA = v2Var.a();
        com.google.android.gms.common.api.internal.o.a aVarB = oVarA.b();
        Objects.requireNonNull(aVarB);
        boolean zC0 = C0(com.google.android.gms.location.b1.f109640j);
        synchronized (this.f108096v3) {
            try {
                c3 c3Var2 = (c3) this.f108096v3.get(aVarB);
                if (c3Var2 == null || zC0) {
                    c3 c3Var3 = new c3(v2Var);
                    this.f108096v3.put(aVarB, c3Var3);
                    c3Var = c3Var3;
                } else {
                    c3Var2.n(oVarA);
                    c3Var = c3Var2;
                    c3Var2 = null;
                }
                if (zC0) {
                    ((q4) M()).Za(zzee.O1(c3Var2, c3Var, aVarB.a()), locationRequest, new n2(null, lVar));
                } else {
                    ((q4) M()).Jd(new zzei(1, zzeg.O1(null, locationRequest), c3Var, null, null, new s2(lVar, c3Var), aVarB.a()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void H0(v2 v2Var, LocationRequest locationRequest, com.google.android.gms.tasks.l lVar) throws RemoteException {
        z2 z2Var;
        com.google.android.gms.common.api.internal.o oVarA = v2Var.a();
        com.google.android.gms.common.api.internal.o.a aVarB = oVarA.b();
        Objects.requireNonNull(aVarB);
        boolean zC0 = C0(com.google.android.gms.location.b1.f109640j);
        synchronized (this.f108097w3) {
            try {
                z2 z2Var2 = (z2) this.f108097w3.get(aVarB);
                if (z2Var2 == null || zC0) {
                    z2 z2Var3 = new z2(v2Var);
                    this.f108097w3.put(aVarB, z2Var3);
                    z2Var = z2Var3;
                } else {
                    z2Var2.n(oVarA);
                    z2Var = z2Var2;
                    z2Var2 = null;
                }
                if (zC0) {
                    ((q4) M()).Za(zzee.T1(z2Var2, z2Var, aVarB.a()), locationRequest, new n2(null, lVar));
                } else {
                    ((q4) M()).Jd(new zzei(1, zzeg.O1(null, locationRequest), null, z2Var, null, new h2(lVar, z2Var), aVarB.a()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void I0(PendingIntent pendingIntent, LocationRequest locationRequest, com.google.android.gms.tasks.l lVar) throws RemoteException {
        if (C0(com.google.android.gms.location.b1.f109640j)) {
            ((q4) M()).Za(zzee.b2(pendingIntent), locationRequest, new n2(null, lVar));
            return;
        }
        q4 q4Var = (q4) M();
        zzeg zzegVarO1 = zzeg.O1(null, locationRequest);
        r2 r2Var = new r2(null, lVar);
        int iHashCode = pendingIntent.hashCode();
        StringBuilder sb2 = new StringBuilder(String.valueOf(iHashCode).length() + 14);
        sb2.append("PendingIntent@");
        sb2.append(iHashCode);
        q4Var.Jd(new zzei(1, zzegVarO1, null, null, pendingIntent, r2Var, sb2.toString()));
    }

    public final void J0(com.google.android.gms.common.api.internal.o.a aVar, boolean z10, com.google.android.gms.tasks.l lVar) throws RemoteException {
        synchronized (this.f108096v3) {
            try {
                c3 c3Var = (c3) this.f108096v3.remove(aVar);
                if (c3Var == null) {
                    lVar.c(Boolean.FALSE);
                    return;
                }
                c3Var.c();
                if (!z10) {
                    lVar.c(Boolean.TRUE);
                } else if (C0(com.google.android.gms.location.b1.f109640j)) {
                    q4 q4Var = (q4) M();
                    int iIdentityHashCode = System.identityHashCode(c3Var);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iIdentityHashCode).length() + 18);
                    sb2.append("ILocationListener@");
                    sb2.append(iIdentityHashCode);
                    q4Var.Gb(zzee.O1(null, c3Var, sb2.toString()), new n2(Boolean.TRUE, lVar));
                } else {
                    ((q4) M()).Jd(new zzei(2, null, c3Var, null, null, new r2(Boolean.TRUE, lVar), null));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void K0(com.google.android.gms.common.api.internal.o.a aVar, boolean z10, com.google.android.gms.tasks.l lVar) throws RemoteException {
        synchronized (this.f108097w3) {
            try {
                z2 z2Var = (z2) this.f108097w3.remove(aVar);
                if (z2Var == null) {
                    lVar.c(Boolean.FALSE);
                    return;
                }
                z2Var.p();
                if (!z10) {
                    lVar.c(Boolean.TRUE);
                } else if (C0(com.google.android.gms.location.b1.f109640j)) {
                    q4 q4Var = (q4) M();
                    int iIdentityHashCode = System.identityHashCode(z2Var);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iIdentityHashCode).length() + 18);
                    sb2.append("ILocationCallback@");
                    sb2.append(iIdentityHashCode);
                    q4Var.Gb(zzee.T1(null, z2Var, sb2.toString()), new n2(Boolean.TRUE, lVar));
                } else {
                    int i10 = 7 ^ 2;
                    ((q4) M()).Jd(new zzei(2, null, null, z2Var, null, new r2(Boolean.TRUE, lVar), null));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void L0(PendingIntent pendingIntent, com.google.android.gms.tasks.l lVar, Object obj) throws RemoteException {
        if (C0(com.google.android.gms.location.b1.f109640j)) {
            ((q4) M()).Gb(zzee.b2(pendingIntent), new n2(null, lVar));
        } else {
            ((q4) M()).Jd(new zzei(2, null, null, null, pendingIntent, new r2(null, lVar), null));
        }
    }

    public final void M0(com.google.android.gms.tasks.l lVar) throws RemoteException {
        if (C0(com.google.android.gms.location.b1.f109637g)) {
            ((q4) M()).ge(true, new n2(null, lVar));
        } else {
            ((q4) M()).Fa(true);
            lVar.c(null);
        }
    }

    @Override // com.google.android.gms.common.internal.f
    protected final String N() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public final void N0(com.google.android.gms.tasks.l lVar) throws RemoteException {
        if (C0(com.google.android.gms.location.b1.f109637g)) {
            ((q4) M()).ge(false, new n2(Boolean.TRUE, lVar));
        } else {
            ((q4) M()).Fa(false);
            lVar.c(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.common.internal.f
    protected final String O() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.f
    public final void V(int i10) {
        super.V(i10);
        synchronized (this.f108096v3) {
            this.f108096v3.clear();
        }
        synchronized (this.f108097w3) {
            try {
                this.f108097w3.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f108098x3) {
            try {
                this.f108098x3.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.f
    public final boolean b0() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.a.f
    public final int n() {
        return 11717000;
    }

    public final void w0(Location location, com.google.android.gms.tasks.l lVar) throws RemoteException {
        if (C0(com.google.android.gms.location.b1.f109638h)) {
            ((q4) M()).bd(location, new n2(null, lVar));
        } else {
            ((q4) M()).t2(location);
            lVar.c(null);
        }
    }

    public final void x0(com.google.android.gms.tasks.l lVar) throws RemoteException {
        ((q4) M()).y6(new r2(null, lVar));
    }

    public final void y0(com.google.android.gms.common.api.internal.o oVar, DeviceOrientationRequest deviceOrientationRequest, com.google.android.gms.tasks.l lVar) throws RemoteException {
        com.google.android.gms.common.api.internal.o.a aVarB = oVar.b();
        Objects.requireNonNull(aVarB);
        synchronized (this.f108098x3) {
            try {
                u2 u2Var = (u2) this.f108098x3.get(aVarB);
                if (u2Var == null) {
                    u2Var = new u2(oVar);
                    this.f108098x3.put(aVarB, u2Var);
                } else {
                    u2Var.n(oVar);
                }
                ((q4) M()).B2(new zzj(1, new zzh(deviceOrientationRequest, zzh.f108260d, null), u2Var, new r2(null, lVar)));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.f
    protected final /* synthetic */ IInterface z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof q4 ? (q4) iInterfaceQueryLocalInterface : new p4(iBinder);
    }

    public final void z0(com.google.android.gms.common.api.internal.o.a aVar, com.google.android.gms.tasks.l lVar) throws RemoteException {
        synchronized (this.f108098x3) {
            try {
                u2 u2Var = (u2) this.f108098x3.remove(aVar);
                if (u2Var == null) {
                    lVar.c(Boolean.FALSE);
                } else {
                    u2Var.j();
                    ((q4) M()).B2(new zzj(2, null, u2Var, new r2(Boolean.TRUE, lVar)));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
