package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
class e0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final e0 f106396f = new e0(true, 3, 1, null, null, -1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f106397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.h
    final String f106398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @fj.h
    final Throwable f106399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @fj.h
    final e0 f106400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f106401e;

    private e0(boolean z10, int i10, int i11, @fj.h String str, @fj.h Throwable th2, long j10, @fj.h e0 e0Var) {
        this.f106397a = z10;
        this.f106401e = i10;
        this.f106398b = str;
        this.f106399c = th2;
        this.f106400d = e0Var;
    }

    @Deprecated
    static e0 b() {
        return f106396f;
    }

    static e0 c(@NonNull String str) {
        return new e0(false, 1, 5, str, null, -1L, null);
    }

    static e0 d(@NonNull String str, @NonNull Throwable th2) {
        return new e0(false, 1, 5, str, th2, -1L, null);
    }

    static e0 f(int i10, long j10, @fj.h e0 e0Var) {
        return new e0(true, i10, 1, null, null, j10, e0Var);
    }

    static e0 g(int i10, int i11, @NonNull String str, @fj.h Throwable th2) {
        return new e0(false, i10, i11, str, th2, -1L, null);
    }

    @fj.h
    String a() {
        return this.f106398b;
    }

    final void e() {
        if (!this.f106397a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f106399c != null) {
                a();
                return;
            }
            a();
        }
    }
}
