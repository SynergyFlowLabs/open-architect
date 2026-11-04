package com.google.vr.ndk.base;

import android.app.PendingIntent;
import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
class y extends com.google.vr.vrcore.library.api.a.AbstractBinderC1419a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final x f127344s;

    public y(x xVar) {
        this.f127344s = xVar;
    }

    @Override // com.google.vr.vrcore.library.api.a
    public boolean H3(com.google.vr.vrcore.library.api.c cVar) {
        return this.f127344s.z((Runnable) com.google.vr.vrcore.library.api.f.s(cVar, Runnable.class));
    }

    @Override // com.google.vr.vrcore.library.api.a
    public void N(boolean z10) {
        this.f127344s.D(z10);
    }

    @Override // com.google.vr.vrcore.library.api.a
    public void O4(com.google.vr.vrcore.library.api.c cVar) {
        this.f127344s.C((PendingIntent) com.google.vr.vrcore.library.api.f.s(cVar, PendingIntent.class));
    }

    @Override // com.google.vr.vrcore.library.api.a
    public long W2() {
        return this.f127344s.m().v();
    }

    @Override // com.google.vr.vrcore.library.api.a
    public void cf(com.google.vr.vrcore.library.api.c cVar) {
        this.f127344s.B((View) com.google.vr.vrcore.library.api.f.s(cVar, View.class));
    }

    @Override // com.google.vr.vrcore.library.api.a
    public void d() {
        this.f127344s.x();
    }

    @Override // com.google.vr.vrcore.library.api.a
    public boolean ga(com.google.vr.vrcore.library.api.c cVar) {
        return this.f127344s.k((Runnable) com.google.vr.vrcore.library.api.f.s(cVar, Runnable.class));
    }

    @Override // com.google.vr.vrcore.library.api.a
    public com.google.vr.vrcore.library.api.c getRootView() {
        return com.google.vr.vrcore.library.api.f.u(this.f127344s);
    }

    @Override // com.google.vr.vrcore.library.api.a
    public boolean i2(int i10) {
        return this.f127344s.j(i10);
    }

    @Override // com.google.vr.vrcore.library.api.a
    public void l() {
        this.f127344s.y();
    }

    @Override // com.google.vr.vrcore.library.api.a
    public void onBackPressed() {
        this.f127344s.w();
    }

    @Override // com.google.vr.vrcore.library.api.a
    public com.google.vr.vrcore.library.api.b pf() {
        return this.f127344s.n();
    }

    @Override // com.google.vr.vrcore.library.api.a
    public void shutdown() {
        this.f127344s.F();
    }
}
