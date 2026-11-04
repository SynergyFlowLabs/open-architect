package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class q3 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ v3 f108749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ f4 f108750f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q3(f4 f4Var, v3 v3Var) {
        super(f4Var, true);
        this.f108749e = v3Var;
        Objects.requireNonNull(f4Var);
        this.f108750f = f4Var;
        int i10 = 1 >> 1;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        ((u1) com.google.android.gms.common.internal.w.r(this.f108750f.q())).registerOnMeasurementEventListener(this.f108749e);
    }
}
