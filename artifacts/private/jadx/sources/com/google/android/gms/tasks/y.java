package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f111038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f111039b;

    y(z zVar, Task task) {
        this.f111038a = task;
        this.f111039b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task task = (Task) this.f111039b.f111041b.a(this.f111038a);
            if (task == null) {
                this.f111039b.d(new NullPointerException("Continuation returned null"));
                return;
            }
            z zVar = this.f111039b;
            Executor executor = m.f111004b;
            task.k(executor, zVar);
            task.h(executor, this.f111039b);
            task.c(executor, this.f111039b);
        } catch (j e10) {
            if (e10.getCause() instanceof Exception) {
                this.f111039b.f111042c.x((Exception) e10.getCause());
            } else {
                this.f111039b.f111042c.x(e10);
            }
        } catch (Exception e11) {
            this.f111039b.f111042c.x(e11);
        }
    }
}
