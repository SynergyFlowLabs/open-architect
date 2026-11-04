package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class fb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f109957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ eb f109958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ eb f109959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f109960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ mb f109961e;

    fb(mb mbVar, Bundle bundle, eb ebVar, eb ebVar2, long j10) {
        this.f109957a = bundle;
        this.f109958b = ebVar;
        this.f109959c = ebVar2;
        this.f109960d = j10;
        Objects.requireNonNull(mbVar);
        this.f109961e = mbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f109961e.A(this.f109957a, this.f109958b, this.f109959c, this.f109960d);
    }
}
