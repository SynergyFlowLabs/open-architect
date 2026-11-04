package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class f9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ta f109955a;

    f9(ta taVar) {
        Objects.requireNonNull(taVar);
        this.f109955a = taVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f109955a.f110547r.a();
    }
}
