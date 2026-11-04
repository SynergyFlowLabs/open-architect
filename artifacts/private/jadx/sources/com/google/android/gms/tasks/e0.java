package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes4.dex */
final class e0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f110984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ f0 f110985b;

    e0(f0 f0Var, Task task) {
        this.f110984a = task;
        this.f110985b = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f110985b.f110987b) {
            try {
                f0 f0Var = this.f110985b;
                if (f0Var.f110988c != null) {
                    f0Var.f110988c.d((Exception) com.google.android.gms.common.internal.w.r(this.f110984a.p()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
