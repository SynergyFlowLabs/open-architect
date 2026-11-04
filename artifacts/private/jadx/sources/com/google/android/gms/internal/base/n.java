package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class n implements m {
    private n() {
        throw null;
    }

    @Override // com.google.android.gms.internal.base.m
    public final ExecutorService a(int i10, ThreadFactory threadFactory, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.base.m
    public final ExecutorService b(int i10, int i11) {
        return a(4, Executors.defaultThreadFactory(), 2);
    }

    @Override // com.google.android.gms.internal.base.m
    public final ExecutorService c(ThreadFactory threadFactory, int i10) {
        return a(1, threadFactory, 1);
    }

    /* synthetic */ n(o oVar) {
    }
}
