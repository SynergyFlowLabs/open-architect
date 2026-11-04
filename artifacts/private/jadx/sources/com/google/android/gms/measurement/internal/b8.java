package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
final class b8 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzr f109784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f109785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j8 f109786c;

    b8(j8 j8Var, zzr zzrVar, Bundle bundle) {
        this.f109784a = zzrVar;
        this.f109785b = bundle;
        Objects.requireNonNull(j8Var);
        this.f109786c = j8Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        j8 j8Var = this.f109786c;
        j8Var.L().E();
        return j8Var.L().q0(this.f109784a, this.f109785b);
    }
}
