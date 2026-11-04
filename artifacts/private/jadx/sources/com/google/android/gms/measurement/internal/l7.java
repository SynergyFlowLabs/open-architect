package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class l7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f110225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f110226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f110227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f110228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ j8 f110229e;

    l7(j8 j8Var, String str, String str2, String str3, long j10) {
        this.f110225a = str;
        this.f110226b = str2;
        this.f110227c = str3;
        this.f110228d = j10;
        Objects.requireNonNull(j8Var);
        this.f110229e = j8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f110225a;
        if (str == null) {
            j8 j8Var = this.f110229e;
            j8Var.L().t0(this.f110226b, null);
        } else {
            eb ebVar = new eb(this.f110227c, str, this.f110228d);
            j8 j8Var2 = this.f110229e;
            j8Var2.L().t0(this.f110226b, ebVar);
        }
    }
}
