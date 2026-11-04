package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class p9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f110358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ta f110359b;

    p9(ta taVar, Bundle bundle) {
        this.f110358a = bundle;
        Objects.requireNonNull(taVar);
        this.f110359b = taVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ta taVar = this.f110359b;
        taVar.h();
        taVar.j();
        Bundle bundle = this.f110358a;
        com.google.android.gms.common.internal.w.r(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        com.google.android.gms.common.internal.w.l(string);
        com.google.android.gms.common.internal.w.l(string2);
        com.google.android.gms.common.internal.w.r(bundle.get("value"));
        if (!taVar.f110184a.g()) {
            taVar.f110184a.a().w().a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzpl zzplVar = new zzpl(string, bundle.getLong(n6.a.C2338a.f332747o), bundle.get("value"), string2);
        try {
            h7 h7Var = taVar.f110184a;
            zzbg zzbgVarR = h7Var.C().R(bundle.getString("app_id"), bundle.getString(n6.a.C2338a.f332740h), bundle.getBundle(n6.a.C2338a.f332741i), string2, 0L, true, true);
            taVar.f110184a.J().d0(new zzah(bundle.getString("app_id"), string2, zzplVar, bundle.getLong(n6.a.C2338a.f332745m), false, bundle.getString(n6.a.C2338a.f332736d), h7Var.C().R(bundle.getString("app_id"), bundle.getString(n6.a.C2338a.f332738f), bundle.getBundle(n6.a.C2338a.f332739g), string2, 0L, true, true), bundle.getLong(n6.a.C2338a.f332737e), zzbgVarR, bundle.getLong(n6.a.C2338a.f332742j), h7Var.C().R(bundle.getString("app_id"), bundle.getString(n6.a.C2338a.f332743k), bundle.getBundle(n6.a.C2338a.f332744l), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
