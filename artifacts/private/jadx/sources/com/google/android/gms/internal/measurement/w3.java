package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class w3 extends t3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Bundle f108939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ Activity f108940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ e4 f108941g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w3(e4 e4Var, Bundle bundle, Activity activity) {
        super(e4Var.f108383a, true);
        this.f108939e = bundle;
        this.f108940f = activity;
        Objects.requireNonNull(e4Var);
        this.f108941g = e4Var;
    }

    @Override // com.google.android.gms.internal.measurement.t3
    final void a() throws RemoteException {
        Bundle bundle;
        Bundle bundle2 = this.f108939e;
        if (bundle2 != null) {
            bundle = new Bundle();
            if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = bundle2.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        u1 u1Var = (u1) com.google.android.gms.common.internal.w.r(this.f108941g.f108383a.q());
        Activity activity = this.f108940f;
        u1Var.onActivityCreatedByScionActivityInfo(zzdf.O1(activity), bundle, this.f108862b);
    }
}
