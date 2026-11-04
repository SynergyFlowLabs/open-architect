package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class jd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long f110126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f110127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ kd f110128c;

    jd(kd kdVar, long j10, long j11) {
        Objects.requireNonNull(kdVar);
        this.f110128c = kdVar;
        this.f110126a = j10;
        this.f110127b = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f110128c.f110199b.f110184a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.id
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                jd jdVar = this.f110095a;
                pd pdVar = jdVar.f110128c.f110199b;
                pdVar.h();
                h7 h7Var = pdVar.f110184a;
                h7Var.a().v().a("Application going to the background");
                h7Var.x().f110175t.b(true);
                pdVar.o(true);
                if (!h7Var.w().N()) {
                    long j10 = jdVar.f110127b;
                    nd ndVar = pdVar.f110367f;
                    ndVar.d(false, false, j10);
                    ndVar.b(j10);
                }
                h7Var.a().u().b("Application backgrounded at: timestamp_millis", Long.valueOf(jdVar.f110126a));
                h7 h7Var2 = pdVar.f110184a;
                ta taVarB = h7Var2.B();
                taVarB.h();
                h7 h7Var3 = taVarB.f110184a;
                taVarB.j();
                xc xcVarJ = h7Var3.J();
                xcVarJ.h();
                xcVarJ.j();
                if (!xcVarJ.y() || xcVarJ.f110184a.C().W() >= 242600) {
                    h7Var3.J().t();
                }
                if (h7Var.w().H(null, z4.O0)) {
                    long jD = h7Var.C().P(h7Var.d().getPackageName(), h7Var.w().R()) ? 1000L : h7Var.w().D(h7Var.d().getPackageName(), z4.E);
                    h7Var.a().w().b("[sgtm] Scheduling batch upload with minimum latency in millis", Long.valueOf(jD));
                    h7Var2.N().o(jD);
                }
            }
        });
    }
}
