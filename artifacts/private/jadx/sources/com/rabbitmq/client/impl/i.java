package com.rabbitmq.client.impl;

import java.io.EOFException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes13.dex */
public class i extends m1 implements com.rabbitmq.client.p, d1 {

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private static final int f265211w3 = 65535;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public static final double f265213y3 = 1.05d;
    private final com.rabbitmq.client.h1 H1;
    private volatile boolean X;
    private volatile boolean Y;
    private v0 Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f265215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f265216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ExecutorService f265217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Thread f265218g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private final int f265219g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ThreadFactory f265220h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private final int f265221h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f265222i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private final int f265223i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<com.rabbitmq.client.impl.recovery.e0> f265224j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private final int f265225j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p0 f265226k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private final e0 f265227k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f265228l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private final Collection<com.rabbitmq.client.h> f265229l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f265230m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    protected final com.rabbitmq.client.p0 f265231m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.rabbitmq.client.impl.d f265232n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private final int f265233n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected a0 f265234o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private final boolean f265235o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final String f265236p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final Map<String, Object> f265237p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private final int f265238p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private final com.rabbitmq.client.g2 f265239p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private final f0 f265240q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private volatile int f265241r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final t0 f265242s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private volatile int f265243s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile boolean f265244t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private volatile int f265245t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private volatile s f265246u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final com.rabbitmq.client.g0 f265247v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private volatile Map<String, Object> f265248v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final com.rabbitmq.utility.a<Object> f265249w;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private static final org.slf4j.c f265212x3 = org.slf4j.e.k(i.class);

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private static final m2 f265214z3 = new m2(0, 9);
    private static long A3 = 10000;

    class a extends com.rabbitmq.client.impl.d {
        a(i iVar, int i10) {
            super(iVar, i10);
        }

        @Override // com.rabbitmq.client.impl.d
        public boolean o0(com.rabbitmq.client.m mVar) throws IOException {
            return N().E1(mVar);
        }
    }

    class b extends com.rabbitmq.client.impl.d.a<com.rabbitmq.client.impl.e> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.l1 f265251c;

        b(com.rabbitmq.client.l1 l1Var) {
            this.f265251c = l1Var;
        }

