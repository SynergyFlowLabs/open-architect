package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes4.dex */
abstract class b5 extends a4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f109779b;

    b5(h7 h7Var) {
        super(h7Var);
        this.f110184a.k();
    }

    final boolean i() {
        return this.f109779b;
    }

    protected final void j() {
        if (!i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void k() {
        if (this.f109779b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (m()) {
            return;
        }
        this.f110184a.l();
        this.f109779b = true;
    }

    public final void l() {
        if (this.f109779b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        n();
        this.f110184a.l();
        this.f109779b = true;
    }

    protected abstract boolean m();

    @androidx.annotation.m1
    protected void n() {
    }
}
