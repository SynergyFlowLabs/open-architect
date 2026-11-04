package com.google.firebase.perf.application;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.fragment.app.s;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.k;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.f;
import com.google.firebase.perf.util.i;
import com.google.firebase.perf.v1.g;
import com.google.firebase.perf.v1.x;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public class a implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final com.google.firebase.perf.logging.a f123836v = com.google.firebase.perf.logging.a.e();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static volatile a f123837w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap<Activity, Boolean> f123838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakHashMap<Activity, d> f123839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakHashMap<Activity, c> f123840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakHashMap<Activity, Trace> f123841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, Long> f123842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<WeakReference<b>> f123843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Set<InterfaceC1177a> f123844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicInteger f123845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final k f123846i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f123847j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.firebase.perf.util.a f123848k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f123849l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Timer f123850m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Timer f123851n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private g f123852o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f123853s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f123854t;

    /* JADX INFO: renamed from: com.google.firebase.perf.application.a$a, reason: collision with other inner class name */
    public interface InterfaceC1177a {
        void a();
    }

    public interface b {
        void onUpdateAppState(g gVar);
    }

    a(k kVar, com.google.firebase.perf.util.a aVar) {
        this(kVar, aVar, com.google.firebase.perf.config.a.h(), l());
    }

    public static a c() {
        if (f123837w == null) {
            synchronized (a.class) {
                try {
                    if (f123837w == null) {
                        f123837w = new a(k.l(), new com.google.firebase.perf.util.a());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f123837w;
    }

    public static String g(Activity activity) {
        return com.google.firebase.perf.util.b.f124203p + activity.getClass().getSimpleName();
    }

    private static boolean l() {
        return d.a();
    }

    private void q() {
        synchronized (this.f123844g) {
            try {
                for (InterfaceC1177a interfaceC1177a : this.f123844g) {
                    if (interfaceC1177a != null) {
                        interfaceC1177a.a();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void r(Activity activity) {
        Trace trace = this.f123841d.get(activity);
        if (trace == null) {
            return;
        }
        this.f123841d.remove(activity);
        f<com.google.firebase.perf.metrics.g.a> fVarE = this.f123839b.get(activity).e();
        if (!fVarE.d()) {
            f123836v.m("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        } else {
            i.a(trace, fVarE.c());
            trace.stop();
        }
    }

    private void s(String str, Timer timer, Timer timer2) {
        if (this.f123847j.N()) {
            x.b bVarTl = x.Wm().rm(str).om(timer.f()).pm(timer.e(timer2)).Tl(SessionManager.getInstance().perfSession().a());
            int andSet = this.f123845h.getAndSet(0);
            synchronized (this.f123842e) {
                try {
                    bVarTl.gm(this.f123842e);
                    if (andSet != 0) {
                        bVarTl.im(com.google.firebase.perf.util.b.a.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
                    }
                    this.f123842e.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f123846i.D(bVarTl.build(), g.FOREGROUND_BACKGROUND);
        }
    }

    private void v(Activity activity) {
        if (m() && this.f123847j.N()) {
            d dVar = new d(activity);
            this.f123839b.put(activity, dVar);
            if (activity instanceof s) {
                c cVar = new c(this.f123848k, this.f123846i, this, dVar);
                this.f123840c.put(activity, cVar);
                ((s) activity).getSupportFragmentManager().D1(cVar, true);
            }
        }
    }

    private void y(g gVar) {
        this.f123852o = gVar;
        synchronized (this.f123843f) {
            try {
                Iterator<WeakReference<b>> it = this.f123843f.iterator();
                while (it.hasNext()) {
                    b bVar = it.next().get();
                    if (bVar != null) {
                        bVar.onUpdateAppState(this.f123852o);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @l1
    WeakHashMap<Activity, Trace> a() {
        return this.f123841d;
    }

    public g b() {
        return this.f123852o;
    }

    @l1
    Timer d() {
        return this.f123851n;
    }

    @l1
    Timer e() {
        return this.f123850m;
    }

    @l1
    WeakHashMap<Activity, Boolean> f() {
        return this.f123838a;
    }

    public void h(@NonNull String str, long j10) {
        synchronized (this.f123842e) {
            try {
                Long l10 = this.f123842e.get(str);
                if (l10 == null) {
                    this.f123842e.put(str, Long.valueOf(j10));
                } else {
                    this.f123842e.put(str, Long.valueOf(l10.longValue() + j10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i(int i10) {
        this.f123845h.addAndGet(i10);
    }

    public boolean j() {
        return this.f123854t;
    }

    public boolean k() {
        return this.f123852o == g.FOREGROUND;
    }

    protected boolean m() {
        return this.f123849l;
    }

    public synchronized void n(Context context) {
        if (this.f123853s) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.f123853s = true;
        }
    }

    public void o(InterfaceC1177a interfaceC1177a) {
        synchronized (this.f123844g) {
            try {
                this.f123844g.add(interfaceC1177a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        v(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f123839b.remove(activity);
        if (this.f123840c.containsKey(activity)) {
            ((s) activity).getSupportFragmentManager().h2(this.f123840c.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.f123838a.isEmpty()) {
                this.f123850m = this.f123848k.a();
                this.f123838a.put(activity, Boolean.TRUE);
                if (this.f123854t) {
                    y(g.FOREGROUND);
                    q();
                    this.f123854t = false;
                } else {
                    s(com.google.firebase.perf.util.b.EnumC1180b.BACKGROUND_TRACE_NAME.toString(), this.f123851n, this.f123850m);
                    y(g.FOREGROUND);
                }
            } else {
                this.f123838a.put(activity, Boolean.TRUE);
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
            if (m() && this.f123847j.N()) {
                if (!this.f123839b.containsKey(activity)) {
                    v(activity);
                }
                this.f123839b.get(activity).c();
                Trace trace = new Trace(g(activity), this.f123846i, this.f123848k, this);
                trace.start();
                this.f123841d.put(activity, trace);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        try {
            if (m()) {
                r(activity);
            }
            if (this.f123838a.containsKey(activity)) {
                this.f123838a.remove(activity);
                if (this.f123838a.isEmpty()) {
                    this.f123851n = this.f123848k.a();
                    s(com.google.firebase.perf.util.b.EnumC1180b.FOREGROUND_TRACE_NAME.toString(), this.f123850m, this.f123851n);
                    y(g.BACKGROUND);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void p(WeakReference<b> weakReference) {
        synchronized (this.f123843f) {
            try {
                this.f123843f.add(weakReference);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @l1
    public void t(boolean z10) {
        this.f123854t = z10;
    }

    @l1
    void u(Timer timer) {
        this.f123851n = timer;
    }

    public synchronized void w(Context context) {
        try {
            if (this.f123853s) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
                    int i10 = 7 & 0;
                    this.f123853s = false;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void x(WeakReference<b> weakReference) {
        synchronized (this.f123843f) {
            this.f123843f.remove(weakReference);
        }
    }

    @l1
    a(k kVar, com.google.firebase.perf.util.a aVar, com.google.firebase.perf.config.a aVar2, boolean z10) {
        this.f123838a = new WeakHashMap<>();
        this.f123839b = new WeakHashMap<>();
        this.f123840c = new WeakHashMap<>();
        this.f123841d = new WeakHashMap<>();
        this.f123842e = new HashMap();
        this.f123843f = new HashSet();
        this.f123844g = new HashSet();
        this.f123845h = new AtomicInteger(0);
        this.f123852o = g.BACKGROUND;
        this.f123853s = false;
        this.f123854t = true;
        this.f123846i = kVar;
        this.f123848k = aVar;
        this.f123847j = aVar2;
        this.f123849l = z10;
    }
}
