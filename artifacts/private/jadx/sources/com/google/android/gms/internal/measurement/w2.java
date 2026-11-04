package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class w2 extends z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f108938a;

    w2(x2 x2Var, Runnable runnable) {
        this.f108938a = runnable;
        Objects.requireNonNull(x2Var);
    }

    @Override // com.google.android.gms.internal.measurement.a2
    @androidx.annotation.g
    public final void j() {
        this.f108938a.run();
    }
}
