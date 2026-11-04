package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.a1;
import io.sentry.android.core.b1;
import io.sentry.android.core.internal.util.q;
import io.sentry.android.core.u0;
import io.sentry.c3;
import io.sentry.fa;
import io.sentry.m1;
import io.sentry.s1;
import io.sentry.v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import lm.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public class h extends io.sentry.android.core.performance.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private static volatile h f304450s;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static long f304449o = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final io.sentry.util.a f304451t = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private a f304452a = a.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private s1 f304459h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private v0 f304460i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private fa f304461j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f304462k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f304463l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicInteger f304464m = new AtomicInteger();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f304465n = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final i f304454c = new i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final i f304455d = new i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final i f304456e = new i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Map<ContentProvider, i> f304457f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<c> f304458g = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f304453b = a1.t();

    public enum a {
        UNKNOWN,
        COLD,
        WARM
    }

    public static /* synthetic */ void a(h hVar) {
        if (hVar.f304464m.get() == 0) {
            hVar.f304453b = false;
            s1 s1Var = hVar.f304459h;
            if (s1Var != null && s1Var.isRunning()) {
                hVar.f304459h.close();
                hVar.f304459h = null;
            }
            v0 v0Var = hVar.f304460i;
            if (v0Var == null || !v0Var.isRunning()) {
                return;
            }
            hVar.f304460i.i(true);
            hVar.f304460i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.performance.d
            @Override // java.lang.Runnable
            public final void run() {
                h.a(this.f304445a);
            }
        });
    }

    @NotNull
    public static h s() {
        if (f304450s == null) {
            m1 m1VarA = f304451t.a();
            try {
                if (f304450s == null) {
                    f304450s = new h();
                }
                if (m1VarA != null) {
                    m1VarA.close();
                }
            } catch (Throwable th2) {
                if (m1VarA != null) {
                    try {
                        m1VarA.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return f304450s;
    }

    public static void w(@NotNull Application application) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        h hVarS = s();
        if (hVarS.f304456e.v()) {
            hVarS.f304456e.I(jUptimeMillis);
            hVarS.B(application);
        }
    }

    public static void x(@NotNull Application application) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        h hVarS = s();
        if (hVarS.f304456e.w()) {
            hVarS.f304456e.E(application.getClass().getName() + ".onCreate");
            hVarS.f304456e.L(jUptimeMillis);
        }
    }

    public static void y(@NotNull ContentProvider contentProvider) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        i iVar = new i();
        iVar.I(jUptimeMillis);
        s().f304457f.put(contentProvider, iVar);
    }

    public static void z(@NotNull ContentProvider contentProvider) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        i iVar = s().f304457f.get(contentProvider);
        if (iVar == null || !iVar.w()) {
            return;
        }
        iVar.E(contentProvider.getClass().getName() + ".onCreate");
        iVar.L(jUptimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void A() {
        try {
            if (!this.f304465n.getAndSet(true)) {
                h hVarS = s();
                hVarS.t().O();
                hVarS.m().O();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void B(@NotNull Application application) {
        if (this.f304462k) {
            return;
        }
        boolean z10 = true;
        this.f304462k = true;
        if (!this.f304453b && !a1.t()) {
            z10 = false;
        }
        this.f304453b = z10;
        application.registerActivityLifecycleCallbacks(f304450s);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.performance.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f304446a.f();
            }
        });
    }

    @l1
    public void C(boolean z10) {
        this.f304453b = z10;
    }

    public void D(@p0 v0 v0Var) {
        this.f304460i = v0Var;
    }

    public void E(@p0 s1 s1Var) {
        this.f304459h = s1Var;
    }

    public void F(@p0 fa faVar) {
        this.f304461j = faVar;
    }

    public void G(@NotNull a aVar) {
        this.f304452a = aVar;
    }

    @lm.a.c
    @n
    public void H(long j10) {
        f304449o = j10;
    }

    public boolean I() {
        return this.f304463l && this.f304453b;
    }

    public void e(@NotNull c cVar) {
        this.f304458g.add(cVar);
    }

    @n
    public void g() {
        this.f304452a = a.UNKNOWN;
        this.f304454c.D();
        this.f304455d.D();
        this.f304456e.D();
        this.f304457f.clear();
        this.f304458g.clear();
        s1 s1Var = this.f304459h;
        if (s1Var != null) {
            s1Var.close();
        }
        this.f304459h = null;
        v0 v0Var = this.f304460i;
        if (v0Var != null) {
            v0Var.i(true);
        }
        this.f304460i = null;
        this.f304461j = null;
        this.f304453b = false;
        this.f304462k = false;
        this.f304463l = true;
        this.f304465n.set(false);
        this.f304464m.set(0);
    }

    @NotNull
    public i h() {
        i iVar = new i();
        iVar.M("Process Initialization", this.f304454c.r(), this.f304454c.t(), f304449o);
        return iVar;
    }

    @NotNull
    public List<c> i() {
        ArrayList arrayList = new ArrayList(this.f304458g);
        Collections.sort(arrayList);
        return arrayList;
    }

    @p0
    public v0 j() {
        return this.f304460i;
    }

    @p0
    public s1 k() {
        return this.f304459h;
    }

    @p0
    public fa l() {
        return this.f304461j;
    }

    @NotNull
    public i m() {
        return this.f304454c;
    }

    @NotNull
    public i n(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        if (this.f304452a != a.UNKNOWN && this.f304453b) {
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                i iVarM = m();
                if (iVarM.x() && iVarM.l() <= TimeUnit.MINUTES.toMillis(1L)) {
                    return iVarM;
                }
            }
            i iVarT = t();
            if (iVarT.x() && iVarT.l() <= TimeUnit.MINUTES.toMillis(1L)) {
                return iVarT;
            }
        }
        return new i();
    }

    @NotNull
    public a o() {
        return this.f304452a;
    }

    @Override // io.sentry.android.core.performance.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, @p0 Bundle bundle) {
        b1.d().e(activity);
        if (this.f304464m.incrementAndGet() == 1 && !this.f304465n.get()) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long jT = jUptimeMillis - this.f304454c.t();
            if (!this.f304453b || jT > TimeUnit.MINUTES.toMillis(1L)) {
                this.f304452a = a.WARM;
                this.f304463l = true;
                this.f304454c.D();
                this.f304454c.N();
                this.f304454c.I(jUptimeMillis);
                f304449o = jUptimeMillis;
                this.f304457f.clear();
                this.f304456e.D();
            } else {
                this.f304452a = bundle == null ? a.COLD : a.WARM;
            }
        }
        this.f304453b = true;
    }

    @Override // io.sentry.android.core.performance.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        b1.d().b(activity);
        if (this.f304464m.decrementAndGet() != 0 || activity.isChangingConfigurations()) {
            return;
        }
        this.f304453b = false;
        this.f304463l = true;
        this.f304465n.set(false);
    }

    @Override // io.sentry.android.core.performance.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
        b1.d().b(activity);
    }

    @Override // io.sentry.android.core.performance.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
        b1.d().e(activity);
    }

    @Override // io.sentry.android.core.performance.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        b1.d().e(activity);
        if (this.f304465n.get()) {
            return;
        }
        if (activity.getWindow() != null) {
            q.d(activity, new Runnable() { // from class: io.sentry.android.core.performance.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f304447a.A();
                }
            }, new u0(c3.e()));
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.performance.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f304448a.A();
                }
            });
        }
    }

    @Override // io.sentry.android.core.performance.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
        b1.d().b(activity);
    }

    @NotNull
    public i p() {
        return this.f304456e;
    }

    public long q() {
        return f304449o;
    }

    @NotNull
    public List<i> r() {
        ArrayList arrayList = new ArrayList(this.f304457f.values());
        Collections.sort(arrayList);
        return arrayList;
    }

    @NotNull
    public i t() {
        return this.f304455d;
    }

    public boolean u() {
        return this.f304453b;
    }

    public void v() {
        this.f304463l = false;
        this.f304457f.clear();
        this.f304458g.clear();
    }
}
