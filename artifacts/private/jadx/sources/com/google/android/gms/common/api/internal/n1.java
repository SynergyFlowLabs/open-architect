package com.google.android.gms.common.api.internal;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ExecutorService f106144a = com.google.android.gms.internal.base.p.a().a(2, new com.google.android.gms.common.util.concurrent.c("GAC_Executor"), 2);

    public static ExecutorService a() {
        return f106144a;
    }
}
