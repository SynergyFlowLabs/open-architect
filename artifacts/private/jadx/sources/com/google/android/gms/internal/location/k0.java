package com.google.android.gms.internal.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 extends com.google.android.gms.common.api.k implements com.google.android.gms.location.f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final com.google.android.gms.common.api.a.g f108132n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a f108133o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Object f108134p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.b0("mockModeMarkerLock")
    private static Object f108135q;

    static {
        com.google.android.gms.common.api.a.g gVar = new com.google.android.gms.common.api.a.g();
        f108132n = gVar;
        f108133o = new com.google.android.gms.common.api.a("LocationServices.API", new h0(), gVar);
        f108134p = new Object();
    }

    public k0(Activity activity) {
        super(activity, (com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.C0969d>) f108133o, com.google.android.gms.common.api.a.d.N1, com.google.android.gms.common.api.k.a.f106306c);
    }

    private final Task K0(final LocationRequest locationRequest, com.google.android.gms.common.api.internal.o oVar) {
        final j0 j0Var = new j0(this, oVar, g1.f108112a);
        return t0(com.google.android.gms.common.api.internal.v.a().c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.location.v0
            @Override // com.google.android.gms.common.api.internal.w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                com.google.android.gms.common.api.a aVar = k0.f108133o;
                ((d3) obj).G0(j0Var, locationRequest, (com.google.android.gms.tasks.l) obj2);
            }
        }).g(j0Var).h(oVar).f(2435).a());
    }

    private final Task L0(final LocationRequest locationRequest, com.google.android.gms.common.api.internal.o oVar) {
        final j0 j0Var = new j0(this, oVar, b1.f108085a);
        return t0(com.google.android.gms.common.api.internal.v.a().c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.location.w0
            @Override // com.google.android.gms.common.api.internal.w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                com.google.android.gms.common.api.a aVar = k0.f108133o;
                ((d3) obj).H0(j0Var, locationRequest, (com.google.android.gms.tasks.l) obj2);
            }
        }).g(j0Var).h(oVar).f(2436).a());
    }

    private final Task M0(final DeviceOrientationRequest deviceOrientationRequest, final com.google.android.gms.common.api.internal.o oVar) {
        com.google.android.gms.common.api.internal.w wVar = new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.location.o0
            @Override // com.google.android.gms.common.api.internal.w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                com.google.android.gms.common.api.a aVar = k0.f108133o;
                ((d3) obj).y0(oVar, deviceOrientationRequest, (com.google.android.gms.tasks.l) obj2);
            }
        };
        return t0(com.google.android.gms.common.api.internal.v.a().c(wVar).g(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.location.p0
            @Override // com.google.android.gms.common.api.internal.w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                com.google.android.gms.tasks.l lVar = (com.google.android.gms.tasks.l) obj2;
                d3 d3Var = (d3) obj;
                com.google.android.gms.common.api.a aVar = k0.f108133o;
                com.google.android.gms.common.api.internal.o.a aVarB = oVar.b();
                if (aVarB != null) {
                    d3Var.z0(aVarB, lVar);
                }
            }
        }).h(oVar).f(2434).a());
    }

    @Override // com.google.android.gms.location.f
    public final Task<Location> A(final LastLocationRequest lastLocationRequest) {
        return r0(com.google.android.gms.common.api.internal.b0.a().c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.location.l0
            @Override // com.google.android.gms.common.api.internal.w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                com.google.android.gms.common.api.a aVar = k0.f108133o;
                ((d3) obj).E0(lastLocationRequest, (com.google.android.gms.tasks.l) obj2);
            }
        }).f(2414).e(com.google.android.gms.location.b1.f109636f).a());
    }

    @Override // com.google.android.gms.location.f
    public final Task<LocationAvailability> C() {
        return r0(com.google.android.gms.common.api.internal.b0.a().c(t0.f108190a).f(2416).a());
    }

    @Override // com.google.android.gms.location.f
    public final Task<Void> H(LocationRequest locationRequest, com.google.android.gms.location.n nVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            com.google.android.gms.common.internal.w.s(looper, "invalid null looper");
        }
        return L0(locationRequest, com.google.android.gms.common.api.internal.p.a(nVar, looper, com.google.android.gms.location.n.class.getSimpleName()));
    }

    @Override // com.google.android.gms.location.f
    public final Task<Void> I(final Location location) {
        com.google.android.gms.common.internal.w.a(location != null);
        return x0(com.google.android.gms.common.api.internal.b0.a().c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.location.n0
            @Override // com.google.android.gms.common.api.internal.w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                com.google.android.gms.common.api.a aVar = k0.f108133o;
                ((d3) obj).w0(location, (com.google.android.gms.tasks.l) obj2);
            }
        }).f(2421).a());
    }

    @Override // com.google.android.gms.location.f
    public final Task<Void> J(com.google.android.gms.location.o oVar) {
        return v0(com.google.android.gms.common.api.internal.p.c(oVar, com.google.android.gms.location.o.class.getSimpleName()), 2418).m(k1.f108136a, x0.f108213a);
    }

    @Override // com.google.android.gms.location.f
    public final Task<Void> K(com.google.android.gms.location.n nVar) {
        return v0(com.google.android.gms.common.api.internal.p.c(nVar, com.google.android.gms.location.n.class.getSimpleName()), 2418).m(h1.f108116a, y0.f108220a);
    }

    @Override // com.google.android.gms.location.f
    public final Task<Void> L(final PendingIntent pendingIntent) {
        return x0(com.google.android.gms.common.api.internal.b0.a().c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.location.z0
            @Override // com.google.android.gms.common.api.internal.w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                com.google.android.gms.common.api.a aVar = k0.f108133o;
                ((d3) obj).L0(pendingIntent, (com.google.android.gms.tasks.l) obj2, null);
            }
        }).f(2418).a());
    }

    @Override // com.google.android.gms.location.f
    public final Task<Void> M(LocationRequest locationRequest, Executor executor, com.google.android.gms.location.n nVar) {
        return L0(locationRequest, com.google.android.gms.common.api.internal.p.b(nVar, executor, com.google.android.gms.location.n.class.getSimpleName()));
    }

    @Override // com.google.android.gms.location.f
    public final Task<Void> N(LocationRequest locationRequest, Executor executor, com.google.android.gms.location.o oVar) {
        return K0(locationRequest, com.google.android.gms.common.api.internal.p.b(oVar, executor, com.google.android.gms.location.o.class.getSimpleName()));
    }

    @Override // com.google.android.gms.location.f
    public final Task<Void> R(LocationRequest locationRequest, com.google.android.gms.location.o oVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            com.google.android.gms.common.internal.w.s(looper, "invalid null looper");
        }
        return K0(locationRequest, com.google.android.gms.common.api.internal.p.a(oVar, looper, com.google.android.gms.location.o.class.getSimpleName()));
    }

    @Override // com.google.android.gms.location.f
    public final Task<Location> d(int i10, com.google.android.gms.tasks.a aVar) {
        CurrentLocationRequest.a aVar2 = new CurrentLocationRequest.a();
        aVar2.e(i10);
        CurrentLocationRequest currentLocationRequestA = aVar2.a();
        if (aVar != null) {
            com.google.android.gms.common.internal.w.b(!aVar.a(), "cancellationToken may not be already canceled");
        }
        Task<Location> taskR0 = r0(com.google.android.gms.common.api.internal.b0.a().c(new r0(currentLocationRequestA, aVar)).f(2415).a());
        if (aVar != null) {
            com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l(aVar);
            taskR0.l(new s0(lVar));
            taskR0 = lVar.a();
        }
        return taskR0;
    }

    @Override // com.google.android.gms.location.f
    public final Task<Location> d0() {
        return r0(com.google.android.gms.common.api.internal.b0.a().c(a1.f108082a).f(2414).a());
    }

    @Override // com.google.android.gms.location.f
    public final Task<Void> f0(com.google.android.gms.location.d dVar) {
        return v0(com.google.android.gms.common.api.internal.p.c(dVar, com.google.android.gms.location.d.class.getSimpleName()), 2440).m(j1.f108128a, q0.f108171a);
    }

    @Override // com.google.android.gms.location.f
    public final Task<Void> g(boolean z10) {
        synchronized (f108134p) {
            try {
                if (!z10) {
                    Object obj = f108135q;
                    if (obj != null) {
                        f108135q = null;
                        return v0(com.google.android.gms.common.api.internal.p.c(obj, Object.class.getSimpleName()), 2420).m(i1.f108121a, m0.f108145a);
                    }
                } else if (f108135q == null) {
                    Object obj2 = new Object();
                    f108135q = obj2;
                    return t0(com.google.android.gms.common.api.internal.v.a().c(e1.f108103a).g(f1.f108107a).h(com.google.android.gms.common.api.internal.p.a(obj2, Looper.getMainLooper(), Object.class.getSimpleName())).f(2420).a());
                }
                return com.google.android.gms.tasks.n.g(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.location.f
    public final Task<Location> h0(CurrentLocationRequest currentLocationRequest, com.google.android.gms.tasks.a aVar) {
        if (aVar != null) {
            com.google.android.gms.common.internal.w.b(!aVar.a(), "cancellationToken may not be already canceled");
        }
        Task<Location> taskR0 = r0(com.google.android.gms.common.api.internal.b0.a().c(new r0(currentLocationRequest, aVar)).f(2415).a());
        if (aVar == null) {
            return taskR0;
        }
        com.google.android.gms.tasks.l lVar = new com.google.android.gms.tasks.l(aVar);
        taskR0.l(new s0(lVar));
        return lVar.a();
    }

    @Override // com.google.android.gms.location.f
    public final Task<Void> l(final LocationRequest locationRequest, final PendingIntent pendingIntent) {
        return x0(com.google.android.gms.common.api.internal.b0.a().c(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.location.u0
            @Override // com.google.android.gms.common.api.internal.w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                com.google.android.gms.common.api.a aVar = k0.f108133o;
                ((d3) obj).I0(pendingIntent, locationRequest, (com.google.android.gms.tasks.l) obj2);
            }
        }).f(2417).a());
    }

    @Override // com.google.android.gms.location.f
    public final Task<Void> p(DeviceOrientationRequest deviceOrientationRequest, Executor executor, com.google.android.gms.location.d dVar) {
        return M0(deviceOrientationRequest, com.google.android.gms.common.api.internal.p.b(dVar, executor, com.google.android.gms.location.d.class.getSimpleName()));
    }

    @Override // com.google.android.gms.location.f
    public final Task<Void> q() {
        return x0(com.google.android.gms.common.api.internal.b0.a().c(d1.f108094a).f(2422).a());
    }

    @Override // com.google.android.gms.location.f
    public final Task<Void> v(DeviceOrientationRequest deviceOrientationRequest, com.google.android.gms.location.d dVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            com.google.android.gms.common.internal.w.s(looper, "invalid null looper");
        }
        return M0(deviceOrientationRequest, com.google.android.gms.common.api.internal.p.a(dVar, looper, com.google.android.gms.location.d.class.getSimpleName()));
    }

    @Override // com.google.android.gms.common.api.k
    protected final String y0(Context context) {
        return null;
    }

    public k0(Context context) {
        super(context, (com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.C0969d>) f108133o, com.google.android.gms.common.api.a.d.N1, com.google.android.gms.common.api.k.a.f106306c);
    }
}
