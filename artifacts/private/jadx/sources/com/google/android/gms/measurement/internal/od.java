package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class od {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ pd f110329a;

    od(pd pdVar) {
        Objects.requireNonNull(pdVar);
        this.f110329a = pdVar;
    }

    @androidx.annotation.m1
    final void a() {
        pd pdVar = this.f110329a;
        pdVar.h();
        h7 h7Var = pdVar.f110184a;
        if (h7Var.x().A(h7Var.e().currentTimeMillis())) {
            h7Var.x().f110168m.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                h7Var.a().w().a("Detected application was in foreground");
                c(h7Var.e().currentTimeMillis(), false);
            }
        }
    }

    @androidx.annotation.m1
    final void b(long j10, boolean z10) {
        pd pdVar = this.f110329a;
        pdVar.h();
        pdVar.q();
        h7 h7Var = pdVar.f110184a;
        if (h7Var.x().A(j10)) {
            h7Var.x().f110168m.b(true);
            pdVar.f110184a.L().p();
        }
        h7Var.x().f110172q.b(j10);
        if (h7Var.x().f110168m.a()) {
            c(j10, z10);
        }
    }

    @androidx.annotation.l1
    @androidx.annotation.m1
    final void c(long j10, boolean z10) {
        pd pdVar = this.f110329a;
        pdVar.h();
        if (pdVar.f110184a.g()) {
            h7 h7Var = pdVar.f110184a;
            h7Var.x().f110172q.b(j10);
            h7Var.a().w().b("Session started, time", Long.valueOf(h7Var.e().b()));
            long j11 = j10 / 1000;
            h7 h7Var2 = pdVar.f110184a;
            h7Var2.B().B("auto", "_sid", Long.valueOf(j11), j10);
            h7Var.x().f110173r.b(j11);
            h7Var.x().f110168m.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j11);
            h7Var2.B().u("auto", "_s", j10, bundle);
            String strA = h7Var.x().f110178w.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strA);
            h7Var2.B().u("auto", "_ssr", j10, bundle2);
        }
    }
}
