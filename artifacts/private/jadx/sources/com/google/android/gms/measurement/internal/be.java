package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes4.dex */
abstract class be extends xd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f109799c;

    be(qe qeVar) {
        super(qeVar);
        this.f110700b.e0();
    }

    final boolean i() {
        return this.f109799c;
    }

    protected final void j() {
        if (!i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void k() {
        if (this.f109799c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        l();
        this.f110700b.f0();
        this.f109799c = true;
    }

    protected abstract boolean l();
}
