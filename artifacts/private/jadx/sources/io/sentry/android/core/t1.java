package io.sentry.android.core;

import io.sentry.k9;
import io.sentry.v4;
import io.sentry.y7;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class t1 implements s0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f304516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f304517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private TimerTask f304518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.s<Timer> f304519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f304520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final io.sentry.i1 f304521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f304522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f304523h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final io.sentry.transport.p f304524i;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (t1.this.f304522g) {
                t1.this.f304521f.y();
            }
            t1.this.f304521f.b().getReplayController().stop();
            t1.this.f304521f.b().getContinuousProfiler().i(false);
        }
    }

    t1(@NotNull io.sentry.i1 i1Var, long j10, boolean z10, boolean z11) {
        this(i1Var, j10, z10, z11, io.sentry.transport.n.b());
    }

    public static /* synthetic */ void c(t1 t1Var, io.sentry.g1 g1Var) {
        k9 k9VarL;
        if (t1Var.f304516a.get() == 0 && (k9VarL = g1Var.L()) != null && k9VarL.p() != null) {
            t1Var.f304516a.set(k9VarL.p().getTime());
        }
    }

    public static /* synthetic */ Timer d() {
        return new Timer(true);
    }

    private void g(@NotNull String str) {
        if (this.f304523h) {
            io.sentry.f fVar = new io.sentry.f();
            fVar.Y("navigation");
            fVar.U("state", str);
            fVar.T("app.lifecycle");
            fVar.V(y7.INFO);
            this.f304521f.k(fVar);
        }
    }

    private void h() {
        io.sentry.m1 m1VarA = this.f304520e.a();
        try {
            TimerTask timerTask = this.f304518c;
            if (timerTask != null) {
                timerTask.cancel();
                this.f304518c = null;
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

    private void k() {
        io.sentry.m1 m1VarA = this.f304520e.a();
        try {
            h();
            this.f304518c = new a();
            this.f304519d.a().schedule(this.f304518c, this.f304517b);
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

    private void l() {
        h();
        long jA = this.f304524i.a();
        this.f304521f.v0(new v4() { // from class: io.sentry.android.core.s1
            @Override // io.sentry.v4
            public final void a(io.sentry.g1 g1Var) {
                t1.c(this.f304506a, g1Var);
            }
        });
        long j10 = this.f304516a.get();
        if (j10 == 0 || j10 + this.f304517b <= jA) {
            if (this.f304522g) {
                this.f304521f.u();
            }
            this.f304521f.b().getReplayController().start();
        }
        this.f304521f.b().getReplayController().p();
        this.f304516a.set(jA);
    }

    @Override // io.sentry.android.core.s0.a
    public void a() {
        l();
        g(androidx.media3.exoplayer.offline.u.f64564p1);
    }

    @Override // io.sentry.android.core.s0.a
    public void b() {
        this.f304516a.set(this.f304524i.a());
        this.f304521f.b().getReplayController().pause();
        k();
        g("background");
    }

    @lm.n
    @NotNull
    Timer i() {
        return this.f304519d.a();
    }

    @lm.n
    @Nullable
    TimerTask j() {
        return this.f304518c;
    }

    t1(@NotNull io.sentry.i1 i1Var, long j10, boolean z10, boolean z11, @NotNull io.sentry.transport.p pVar) {
        this.f304516a = new AtomicLong(0L);
        this.f304519d = new io.sentry.util.s<>(new io.sentry.util.s.a() { // from class: io.sentry.android.core.r1
            @Override // io.sentry.util.s.a
            public final Object a() {
                return t1.d();
            }
        });
        this.f304520e = new io.sentry.util.a();
        this.f304517b = j10;
        this.f304522g = z10;
        this.f304523h = z11;
        this.f304521f = i1Var;
        this.f304524i = pVar;
    }
}
