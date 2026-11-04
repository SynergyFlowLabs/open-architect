package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
final class m9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f110253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f110254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ta f110255c;

    m9(ta taVar, AtomicReference atomicReference, boolean z10) {
        this.f110253a = atomicReference;
        this.f110254b = z10;
        Objects.requireNonNull(taVar);
        this.f110255c = taVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f110255c.f110184a.J().i0(this.f110253a, this.f110254b);
    }
}
