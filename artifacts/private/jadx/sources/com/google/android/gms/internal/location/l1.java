package com.google.android.gms.internal.location;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class l1 extends com.google.android.gms.common.api.k implements com.google.android.gms.location.g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f108140n = 0;

    public l1(Activity activity) {
        super(activity, (com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.C0969d>) k0.f108133o, com.google.android.gms.common.api.a.d.N1, com.google.android.gms.common.api.k.a.f106306c);
    }

    @Override // com.google.android.gms.location.g
    public final Task<Void> G(com.google.android.gms.location.d dVar) {
        return v0(com.google.android.gms.common.api.internal.p.c(dVar, com.google.android.gms.location.d.class.getSimpleName()), 2440).m(p1.f108167a, n1.f108151a);
    }

    @Override // com.google.android.gms.location.g
    public final Task<Void> r(final DeviceOrientationRequest deviceOrientationRequest, Executor executor, com.google.android.gms.location.d dVar) {
        final com.google.android.gms.common.api.internal.o oVarB = com.google.android.gms.common.api.internal.p.b(dVar, executor, com.google.android.gms.location.d.class.getSimpleName());
        com.google.android.gms.common.api.internal.w wVar = new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.location.o1
            @Override // com.google.android.gms.common.api.internal.w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                ((d3) obj).y0(oVarB, deviceOrientationRequest, (com.google.android.gms.tasks.l) obj2);
            }
        };
        return t0(com.google.android.gms.common.api.internal.v.a().c(wVar).g(new com.google.android.gms.common.api.internal.w() { // from class: com.google.android.gms.internal.location.m1
            @Override // com.google.android.gms.common.api.internal.w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                com.google.android.gms.tasks.l lVar = (com.google.android.gms.tasks.l) obj2;
                d3 d3Var = (d3) obj;
                com.google.android.gms.common.api.internal.o.a aVarB = oVarB.b();
                if (aVarB != null) {
                    d3Var.z0(aVarB, lVar);
                }
            }
        }).h(oVarB).f(2434).a());
    }

    @Override // com.google.android.gms.common.api.k
    protected final String y0(Context context) {
        return null;
    }

    public l1(Context context) {
        super(context, (com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.C0969d>) k0.f108133o, com.google.android.gms.common.api.a.d.N1, com.google.android.gms.common.api.k.a.f106306c);
    }
}
