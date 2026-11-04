package com.google.android.gms.common.moduleinstall.internal;

import androidx.annotation.p0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
final class w extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f106791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.l f106792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.moduleinstall.a f106793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ a0 f106794d;

    w(a0 a0Var, AtomicReference atomicReference, com.google.android.gms.tasks.l lVar, com.google.android.gms.common.moduleinstall.a aVar) {
        this.f106791a = atomicReference;
        this.f106792b = lVar;
        this.f106793c = aVar;
        this.f106794d = a0Var;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.a, com.google.android.gms.common.moduleinstall.internal.g
    public final void i7(Status status, @p0 ModuleInstallResponse moduleInstallResponse) {
        if (moduleInstallResponse != null) {
            this.f106791a.set(moduleInstallResponse);
        }
        c0.e(status, null, this.f106792b);
        if (!status.q2() || (moduleInstallResponse != null && moduleInstallResponse.b2())) {
            this.f106794d.v0(com.google.android.gms.common.api.internal.p.c(this.f106793c, com.google.android.gms.common.moduleinstall.a.class.getSimpleName()), 27306);
        }
    }
}
