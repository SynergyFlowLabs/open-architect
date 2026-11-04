package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class a7 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f109745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ d7 f109746b;

    public a7(d7 d7Var, String str) {
        Objects.requireNonNull(d7Var);
        this.f109746b = d7Var;
        com.google.android.gms.common.internal.w.r(str);
        this.f109745a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        try {
            this.f109746b.f110184a.a().o().b(this.f109745a, th2);
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
