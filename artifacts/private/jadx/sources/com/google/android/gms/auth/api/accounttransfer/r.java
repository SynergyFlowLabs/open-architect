package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class r extends com.google.android.gms.internal.auth.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f105115a;

    r(s sVar) {
        this.f105115a = sVar;
    }

    @Override // com.google.android.gms.internal.auth.o, com.google.android.gms.internal.auth.t
    public final void j() {
        this.f105115a.f105114d.c(null);
    }

    @Override // com.google.android.gms.internal.auth.o, com.google.android.gms.internal.auth.t
    public final void z5(Status status) {
        this.f105115a.f105114d.b(new c(status));
    }
}
