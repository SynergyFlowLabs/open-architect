package com.google.android.gms.internal.location;

import com.google.android.gms.location.DeviceOrientation;

/* JADX INFO: loaded from: classes4.dex */
final class u2 extends com.google.android.gms.location.f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private com.google.android.gms.common.api.internal.o f108197a;

    u2(com.google.android.gms.common.api.internal.o oVar) {
        this.f108197a = oVar;
    }

    @Override // com.google.android.gms.location.g1
    public final void Qa(DeviceOrientation deviceOrientation) {
        com.google.android.gms.common.api.internal.o oVar;
        synchronized (this) {
            try {
                oVar = this.f108197a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        oVar.d(new t2(this, deviceOrientation));
    }

    final synchronized void j() {
        this.f108197a.a();
    }

    final synchronized void n(com.google.android.gms.common.api.internal.o oVar) {
        com.google.android.gms.common.api.internal.o oVar2 = this.f108197a;
        if (oVar2 != oVar) {
            oVar2.a();
            this.f108197a = oVar;
        }
    }
}
