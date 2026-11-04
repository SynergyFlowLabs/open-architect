package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

/* JADX INFO: loaded from: classes4.dex */
final class c extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.api.internal.o f106769a;

    public c(com.google.android.gms.common.api.internal.o oVar) {
        this.f106769a = oVar;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.j
    public final void Z7(ModuleInstallStatusUpdate moduleInstallStatusUpdate) {
        this.f106769a.d(new b(this, moduleInstallStatusUpdate));
    }
}
