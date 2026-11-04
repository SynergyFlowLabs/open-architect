package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class v2 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f108912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ f4 f108913f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v2(f4 f4Var, String str) {
        super(f4Var, true);
        this.f108912e = str;
        Objects.requireNonNull(f4Var);
        this.f108913f = f4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        ((u1) com.google.android.gms.common.internal.w.r(this.f108913f.q())).endAdUnitExposure(this.f108912e, this.f108862b);
    }
}
