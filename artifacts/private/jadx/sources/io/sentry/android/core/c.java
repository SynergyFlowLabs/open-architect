package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import io.sentry.ILogger;
import io.sentry.y7;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class c extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f304085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f304086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v1 f304087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.transport.p f304088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f304089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f304090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final ILogger f304091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile long f304092h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f304093i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final Context f304094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f304095k;

    public interface a {
        void a(@NotNull ApplicationNotResponding applicationNotResponding);
    }

    c(long j10, boolean z10, @NotNull a aVar, @NotNull ILogger iLogger, @NotNull Context context) {
        this(new io.sentry.transport.p() { // from class: io.sentry.android.core.a
            @Override // io.sentry.transport.p
            public final long a() {
                return SystemClock.uptimeMillis();
            }
        }, j10, 500L, z10, aVar, iLogger, new v1(), context);
    }

    public static /* synthetic */ void a(c cVar, io.sentry.transport.p pVar) {
        cVar.getClass();
        cVar.f304092h = pVar.a();
        cVar.f304093i.set(false);
    }

    private boolean c() {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        ActivityManager activityManager = (ActivityManager) this.f304094j.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        try {
            processesInErrorState = activityManager.getProcessesInErrorState();
        } catch (Throwable th2) {
            this.f304091g.a(y7.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th2);
            processesInErrorState = null;
        }
        if (processesInErrorState == null) {
            return false;
        }
        Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
        while (it.hasNext()) {
            int i10 = 3 ^ 2;
            if (it.next().condition == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.f304095k.run();
        while (!isInterrupted()) {
            this.f304087c.b(this.f304095k);
            try {
                Thread.sleep(this.f304089e);
                if (this.f304088d.a() - this.f304092h > this.f304090f) {
                    if (!this.f304085a && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        this.f304091g.c(y7.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.f304093i.set(true);
                    } else if (c() && this.f304093i.compareAndSet(false, true)) {
                        this.f304086b.a(new ApplicationNotResponding("Application Not Responding for at least " + this.f304090f + " ms.", this.f304087c.a()));
                    }
                }
            } catch (InterruptedException e10) {
                try {
                    Thread.currentThread().interrupt();
                    this.f304091g.c(y7.WARNING, "Interrupted: %s", e10.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.f304091g.c(y7.WARNING, "Failed to interrupt due to SecurityException: %s", e10.getMessage());
                    return;
                }
            }
        }
    }

    @lm.n
    c(@NotNull final io.sentry.transport.p pVar, long j10, long j11, boolean z10, @NotNull a aVar, @NotNull ILogger iLogger, @NotNull v1 v1Var, @NotNull Context context) {
        super("|ANR-WatchDog|");
        this.f304092h = 0L;
        this.f304093i = new AtomicBoolean(false);
        this.f304088d = pVar;
        this.f304090f = j10;
        this.f304089e = j11;
        this.f304085a = z10;
        this.f304086b = aVar;
        this.f304091g = iLogger;
        this.f304087c = v1Var;
        this.f304094j = context;
        this.f304095k = new Runnable() { // from class: io.sentry.android.core.b
            @Override // java.lang.Runnable
            public final void run() {
                c.a(this.f304078a, pVar);
            }
        };
        if (j10 < this.f304089e * 2) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", Long.valueOf(this.f304089e * 2)));
        }
    }
}
