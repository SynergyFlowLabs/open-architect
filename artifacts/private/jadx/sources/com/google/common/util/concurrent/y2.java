package com.google.common.util.concurrent;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
public final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @fj.a
    private String f120374a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @fj.a
    private Boolean f120375b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @fj.a
    private Integer f120376c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @fj.a
    private Thread.UncaughtExceptionHandler f120377d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @fj.a
    private ThreadFactory f120378e = null;

    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ThreadFactory f120379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f120380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicLong f120381c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Boolean f120382d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Integer f120383e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f120384f;

        a(final ThreadFactory val$backingThreadFactory, final String val$nameFormat, final AtomicLong val$count, final Boolean val$daemon, final Integer val$priority, final Thread.UncaughtExceptionHandler val$uncaughtExceptionHandler) {
            this.f120379a = val$backingThreadFactory;
            this.f120380b = val$nameFormat;
            this.f120381c = val$count;
            this.f120382d = val$daemon;
            this.f120383e = val$priority;
            this.f120384f = val$uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f120379a.newThread(runnable);
            Objects.requireNonNull(threadNewThread);
            String str = this.f120380b;
            if (str != null) {
                AtomicLong atomicLong = this.f120381c;
                Objects.requireNonNull(atomicLong);
                threadNewThread.setName(y2.d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f120382d;
            if (bool != null) {
                threadNewThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f120383e;
            if (num != null) {
                threadNewThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f120384f;
            if (uncaughtExceptionHandler != null) {
                threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return threadNewThread;
        }
    }

    private static ThreadFactory c(y2 builder) {
        String str = builder.f120374a;
        Boolean bool = builder.f120375b;
        Integer num = builder.f120376c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = builder.f120377d;
        ThreadFactory threadFactoryDefaultThreadFactory = builder.f120378e;
        if (threadFactoryDefaultThreadFactory == null) {
            threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactoryDefaultThreadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String format, Object... args) {
        return String.format(Locale.ROOT, format, args);
    }

    public ThreadFactory b() {
        return c(this);
    }

    @z7.a
    public y2 e(boolean daemon) {
        this.f120375b = Boolean.valueOf(daemon);
        return this;
    }

    @z7.a
    public y2 f(String nameFormat) {
        d(nameFormat, 0);
        this.f120374a = nameFormat;
        return this;
    }

    @z7.a
    public y2 g(int priority) {
        com.google.common.base.j0.m(priority >= 1, "Thread priority (%s) must be >= %s", priority, 1);
        com.google.common.base.j0.m(priority <= 10, "Thread priority (%s) must be <= %s", priority, 10);
        this.f120376c = Integer.valueOf(priority);
        return this;
    }

    @z7.a
    public y2 h(ThreadFactory backingThreadFactory) {
        this.f120378e = (ThreadFactory) com.google.common.base.j0.E(backingThreadFactory);
        return this;
    }

    @z7.a
    public y2 i(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f120377d = (Thread.UncaughtExceptionHandler) com.google.common.base.j0.E(uncaughtExceptionHandler);
        return this;
    }
}
