package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes4.dex */
abstract class l8 extends k8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f110230b;

    l8(h7 h7Var) {
        super(h7Var);
        this.f110184a.k();
    }

    protected abstract boolean i();

    protected void j() {
    }

    final boolean k() {
        return this.f110230b;
    }

    protected final void l() {
        if (!k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void m() {
        if (this.f110230b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (i()) {
            return;
        }
        this.f110184a.l();
        this.f110230b = true;
    }

    public final void n() {
        if (this.f110230b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        j();
        this.f110184a.l();
        this.f110230b = true;
    }
}
