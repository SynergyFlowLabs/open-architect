package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class hb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ mb f110052a;

    hb(mb mbVar) {
        Objects.requireNonNull(mbVar);
        this.f110052a = mbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mb mbVar = this.f110052a;
        mbVar.f110259e = mbVar.D();
    }
}
