package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
class b implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ThreadFactory f120837e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f120838a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f120839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f120840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final StrictMode.ThreadPolicy f120841d;

    b(String str, int i10, @fj.h StrictMode.ThreadPolicy threadPolicy) {
        this.f120839b = str;
        this.f120840c = i10;
        this.f120841d = threadPolicy;
    }

    public static /* synthetic */ void a(b bVar, Runnable runnable) {
        Process.setThreadPriority(bVar.f120840c);
        StrictMode.ThreadPolicy threadPolicy = bVar.f120841d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f120837e.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                b.a(this.f120832a, runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f120839b, Long.valueOf(this.f120838a.getAndIncrement())));
        return threadNewThread;
    }
}
