package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class i0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f110994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ j0 f110995b;

    i0(j0 j0Var, Task task) {
        this.f110994a = task;
        this.f110995b = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task taskA = this.f110995b.f110997b.a(this.f110994a.q());
            if (taskA == null) {
                this.f110995b.d(new NullPointerException("Continuation returned null"));
                return;
            }
            j0 j0Var = this.f110995b;
            Executor executor = m.f111004b;
            taskA.k(executor, j0Var);
            taskA.h(executor, this.f110995b);
            taskA.c(executor, this.f110995b);
        } catch (j e10) {
            if (e10.getCause() instanceof Exception) {
                this.f110995b.d((Exception) e10.getCause());
            } else {
                this.f110995b.d(e10);
            }
        } catch (CancellationException unused) {
            this.f110995b.a();
        } catch (Exception e11) {
            this.f110995b.d(e11);
        }
    }
}
