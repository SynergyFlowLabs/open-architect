package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 implements com.google.android.gms.location.e {
    static /* synthetic */ com.google.android.gms.tasks.l m(final com.google.android.gms.common.api.internal.e.b bVar) {
        com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l();
        lVar.a().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.location.f0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task) {
                com.google.android.gms.common.api.internal.e.b bVar2 = bVar;
                if (task.u()) {
                    bVar2.a(Status.f105886f);
                    return;
                }
                if (task.s()) {
                    bVar2.b(Status.f105890j);
                    return;
                }
                Exception excP = task.p();
                if (excP instanceof com.google.android.gms.common.api.b) {
                    bVar2.b(((com.google.android.gms.common.api.b) excP).a());
                } else {
                    bVar2.b(Status.f105888h);
                }
            }
        });
        return lVar;
    }

    @Override // com.google.android.gms.location.e
    @androidx.annotation.a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final com.google.android.gms.common.api.p<Status> a(com.google.android.gms.common.api.l lVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return lVar.m(new u(this, lVar, pendingIntent, locationRequest));
    }

    @Override // com.google.android.gms.location.e
    public final com.google.android.gms.common.api.p<Status> b(com.google.android.gms.common.api.l lVar, com.google.android.gms.location.n nVar) {
        return lVar.m(new x(this, lVar, nVar));
    }

    @Override // com.google.android.gms.location.e
    public final com.google.android.gms.common.api.p<Status> c(com.google.android.gms.common.api.l lVar, PendingIntent pendingIntent) {
        return lVar.m(new w(this, lVar, pendingIntent));
    }

    @Override // com.google.android.gms.location.e
    public final com.google.android.gms.common.api.p<Status> d(com.google.android.gms.common.api.l lVar, com.google.android.gms.location.o oVar) {
        return lVar.m(new v(this, lVar, oVar));
    }

    @Override // com.google.android.gms.location.e
    public final com.google.android.gms.common.api.p<Status> e(com.google.android.gms.common.api.l lVar, Location location) {
        return lVar.m(new z(this, lVar, location));
    }

    @Override // com.google.android.gms.location.e
    public final com.google.android.gms.common.api.p<Status> f(com.google.android.gms.common.api.l lVar) {
        return lVar.m(new r(this, lVar));
    }

    @Override // com.google.android.gms.location.e
    @androidx.annotation.a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final com.google.android.gms.common.api.p<Status> g(com.google.android.gms.common.api.l lVar, LocationRequest locationRequest, com.google.android.gms.location.n nVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            com.google.android.gms.common.internal.w.s(looper, "invalid null looper");
        }
        return lVar.m(new t(this, lVar, com.google.android.gms.common.api.internal.p.a(nVar, looper, com.google.android.gms.location.n.class.getSimpleName()), locationRequest));
    }

    @Override // com.google.android.gms.location.e
    @androidx.annotation.a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final com.google.android.gms.common.api.p<Status> h(com.google.android.gms.common.api.l lVar, LocationRequest locationRequest, com.google.android.gms.location.o oVar) {
        Looper looperMyLooper = Looper.myLooper();
        com.google.android.gms.common.internal.w.s(looperMyLooper, "invalid null looper");
        return lVar.m(new s(this, lVar, com.google.android.gms.common.api.internal.p.a(oVar, looperMyLooper, com.google.android.gms.location.o.class.getSimpleName()), locationRequest));
    }

    @Override // com.google.android.gms.location.e
    @androidx.annotation.a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final LocationAvailability i(com.google.android.gms.common.api.l lVar) {
        com.google.android.gms.common.internal.w.b(lVar != null, "GoogleApiClient parameter is required.");
        d3 d3Var = (d3) lVar.o(k0.f108132n);
        final AtomicReference atomicReference = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        com.google.android.gms.tasks.l lVar2 = new com.google.android.gms.tasks.l();
        try {
            d3Var.D0(com.google.android.gms.location.a0.a(), lVar2);
            lVar2.a().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.location.e0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final /* synthetic */ void onComplete(Task task) {
                    if (task.u()) {
                        atomicReference.set((LocationAvailability) task.q());
                    }
                    countDownLatch.countDown();
                }
            });
            if (d4.a(countDownLatch, 30L, TimeUnit.SECONDS)) {
                return (LocationAvailability) atomicReference.get();
            }
        } catch (RemoteException unused) {
        }
        return null;
    }

    @Override // com.google.android.gms.location.e
    public final com.google.android.gms.common.api.p<Status> j(com.google.android.gms.common.api.l lVar, boolean z10) {
        return lVar.m(new y(this, lVar, z10));
    }

    @Override // com.google.android.gms.location.e
    @androidx.annotation.a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final Location k(com.google.android.gms.common.api.l lVar) {
        com.google.android.gms.common.internal.w.b(lVar != null, "GoogleApiClient parameter is required.");
        d3 d3Var = (d3) lVar.o(k0.f108132n);
        final AtomicReference atomicReference = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        com.google.android.gms.tasks.l lVar2 = new com.google.android.gms.tasks.l();
        try {
            d3Var.E0(new LastLocationRequest.a().a(), lVar2);
            lVar2.a().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.location.g0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final /* synthetic */ void onComplete(Task task) {
                    if (task.u()) {
                        atomicReference.set((Location) task.q());
                    }
                    countDownLatch.countDown();
                }
            });
            if (d4.a(countDownLatch, 30L, TimeUnit.SECONDS)) {
                return (Location) atomicReference.get();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.location.e
    @androidx.annotation.a1(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final com.google.android.gms.common.api.p<Status> l(com.google.android.gms.common.api.l lVar, LocationRequest locationRequest, com.google.android.gms.location.o oVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            com.google.android.gms.common.internal.w.s(looper, "invalid null looper");
        }
        return lVar.m(new s(this, lVar, com.google.android.gms.common.api.internal.p.a(oVar, looper, com.google.android.gms.location.o.class.getSimpleName()), locationRequest));
    }
}