        @Override // com.rabbitmq.client.impl.d.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public com.rabbitmq.client.impl.e g(com.rabbitmq.client.impl.e eVar) {
            i.this.y0(this.f265251c);
            return eVar;
        }
    }

    class c implements com.rabbitmq.client.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.g f265253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.rabbitmq.client.i2 f265254b;

        c(com.rabbitmq.client.g gVar, com.rabbitmq.client.i2 i2Var) {
            this.f265253a = gVar;
            this.f265254b = i2Var;
        }

        @Override // com.rabbitmq.client.h
        public void a() throws IOException {
            this.f265254b.a();
        }

        @Override // com.rabbitmq.client.h
        public void b(String str) throws IOException {
            this.f265253a.a(str);
        }
    }

    private class d implements Runnable {
        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (i.this.f265244t) {
                try {
                    i.this.J1(i.this.f265242s.c());
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            return;
                        }
                        i.this.T0(th2);
                        i.this.w0();
                        return;
                    } catch (Throwable th3) {
                        i.this.w0();
                        throw th3;
                    }
                }
            }
            i.this.w0();
        }

        /* synthetic */ d(i iVar, a aVar) {
            this();
        }
    }

    private class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.rabbitmq.client.l1 f265257a;

        public e(com.rabbitmq.client.l1 l1Var) {
            this.f265257a = l1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    i.this.f265249w.b(i.A3);
                    i.this.f265244t = false;
                    i.this.f265232n.f0(this.f265257a);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    i.this.f265244t = false;
                    i.this.f265232n.f0(this.f265257a);
                } catch (TimeoutException unused2) {
                    i.this.f265244t = false;
                    i.this.f265232n.f0(this.f265257a);
                }
            } catch (Throwable th2) {
                i.this.f265244t = false;
                i.this.f265232n.f0(this.f265257a);
                throw th2;
            }
        }
    }

    public i(y yVar, t0 t0Var) {
        this(yVar, t0Var, new com.rabbitmq.client.r0());
    }

    private void B1() {
        com.rabbitmq.client.l1 l1VarG = g();
        Iterator it = com.rabbitmq.utility.e.a(this.f265224j).iterator();
        while (it.hasNext()) {
            ((com.rabbitmq.client.impl.recovery.e0) it.next()).a(l1VarG);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J1(s0 s0Var) throws IOException {
        s sVar;
        if (s0Var == null) {
            e1();
            return;
        }
        this.f265243s3 = 0;
        if (s0Var.f265819a == 8) {
            return;
        }
        if (s0Var.f265820b == 0) {
            this.f265232n.T(s0Var);
        } else {
            if (!isOpen() || (sVar = this.f265246u3) == null) {
                return;
            }
            try {
                sVar.e(s0Var.f265820b).T(s0Var);
            } catch (h2 unused) {
                f265212x3.I("Received a frame on an unknown channel, ignoring it");
            }
        }
    }

    private String M0() {
        if (v1() == null) {
            return null;
        }
        return v1().getHostAddress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T0(Throwable th2) {
        if (!(th2 instanceof EOFException)) {
            this.f265247v.e(this, th2);
            c2(null, false, th2, true);
        } else {
            if (this.X) {
                return;
            }
            c2(null, false, th2, true);
        }
    }

    private static void X() {
        com.rabbitmq.client.impl.e.d();
    }

    private static boolean Y(int i10) {
        return i10 >= 0 && i10 <= 65535;
    }

    private void e1() throws SocketTimeoutException {
        if (this.Y) {
            throw new SocketTimeoutException("Timeout during Connection negotiation");
        }
        if (this.f265245t3 == 0) {
            return;
        }
        int i10 = this.f265243s3 + 1;
        this.f265243s3 = i10;
        if (i10 <= 8) {
            return;
        }
        throw new com.rabbitmq.client.q0("Heartbeat missing with heartbeat = " + this.f265245t3 + " seconds");
    }

    private com.rabbitmq.client.l1 e2(com.rabbitmq.client.o0 o0Var, boolean z10, Throwable th2, boolean z11) {
        com.rabbitmq.client.l1 l1Var = new com.rabbitmq.client.l1(true, z10, o0Var, this);
        l1Var.initCause(th2);
        if (!d(l1Var) && z10) {
            throw new com.rabbitmq.client.d(g(), th2);
        }
        this.Z.e();
        this.f265232n.r0(l1Var, !z10, z11);
        return l1Var;
    }

    private void g0() {
        if (p1() && w1() && this.f265218g.isAlive()) {
            this.f265218g.interrupt();
        }
    }

    private void h1() {
        this.f265234o = new a0(this.f265215d, this.f265220h, this.f265228l, this.f265225j3);
    }

    private void j1() {
        this.Z = new v0(this.f265242s, this.f265216e, this.f265220h);
    }

    public static /* synthetic */ void o(com.rabbitmq.client.p pVar, IOException iOException) throws IOException {
        throw iOException;
    }

    public static Map<String, Object> o0() {
        HashMap map = new HashMap();
        map.put("product", x0.a("RabbitMQ"));
        map.put("version", x0.a(v.f265862c));
        map.put("platform", x0.a("Java"));
        map.put("copyright", x0.a("Copyright (c) 2007-2020 VMware, Inc. or its affiliates."));
        map.put("information", x0.a("Licensed under the MPL. See https://www.rabbitmq.com/"));
        HashMap map2 = new HashMap();
        Boolean bool = Boolean.TRUE;
        map2.put("publisher_confirms", bool);
        map2.put("exchange_exchange_bindings", bool);
        map2.put("basic.nack", bool);
        map2.put("consumer_cancel_notify", bool);
        map2.put("connection.blocked", bool);
        map2.put("authentication_failure_close", bool);
        map.put("capabilities", map2);
        return map;
    }

    private boolean p1() {
        return this.f265218g != null;
    }

    public static /* synthetic */ Boolean q(i iVar) throws IOException {
        if (!iVar.isOpen()) {
            return Boolean.FALSE;
        }
        if (iVar.Y) {
            return Boolean.TRUE;
        }
        try {
            iVar.f265232n.G5(new i2.a(x0.a(iVar.f265227k3.b()), "Refresh scheduled by client"));
            return Boolean.TRUE;
        } catch (com.rabbitmq.client.l1 e10) {
            f265212x3.w("Error while trying to update secret: {}. Connection has been closed.", e10.getMessage());
            return Boolean.FALSE;
        }
    }

    private static int u1(int i10, int i11) {
        return (i10 == 0 || i11 == 0) ? Math.max(i10, i11) : Math.min(i10, i11);
    }

    private boolean w1() {
        return Thread.currentThread() != this.f265218g;
    }

    private void x0() throws com.rabbitmq.client.d {
        if (!isOpen()) {
            throw new com.rabbitmq.client.d(g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0(com.rabbitmq.client.l1 l1Var) {
        s sVar = this.f265246u3;
        if (sVar != null) {
            sVar.h(l1Var);
        }
    }

    @Override // com.rabbitmq.client.p
    public com.rabbitmq.client.k Ae(int i10) throws IOException {
        x0();
        s sVar = this.f265246u3;
        if (sVar == null) {
            return null;
        }
        u uVarD = sVar.d(this, i10);
        this.f265231m3.g(uVarD);
        return uVarD;
    }

    public int B0() {
        return this.f265233n3;
    }

    public boolean E1(com.rabbitmq.client.m mVar) throws IOException {
        com.rabbitmq.client.o0 method = mVar.getMethod();
        int i10 = 0 << 1;
        if (!isOpen()) {
            if (method instanceof com.rabbitmq.client.a.f.b) {
                try {
                    this.f265232n.y0(new com.rabbitmq.client.a.f.c.C1792a().a());
                } catch (IOException unused) {
                }
                return true;
            }
            if (!(method instanceof com.rabbitmq.client.a.f.c)) {
                return true;
            }
            this.f265244t = false;
            return !this.f265232n.X();
        }
        if (method instanceof com.rabbitmq.client.a.f.b) {
            R0(mVar);
            return true;
        }
        if (method instanceof com.rabbitmq.client.a.f.InterfaceC1789a) {
            com.rabbitmq.client.a.f.InterfaceC1789a interfaceC1789a = (com.rabbitmq.client.a.f.InterfaceC1789a) method;
            try {
                Iterator<com.rabbitmq.client.h> it = this.f265229l3.iterator();
                while (it.hasNext()) {
                    it.next().b(interfaceC1789a.u0());
                }
            } catch (Throwable th2) {
                getExceptionHandler().d(this, th2);
            }
            return true;
        }
        if (!(method instanceof com.rabbitmq.client.a.f.l)) {
            return false;
        }
        try {
            Iterator<com.rabbitmq.client.h> it2 = this.f265229l3.iterator();
            while (it2.hasNext()) {
                it2.next().a();
            }
        } catch (Throwable th3) {
            getExceptionHandler().d(this, th3);
        }
        return true;
    }

    @Override // com.rabbitmq.client.p
    public com.rabbitmq.client.h E7(com.rabbitmq.client.g gVar, com.rabbitmq.client.i2 i2Var) {
        c cVar = new c(gVar, i2Var);
        Te(cVar);
        return cVar;
    }

    public t0 H0() {
        return this.f265242s;
    }

    @Override // com.rabbitmq.client.p
    public void Kb(String str) {
        this.f265222i = str;
    }

    @Override // com.rabbitmq.client.p
    public boolean M9(com.rabbitmq.client.h hVar) {
        return this.f265229l3.remove(hVar);
    }

    @Override // com.rabbitmq.client.p
    public int O() {
        return this.f265241r3;
    }

    public ThreadFactory O0() {
        return this.f265220h;
    }

    public void O1(com.rabbitmq.client.impl.recovery.e0 e0Var) {
        this.f265224j.remove(e0Var);
    }

    public com.rabbitmq.client.g2 Q0() {
        return this.f265239p3;
    }

    public void R0(com.rabbitmq.client.m mVar) {
        com.rabbitmq.client.l1 l1VarC2 = c2(mVar.getMethod(), false, null, this.Y);
        try {
            this.f265232n.y0(new com.rabbitmq.client.a.f.c.C1792a().a());
        } catch (IOException unused) {
        }
        this.X = true;
        e eVar = new e(l1VarC2);
        ExecutorService executorService = this.f265217f;
        if (executorService != null) {
            executorService.execute(eVar);
            return;
        }
        o0.b(this.f265220h, eVar, "RabbitMQ connection shutdown monitor " + M0() + ":" + getPort()).start();
    }

    @Override // com.rabbitmq.client.p
    public Map<String, Object> S0() {
        return this.f265248v3;
    }

    public void T(com.rabbitmq.client.impl.recovery.e0 e0Var) {
        this.f265224j.add(e0Var);
    }

    public void T1(int i10) {
        try {
            this.Z.d(i10);
            this.f265245t3 = i10;
            this.f265242s.a((i10 * 1000) / 4);
        } catch (SocketException unused) {
        }
    }

    @Override // com.rabbitmq.client.p
    public void Te(com.rabbitmq.client.h hVar) {
        this.f265229l3.add(hVar);
    }

    @Override // com.rabbitmq.client.p
    public int U() {
        s sVar = this.f265246u3;
        if (sVar == null) {
            return 0;
        }
        return sVar.f();
    }

    public void U0() {
        com.rabbitmq.client.q0 q0Var = new com.rabbitmq.client.q0("Heartbeat missing with heartbeat = " + this.f265245t3 + " seconds");
        try {
            this.f265247v.e(this, q0Var);
            c2(null, false, q0Var, true);
        } finally {
            w0();
        }
    }

    @Override // com.rabbitmq.client.p
    public void Ud(int i10, String str, int i11) throws IOException {
        f0(i10, str, true, null, i11, false);
    }

    @Override // com.rabbitmq.client.p
    public Map<String, Object> X0() {
        return new HashMap(this.f265237p1);
    }

    @Override // com.rabbitmq.client.p
    public void abort() {
        de(-1);
    }

    public void b(s0 s0Var) throws IOException {
        this.f265242s.b(s0Var);
        this.Z.f();
    }

    public void b1(Throwable th2) {
        try {
            T0(th2);
            w0();
        } catch (Throwable th3) {
            w0();
            throw th3;
        }
    }

    public void b2(ThreadFactory threadFactory) {
        this.f265220h = threadFactory;
    }

    public com.rabbitmq.client.l1 c2(com.rabbitmq.client.o0 o0Var, boolean z10, Throwable th2, boolean z11) {
        com.rabbitmq.client.l1 l1VarE2 = e2(o0Var, z10, th2, z11);
        y0(l1VarE2);
        return l1VarE2;
    }

    @Override // com.rabbitmq.client.p, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        x1(-1);
    }

    public void d0(int i10, String str, boolean z10, Throwable th2) throws IOException {
        f0(i10, str, z10, th2, -1, false);
    }

    public boolean d1(s0 s0Var) {
        if (!this.f265244t) {
            return false;
        }
        try {
            J1(s0Var);
            return true;
        } catch (q2 e10) {
            throw e10;
        } catch (Throwable th2) {
            try {
                T0(th2);
                return false;
            } finally {
                w0();
            }
        }
    }

    public void d2() {
        Thread threadB = o0.b(this.f265220h, new d(this, null), "AMQP Connection " + M0() + ":" + getPort());
        this.f265218g = threadB;
        threadB.start();
    }

    @Override // com.rabbitmq.client.p
    public void de(int i10) {
        l5(200, "OK", i10);
    }

    @Override // com.rabbitmq.client.p
    public String ee() {
        return (String) this.f265237p1.get("connection_name");
    }

    public void f0(int i10, String str, boolean z10, Throwable th2, int i11, boolean z11) throws IOException {
        boolean z12 = Thread.currentThread() != this.f265218g;
        try {
            try {
                try {
                    com.rabbitmq.client.a.f.b bVarA = new com.rabbitmq.client.a.f.b.C1791a().d(i10).e(str).a();
                    com.rabbitmq.client.l1 l1VarE2 = e2(bVarA, z10, th2, true);
                    if (z12) {
                        b bVar = new b(l1VarE2);
                        this.f265232n.x0(bVarA, bVar);
                        bVar.e(i11);
                    } else {
                        this.f265232n.y0(bVarA);
                    }
                    if (z12) {
                        this.f265242s.close();
                    }
                } catch (IOException e10) {
                    if (!z11) {
                        throw e10;
                    }
                    if (!z12) {
                        return;
                    }
                    this.f265242s.close();
                }
            } catch (com.rabbitmq.client.l1 e11) {
                if (!z11) {
                    throw e11;
                }
                if (z12) {
                    this.f265242s.close();
                }
            } catch (TimeoutException unused) {
                if (!z11) {
                    com.rabbitmq.client.l1 l1Var = new com.rabbitmq.client.l1(true, true, null, this);
                    l1Var.initCause(th2);
                    throw l1Var;
                }
                if (z12) {
                    this.f265242s.close();
                }
            }
        } catch (Throwable th3) {
            if (z12) {
                this.f265242s.close();
            }
            throw th3;
        }
    }

    public boolean f2() {
        return this.f265235o3;
    }

    public void flush() throws IOException {
        try {
            this.f265242s.flush();
        } catch (IOException e10) {
            this.f265226k.a(this, e10);
        }
    }

    public boolean g1() {
        return this.X;
    }

    @Override // com.rabbitmq.client.p
    public com.rabbitmq.client.g0 getExceptionHandler() {
        return this.f265247v;
    }

    @Override // com.rabbitmq.client.p
    public String getId() {
        return this.f265222i;
    }

    @Override // com.rabbitmq.client.impl.d1
    public InetAddress getLocalAddress() {
        return this.f265242s.getLocalAddress();
    }

    @Override // com.rabbitmq.client.impl.d1
    public int getLocalPort() {
        return this.f265242s.getLocalPort();
    }

    @Override // com.rabbitmq.client.p, com.rabbitmq.client.impl.d1
    public int getPort() {
        return this.f265242s.getPort();
    }

    protected void j0(s sVar) {
        sVar.m(this.f265217f);
        sVar.l((int) (((double) this.f265238p2) * 1.05d * 1000.0d));
    }

    @Override // com.rabbitmq.client.p
    public com.rabbitmq.client.k jd() throws IOException {
        x0();
        s sVar = this.f265246u3;
        if (sVar == null) {
            return null;
        }
        u uVarC = sVar.c(this);
        this.f265231m3.g(uVarC);
        return uVarC;
    }

    com.rabbitmq.client.impl.d k0() {
        return new a(this, 0);
    }

    protected s l1(int i10, ThreadFactory threadFactory) {
        s sVar = new s(this.f265234o, i10, threadFactory, this.f265231m3);
        j0(sVar);
        return sVar;
    }

    @Override // com.rabbitmq.client.p
    public void l5(int i10, String str, int i11) {
        try {
            f0(i10, str, true, null, i11, true);
        } catch (IOException unused) {
        }
    }

    @Override // com.rabbitmq.client.p
    public int m0() {
        return this.f265245t3;
    }

    public boolean n2() {
        return this.f265234o.i();
    }

    @Override // com.rabbitmq.client.p
    public void nd() {
        this.f265229l3.clear();
    }

    public boolean o1() {
        return this.f265244t;
    }

    public final void r0(u uVar) {
        s sVar = this.f265246u3;
        if (sVar != null) {
            sVar.j(uVar);
        }
    }

    @Override // com.rabbitmq.client.p
    public void r1(int i10, String str) {
        l5(i10, str, -1);
    }

    protected int s1(int i10, int i11) {
        return u1(i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x015b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01ff, code lost:
    
        r11.Z.e();
        r11.f265242s.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x020f, code lost:
    
        throw com.rabbitmq.client.impl.d.T0(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0210, code lost:
    
        r11.Z.e();
        r11.f265242s.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x021b, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void start() throws java.util.concurrent.TimeoutException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rabbitmq.client.impl.i.start():void");
    }

    public String toString() {
        String str;
        if ("/".equals(this.f265236p0)) {
            str = this.f265236p0;
        } else {
            str = "/" + this.f265236p0;
        }
        return "amqp://" + this.f265227k3.d() + "@" + M0() + ":" + getPort() + str;
    }

    @Override // com.rabbitmq.client.p, com.rabbitmq.client.impl.d1
    public InetAddress v1() {
        return this.f265242s.v1();
    }

    public void w0() {
        if (this.f265230m.compareAndSet(false, true)) {
            this.f265242s.close();
            this.f265249w.c(null);
            g0();
            l();
            B1();
        }
    }

    @Override // com.rabbitmq.client.p
    public void x1(int i10) throws IOException {
        Ud(200, "OK", i10);
    }

    public i(y yVar, t0 t0Var, com.rabbitmq.client.p0 p0Var) {
        this.f265220h = Executors.defaultThreadFactory();
        this.f265224j = Collections.synchronizedList(new ArrayList());
        this.f265230m = new AtomicBoolean(false);
        boolean z10 = false | false;
        this.f265234o = null;
        this.f265244t = false;
        this.f265249w = new com.rabbitmq.utility.a<>();
        this.f265229l3 = new CopyOnWriteArrayList();
        this.f265241r3 = 0;
        this.f265243s3 = 0;
        this.f265245t3 = 0;
        X();
        this.f265227k3 = yVar.f();
        this.f265242s = t0Var;
        this.f265236p0 = yVar.y();
        this.f265247v = yVar.i();
        this.f265237p1 = new HashMap(yVar.c());
        this.f265221h3 = yVar.o();
        this.f265219g3 = yVar.n();
        this.f265238p2 = yVar.p();
        this.f265223i3 = yVar.j();
        this.f265225j3 = yVar.s();
        this.H1 = yVar.q();
        this.f265215d = yVar.e();
        this.f265216e = yVar.k();
        this.f265217f = yVar.r();
        this.f265220h = yVar.t();
        if (yVar.b() < 0) {
            throw new IllegalArgumentException("Continuation timeout on RPC calls cannot be less than 0");
        }
        this.f265233n3 = yVar.b();
        this.f265235o3 = yVar.a();
        this.f265239p3 = yVar.x() == null ? com.rabbitmq.client.g2.f265096a : yVar.x();
        this.f265240q3 = yVar.g();
        this.f265232n = k0();
        this.f265246u3 = null;
        this.X = false;
        int i10 = 5 | 1;
        this.Y = true;
        this.f265231m3 = p0Var;
        this.f265226k = yVar.h() != null ? yVar.h() : new p0() { // from class: com.rabbitmq.client.impl.f
            @Override // com.rabbitmq.client.impl.p0
            public final void a(com.rabbitmq.client.p pVar, IOException iOException) throws IOException {
                i.o(pVar, iOException);
            }
        };
        this.f265228l = yVar.z();
    }

    @Override // com.rabbitmq.client.p
    public void close(int i10, String str) throws IOException {
        Ud(i10, str, -1);
    }
}
