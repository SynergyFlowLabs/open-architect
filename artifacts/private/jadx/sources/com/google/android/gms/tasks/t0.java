package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
final class t0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ q0 f111030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Callable f111031b;

    t0(q0 q0Var, Callable callable) {
        this.f111030a = q0Var;
        this.f111031b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f111030a.y(this.f111031b.call());
        } catch (Exception e10) {
            this.f111030a.x(e10);
        } catch (Throwable th2) {
            this.f111030a.x(new RuntimeException(th2));
        }
    }
}
