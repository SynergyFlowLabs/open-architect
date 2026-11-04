package com.google.firebase.messaging;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f123682a = "Firebase-Messaging-Network-Io";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f123683b = "Firebase-Messaging-Task";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f123684c = "Firebase-Messaging-File";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f123685d = "Firebase-Messaging-Intent-Handle";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f123686e = "Firebase-Messaging-Topics-Io";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f123687f = "Firebase-Messaging-Init";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f123688g = "Firebase-Messaging-File-Io";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f123689h = "Firebase-Messaging-Rpc-Task";

    private o() {
    }

    @e.a({"ThreadPoolCreation"})
    private static Executor a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.b(str));
    }

    @e.a({"ThreadPoolCreation"})
    static ExecutorService b() {
        return Executors.newSingleThreadExecutor(new com.google.android.gms.common.util.concurrent.b(f123684c));
    }

    static Executor c() {
        return a(f123688g);
    }

    @e.a({"ThreadPoolCreation"})
    static ScheduledExecutorService d() {
        return new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.concurrent.b(f123687f));
    }

    @e.a({"ThreadPoolCreation"})
    static ExecutorService e() {
        return com.google.firebase.messaging.threads.b.a().d(new com.google.android.gms.common.util.concurrent.b(f123685d), com.google.firebase.messaging.threads.c.HIGH_SPEED);
    }

    @e.a({"ThreadPoolCreation"})
    static ExecutorService f() {
        return Executors.newSingleThreadExecutor(new com.google.android.gms.common.util.concurrent.b(f123682a));
    }

    static Executor g() {
        return a(f123689h);
    }

    @e.a({"ThreadPoolCreation"})
    static ExecutorService h() {
        return Executors.newSingleThreadExecutor(new com.google.android.gms.common.util.concurrent.b(f123683b));
    }

    @e.a({"ThreadPoolCreation"})
    static ScheduledExecutorService i() {
        return new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.concurrent.b(f123686e));
    }
}
