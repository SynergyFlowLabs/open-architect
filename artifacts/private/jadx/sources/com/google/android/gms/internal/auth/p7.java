package com.google.android.gms.internal.auth;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class p7 extends g7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f107759a;

    p7(c cVar, com.google.android.gms.tasks.l lVar) {
        this.f107759a = lVar;
    }

    @Override // com.google.android.gms.internal.auth.h7
    public final void g1(Status status, @androidx.annotation.p0 Bundle bundle) {
        c.K0(status, bundle, this.f107759a);
    }
}
