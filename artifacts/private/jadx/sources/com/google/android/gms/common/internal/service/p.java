package com.google.android.gms.common.internal.service;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.b0;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends com.google.android.gms.common.api.k implements d0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a.g f106632n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a.AbstractC0967a f106633o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f106634p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f106635q = 0;

    static {
        com.google.android.gms.common.api.a.g gVar = new com.google.android.gms.common.api.a.g();
        f106632n = gVar;
        o oVar = new o();
        f106633o = oVar;
        f106634p = new com.google.android.gms.common.api.a("ClientTelemetry.API", oVar, gVar);
    }

    public p(Context context, e0 e0Var) {
        super(context, (com.google.android.gms.common.api.a<e0>) f106634p, e0Var, com.google.android.gms.common.api.k.a.f106306c);
    }

    @Override // com.google.android.gms.common.internal.d0
    public final Task<Void> F(final TelemetryData telemetryData) {
        b0.a aVarA = b0.a();
        aVarA.e(com.google.android.gms.internal.base.d.f107927a);
        aVarA.d(false);
        aVarA.c(new w() { // from class: com.google.android.gms.common.internal.service.n
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                int i10 = p.f106635q;
                ((j) ((q) obj).M()).s(telemetryData);
                ((com.google.android.gms.tasks.l) obj2).c(null);
            }
        });
        return p0(aVarA.a());
    }
}
