package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import io.sentry.n8;
import io.sentry.o7;
import io.sentry.p7;
import io.sentry.p9;
import io.sentry.protocol.DebugImage;
import io.sentry.u8;
import io.sentry.y7;
import io.sentry.z5;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
@androidx.annotation.m1
public final class n0 implements io.sentry.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f304400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final SentryAndroidOptions f304401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final u0 f304402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final p7 f304403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final io.sentry.cache.w f304404e;

    public n0(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull u0 u0Var) {
        this.f304400a = a1.g(context);
        this.f304401b = sentryAndroidOptions;
        this.f304402c = u0Var;
        this.f304404e = sentryAndroidOptions.findPersistingScopeObserver();
        this.f304403d = new p7(new u8(sentryAndroidOptions));
    }

    private void A(@NotNull z5 z5Var) {
        Map map = (Map) io.sentry.cache.h.i(this.f304401b, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (z5Var.R() == null) {
            z5Var.k0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!z5Var.R().containsKey(entry.getKey())) {
                z5Var.j0((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    private void B(@NotNull z5 z5Var) {
        if (z5Var.L() == null) {
            z5Var.e0("java");
        }
    }

    private void C(@NotNull z5 z5Var) {
        if (z5Var.M() == null) {
            z5Var.f0((String) io.sentry.cache.h.i(this.f304401b, io.sentry.cache.h.f305189c, String.class));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0097  */
    private void D(@NotNull o7 o7Var) {
        String str = (String) n(this.f304401b, io.sentry.cache.w.f305267o, String.class);
        if (new File(this.f304401b.getCacheDirPath(), "replay_" + str).exists()) {
            if (str != null) {
                io.sentry.cache.w.K(this.f304401b, str, io.sentry.cache.w.f305267o);
                o7Var.E().r("replay_id", str);
            }
        } else if (o(o7Var)) {
            File[] fileArrListFiles = new File(this.f304401b.getCacheDirPath()).listFiles();
            String strSubstring = null;
            if (fileArrListFiles != null) {
                long jLastModified = Long.MIN_VALUE;
                for (File file : fileArrListFiles) {
                    if (file.isDirectory() && file.getName().startsWith("replay_") && file.lastModified() > jLastModified && file.lastModified() <= o7Var.E0().getTime()) {
                        jLastModified = file.lastModified();
                        strSubstring = file.getName().substring(7);
                    }
                }
            }
            str = strSubstring;
            if (str != null) {
                io.sentry.cache.w.K(this.f304401b, str, io.sentry.cache.w.f305267o);
                o7Var.E().r("replay_id", str);
            }
        }
    }

    private void E(@NotNull z5 z5Var) {
        if (z5Var.N() == null) {
            z5Var.g0((io.sentry.protocol.m) n(this.f304401b, io.sentry.cache.w.f305262j, io.sentry.protocol.m.class));
        }
    }

    private void F(@NotNull z5 z5Var) {
        Map map = (Map) n(this.f304401b, "tags.json", Map.class);
        if (map == null) {
            return;
        }
        if (z5Var.R() == null) {
            z5Var.k0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!z5Var.R().containsKey(entry.getKey())) {
                z5Var.j0((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    private void G(@NotNull z5 z5Var) {
        if (z5Var.O() == null) {
            z5Var.h0((io.sentry.protocol.p) io.sentry.cache.h.i(this.f304401b, io.sentry.cache.h.f305191e, io.sentry.protocol.p.class));
        }
    }

    private void H(@NotNull z5 z5Var) {
        try {
            a1.a aVarL = h1.i(this.f304400a, this.f304401b).l();
            if (aVarL != null) {
                for (Map.Entry<String, String> entry : aVarL.a().entrySet()) {
                    z5Var.j0(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th2) {
            this.f304401b.getLogger().a(y7.ERROR, "Error getting side loaded info.", th2);
        }
    }

    private void I(@NotNull o7 o7Var) {
        m(o7Var);
        H(o7Var);
    }

    private void J(@NotNull o7 o7Var) {
        p9 p9Var = (p9) n(this.f304401b, io.sentry.cache.w.f305266n, p9.class);
        if (o7Var.E().o() != null || p9Var == null || p9Var.m() == null || p9Var.p() == null) {
            return;
        }
        o7Var.E().G(p9Var);
    }

    private void K(@NotNull o7 o7Var) {
        String str = (String) n(this.f304401b, io.sentry.cache.w.f305265m, String.class);
        if (o7Var.F0() == null) {
            o7Var.T0(str);
        }
    }

    private void L(@NotNull z5 z5Var) {
        if (z5Var.U() == null) {
            z5Var.m0((io.sentry.protocol.g0) n(this.f304401b, io.sentry.cache.w.f305257e, io.sentry.protocol.g0.class));
        }
    }

    private void e(@NotNull o7 o7Var, @NotNull Object obj) {
        C(o7Var);
        v(o7Var);
        u(o7Var);
        s(o7Var);
        G(o7Var);
        p(o7Var, obj);
        A(o7Var);
    }

    private void f(@NotNull o7 o7Var, @NotNull Object obj) {
        E(o7Var);
        L(o7Var);
        F(o7Var);
        q(o7Var);
        x(o7Var);
        r(o7Var);
        K(o7Var);
        y(o7Var, obj);
        z(o7Var);
        J(o7Var);
        D(o7Var);
    }

    @Nullable
    private io.sentry.protocol.b0 g(@Nullable List<io.sentry.protocol.b0> list) {
        if (list == null) {
            return null;
        }
        for (io.sentry.protocol.b0 b0Var : list) {
            String strM = b0Var.m();
            if (strM != null && strM.equals(io.sentry.protocol.b0.b.f306153h)) {
                return b0Var;
            }
        }
        return null;
    }

    @e.a({"NewApi"})
    @NotNull
    private io.sentry.protocol.e h() {
        io.sentry.protocol.e eVar = new io.sentry.protocol.e();
        eVar.H0(Build.MANUFACTURER);
        eVar.u0(Build.BRAND);
        eVar.B0(a1.l(this.f304401b.getLogger()));
        eVar.J0(Build.MODEL);
        eVar.K0(Build.ID);
        eVar.q0(a1.j());
        ActivityManager.MemoryInfo memoryInfoN = a1.n(this.f304400a, this.f304401b.getLogger());
        if (memoryInfoN != null) {
            eVar.I0(j(memoryInfoN));
        }
        eVar.U0(this.f304402c.f());
        DisplayMetrics displayMetricsK = a1.k(this.f304400a, this.f304401b.getLogger());
        if (displayMetricsK != null) {
            eVar.T0(Integer.valueOf(displayMetricsK.widthPixels));
            eVar.S0(Integer.valueOf(displayMetricsK.heightPixels));
            eVar.Q0(Float.valueOf(displayMetricsK.density));
            eVar.R0(Integer.valueOf(displayMetricsK.densityDpi));
        }
        if (eVar.V() == null) {
            eVar.E0(i());
        }
        List<Integer> listD = io.sentry.android.core.internal.util.l.b().d();
        if (!listD.isEmpty()) {
            eVar.P0(Double.valueOf(((Integer) Collections.max(listD)).doubleValue()));
            eVar.O0(Integer.valueOf(listD.size()));
        }
        return eVar;
    }

    @Nullable
    private String i() {
        try {
            return m1.a(this.f304400a);
        } catch (Throwable th2) {
            this.f304401b.getLogger().a(y7.ERROR, "Error getting installationId.", th2);
            return null;
        }
    }

    @NotNull
    private Long j(@NotNull ActivityManager.MemoryInfo memoryInfo) {
        return Long.valueOf(memoryInfo.totalMem);
    }

    private boolean k(@NotNull Object obj) {
        if (obj instanceof io.sentry.hints.a) {
            return "anr_background".equals(((io.sentry.hints.a) obj).d());
        }
        return false;
    }

    private void l(@NotNull z5 z5Var) {
        String str;
        io.sentry.protocol.l lVarI = z5Var.E().i();
        z5Var.E().B(h1.i(this.f304400a, this.f304401b).j());
        if (lVarI != null) {
            String strI = lVarI.i();
            if (strI == null || strI.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + strI.trim().toLowerCase(Locale.ROOT);
            }
            z5Var.E().r(str, lVarI);
        }
    }

    private void m(@NotNull z5 z5Var) {
        io.sentry.protocol.g0 g0VarU = z5Var.U();
        if (g0VarU == null) {
            g0VarU = new io.sentry.protocol.g0();
            z5Var.m0(g0VarU);
        }
        if (g0VarU.l() == null) {
            g0VarU.s(i());
        }
        if (g0VarU.m() == null && this.f304401b.isSendDefaultPii()) {
            g0VarU.t(io.sentry.y1.f307137a);
        }
    }

    @Nullable
    private <T> T n(@NotNull n8 n8Var, @NotNull String str, @NotNull Class<T> cls) {
        io.sentry.cache.w wVar = this.f304404e;
        if (wVar == null) {
            return null;
        }
        return (T) wVar.H(n8Var, str, cls);
    }

    private boolean o(@NotNull o7 o7Var) {
        String str = (String) io.sentry.cache.h.i(this.f304401b, io.sentry.cache.h.f305195i, String.class);
        if (str == null) {
            return false;
        }
        try {
            if (Double.parseDouble(str) >= io.sentry.util.f0.a().g()) {
                return true;
            }
            this.f304401b.getLogger().c(y7.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", o7Var.I());
            return false;
        } catch (Throwable th2) {
            this.f304401b.getLogger().a(y7.ERROR, "Error parsing replay sample rate.", th2);
            return false;
        }
    }

    private void p(@NotNull z5 z5Var, @NotNull Object obj) {
        io.sentry.protocol.a aVarD = z5Var.E().d();
        if (aVarD == null) {
            aVarD = new io.sentry.protocol.a();
        }
        aVarD.A(a1.i(this.f304400a));
        aVarD.F(Boolean.valueOf(!k(obj)));
        PackageInfo packageInfoP = a1.p(this.f304400a, this.f304402c);
        if (packageInfoP != null) {
            aVarD.z(packageInfoP.packageName);
        }
        String strM = z5Var.M() != null ? z5Var.M() : (String) io.sentry.cache.h.i(this.f304401b, io.sentry.cache.h.f305189c, String.class);
        if (strM != null) {
            try {
                String strSubstring = strM.substring(strM.indexOf(64) + 1, strM.indexOf(43));
                String strSubstring2 = strM.substring(strM.indexOf(43) + 1);
                aVarD.C(strSubstring);
                aVarD.y(strSubstring2);
            } catch (Throwable unused) {
                this.f304401b.getLogger().c(y7.WARNING, "Failed to parse release from scope cache: %s", strM);
            }
        }
        try {
            a1.b bVarM = h1.i(this.f304400a, this.f304401b).m();
            if (bVarM != null) {
                aVarD.H(Boolean.valueOf(bVarM.b()));
                if (bVarM.a() != null) {
                    aVarD.I(Arrays.asList(bVarM.a()));
                }
            }
        } catch (Throwable th2) {
            this.f304401b.getLogger().a(y7.ERROR, "Error getting split apks info.", th2);
        }
        z5Var.E().w(aVarD);
    }

    private void q(@NotNull z5 z5Var) {
        List<io.sentry.f> list = (List) n(this.f304401b, io.sentry.cache.w.f305258f, List.class);
        if (list == null) {
            return;
        }
        if (z5Var.D() == null) {
            z5Var.X(list);
        } else {
            z5Var.D().addAll(list);
        }
    }

    private void r(@NotNull z5 z5Var) {
        io.sentry.protocol.c cVar = (io.sentry.protocol.c) n(this.f304401b, io.sentry.cache.w.f305261i, io.sentry.protocol.c.class);
        if (cVar == null) {
            return;
        }
        io.sentry.protocol.c cVarE = z5Var.E();
        for (Map.Entry<String, Object> entry : new io.sentry.protocol.c(cVar).b()) {
            Object value = entry.getValue();
            if (!"trace".equals(entry.getKey()) || !(value instanceof p9)) {
                if (!cVarE.a(entry.getKey())) {
                    cVarE.r(entry.getKey(), value);
                }
            }
        }
    }

    private void s(@NotNull z5 z5Var) {
        io.sentry.protocol.d dVarF = z5Var.F();
        if (dVarF == null) {
            dVarF = new io.sentry.protocol.d();
        }
        if (dVarF.d() == null) {
            dVarF.f(new ArrayList());
        }
        List<DebugImage> listD = dVarF.d();
        if (listD != null) {
            String str = (String) io.sentry.cache.h.i(this.f304401b, io.sentry.cache.h.f305190d, String.class);
            if (str != null) {
                DebugImage debugImage = new DebugImage();
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(str);
                listD.add(debugImage);
            }
            z5Var.Y(dVarF);
        }
    }

    private void t(@NotNull z5 z5Var) {
        if (z5Var.E().f() == null) {
            z5Var.E().y(h());
        }
    }

    private void u(@NotNull z5 z5Var) {
        String str;
        if (z5Var.G() == null) {
            z5Var.Z((String) io.sentry.cache.h.i(this.f304401b, io.sentry.cache.h.f305193g, String.class));
        }
        if (z5Var.G() == null && (str = (String) io.sentry.cache.h.i(this.f304401b, io.sentry.cache.h.f305189c, String.class)) != null) {
            try {
                z5Var.Z(str.substring(str.indexOf(43) + 1));
            } catch (Throwable unused) {
                this.f304401b.getLogger().c(y7.WARNING, "Failed to parse release from scope cache: %s", str);
            }
        }
    }

    private void v(@NotNull z5 z5Var) {
        if (z5Var.H() == null) {
            String environment = (String) io.sentry.cache.h.i(this.f304401b, io.sentry.cache.h.f305192f, String.class);
            if (environment == null) {
                environment = this.f304401b.getEnvironment();
            }
            z5Var.a0(environment);
        }
    }

    private void w(@NotNull o7 o7Var, @NotNull Object obj) {
        io.sentry.protocol.j jVar = new io.sentry.protocol.j();
        if (((io.sentry.hints.c) obj).e()) {
            jVar.E("AppExitInfo");
        } else {
            jVar.E("HistoricalAppExitInfo");
        }
        String str = "ANR";
        if (k(obj)) {
            str = "Background ANR";
        }
        ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(str, Thread.currentThread());
        io.sentry.protocol.b0 b0VarG = g(o7Var.D0());
        if (b0VarG == null) {
            b0VarG = new io.sentry.protocol.b0();
            b0VarG.C(new io.sentry.protocol.a0());
        }
        o7Var.K0(this.f304403d.f(b0VarG, jVar, applicationNotResponding));
    }

    private void x(@NotNull z5 z5Var) {
        Map map = (Map) n(this.f304401b, io.sentry.cache.w.f305260h, Map.class);
        if (map == null) {
            return;
        }
        if (z5Var.K() == null) {
            z5Var.d0(new HashMap(map));
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!z5Var.K().containsKey(entry.getKey())) {
                z5Var.K().put((String) entry.getKey(), entry.getValue());
            }
        }
    }

    private void y(@NotNull o7 o7Var, @NotNull Object obj) {
        List<String> list = (List) n(this.f304401b, io.sentry.cache.w.f305264l, List.class);
        if (o7Var.x0() == null) {
            o7Var.L0(list);
        }
        boolean zK = k(obj);
        if (o7Var.x0() == null) {
            o7Var.L0(Arrays.asList("{{ default }}", zK ? "background-anr" : "foreground-anr"));
        }
    }

    private void z(@NotNull o7 o7Var) {
        y7 y7Var = (y7) n(this.f304401b, io.sentry.cache.w.f305263k, y7.class);
        if (o7Var.y0() == null) {
            o7Var.M0(y7Var);
        }
    }

    @Override // io.sentry.i0
    @Nullable
    public o7 c(@NotNull o7 o7Var, @NotNull io.sentry.n0 n0Var) {
        Object objG = io.sentry.util.n.g(n0Var);
        if (!(objG instanceof io.sentry.hints.c)) {
            this.f304401b.getLogger().c(y7.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return o7Var;
        }
        w(o7Var, objG);
        B(o7Var);
        l(o7Var);
        t(o7Var);
        if (!((io.sentry.hints.c) objG).e()) {
            this.f304401b.getLogger().c(y7.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return o7Var;
        }
        f(o7Var, objG);
        e(o7Var, objG);
        I(o7Var);
        return o7Var;
    }

    @Override // io.sentry.i0
    @NotNull
    public io.sentry.protocol.c0 d(@NotNull io.sentry.protocol.c0 c0Var, @NotNull io.sentry.n0 n0Var) {
        return c0Var;
    }

    @Override // io.sentry.i0
    @Nullable
    public Long getOrder() {
        return 12000L;
    }
}
