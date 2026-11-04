package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@z7.f("Create an AbstractIdleService")
@o0
public interface j2 {

    public static abstract class a {
        public void a(b from, Throwable failure) {
        }

        public void b() {
        }

        public void c() {
        }

        public void d(b from) {
        }

        public void e(b from) {
        }
    }

    public enum b {
        NEW,
        STARTING,
        RUNNING,
        STOPPING,
        TERMINATED,
        FAILED
    }

    void a(a listener, Executor executor);

    void b(long timeout, TimeUnit unit) throws TimeoutException;

    void c(long timeout, TimeUnit unit) throws TimeoutException;

    void d();

    Throwable e();

    void f();

    @z7.a
    j2 g();

    b h();

    @z7.a
    j2 i();

    boolean isRunning();
}
