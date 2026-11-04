package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class p3 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Intent f108731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ f4 f108732f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p3(f4 f4Var, Intent intent) {
        super(f4Var, true);
        this.f108731e = intent;
        Objects.requireNonNull(f4Var);
        this.f108732f = f4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        ((u1) com.google.android.gms.common.internal.w.r(this.f108732f.q())).setSgtmDebugInfo(this.f108731e);
    }
}
