package com.google.android.gms.fido.fido2;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.fido.o0;

/* JADX INFO: loaded from: classes4.dex */
final class x extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f107351a;

    x(c cVar, com.google.android.gms.tasks.l lVar) {
        this.f107351a = lVar;
    }

    @Override // com.google.android.gms.internal.fido.p0
    public final void Z2(boolean z10) {
        this.f107351a.c(Boolean.valueOf(z10));
    }

    @Override // com.google.android.gms.internal.fido.p0
    public final void g0(Status status) {
        this.f107351a.d(new com.google.android.gms.common.api.b(status));
    }
}
