package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class gb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ eb f109992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ eb f109993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f109994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f109995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ mb f109996e;

    gb(mb mbVar, eb ebVar, eb ebVar2, long j10, boolean z10) {
        this.f109992a = ebVar;
        this.f109993b = ebVar2;
        this.f109994c = j10;
        this.f109995d = z10;
        Objects.requireNonNull(mbVar);
        this.f109996e = mbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f109996e.B(this.f109992a, this.f109993b, this.f109994c, this.f109995d, null);
    }
}
