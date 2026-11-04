package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class r2 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ f4 f108766e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r2(f4 f4Var) {
        super(f4Var, true);
        Objects.requireNonNull(f4Var);
        this.f108766e = f4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        ((u1) com.google.android.gms.common.internal.w.r(this.f108766e.q())).resetAnalyticsData(this.f108861a);
    }
}
