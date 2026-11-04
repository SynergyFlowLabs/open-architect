package com.google.android.gms.common.util.concurrent;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.w;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class c implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f106925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f106926b = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ThreadFactory f106927c = Executors.defaultThreadFactory();

    @g6.a
    public c(@NonNull String str) {
        w.s(str, "Name must not be null");
        this.f106925a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @NonNull
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread threadNewThread = this.f106927c.newThread(new d(runnable, 0));
        threadNewThread.setName(this.f106925a + "[" + this.f106926b.getAndIncrement() + "]");
        return threadNewThread;
    }
}
