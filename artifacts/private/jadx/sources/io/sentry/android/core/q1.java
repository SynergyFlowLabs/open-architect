package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.ILogger;
import io.sentry.g6;
import io.sentry.h5;
import io.sentry.k9;
import io.sentry.m4;
import io.sentry.m7;
import io.sentry.n8;
import io.sentry.o7;
import io.sentry.t5;
import io.sentry.v4;
import io.sentry.x4;
import io.sentry.y7;
import io.sentry.z5;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class q1 {
    public static /* synthetic */ void a(k9.c cVar, boolean z10, AtomicReference atomicReference, n8 n8Var, io.sentry.g1 g1Var) {
        k9 k9VarL = g1Var.L();
        if (k9VarL == null) {
            n8Var.getLogger().c(y7.INFO, "Session is null on updateSession", new Object[0]);
        } else if (k9VarL.w(cVar, null, z10, null)) {
            if (k9VarL.q() == k9.c.Crashed) {
                k9VarL.c();
                g1Var.f0();
            }
            atomicReference.set(k9VarL);
        }
    }

    private static void d(io.sentry.android.core.performance.i iVar, List<Map<String, Object>> list) {
        if (iVar.v()) {
            h5.q().b().getLogger().c(y7.WARNING, "Can not convert not-started TimeSpan to Map for Hybrid SDKs.", new Object[0]);
            return;
        }
        if (iVar.w()) {
            h5.q().b().getLogger().c(y7.WARNING, "Can not convert not-stopped TimeSpan to Map for Hybrid SDKs.", new Object[0]);
            return;
        }
        HashMap map = new HashMap();
        map.put("description", iVar.k());
        map.put("start_timestamp_ms", Long.valueOf(iVar.r()));
        map.put("end_timestamp_ms", Long.valueOf(iVar.o()));
        list.add(map);
    }

    @Nullable
    public static io.sentry.protocol.v e(@NotNull byte[] bArr, boolean z10) {
        h5 h5VarQ = h5.q();
        n8 n8VarB = h5VarQ.b();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                io.sentry.n1 serializer = n8VarB.getSerializer();
                g6 g6VarA = n8VarB.getEnvelopeReader().a(byteArrayInputStream);
                if (g6VarA == null) {
                    byteArrayInputStream.close();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                k9.c cVar = null;
                boolean z11 = false;
                for (m7 m7Var : g6VarA.e()) {
                    arrayList.add(m7Var);
                    o7 o7VarR = m7Var.R(serializer);
                    if (o7VarR != null) {
                        if (o7VarR.H0()) {
                            cVar = k9.c.Crashed;
                        }
                        if (o7VarR.H0() || o7VarR.I0()) {
                            z11 = true;
                        }
                    }
                }
                k9 k9VarL = l(h5VarQ, n8VarB, cVar, z11);
                if (k9VarL != null) {
                    arrayList.add(m7.N(serializer, k9VarL));
                    g(n8VarB, (z10 && h5VarQ.b().getThreadChecker().a()) ? false : true);
                    if (z10) {
                        h5VarQ.u();
                    }
                }
                io.sentry.protocol.v vVarK0 = h5VarQ.k0(new g6(g6VarA.d(), arrayList));
                byteArrayInputStream.close();
                return vVarK0;
            } catch (Throwable th2) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            n8VarB.getLogger().a(y7.ERROR, "Failed to capture envelope", th4);
            return null;
        }
        n8VarB.getLogger().a(y7.ERROR, "Failed to capture envelope", th4);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(@NotNull n8 n8Var) {
        String cacheDirPath = n8Var.getCacheDirPath();
        if (cacheDirPath == null) {
            n8Var.getLogger().c(y7.INFO, "Cache dir is not set, not deleting the current session.", new Object[0]);
        } else if (!n8Var.isEnableAutoSessionTracking()) {
            n8Var.getLogger().c(y7.DEBUG, "Session tracking is disabled, bailing from deleting current session file.", new Object[0]);
        } else {
            if (io.sentry.cache.f.F(cacheDirPath).delete()) {
                return;
            }
            n8Var.getLogger().c(y7.WARNING, "Failed to delete the current session file.", new Object[0]);
        }
    }

    private static void g(@NotNull final n8 n8Var, boolean z10) {
        if (z10) {
            f(n8Var);
            return;
        }
        try {
            n8Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.p1
                @Override // java.lang.Runnable
                public final void run() {
                    q1.f(n8Var);
                }
            });
        } catch (Throwable th2) {
            n8Var.getLogger().a(y7.WARNING, "Submission of deletion of the current session file rejected.", th2);
        }
    }

    public static Map<String, Object> h() {
        io.sentry.android.core.performance.h hVarS = io.sentry.android.core.performance.h.s();
        ArrayList arrayList = new ArrayList();
        d(hVarS.h(), arrayList);
        d(hVarS.p(), arrayList);
        Iterator<io.sentry.android.core.performance.i> it = hVarS.r().iterator();
        while (it.hasNext()) {
            d(it.next(), arrayList);
        }
        for (io.sentry.android.core.performance.c cVar : hVarS.i()) {
            d(cVar.k(), arrayList);
            d(cVar.l(), arrayList);
        }
        HashMap map = new HashMap();
        map.put(io.sentry.protocol.c0.b.f306168d, arrayList);
        map.put("type", hVarS.o().toString().toLowerCase(Locale.ROOT));
        if (hVarS.m().x()) {
            map.put("app_start_timestamp_ms", Long.valueOf(hVarS.m().r()));
        }
        return map;
    }

    @Nullable
    public static io.sentry.g1 i() {
        final AtomicReference atomicReference = new AtomicReference();
        h5.q().T0(x4.COMBINED, new v4() { // from class: io.sentry.android.core.n1
            @Override // io.sentry.v4
            public final void a(io.sentry.g1 g1Var) {
                atomicReference.set(g1Var.m777clone());
            }
        });
        return (io.sentry.g1) atomicReference.get();
    }

    @NotNull
    public static Map<String, Object> j(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions, @Nullable io.sentry.g1 g1Var) {
        HashMap map = new HashMap();
        if (g1Var != null) {
            try {
                ILogger logger = sentryAndroidOptions.getLogger();
                io.sentry.util.x xVar = new io.sentry.util.x(map);
                h1 h1VarI = h1.i(context, sentryAndroidOptions);
                g1Var.q().y(h1VarI.a(true, true));
                g1Var.q().B(h1VarI.j());
                io.sentry.protocol.g0 g0VarG = g1Var.G();
                if (g0VarG == null) {
                    g0VarG = new io.sentry.protocol.g0();
                    g1Var.j(g0VarG);
                }
                if (g0VarG.l() == null) {
                    try {
                        g0VarG.s(m1.a(context));
                    } catch (RuntimeException e10) {
                        logger.a(y7.ERROR, "Could not retrieve installation ID", e10);
                    }
                }
                io.sentry.protocol.a aVarD = g1Var.q().d();
                if (aVarD == null) {
                    aVarD = new io.sentry.protocol.a();
                }
                aVarD.A(a1.i(context));
                io.sentry.android.core.performance.i iVarN = io.sentry.android.core.performance.h.s().n(sentryAndroidOptions);
                if (iVarN.x()) {
                    aVarD.B(io.sentry.p.o(iVarN.q()));
                }
                u0 u0Var = new u0(sentryAndroidOptions.getLogger());
                PackageInfo packageInfoO = a1.o(context, 4096, sentryAndroidOptions.getLogger(), u0Var);
                if (packageInfoO != null) {
                    a1.z(packageInfoO, u0Var, h1VarI, aVarD);
                }
                g1Var.q().w(aVarD);
                xVar.f("user").j(logger, g1Var.G());
                xVar.f("contexts").j(logger, g1Var.q());
                xVar.f("tags").j(logger, g1Var.E());
                xVar.f(com.facebook.bolts.e.f99330c).j(logger, g1Var.getExtras());
                xVar.f(o7.b.f305967h).j(logger, g1Var.Z());
                xVar.f("level").j(logger, g1Var.g());
                xVar.f(z5.b.f307181l).j(logger, g1Var.C());
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().a(y7.ERROR, "Could not serialize scope.", th2);
                return new HashMap();
            }
        }
        return map;
    }

    public static void k(@NotNull String str, @NotNull String str2, @Nullable Double d10, @Nullable Double d11) {
        io.sentry.util.o0.k(t5.R(), m4.a(str, str2, d10, d11));
    }

    @Nullable
    private static k9 l(@NotNull io.sentry.i1 i1Var, @NotNull final n8 n8Var, @Nullable final k9.c cVar, final boolean z10) {
        final AtomicReference atomicReference = new AtomicReference();
        i1Var.v0(new v4() { // from class: io.sentry.android.core.o1
            @Override // io.sentry.v4
            public final void a(io.sentry.g1 g1Var) {
                q1.a(cVar, z10, atomicReference, n8Var, g1Var);
            }
        });
        return (k9) atomicReference.get();
    }
}
