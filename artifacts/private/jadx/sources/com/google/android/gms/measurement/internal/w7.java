package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class w7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzbg f110636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ zzr f110637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j8 f110638c;

    w7(j8 j8Var, zzbg zzbgVar, zzr zzrVar) {
        this.f110636a = zzbgVar;
        this.f110637b = zzrVar;
        Objects.requireNonNull(j8Var);
        this.f110638c = j8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbg zzbgVar = this.f110636a;
        zzr zzrVar = this.f110637b;
        j8 j8Var = this.f110638c;
        j8Var.S(j8Var.U(zzbgVar, zzrVar), zzrVar);
    }
}
