package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class q9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f110390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ta f110391b;

    q9(ta taVar, Bundle bundle) {
        this.f110390a = bundle;
        Objects.requireNonNull(taVar);
        this.f110391b = taVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ta taVar = this.f110391b;
        taVar.h();
        taVar.j();
        Bundle bundle = this.f110390a;
        com.google.android.gms.common.internal.w.r(bundle);
        String strL = com.google.android.gms.common.internal.w.l(bundle.getString("name"));
        if (!taVar.f110184a.g()) {
            taVar.f110184a.a().w().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            taVar.f110184a.J().d0(new zzah(bundle.getString("app_id"), "", new zzpl(strL, 0L, null, ""), bundle.getLong(n6.a.C2338a.f332745m), bundle.getBoolean("active"), bundle.getString(n6.a.C2338a.f332736d), null, bundle.getLong(n6.a.C2338a.f332737e), null, bundle.getLong(n6.a.C2338a.f332742j), taVar.f110184a.C().R(bundle.getString("app_id"), bundle.getString(n6.a.C2338a.f332743k), bundle.getBundle(n6.a.C2338a.f332744l), "", bundle.getLong(n6.a.C2338a.f332745m), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
