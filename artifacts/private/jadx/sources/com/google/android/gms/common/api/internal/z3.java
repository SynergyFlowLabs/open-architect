package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes4.dex */
final class z3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ d4 f106292a;

    z3(d4 d4Var) {
        this.f106292a = d4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f106292a.f105999m.lock();
        try {
            d4.C(this.f106292a);
            this.f106292a.f105999m.unlock();
        } catch (Throwable th2) {
            this.f106292a.f105999m.unlock();
            throw th2;
        }
    }
}
