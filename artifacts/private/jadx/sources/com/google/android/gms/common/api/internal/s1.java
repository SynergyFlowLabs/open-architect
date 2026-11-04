package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes4.dex */
final class s1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ t1 f106198a;

    s1(t1 t1Var) {
        this.f106198a = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u1 u1Var = this.f106198a.f106204a;
        u1Var.f106217b.e(u1Var.f106217b.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
