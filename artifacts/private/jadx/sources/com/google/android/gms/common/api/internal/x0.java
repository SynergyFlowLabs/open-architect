package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes4.dex */
abstract class x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ z0 f106249a;

    @androidx.annotation.m1
    protected abstract void a();

    @Override // java.lang.Runnable
    @androidx.annotation.m1
    public final void run() {
        this.f106249a.f106270b.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    a();
                }
            } catch (RuntimeException e10) {
                this.f106249a.f106269a.g(e10);
            }
            z0 z0Var = this.f106249a;
        } finally {
            this.f106249a.f106270b.unlock();
        }
    }
}
