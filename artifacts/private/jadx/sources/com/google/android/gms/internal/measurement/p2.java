package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class p2 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Boolean f108729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ f4 f108730f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p2(f4 f4Var, Boolean bool) {
        super(f4Var, true);
        this.f108729e = bool;
        Objects.requireNonNull(f4Var);
        this.f108730f = f4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        ((u1) com.google.android.gms.common.internal.w.r(this.f108730f.q())).setMeasurementEnabled(this.f108729e.booleanValue(), this.f108861a);
    }
}
