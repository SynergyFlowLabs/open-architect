package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.c0;

/* JADX INFO: loaded from: classes4.dex */
final class u extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f106789a;

    u(a0 a0Var, com.google.android.gms.tasks.l lVar) {
        this.f106789a = lVar;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.a, com.google.android.gms.common.moduleinstall.internal.g
    public final void d8(Status status) {
        c0.e(status, null, this.f106789a);
    }
}
