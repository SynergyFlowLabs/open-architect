package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes4.dex */
final class g0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f110989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ h0 f110990b;

    g0(h0 h0Var, Task task) {
        this.f110989a = task;
        this.f110990b = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f110990b.f110992b) {
            try {
                h0 h0Var = this.f110990b;
                if (h0Var.f110993c != null) {
                    h0Var.f110993c.b(this.f110989a.q());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
