package com.facebook.bolts;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f99283b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final b f99284c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f99285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f99286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f99287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f99288g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Executor f99289a = new ExecutorC0906b();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @NotNull
        public final ExecutorService a() {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(b.f99286e, b.f99287f, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return threadPoolExecutor;
        }

        @oj.n
        @NotNull
        public final Executor b() {
            return b.f99284c.f99289a;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.bolts.b$b, reason: collision with other inner class name */
    private static final class ExecutorC0906b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@NotNull Runnable command) {
            Intrinsics.checkNotNullParameter(command, "command");
            new Handler(Looper.getMainLooper()).post(command);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f99285d = iAvailableProcessors;
        f99286e = iAvailableProcessors + 1;
        f99287f = (iAvailableProcessors * 2) + 1;
    }

    private b() {
    }

    @oj.n
    @NotNull
    public static final ExecutorService e() {
        return f99283b.a();
    }

    @oj.n
    @NotNull
    public static final Executor f() {
        return f99283b.b();
    }
}
