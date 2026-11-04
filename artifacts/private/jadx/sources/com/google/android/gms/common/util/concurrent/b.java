package com.google.android.gms.common.util.concurrent;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.w;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class b implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f106923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadFactory f106924b = Executors.defaultThreadFactory();

    @g6.a
    public b(@NonNull String str) {
        w.s(str, "Name must not be null");
        this.f106923a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @NonNull
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread threadNewThread = this.f106924b.newThread(new d(runnable, 0));
        threadNewThread.setName(this.f106923a);
        return threadNewThread;
    }
}
