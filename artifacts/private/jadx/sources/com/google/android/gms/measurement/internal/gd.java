package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class gd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f110002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ pd f110003b;

    gd(pd pdVar, long j10) {
        this.f110002a = j10;
        Objects.requireNonNull(pdVar);
        this.f110003b = pdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f110003b.r(this.f110002a);
    }
}
