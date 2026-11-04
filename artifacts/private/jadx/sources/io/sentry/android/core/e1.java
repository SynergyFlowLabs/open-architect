package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import io.sentry.a8;
import io.sentry.b8;
import io.sentry.c3;
import io.sentry.o7;
import io.sentry.o8;
import io.sentry.w5;
import io.sentry.y7;
import io.sentry.z5;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class e1 implements io.sentry.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @lm.n
    final Context f304119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final u0 f304120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final SentryAndroidOptions f304121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Future<h1> f304122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.s<String> f304123e = new io.sentry.util.s<>(new io.sentry.util.s.a() { // from class: io.sentry.android.core.c1
        @Override // io.sentry.util.s.a
        public final Object a() {
            return a1.l(c3.e());
        }
    });

    public e1(@NotNull Context context, @NotNull u0 u0Var, @NotNull final SentryAndroidOptions sentryAndroidOptions) {
        Future<h1> futureSubmit;
        this.f304119a = (Context) io.sentry.util.y.c(a1.g(context), "The application context is required.");
        this.f304120b = (u0) io.sentry.util.y.c(u0Var, "The BuildInfoProvider is required.");
        this.f304121c = (SentryAndroidOptions) io.sentry.util.y.c(sentryAndroidOptions, "The options object is required.");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            futureSubmit = executorServiceNewSingleThreadExecutor.submit(new Callable() { // from class: io.sentry.android.core.d1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return h1.i(this.f304110a.f304119a, sentryAndroidOptions);
                }
            });
        } catch (RejectedExecutionException e10) {
            sentryAndroidOptions.getLogger().a(y7.WARNING, "Device info caching task rejected.", e10);
            futureSubmit = null;
        }
        this.f304122d = futureSubmit;
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    private static void g(@NotNull o7 o7Var) {
        io.sentry.protocol.a0 a0VarI;
        List<io.sentry.protocol.z> listD;
        List<io.sentry.protocol.q> listW0 = o7Var.w0();
        if (listW0 == null || listW0.size() <= 1) {
            return;
        }
        io.sentry.protocol.q qVar = listW0.get(listW0.size() - 1);
        if (!"java.lang".equals(qVar.h()) || (a0VarI = qVar.i()) == null || (listD = a0VarI.d()) == null) {
            return;
        }
        Iterator<io.sentry.protocol.z> it = listD.iterator();
        while (it.hasNext()) {
            if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(it.next().G())) {
                Collections.reverse(listW0);
                return;
            }
        }
    }

    private void i(@NotNull z5 z5Var) {
        String str;
        io.sentry.protocol.l lVarI = z5Var.E().i();
        Future<h1> future = this.f304122d;
        if (future != null) {
            try {
                z5Var.E().B(future.get().j());
            } catch (Throwable th2) {
                this.f304121c.getLogger().a(y7.ERROR, "Failed to retrieve os system", th2);
            }
        } else {
            this.f304121c.getLogger().c(y7.ERROR, "Failed to retrieve device info", new Object[0]);
        }
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

    private void j(@NotNull z5 z5Var) {
        io.sentry.protocol.g0 g0VarU = z5Var.U();
        if (g0VarU == null) {
            g0VarU = new io.sentry.protocol.g0();
            z5Var.m0(g0VarU);
        }
        if (g0VarU.l() == null) {
            g0VarU.s(m1.a(this.f304119a));
        }
        if (g0VarU.m() == null && this.f304121c.isSendDefaultPii()) {
            g0VarU.t(io.sentry.y1.f307137a);
        }
    }

    private void k(@NotNull z5 z5Var, @NotNull io.sentry.n0 n0Var) {
        io.sentry.protocol.a aVarD = z5Var.E().d();
        if (aVarD == null) {
            aVarD = new io.sentry.protocol.a();
        }
        l(aVarD, n0Var);
        r(z5Var, aVarD);
        z5Var.E().w(aVarD);
    }

    private void l(@NotNull io.sentry.protocol.a aVar, @NotNull io.sentry.n0 n0Var) {
        Boolean boolJ;
        aVar.A(a1.i(this.f304119a));
        io.sentry.android.core.performance.i iVarN = io.sentry.android.core.performance.h.s().n(this.f304121c);
        if (iVarN.x()) {
            aVar.B(io.sentry.p.o(iVarN.q()));
        }
        if (!io.sentry.util.n.i(n0Var) && aVar.s() == null && (boolJ = s0.g().j()) != null) {
            aVar.F(Boolean.valueOf(!boolJ.booleanValue()));
        }
    }

    private void m(@NotNull z5 z5Var, boolean z10, boolean z11) {
        j(z5Var);
        n(z5Var, z10, z11);
        s(z5Var);
    }

    private void n(@NotNull z5 z5Var, boolean z10, boolean z11) {
        if (z5Var.E().f() == null) {
            if (this.f304122d != null) {
                try {
                    z5Var.E().y(this.f304122d.get().a(z10, z11));
                } catch (Throwable th2) {
                    this.f304121c.getLogger().a(y7.ERROR, "Failed to retrieve device info", th2);
                }
            } else {
                this.f304121c.getLogger().c(y7.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            i(z5Var);
        }
    }

    private void o(@NotNull a8 a8Var) {
        try {
            w5 w5Var = w5.STRING;
            a8Var.f("device.brand", new b8(w5Var, Build.BRAND));
            a8Var.f("device.model", new b8(w5Var, Build.MODEL));
            a8Var.f("device.family", new b8(w5Var, this.f304123e.a()));
        } catch (Throwable th2) {
            this.f304121c.getLogger().a(y7.ERROR, "Failed to retrieve device info", th2);
        }
    }

    private void p(@NotNull z5 z5Var, @NotNull String str) {
        if (z5Var.G() == null) {
            z5Var.Z(str);
        }
    }

    private void q(@NotNull a8 a8Var) {
        try {
            w5 w5Var = w5.STRING;
            a8Var.f("os.name", new b8(w5Var, "Android"));
            a8Var.f("os.version", new b8(w5Var, Build.VERSION.RELEASE));
        } catch (Throwable th2) {
            this.f304121c.getLogger().a(y7.ERROR, "Failed to retrieve os system", th2);
        }
    }

    private void r(@NotNull z5 z5Var, @NotNull io.sentry.protocol.a aVar) {
        h1 h1Var;
        PackageInfo packageInfoO = a1.o(this.f304119a, 4096, this.f304121c.getLogger(), this.f304120b);
        if (packageInfoO != null) {
            p(z5Var, a1.q(packageInfoO, this.f304120b));
            Future<h1> future = this.f304122d;
            if (future != null) {
                try {
                    h1Var = future.get();
                } catch (Throwable th2) {
                    this.f304121c.getLogger().a(y7.ERROR, "Failed to retrieve device info", th2);
                    h1Var = null;
                }
                a1.z(packageInfoO, this.f304120b, h1Var, aVar);
            }
            this.f304121c.getLogger().c(y7.ERROR, "Failed to retrieve device info", new Object[0]);
            h1Var = null;
            a1.z(packageInfoO, this.f304120b, h1Var, aVar);
        }
    }

    private void s(@NotNull z5 z5Var) {
        Future<h1> future = this.f304122d;
        if (future == null) {
            this.f304121c.getLogger().c(y7.ERROR, "Failed to retrieve device info", new Object[0]);
            return;
        }
        try {
            a1.a aVarL = future.get().l();
            if (aVarL != null) {
                for (Map.Entry<String, String> entry : aVarL.a().entrySet()) {
                    z5Var.j0(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th2) {
            this.f304121c.getLogger().a(y7.ERROR, "Error getting side loaded info.", th2);
        }
    }

    private void t(@NotNull o7 o7Var, @NotNull io.sentry.n0 n0Var) {
        if (o7Var.D0() != null) {
            boolean zI = io.sentry.util.n.i(n0Var);
            for (io.sentry.protocol.b0 b0Var : o7Var.D0()) {
                boolean zE = io.sentry.android.core.internal.util.h.h().e(b0Var);
                if (b0Var.r() == null) {
                    b0Var.v(Boolean.valueOf(zE));
                }
                if (!zI && b0Var.t() == null) {
                    b0Var.z(Boolean.valueOf(zE));
                }
            }
        }
    }

    private boolean u(@NotNull z5 z5Var, @NotNull io.sentry.n0 n0Var) {
        if (io.sentry.util.n.q(n0Var)) {
            return true;
        }
        this.f304121c.getLogger().c(y7.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", z5Var.I());
        return false;
    }

    @Override // io.sentry.i0
    @NotNull
    public o8 a(@NotNull o8 o8Var, @NotNull io.sentry.n0 n0Var) {
        boolean zU = u(o8Var, n0Var);
        if (zU) {
            k(o8Var, n0Var);
        }
        m(o8Var, false, zU);
        return o8Var;
    }

    @Override // io.sentry.i0
    @Nullable
    public a8 b(@NotNull a8 a8Var) {
        o(a8Var);
        q(a8Var);
        return a8Var;
    }

    @Override // io.sentry.i0
    @NotNull
    public o7 c(@NotNull o7 o7Var, @NotNull io.sentry.n0 n0Var) {
        boolean zU = u(o7Var, n0Var);
        if (zU) {
            k(o7Var, n0Var);
            t(o7Var, n0Var);
        }
        m(o7Var, true, zU);
        g(o7Var);
        return o7Var;
    }

    @Override // io.sentry.i0
    @NotNull
    public io.sentry.protocol.c0 d(@NotNull io.sentry.protocol.c0 c0Var, @NotNull io.sentry.n0 n0Var) {
        boolean zU = u(c0Var, n0Var);
        if (zU) {
            k(c0Var, n0Var);
        }
        m(c0Var, false, zU);
        return c0Var;
    }

    @Override // io.sentry.i0
    @Nullable
    public Long getOrder() {
        return 8000L;
    }

    @NotNull
    public io.sentry.protocol.g0 h(@NotNull Context context) {
        io.sentry.protocol.g0 g0Var = new io.sentry.protocol.g0();
        g0Var.s(m1.a(context));
        return g0Var;
    }
}
