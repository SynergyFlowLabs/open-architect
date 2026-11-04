package io.sentry.android.core.performance;

import android.os.Looper;
import android.os.SystemClock;
import io.sentry.android.core.w;
import io.sentry.e6;
import io.sentry.p1;
import io.sentry.protocol.b0;
import io.sentry.q9;
import io.sentry.w1;
import io.sentry.x9;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f304437f = "activity.load";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f304438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private e6 f304439b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private e6 f304440c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private p1 f304441d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private p1 f304442e = null;

    public b(@NotNull String str) {
        this.f304438a = str;
    }

    @NotNull
    private p1 d(@NotNull p1 p1Var, @NotNull String str, @NotNull e6 e6Var) {
        p1 p1VarI = p1Var.i(f304437f, str, e6Var, w1.SENTRY);
        j(p1VarI);
        return p1VarI;
    }

    private void j(@NotNull p1 p1Var) {
        p1Var.B(q9.f306597j, Long.valueOf(Looper.getMainLooper().getThread().getId()));
        p1Var.B(q9.f306598k, b0.b.f306153h);
        Boolean bool = Boolean.TRUE;
        p1Var.B(q9.f306603p, bool);
        p1Var.B(q9.f306604q, bool);
    }

    public void a() {
        p1 p1Var = this.f304441d;
        if (p1Var != null && !p1Var.isFinished()) {
            this.f304441d.E(x9.CANCELLED);
        }
        this.f304441d = null;
        p1 p1Var2 = this.f304442e;
        if (p1Var2 != null && !p1Var2.isFinished()) {
            this.f304442e.E(x9.CANCELLED);
        }
        this.f304442e = null;
    }

    public void b(@Nullable p1 p1Var) {
        if (this.f304439b == null || p1Var == null) {
            return;
        }
        p1 p1VarD = d(p1Var, this.f304438a + ".onCreate", this.f304439b);
        this.f304441d = p1VarD;
        p1VarD.u();
    }

    public void c(@Nullable p1 p1Var) {
        if (this.f304440c == null || p1Var == null) {
            return;
        }
        p1 p1VarD = d(p1Var, this.f304438a + ".onStart", this.f304440c);
        this.f304442e = p1VarD;
        p1VarD.u();
    }

    @Nullable
    public p1 e() {
        return this.f304441d;
    }

    @Nullable
    public e6 f() {
        return this.f304439b;
    }

    @Nullable
    public p1 g() {
        return this.f304442e;
    }

    @Nullable
    public e6 h() {
        return this.f304440c;
    }

    public void i() {
        p1 p1Var = this.f304441d;
        if (p1Var == null || this.f304442e == null) {
            return;
        }
        e6 e6VarN = p1Var.N();
        e6 e6VarN2 = this.f304442e.N();
        if (e6VarN == null || e6VarN2 == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        e6 e6VarA = w.a();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long millis = timeUnit.toMillis(e6VarA.c(this.f304441d.Q()));
        long millis2 = timeUnit.toMillis(e6VarA.c(e6VarN));
        long millis3 = timeUnit.toMillis(e6VarA.c(this.f304442e.Q()));
        long millis4 = timeUnit.toMillis(e6VarA.c(e6VarN2));
        c cVar = new c();
        cVar.k().M(this.f304441d.getDescription(), timeUnit.toMillis(this.f304441d.Q().k()), jUptimeMillis - millis, jUptimeMillis - millis2);
        cVar.l().M(this.f304442e.getDescription(), timeUnit.toMillis(this.f304442e.Q().k()), jUptimeMillis - millis3, jUptimeMillis - millis4);
        h.s().e(cVar);
    }

    public void k(@NotNull e6 e6Var) {
        this.f304439b = e6Var;
    }

    public void l(@NotNull e6 e6Var) {
        this.f304440c = e6Var;
    }
}
