package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class q2 extends i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f108174a;

    q2(com.google.android.gms.tasks.l lVar) {
        this.f108174a = lVar;
    }

    @Override // com.google.android.gms.internal.location.j4
    public final void e1(Status status, boolean z10) {
        com.google.android.gms.common.api.internal.c0.b(status, Boolean.valueOf(z10), this.f108174a);
    }
}
