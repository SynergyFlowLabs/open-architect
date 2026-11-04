package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class kc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ComponentName f110196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ rc f110197b;

    kc(rc rcVar, ComponentName componentName) {
        this.f110196a = componentName;
        Objects.requireNonNull(rcVar);
        this.f110197b = rcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f110197b.f110454c.K(this.f110196a);
    }
}
