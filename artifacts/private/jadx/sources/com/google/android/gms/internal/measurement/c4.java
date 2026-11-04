package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class c4 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Activity f108329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ e4 f108330f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c4(e4 e4Var, Activity activity) {
        super(e4Var.f108383a, true);
        this.f108329e = activity;
        Objects.requireNonNull(e4Var);
        this.f108330f = e4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        ((u1) com.google.android.gms.common.internal.w.r(this.f108330f.f108383a.q())).onActivityDestroyedByScionActivityInfo(zzdf.O1(this.f108329e), this.f108862b);
    }
}
