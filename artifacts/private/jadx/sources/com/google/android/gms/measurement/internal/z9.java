package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class z9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Boolean f110819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ ta f110820b;

    z9(ta taVar, Boolean bool) {
        this.f110819a = bool;
        Objects.requireNonNull(taVar);
        this.f110820b = taVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f110820b.X(this.f110819a, true);
    }
}
