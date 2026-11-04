package com.google.android.gms.common.moduleinstall.internal;

import androidx.annotation.p0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;

/* JADX INFO: loaded from: classes4.dex */
final class y extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f106796a;

    y(a0 a0Var, com.google.android.gms.tasks.l lVar) {
        this.f106796a = lVar;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.a, com.google.android.gms.common.moduleinstall.internal.g
    public final void N2(Status status, @p0 ModuleInstallIntentResponse moduleInstallIntentResponse) {
        c0.e(status, moduleInstallIntentResponse, this.f106796a);
    }
}
