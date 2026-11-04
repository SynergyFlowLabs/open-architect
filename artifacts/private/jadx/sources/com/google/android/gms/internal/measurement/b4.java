package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class b4 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Activity f108291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ r1 f108292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ e4 f108293g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b4(e4 e4Var, Activity activity, r1 r1Var) {
        super(e4Var.f108383a, true);
        this.f108291e = activity;
        this.f108292f = r1Var;
        Objects.requireNonNull(e4Var);
        this.f108293g = e4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        ((u1) com.google.android.gms.common.internal.w.r(this.f108293g.f108383a.q())).onActivitySaveInstanceStateByScionActivityInfo(zzdf.O1(this.f108291e), this.f108292f, this.f108862b);
    }
}
