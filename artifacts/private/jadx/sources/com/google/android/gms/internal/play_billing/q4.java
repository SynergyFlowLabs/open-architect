package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
final class q4 extends k3 implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f109267h;

    public q4(Runnable runnable) {
        runnable.getClass();
        this.f109267h = runnable;
    }

    @Override // com.google.android.gms.internal.play_billing.n3
    protected final String g() {
        return "task=[" + this.f109267h.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f109267h.run();
        } catch (Throwable th2) {
            n(th2);
            throw th2;
        }
    }
}
