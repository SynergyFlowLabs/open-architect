package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes4.dex */
final class r1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f106191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ u1 f106192b;

    r1(u1 u1Var, int i10) {
        this.f106191a = i10;
        this.f106192b = u1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f106192b.j(this.f106191a);
    }
}
