package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes4.dex */
final class c0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f110979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ d0 f110980b;

    c0(d0 d0Var, Task task) {
        this.f110979a = task;
        this.f110980b = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f110980b.f110982b) {
            try {
                d0 d0Var = this.f110980b;
                if (d0Var.f110983c != null) {
                    d0Var.f110983c.onComplete(this.f110979a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
