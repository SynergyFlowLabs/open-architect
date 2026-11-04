package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class d3 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ r1 f108351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ f4 f108352f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d3(f4 f4Var, r1 r1Var) {
        super(f4Var, true);
        this.f108351e = r1Var;
        Objects.requireNonNull(f4Var);
        this.f108352f = f4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        ((u1) com.google.android.gms.common.internal.w.r(this.f108352f.q())).getCurrentScreenClass(this.f108351e);
    }

    @Override // com.google.android.gms.internal.measurement.t3
    protected final void b() {
        this.f108351e.r(null);
    }
}
