package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class n2 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f108694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ f4 f108695f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n2(f4 f4Var, String str) {
        super(f4Var, true);
        this.f108694e = str;
        Objects.requireNonNull(f4Var);
        this.f108695f = f4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        ((u1) com.google.android.gms.common.internal.w.r(this.f108695f.q())).setUserId(this.f108694e, this.f108861a);
    }
}
