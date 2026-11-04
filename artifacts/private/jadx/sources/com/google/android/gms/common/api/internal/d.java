package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public final class d implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d f105979e = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f105980a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f105981b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f105982c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f105983d = false;

    @g6.a
    public interface a {
        @g6.a
        void a(boolean z10);
    }

    @g6.a
    private d() {
    }

    @NonNull
    @g6.a
    public static d b() {
        return f105979e;
    }

    @g6.a
    public static void c(@NonNull Application application) {
        d dVar = f105979e;
        synchronized (dVar) {
            try {
                if (!dVar.f105983d) {
                    application.registerActivityLifecycleCallbacks(dVar);
                    application.registerComponentCallbacks(dVar);
                    dVar.f105983d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void f(boolean z10) {
        synchronized (f105979e) {
            try {
                Iterator it = this.f105982c.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @g6.a
    public void a(@NonNull a aVar) {
        synchronized (f105979e) {
            this.f105982c.add(aVar);
        }
    }

    @g6.a
    public boolean d() {
        return this.f105980a.get();
    }

    @g6.a
    public boolean e(boolean z10) {
        if (!this.f105981b.get()) {
            if (com.google.android.gms.common.util.x.b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            int i10 = 3 >> 1;
            if (!this.f105981b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f105980a.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull Activity activity, @androidx.annotation.p0 Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f105981b;
        boolean zCompareAndSet = this.f105980a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NonNull Activity activity) {
        AtomicBoolean atomicBoolean = this.f105981b;
        boolean zCompareAndSet = this.f105980a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f105980a.compareAndSet(false, true)) {
            this.f105981b.set(true);
            f(true);
        }
    }
}
