package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes4.dex */
public final class bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f109065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ec f109066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private gc f109067c = gc.h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f109068d;

    bc() {
    }

    final void a() {
        this.f109065a = null;
        this.f109066b = null;
        this.f109067c.c(null);
    }

    public final boolean b(Object obj) {
        boolean z10 = true;
        this.f109068d = true;
        ec ecVar = this.f109066b;
        if (ecVar == null || !ecVar.a(obj)) {
            z10 = false;
        }
        if (z10) {
            this.f109065a = null;
            this.f109066b = null;
            this.f109067c = null;
        }
        return z10;
    }

    protected final void finalize() {
        gc gcVar;
        ec ecVar = this.f109066b;
        if (ecVar != null && !ecVar.isDone()) {
            ecVar.b(new cc("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f109065a))));
        }
        if (this.f109068d || (gcVar = this.f109067c) == null) {
            return;
        }
        gcVar.c(null);
    }
}
