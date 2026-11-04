package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class hd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f110058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ pd f110059b;

    hd(pd pdVar, long j10) {
        this.f110058a = j10;
        Objects.requireNonNull(pdVar);
        this.f110059b = pdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f110059b.s(this.f110058a);
    }
}
