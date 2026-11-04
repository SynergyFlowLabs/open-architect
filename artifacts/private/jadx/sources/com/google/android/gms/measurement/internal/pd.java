package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class pd extends b5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f110364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f110365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final od f110366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final nd f110367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final kd f110368g;

    pd(h7 h7Var) {
        super(h7Var);
        this.f110365d = true;
        this.f110366e = new od(this);
        this.f110367f = new nd(this);
        this.f110368g = new kd(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.m1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void q() {
        h();
        if (this.f110364c == null) {
            this.f110364c = new com.google.android.gms.internal.measurement.q1(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.b5
    protected final boolean m() {
        return false;
    }

    @androidx.annotation.m1
    final void o(boolean z10) {
        h();
        this.f110365d = z10;
    }

    @androidx.annotation.m1
    final boolean p() {
        h();
        return this.f110365d;
    }

    final /* synthetic */ void r(long j10) {
        h();
        q();
        h7 h7Var = this.f110184a;
        h7Var.a().w().b("Activity resumed, time", Long.valueOf(j10));
        if (h7Var.w().H(null, z4.V0)) {
            if (h7Var.w().N() || this.f110365d) {
                this.f110367f.a(j10);
            }
        } else if (h7Var.w().N() || h7Var.x().f110175t.a()) {
            this.f110367f.a(j10);
        }
        this.f110368g.a();
        od odVar = this.f110366e;
        pd pdVar = odVar.f110329a;
        pdVar.h();
        if (pdVar.f110184a.g()) {
            odVar.b(pdVar.f110184a.e().currentTimeMillis(), false);
        }
    }

    final /* synthetic */ void s(long j10) {
        h();
        q();
        h7 h7Var = this.f110184a;
        h7Var.a().w().b("Activity paused, time", Long.valueOf(j10));
        this.f110368g.b(j10);
        if (h7Var.w().N()) {
            this.f110367f.b(j10);
        }
    }

    final /* synthetic */ Handler t() {
        return this.f110364c;
    }
}
