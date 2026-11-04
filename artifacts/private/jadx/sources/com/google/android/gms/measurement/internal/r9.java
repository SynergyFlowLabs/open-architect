package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
final class r9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f110442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f110443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f110444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ta f110445d;

    r9(ta taVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f110442a = atomicReference;
        this.f110443b = str2;
        this.f110444c = str3;
        Objects.requireNonNull(taVar);
        this.f110445d = taVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 0 >> 0;
        this.f110445d.f110184a.J().e0(this.f110442a, null, this.f110443b, this.f110444c);
    }
}
