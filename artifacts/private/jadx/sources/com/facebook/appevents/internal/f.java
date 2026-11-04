package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.b1;
import com.facebook.appevents.q;
import com.facebook.g0;
import com.facebook.internal.b0;
import com.facebook.internal.e1;
import com.facebook.internal.t;
import com.facebook.internal.t0;
import com.facebook.internal.x;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f98997a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f98998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f98999c = "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f99000d = 1000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ScheduledExecutorService f99001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private static volatile ScheduledFuture<?> f99002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final Object f99003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final AtomicInteger f99004h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private static volatile m f99005i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f99006j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private static String f99007k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static long f99008l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f99009m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private static WeakReference<Activity> f99010n;

    public static final class a implements Application.ActivityLifecycleCallbacks {
        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            t0.f100109e.d(com.facebook.t0.APP_EVENTS, f.f98998b, "onActivityCreated");
            g gVar = g.f99011a;
            g.a();
            f fVar = f.f98997a;
            f.q(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            t0.f100109e.d(com.facebook.t0.APP_EVENTS, f.f98998b, "onActivityDestroyed");
            f.f98997a.s(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            t0.f100109e.d(com.facebook.t0.APP_EVENTS, f.f98998b, "onActivityPaused");
            g gVar = g.f99011a;
            g.a();
            f.f98997a.t(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            t0.f100109e.d(com.facebook.t0.APP_EVENTS, f.f98998b, "onActivityResumed");
            g gVar = g.f99011a;
            g.a();
            f fVar = f.f98997a;
            f.w(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
            t0.f100109e.d(com.facebook.t0.APP_EVENTS, f.f98998b, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            f fVar = f.f98997a;
            f.f99009m++;
            t0.f100109e.d(com.facebook.t0.APP_EVENTS, f.f98998b, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            t0.f100109e.d(com.facebook.t0.APP_EVENTS, f.f98998b, "onActivityStopped");
            q.f99234b.o();
            f fVar = f.f98997a;
            f.f99009m--;
        }
    }

    static {
        String canonicalName = f.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f98998b = canonicalName;
        f99001e = Executors.newSingleThreadScheduledExecutor();
        f99003g = new Object();
        f99004h = new AtomicInteger(0);
        f99006j = new AtomicBoolean(false);
    }

    private f() {
    }

    private final void k() {
        ScheduledFuture<?> scheduledFuture;
        synchronized (f99003g) {
            try {
                if (f99002f != null && (scheduledFuture = f99002f) != null) {
                    scheduledFuture.cancel(false);
                }
                f99002f = null;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @oj.n
    @Nullable
    public static final Activity l() {
        WeakReference<Activity> weakReference = f99010n;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @oj.n
    @Nullable
    public static final UUID m() {
        m mVar;
        if (f99005i == null || (mVar = f99005i) == null) {
            return null;
        }
        return mVar.e();
    }

    private final int n() {
        b0 b0Var = b0.f99725a;
        g0 g0Var = g0.f99617a;
        x xVarF = b0.f(g0.o());
        if (xVarF != null) {
            return xVarF.n();
        }
        j jVar = j.f99025a;
        return j.a();
    }

    @oj.n
    @b1({b1.a.LIBRARY_GROUP})
    public static final boolean o() {
        return f99009m == 0;
    }

    @oj.n
    public static final boolean p() {
        return f99006j.get();
    }

    @oj.n
    public static final void q(@Nullable Activity activity) {
        f99001e.execute(new Runnable() { // from class: com.facebook.appevents.internal.d
            @Override // java.lang.Runnable
            public final void run() {
                f.r();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r() {
        if (f99005i == null) {
            f99005i = m.f99063g.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(Activity activity) {
        com.facebook.appevents.codeless.e eVar = com.facebook.appevents.codeless.e.f98782a;
        com.facebook.appevents.codeless.e.j(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(Activity activity) {
        AtomicInteger atomicInteger = f99004h;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
        }
        k();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        e1 e1Var = e1.f99794a;
        final String strT = e1.t(activity);
        com.facebook.appevents.codeless.e eVar = com.facebook.appevents.codeless.e.f98782a;
        com.facebook.appevents.codeless.e.k(activity);
        f99001e.execute(new Runnable() { // from class: com.facebook.appevents.internal.b
            @Override // java.lang.Runnable
            public final void run() {
                f.u(jCurrentTimeMillis, strT);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(final long j10, final String activityName) {
        Intrinsics.checkNotNullParameter(activityName, "$activityName");
        if (f99005i == null) {
            int i10 = (7 >> 0) >> 0;
            f99005i = new m(Long.valueOf(j10), null, null, 4, null);
        }
        m mVar = f99005i;
        if (mVar != null) {
            mVar.n(Long.valueOf(j10));
        }
        if (f99004h.get() <= 0) {
            Runnable runnable = new Runnable() { // from class: com.facebook.appevents.internal.c
                @Override // java.lang.Runnable
                public final void run() {
                    f.v(j10, activityName);
                }
            };
            synchronized (f99003g) {
                try {
                    f99002f = f99001e.schedule(runnable, f98997a.n(), TimeUnit.SECONDS);
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        long j11 = f99008l;
        long j12 = j11 > 0 ? (j10 - j11) / ((long) 1000) : 0L;
        i iVar = i.f99018a;
        i.e(activityName, j12);
        m mVar2 = f99005i;
        if (mVar2 == null) {
            return;
        }
        mVar2.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(long j10, String activityName) {
        Intrinsics.checkNotNullParameter(activityName, "$activityName");
        if (f99005i == null) {
            int i10 = 4 ^ 0;
            f99005i = new m(Long.valueOf(j10), null, null, 4, null);
        }
        if (f99004h.get() <= 0) {
            n nVar = n.f99074a;
            n.e(activityName, f99005i, f99007k);
            m.f99063g.a();
            f99005i = null;
        }
        synchronized (f99003g) {
            try {
                f99002f = null;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @oj.n
    public static final void w(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        f99010n = new WeakReference<>(activity);
        f99004h.incrementAndGet();
        f98997a.k();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        f99008l = jCurrentTimeMillis;
        e1 e1Var = e1.f99794a;
        final String strT = e1.t(activity);
        com.facebook.appevents.codeless.e eVar = com.facebook.appevents.codeless.e.f98782a;
        com.facebook.appevents.codeless.e.l(activity);
        e5.b bVar = e5.b.f274656a;
        e5.b.d(activity);
        k5.e eVar2 = k5.e.f307557a;
        k5.e.i(activity);
        com.facebook.appevents.iap.k kVar = com.facebook.appevents.iap.k.f98971a;
        com.facebook.appevents.iap.k.b();
        final Context applicationContext = activity.getApplicationContext();
        f99001e.execute(new Runnable() { // from class: com.facebook.appevents.internal.a
            @Override // java.lang.Runnable
            public final void run() {
                f.x(jCurrentTimeMillis, strT, applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(long j10, String activityName, Context appContext) {
        m mVar;
        Intrinsics.checkNotNullParameter(activityName, "$activityName");
        m mVar2 = f99005i;
        Long lF = mVar2 == null ? null : mVar2.f();
        if (f99005i == null) {
            int i10 = 1 << 0;
            f99005i = new m(Long.valueOf(j10), null, null, 4, null);
            n nVar = n.f99074a;
            String str = f99007k;
            Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
            n.c(activityName, null, str, appContext);
        } else if (lF != null) {
            long jLongValue = j10 - lF.longValue();
            if (jLongValue > f98997a.n() * 1000) {
                n nVar2 = n.f99074a;
                n.e(activityName, f99005i, f99007k);
                String str2 = f99007k;
                Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
                n.c(activityName, null, str2, appContext);
                f99005i = new m(Long.valueOf(j10), null, null, 4, null);
            } else if (jLongValue > 1000 && (mVar = f99005i) != null) {
                mVar.k();
            }
        }
        m mVar3 = f99005i;
        if (mVar3 != null) {
            mVar3.n(Long.valueOf(j10));
        }
        m mVar4 = f99005i;
        if (mVar4 == null) {
            return;
        }
        mVar4.p();
    }

    @oj.n
    public static final void y(@NotNull Application application, @Nullable String str) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (f99006j.compareAndSet(false, true)) {
            t tVar = t.f100072a;
            t.a(t.b.CodelessEvents, new t.a() { // from class: com.facebook.appevents.internal.e
                @Override // com.facebook.internal.t.a
                public final void a(boolean z10) {
                    f.z(z10);
                }
            });
            f99007k = str;
            application.registerActivityLifecycleCallbacks(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(boolean z10) {
        if (z10) {
            com.facebook.appevents.codeless.e eVar = com.facebook.appevents.codeless.e.f98782a;
            com.facebook.appevents.codeless.e.f();
        } else {
            com.facebook.appevents.codeless.e eVar2 = com.facebook.appevents.codeless.e.f98782a;
            com.facebook.appevents.codeless.e.e();
        }
    }
}
