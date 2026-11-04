package io.sentry;

import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class d9 implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.protocol.v f305337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final o9 f305338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<o9> f305339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final i1 f305340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private String f305341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private c f305342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private volatile TimerTask f305343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private volatile TimerTask f305344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private volatile Timer f305345i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f305346j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f305347k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f305348l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f305349m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private io.sentry.protocol.f0 f305350n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final w1 f305351o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final io.sentry.protocol.c f305352p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private final m f305353q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final ia f305354r;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            d9.this.r0();
        }
    }

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            d9.this.p0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final c f305357c = d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f305358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final x9 f305359b;

        private c(boolean z10, @Nullable x9 x9Var) {
            this.f305358a = z10;
            this.f305359b = x9Var;
        }

        @NotNull
        static c c(@Nullable x9 x9Var) {
            return new c(true, x9Var);
        }

        @NotNull
        private static c d() {
            return new c(false, null);
        }
    }

    public d9(@NotNull ga gaVar, @NotNull i1 i1Var) {
        this(gaVar, i1Var, new ia(), null);
    }

    private void A0(@NotNull d dVar) {
        m1 m1VarA = this.f305347k.a();
        try {
            if (dVar.z()) {
                final AtomicReference atomicReference = new AtomicReference();
                this.f305340d.v0(new v4() { // from class: io.sentry.b9
                    @Override // io.sentry.v4
                    public final void a(g1 g1Var) {
                        atomicReference.set(g1Var.t());
                    }
                });
                dVar.S(m().p(), (io.sentry.protocol.v) atomicReference.get(), this.f305340d.b(), o(), getName(), z());
                dVar.d();
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

    public static /* synthetic */ void S(d9 d9Var, g1 g1Var, r1 r1Var) {
        d9Var.getClass();
        if (r1Var == d9Var) {
            g1Var.J();
        }
    }

    public static /* synthetic */ void T(final d9 d9Var, final g1 g1Var) {
        d9Var.getClass();
        g1Var.h0(new t4.c() { // from class: io.sentry.x8
            @Override // io.sentry.t4.c
            public final void a(r1 r1Var) {
                d9.S(this.f307123a, g1Var, r1Var);
            }
        });
    }

    public static /* synthetic */ void U(d9 d9Var, g1 g1Var) {
        d9Var.getClass();
        g1Var.F(d9Var);
    }

    public static /* synthetic */ void V(d9 d9Var, o9 o9Var) {
        m mVar = d9Var.f305353q;
        if (mVar != null) {
            mVar.a(o9Var);
        }
        c cVar = d9Var.f305342f;
        if (d9Var.f305354r.o() == null) {
            if (cVar.f305358a) {
                d9Var.E(cVar.f305359b);
            }
        } else if (!d9Var.f305354r.t() || d9Var.l0()) {
            d9Var.l();
        }
    }

    public static /* synthetic */ void W(d9 d9Var, s9 s9Var, AtomicReference atomicReference, o9 o9Var) {
        if (s9Var != null) {
            d9Var.getClass();
            s9Var.a(o9Var);
        }
        ha haVarQ = d9Var.f305354r.q();
        if (haVarQ != null) {
            haVarQ.a(d9Var);
        }
        m mVar = d9Var.f305353q;
        if (mVar != null) {
            atomicReference.set(mVar.c(d9Var));
        }
    }

    private void Z() {
        m1 m1VarA = this.f305346j.a();
        try {
            if (this.f305344h != null) {
                this.f305344h.cancel();
                this.f305349m.set(false);
                this.f305344h = null;
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

    private void a0() {
        m1 m1VarA = this.f305346j.a();
        try {
            if (this.f305343g != null) {
                this.f305343g.cancel();
                this.f305348l.set(false);
                this.f305343g = null;
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

    @NotNull
    private p1 b0(@NotNull p9 p9Var, @NotNull w9 w9Var) {
        if (!this.f305338b.isFinished() && this.f305351o.equals(p9Var.e()) && !io.sentry.util.g0.b(this.f305340d.b().getIgnoredSpanOrigins(), w9Var.a())) {
            v9 v9VarH = p9Var.h();
            String strF = p9Var.f();
            String strD = p9Var.d();
            if (this.f305339c.size() >= this.f305340d.b().getMaxSpans()) {
                this.f305340d.b().getLogger().c(y7.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", strF, strD);
                return s3.R();
            }
            io.sentry.util.y.c(v9VarH, "parentSpanId is required");
            io.sentry.util.y.c(strF, "operation is required");
            a0();
            o9 o9Var = new o9(this, this.f305340d, p9Var, w9Var, new s9() { // from class: io.sentry.a9
                @Override // io.sentry.s9
                public final void a(o9 o9Var2) {
                    d9.V(this.f303906a, o9Var2);
                }
            });
            t0(o9Var);
            this.f305339c.add(o9Var);
            m mVar = this.f305353q;
            if (mVar != null) {
                mVar.b(o9Var);
            }
            return o9Var;
        }
        return s3.R();
    }

    @NotNull
    private p1 c0(@NotNull v9 v9Var, @NotNull String str, @Nullable String str2, @NotNull w9 w9Var) {
        p9 p9VarA = m().a(str, v9Var, null);
        p9VarA.r(str2);
        p9VarA.s(w1.SENTRY);
        return b0(p9VarA, w9Var);
    }

    @NotNull
    private p1 d0(@NotNull String str, @Nullable String str2, @Nullable e6 e6Var, @NotNull w1 w1Var, @NotNull w9 w9Var) {
        if (!this.f305338b.isFinished() && this.f305351o.equals(w1Var)) {
            if (this.f305339c.size() < this.f305340d.b().getMaxSpans()) {
                return this.f305338b.I(str, str2, e6Var, w1Var, w9Var);
            }
            this.f305340d.b().getLogger().c(y7.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
            return s3.R();
        }
        return s3.R();
    }

    @NotNull
    private io.sentry.protocol.v i0() {
        return !this.f305338b.m().j().equals(io.sentry.protocol.v.f306474b) ? this.f305338b.m().j() : this.f305340d.b().getContinuousProfiler().m();
    }

    private boolean l0() {
        ListIterator<o9> listIterator = this.f305339c.listIterator();
        while (listIterator.hasNext()) {
            o9 next = listIterator.next();
            if (!next.isFinished() && next.N() == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0() {
        x9 x9VarT = t();
        if (x9VarT == null) {
            x9VarT = x9.DEADLINE_EXCEEDED;
        }
        e(x9VarT, this.f305354r.o() != null, null);
        this.f305349m.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0() {
        x9 x9VarT = t();
        if (x9VarT == null) {
            x9VarT = x9.OK;
        }
        E(x9VarT);
        this.f305348l.set(false);
    }

    private void s0() {
        Long lN = this.f305354r.n();
        if (lN != null) {
            m1 m1VarA = this.f305346j.a();
            try {
                if (this.f305345i != null) {
                    Z();
                    this.f305349m.set(true);
                    this.f305344h = new b();
                    try {
                        this.f305345i.schedule(this.f305344h, lN.longValue());
                    } catch (Throwable th2) {
                        this.f305340d.b().getLogger().a(y7.WARNING, "Failed to schedule finish timer", th2);
                        p0();
                    }
                }
                if (m1VarA != null) {
                    m1VarA.close();
                }
            } catch (Throwable th3) {
                if (m1VarA != null) {
                    try {
                        m1VarA.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
    }

    private void t0(@NotNull p1 p1Var) {
        io.sentry.util.thread.a threadChecker = this.f305340d.b().getThreadChecker();
        io.sentry.protocol.v vVarI0 = i0();
        if (!vVarI0.equals(io.sentry.protocol.v.f306474b) && Boolean.TRUE.equals(p1Var.f())) {
            p1Var.B("profiler_id", vVarI0.toString());
        }
        p1Var.B(q9.f306597j, String.valueOf(threadChecker.c()));
        p1Var.B(q9.f306598k, threadChecker.b());
    }

    @Override // io.sentry.p1
    @Nullable
    public da A() {
        d dVarB;
        if (!this.f305340d.b().isTraceSampling() || (dVarB = m().b()) == null) {
            return null;
        }
        A0(dVarB);
        return dVarB.V();
    }

    @Override // io.sentry.p1
    public void B(@Nullable String str, @Nullable Object obj) {
        if (this.f305338b.isFinished()) {
            this.f305340d.b().getLogger().c(y7.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            this.f305338b.B(str, obj);
        }
    }

    @Override // io.sentry.p1
    public boolean C(@NotNull e6 e6Var) {
        return this.f305338b.C(e6Var);
    }

    @Override // io.sentry.p1
    public void D(@Nullable Throwable th2) {
        if (this.f305338b.isFinished()) {
            this.f305340d.b().getLogger().c(y7.DEBUG, "The transaction is already finished. Throwable cannot be set", new Object[0]);
        } else {
            this.f305338b.D(th2);
        }
    }

    @Override // io.sentry.p1
    public void E(@Nullable x9 x9Var) {
        n(x9Var, null);
    }

    @Override // io.sentry.p1
    @NotNull
    public String E6() {
        return this.f305338b.E6();
    }

    @Override // io.sentry.p1
    @Nullable
    public e F(@Nullable List<String> list) {
        d dVarB;
        if (!this.f305340d.b().isTraceSampling() || (dVarB = m().b()) == null) {
            return null;
        }
        A0(dVarB);
        return e.a(dVarB, list);
    }

    @Override // io.sentry.p1
    public void G(@NotNull String str, @NotNull Number number, @NotNull p2 p2Var) {
        this.f305338b.G(str, number, p2Var);
    }

    @Override // io.sentry.r1
    @Nullable
    public p1 H() {
        ListIterator listIteratorH = io.sentry.util.d.h((CopyOnWriteArrayList) this.f305339c);
        while (listIteratorH.hasPrevious()) {
            o9 o9Var = (o9) listIteratorH.previous();
            if (!o9Var.isFinished()) {
                return o9Var;
            }
        }
        return null;
    }

    @Override // io.sentry.p1
    @NotNull
    public p1 I(@NotNull String str, @Nullable String str2, @Nullable e6 e6Var, @NotNull w1 w1Var, @NotNull w9 w9Var) {
        return d0(str, str2, e6Var, w1Var, w9Var);
    }

    @Override // io.sentry.p1
    @Nullable
    public Object J(@Nullable String str) {
        return this.f305338b.J(str);
    }

    @Override // io.sentry.p1
    @lm.a.c
    public void K(@Nullable String str, @Nullable Object obj) {
        this.f305352p.r(str, obj);
    }

    @Override // io.sentry.r1
    public void L(@NotNull String str) {
        s(str, io.sentry.protocol.f0.CUSTOM);
    }

    @Override // io.sentry.p1
    @NotNull
    public p1 M(@NotNull p9 p9Var, @NotNull w9 w9Var) {
        return b0(p9Var, w9Var);
    }

    @Override // io.sentry.p1
    @Nullable
    public e6 N() {
        return this.f305338b.N();
    }

    @Override // io.sentry.r1
    @NotNull
    public p1 O(@NotNull String str, @Nullable String str2, @Nullable e6 e6Var) {
        return d0(str, str2, e6Var, w1.SENTRY, new w9());
    }

    @Override // io.sentry.p1
    @NotNull
    public p1 P(@NotNull String str, @Nullable String str2) {
        return I(str, str2, null, w1.SENTRY, new w9());
    }

    @Override // io.sentry.p1
    @NotNull
    public e6 Q() {
        return this.f305338b.Q();
    }

    @Override // io.sentry.p1
    public void a(@Nullable String str, @Nullable String str2) {
        if (this.f305338b.isFinished()) {
            this.f305340d.b().getLogger().c(y7.DEBUG, "The transaction is already finished. Tag %s cannot be set", str);
        } else {
            this.f305338b.a(str, str2);
        }
    }

    @Override // io.sentry.p1
    @Nullable
    public Throwable b() {
        return this.f305338b.b();
    }

    @Override // io.sentry.p1
    public void c(@Nullable x9 x9Var) {
        if (this.f305338b.isFinished()) {
            this.f305340d.b().getLogger().c(y7.DEBUG, "The transaction is already finished. Status %s cannot be set", x9Var == null ? AbstractJsonLexerKt.NULL : x9Var.name());
        } else {
            this.f305338b.c(x9Var);
        }
    }

    @Override // io.sentry.p1
    @NotNull
    public w8 d() {
        return this.f305338b.d();
    }

    @Override // io.sentry.r1
    @NotNull
    public void e(@NotNull x9 x9Var, boolean z10, @Nullable n0 n0Var) {
        if (isFinished()) {
            return;
        }
        e6 e6VarA = this.f305340d.b().getDateProvider().a();
        ListIterator listIteratorH = io.sentry.util.d.h((CopyOnWriteArrayList) this.f305339c);
        while (listIteratorH.hasPrevious()) {
            o9 o9Var = (o9) listIteratorH.previous();
            o9Var.a0(null);
            o9Var.n(x9Var, e6VarA);
        }
        r(x9Var, e6VarA, z10, n0Var);
    }

    @NotNull
    public List<o9> e0() {
        return this.f305339c;
    }

    @Override // io.sentry.p1
    @Nullable
    public Boolean f() {
        return this.f305338b.f();
    }

    @Nullable
    public Map<String, Object> f0() {
        return this.f305338b.R();
    }

    @Override // io.sentry.r1
    @Nullable
    public Boolean g() {
        return this.f305338b.g();
    }

    @lm.n
    @Nullable
    TimerTask g0() {
        return this.f305344h;
    }

    @Override // io.sentry.p1
    @Nullable
    public String getDescription() {
        return this.f305338b.getDescription();
    }

    @Override // io.sentry.r1
    @NotNull
    public String getName() {
        return this.f305341e;
    }

    @Override // io.sentry.p1
    @NotNull
    public p1 h(@NotNull String str) {
        return P(str, null);
    }

    @lm.n
    @Nullable
    TimerTask h0() {
        return this.f305343g;
    }

    @Override // io.sentry.p1
    @NotNull
    public p1 i(@NotNull String str, @Nullable String str2, @Nullable e6 e6Var, @NotNull w1 w1Var) {
        return I(str, str2, e6Var, w1Var, new w9());
    }

    @Override // io.sentry.p1
    public boolean isFinished() {
        return this.f305338b.isFinished();
    }

    @Override // io.sentry.r1
    @NotNull
    public List<o9> j() {
        return this.f305339c;
    }

    @NotNull
    o9 j0() {
        return this.f305338b;
    }

    @Override // io.sentry.p1
    @NotNull
    public p1 k(@NotNull String str, @Nullable String str2, @NotNull w9 w9Var) {
        return d0(str, str2, null, w1.SENTRY, w9Var);
    }

    @lm.n
    @Nullable
    Timer k0() {
        return this.f305345i;
    }

    @Override // io.sentry.r1
    public void l() {
        Long lO;
        m1 m1VarA = this.f305346j.a();
        try {
            if (this.f305345i != null && (lO = this.f305354r.o()) != null) {
                a0();
                this.f305348l.set(true);
                this.f305343g = new a();
                try {
                    this.f305345i.schedule(this.f305343g, lO.longValue());
                } catch (Throwable th2) {
                    this.f305340d.b().getLogger().a(y7.WARNING, "Failed to schedule finish timer", th2);
                    r0();
                }
            }
            if (m1VarA != null) {
                m1VarA.close();
            }
        } catch (Throwable th3) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // io.sentry.p1
    @NotNull
    public p9 m() {
        return this.f305338b.m();
    }

    @lm.n
    @NotNull
    AtomicBoolean m0() {
        return this.f305349m;
    }

    @Override // io.sentry.p1
    @lm.a.c
    public void n(@Nullable x9 x9Var, @Nullable e6 e6Var) {
        r(x9Var, e6Var, true, null);
    }

    @Override // io.sentry.p1
    public boolean n0() {
        return false;
    }

    @Override // io.sentry.p1
    @Nullable
    public fa o() {
        return this.f305338b.o();
    }

    @lm.n
    @NotNull
    AtomicBoolean o0() {
        return this.f305348l;
    }

    @Override // io.sentry.p1
    public void p(@NotNull String str) {
        if (this.f305338b.isFinished()) {
            this.f305340d.b().getLogger().c(y7.DEBUG, "The transaction is already finished. Operation %s cannot be set", str);
        } else {
            this.f305338b.p(str);
        }
    }

    @Override // io.sentry.p1
    @lm.a.c
    @NotNull
    public io.sentry.protocol.c q() {
        return this.f305352p;
    }

    @Override // io.sentry.p1
    @lm.a.c
    @NotNull
    public m1 q0() {
        this.f305340d.v0(new v4() { // from class: io.sentry.c9
            @Override // io.sentry.v4
            public final void a(g1 g1Var) {
                d9.U(this.f305169a, g1Var);
            }
        });
        return j3.a();
    }

    @Override // io.sentry.r1
    public void r(@Nullable x9 x9Var, @Nullable e6 e6Var, boolean z10, @Nullable n0 n0Var) {
        e6 e6VarN = this.f305338b.N();
        if (e6Var == null) {
            e6Var = e6VarN;
        }
        if (e6Var == null) {
            e6Var = this.f305340d.b().getDateProvider().a();
        }
        for (o9 o9Var : this.f305339c) {
            if (o9Var.U().d()) {
                o9Var.n(x9Var != null ? x9Var : m().f306044g, e6Var);
            }
        }
        this.f305342f = c.c(x9Var);
        if (this.f305338b.isFinished()) {
            return;
        }
        if (!this.f305354r.t() || l0()) {
            final AtomicReference atomicReference = new AtomicReference();
            final s9 s9VarW = this.f305338b.W();
            this.f305338b.a0(new s9() { // from class: io.sentry.y8
                @Override // io.sentry.s9
                public final void a(o9 o9Var2) {
                    d9.W(this.f307145a, s9VarW, atomicReference, o9Var2);
                }
            });
            this.f305338b.n(this.f305342f.f305359b, e6Var);
            Boolean bool = Boolean.TRUE;
            k4 k4VarB = (bool.equals(f()) && bool.equals(g())) ? this.f305340d.b().getTransactionProfiler().b(this, (List) atomicReference.get(), this.f305340d.b()) : null;
            if (this.f305340d.b().isContinuousProfilingEnabled()) {
                i4 profileLifecycle = this.f305340d.b().getProfileLifecycle();
                i4 i4Var = i4.TRACE;
                if (profileLifecycle == i4Var && this.f305338b.m().j().equals(io.sentry.protocol.v.f306474b)) {
                    this.f305340d.b().getContinuousProfiler().n(i4Var);
                }
            }
            if (atomicReference.get() != null) {
                ((List) atomicReference.get()).clear();
            }
            this.f305340d.v0(new v4() { // from class: io.sentry.z8
                @Override // io.sentry.v4
                public final void a(g1 g1Var) {
                    d9.T(this.f307201a, g1Var);
                }
            });
            io.sentry.protocol.c0 c0Var = new io.sentry.protocol.c0(this);
            if (this.f305345i != null) {
                m1 m1VarA = this.f305346j.a();
                try {
                    if (this.f305345i != null) {
                        a0();
                        Z();
                        this.f305345i.cancel();
                        this.f305345i = null;
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
            if (z10 && this.f305339c.isEmpty() && this.f305354r.o() != null) {
                this.f305340d.b().getLogger().c(y7.DEBUG, "Dropping idle transaction %s because it has no child spans", this.f305341e);
            } else {
                c0Var.t0().putAll(this.f305338b.T());
                this.f305340d.N0(c0Var, A(), n0Var, k4VarB);
            }
        }
    }

    @Override // io.sentry.r1
    @lm.a.c
    public void s(@NotNull String str, @NotNull io.sentry.protocol.f0 f0Var) {
        if (this.f305338b.isFinished()) {
            this.f305340d.b().getLogger().c(y7.DEBUG, "The transaction is already finished. Name %s cannot be set", str);
        } else {
            this.f305341e = str;
            this.f305350n = f0Var;
        }
    }

    @Override // io.sentry.p1
    @Nullable
    public x9 t() {
        return this.f305338b.t();
    }

    @Override // io.sentry.p1
    public void u() {
        E(t());
    }

    @lm.a.c
    public void u0(@NotNull String str, @NotNull Number number) {
        if (this.f305338b.T().containsKey(str)) {
            return;
        }
        y(str, number);
    }

    @Override // io.sentry.p1
    @Nullable
    public String v(@Nullable String str) {
        return this.f305338b.v(str);
    }

    @lm.a.c
    public void v0(@NotNull String str, @NotNull Number number, @NotNull p2 p2Var) {
        if (this.f305338b.T().containsKey(str)) {
            return;
        }
        G(str, number, p2Var);
    }

    @Override // io.sentry.p1
    public void w(@Nullable String str) {
        if (this.f305338b.isFinished()) {
            this.f305340d.b().getLogger().c(y7.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            this.f305338b.w(str);
        }
    }

    @NotNull
    p1 w0(@NotNull v9 v9Var, @NotNull String str, @Nullable String str2) {
        return z0(v9Var, str, str2, new w9());
    }

    @Override // io.sentry.r1
    @NotNull
    public io.sentry.protocol.v x() {
        return this.f305337a;
    }

    @NotNull
    p1 x0(@NotNull v9 v9Var, @NotNull String str, @Nullable String str2, @Nullable e6 e6Var, @NotNull w1 w1Var) {
        p9 p9VarA = m().a(str, v9Var, null);
        p9VarA.r(str2);
        p9VarA.s(w1Var);
        w9 w9Var = new w9();
        w9Var.j(e6Var);
        return b0(p9VarA, w9Var);
    }

    @Override // io.sentry.p1
    public void y(@NotNull String str, @NotNull Number number) {
        this.f305338b.y(str, number);
    }

    @NotNull
    p1 y0(@NotNull v9 v9Var, @NotNull String str, @Nullable String str2, @Nullable e6 e6Var, @NotNull w1 w1Var, @NotNull w9 w9Var) {
        p9 p9VarA = m().a(str, v9Var, null);
        p9VarA.r(str2);
        p9VarA.s(w1Var);
        w9Var.j(e6Var);
        return b0(p9VarA, w9Var);
    }

    @Override // io.sentry.r1
    @NotNull
    public io.sentry.protocol.f0 z() {
        return this.f305350n;
    }

    @NotNull
    p1 z0(@NotNull v9 v9Var, @NotNull String str, @Nullable String str2, @NotNull w9 w9Var) {
        return c0(v9Var, str, str2, w9Var);
    }

    public d9(@NotNull ga gaVar, @NotNull i1 i1Var, @NotNull ia iaVar) {
        this(gaVar, i1Var, iaVar, null);
    }

    d9(@NotNull ga gaVar, @NotNull i1 i1Var, @NotNull ia iaVar, @Nullable m mVar) {
        this.f305337a = new io.sentry.protocol.v();
        this.f305339c = new CopyOnWriteArrayList();
        this.f305342f = c.f305357c;
        this.f305345i = null;
        this.f305346j = new io.sentry.util.a();
        this.f305347k = new io.sentry.util.a();
        this.f305348l = new AtomicBoolean(false);
        this.f305349m = new AtomicBoolean(false);
        io.sentry.protocol.c cVar = new io.sentry.protocol.c();
        this.f305352p = cVar;
        io.sentry.util.y.c(gaVar, "context is required");
        io.sentry.util.y.c(i1Var, "scopes are required");
        o9 o9Var = new o9(gaVar, this, i1Var, iaVar);
        this.f305338b = o9Var;
        this.f305341e = gaVar.C();
        this.f305351o = gaVar.e();
        this.f305340d = i1Var;
        this.f305353q = mVar;
        this.f305350n = gaVar.F();
        this.f305354r = iaVar;
        t0(o9Var);
        io.sentry.protocol.v vVarI0 = i0();
        if (!vVarI0.equals(io.sentry.protocol.v.f306474b) && Boolean.TRUE.equals(f())) {
            cVar.C(new h4(vVarI0));
        }
        if (mVar != null) {
            mVar.d(this);
        }
        if (iaVar.o() == null && iaVar.n() == null) {
            return;
        }
        this.f305345i = new Timer(true);
        s0();
        l();
    }
}
