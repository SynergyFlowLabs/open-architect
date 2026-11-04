package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes4.dex */
final class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Task f111033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ x f111034b;

    w(x xVar, Task task) {
        this.f111033a = task;
        this.f111034b = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f111033a.s()) {
            this.f111034b.f111037c.z();
            return;
        }
        try {
            this.f111034b.f111037c.y(this.f111034b.f111036b.a(this.f111033a));
        } catch (j e10) {
            if (e10.getCause() instanceof Exception) {
                this.f111034b.f111037c.x((Exception) e10.getCause());
            } else {
                this.f111034b.f111037c.x(e10);
            }
        } catch (Exception e11) {
            this.f111034b.f111037c.x(e11);
        }
    }
}
