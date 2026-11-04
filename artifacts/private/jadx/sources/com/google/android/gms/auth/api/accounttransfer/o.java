package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
class o extends com.google.android.gms.internal.auth.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final q f105113a;

    public o(q qVar) {
        this.f105113a = qVar;
    }

    @Override // com.google.android.gms.internal.auth.o, com.google.android.gms.internal.auth.t
    public final void z5(Status status) {
        com.google.android.gms.tasks.l lVar = this.f105113a.f105114d;
        int i10 = b.f105100q;
        lVar.b(new c(status));
    }
}
