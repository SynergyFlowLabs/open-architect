package io.sentry.android.core;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.y7;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private FrameMetricsAggregator f304165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final SentryAndroidOptions f304166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<io.sentry.protocol.v, Map<String, io.sentry.protocol.i>> f304167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<Activity, b> f304168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final v1 f304169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    protected io.sentry.util.a f304170f;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f304171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f304172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f304173c;

        private b(int i10, int i11, int i12) {
            this.f304171a = i10;
            this.f304172b = i11;
            this.f304173c = i12;
        }
    }

    public h(@NotNull io.sentry.util.u uVar, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull v1 v1Var) {
        this.f304165a = null;
        this.f304167c = new ConcurrentHashMap();
        this.f304168d = new WeakHashMap();
        this.f304170f = new io.sentry.util.a();
        if (uVar.a("androidx.core.app.FrameMetricsAggregator", sentryAndroidOptions.getLogger())) {
            this.f304165a = new FrameMetricsAggregator();
        }
        this.f304166b = sentryAndroidOptions;
        this.f304169e = v1Var;
    }

    public static /* synthetic */ void c(h hVar, Runnable runnable, String str) {
        hVar.getClass();
        try {
            runnable.run();
        } catch (Throwable unused) {
            if (str != null) {
                hVar.f304166b.getLogger().c(y7.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    @Nullable
    private b f() {
        FrameMetricsAggregator frameMetricsAggregator;
        int i10;
        int i11;
        SparseIntArray sparseIntArray;
        if (!h() || (frameMetricsAggregator = this.f304165a) == null) {
            return null;
        }
        SparseIntArray[] sparseIntArrayArrB = frameMetricsAggregator.b();
        int i12 = 0;
        if (sparseIntArrayArrB == null || sparseIntArrayArrB.length <= 0 || (sparseIntArray = sparseIntArrayArrB[0]) == null) {
            i10 = 0;
            i11 = 0;
        } else {
            int i13 = 0;
            i10 = 0;
            i11 = 0;
            while (i12 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i12);
                int iValueAt = sparseIntArray.valueAt(i12);
                i13 += iValueAt;
                if (iKeyAt > 700) {
                    i11 += iValueAt;
                } else if (iKeyAt > 16) {
                    i10 += iValueAt;
                }
                i12++;
            }
            i12 = i13;
        }
        return new b(i12, i10, i11);
    }

    @Nullable
    private b g(@NotNull Activity activity) {
        b bVarF;
        b bVarRemove = this.f304168d.remove(activity);
        if (bVarRemove != null && (bVarF = f()) != null) {
            return new b(bVarF.f304171a - bVarRemove.f304171a, bVarF.f304172b - bVarRemove.f304172b, bVarF.f304173c - bVarRemove.f304173c);
        }
        return null;
    }

    private void i(final Runnable runnable, final String str) {
        try {
            if (io.sentry.android.core.internal.util.h.h().a()) {
                runnable.run();
            } else {
                this.f304169e.b(new Runnable() { // from class: io.sentry.android.core.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.c(this.f304115a, runnable, str);
                    }
                });
            }
        } catch (Throwable unused) {
            if (str != null) {
                this.f304166b.getLogger().c(y7.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    private void k(@NotNull Activity activity) {
        b bVarF = f();
        if (bVarF != null) {
            this.f304168d.put(activity, bVarF);
        }
    }

    public void e(@NotNull final Activity activity) {
        io.sentry.m1 m1VarA = this.f304170f.a();
        try {
            if (h()) {
                i(new Runnable() { // from class: io.sentry.android.core.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f304104a.f304165a.a(activity);
                    }
                }, "FrameMetricsAggregator.add");
                k(activity);
                if (m1VarA != null) {
                    m1VarA.close();
                }
            } else if (m1VarA != null) {
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

    @lm.r
    public boolean h() {
        return (this.f304165a == null || !this.f304166b.isEnableFramesTracking() || this.f304166b.isEnablePerformanceV2()) ? false : true;
    }

    public void j(@NotNull final Activity activity, @NotNull io.sentry.protocol.v vVar) {
        io.sentry.m1 m1VarA = this.f304170f.a();
        try {
            if (!h()) {
                if (m1VarA != null) {
                    m1VarA.close();
                    return;
                }
                return;
            }
            i(new Runnable() { // from class: io.sentry.android.core.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f304125a.f304165a.c(activity);
                }
            }, null);
            b bVarG = g(activity);
            if (bVarG != null && (bVarG.f304171a != 0 || bVarG.f304172b != 0 || bVarG.f304173c != 0)) {
                io.sentry.protocol.i iVar = new io.sentry.protocol.i(Integer.valueOf(bVarG.f304171a), "none");
                io.sentry.protocol.i iVar2 = new io.sentry.protocol.i(Integer.valueOf(bVarG.f304172b), "none");
                io.sentry.protocol.i iVar3 = new io.sentry.protocol.i(Integer.valueOf(bVarG.f304173c), "none");
                HashMap map = new HashMap();
                map.put(io.sentry.protocol.i.f306305f, iVar);
                map.put(io.sentry.protocol.i.f306306g, iVar2);
                map.put(io.sentry.protocol.i.f306307h, iVar3);
                this.f304167c.put(vVar, map);
                if (m1VarA != null) {
                    m1VarA.close();
                    return;
                }
                return;
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

    public void l() {
        io.sentry.m1 m1VarA = this.f304170f.a();
        try {
            if (h()) {
                i(new Runnable() { // from class: io.sentry.android.core.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f304154a.f304165a.e();
                    }
                }, "FrameMetricsAggregator.stop");
                this.f304165a.d();
            }
            this.f304167c.clear();
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

    @Nullable
    public Map<String, io.sentry.protocol.i> m(@NotNull io.sentry.protocol.v vVar) {
        io.sentry.m1 m1VarA = this.f304170f.a();
        try {
            if (!h()) {
                if (m1VarA != null) {
                    m1VarA.close();
                }
                return null;
            }
            Map<String, io.sentry.protocol.i> map = this.f304167c.get(vVar);
            this.f304167c.remove(vVar);
            if (m1VarA != null) {
                m1VarA.close();
            }
            return map;
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

    public h(@NotNull io.sentry.util.u uVar, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        this(uVar, sentryAndroidOptions, new v1());
    }

    @lm.n
    h(@NotNull io.sentry.util.u uVar, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull v1 v1Var, @Nullable FrameMetricsAggregator frameMetricsAggregator) {
        this(uVar, sentryAndroidOptions, v1Var);
        this.f304165a = frameMetricsAggregator;
    }
}
