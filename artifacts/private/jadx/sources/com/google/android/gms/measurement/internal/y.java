package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f110706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f110707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ y1 f110708c;

    y(y1 y1Var, String str, long j10) {
        this.f110706a = str;
        this.f110707b = j10;
        Objects.requireNonNull(y1Var);
        this.f110708c = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f110708c.m(this.f110706a, this.f110707b);
    }
}
