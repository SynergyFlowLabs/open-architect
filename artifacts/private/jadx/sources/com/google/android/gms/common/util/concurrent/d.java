package com.google.android.gms.common.util.concurrent;

import android.os.Process;

/* JADX INFO: loaded from: classes4.dex */
final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f106928a;

    public d(Runnable runnable, int i10) {
        this.f106928a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f106928a.run();
    }
}
