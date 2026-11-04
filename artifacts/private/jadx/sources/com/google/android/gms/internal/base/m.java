package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes4.dex */
public interface m {
    ExecutorService a(int i10, ThreadFactory threadFactory, int i11);

    ExecutorService b(int i10, int i11);

    ExecutorService c(ThreadFactory threadFactory, int i10);
}
