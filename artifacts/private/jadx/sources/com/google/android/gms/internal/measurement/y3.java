package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class y3 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Activity f108977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ e4 f108978f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y3(e4 e4Var, Activity activity) {
        super(e4Var.f108383a, true);
        this.f108977e = activity;
        Objects.requireNonNull(e4Var);
        this.f108978f = e4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        ((u1) com.google.android.gms.common.internal.w.r(this.f108978f.f108383a.q())).onActivityResumedByScionActivityInfo(zzdf.O1(this.f108977e), this.f108862b);
    }
}
