package io.sentry;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class n2 implements i0, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n8 f305898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final v8 f305899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final p7 f305900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private volatile q0 f305901d = null;

    public n2(@NotNull n8 n8Var) {
        n8 n8Var2 = (n8) io.sentry.util.y.c(n8Var, "The SentryOptions is required.");
        this.f305898a = n8Var2;
        u8 u8Var = new u8(n8Var2);
        this.f305900c = new p7(u8Var);
        this.f305899b = new v8(u8Var, n8Var2);
    }

    private void E(@NotNull z5 z5Var) {
        if (z5Var.O() == null) {
            z5Var.h0(this.f305898a.getSdkVersion());
        }
    }

    private void H(@NotNull z5 z5Var) {
        if (z5Var.P() == null) {
            z5Var.i0(this.f305898a.getServerName());
        }
        if (this.f305898a.isAttachServerName() && z5Var.P() == null) {
            e();
            if (this.f305901d != null) {
                z5Var.i0(this.f305901d.d());
            }
        }
    }

    private void I(@NotNull z5 z5Var) {
        if (z5Var.R() == null) {
            z5Var.k0(new HashMap(this.f305898a.getTags()));
            return;
        }
        for (Map.Entry<String, String> entry : this.f305898a.getTags().entrySet()) {
            if (!z5Var.R().containsKey(entry.getKey())) {
                z5Var.j0(entry.getKey(), entry.getValue());
            }
        }
    }

    private void N(@NotNull o7 o7Var, @NotNull n0 n0Var) {
        if (o7Var.D0() == null) {
            List<io.sentry.protocol.q> listW0 = o7Var.w0();
            ArrayList arrayList = null;
            if (listW0 != null && !listW0.isEmpty()) {
                for (io.sentry.protocol.q qVar : listW0) {
                    if (qVar.g() != null && qVar.j() != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(qVar.j());
                    }
                }
            }
            if (this.f305898a.isAttachThreads() || io.sentry.util.n.h(n0Var, io.sentry.hints.a.class)) {
                Object objG = io.sentry.util.n.g(n0Var);
                o7Var.R0(this.f305899b.c(arrayList, objG instanceof io.sentry.hints.a ? ((io.sentry.hints.a) objG).c() : false));
            } else if (this.f305898a.isAttachStacktrace() && ((listW0 == null || listW0.isEmpty()) && !g(n0Var))) {
                o7Var.R0(this.f305899b.a());
            }
        }
    }

    private boolean R(@NotNull z5 z5Var, @NotNull n0 n0Var) {
        if (io.sentry.util.n.q(n0Var)) {
            return true;
        }
        this.f305898a.getLogger().c(y7.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", z5Var.I());
        return false;
    }

    private void e() {
        if (this.f305901d == null) {
            this.f305901d = q0.e();
        }
    }

    private boolean g(@NotNull n0 n0Var) {
        return io.sentry.util.n.h(n0Var, io.sentry.hints.e.class);
    }

    private void h(@NotNull z5 z5Var) {
        io.sentry.protocol.g0 g0VarU = z5Var.U();
        if (g0VarU == null) {
            g0VarU = new io.sentry.protocol.g0();
            z5Var.m0(g0VarU);
        }
        if (g0VarU.m() == null && this.f305898a.isSendDefaultPii()) {
            g0VarU.t(y1.f307137a);
        }
    }

    private void j(@NotNull z5 z5Var) {
        y(z5Var);
        q(z5Var);
        H(z5Var);
        o(z5Var);
        E(z5Var);
        I(z5Var);
        h(z5Var);
    }

    private void l(@NotNull z5 z5Var) {
        x(z5Var);
    }

    private void m(@NotNull z5 z5Var) {
        io.sentry.protocol.d dVarC = io.sentry.protocol.d.c(z5Var.F(), this.f305898a);
        if (dVarC != null) {
            z5Var.Y(dVarC);
        }
    }

    private void o(@NotNull z5 z5Var) {
        if (z5Var.G() == null) {
            z5Var.Z(this.f305898a.getDist());
        }
    }

    private void q(@NotNull z5 z5Var) {
        if (z5Var.H() == null) {
            z5Var.a0(this.f305898a.getEnvironment());
        }
    }

    private void r(@NotNull o7 o7Var) {
        Throwable thT = o7Var.T();
        if (thT != null) {
            o7Var.K0(this.f305900c.d(thT));
        }
    }

    private void t(@NotNull o7 o7Var) {
        Map<String, String> mapA = this.f305898a.getModulesLoader().a();
        if (mapA == null) {
            return;
        }
        Map<String, String> mapC0 = o7Var.C0();
        if (mapC0 == null) {
            o7Var.Q0(mapA);
        } else {
            mapC0.putAll(mapA);
        }
    }

    private void x(@NotNull z5 z5Var) {
        if (z5Var.L() == null) {
            z5Var.e0("java");
        }
    }

    private void y(@NotNull z5 z5Var) {
        if (z5Var.M() == null) {
            z5Var.f0(this.f305898a.getRelease());
        }
    }

    @Override // io.sentry.i0
    @NotNull
    public o8 a(@NotNull o8 o8Var, @NotNull n0 n0Var) {
        l(o8Var);
        if (R(o8Var, n0Var)) {
            j(o8Var);
            io.sentry.protocol.p pVarI = this.f305898a.getSessionReplay().i();
            if (pVarI != null) {
                o8Var.h0(pVarI);
            }
        }
        return o8Var;
    }

    @Override // io.sentry.i0
    @Nullable
    public a8 b(@NotNull a8 a8Var) {
        return a8Var;
    }

    @Override // io.sentry.i0
    @NotNull
    public o7 c(@NotNull o7 o7Var, @NotNull n0 n0Var) {
        l(o7Var);
        r(o7Var);
        m(o7Var);
        t(o7Var);
        if (R(o7Var, n0Var)) {
            j(o7Var);
            N(o7Var, n0Var);
        }
        return o7Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f305901d != null) {
            this.f305901d.c();
        }
    }

    @Override // io.sentry.i0
    @NotNull
    public io.sentry.protocol.c0 d(@NotNull io.sentry.protocol.c0 c0Var, @NotNull n0 n0Var) {
        l(c0Var);
        m(c0Var);
        if (R(c0Var, n0Var)) {
            j(c0Var);
        }
        return c0Var;
    }

    @lm.r
    @Nullable
    q0 f() {
        return this.f305901d;
    }

    @Override // io.sentry.i0
    @Nullable
    public Long getOrder() {
        return 0L;
    }

    boolean isClosed() {
        if (this.f305901d != null) {
            return this.f305901d.g();
        }
        return true;
    }

    n2(@NotNull n8 n8Var, @NotNull v8 v8Var, @NotNull p7 p7Var) {
        this.f305898a = (n8) io.sentry.util.y.c(n8Var, "The SentryOptions is required.");
        this.f305899b = (v8) io.sentry.util.y.c(v8Var, "The SentryThreadFactory is required.");
        this.f305900c = (p7) io.sentry.util.y.c(p7Var, "The SentryExceptionFactory is required.");
    }
}
