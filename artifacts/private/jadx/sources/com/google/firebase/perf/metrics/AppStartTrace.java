package com.google.firebase.perf.metrics;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Process;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.c0;
import androidx.lifecycle.e1;
import androidx.lifecycle.n0;
import com.facebook.internal.z0;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.k;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.x;
import com.google.firebase.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, n0 {

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final int f123966g3 = 0;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final int f123967h3 = 1;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static volatile AppStartTrace f123968i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static ExecutorService f123969j3;
    private PerfSession X;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f123972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.firebase.perf.util.a f123973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f123974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x.b f123975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f123976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private WeakReference<Activity> f123977g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WeakReference<Activity> f123978h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private final Timer f123980j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private final Timer f123981k;

    @NonNull
    private static final Timer H1 = new com.google.firebase.perf.util.a().a();

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final long f123970p2 = TimeUnit.MINUTES.toMicros(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f123971a = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f123979i = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Timer f123982l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Timer f123983m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Timer f123984n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Timer f123985o = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private Timer f123988s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Timer f123989t = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Timer f123990v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Timer f123991w = null;
    private boolean Y = false;
    private int Z = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final b f123986p0 = new b();

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f123987p1 = false;

    private final class b implements ViewTreeObserver.OnDrawListener {
        private b() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            AppStartTrace.i(AppStartTrace.this);
        }
    }

    public static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AppStartTrace f123993a;

        public c(AppStartTrace appStartTrace) {
            this.f123993a = appStartTrace;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f123993a.f123982l == null) {
                int i10 = 3 | 1;
                this.f123993a.Y = true;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    AppStartTrace(@NonNull k kVar, @NonNull com.google.firebase.perf.util.a aVar, @NonNull com.google.firebase.perf.config.a aVar2, @NonNull ExecutorService executorService) {
        this.f123972b = kVar;
        this.f123973c = aVar;
        this.f123974d = aVar2;
        f123969j3 = executorService;
        this.f123975e = x.Wm().rm("_experiment_app_start_ttid");
        this.f123980j = Timer.g(Process.getStartElapsedRealtime());
        v vVar = (v) com.google.firebase.h.p().l(v.class);
        this.f123981k = vVar != null ? Timer.g(vVar.b()) : null;
    }

    static /* synthetic */ int i(AppStartTrace appStartTrace) {
        int i10 = appStartTrace.Z;
        appStartTrace.Z = i10 + 1;
        return i10;
    }

    @NonNull
    private Timer k() {
        Timer timer = this.f123981k;
        return timer != null ? timer : H1;
    }

    public static AppStartTrace l() {
        return f123968i3 != null ? f123968i3 : m(k.l(), new com.google.firebase.perf.util.a());
    }

    @e.a({"ThreadPoolCreation"})
    static AppStartTrace m(k kVar, com.google.firebase.perf.util.a aVar) {
        if (f123968i3 == null) {
            synchronized (AppStartTrace.class) {
                try {
                    if (f123968i3 == null) {
                        f123968i3 = new AppStartTrace(kVar, aVar, com.google.firebase.perf.config.a.h(), new ThreadPoolExecutor(0, 1, 10 + f123970p2, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f123968i3;
    }

    @NonNull
    private Timer r() {
        Timer timer = this.f123980j;
        return timer != null ? timer : k();
    }

    public static boolean s(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            String packageName = context.getPackageName();
            String str = packageName + ":";
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(str))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    public static boolean u(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return true;
        }
        return powerManager.isInteractive();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        x.b bVarPm = x.Wm().rm(com.google.firebase.perf.util.b.EnumC1180b.APP_START_TRACE_NAME.toString()).om(k().f()).pm(k().e(this.f123984n));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(x.Wm().rm(com.google.firebase.perf.util.b.EnumC1180b.ON_CREATE_TRACE_NAME.toString()).om(k().f()).pm(k().e(this.f123982l)).build());
        if (this.f123983m != null) {
            x.b bVarWm = x.Wm();
            bVarWm.rm(com.google.firebase.perf.util.b.EnumC1180b.ON_START_TRACE_NAME.toString()).om(this.f123982l.f()).pm(this.f123982l.e(this.f123983m));
            arrayList.add(bVarWm.build());
            x.b bVarWm2 = x.Wm();
            bVarWm2.rm(com.google.firebase.perf.util.b.EnumC1180b.ON_RESUME_TRACE_NAME.toString()).om(this.f123983m.f()).pm(this.f123983m.e(this.f123984n));
            arrayList.add(bVarWm2.build());
        }
        bVarPm.Pl(arrayList).Tl(this.X.a());
        this.f123972b.D((x) bVarPm.build(), com.google.firebase.perf.v1.g.FOREGROUND_BACKGROUND);
    }

    private void w(final x.b bVar) {
        if (this.f123989t != null && this.f123990v != null && this.f123991w != null) {
            f123969j3.execute(new Runnable() { // from class: com.google.firebase.perf.metrics.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f124015a.f123972b.D(bVar.build(), com.google.firebase.perf.v1.g.FOREGROUND_BACKGROUND);
                }
            });
            C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (this.f123991w != null) {
            return;
        }
        this.f123991w = this.f123973c.a();
        this.f123975e.Xl(x.Wm().rm("_experiment_onDrawFoQ").om(r().f()).pm(r().e(this.f123991w)).build());
        if (this.f123980j != null) {
            this.f123975e.Xl(x.Wm().rm("_experiment_procStart_to_classLoad").om(r().f()).pm(r().e(k())).build());
        }
        this.f123975e.jm("systemDeterminedForeground", this.f123987p1 ? z0.P : "false");
        this.f123975e.im("onDrawCount", this.Z);
        this.f123975e.Tl(this.X.a());
        w(this.f123975e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        if (this.f123989t != null) {
            return;
        }
        this.f123989t = this.f123973c.a();
        this.f123975e.om(r().f()).pm(r().e(this.f123989t));
        w(this.f123975e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (this.f123990v != null) {
            return;
        }
        this.f123990v = this.f123973c.a();
        this.f123975e.Xl(x.Wm().rm("_experiment_preDrawFoQ").om(r().f()).pm(r().e(this.f123990v)).build());
        w(this.f123975e);
    }

    public synchronized void A(@NonNull Context context) {
        try {
            if (this.f123971a) {
                return;
            }
            ProcessLifecycleOwner.l().getLifecycle().c(this);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
                this.f123987p1 = this.f123987p1 || s(applicationContext);
                this.f123971a = true;
                this.f123976f = applicationContext;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @l1
    void B() {
        this.Y = true;
    }

    public synchronized void C() {
        try {
            if (this.f123971a) {
                ProcessLifecycleOwner.l().getLifecycle().g(this);
                ((Application) this.f123976f).unregisterActivityLifecycleCallbacks(this);
                this.f123971a = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @l1
    @p0
    Activity j() {
        return this.f123978h.get();
    }

    @l1
    @p0
    Activity n() {
        return this.f123977g.get();
    }

    @l1
    Timer o() {
        return this.f123982l;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            if (!this.Y && this.f123982l == null) {
                this.f123987p1 = this.f123987p1 || s(this.f123976f);
                this.f123977g = new WeakReference<>(activity);
                this.f123982l = this.f123973c.a();
                if (r().e(this.f123982l) > f123970p2) {
                    this.f123979i = true;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        View viewFindViewById;
        if (!this.Y && !this.f123979i && this.f123974d.i() && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
            viewFindViewById.getViewTreeObserver().removeOnDrawListener(this.f123986p0);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        View viewFindViewById;
        try {
            if (!this.Y && !this.f123979i) {
                boolean zI = this.f123974d.i();
                if (zI && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(this.f123986p0);
                    com.google.firebase.perf.util.d.d(viewFindViewById, new Runnable() { // from class: com.google.firebase.perf.metrics.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f124011a.x();
                        }
                    });
                    com.google.firebase.perf.util.g.a(viewFindViewById, new Runnable() { // from class: com.google.firebase.perf.metrics.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f124012a.y();
                        }
                    }, new Runnable() { // from class: com.google.firebase.perf.metrics.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f124013a.z();
                        }
                    });
                }
                if (this.f123984n != null) {
                    return;
                }
                this.f123978h = new WeakReference<>(activity);
                this.f123984n = this.f123973c.a();
                this.X = SessionManager.getInstance().perfSession();
                com.google.firebase.perf.logging.a.e().a("onResume(): " + activity.getClass().getName() + ": " + k().e(this.f123984n) + " microseconds");
                f123969j3.execute(new Runnable() { // from class: com.google.firebase.perf.metrics.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f124014a.v();
                    }
                });
                if (!zI) {
                    C();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        try {
            if (!this.Y && this.f123983m == null && !this.f123979i) {
                this.f123983m = this.f123973c.a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Keep
    @e1(c0.a.ON_STOP)
    public void onAppEnteredBackground() {
        if (!this.Y && !this.f123979i && this.f123988s == null) {
            this.f123988s = this.f123973c.a();
            this.f123975e.Xl(x.Wm().rm("_experiment_firstBackgrounding").om(r().f()).pm(r().e(this.f123988s)).build());
        }
    }

    @Keep
    @e1(c0.a.ON_START)
    public void onAppEnteredForeground() {
        if (this.Y || this.f123979i || this.f123985o != null) {
            return;
        }
        this.f123985o = this.f123973c.a();
        this.f123975e.Xl(x.Wm().rm("_experiment_firstForegrounding").om(r().f()).pm(r().e(this.f123985o)).build());
    }

    @l1
    Timer p() {
        return this.f123984n;
    }

    @l1
    Timer q() {
        return this.f123983m;
    }
}
