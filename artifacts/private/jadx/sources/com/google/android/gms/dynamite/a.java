package com.google.android.gms.dynamite;

import android.os.Process;

/* JADX INFO: loaded from: classes4.dex */
final class a extends Thread {
    a(ThreadGroup threadGroup, String str) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
