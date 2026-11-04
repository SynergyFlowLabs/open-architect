package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class s2 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f108789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ f4 f108790f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s2(f4 f4Var, long j10) {
        super(f4Var, true);
        this.f108789e = j10;
        Objects.requireNonNull(f4Var);
        this.f108790f = f4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        ((u1) com.google.android.gms.common.internal.w.r(this.f108790f.q())).setSessionTimeoutDuration(this.f108789e);
    }
}
