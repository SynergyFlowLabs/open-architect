package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
final class c1 implements com.google.android.gms.common.api.l.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f105974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a0 f105975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ i1 f105976c;

    c1(i1 i1Var, AtomicReference atomicReference, a0 a0Var) {
        this.f105974a = atomicReference;
        this.f105975b = a0Var;
        this.f105976c = i1Var;
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void i(@androidx.annotation.p0 Bundle bundle) {
        this.f105976c.T((com.google.android.gms.common.api.l) com.google.android.gms.common.internal.w.r((com.google.android.gms.common.api.l) this.f105974a.get()), this.f105975b, true);
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void k(int i10) {
    }
}
