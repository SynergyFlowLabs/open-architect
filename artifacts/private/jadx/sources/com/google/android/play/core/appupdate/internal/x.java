package com.google.android.play.core.appupdate.internal;

/* JADX INFO: loaded from: classes4.dex */
final class x extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ d0 f114860b;

    x(d0 d0Var) {
        this.f114860b = d0Var;
    }

    @Override // com.google.android.play.core.appupdate.internal.t
    public final void a() {
        synchronized (this.f114860b.f114828f) {
            try {
                if (this.f114860b.f114833k.get() > 0 && this.f114860b.f114833k.decrementAndGet() > 0) {
                    this.f114860b.f114824b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                d0 d0Var = this.f114860b;
                if (d0Var.f114835m != null) {
                    d0Var.f114824b.d("Unbind from service.", new Object[0]);
                    d0 d0Var2 = this.f114860b;
                    d0Var2.f114823a.unbindService(d0Var2.f114834l);
                    this.f114860b.f114829g = false;
                    this.f114860b.f114835m = null;
                    this.f114860b.f114834l = null;
                }
                this.f114860b.w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
