package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class f0 implements com.google.android.gms.common.api.p.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f106019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ h0 f106020b;

    f0(h0 h0Var, BasePendingResult basePendingResult) {
        this.f106019a = basePendingResult;
        this.f106020b = h0Var;
    }

    @Override // com.google.android.gms.common.api.p.a
    public final void a(Status status) {
        this.f106020b.f106040a.remove(this.f106019a);
    }
}
