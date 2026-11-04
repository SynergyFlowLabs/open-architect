package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class x2 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Runnable f108961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ f4 f108962f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x2(f4 f4Var, Runnable runnable) {
        super(f4Var, true);
        this.f108961e = runnable;
        Objects.requireNonNull(f4Var);
        this.f108962f = f4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        ((u1) com.google.android.gms.common.internal.w.r(this.f108962f.q())).retrieveAndUploadBatches(new w2(this, this.f108961e));
    }
}
