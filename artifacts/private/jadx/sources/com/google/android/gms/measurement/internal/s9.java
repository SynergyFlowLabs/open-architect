package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
final class s9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f110479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f110480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f110481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f110482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ ta f110483e;

    s9(ta taVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f110479a = atomicReference;
        this.f110480b = str2;
        this.f110481c = str3;
        this.f110482d = z10;
        Objects.requireNonNull(taVar);
        this.f110483e = taVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f110483e.f110184a.J().g0(this.f110479a, null, this.f110480b, this.f110481c, this.f110482d);
    }
}
