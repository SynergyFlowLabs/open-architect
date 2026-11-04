package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes4.dex */
final class a0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ b0 f110974a;

    a0(b0 b0Var) {
        this.f110974a = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f110974a.f110977b) {
            try {
                b0 b0Var = this.f110974a;
                if (b0Var.f110978c != null) {
                    b0Var.f110978c.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
