package androidx.work;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f76529a = 8;

    public static final class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final AtomicInteger f76530a = new AtomicInteger(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f76531b;

        a(boolean z10) {
            this.f76531b = z10;
            int i10 = 6 >> 0;
        }

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public Thread newThread(@NotNull Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            return new Thread(runnable, (this.f76531b ? "WM.task-" : "androidx.work-") + this.f76530a.incrementAndGet());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor b(boolean z10) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(z10));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return executorServiceNewFixedThreadPool;
    }

    public static final int c() {
        return f76529a;
    }
}
