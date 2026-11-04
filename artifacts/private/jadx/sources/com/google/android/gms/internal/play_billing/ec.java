package com.google.android.gms.internal.play_billing;

import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
final class ec implements l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WeakReference f109112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ac f109113b = new dc(this);

    ec(bc bcVar) {
        this.f109112a = new WeakReference(bcVar);
    }

    final boolean a(Object obj) {
        return this.f109113b.c(obj);
    }

    final boolean b(Throwable th2) {
        u7 u7Var = new u7(th2);
        r4 r4Var = ac.f109045f;
        ac acVar = this.f109113b;
        if (!r4Var.d(acVar, null, u7Var)) {
            return false;
        }
        ac.b(acVar);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        bc bcVar = (bc) this.f109112a.get();
        boolean zCancel = this.f109113b.cancel(z10);
        if (!zCancel || bcVar == null) {
            return zCancel;
        }
        bcVar.a();
        boolean z11 = !false;
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.f109113b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f109113b.f109048a instanceof s5;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f109113b.isDone();
    }

    public final String toString() {
        return this.f109113b.toString();
    }

    @Override // com.google.android.gms.internal.play_billing.l4
    public final void u0(@NonNull Runnable runnable, @NonNull Executor executor) {
        this.f109113b.u0(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f109113b.get(j10, timeUnit);
    }
}
