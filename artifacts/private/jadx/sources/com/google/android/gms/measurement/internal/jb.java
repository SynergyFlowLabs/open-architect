package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class jb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ eb f110121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f110122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ mb f110123c;

    jb(mb mbVar, eb ebVar, long j10) {
        this.f110121a = ebVar;
        this.f110122b = j10;
        Objects.requireNonNull(mbVar);
        this.f110123c = mbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mb mbVar = this.f110123c;
        mbVar.C(this.f110121a, false, this.f110122b);
        mbVar.f110259e = null;
        mbVar.f110184a.J().u(null);
    }
}
