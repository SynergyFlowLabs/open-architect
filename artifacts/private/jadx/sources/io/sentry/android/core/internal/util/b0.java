package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.w0;
import io.sentry.ILogger;
import io.sentry.android.core.a1;
import io.sentry.android.core.u0;
import io.sentry.e9;
import io.sentry.n8;
import io.sentry.y7;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class b0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f304272n = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f304273o = TimeUnit.MILLISECONDS.toNanos(700);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final u0 f304274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Set<Window> f304275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ILogger f304276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Handler f304277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private WeakReference<Window> f304278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Map<String, c> f304279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f304280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f304281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private Window.OnFrameMetricsAvailableListener f304282i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private Choreographer f304283j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Field f304284k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f304285l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f304286m;

    class a implements d {
        a() {
        }
    }

    class b implements d {
        b() {
        }
    }

    @lm.a.c
    public interface c {
        void e(long j10, long j11, long j12, long j13, boolean z10, boolean z11, float f10);
    }

    @lm.a.c
    public interface d {
        @w0(api = 24)
        default void a(@NotNull Window window, @Nullable Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, @Nullable Handler handler) {
            if (onFrameMetricsAvailableListener == null) {
                return;
            }
            window.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, handler);
        }

        @w0(api = 24)
        default void b(@NotNull Window window, @Nullable Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
            if (onFrameMetricsAvailableListener == null) {
                return;
            }
            window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
        }
    }

    @e.a({"NewApi"})
    public b0(@NotNull Context context, @NotNull n8 n8Var, @NotNull u0 u0Var) {
        this(context, n8Var, u0Var, new a());
    }

    public static /* synthetic */ void a(b0 b0Var, ILogger iLogger) {
        b0Var.getClass();
        try {
            b0Var.f304283j = Choreographer.getInstance();
        } catch (Throwable th2) {
            iLogger.a(y7.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th2);
        }
    }

    public static /* synthetic */ void b(b0 b0Var, Window window) {
        if (b0Var.f304275b.add(window)) {
            try {
                b0Var.f304281h.a(window, b0Var.f304282i, b0Var.f304277d);
            } catch (Throwable th2) {
                b0Var.f304276c.a(y7.ERROR, "Failed to add frameMetricsAvailableListener", th2);
            }
        }
    }

    public static /* synthetic */ void c(b0 b0Var, Window window) {
        b0Var.getClass();
        try {
            if (b0Var.f304275b.remove(window)) {
                b0Var.f304281h.b(window, b0Var.f304282i);
            }
        } catch (Throwable th2) {
            b0Var.f304276c.a(y7.ERROR, "Failed to remove frameMetricsAvailableListener", th2);
        }
    }

    public static /* synthetic */ void e(b0 b0Var, u0 u0Var, Window window, FrameMetrics frameMetrics, int i10) {
        b0Var.getClass();
        long jNanoTime = System.nanoTime();
        float refreshRate = u0Var.d() >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
        float f10 = f304272n;
        long jF = b0Var.f(frameMetrics);
        long jMax = Math.max(0L, jF - ((long) (f10 / refreshRate)));
        long jG = b0Var.g(frameMetrics);
        if (jG < 0) {
            jG = jNanoTime - jF;
        }
        long jMax2 = Math.max(jG, b0Var.f304286m);
        if (jMax2 == b0Var.f304285l) {
            return;
        }
        b0Var.f304285l = jMax2;
        b0Var.f304286m = jMax2 + jF;
        boolean zJ = j(jF, (long) (f10 / (refreshRate - 1.0f)));
        boolean z10 = zJ && i(jF);
        Iterator<c> it = b0Var.f304279f.values().iterator();
        while (it.hasNext()) {
            it.next().e(jMax2, b0Var.f304286m, jF, jMax, zJ, z10, refreshRate);
        }
    }

    @w0(api = 24)
    private long f(@NotNull FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(0) + frameMetrics.getMetric(1) + frameMetrics.getMetric(2) + frameMetrics.getMetric(3) + frameMetrics.getMetric(4) + frameMetrics.getMetric(5);
    }

    @e.a({"NewApi"})
    private long g(@NotNull FrameMetrics frameMetrics) {
        return this.f304274a.d() >= 26 ? frameMetrics.getMetric(10) : h();
    }

    public static boolean i(long j10) {
        return j10 > f304273o;
    }

    public static boolean j(long j10, long j11) {
        return j10 > j11;
    }

    private void k(@NotNull Window window) {
        WeakReference<Window> weakReference = this.f304278e;
        if (weakReference == null || weakReference.get() != window) {
            this.f304278e = new WeakReference<>(window);
            o();
        }
    }

    @e.a({"NewApi"})
    private void n(@NotNull final Window window) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.x
            @Override // java.lang.Runnable
            public final void run() {
                b0.c(this.f304348a, window);
            }
        });
    }

    @e.a({"NewApi"})
    private void o() {
        WeakReference<Window> weakReference = this.f304278e;
        final Window window = weakReference != null ? weakReference.get() : null;
        if (window != null && this.f304280g && !this.f304279f.isEmpty() && this.f304277d != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.w
                @Override // java.lang.Runnable
                public final void run() {
                    b0.b(this.f304346a, window);
                }
            });
        }
    }

    public long h() {
        Field field;
        Choreographer choreographer = this.f304283j;
        if (choreographer != null && (field = this.f304284k) != null) {
            try {
                Long l10 = (Long) field.get(choreographer);
                if (l10 != null) {
                    return l10.longValue();
                }
            } catch (IllegalAccessException unused) {
            }
        }
        return -1L;
    }

    @Nullable
    public String l(@NotNull c cVar) {
        if (!this.f304280g) {
            return null;
        }
        String strA = e9.a();
        this.f304279f.put(strA, cVar);
        o();
        return strA;
    }

    public void m(@Nullable String str) {
        if (this.f304280g) {
            if (str != null) {
                this.f304279f.remove(str);
            }
            WeakReference<Window> weakReference = this.f304278e;
            Window window = weakReference != null ? weakReference.get() : null;
            if (window == null || !this.f304279f.isEmpty()) {
                return;
            }
            n(window);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        k(activity.getWindow());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        n(activity.getWindow());
        WeakReference<Window> weakReference = this.f304278e;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.f304278e = null;
    }

    @e.a({"NewApi"})
    public b0(@NotNull Context context, @NotNull ILogger iLogger, @NotNull u0 u0Var) {
        this(context, iLogger, u0Var, new b());
    }

    @e.a({"NewApi", "DiscouragedPrivateApi"})
    public b0(@NotNull Context context, @NotNull n8 n8Var, @NotNull u0 u0Var, @NotNull d dVar) {
        this(context, n8Var.getLogger(), u0Var, dVar);
    }

    @e.a({"NewApi", "PrivateApi"})
    public b0(@NotNull Context context, @NotNull final ILogger iLogger, @NotNull final u0 u0Var, @NotNull d dVar) {
        this.f304275b = new CopyOnWriteArraySet();
        this.f304279f = new ConcurrentHashMap();
        this.f304280g = false;
        this.f304285l = 0L;
        this.f304286m = 0L;
        Context context2 = (Context) io.sentry.util.y.c(a1.g(context), "The context is required");
        this.f304276c = (ILogger) io.sentry.util.y.c(iLogger, "Logger is required");
        this.f304274a = (u0) io.sentry.util.y.c(u0Var, "BuildInfoProvider is required");
        this.f304281h = (d) io.sentry.util.y.c(dVar, "WindowFrameMetricsManager is required");
        if ((context2 instanceof Application) && u0Var.d() >= 24) {
            this.f304280g = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.y
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th2) {
                    iLogger.a(y7.ERROR, "Error during frames measurements.", th2);
                }
            });
            handlerThread.start();
            this.f304277d = new Handler(handlerThread.getLooper());
            ((Application) context2).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.z
                @Override // java.lang.Runnable
                public final void run() {
                    b0.a(this.f304351a, iLogger);
                }
            });
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.f304284k = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                iLogger.a(y7.ERROR, "Unable to get the frame timestamp from the choreographer: ", e10);
            }
            this.f304282i = new Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.a0
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                    b0.e(this.f304269a, u0Var, window, frameMetrics, i10);
                }
            };
        }
    }
}
