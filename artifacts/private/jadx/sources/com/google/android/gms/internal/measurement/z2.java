package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class z2 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ r1 f109005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ f4 f109006f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z2(f4 f4Var, r1 r1Var) {
        super(f4Var, true);
        this.f109005e = r1Var;
        Objects.requireNonNull(f4Var);
        this.f109006f = f4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        ((u1) com.google.android.gms.common.internal.w.r(this.f109006f.q())).getCachedAppInstanceId(this.f109005e);
    }

    @Override // com.google.android.gms.internal.measurement.t3
    protected final void b() {
        this.f109005e.r(null);
    }
}
