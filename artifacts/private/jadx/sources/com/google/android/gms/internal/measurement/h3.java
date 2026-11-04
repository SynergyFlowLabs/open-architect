package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class h3 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Bundle f108478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ r1 f108479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ f4 f108480g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h3(f4 f4Var, Bundle bundle, r1 r1Var) {
        super(f4Var, true);
        this.f108478e = bundle;
        this.f108479f = r1Var;
        Objects.requireNonNull(f4Var);
        this.f108480g = f4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        ((u1) com.google.android.gms.common.internal.w.r(this.f108480g.q())).performAction(this.f108478e, this.f108479f, this.f108861a);
    }

    @Override // com.google.android.gms.internal.measurement.t3
    protected final void b() {
        this.f108479f.r(null);
    }
}
