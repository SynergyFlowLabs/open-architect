package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public abstract class z3 extends x3 implements l4 {
    protected z3() {
    }

    @Override // com.google.android.gms.internal.play_billing.x3
    protected /* bridge */ /* synthetic */ Future l() {
        throw null;
    }

    protected abstract l4 n();

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void u0(Runnable runnable, Executor executor) {
        n().u0(runnable, executor);
    }
}
