package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class s7 extends e7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f107798a;

    s7(c cVar, com.google.android.gms.tasks.l lVar) {
        this.f107798a = lVar;
    }

    @Override // com.google.android.gms.internal.auth.f7
    public final void b4(Status status, @androidx.annotation.p0 AccountChangeEventsResponse accountChangeEventsResponse) {
        c.K0(status, accountChangeEventsResponse, this.f107798a);
    }
}
