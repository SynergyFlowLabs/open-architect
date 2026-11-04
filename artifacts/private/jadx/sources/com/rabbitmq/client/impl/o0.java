package com.rabbitmq.client.impl;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes13.dex */
public class o0 {
    public static boolean a() {
        try {
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                securityManager.checkPermission(new RuntimePermission("modifyThread"));
                securityManager.checkPermission(new RuntimePermission("modifyThreadGroup"));
            }
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static Thread b(ThreadFactory threadFactory, Runnable runnable, String str) {
        Thread threadNewThread = threadFactory.newThread(runnable);
        if (a()) {
            threadNewThread.setName(str);
        }
        return threadNewThread;
    }

    public static Thread c(ThreadFactory threadFactory, Runnable runnable, String str, boolean z10) {
        Thread threadB = b(threadFactory, runnable, str);
        if (a()) {
            threadB.setDaemon(z10);
        }
        return threadB;
    }
}
