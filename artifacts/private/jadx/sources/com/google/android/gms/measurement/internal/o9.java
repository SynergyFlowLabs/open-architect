package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
final class o9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f110320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ta f110321b;

    o9(ta taVar, long j10) {
        this.f110320a = j10;
        Objects.requireNonNull(taVar);
        this.f110321b = taVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ta taVar = this.f110321b;
        taVar.h();
        taVar.j();
        h7 h7Var = taVar.f110184a;
        h7Var.a().v().a("Resetting analytics data (FE)");
        h7 h7Var2 = taVar.f110184a;
        pd pdVarZ = h7Var2.z();
        pdVarZ.h();
        pdVarZ.f110367f.c();
        h7Var2.L().p();
        boolean z10 = !taVar.f110184a.g();
        k6 k6VarX = h7Var.x();
        k6VarX.f110161f.b(this.f110320a);
        h7 h7Var3 = k6VarX.f110184a;
        if (!TextUtils.isEmpty(h7Var3.x().f110178w.a())) {
            k6VarX.f110178w.b(null);
        }
        k6VarX.f110172q.b(0L);
        k6VarX.f110173r.b(0L);
        if (!h7Var3.w().L()) {
            k6VarX.y(z10);
        }
        k6VarX.f110179x.b(null);
        k6VarX.f110180y.b(0L);
        k6VarX.f110181z.b(null);
        h7Var2.J().p();
        h7Var2.z().f110366e.a();
        taVar.f110548s = z10;
        h7Var2.J().q(new AtomicReference());
    }
}
