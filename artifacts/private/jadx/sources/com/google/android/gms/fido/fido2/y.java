package com.google.android.gms.fido.fido2;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.fido.q0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class y extends q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f107352a;

    y(c cVar, com.google.android.gms.tasks.l lVar) {
        this.f107352a = lVar;
    }

    @Override // com.google.android.gms.internal.fido.r0
    public final void g0(Status status) {
        this.f107352a.d(new com.google.android.gms.common.api.b(status));
    }

    @Override // com.google.android.gms.internal.fido.r0
    public final void ub(List list) {
        this.f107352a.c(list);
    }
}
