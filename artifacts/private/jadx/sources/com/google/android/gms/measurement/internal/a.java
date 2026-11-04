package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f109727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f109728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ y1 f109729c;

    a(y1 y1Var, String str, long j10) {
        this.f109727a = str;
        this.f109728b = j10;
        Objects.requireNonNull(y1Var);
        this.f109729c = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f109729c.l(this.f109727a, this.f109728b);
    }
}
