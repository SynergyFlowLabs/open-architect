package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @com.google.common.annotations.e
    final String f110075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f110076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f110077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f110078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ k6 f110079e;

    /* synthetic */ i6(k6 k6Var, String str, long j10, byte[] bArr) {
        Objects.requireNonNull(k6Var);
        this.f110079e = k6Var;
        com.google.android.gms.common.internal.w.l("health_monitor");
        com.google.android.gms.common.internal.w.a(j10 > 0);
        this.f110075a = "health_monitor:start";
        this.f110076b = "health_monitor:count";
        this.f110077c = "health_monitor:value";
        this.f110078d = j10;
    }

    @androidx.annotation.m1
    private final void c() {
        k6 k6Var = this.f110079e;
        k6Var.h();
        long jCurrentTimeMillis = k6Var.f110184a.e().currentTimeMillis();
        SharedPreferences.Editor editorEdit = k6Var.p().edit();
        editorEdit.remove(this.f110076b);
        editorEdit.remove(this.f110077c);
        editorEdit.putLong(this.f110075a, jCurrentTimeMillis);
        editorEdit.apply();
    }

    @androidx.annotation.m1
    private final long d() {
        return this.f110079e.p().getLong(this.f110075a, 0L);
    }

    @androidx.annotation.m1
    public final void a(String str, long j10) {
        k6 k6Var = this.f110079e;
        k6Var.h();
        if (d() == 0) {
            c();
        }
        if (str == null) {
            str = "";
        }
        SharedPreferences sharedPreferencesP = k6Var.p();
        String str2 = this.f110076b;
        long j11 = sharedPreferencesP.getLong(str2, 0L);
        if (j11 <= 0) {
            SharedPreferences.Editor editorEdit = k6Var.p().edit();
            editorEdit.putString(this.f110077c, str);
            editorEdit.putLong(str2, 1L);
            editorEdit.apply();
            return;
        }
        long jNextLong = k6Var.f110184a.C().q0().nextLong() & Long.MAX_VALUE;
        long j12 = j11 + 1;
        long j13 = Long.MAX_VALUE / j12;
        SharedPreferences.Editor editorEdit2 = k6Var.p().edit();
        if (jNextLong < j13) {
            editorEdit2.putString(this.f110077c, str);
        }
        editorEdit2.putLong(str2, j12);
        editorEdit2.apply();
    }

    @androidx.annotation.m1
    public final Pair b() {
        long jAbs;
        k6 k6Var = this.f110079e;
        k6Var.h();
        k6Var.h();
        long jD = d();
        if (jD == 0) {
            c();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jD - k6Var.f110184a.e().currentTimeMillis());
        }
        long j10 = this.f110078d;
        if (jAbs < j10) {
            return null;
        }
        if (jAbs > j10 + j10) {
            c();
            return null;
        }
        String string = k6Var.p().getString(this.f110077c, null);
        long j11 = k6Var.p().getLong(this.f110076b, 0L);
        c();
        if (string != null && j11 > 0) {
            return new Pair(string, Long.valueOf(j11));
        }
        return k6.A;
    }
}
