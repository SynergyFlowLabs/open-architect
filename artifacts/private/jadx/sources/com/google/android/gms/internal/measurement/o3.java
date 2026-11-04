package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class o3 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ u3 f108709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ f4 f108710f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o3(f4 f4Var, u3 u3Var) {
        super(f4Var, true);
        this.f108709e = u3Var;
        Objects.requireNonNull(f4Var);
        this.f108710f = f4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        ((u1) com.google.android.gms.common.internal.w.r(this.f108710f.q())).setEventInterceptor(this.f108709e);
    }
}
