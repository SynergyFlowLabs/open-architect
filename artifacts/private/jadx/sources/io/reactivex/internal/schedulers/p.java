package io.reactivex.internal.schedulers;

import androidx.compose.animation.core.z1;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f303278a = "rx2.purge-enabled";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f303279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f303280c = "rx2.purge-period-seconds";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f303281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final AtomicReference<ScheduledExecutorService> f303282e = new AtomicReference<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final Map<ScheduledThreadPoolExecutor, Object> f303283f = new ConcurrentHashMap();

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f303284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f303285b;

        a() {
        }

        void a(Properties properties) {
            if (properties.containsKey(p.f303278a)) {
                this.f303284a = Boolean.parseBoolean(properties.getProperty(p.f303278a));
            } else {
                this.f303284a = true;
            }
            if (!this.f303284a || !properties.containsKey(p.f303280c)) {
                this.f303285b = 1;
                return;
            }
            try {
                this.f303285b = Integer.parseInt(properties.getProperty(p.f303280c));
            } catch (NumberFormatException unused) {
                this.f303285b = 1;
            }
        }
    }

    static final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new ArrayList(p.f303283f.keySet())) {
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    p.f303283f.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        a aVar = new a();
        aVar.a(properties);
        f303279b = aVar.f303284a;
        f303281d = aVar.f303285b;
        c();
    }

    private p() {
        throw new IllegalStateException("No instances!");
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        d(f303279b, scheduledExecutorServiceNewScheduledThreadPool);
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    public static void b() {
        ScheduledExecutorService andSet = f303282e.getAndSet(null);
        if (andSet != null) {
            andSet.shutdownNow();
        }
        f303283f.clear();
    }

    public static void c() {
        e(f303279b);
    }

    static void d(boolean z10, ScheduledExecutorService scheduledExecutorService) {
        if (z10 && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f303283f.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    static void e(boolean z10) {
        if (z10) {
            while (true) {
                AtomicReference<ScheduledExecutorService> atomicReference = f303282e;
                ScheduledExecutorService scheduledExecutorService = atomicReference.get();
                if (scheduledExecutorService != null) {
                    break;
                }
                ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new k("RxSchedulerPurge"));
                if (z1.a(atomicReference, scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                    b bVar = new b();
                    int i10 = f303281d;
                    scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(bVar, i10, i10, TimeUnit.SECONDS);
                    return;
                }
                scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
            }
        }
    }
}
