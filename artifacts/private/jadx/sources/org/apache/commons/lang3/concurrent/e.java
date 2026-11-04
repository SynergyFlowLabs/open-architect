package org.apache.commons.lang3.concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.lang3.c0;

/* JADX INFO: loaded from: classes14.dex */
public class e implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f337089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadFactory f337090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f337091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f337092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f337093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Boolean f337094f;

    public static class b implements org.apache.commons.lang3.builder.a<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ThreadFactory f337095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Thread.UncaughtExceptionHandler f337096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f337097c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f337098d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Boolean f337099e;

        @Override // org.apache.commons.lang3.builder.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public e build() {
            e eVar = new e(this);
            j();
            return eVar;
        }

        public b g(boolean z10) {
            this.f337099e = Boolean.valueOf(z10);
            return this;
        }

        public b h(String str) {
            c0.P(str, "Naming pattern must not be null!", new Object[0]);
            this.f337097c = str;
            return this;
        }

        public b i(int i10) {
            this.f337098d = Integer.valueOf(i10);
            return this;
        }

        public void j() {
            this.f337095a = null;
            this.f337096b = null;
            this.f337097c = null;
            this.f337098d = null;
            this.f337099e = null;
        }

        public b k(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            c0.P(uncaughtExceptionHandler, "Uncaught exception handler must not be null!", new Object[0]);
            this.f337096b = uncaughtExceptionHandler;
            return this;
        }

        public b l(ThreadFactory threadFactory) {
            c0.P(threadFactory, "Wrapped ThreadFactory must not be null!", new Object[0]);
            this.f337095a = threadFactory;
            return this;
        }
    }

    private void g(Thread thread) {
        if (b() != null) {
            thread.setName(String.format(b(), Long.valueOf(this.f337089a.incrementAndGet())));
        }
        if (e() != null) {
            thread.setUncaughtExceptionHandler(e());
        }
        if (c() != null) {
            thread.setPriority(c().intValue());
        }
        if (a() != null) {
            thread.setDaemon(a().booleanValue());
        }
    }

    public final Boolean a() {
        return this.f337094f;
    }

    public final String b() {
        return this.f337092d;
    }

    public final Integer c() {
        return this.f337093e;
    }

    public long d() {
        return this.f337089a.get();
    }

    public final Thread.UncaughtExceptionHandler e() {
        return this.f337091c;
    }

    public final ThreadFactory f() {
        return this.f337090b;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadNewThread = f().newThread(runnable);
        g(threadNewThread);
        return threadNewThread;
    }

    private e(b bVar) {
        if (bVar.f337095a == null) {
            this.f337090b = Executors.defaultThreadFactory();
        } else {
            this.f337090b = bVar.f337095a;
        }
        this.f337092d = bVar.f337097c;
        this.f337093e = bVar.f337098d;
        this.f337094f = bVar.f337099e;
        this.f337091c = bVar.f337096b;
        this.f337089a = new AtomicLong();
    }
}
