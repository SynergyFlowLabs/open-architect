package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class x3 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Activity f108963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ e4 f108964f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x3(e4 e4Var, Activity activity) {
        super(e4Var.f108383a, true);
        this.f108963e = activity;
        Objects.requireNonNull(e4Var);
        this.f108964f = e4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        ((u1) com.google.android.gms.common.internal.w.r(this.f108964f.f108383a.q())).onActivityStartedByScionActivityInfo(zzdf.O1(this.f108963e), this.f108862b);
    }
}
