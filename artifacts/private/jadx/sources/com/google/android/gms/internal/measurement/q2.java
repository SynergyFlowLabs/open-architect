package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class q2 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Bundle f108747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ f4 f108748f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q2(f4 f4Var, Bundle bundle) {
        super(f4Var, true);
        this.f108747e = bundle;
        Objects.requireNonNull(f4Var);
        this.f108748f = f4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        ((u1) com.google.android.gms.common.internal.w.r(this.f108748f.q())).setConsentThirdParty(this.f108747e, this.f108861a);
    }
}
