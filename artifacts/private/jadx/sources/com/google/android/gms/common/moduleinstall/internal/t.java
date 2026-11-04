package com.google.android.gms.common.moduleinstall.internal;

import androidx.annotation.p0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;

/* JADX INFO: loaded from: classes4.dex */
final class t extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f106788a;

    t(a0 a0Var, com.google.android.gms.tasks.l lVar) {
        this.f106788a = lVar;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.a, com.google.android.gms.common.moduleinstall.internal.g
    public final void Fd(Status status, @p0 ModuleAvailabilityResponse moduleAvailabilityResponse) {
        c0.e(status, moduleAvailabilityResponse, this.f106788a);
    }
}
