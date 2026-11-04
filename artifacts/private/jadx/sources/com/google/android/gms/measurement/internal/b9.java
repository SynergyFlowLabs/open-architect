package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class b9 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ta f109787a;

    b9(ta taVar) {
        Objects.requireNonNull(taVar);
        this.f109787a = taVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f109787a.f110184a.b().t(runnable);
    }
}
