package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes4.dex */
final class z4 extends v3 implements RunnableFuture {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @fj.a
    private volatile j4 f109457h;

    z4(Callable callable) {
        this.f109457h = new y4(this, callable);
    }

    static z4 z(Runnable runnable, Object obj) {
        return new z4(Executors.callable(runnable, obj));
    }

    @Override // com.google.android.gms.internal.play_billing.n3
    @fj.a
    protected final String g() {
        j4 j4Var = this.f109457h;
        if (j4Var == null) {
            return super.g();
        }
        return "task=[" + j4Var.toString() + "]";
    }

    @Override // com.google.android.gms.internal.play_billing.n3
    protected final void l() {
        j4 j4Var;
        if (p() && (j4Var = this.f109457h) != null) {
            j4Var.e();
        }
        this.f109457h = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        j4 j4Var = this.f109457h;
        if (j4Var != null) {
            j4Var.run();
        }
        this.f109457h = null;
    }
}
