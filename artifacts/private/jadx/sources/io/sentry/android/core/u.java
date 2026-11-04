package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.e6;
import io.sentry.ea;
import io.sentry.f8;
import io.sentry.g4;
import io.sentry.i3;
import io.sentry.i4;
import io.sentry.n8;
import io.sentry.t5;
import io.sentry.y7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public class u implements io.sentry.v0, io.sentry.transport.a0.b {

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final long f304529p1 = 60000;
    private boolean X;
    private int Y;
    private final io.sentry.util.a Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ILogger f304530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f304531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f304532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.sentry.l1 f304533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final u0 f304534e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.core.internal.util.b0 f304536g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private io.sentry.i1 f304539j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Future<?> f304540k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private io.sentry.m f304541l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private io.sentry.protocol.v f304543n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private io.sentry.protocol.v f304544o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final io.sentry.util.a f304545p0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f304546s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private e6 f304547t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile boolean f304548v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f304549w;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f304535f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private f0 f304537h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f304538i = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final List<g4.a> f304542m = new ArrayList();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f304550a;

        static {
            int[] iArr = new int[i4.values().length];
            f304550a = iArr;
            try {
                iArr[i4.TRACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f304550a[i4.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public u(@NotNull u0 u0Var, @NotNull io.sentry.android.core.internal.util.b0 b0Var, @NotNull ILogger iLogger, @Nullable String str, int i10, @NotNull io.sentry.l1 l1Var) {
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f306474b;
        this.f304543n = vVar;
        this.f304544o = vVar;
        this.f304546s = new AtomicBoolean(false);
        this.f304547t = new f8();
        this.f304548v = true;
        this.f304549w = false;
        this.X = false;
        this.Y = 0;
        this.Z = new io.sentry.util.a();
        this.f304545p0 = new io.sentry.util.a();
        this.f304530a = iLogger;
        this.f304536g = b0Var;
        this.f304534e = u0Var;
        this.f304531b = str;
        this.f304532c = i10;
        this.f304533d = l1Var;
    }

    public static /* synthetic */ void b(u uVar, n8 n8Var, io.sentry.i1 i1Var) {
        if (!uVar.f304546s.get()) {
            ArrayList arrayList = new ArrayList(uVar.f304542m.size());
            io.sentry.m1 m1VarA = uVar.f304545p0.a();
            try {
                Iterator<g4.a> it = uVar.f304542m.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().a(n8Var));
                }
                uVar.f304542m.clear();
                if (m1VarA != null) {
                    m1VarA.close();
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    i1Var.Y0((g4) it2.next());
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
    }

    private void e() {
        if (this.f304535f) {
            return;
        }
        this.f304535f = true;
        String str = this.f304531b;
        if (str == null) {
            this.f304530a.c(y7.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i10 = this.f304532c;
        if (i10 <= 0) {
            this.f304530a.c(y7.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i10));
        } else {
            this.f304537h = new f0(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.f304532c, this.f304536g, null, this.f304530a);
        }
    }

    private void f() {
        io.sentry.i1 i1Var = this.f304539j;
        if ((i1Var == null || i1Var == i3.r()) && t5.R() != i3.r()) {
            this.f304539j = t5.R();
            this.f304541l = t5.R().b().getCompositePerformanceCollector();
            io.sentry.transport.a0 a0VarI0 = this.f304539j.i0();
            if (a0VarI0 != null) {
                a0VarI0.e(this);
            }
        }
    }

    private void g(@NotNull final io.sentry.i1 i1Var, @NotNull final n8 n8Var) {
        try {
            n8Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.t
                @Override // java.lang.Runnable
                public final void run() {
                    u.b(this.f304508a, n8Var, i1Var);
                }
            });
        } catch (Throwable th2) {
            n8Var.getLogger().a(y7.DEBUG, "Failed to send profile chunks.", th2);
        }
    }

    private void h() {
        f();
        if (this.f304534e.d() < 22) {
            return;
        }
        e();
        if (this.f304537h == null) {
            return;
        }
        io.sentry.i1 i1Var = this.f304539j;
        if (i1Var != null) {
            io.sentry.transport.a0 a0VarI0 = i1Var.i0();
            if (a0VarI0 != null && (a0VarI0.j(io.sentry.o.All) || a0VarI0.j(io.sentry.o.ProfileChunkUi))) {
                this.f304530a.c(y7.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
                p(false);
                return;
            } else {
                if (this.f304539j.b().getConnectionStatusProvider().L3() == io.sentry.u0.a.DISCONNECTED) {
                    this.f304530a.c(y7.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
                    p(false);
                    return;
                }
                this.f304547t = this.f304539j.b().getDateProvider().a();
            }
        } else {
            this.f304547t = new f8();
        }
        if (this.f304537h.i() == null) {
            return;
        }
        this.f304538i = true;
        io.sentry.protocol.v vVar = this.f304543n;
        io.sentry.protocol.v vVar2 = io.sentry.protocol.v.f306474b;
        if (vVar.equals(vVar2)) {
            this.f304543n = new io.sentry.protocol.v();
        }
        if (this.f304544o.equals(vVar2)) {
            this.f304544o = new io.sentry.protocol.v();
        }
        io.sentry.m mVar = this.f304541l;
        if (mVar != null) {
            mVar.f(this.f304544o.toString());
        }
        try {
            this.f304540k = this.f304533d.b(new Runnable() { // from class: io.sentry.android.core.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f304497a.p(true);
                }
            }, 60000L);
        } catch (RejectedExecutionException e10) {
            this.f304530a.a(y7.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e10);
            this.f304549w = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(boolean z10) {
        f();
        io.sentry.m1 m1VarA = this.Z.a();
        try {
            Future<?> future = this.f304540k;
            if (future != null) {
                future.cancel(true);
            }
            if (this.f304537h != null && this.f304538i) {
                if (this.f304534e.d() < 22) {
                    if (m1VarA != null) {
                        m1VarA.close();
                        return;
                    }
                    return;
                }
                io.sentry.m mVar = this.f304541l;
                f0.b bVarG = this.f304537h.g(false, mVar != null ? mVar.e(this.f304544o.toString()) : null);
                if (bVarG == null) {
                    this.f304530a.c(y7.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);
                } else {
                    io.sentry.m1 m1VarA2 = this.f304545p0.a();
                    try {
                        this.f304542m.add(new g4.a(this.f304543n, this.f304544o, bVarG.f304149d, bVarG.f304148c, this.f304547t, "android"));
                        if (m1VarA2 != null) {
                            m1VarA2.close();
                        }
                    } catch (Throwable th2) {
                        if (m1VarA2 == null) {
                            throw th2;
                        }
                        try {
                            m1VarA2.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                }
                this.f304538i = false;
                io.sentry.protocol.v vVar = io.sentry.protocol.v.f306474b;
                this.f304544o = vVar;
                io.sentry.i1 i1Var = this.f304539j;
                if (i1Var != null) {
                    g(i1Var, i1Var.b());
                }
                if (!z10 || this.f304549w) {
                    this.f304543n = vVar;
                    this.f304530a.c(y7.DEBUG, "Profile chunk finished.", new Object[0]);
                } else {
                    this.f304530a.c(y7.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);
                    h();
                }
                if (m1VarA != null) {
                    m1VarA.close();
                    return;
                }
                return;
            }
            io.sentry.protocol.v vVar2 = io.sentry.protocol.v.f306474b;
            this.f304543n = vVar2;
            this.f304544o = vVar2;
            if (m1VarA != null) {
                m1VarA.close();
            }
        } catch (Throwable th4) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    @lm.r
    public int c() {
        return this.Y;
    }

    @lm.r
    @Nullable
    Future<?> d() {
        return this.f304540k;
    }

    @Override // io.sentry.v0
    public void i(boolean z10) {
        io.sentry.m1 m1VarA = this.Z.a();
        try {
            this.Y = 0;
            this.f304549w = true;
            if (z10) {
                p(false);
                this.f304546s.set(true);
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

    @Override // io.sentry.v0
    public boolean isRunning() {
        return this.f304538i;
    }

    @Override // io.sentry.v0
    public void j(@NotNull i4 i4Var, @NotNull ea eaVar) {
        io.sentry.m1 m1VarA = this.Z.a();
        try {
            if (this.f304548v) {
                this.X = eaVar.c(io.sentry.util.f0.a().g());
                this.f304548v = false;
            }
            if (!this.X) {
                this.f304530a.c(y7.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);
                if (m1VarA != null) {
                    m1VarA.close();
                    return;
                }
                return;
            }
            int i10 = a.f304550a[i4Var.ordinal()];
            if (i10 == 1) {
                if (this.Y < 0) {
                    this.Y = 0;
                }
                this.Y++;
            } else if (i10 == 2 && isRunning()) {
                this.f304530a.c(y7.DEBUG, "Profiler is already running.", new Object[0]);
                if (m1VarA != null) {
                    m1VarA.close();
                    return;
                }
                return;
            }
            if (!isRunning()) {
                this.f304530a.c(y7.DEBUG, "Started Profiler.", new Object[0]);
                h();
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

    @Override // io.sentry.v0
    public void k() {
        this.f304548v = true;
    }

    @Override // io.sentry.v0
    @NotNull
    public io.sentry.protocol.v l() {
        return this.f304544o;
    }

    @Override // io.sentry.v0
    @NotNull
    public io.sentry.protocol.v m() {
        return this.f304543n;
    }

    @Override // io.sentry.v0
    public void n(@NotNull i4 i4Var) {
        io.sentry.m1 m1VarA = this.Z.a();
        try {
            int i10 = a.f304550a[i4Var.ordinal()];
            if (i10 == 1) {
                int i11 = this.Y - 1;
                this.Y = i11;
                if (i11 <= 0) {
                    if (i11 < 0) {
                        this.Y = 0;
                    }
                    this.f304549w = true;
                } else if (m1VarA != null) {
                    m1VarA.close();
                    return;
                }
            }
            if (i10 == 2) {
                this.f304549w = true;
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

    @Override // io.sentry.transport.a0.b
    public void o(@NotNull io.sentry.transport.a0 a0Var) {
        if (!a0Var.j(io.sentry.o.All) && !a0Var.j(io.sentry.o.ProfileChunkUi)) {
            return;
        }
        this.f304530a.c(y7.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
        p(false);
    }
}
