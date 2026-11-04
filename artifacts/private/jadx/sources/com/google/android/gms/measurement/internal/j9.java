package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class j9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f110112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f110113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f110114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Bundle f110115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f110116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f110117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f110118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f110119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ ta f110120i;

    j9(ta taVar, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f110112a = str;
        this.f110113b = str2;
        this.f110114c = j10;
        this.f110115d = bundle;
        this.f110116e = z10;
        this.f110117f = z11;
        this.f110118g = z12;
        this.f110119h = str3;
        Objects.requireNonNull(taVar);
        this.f110120i = taVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f110120i.v(this.f110112a, this.f110113b, this.f110114c, this.f110115d, this.f110116e, this.f110117f, this.f110118g, this.f110119h);
    }
}
