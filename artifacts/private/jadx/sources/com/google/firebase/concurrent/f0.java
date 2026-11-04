package com.google.firebase.concurrent;

import androidx.annotation.l1;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes5.dex */
final class f0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f120858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f120859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l1
    final LinkedBlockingQueue<Runnable> f120860c = new LinkedBlockingQueue<>();

    f0(boolean z10, Executor executor) {
        this.f120858a = z10;
        this.f120859b = executor;
    }

    private void a() {
        if (this.f120858a) {
            return;
        }
        Runnable runnablePoll = this.f120860c.poll();
        while (runnablePoll != null) {
            this.f120859b.execute(runnablePoll);
            runnablePoll = !this.f120858a ? this.f120860c.poll() : null;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f120860c.offer(runnable);
        a();
    }

    @Override // com.google.firebase.concurrent.e0
    public boolean o3() {
        return this.f120858a;
    }

    @Override // com.google.firebase.concurrent.e0
    public void p() {
        this.f120858a = false;
        a();
    }

    @Override // com.google.firebase.concurrent.e0
    public void pause() {
        this.f120858a = true;
    }
}
