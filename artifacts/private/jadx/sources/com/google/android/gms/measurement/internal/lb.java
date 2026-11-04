package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class lb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ mb f110234a;

    lb(mb mbVar) {
        Objects.requireNonNull(mbVar);
        this.f110234a = mbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f110234a.E(null);
    }
}
