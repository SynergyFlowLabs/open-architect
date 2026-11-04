package com.google.android.gms.common.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final ExecutorService f106505a;

    static {
        com.google.android.gms.internal.common.w.a();
        int i10 = 3 & 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.b("CallbackExecutor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f106505a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
