package io.sentry.android.core;

import io.sentry.o7;
import io.sentry.p9;
import io.sentry.q9;
import io.sentry.v9;
import io.sentry.x9;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class z1 implements io.sentry.i0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f304620e = "auto.ui";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f304621f = "contentprovider.load";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f304622g = "activity.load";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f304623h = "application.load";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f304624i = "process.load";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f304625j = 10000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final h f304627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final SentryAndroidOptions f304628c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f304626a = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f304629d = new io.sentry.util.a();

    z1(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull h hVar) {
        this.f304628c = (SentryAndroidOptions) io.sentry.util.y.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f304627b = (h) io.sentry.util.y.c(hVar, "ActivityFramesTracker is required");
    }

    private void e(@NotNull io.sentry.android.core.performance.h hVar, @NotNull io.sentry.protocol.c0 c0Var) {
        p9 p9VarO;
        v9 v9VarH;
        if (hVar.o() == io.sentry.android.core.performance.h.a.COLD && (p9VarO = c0Var.E().o()) != null) {
            io.sentry.protocol.v vVarP = p9VarO.p();
            Iterator<io.sentry.protocol.y> it = c0Var.v0().iterator();
            while (true) {
                if (!it.hasNext()) {
                    v9VarH = null;
                    break;
                }
                io.sentry.protocol.y next = it.next();
                if (next.e().contentEquals("app.start.cold")) {
                    v9VarH = next.h();
                    break;
                }
            }
            io.sentry.android.core.performance.i iVarH = hVar.h();
            if (iVarH.x() && Math.abs(iVarH.l()) <= 10000) {
                c0Var.v0().add(i(iVarH, v9VarH, vVarP, f304624i));
            }
            List<io.sentry.android.core.performance.i> listR = hVar.r();
            if (!listR.isEmpty()) {
                Iterator<io.sentry.android.core.performance.i> it2 = listR.iterator();
                while (it2.hasNext()) {
                    c0Var.v0().add(i(it2.next(), v9VarH, vVarP, f304621f));
                }
            }
            io.sentry.android.core.performance.i iVarP = hVar.p();
            if (iVarP.z()) {
                c0Var.v0().add(i(iVarP, v9VarH, vVarP, f304623h));
            }
        }
    }

    private boolean f(@NotNull io.sentry.protocol.c0 c0Var) {
        for (io.sentry.protocol.y yVar : c0Var.v0()) {
            if (yVar.e().contentEquals("app.start.cold") || yVar.e().contentEquals("app.start.warm")) {
                return true;
            }
        }
        p9 p9VarO = c0Var.E().o();
        return p9VarO != null && (p9VarO.f().equals("app.start.cold") || p9VarO.f().equals("app.start.warm"));
    }

    private static boolean g(double d10, @NotNull io.sentry.protocol.y yVar) {
        if (d10 >= yVar.i().doubleValue()) {
            return yVar.l() == null || d10 <= yVar.l().doubleValue();
        }
        return false;
    }

    private void h(io.sentry.protocol.c0 c0Var) {
        Object obj;
        io.sentry.protocol.y yVar = null;
        io.sentry.protocol.y yVar2 = null;
        for (io.sentry.protocol.y yVar3 : c0Var.v0()) {
            if ("ui.load.initial_display".equals(yVar3.e())) {
                yVar = yVar3;
            } else if ("ui.load.full_display".equals(yVar3.e())) {
                yVar2 = yVar3;
            }
            if (yVar != null && yVar2 != null) {
                break;
            }
        }
        if (yVar == null && yVar2 == null) {
            return;
        }
        for (io.sentry.protocol.y yVar4 : c0Var.v0()) {
            if (yVar4 != yVar && yVar4 != yVar2) {
                Map<String, Object> mapB = yVar4.b();
                boolean z10 = false;
                boolean z11 = yVar != null && g(yVar4.i().doubleValue(), yVar) && (mapB == null || (obj = mapB.get(q9.f306598k)) == null || io.sentry.protocol.b0.b.f306153h.equals(obj));
                if (yVar2 != null && g(yVar4.i().doubleValue(), yVar2)) {
                    z10 = true;
                }
                if (z11 || z10) {
                    Map<String, Object> mapB2 = yVar4.b();
                    if (mapB2 == null) {
                        mapB2 = new ConcurrentHashMap<>();
                        yVar4.o(mapB2);
                    }
                    if (z11) {
                        mapB2.put(q9.f306603p, Boolean.TRUE);
                    }
                    if (z10) {
                        mapB2.put(q9.f306604q, Boolean.TRUE);
                    }
                }
            }
        }
    }

    @NotNull
    private static io.sentry.protocol.y i(@NotNull io.sentry.android.core.performance.i iVar, @Nullable v9 v9Var, @NotNull io.sentry.protocol.v vVar, @NotNull String str) {
        HashMap map = new HashMap(2);
        map.put(q9.f306597j, Long.valueOf(io.sentry.android.core.internal.util.h.f304310b));
        map.put(q9.f306598k, io.sentry.protocol.b0.b.f306153h);
        Boolean bool = Boolean.TRUE;
        map.put(q9.f306603p, bool);
        map.put(q9.f306604q, bool);
        return new io.sentry.protocol.y(Double.valueOf(iVar.s()), Double.valueOf(iVar.p()), vVar, new v9(), v9Var, str, iVar.k(), x9.OK, f304620e, new ConcurrentHashMap(), new ConcurrentHashMap(), map);
    }

    @Override // io.sentry.i0
    @Nullable
    public o7 c(@NotNull o7 o7Var, @NotNull io.sentry.n0 n0Var) {
        return o7Var;
    }

    @Override // io.sentry.i0
    @NotNull
    public io.sentry.protocol.c0 d(@NotNull io.sentry.protocol.c0 c0Var, @NotNull io.sentry.n0 n0Var) {
        Map<String, io.sentry.protocol.i> mapM;
        io.sentry.m1 m1VarA = this.f304629d.a();
        try {
            if (!this.f304628c.isTracingEnabled()) {
                if (m1VarA != null) {
                    m1VarA.close();
                }
                return c0Var;
            }
            io.sentry.android.core.performance.h hVarS = io.sentry.android.core.performance.h.s();
            if (f(c0Var)) {
                if (hVarS.I()) {
                    long jL = hVarS.n(this.f304628c).l();
                    if (jL != 0) {
                        c0Var.t0().put(hVarS.o() == io.sentry.android.core.performance.h.a.COLD ? io.sentry.protocol.i.f306303d : io.sentry.protocol.i.f306304e, new io.sentry.protocol.i(Float.valueOf(jL), io.sentry.p2.b.MILLISECOND.apiName()));
                        e(hVarS, c0Var);
                        hVarS.v();
                    }
                }
                io.sentry.protocol.a aVarD = c0Var.E().d();
                if (aVarD == null) {
                    aVarD = new io.sentry.protocol.a();
                    c0Var.E().w(aVarD);
                }
                aVarD.J(hVarS.o() == io.sentry.android.core.performance.h.a.COLD ? "cold" : "warm");
            }
            h(c0Var);
            io.sentry.protocol.v vVarI = c0Var.I();
            p9 p9VarO = c0Var.E().o();
            if (vVarI != null && p9VarO != null && p9VarO.f().contentEquals("ui.load") && (mapM = this.f304627b.m(vVarI)) != null) {
                c0Var.t0().putAll(mapM);
            }
            if (m1VarA != null) {
                m1VarA.close();
            }
            return c0Var;
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

    @Override // io.sentry.i0
    @Nullable
    public Long getOrder() {
        return 9000L;
    }
}
