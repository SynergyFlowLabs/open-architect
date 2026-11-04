package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
final class a8 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzr f109747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f109748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j8 f109749c;

    a8(j8 j8Var, zzr zzrVar, Bundle bundle) {
        this.f109747a = zzrVar;
        this.f109748b = bundle;
        Objects.requireNonNull(j8Var);
        this.f109749c = j8Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        j8 j8Var = this.f109749c;
        j8Var.L().E();
        return j8Var.L().q0(this.f109747a, this.f109748b);
    }
}
