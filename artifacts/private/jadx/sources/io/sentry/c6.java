package io.sentry;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class c6 implements k1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f305159f = "7";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n8 f305161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.sentry.transport.q f305162c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final io.sentry.logger.b f305164e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final b f305163d = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f305160a = true;

    private static final class b implements Comparator<f> {
        private b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(@NotNull f fVar, @NotNull f fVar2) {
            return fVar.x().compareTo(fVar2.x());
        }
    }

    @lm.a.c
    public c6(@NotNull n8 n8Var) {
        this.f305161b = (n8) io.sentry.util.y.c(n8Var, "SentryOptions is required.");
        t1 transportFactory = n8Var.getTransportFactory();
        if (transportFactory instanceof w3) {
            transportFactory = new io.sentry.a();
            n8Var.setTransportFactory(transportFactory);
        }
        this.f305162c = transportFactory.a(n8Var, new r4(n8Var).a());
        if (n8Var.getLogs().b()) {
            this.f305164e = new io.sentry.logger.e(n8Var, this);
        } else {
            this.f305164e = io.sentry.logger.g.b();
        }
    }

    @NotNull
    private o8 A(@NotNull o8 o8Var, @Nullable g1 g1Var) {
        if (g1Var != null) {
            if (o8Var.N() == null) {
                o8Var.g0(g1Var.getRequest());
            }
            if (o8Var.U() == null) {
                o8Var.m0(g1Var.G());
            }
            if (o8Var.R() == null) {
                o8Var.k0(new HashMap(g1Var.E()));
            } else {
                for (Map.Entry<String, String> entry : g1Var.E().entrySet()) {
                    if (!o8Var.R().containsKey(entry.getKey())) {
                        o8Var.R().put(entry.getKey(), entry.getValue());
                    }
                }
            }
            io.sentry.protocol.c cVarE = o8Var.E();
            for (Map.Entry<String, Object> entry2 : new io.sentry.protocol.c(g1Var.q()).b()) {
                if (!cVarE.a(entry2.getKey())) {
                    cVarE.r(entry2.getKey(), entry2.getValue());
                }
            }
            p1 p1VarE = g1Var.e();
            if (o8Var.E().o() == null) {
                if (p1VarE == null) {
                    o8Var.E().G(ga.B(g1Var.c0()));
                    return o8Var;
                }
                o8Var.E().G(p1VarE.m());
            }
        }
        return o8Var;
    }

    @NotNull
    private g6 B(@NotNull h hVar, @Nullable da daVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m7.G(this.f305161b.getSerializer(), hVar));
        return new g6(new h6(hVar.a(), this.f305161b.getSdkVersion(), daVar), arrayList);
    }

    @Nullable
    private g6 C(@Nullable z5 z5Var, @Nullable List<io.sentry.b> list, @Nullable k9 k9Var, @Nullable da daVar, @Nullable k4 k4Var) throws IOException, io.sentry.exception.c {
        io.sentry.protocol.v vVar;
        ArrayList arrayList = new ArrayList();
        if (z5Var != null) {
            arrayList.add(m7.I(this.f305161b.getSerializer(), z5Var));
            vVar = z5Var.I();
        } else {
            vVar = null;
        }
        if (k9Var != null) {
            arrayList.add(m7.N(this.f305161b.getSerializer(), k9Var));
        }
        if (k4Var != null) {
            arrayList.add(m7.L(k4Var, this.f305161b.getMaxTraceFileSize(), this.f305161b.getSerializer()));
            if (vVar == null) {
                vVar = new io.sentry.protocol.v(k4Var.Q());
            }
        }
        if (list != null) {
            Iterator<io.sentry.b> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m7.F(this.f305161b.getSerializer(), this.f305161b.getLogger(), it.next(), this.f305161b.getMaxAttachmentSize()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new g6(new h6(vVar, this.f305161b.getSdkVersion(), daVar), arrayList);
    }

    @NotNull
    private g6 D(@NotNull c8 c8Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m7.J(this.f305161b.getSerializer(), c8Var));
        return new g6(new h6(null, this.f305161b.getSdkVersion(), null), arrayList);
    }

    @NotNull
    private g6 E(@NotNull o8 o8Var, @Nullable p4 p4Var, @Nullable da daVar, boolean z10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m7.M(this.f305161b.getSerializer(), this.f305161b.getLogger(), o8Var, p4Var, z10));
        return new g6(new h6(o8Var.I(), this.f305161b.getSessionReplay().i(), daVar), arrayList);
    }

    @NotNull
    private g6 F(@NotNull na naVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m7.O(this.f305161b.getSerializer(), naVar));
        return new g6(new h6(naVar.c(), this.f305161b.getSdkVersion()), arrayList);
    }

    @Nullable
    private o7 G(@NotNull o7 o7Var, @NotNull n0 n0Var) {
        n8.d beforeSend = this.f305161b.getBeforeSend();
        if (beforeSend == null) {
            return o7Var;
        }
        try {
            return beforeSend.a(o7Var, n0Var);
        } catch (Throwable th2) {
            this.f305161b.getLogger().a(y7.ERROR, "The BeforeSend callback threw an exception. It will be added as breadcrumb and continue.", th2);
            return null;
        }
    }

    @Nullable
    private o7 H(@NotNull o7 o7Var, @NotNull n0 n0Var) {
        n8.d beforeSendFeedback = this.f305161b.getBeforeSendFeedback();
        if (beforeSendFeedback == null) {
            return o7Var;
        }
        try {
            return beforeSendFeedback.a(o7Var, n0Var);
        } catch (Throwable th2) {
            this.f305161b.getLogger().a(y7.ERROR, "The BeforeSendFeedback callback threw an exception.", th2);
            return null;
        }
    }

    @Nullable
    private a8 I(@NotNull a8 a8Var) {
        n8.i.a aVarA = this.f305161b.getLogs().a();
        if (aVarA == null) {
            return a8Var;
        }
        try {
            return aVarA.a(a8Var);
        } catch (Throwable th2) {
            this.f305161b.getLogger().a(y7.ERROR, "The BeforeSendLog callback threw an exception. Dropping log event.", th2);
            return null;
        }
    }

    @Nullable
    private o8 J(@NotNull o8 o8Var, @NotNull n0 n0Var) {
        n8.e beforeSendReplay = this.f305161b.getBeforeSendReplay();
        if (beforeSendReplay == null) {
            return o8Var;
        }
        try {
            return beforeSendReplay.a(o8Var, n0Var);
        } catch (Throwable th2) {
            this.f305161b.getLogger().a(y7.ERROR, "The BeforeSendReplay callback threw an exception. It will be added as breadcrumb and continue.", th2);
            return null;
        }
    }

    @Nullable
    private io.sentry.protocol.c0 K(@NotNull io.sentry.protocol.c0 c0Var, @NotNull n0 n0Var) {
        n8.f beforeSendTransaction = this.f305161b.getBeforeSendTransaction();
        if (beforeSendTransaction == null) {
            return c0Var;
        }
        try {
            return beforeSendTransaction.a(c0Var, n0Var);
        } catch (Throwable th2) {
            this.f305161b.getLogger().a(y7.ERROR, "The BeforeSendTransaction callback threw an exception. It will be added as breadcrumb and continue.", th2);
            return null;
        }
    }

    @Nullable
    private List<io.sentry.b> M(@Nullable List<io.sentry.b> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (io.sentry.b bVar : list) {
            if (bVar.l()) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private void N(@NotNull g1 g1Var, @NotNull n0 n0Var) {
        r1 r1VarP = g1Var.p();
        if (r1VarP != null && io.sentry.util.n.h(n0Var, io.sentry.hints.q.class)) {
            Object objG = io.sentry.util.n.g(n0Var);
            if (objG instanceof io.sentry.hints.f) {
                ((io.sentry.hints.f) objG).g(r1VarP.x());
                r1VarP.e(x9.ABORTED, false, n0Var);
                return;
            }
            r1VarP.e(x9.ABORTED, false, null);
        }
    }

    @Nullable
    private List<io.sentry.b> O(@NotNull n0 n0Var) {
        List<io.sentry.b> listG = n0Var.g();
        io.sentry.b bVarI = n0Var.i();
        if (bVarI != null) {
            listG.add(bVarI);
        }
        io.sentry.b bVarK = n0Var.k();
        if (bVarK != null) {
            listG.add(bVarK);
        }
        io.sentry.b bVarJ = n0Var.j();
        if (bVarJ != null) {
            listG.add(bVarJ);
        }
        return listG;
    }

    @Nullable
    private da P(@Nullable g1 g1Var, @NotNull n0 n0Var, @Nullable z5 z5Var, @Nullable String str) {
        if (io.sentry.util.n.h(n0Var, io.sentry.hints.c.class)) {
            if (z5Var != null) {
                return d.e(z5Var, str, this.f305161b).V();
            }
        } else if (g1Var != null) {
            r1 r1VarP = g1Var.p();
            return r1VarP != null ? r1VarP.A() : io.sentry.util.o0.j(g1Var, this.f305161b).p();
        }
        return null;
    }

    @Nullable
    private da Q(@Nullable g1 g1Var, @NotNull n0 n0Var, @Nullable o7 o7Var) {
        return P(g1Var, n0Var, o7Var, o7Var != null ? o7Var.F0() : null);
    }

    @Nullable
    private o7 R(@NotNull o7 o7Var, @NotNull n0 n0Var, @NotNull List<i0> list) {
        for (i0 i0Var : list) {
            try {
                boolean z10 = i0Var instanceof c;
                boolean zH = io.sentry.util.n.h(n0Var, io.sentry.hints.c.class);
                if (zH && z10) {
                    o7Var = i0Var.c(o7Var, n0Var);
                } else if (!zH && !z10) {
                    o7Var = i0Var.c(o7Var, n0Var);
                }
            } catch (Throwable th2) {
                this.f305161b.getLogger().b(y7.ERROR, th2, "An exception occurred while processing event by processor: %s", i0Var.getClass().getName());
            }
            if (o7Var == null) {
                this.f305161b.getLogger().c(y7.DEBUG, "Event was dropped by a processor: %s", i0Var.getClass().getName());
                this.f305161b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, o.Error);
                break;
            }
        }
        return o7Var;
    }

    @Nullable
    private o7 S(@NotNull o7 o7Var, @NotNull n0 n0Var, @NotNull List<i0> list) {
        for (i0 i0Var : list) {
            try {
                o7Var = i0Var.c(o7Var, n0Var);
            } catch (Throwable th2) {
                this.f305161b.getLogger().b(y7.ERROR, th2, "An exception occurred while processing feedback event by processor: %s", i0Var.getClass().getName());
            }
            if (o7Var == null) {
                this.f305161b.getLogger().c(y7.DEBUG, "Feedback event was dropped by a processor: %s", i0Var.getClass().getName());
                this.f305161b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, o.Feedback);
                break;
            }
        }
        return o7Var;
    }

    @Nullable
    private a8 T(@NotNull a8 a8Var, @NotNull List<i0> list) {
        for (i0 i0Var : list) {
            try {
                a8Var = i0Var.b(a8Var);
            } catch (Throwable th2) {
                this.f305161b.getLogger().b(y7.ERROR, th2, "An exception occurred while processing log event by processor: %s", i0Var.getClass().getName());
            }
            if (a8Var == null) {
                this.f305161b.getLogger().c(y7.DEBUG, "Log event was dropped by a processor: %s", i0Var.getClass().getName());
                this.f305161b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, o.LogItem);
                break;
            }
        }
        return a8Var;
    }

    @Nullable
    private o8 U(@NotNull o8 o8Var, @NotNull n0 n0Var, @NotNull List<i0> list) {
        for (i0 i0Var : list) {
            try {
                o8Var = i0Var.a(o8Var, n0Var);
            } catch (Throwable th2) {
                this.f305161b.getLogger().b(y7.ERROR, th2, "An exception occurred while processing replay event by processor: %s", i0Var.getClass().getName());
            }
            if (o8Var == null) {
                this.f305161b.getLogger().c(y7.DEBUG, "Replay event was dropped by a processor: %s", i0Var.getClass().getName());
                this.f305161b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, o.Replay);
                break;
            }
        }
        return o8Var;
    }

    @Nullable
    private io.sentry.protocol.c0 V(@NotNull io.sentry.protocol.c0 c0Var, @NotNull n0 n0Var, @NotNull List<i0> list) {
        for (i0 i0Var : list) {
            int size = c0Var.v0().size();
            try {
                c0Var = i0Var.d(c0Var, n0Var);
            } catch (Throwable th2) {
                this.f305161b.getLogger().b(y7.ERROR, th2, "An exception occurred while processing transaction by processor: %s", i0Var.getClass().getName());
            }
            int size2 = c0Var == null ? 0 : c0Var.v0().size();
            if (c0Var == null) {
                this.f305161b.getLogger().c(y7.DEBUG, "Transaction was dropped by a processor: %s", i0Var.getClass().getName());
                io.sentry.clientreport.h clientReportRecorder = this.f305161b.getClientReportRecorder();
                io.sentry.clientreport.f fVar = io.sentry.clientreport.f.EVENT_PROCESSOR;
                clientReportRecorder.a(fVar, o.Transaction);
                this.f305161b.getClientReportRecorder().b(fVar, o.Span, size + 1);
                break;
            }
            if (size2 < size) {
                int i10 = size - size2;
                this.f305161b.getLogger().c(y7.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i10), i0Var.getClass().getName());
                this.f305161b.getClientReportRecorder().b(io.sentry.clientreport.f.EVENT_PROCESSOR, o.Span, i10);
            }
        }
        return c0Var;
    }

    private boolean W() {
        io.sentry.util.c0 c0VarA = this.f305161b.getSampleRate() == null ? null : io.sentry.util.f0.a();
        return this.f305161b.getSampleRate() == null || c0VarA == null || this.f305161b.getSampleRate().doubleValue() >= c0VarA.g();
    }

    @NotNull
    private io.sentry.protocol.v X(@NotNull g6 g6Var, @Nullable n0 n0Var) throws IOException {
        n8.c beforeEnvelopeCallback = this.f305161b.getBeforeEnvelopeCallback();
        if (beforeEnvelopeCallback != null) {
            try {
                beforeEnvelopeCallback.a(g6Var, n0Var);
            } catch (Throwable th2) {
                this.f305161b.getLogger().a(y7.ERROR, "The BeforeEnvelope callback threw an exception.", th2);
            }
        }
        w7.e().c(this.f305161b.getLogger());
        if (n0Var == null) {
            this.f305162c.oe(g6Var);
        } else {
            this.f305162c.H2(g6Var, n0Var);
        }
        io.sentry.protocol.v vVarA = g6Var.d().a();
        return vVarA != null ? vVarA : io.sentry.protocol.v.f306474b;
    }

    private boolean Y(@NotNull h hVar, @NotNull n0 n0Var) {
        if (io.sentry.util.n.q(n0Var)) {
            return true;
        }
        this.f305161b.getLogger().c(y7.DEBUG, "Check-in was cached so not applying scope: %s", hVar.a());
        return false;
    }

    private boolean Z(@NotNull z5 z5Var, @NotNull n0 n0Var) {
        if (io.sentry.util.n.q(n0Var)) {
            return true;
        }
        this.f305161b.getLogger().c(y7.DEBUG, "Event was cached so not applying scope: %s", z5Var.I());
        return false;
    }

    private boolean a0(@Nullable k9 k9Var, @Nullable k9 k9Var2) {
        if (k9Var2 == null) {
            return false;
        }
        if (k9Var == null) {
            return true;
        }
        k9.c cVarQ = k9Var2.q();
        k9.c cVar = k9.c.Crashed;
        if (cVarQ != cVar || k9Var.q() == cVar) {
            return k9Var2.e() > 0 && k9Var.e() <= 0;
        }
        return true;
    }

    private void b0(@NotNull z5 z5Var, @NotNull Collection<f> collection) {
        List<f> listD = z5Var.D();
        if (listD == null || collection.isEmpty()) {
            return;
        }
        listD.addAll(collection);
        Collections.sort(listD, this.f305163d);
    }

    public static /* synthetic */ void s(k9 k9Var) {
    }

    public static /* synthetic */ void t(c6 c6Var, o7 o7Var, n0 n0Var, k9 k9Var) {
        if (k9Var == null) {
            c6Var.f305161b.getLogger().c(y7.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        c6Var.getClass();
        String strD = null;
        k9.c cVar = o7Var.H0() ? k9.c.Crashed : null;
        boolean z10 = k9.c.Crashed == cVar || o7Var.I0();
        String str = (o7Var.N() == null || o7Var.N().r() == null || !o7Var.N().r().containsKey("user-agent")) ? null : o7Var.N().r().get("user-agent");
        Object objG = io.sentry.util.n.g(n0Var);
        if (objG instanceof io.sentry.hints.a) {
            strD = ((io.sentry.hints.a) objG).d();
            cVar = k9.c.Abnormal;
        }
        if (k9Var.w(cVar, str, z10, strD) && k9Var.t()) {
            k9Var.c();
        }
    }

    private void u(@Nullable g1 g1Var, @NotNull n0 n0Var) {
        if (g1Var != null) {
            n0Var.b(g1Var.e0());
        }
    }

    @Nullable
    private o7 v(@NotNull o7 o7Var, @NotNull g1 g1Var, @NotNull n0 n0Var) {
        if (o7Var.U() == null) {
            o7Var.m0(g1Var.G());
        }
        if (o7Var.R() == null) {
            o7Var.k0(new HashMap(g1Var.E()));
        } else {
            for (Map.Entry<String, String> entry : g1Var.E().entrySet()) {
                if (!o7Var.R().containsKey(entry.getKey())) {
                    o7Var.R().put(entry.getKey(), entry.getValue());
                }
            }
        }
        io.sentry.protocol.c cVarE = o7Var.E();
        for (Map.Entry<String, Object> entry2 : new io.sentry.protocol.c(g1Var.q()).b()) {
            if (!cVarE.a(entry2.getKey())) {
                cVarE.r(entry2.getKey(), entry2.getValue());
            }
        }
        p1 p1VarE = g1Var.e();
        if (o7Var.E().o() == null) {
            if (p1VarE == null) {
                o7Var.E().G(ga.B(g1Var.c0()));
            } else {
                o7Var.E().G(p1VarE.m());
            }
        }
        return S(o7Var, n0Var, g1Var.R());
    }

    @NotNull
    private h x(@NotNull h hVar, @Nullable g1 g1Var) {
        if (g1Var != null) {
            p1 p1VarE = g1Var.e();
            if (hVar.b().a() == null) {
                if (p1VarE == null) {
                    hVar.b().b(ga.B(g1Var.c0()));
                    return hVar;
                }
                hVar.b().b(p1VarE.m());
            }
        }
        return hVar;
    }

    @NotNull
    private <T extends z5> T y(@NotNull T t10, @Nullable g1 g1Var) {
        if (g1Var != null) {
            if (t10.N() == null) {
                t10.g0(g1Var.getRequest());
            }
            if (t10.U() == null) {
                t10.m0(g1Var.G());
            }
            if (t10.R() == null) {
                t10.k0(new HashMap(g1Var.E()));
            } else {
                for (Map.Entry<String, String> entry : g1Var.E().entrySet()) {
                    if (!t10.R().containsKey(entry.getKey())) {
                        t10.R().put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (t10.D() == null) {
                t10.X(new ArrayList(g1Var.C()));
            } else {
                b0(t10, g1Var.C());
            }
            if (t10.K() == null) {
                t10.d0(new HashMap(g1Var.getExtras()));
            } else {
                for (Map.Entry<String, Object> entry2 : g1Var.getExtras().entrySet()) {
                    if (!t10.K().containsKey(entry2.getKey())) {
                        t10.K().put(entry2.getKey(), entry2.getValue());
                    }
                }
            }
            io.sentry.protocol.c cVarE = t10.E();
            for (Map.Entry<String, Object> entry3 : new io.sentry.protocol.c(g1Var.q()).b()) {
                if (!cVarE.a(entry3.getKey())) {
                    cVarE.r(entry3.getKey(), entry3.getValue());
                }
            }
        }
        return t10;
    }

    @Nullable
    private o7 z(@NotNull o7 o7Var, @Nullable g1 g1Var, @NotNull n0 n0Var) {
        if (g1Var == null) {
            return o7Var;
        }
        y(o7Var, g1Var);
        if (o7Var.F0() == null) {
            o7Var.T0(g1Var.a0());
        }
        if (o7Var.x0() == null) {
            o7Var.L0(g1Var.Z());
        }
        if (g1Var.g() != null) {
            o7Var.M0(g1Var.g());
        }
        p1 p1VarE = g1Var.e();
        if (o7Var.E().o() == null) {
            if (p1VarE == null) {
                o7Var.E().G(ga.B(g1Var.c0()));
            } else {
                o7Var.E().G(p1VarE.m());
            }
        }
        return R(o7Var, n0Var, g1Var.R());
    }

    @Override // io.sentry.k1
    public boolean L() {
        return this.f305162c.L();
    }

    @Override // io.sentry.k1
    @NotNull
    public io.sentry.protocol.v c(@NotNull io.sentry.protocol.f fVar, @Nullable n0 n0Var, @NotNull g1 g1Var) {
        c6 c6Var;
        o7 o7Var = new o7();
        o7Var.E().z(fVar);
        if (n0Var == null) {
            n0Var = new n0();
        }
        if (fVar.l() == null) {
            fVar.r(g1Var.Y());
        }
        ILogger logger = this.f305161b.getLogger();
        y7 y7Var = y7.DEBUG;
        logger.c(y7Var, "Capturing feedback: %s", o7Var.I());
        if (Z(o7Var, n0Var) && (o7Var = v(o7Var, g1Var, n0Var)) == null) {
            this.f305161b.getLogger().c(y7Var, "Feedback was dropped by applyScope", new Object[0]);
            return io.sentry.protocol.v.f306474b;
        }
        o7 o7VarS = S(o7Var, n0Var, this.f305161b.getEventProcessors());
        if (o7VarS != null && (o7VarS = H(o7VarS, n0Var)) == null) {
            this.f305161b.getLogger().c(y7Var, "Event was dropped by beforeSend", new Object[0]);
            this.f305161b.getClientReportRecorder().a(io.sentry.clientreport.f.BEFORE_SEND, o.Feedback);
        }
        o7 o7Var2 = o7VarS;
        if (o7Var2 == null) {
            return io.sentry.protocol.v.f306474b;
        }
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f306474b;
        io.sentry.protocol.v vVarI = o7Var2.I() != null ? o7Var2.I() : vVar;
        if (fVar.k() == null) {
            this.f305161b.getReplayController().l(Boolean.FALSE);
            io.sentry.protocol.v vVarT = g1Var.t();
            if (!vVarT.equals(vVar)) {
                fVar.q(vVarT);
            }
        }
        try {
            c6Var = this;
            try {
                g6 g6VarC = c6Var.C(o7Var2, O(n0Var), null, Q(g1Var, n0Var, o7Var2), null);
                n0Var.c();
                return g6VarC != null ? c6Var.X(g6VarC, n0Var) : vVarI;
            } catch (io.sentry.exception.c | IOException e10) {
                e = e10;
                c6Var.f305161b.getLogger().b(y7.WARNING, e, "Capturing feedback %s failed.", vVarI);
                return io.sentry.protocol.v.f306474b;
            }
        } catch (io.sentry.exception.c | IOException e11) {
            e = e11;
            c6Var = this;
        }
    }

    @lm.n
    @Nullable
    k9 c0(@NotNull final o7 o7Var, @NotNull final n0 n0Var, @Nullable g1 g1Var) {
        if (io.sentry.util.n.q(n0Var)) {
            if (g1Var != null) {
                return g1Var.D(new t4.b() { // from class: io.sentry.b6
                    @Override // io.sentry.t4.b
                    public final void a(k9 k9Var) {
                        c6.t(this.f305130a, o7Var, n0Var, k9Var);
                    }
                });
            }
            this.f305161b.getLogger().c(y7.INFO, "Scope is null on client.captureEvent", new Object[0]);
        }
        return null;
    }

    @Override // io.sentry.k1
    public void close() {
        i(false);
    }

    @Override // io.sentry.k1
    @lm.a.c
    @NotNull
    public io.sentry.protocol.v e(@NotNull g4 g4Var, @Nullable g1 g1Var) {
        io.sentry.util.y.c(g4Var, "profileChunk is required.");
        this.f305161b.getLogger().c(y7.DEBUG, "Capturing profile chunk: %s", g4Var.n());
        io.sentry.protocol.v vVarN = g4Var.n();
        io.sentry.protocol.d dVarC = io.sentry.protocol.d.c(g4Var.p(), this.f305161b);
        if (dVarC != null) {
            g4Var.A(dVarC);
        }
        try {
            return X(new g6(new h6(vVarN, this.f305161b.getSdkVersion(), null), Collections.singletonList(m7.K(g4Var, this.f305161b.getSerializer()))), null);
        } catch (io.sentry.exception.c | IOException e10) {
            this.f305161b.getLogger().b(y7.WARNING, e10, "Capturing profile chunk %s failed.", vVarN);
            return io.sentry.protocol.v.f306474b;
        }
    }

    @Override // io.sentry.k1
    @NotNull
    public io.sentry.protocol.v f(@NotNull o8 o8Var, @Nullable g1 g1Var, @Nullable n0 n0Var) {
        io.sentry.util.y.c(o8Var, "SessionReplay is required.");
        if (n0Var == null) {
            n0Var = new n0();
        }
        if (Z(o8Var, n0Var)) {
            A(o8Var, g1Var);
        }
        ILogger logger = this.f305161b.getLogger();
        y7 y7Var = y7.DEBUG;
        logger.c(y7Var, "Capturing session replay: %s", o8Var.I());
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f306474b;
        io.sentry.protocol.v vVarI = o8Var.I() != null ? o8Var.I() : vVar;
        o8 o8VarU = U(o8Var, n0Var, this.f305161b.getEventProcessors());
        if (o8VarU != null && (o8VarU = J(o8VarU, n0Var)) == null) {
            this.f305161b.getLogger().c(y7Var, "Event was dropped by beforeSendReplay", new Object[0]);
            this.f305161b.getClientReportRecorder().a(io.sentry.clientreport.f.BEFORE_SEND, o.Replay);
        }
        if (o8VarU == null) {
            return vVar;
        }
        try {
            g6 g6VarE = E(o8VarU, n0Var.h(), P(g1Var, n0Var, o8VarU, null), io.sentry.util.n.h(n0Var, io.sentry.hints.c.class));
            n0Var.c();
            this.f305162c.H2(g6VarE, n0Var);
            return vVarI;
        } catch (IOException e10) {
            this.f305161b.getLogger().b(y7.WARNING, e10, "Capturing event %s failed.", vVarI);
            return io.sentry.protocol.v.f306474b;
        }
    }

    @Override // io.sentry.k1
    @lm.a.b
    public void g(@Nullable a8 a8Var, @Nullable g1 g1Var) {
        if ((a8Var == null || g1Var == null || (a8Var = T(a8Var, g1Var.R())) != null) && ((a8Var == null || (a8Var = T(a8Var, this.f305161b.getEventProcessors())) != null) && a8Var != null)) {
            a8 a8VarI = I(a8Var);
            if (a8VarI == null) {
                this.f305161b.getLogger().c(y7.DEBUG, "Log Event was dropped by beforeSendLog", new Object[0]);
                this.f305161b.getClientReportRecorder().a(io.sentry.clientreport.f.BEFORE_SEND, o.LogItem);
                return;
            }
            this.f305164e.a(a8VarI);
        }
    }

    @Override // io.sentry.k1
    public void i(boolean z10) {
        long shutdownTimeoutMillis;
        this.f305161b.getLogger().c(y7.INFO, "Closing SentryClient.", new Object[0]);
        if (z10) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = this.f305161b.getShutdownTimeoutMillis();
            } catch (IOException e10) {
                this.f305161b.getLogger().a(y7.WARNING, "Failed to close the connection to the Sentry Server.", e10);
            }
        }
        w(shutdownTimeoutMillis);
        this.f305164e.i(z10);
        this.f305162c.i(z10);
        for (i0 i0Var : this.f305161b.getEventProcessors()) {
            if (i0Var instanceof Closeable) {
                try {
                    ((Closeable) i0Var).close();
                } catch (IOException e11) {
                    this.f305161b.getLogger().c(y7.WARNING, "Failed to close the event processor {}.", i0Var, e11);
                }
            }
        }
        this.f305160a = false;
    }

    @Override // io.sentry.k1
    @Nullable
    public io.sentry.transport.a0 i0() {
        return this.f305162c.i0();
    }

    @Override // io.sentry.k1
    public boolean isEnabled() {
        return this.f305160a;
    }

    @Override // io.sentry.k1
    @NotNull
    public io.sentry.protocol.v l(@NotNull io.sentry.protocol.c0 c0Var, @Nullable da daVar, @Nullable g1 g1Var, @Nullable n0 n0Var, @Nullable k4 k4Var) {
        io.sentry.util.y.c(c0Var, "Transaction is required.");
        if (n0Var == null) {
            n0Var = new n0();
        }
        if (Z(c0Var, n0Var)) {
            u(g1Var, n0Var);
        }
        ILogger logger = this.f305161b.getLogger();
        y7 y7Var = y7.DEBUG;
        logger.c(y7Var, "Capturing transaction: %s", c0Var.I());
        if (io.sentry.util.o0.i(this.f305161b.getIgnoredTransactions(), c0Var.z0())) {
            this.f305161b.getLogger().c(y7Var, "Transaction was dropped as transaction name %s is ignored", c0Var.z0());
            io.sentry.clientreport.h clientReportRecorder = this.f305161b.getClientReportRecorder();
            io.sentry.clientreport.f fVar = io.sentry.clientreport.f.EVENT_PROCESSOR;
            clientReportRecorder.a(fVar, o.Transaction);
            this.f305161b.getClientReportRecorder().b(fVar, o.Span, c0Var.v0().size() + 1);
            return io.sentry.protocol.v.f306474b;
        }
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f306474b;
        io.sentry.protocol.v vVarI = c0Var.I() != null ? c0Var.I() : vVar;
        if (Z(c0Var, n0Var)) {
            c0Var = (io.sentry.protocol.c0) y(c0Var, g1Var);
            if (c0Var != null && g1Var != null) {
                c0Var = V(c0Var, n0Var, g1Var.R());
            }
            if (c0Var == null) {
                this.f305161b.getLogger().c(y7Var, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (c0Var != null) {
            c0Var = V(c0Var, n0Var, this.f305161b.getEventProcessors());
        }
        if (c0Var == null) {
            this.f305161b.getLogger().c(y7Var, "Transaction was dropped by Event processors.", new Object[0]);
            return vVar;
        }
        int size = c0Var.v0().size();
        io.sentry.protocol.c0 c0VarK = K(c0Var, n0Var);
        int size2 = c0VarK == null ? 0 : c0VarK.v0().size();
        if (c0VarK == null) {
            this.f305161b.getLogger().c(y7Var, "Transaction was dropped by beforeSendTransaction.", new Object[0]);
            io.sentry.clientreport.h clientReportRecorder2 = this.f305161b.getClientReportRecorder();
            io.sentry.clientreport.f fVar2 = io.sentry.clientreport.f.BEFORE_SEND;
            clientReportRecorder2.a(fVar2, o.Transaction);
            this.f305161b.getClientReportRecorder().b(fVar2, o.Span, size + 1);
            return vVar;
        }
        if (size2 < size) {
            int i10 = size - size2;
            this.f305161b.getLogger().c(y7Var, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i10));
            this.f305161b.getClientReportRecorder().b(io.sentry.clientreport.f.BEFORE_SEND, o.Span, i10);
        }
        try {
            g6 g6VarC = C(c0VarK, M(O(n0Var)), null, daVar, k4Var);
            n0Var.c();
            return g6VarC != null ? X(g6VarC, n0Var) : vVarI;
        } catch (io.sentry.exception.c | IOException e10) {
            this.f305161b.getLogger().b(y7.WARNING, e10, "Capturing transaction %s failed.", vVarI);
            return io.sentry.protocol.v.f306474b;
        }
    }

    @Override // io.sentry.k1
    @lm.a.c
    public void n(@NotNull k9 k9Var, @Nullable n0 n0Var) {
        io.sentry.util.y.c(k9Var, "Session is required.");
        if (k9Var.l() != null && !k9Var.l().isEmpty()) {
            try {
                s0(g6.c(this.f305161b.getSerializer(), k9Var, this.f305161b.getSdkVersion()), n0Var);
                return;
            } catch (IOException e10) {
                this.f305161b.getLogger().a(y7.ERROR, "Failed to capture session.", e10);
                return;
            }
        }
        int i10 = 4 >> 0;
        this.f305161b.getLogger().c(y7.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
    }

    @Override // io.sentry.k1
    @lm.a.c
    public void o(@NotNull c8 c8Var) {
        try {
            X(D(c8Var), null);
        } catch (IOException e10) {
            this.f305161b.getLogger().b(y7.WARNING, e10, "Capturing log failed.", new Object[0]);
        }
    }

    @Override // io.sentry.k1
    @NotNull
    public io.sentry.protocol.v p(@NotNull h hVar, @Nullable g1 g1Var, @Nullable n0 n0Var) {
        if (n0Var == null) {
            n0Var = new n0();
        }
        if (hVar.d() == null) {
            hVar.j(this.f305161b.getEnvironment());
        }
        if (hVar.g() == null) {
            hVar.m(this.f305161b.getRelease());
        }
        if (Y(hVar, n0Var)) {
            hVar = x(hVar, g1Var);
        }
        if (io.sentry.util.b.a(this.f305161b.getIgnoredCheckIns(), hVar.f())) {
            this.f305161b.getLogger().c(y7.DEBUG, "Check-in was dropped as slug %s is ignored", hVar.f());
            this.f305161b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, o.Monitor);
            return io.sentry.protocol.v.f306474b;
        }
        this.f305161b.getLogger().c(y7.DEBUG, "Capturing check-in: %s", hVar.a());
        io.sentry.protocol.v vVarA = hVar.a();
        try {
            g6 g6VarB = B(hVar, Q(g1Var, n0Var, null));
            n0Var.c();
            return X(g6VarB, n0Var);
        } catch (IOException e10) {
            this.f305161b.getLogger().b(y7.WARNING, e10, "Capturing check-in %s failed.", vVarA);
            return io.sentry.protocol.v.f306474b;
        }
    }

    @Override // io.sentry.k1
    @NotNull
    public io.sentry.protocol.v r(@NotNull o7 o7Var, @Nullable g1 g1Var, @Nullable n0 n0Var) {
        o7 o7Var2;
        c6 c6Var;
        io.sentry.util.y.c(o7Var, "SentryEvent is required.");
        if (n0Var == null) {
            n0Var = new n0();
        }
        if (Z(o7Var, n0Var)) {
            u(g1Var, n0Var);
        }
        ILogger logger = this.f305161b.getLogger();
        y7 y7Var = y7.DEBUG;
        logger.c(y7Var, "Capturing event: %s", o7Var.I());
        Throwable thS = o7Var.S();
        if (thS != null && io.sentry.util.h.b(this.f305161b.getIgnoredExceptionsForType(), thS)) {
            this.f305161b.getLogger().c(y7Var, "Event was dropped as the exception %s is ignored", thS.getClass());
            this.f305161b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, o.Error);
            return io.sentry.protocol.v.f306474b;
        }
        if (io.sentry.util.f.a(this.f305161b.getIgnoredErrors(), o7Var)) {
            this.f305161b.getLogger().c(y7Var, "Event was dropped as it matched a string/pattern in ignoredErrors", o7Var.A0());
            this.f305161b.getClientReportRecorder().a(io.sentry.clientreport.f.EVENT_PROCESSOR, o.Error);
            return io.sentry.protocol.v.f306474b;
        }
        boolean z10 = false;
        if (Z(o7Var, n0Var) && (o7Var = z(o7Var, g1Var, n0Var)) == null) {
            this.f305161b.getLogger().c(y7Var, "Event was dropped by applyScope", new Object[0]);
            return io.sentry.protocol.v.f306474b;
        }
        o7 o7VarR = R(o7Var, n0Var, this.f305161b.getEventProcessors());
        if (o7VarR != null && (o7VarR = G(o7VarR, n0Var)) == null) {
            this.f305161b.getLogger().c(y7Var, "Event was dropped by beforeSend", new Object[0]);
            this.f305161b.getClientReportRecorder().a(io.sentry.clientreport.f.BEFORE_SEND, o.Error);
        }
        if (o7VarR == null) {
            return io.sentry.protocol.v.f306474b;
        }
        k9 k9VarD = g1Var != null ? g1Var.D(new t4.b() { // from class: io.sentry.a6
            @Override // io.sentry.t4.b
            public final void a(k9 k9Var) {
                c6.s(k9Var);
            }
        }) : null;
        k9 k9VarC0 = (k9VarD == null || !k9VarD.t()) ? c0(o7VarR, n0Var, g1Var) : null;
        if (W()) {
            o7Var2 = o7VarR;
        } else {
            this.f305161b.getLogger().c(y7Var, "Event %s was dropped due to sampling decision.", o7VarR.I());
            this.f305161b.getClientReportRecorder().a(io.sentry.clientreport.f.SAMPLE_RATE, o.Error);
            o7Var2 = null;
        }
        boolean zA0 = a0(k9VarD, k9VarC0);
        if (o7Var2 == null && !zA0) {
            this.f305161b.getLogger().c(y7Var, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
            return io.sentry.protocol.v.f306474b;
        }
        io.sentry.protocol.v vVarX = io.sentry.protocol.v.f306474b;
        if (o7Var2 != null && o7Var2.I() != null) {
            vVarX = o7Var2.I();
        }
        boolean zH = io.sentry.util.n.h(n0Var, io.sentry.hints.c.class);
        if (io.sentry.util.n.h(n0Var, io.sentry.hints.e.class) && !io.sentry.util.n.h(n0Var, io.sentry.hints.b.class)) {
            z10 = true;
        }
        if (o7Var2 != null && !zH && !z10 && (o7Var2.I0() || o7Var2.H0())) {
            this.f305161b.getReplayController().l(Boolean.valueOf(o7Var2.H0()));
        }
        try {
            c6Var = this;
            try {
                g6 g6VarC = c6Var.C(o7Var2, o7Var2 != null ? O(n0Var) : null, k9VarC0, Q(g1Var, n0Var, o7Var2), null);
                n0Var.c();
                if (g6VarC != null) {
                    vVarX = c6Var.X(g6VarC, n0Var);
                }
            } catch (io.sentry.exception.c | IOException e10) {
                e = e10;
                c6Var.f305161b.getLogger().b(y7.WARNING, e, "Capturing event %s failed.", vVarX);
                vVarX = io.sentry.protocol.v.f306474b;
            }
        } catch (io.sentry.exception.c | IOException e11) {
            e = e11;
            c6Var = this;
        }
        if (g1Var != null) {
            c6Var.N(g1Var, n0Var);
        }
        return vVarX;
    }

    @Override // io.sentry.k1
    @lm.a.c
    @NotNull
    public io.sentry.protocol.v s0(@NotNull g6 g6Var, @Nullable n0 n0Var) {
        io.sentry.util.y.c(g6Var, "SentryEnvelope is required.");
        if (n0Var == null) {
            n0Var = new n0();
        }
        try {
            n0Var.c();
            return X(g6Var, n0Var);
        } catch (IOException e10) {
            this.f305161b.getLogger().a(y7.ERROR, "Failed to capture envelope.", e10);
            return io.sentry.protocol.v.f306474b;
        }
    }

    @Override // io.sentry.k1
    public void t0(@NotNull na naVar) {
        io.sentry.util.y.c(naVar, "SentryEvent is required.");
        if (io.sentry.protocol.v.f306474b.equals(naVar.c())) {
            this.f305161b.getLogger().c(y7.WARNING, "Capturing userFeedback without a Sentry Id.", new Object[0]);
            return;
        }
        this.f305161b.getLogger().c(y7.DEBUG, "Capturing userFeedback: %s", naVar.c());
        try {
            X(F(naVar), null);
        } catch (IOException e10) {
            this.f305161b.getLogger().b(y7.WARNING, e10, "Capturing user feedback %s failed.", naVar.c());
        }
    }

    @Override // io.sentry.k1
    public void w(long j10) {
        this.f305164e.w(j10);
        this.f305162c.w(j10);
    }
}
