package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ib implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f110087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ mb f110088b;

    ib(mb mbVar, long j10) {
        this.f110087a = j10;
        Objects.requireNonNull(mbVar);
        this.f110088b = mbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mb mbVar = this.f110088b;
        mbVar.f110184a.M().k(this.f110087a);
        mbVar.f110259e = null;
    }
}
