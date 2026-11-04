package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class k9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f110185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f110186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f110187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f110188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ ta f110189e;

    k9(ta taVar, String str, String str2, Object obj, long j10) {
        this.f110185a = str;
        this.f110186b = str2;
        this.f110187c = obj;
        this.f110188d = j10;
        Objects.requireNonNull(taVar);
        this.f110189e = taVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f110189e.B(this.f110185a, this.f110186b, this.f110187c, this.f110188d);
    }
}
